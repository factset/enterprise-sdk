# fds.sdk.FactSetEstimates.SegmentsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_segments**](SegmentsApi.md#get_segments) | **GET** /factset-estimates/v2/segments | Retrieves product &amp; geographic segment estimates for a requested list of ids and fiscal periods
[**get_segments_for_list**](SegmentsApi.md#get_segments_for_list) | **POST** /factset-estimates/v2/segments | Retrieves product segment estimates for a requested list of ids and fiscal periods


# **get_segments**
> SegmentsResponse get_segments(ids, metrics)

Retrieves product & geographic segment estimates for a requested list of ids and fiscal periods

Returns FactSet Estimates Consensus Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import segments_api
from fds.sdk.FactSetEstimates.model.segments_response import SegmentsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = segments_api.SegmentsApi(api_client)
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  50 per request*</p> * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
    metrics = [
        "SALES",
    ] # [str] | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
    start_date = "2019-07-30" # str | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = "2020-07-30" # str | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    relative_fiscal_start = 1 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). (optional)
    relative_fiscal_end = 3 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). (optional)
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  (optional) if omitted the server will use the default value of "ANN"
    frequency = "D" # str | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional) if omitted the server will use the default value of "D"
    currency = "USD" # str | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieves product & geographic segment estimates for a requested list of ids and fiscal periods
        api_response = api_instance.get_segments(ids, metrics)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling SegmentsApi->get_segments: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieves product & geographic segment estimates for a requested list of ids and fiscal periods
        api_response = api_instance.get_segments(ids, metrics, start_date=start_date, end_date=end_date, relative_fiscal_start=relative_fiscal_start, relative_fiscal_end=relative_fiscal_end, periodicity=periodicity, frequency=frequency, currency=currency)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling SegmentsApi->get_segments: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; * Make Note - id limit of 50 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  |
 **metrics** | **[str]**| Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  |
 **segment_type** | **str**| Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  | defaults to "BUS"
 **start_date** | **str**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **relative_fiscal_start** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional]
 **relative_fiscal_end** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional]
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  | [optional] if omitted the server will use the default value of "ANN"
 **frequency** | **str**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] if omitted the server will use the default value of "D"
 **currency** | **str**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**SegmentsResponse**](SegmentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Segment Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_segments_for_list**
> SegmentsResponse get_segments_for_list(segments_request)

Retrieves product segment estimates for a requested list of ids and fiscal periods

Returns FactSet Estimates Data for the segments gathered from the Business, Geographical, or Actual Reconciliation (ADJUSTMENT) classifications by using fiscal periods with a reporting frequency.  

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import segments_api
from fds.sdk.FactSetEstimates.model.segments_response import SegmentsResponse
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.segments_request import SegmentsRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEstimates.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEstimates.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = segments_api.SegmentsApi(api_client)
    segments_request = SegmentsRequest(
        ids=SegmentIds(["FDS-US"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        relative_fiscal_start=1,
        relative_fiscal_end=3,
        periodicity=Periodicity("ANN"),
        frequency=Frequency("AM"),
        segment_type=SegmentType("BUS"),
        metrics=Metrics(["SALES"]),
        currency="USD",
    ) # SegmentsRequest | Request object for Product Segments estimates.

    # example passing only required values which don't have defaults set
    try:
        # Retrieves product segment estimates for a requested list of ids and fiscal periods
        api_response = api_instance.get_segments_for_list(segments_request)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling SegmentsApi->get_segments_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segments_request** | [**SegmentsRequest**](SegmentsRequest.md)| Request object for Product Segments estimates. |

### Return type

[**SegmentsResponse**](SegmentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Segments Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

