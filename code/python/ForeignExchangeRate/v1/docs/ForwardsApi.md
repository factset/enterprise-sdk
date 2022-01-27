# fds.sdk.ForeignExchangeRate.ForwardsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fx_forwards**](ForwardsApi.md#get_fx_forwards) | **GET** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs
[**get_fx_forwards_for_list**](ForwardsApi.md#get_fx_forwards_for_list) | **POST** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs


# **get_fx_forwards**
> ForwardsResponse get_fx_forwards(ids)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ForeignExchangeRate
from fds.sdk.ForeignExchangeRate.api import forwards_api
from fds.sdk.ForeignExchangeRate.model.error_response import ErrorResponse
from fds.sdk.ForeignExchangeRate.model.forwards_response import ForwardsResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.ForeignExchangeRate.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.ForeignExchangeRate.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.ForeignExchangeRate.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ForeignExchangeRate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = forwards_api.ForwardsApi(api_client)
    ids = ["USDGBP"] # [str] | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
    forward_period = "ON" # str | Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  (optional) if omitted the server will use the default value of "1M"
    start_date = "2019-01-01" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  (optional)
    frequency = "D" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional) if omitted the server will use the default value of "D"

    # example passing only required values which don't have defaults set
    try:
        # Gets Forwards for a list of currency pairs
        api_response = api_instance.get_fx_forwards(ids)
        pprint(api_response)
    except fds.sdk.ForeignExchangeRate.ApiException as e:
        print("Exception when calling ForwardsApi->get_fx_forwards: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets Forwards for a list of currency pairs
        api_response = api_instance.get_fx_forwards(ids, forward_period=forward_period, start_date=start_date, end_date=end_date, frequency=frequency)
        pprint(api_response)
    except fds.sdk.ForeignExchangeRate.ApiException as e:
        print("Exception when calling ForwardsApi->get_fx_forwards: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470) |
 **forward_period** | **str**| Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  | [optional] if omitted the server will use the default value of "1M"
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] if omitted the server will use the default value of "D"

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of ids Forward Rates for the date range and frequency requested |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fx_forwards_for_list**
> ForwardsResponse get_fx_forwards_for_list(forwards_request)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ForeignExchangeRate
from fds.sdk.ForeignExchangeRate.api import forwards_api
from fds.sdk.ForeignExchangeRate.model.error_response import ErrorResponse
from fds.sdk.ForeignExchangeRate.model.forwards_response import ForwardsResponse
from fds.sdk.ForeignExchangeRate.model.forwards_request import ForwardsRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.ForeignExchangeRate.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.ForeignExchangeRate.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.ForeignExchangeRate.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ForeignExchangeRate.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = forwards_api.ForwardsApi(api_client)
    forwards_request = ForwardsRequest(
        ids=Ids(["USDGBP","USDEUR"]),
        forward_period=ForwardPeriod("1M"),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("M"),
    ) # ForwardsRequest | Request object for FX Forwards.

    # example passing only required values which don't have defaults set
    try:
        # Gets Forwards for a list of currency pairs
        api_response = api_instance.get_fx_forwards_for_list(forwards_request)
        pprint(api_response)
    except fds.sdk.ForeignExchangeRate.ApiException as e:
        print("Exception when calling ForwardsApi->get_fx_forwards_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **forwards_request** | [**ForwardsRequest**](ForwardsRequest.md)| Request object for FX Forwards. |

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of forward rates |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

