# fds.sdk.TimeSeriesAPIforDigitalPortals.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_prices_time_series_eod_list**](PricesApi.md#post_prices_time_series_eod_list) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**post_prices_time_series_eod_subsample_get**](PricesApi.md#post_prices_time_series_eod_subsample_get) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**post_prices_time_series_eod_subsample_list**](PricesApi.md#post_prices_time_series_eod_subsample_list) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**post_prices_time_series_intraday_list**](PricesApi.md#post_prices_time_series_intraday_list) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**post_prices_time_series_intraday_subsample_get**](PricesApi.md#post_prices_time_series_intraday_subsample_get) | **POST** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**post_prices_time_series_intraday_subsample_list**](PricesApi.md#post_prices_time_series_intraday_subsample_list) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.


# **post_prices_time_series_eod_list**
> InlineResponse2005 post_prices_time_series_eod_list(inline_object5)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object5 = InlineObject5(
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
                limit=20,
            ),
        ),
    ) # InlineObject5 | 

    try:
        # End-of-day time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_list(inline_object5)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object5** | [**InlineObject5**](InlineObject5.md)|  |

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
> InlineResponse2006 post_prices_time_series_eod_subsample_get(inline_object6)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object6 = InlineObject6(
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
    ) # InlineObject6 | 

    try:
        # Single subsample end-of-day data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_subsample_get(inline_object6)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object6** | [**InlineObject6**](InlineObject6.md)|  |

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
> InlineResponse2007 post_prices_time_series_eod_subsample_list(inline_object7)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object7 = InlineObject7(
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
                limit=20,
            ),
        ),
    ) # InlineObject7 | 

    try:
        # Subsampled end-of-day time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_subsample_list(inline_object7)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object7** | [**InlineObject7**](InlineObject7.md)|  |

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
> InlineResponse2008 post_prices_time_series_intraday_list(inline_object8)

Intraday time series data for a notation.

Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object8 = InlineObject8(
        data=PricesTimeSeriesIntradayListData(
            id="id_example",
            type="trade",
            quality="DLY",
            range=PricesTimeSeriesIntradayListDataRange(
                start="start_example",
                end="end_example",
            ),
            apply_tick_corrections="none",
            include_volume_only_ticks=False,
            adjustments=VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments(
                split=True,
            ),
        ),
        meta=PricesTimeSeriesIntradayListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PricesTimeSeriesIntradayListMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # InlineObject8 | 

    try:
        # Intraday time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_list(inline_object8)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object8** | [**InlineObject8**](InlineObject8.md)|  |

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

# **post_prices_time_series_intraday_subsample_get**
> InlineResponse2009 post_prices_time_series_intraday_subsample_get(inline_object9)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object9 = InlineObject9(
        data=VendorChartIQTimeSeriesIntradaySubsampleGetData(
            id="id_example",
            type="trade",
            quality="DLY",
            _from="_from_example",
            granularity="1h",
            adjustments=VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments(
                split=True,
            ),
        ),
        meta=VendorChartIQTimeSeriesEodSubsampleGetMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # InlineObject9 | 

    try:
        # Single subsample intraday data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_subsample_get(inline_object9)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object9** | [**InlineObject9**](InlineObject9.md)|  |

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

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
> InlineResponse20010 post_prices_time_series_intraday_subsample_list(inline_object10)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.TimeSeriesAPIforDigitalPortals
from fds.sdk.TimeSeriesAPIforDigitalPortals.api import prices_api
from fds.sdk.TimeSeriesAPIforDigitalPortals.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.TimeSeriesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.TimeSeriesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    inline_object10 = InlineObject10(
        data=VendorChartIQTimeSeriesIntradaySubsampleListData(
            id="id_example",
            type="trade",
            quality="DLY",
            range=VendorChartIQTimeSeriesIntradaySubsampleListDataRange(
                start="start_example",
                end="end_example",
            ),
            granularity="1h",
            adjustments=VendorChartIQTimeSeriesIntradaySubsampleGetDataAdjustments(
                split=True,
            ),
        ),
        meta=VendorChartIQTimeSeriesEodListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=VendorChartIQTimeSeriesEodListMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # InlineObject10 | 

    try:
        # Subsampled intraday time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_subsample_list(inline_object10)
        pprint(api_response)

    except fds.sdk.TimeSeriesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inline_object10** | [**InlineObject10**](InlineObject10.md)|  |

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

