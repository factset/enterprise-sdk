# fds.sdk.FactSetConcordance.EntityMatchBulkApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_decisions**](EntityMatchBulkApi.md#get_entity_decisions) | **GET** /factset-concordance/v2/entity-decisions | Get the decisions of matches for the requested taskId.
[**get_entity_task_for_list**](EntityMatchBulkApi.md#get_entity_task_for_list) | **POST** /factset-concordance/v2/entity-task | Input a file with names and attributes, creating a taskId.
[**get_entity_task_status**](EntityMatchBulkApi.md#get_entity_task_status) | **GET** /factset-concordance/v2/entity-task-status | Gets the status of the requested taskId or all tasks for a User



# **get_entity_decisions**
> EntityDecisionsResponse get_entity_decisions(task_id)

Get the decisions of matches for the requested taskId.

Retrieves the `Decision` objects for an Entity Task (taskId). The decisions do not include all candidates, but rather the results of concording the requested list of names included in the input file. Mapped entities will include a FactSet Entity Identifier (-E). Results will be saved to the `universeId` specified in the input file. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import entity_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_match___bulk_api.EntityMatchBulkApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    task_id = 31589 # int | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint.
    offset = 0 # int | Starting row for records to return or rows to skip. (optional) if omitted the server will use the default value of 0
    limit = 10 # int | Limits the number of records in the response. (optional)

    try:
        # Get the decisions of matches for the requested taskId.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_entity_decisions(task_id, offset=offset, limit=limit)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling EntityMatchBulkApi->get_entity_decisions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **int**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. |
 **offset** | **int**| Starting row for records to return or rows to skip. | [optional] if omitted the server will use the default value of 0
 **limit** | **int**| Limits the number of records in the response. | [optional]

### Return type

[**EntityDecisionsResponse**](EntityDecisionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for Entity Decisions endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_entity_task_for_list**
> EntityTaskResponse get_entity_task_for_list(universe_id, task_name, input_file, client_id_column, name_column)

Input a file with names and attributes, creating a taskId.

Upload a Comma-Separated List file (.csv / UTF-8 encoding) with a list of names and attributes and receive a `taskId`. The taskId is then used for reference in the */entity-task-status* and */entity-decisions* endpoints to receive results once the task is successful.<p>This is the first step in the overall \"Bulk\" workflow. Use the /entity-task-status endpoint to check the status.</p> <p> A universeId must be included in request. If you do not have a universe created, reference the `/universe` endpoint. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import entity_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_match___bulk_api.EntityMatchBulkApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    universe_id = 1 # int | The id of the universe that entities should be mapped to. Reference the `/universe` endpoint to create a universe, or view available universes via `/universes`.
    task_name = "test31" # str | User defined name for the task that will be used to name the output files.
    input_file = open('/path/to/file', 'rb') # file_type | The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data. 
    client_id_column = "ClientId" # str | Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\"clientId\\\". This clientId can be used to create custom mappings or references. 
    name_column = "NAME" # str | Header name of the column in the input file that contains the Entity Name to be matched. 
    country_column = "COUNTRY" # str | Header Name of the column in the input file that contains the country's ISO Code. This is used to filter the candidates before taking a match decision.  (optional)
    url_column = "URL" # str | Header Name of the column in the input file that contains the Entity's URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  (optional)
    state_column = "STATE" # str | Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  (optional)
    priority_column = "Priority" # str | Header Name of the column in the inputfile that contains the priority for the client id.  (optional)
    bbg_figi_column = "BloombergId" # str | Header Name of the column in the input file for the type `Bloomberg Listing/Regional/Security ID`. (optional)
    bbg_ticker_column = "BloombergTicker" # str | Header Name of the column in the input file for the type Bloomberg `Listing and Regional Ticker`. (optional)
    bic_column = "BICCode" # str | Header Name of the column in the input file for the type BICCode, `bank indentification code`.  (optional)
    cik_column = "CIK" # str | Header Name of the column in the input file for the type CIK, `Edgar Central Index Keys` (optional)
    crd_column = "CRD" # str | Header Name of the column in the input file for the type CRD, `Central Registration Depository`. (optional)
    cusip_column = "CUSIP" # str | Header Name of the column in the input file for the type `CUSIP` (optional)
    duns_column = "Dun&Bradstreet" # str | Header Name of the column in the input file for the type DUNS, `Dun&Bradstreet`. (optional)
    ein_column = "EmployerIdentificationNumber" # str | Header Name of the column in the input file for the type EIN, `EmployerIdentificationNumber`. (optional)
    factset_id_column = "FactSetIdentifier" # str | Header Name of the column in the input file for the type FactSet Identifier - `FactSet -E,-S,-R, -L Permanent Identifier`. (optional)
    fitch_column = "FitchCreditRating" # str | Header Name of the column in the input file for the type FitchCreditRating, `Fitch Ratings Identifier`. (optional)
    gvkey_column = "GVKey" # str | Header Name of the column in the input file for the type GVKEY - `Compustat Global Company Key`. (optional)
    gvkey_iid_column = "GVKeyIssueIdentifier" # str | Header Name of the column in the input file for the type GVKEY+IID - `Compustat Global Company Key and Issue Identifier`. (optional)
    isin_column = "ISIN" # str | Header Name of the column in the input file for the type `ISIN`. (optional)
    jcn_column = "JCN" # str | Header Name of the column in the input file for the type JCN - `Japanese Corporate Number`. (optional)
    lei_column = "LegalEntityIdentifier" # str | Header Name of the column in the input file for the type LEI, `LegalEntityIdentifier`. (optional)
    lxid_column = "LXID" # str | Header Name of the column in the input file for the type LXID - `Markit Syndicated Loan Identifier`. (optional)
    md_column = "MoodysIssuer" # str | Header Name of the column in the input file for the type MoodysIssuer, `Moody's Ratings Identifier`. (optional)
    red_code_column = "RedCode" # str | Header Name of the column in the input file for the type Red Code - `Markit Reference Entity Identifier`. (optional)
    rssd_column = "FederalReserveRSSDIdentifier" # str | Header Name of the column in the input file for the type RSSD, `FederalReserveRSSDIdentifier`. (optional)
    sedol_column = "SEDOL" # str | Header Name of the column in the input file for the type `SEDOL`. (optional)
    spr_column = "SPRating" # str | Header Name of the column in the input file for the type S&PRating, `S&P Ratings Identifier`. (optional)
    ticker_column = "PriceTicker" # str | Header Name of the column in the input file for the type `PriceTicker`. (optional)
    ticker_exchange_column = "TickerExch" # str | Header Name of the column in the input file for the type `TickerExchange`. (optional)
    ticker_region_column = "TickerRegion" # str | Header Name of the column in the input file for the type `TickerRegion`. (optional)
    ukch_column = "UKCompanyHouse" # str | Header Name of the column in the input file for the type `UKCompanyHouse`. (optional)
    valoren_column = "VALOR" # str | Header Name of the column in the input file for the type VALOR, `Valoren (\\\"Valor\\\") Identification`. (optional)
    wkn_column = "WKN" # str | Header Name of the column in the input file for the type WKN, `German Securities Identification`. (optional)
    include_entity_type = [
        "PUB",
    ] # [str] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional)
    exclude_entity_type = [
        "EXT",
    ] # [str] | Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within `inputFile`.**  (optional)
    include_entity_sub_type = [
        "PR",
    ] # [str] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional)
    exclude_entity_sub_type = [
        "IB",
    ] # [str] | Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within `inputFile`.**  (optional)
    additional_context_columns = [
        "Address",
    ] # [str] | Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  (optional)

    try:
        # Input a file with names and attributes, creating a taskId.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_entity_task_for_list(universe_id, task_name, input_file, client_id_column, name_column, country_column=country_column, url_column=url_column, state_column=state_column, priority_column=priority_column, bbg_figi_column=bbg_figi_column, bbg_ticker_column=bbg_ticker_column, bic_column=bic_column, cik_column=cik_column, crd_column=crd_column, cusip_column=cusip_column, duns_column=duns_column, ein_column=ein_column, factset_id_column=factset_id_column, fitch_column=fitch_column, gvkey_column=gvkey_column, gvkey_iid_column=gvkey_iid_column, isin_column=isin_column, jcn_column=jcn_column, lei_column=lei_column, lxid_column=lxid_column, md_column=md_column, red_code_column=red_code_column, rssd_column=rssd_column, sedol_column=sedol_column, spr_column=spr_column, ticker_column=ticker_column, ticker_exchange_column=ticker_exchange_column, ticker_region_column=ticker_region_column, ukch_column=ukch_column, valoren_column=valoren_column, wkn_column=wkn_column, include_entity_type=include_entity_type, exclude_entity_type=exclude_entity_type, include_entity_sub_type=include_entity_sub_type, exclude_entity_sub_type=exclude_entity_sub_type, additional_context_columns=additional_context_columns)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling EntityMatchBulkApi->get_entity_task_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **universe_id** | **int**| The id of the universe that entities should be mapped to. Reference the &#x60;/universe&#x60; endpoint to create a universe, or view available universes via &#x60;/universes&#x60;. |
 **task_name** | **str**| User defined name for the task that will be used to name the output files. |
 **input_file** | **file_type**| The UTF-8 encoded CSV File containing the entity names to be concorded to a FactSet Entity Identifier. The files first row **MUST** include headers as defined in the *Column parameters. Be mindful of casing and spacing in column headers. The input file is posted as a file object in the form. For this reason, the mime type of this post request must be multipart/form-data.  |
 **client_id_column** | **str**| Header Name of the column in the input file that contains a unique identifier supplied by the user referred to as a \\\&quot;clientId\\\&quot;. This clientId can be used to create custom mappings or references.  |
 **name_column** | **str**| Header name of the column in the input file that contains the Entity Name to be matched.  |
 **country_column** | **str**| Header Name of the column in the input file that contains the country&#39;s ISO Code. This is used to filter the candidates before taking a match decision.  | [optional]
 **url_column** | **str**| Header Name of the column in the input file that contains the Entity&#39;s URL. URL corresponding to the entity name that is used when evaluating candidates for a match.  | [optional]
 **state_column** | **str**| Header Name of the column in the input file that contains the two letter State Code of the state or province where the Entity is located. Currently, only US state codes are supported.  | [optional]
 **priority_column** | **str**| Header Name of the column in the inputfile that contains the priority for the client id.  | [optional]
 **bbg_figi_column** | **str**| Header Name of the column in the input file for the type &#x60;Bloomberg Listing/Regional/Security ID&#x60;. | [optional]
 **bbg_ticker_column** | **str**| Header Name of the column in the input file for the type Bloomberg &#x60;Listing and Regional Ticker&#x60;. | [optional]
 **bic_column** | **str**| Header Name of the column in the input file for the type BICCode, &#x60;bank indentification code&#x60;.  | [optional]
 **cik_column** | **str**| Header Name of the column in the input file for the type CIK, &#x60;Edgar Central Index Keys&#x60; | [optional]
 **crd_column** | **str**| Header Name of the column in the input file for the type CRD, &#x60;Central Registration Depository&#x60;. | [optional]
 **cusip_column** | **str**| Header Name of the column in the input file for the type &#x60;CUSIP&#x60; | [optional]
 **duns_column** | **str**| Header Name of the column in the input file for the type DUNS, &#x60;Dun&amp;Bradstreet&#x60;. | [optional]
 **ein_column** | **str**| Header Name of the column in the input file for the type EIN, &#x60;EmployerIdentificationNumber&#x60;. | [optional]
 **factset_id_column** | **str**| Header Name of the column in the input file for the type FactSet Identifier - &#x60;FactSet -E,-S,-R, -L Permanent Identifier&#x60;. | [optional]
 **fitch_column** | **str**| Header Name of the column in the input file for the type FitchCreditRating, &#x60;Fitch Ratings Identifier&#x60;. | [optional]
 **gvkey_column** | **str**| Header Name of the column in the input file for the type GVKEY - &#x60;Compustat Global Company Key&#x60;. | [optional]
 **gvkey_iid_column** | **str**| Header Name of the column in the input file for the type GVKEY+IID - &#x60;Compustat Global Company Key and Issue Identifier&#x60;. | [optional]
 **isin_column** | **str**| Header Name of the column in the input file for the type &#x60;ISIN&#x60;. | [optional]
 **jcn_column** | **str**| Header Name of the column in the input file for the type JCN - &#x60;Japanese Corporate Number&#x60;. | [optional]
 **lei_column** | **str**| Header Name of the column in the input file for the type LEI, &#x60;LegalEntityIdentifier&#x60;. | [optional]
 **lxid_column** | **str**| Header Name of the column in the input file for the type LXID - &#x60;Markit Syndicated Loan Identifier&#x60;. | [optional]
 **md_column** | **str**| Header Name of the column in the input file for the type MoodysIssuer, &#x60;Moody&#39;s Ratings Identifier&#x60;. | [optional]
 **red_code_column** | **str**| Header Name of the column in the input file for the type Red Code - &#x60;Markit Reference Entity Identifier&#x60;. | [optional]
 **rssd_column** | **str**| Header Name of the column in the input file for the type RSSD, &#x60;FederalReserveRSSDIdentifier&#x60;. | [optional]
 **sedol_column** | **str**| Header Name of the column in the input file for the type &#x60;SEDOL&#x60;. | [optional]
 **spr_column** | **str**| Header Name of the column in the input file for the type S&amp;PRating, &#x60;S&amp;P Ratings Identifier&#x60;. | [optional]
 **ticker_column** | **str**| Header Name of the column in the input file for the type &#x60;PriceTicker&#x60;. | [optional]
 **ticker_exchange_column** | **str**| Header Name of the column in the input file for the type &#x60;TickerExchange&#x60;. | [optional]
 **ticker_region_column** | **str**| Header Name of the column in the input file for the type &#x60;TickerRegion&#x60;. | [optional]
 **ukch_column** | **str**| Header Name of the column in the input file for the type &#x60;UKCompanyHouse&#x60;. | [optional]
 **valoren_column** | **str**| Header Name of the column in the input file for the type VALOR, &#x60;Valoren (\\\&quot;Valor\\\&quot;) Identification&#x60;. | [optional]
 **wkn_column** | **str**| Header Name of the column in the input file for the type WKN, &#x60;German Securities Identification&#x60;. | [optional]
 **include_entity_type** | **[str]**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Only candidates with an entity type specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **exclude_entity_type** | **[str]**| Three-character FactSet entity type code used to filter candidates in order to determine the final match result. Entities with these types will be excluded from the decisions. It is a global option used to filter the candidates before taking a match decision. Candidates with an entity type specified will *not* be considered for the final match result. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **include_entity_sub_type** | **[str]**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Only candidates with an entity subtype specified will be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **exclude_entity_sub_type** | **[str]**| Two-character FactSet entity subtype code used to filter candidates in order to determine the final match result. Candidates with an entity subtype specified will *not* be considered for the final match result. Multiple types can be entered separated by commas. **Do not include within &#x60;inputFile&#x60;.**  | [optional]
 **additional_context_columns** | **[str]**| Comma separated list of any additional column names in the input file.  To be used by Managed Service for any unmapped records.  | [optional]

### Return type

[**EntityTaskResponse**](EntityTaskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK. The Entity Task creation is submitted. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_entity_task_status**
> EntityTaskStatusResponse get_entity_task_status()

Gets the status of the requested taskId or all tasks for a User

Pulls the **status** for ALL the Entity Tasks submitted by a client within the last 30 days, and related details such as task duration and decision rates. Specific Tasks can also be retrieved by using the _taskId_ parameter.<p>Status types include -   * PENDING - The task has not yet started.   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import entity_match___bulk_api
from fds.sdk.FactSetConcordance.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_match___bulk_api.EntityMatchBulkApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    task_id = 31589 # int | Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. (optional)
    offset = 0 # int | Starting row for records to return or rows to skip. (optional) if omitted the server will use the default value of 0
    limit = 10 # int | Limits the number of records in the response. (optional)
    status = [
        "PENDING",
    ] # [str] | Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  (optional)

    try:
        # Gets the status of the requested taskId or all tasks for a User
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_entity_task_status(task_id=task_id, offset=offset, limit=limit, status=status)

        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling EntityMatchBulkApi->get_entity_task_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **task_id** | **int**| Name of the column for the type Concordance Task Identifier. The taskId is created in response from the /entity-task endpoint. | [optional]
 **offset** | **int**| Starting row for records to return or rows to skip. | [optional] if omitted the server will use the default value of 0
 **limit** | **int**| Limits the number of records in the response. | [optional]
 **status** | **[str]**| Filter on the status of the Concordance Tasks. Default is no filter.   * PENDING - The task has not yet started   * IN_PROGRESS - The task is submitted and decisions are in progress.   * SUCCESS - The task was successful! Move to the /entity-decisions endpoint to retrieve decisions.   * FAILURE - The task failed. Reach out to FactSet Support for assistance.   * BAD_REQUEST - The task creation was unsuccesfull. Typically occurs with an incorrect input file format or column headers.   * ABORTED - The task was aborted.  | [optional]

### Return type

[**EntityTaskStatusResponse**](EntityTaskStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response object for Task Status endpoint. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

