# fds.sdk.Formula.CrossSectionalApi

All URIs are relative to *https://api.factset.com/formula-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_cross_sectional_data**](CrossSectionalApi.md#get_cross_sectional_data) | **GET** /v1/cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
[**get_cross_sectional_data_for_list**](CrossSectionalApi.md#get_cross_sectional_data_for_list) | **POST** /v1/cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.


# **get_cross_sectional_data**
> CrossSectionalResponse get_cross_sectional_data(formulas)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The `/cross-sectional` endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The `/cross-sectional` endpoint supports Long Running asynchronous requests up to **10 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import cross_sectional_api
from fds.sdk.Formula.model.cross_sectional_response import CrossSectionalResponse
from fds.sdk.Formula.model.error_detail import ErrorDetail
from fds.sdk.Formula.model.batch_status_response import BatchStatusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cross_sectional_api.CrossSectionalApi(api_client)

    formulas = ["P_PRICE(0)"] # [str] | List of Screening formulas
    ids = ["IBM"] # [str] | List of entity identifiers.  The `ids` and `universe` parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the `ids` or `universe` parameter.  (optional)
    universe = "" # str | Screening expression to limit the universe  Please enter either the `ids` or `universe` parameter.  (optional)
    universe_type = "EQUITY" # str | Specify the universe type to calculate the `universe` in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  (optional) (default to "EQUITY")
    back_test_date = "backTestDate_example" # str | Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  (optional)
    calendar = "FIVEDAY" # str | Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. (optional)
    fsym_id = "N" # str | Specify **Y** for `fsymId` to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for `fsymId` is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the `requestId`. For all supported `requestId` symbol types, the `fsymId` parameter will return the Regional Level PermId '-R' which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted `requestId` symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  (optional) (default to "N")
    display_name = [
        "",
    ] # [str] | Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won't be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName=FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  (optional)
    flatten = "N" # str | Specify **Y** for `flatten` to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for `flatten` is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  (optional) (default to "N")
    batch = "N" # str | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  A user is limited to running 5 Batch Requests in a 10 minute period.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  Once a batch request is submitted, use `/batch-status` to see if the job has completed. Once completed, retrieve the results of the request via `/batch-result`. See the endpoints listed under *Batch Processing* for more information.  (optional) (default to "N")

    try:
        # Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
        api_response = api_instance.get_cross_sectional_data(formulas, ids=ids, universe=universe, universe_type=universe_type, back_test_date=back_test_date, calendar=calendar, fsym_id=fsym_id, display_name=display_name, flatten=flatten, batch=batch)
        responseWrapper = {
            200: api_response.get_response_200,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.Formula.ApiException as e:
        print("Exception when calling CrossSectionalApi->get_cross_sectional_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **formulas** | **[str]**| List of Screening formulas |
 **ids** | **[str]**| List of entity identifiers.  The &#x60;ids&#x60; and &#x60;universe&#x60; parameters provide two different ways to specify the identifiers for which you want data retrieved. Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional]
 **universe** | **str**| Screening expression to limit the universe  Please enter either the &#x60;ids&#x60; or &#x60;universe&#x60; parameter.  | [optional]
 **universe_type** | **str**| Specify the universe type to calculate the &#x60;universe&#x60; in.  Find documentation below on how to build a screen for each universe type - * Equity Screen - [Online Assistant Page 20606](https://my.apps.factset.com/oa/pages/20606)  * Debt Screen - [Online Assistant Page 20888](https://my.apps.factset.com/oa/pages/20888)  * Fund Screen - [Online Assistant Page 21384](https://my.apps.factset.com/oa/pages/21384)  | [optional] if omitted the server will use the default value of "EQUITY"
 **back_test_date** | **str**| Specify the backtest date either in **YYYY-MM-DD**, **YYYYMMDD** or **MM/DD/YYYY** format.  To learn more about backtesting, please visit [Online Assistant Page 20610](https://my.apps.factset.com/oa/pages/20610#backtest). User must have access to backtesting functionality.  | [optional]
 **calendar** | **str**| Calendar of data returned. The default value is FIVEDAY which displays Monday through Friday, regardless of whether there were trading holidays. | [optional]
 **fsym_id** | **str**| Specify **Y** for &#x60;fsymId&#x60; to return an additional response object containing the data item **fsymId** which will contain the fsymIds of the requestIds. This is in addition to the response object containing the data item **requestId**. The default value for &#x60;fsymId&#x60; is **N**.  The **fsymId** field returned is the FactSet Default Permanent Identifier for the &#x60;requestId&#x60;. For all supported &#x60;requestId&#x60; symbol types, the &#x60;fsymId&#x60; parameter will return the Regional Level PermId &#39;-R&#39; which identifies the security’s best regional security data series per currency. Currently, the fsymId parameter only supports equities. Accepted &#x60;requestId&#x60; symbol types include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. Further documentation can be found at this [Online Assistant attachment](https://oa.apps.factset.com/cms/oaAttachment/64c3213a-f415-4c27-a336-92c73a72deed/24881).  | [optional] if omitted the server will use the default value of "N"
 **display_name** | **[str]**| Define display names for the formulas inputted. Enter the list of display names in the same order as the formulas inputted. An additional field **displayName** will be returned in the data object for a formula.  If the number of display names does not match the number of formulas provided, an error will be returned.  To define the display name for a subset of the formulas, leave a blank in the position of the formula that won&#39;t be renamed. For example - If three formulas are inputted, to define display names only for the first and third formula, enter *displayName&#x3D;FORMULA_1,,FORMULA_3*. The **displayName** field will still be included in that formula, but will contain the formula as inputted.  | [optional]
 **flatten** | **str**| Specify **Y** for &#x60;flatten&#x60; to return a flat, table-like JSON response model instead of the standard nested JSON response model. This option is provided for easier data processing and visualization. The default value for &#x60;flatten&#x60; is **N**.  See the **Cross-Sectional Result Object Flattened** schema for more detail on the response structure for flattened output.  | [optional] if omitted the server will use the default value of "N"
 **batch** | **str**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  A user is limited to running 5 Batch Requests in a 10 minute period.  *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \&quot;Report Issue\&quot; above and our support teams can assist.*  Once a batch request is submitted, use &#x60;/batch-status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;/batch-result&#x60;. See the endpoints listed under *Batch Processing* for more information.  | [optional] if omitted the server will use the default value of "N"

### Return type

[**CrossSectionalResponse**](CrossSectionalResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  |
**202** | Batch request has been accepted. |  -  |
**400** | Bad Request |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**401** | Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**403** | Not Authorized. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**404** | Endpoint Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**405** | Method Not Allowed |  -  |
**406** | Bad Accept Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**408** | Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 10 minutes to process. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**415** | Bad Content-Type Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**429** | Rate Limits Exceeded |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  |
**500** | Generic Server Error |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**501** | Not Implemented |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**503** | Service Temporarily Unavailable |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_cross_sectional_data_for_list**
> CrossSectionalResponse get_cross_sectional_data_for_list(cross_sectional_request)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The `/cross-sectional` endpoint is closely aligned with FactSet’s powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.  The `/cross-sectional` endpoint supports Long Running asynchronous requests up to **10 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import cross_sectional_api
from fds.sdk.Formula.model.cross_sectional_response import CrossSectionalResponse
from fds.sdk.Formula.model.error_detail import ErrorDetail
from fds.sdk.Formula.model.cross_sectional_request import CrossSectionalRequest
from fds.sdk.Formula.model.batch_status_response import BatchStatusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = cross_sectional_api.CrossSectionalApi(api_client)

    cross_sectional_request = CrossSectionalRequest(
        data=CrossSectionalRequestData(
            ids=["FDS-US","IBM-US","XOM-US"],
            universe="FG_CONSTITUENTS(SP50,0,CLOSE)",
            universe_type="DEBT",
            formulas=["P_PRICE(0)","FG_COMPANY_NAME"],
            back_test_date="2020-06-01",
            calendar="SEVENDAY",
            fsym_id="Y",
            display_name=["PRICE","COMPANY_NAME"],
            flatten="Y",
            batch="Y",
        ),
    ) # CrossSectionalRequest | 

    try:
        # Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
        api_response = api_instance.get_cross_sectional_data_for_list(cross_sectional_request)
        responseWrapper = {
            200: api_response.get_response_200,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.Formula.ApiException as e:
        print("Exception when calling CrossSectionalApi->get_cross_sectional_data_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cross_sectional_request** | [**CrossSectionalRequest**](CrossSectionalRequest.md)|  |

### Return type

[**CrossSectionalResponse**](CrossSectionalResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  |
**202** | Batch request has been accepted. |  -  |
**400** | Bad Request |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**401** | Unauthenticated USERNAME-SERIAL. This error will also occur if the API request is made from IP address not specified in the API Key configuration. Note that additional IP addresses can be added to an existing API Key configuration. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**403** | Not Authorized. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**404** | Endpoint Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**405** | Method Not Allowed |  -  |
**406** | Bad Accept Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**408** | Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 10 minutes to process. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**415** | Bad Content-Type Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**429** | Rate Limits Exceeded |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  |
**500** | Generic Server Error |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**501** | Not Implemented |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
**503** | Service Temporarily Unavailable |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

