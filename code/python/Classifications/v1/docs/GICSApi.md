# fds.sdk.Classifications.GICSApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_gics**](GICSApi.md#get_gics) | **GET** /classifications/v1/gics | Gets the GICS Direct Classifications
[**post_gics**](GICSApi.md#post_gics) | **POST** /classifications/v1/gics | Returns the GICS classifications for the requested &#39;ids&#39; and date range.


# **get_gics**
> GicsResponse get_gics(ids)

Gets the GICS Direct Classifications

Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 securities. *Licensing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Classifications
from fds.sdk.Classifications.api import gics_api
from fds.sdk.Classifications.model.error_response import ErrorResponse
from fds.sdk.Classifications.model.gics_response import GicsResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Classifications.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Classifications.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Classifications.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Classifications.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = gics_api.GICSApi(api_client)
    ids = [
        "ids_example",
    ] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "startDate_example" # str | Requested start date expressed in YYYY-MM-DD format. (optional)
    end_date = "endDate_example" # str | Requested End Date for Range expressed in YYYY-MM-DD format. (optional)
    frequency = "M" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional) if omitted the server will use the default value of "M"
    calendar = "FIVEDAY" # str | Calendar of data returned. SEVENDAY includes weekends. (optional) if omitted the server will use the default value of "FIVEDAY"

    # example passing only required values which don't have defaults set
    try:
        # Gets the GICS Direct Classifications
        api_response = api_instance.get_gics(ids)
        pprint(api_response)
    except fds.sdk.Classifications.ApiException as e:
        print("Exception when calling GICSApi->get_gics: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets the GICS Direct Classifications
        api_response = api_instance.get_gics(ids, start_date=start_date, end_date=end_date, frequency=frequency, calendar=calendar)
        pprint(api_response)
    except fds.sdk.Classifications.ApiException as e:
        print("Exception when calling GICSApi->get_gics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| Requested start date expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] if omitted the server will use the default value of "M"
 **calendar** | **str**| Calendar of data returned. SEVENDAY includes weekends. | [optional] if omitted the server will use the default value of "FIVEDAY"

### Return type

[**GicsResponse**](GicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | GICS Response Object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_gics**
> GicsResponse post_gics(gics_request)

Returns the GICS classifications for the requested 'ids' and date range.

Gets the The **Global Industry Classification Standard (\"GICS\")** Sectors, Industry Group, Industry, and Sub-Industry Names and Numbers for a requested list of ids and date range. All economic sectors have a two-digit identification code, all industry groups have a four-digit identification code, all industries have a six-digit identification code, and all sub-industries have an eight-digit identification code. To access the complete GICS structure and definitions, visit the [MSCI GICS](https://www.msci.com/gics) or [S&P GICS](http://us.spindices.com/resource-center/index-policies/) home pages. Coverage includes over 37,000 secutries. *Licencing for GICS Classifications, Regions, and History is required in addition to FactSet API license. Reach out to your FactSet Account Team for assistance.* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Classifications
from fds.sdk.Classifications.api import gics_api
from fds.sdk.Classifications.model.error_response import ErrorResponse
from fds.sdk.Classifications.model.gics_response import GicsResponse
from fds.sdk.Classifications.model.gics_request import GicsRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Classifications.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Classifications.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Classifications.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Classifications.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = gics_api.GICSApi(api_client)
    gics_request = GicsRequest(
        ids=Ids(["AAPL-US"]),
        start_date="2018-12-31",
        end_date="2019-12-31",
        frequency=Frequency("M"),
        calendar=Calendar("FIVEDAY"),
    ) # GicsRequest | Requests GICS Classifications for the given identifier and date range.

    # example passing only required values which don't have defaults set
    try:
        # Returns the GICS classifications for the requested 'ids' and date range.
        api_response = api_instance.post_gics(gics_request)
        pprint(api_response)
    except fds.sdk.Classifications.ApiException as e:
        print("Exception when calling GICSApi->post_gics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **gics_request** | [**GicsRequest**](GicsRequest.md)| Requests GICS Classifications for the given identifier and date range. |

### Return type

[**GicsResponse**](GicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | GICS Direct Response Items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

