# fds.sdk.TimeSeriesAPIforDigitalPortals.PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_prices_time_series_intraday_subsample_get**](PricesApi.md#get_prices_time_series_intraday_subsample_get) | **GET** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**post_prices_time_series_eod_list**](PricesApi.md#post_prices_time_series_eod_list) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**post_prices_time_series_eod_subsample_get**](PricesApi.md#post_prices_time_series_eod_subsample_get) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**post_prices_time_series_eod_subsample_list**](PricesApi.md#post_prices_time_series_eod_subsample_list) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**post_prices_time_series_intraday_list**](PricesApi.md#post_prices_time_series_intraday_list) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**post_prices_time_series_intraday_subsample_list**](PricesApi.md#post_prices_time_series_intraday_subsample_list) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.


# **get_prices_time_series_intraday_subsample_get**
> InlineResponse2009 get_prices_time_series_intraday_subsample_get(id, _from)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2009 import InlineResponse2009
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    id = "id_example" # str | Identifier of the notation.
    _from = "from_example" # str | Date and time of the start point of the subsample (inclusive). `from` must be aligned to `granularity`. That is, the numerical value is an integral multiple of the time span value represented by `granularity`. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed.
    type = "trade" # str | Type of the price as configured for the customer. (optional) if omitted the server will use the default value of "trade"
    quality = "DLY" # str | Quality of the price. (optional) if omitted the server will use the default value of "DLY"
    granularity = "1h" # str | Subsample granularities suitable for intraday data. (optional) if omitted the server will use the default value of "1h"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Single subsample intraday data for a notation.
        api_response = api_instance.get_prices_time_series_intraday_subsample_get(id, _from)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_time_series_intraday_subsample_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Single subsample intraday data for a notation.
        api_response = api_instance.get_prices_time_series_intraday_subsample_get(id, _from, type=type, quality=quality, granularity=granularity, attributes=attributes)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_time_series_intraday_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **_from** | **str**| Date and time of the start point of the subsample (inclusive). &#x60;from&#x60; must be aligned to &#x60;granularity&#x60;. That is, the numerical value is an integral multiple of the time span value represented by &#x60;granularity&#x60;. The data accessible in the past is limited to a few weeks at most. Dates in the future are not allowed. |
 **type** | **str**| Type of the price as configured for the customer. | [optional] if omitted the server will use the default value of "trade"
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "DLY"
 **granularity** | **str**| Subsample granularities suitable for intraday data. | [optional] if omitted the server will use the default value of "1h"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_prices_time_series_eod_list**
> InlineResponse2005 post_prices_time_series_eod_list(body)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object4 import InlineObject4
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2005 import InlineResponse2005
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    body = InlineObject4(
        data=VendorChartIQTimeSeriesEodListData(
            id="id_example",
            type="trade",
            quality="DLY",
            range=VendorChartIQTimeSeriesEodListDataRange(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
            adjustments=VendorChartIQTimeSeriesEodListDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=VendorChartIQTimeSeriesEodListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=VendorChartIQTimeSeriesEodListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject4 | 

    # example passing only required values which don't have defaults set
    try:
        # End-of-day time series data for a notation.
        api_response = api_instance.post_prices_time_series_eod_list(body)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject4**](InlineObject4.md)|  |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_prices_time_series_eod_subsample_get**
> InlineResponse2006 post_prices_time_series_eod_subsample_get(body)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2006 import InlineResponse2006
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object5 import InlineObject5
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    body = InlineObject5(
        data=PricesTimeSeriesEodSubsampleGetData(
            id="id_example",
            type="trade",
            quality="DLY",
            interval=PricesTimeSeriesEodSubsampleGetDataInterval(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
            adjustments=VendorChartIQTimeSeriesEodListDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=VendorChartIQTimeSeriesEodSubsampleGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject5 | 

    # example passing only required values which don't have defaults set
    try:
        # Single subsample end-of-day data for a notation.
        api_response = api_instance.post_prices_time_series_eod_subsample_get(body)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject5**](InlineObject5.md)|  |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_prices_time_series_eod_subsample_list**
> InlineResponse2007 post_prices_time_series_eod_subsample_list(body)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2007 import InlineResponse2007
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object6 import InlineObject6
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    body = InlineObject6(
        data=PricesTimeSeriesEodSubsampleListData(
            id="id_example",
            type="trade",
            quality="DLY",
            intervals=[
                dateutil_parser('1970-01-01').date(),
            ],
            adjustments=VendorChartIQTimeSeriesEodListDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=VendorChartIQTimeSeriesEodListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=VendorChartIQTimeSeriesEodListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject6 | 

    # example passing only required values which don't have defaults set
    try:
        # Subsampled end-of-day time series data for a notation.
        api_response = api_instance.post_prices_time_series_eod_subsample_list(body)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject6**](InlineObject6.md)|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_prices_time_series_intraday_list**
> InlineResponse2008 post_prices_time_series_intraday_list(body)

Intraday time series data for a notation.

Intraday time series data for a notation.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response2008 import InlineResponse2008
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object7 import InlineObject7
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    body = InlineObject7(
        data=PricesTimeSeriesIntradayListData(
            id="id_example",
            type="trade",
            quality="DLY",
            range=PricesTimeSeriesIntradayListDataRange(
                start="start_example",
                end="end_example",
            ),
            apply_tick_corrections="none",
        ),
        meta=PricesTimeSeriesIntradayListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PricesTimeSeriesIntradayListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject7 | 

    # example passing only required values which don't have defaults set
    try:
        # Intraday time series data for a notation.
        api_response = api_instance.post_prices_time_series_intraday_list(body)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject7**](InlineObject7.md)|  |

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_prices_time_series_intraday_subsample_list**
> InlineResponse20010 post_prices_time_series_intraday_subsample_list(body)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_object8 import InlineObject8
from fds.sdk.TimeSeriesAPIforDigitalPortals.model.inline_response20010 import InlineResponse20010
from pprint import pprint
# Defining the host is optional and defaults to http://api.factset.com/wealth/v1
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    host = "http://api.factset.com/wealth/v1"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)
    body = InlineObject8(
        data=VendorChartIQTimeSeriesIntradaySubsampleListData(
            id="id_example",
            type="trade",
            quality="DLY",
            range=VendorChartIQTimeSeriesIntradaySubsampleListDataRange(
                start="start_example",
                end="end_example",
            ),
            granularity="1h",
        ),
        meta=VendorChartIQTimeSeriesEodListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=VendorChartIQTimeSeriesEodListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject8 | 

    # example passing only required values which don't have defaults set
    try:
        # Subsampled intraday time series data for a notation.
        api_response = api_instance.post_prices_time_series_intraday_subsample_list(body)
        pprint(api_response)
    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject8**](InlineObject8.md)|  |

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

