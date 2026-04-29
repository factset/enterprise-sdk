# fds.sdk.FactSetFunds.ScoringApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_scoring_details**](ScoringApi.md#get_scoring_details) | **GET** /scoring | Get Scoring Details for ETFs
[**get_scoring_for_list**](ScoringApi.md#get_scoring_for_list) | **POST** /scoring | Get Scoring Details for ETFs



# **get_scoring_details**
> ScoringResponse get_scoring_details(ids)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import scoring_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = scoring_api.ScoringApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    frequency = Frequency("M") # Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)
    pagination_limit = 100 # int | The maximum number of records to return. The default is 20. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | The number of records to skip before the first record to return. The default is 0. (optional) if omitted the server will use the default value of 0

    try:
        # Get Scoring Details for ETFs
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_scoring_details(ids, start_date=start_date, end_date=end_date, frequency=frequency, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScoringApi->get_scoring_details: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional]
 **pagination_limit** | **int**| The maximum number of records to return. The default is 20. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| The number of records to skip before the first record to return. The default is 0. | [optional] if omitted the server will use the default value of 0

### Return type

[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Scoring response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_scoring_for_list**
> ScoringResponse get_scoring_for_list(scoring_request)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import scoring_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = scoring_api.ScoringApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    scoring_request = ScoringRequest(
        data=ScoringRequestData(
            ids=Ids(["MABAX","SPY"]),
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            frequency=Frequency("M"),
        ),
        meta=MetaRequest(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # ScoringRequest | The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency.

    try:
        # Get Scoring Details for ETFs
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_scoring_for_list(scoring_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling ScoringApi->get_scoring_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scoring_request** | [**ScoringRequest**](ScoringRequest.md)| The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency. |

### Return type

[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Scoring response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

