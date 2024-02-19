# fds.sdk.RealTimeTimeSeries.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**post_prices_time_series_eod_list**](PricesApi.md#post_prices_time_series_eod_list) | **POST** /prices/timeSeries/eod/list | End-of-day time series data for a notation.
[**post_prices_time_series_eod_subsample_get**](PricesApi.md#post_prices_time_series_eod_subsample_get) | **POST** /prices/timeSeries/eod/subsample/get | Single subsample end-of-day data for a notation.
[**post_prices_time_series_eod_subsample_list**](PricesApi.md#post_prices_time_series_eod_subsample_list) | **POST** /prices/timeSeries/eod/subsample/list | Subsampled end-of-day time series data for a notation.
[**post_prices_time_series_intraday_list**](PricesApi.md#post_prices_time_series_intraday_list) | **POST** /prices/timeSeries/intraday/list | Intraday time series data for a notation.
[**post_prices_time_series_intraday_subsample_get**](PricesApi.md#post_prices_time_series_intraday_subsample_get) | **POST** /prices/timeSeries/intraday/subsample/get | Single subsample intraday data for a notation.
[**post_prices_time_series_intraday_subsample_list**](PricesApi.md#post_prices_time_series_intraday_subsample_list) | **POST** /prices/timeSeries/intraday/subsample/list | Subsampled intraday time series data for a notation.



# **post_prices_time_series_eod_list**
> InlineResponse2005 post_prices_time_series_eod_list(post_prices_time_series_eod_list_request)

End-of-day time series data for a notation.

End-of-day time series data for a notation. The resulting time series is always adjusted for currency changes.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_eod_list_request = PostPricesTimeSeriesEodListRequest(
        data=PostVendorChartIQTimeSeriesEodListRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            range=PostVendorChartIQTimeSeriesEodListRequestDataRange(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
            newest_first=False,
            adjustments=PostVendorChartIQTimeSeriesEodListRequestDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=PostVendorChartIQTimeSeriesEodListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PostVendorChartIQTimeSeriesEodListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostPricesTimeSeriesEodListRequest | Request Body

    try:
        # End-of-day time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_list(post_prices_time_series_eod_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_eod_list_request** | [**PostPricesTimeSeriesEodListRequest**](PostPricesTimeSeriesEodListRequest.md)| Request Body |

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
> InlineResponse2006 post_prices_time_series_eod_subsample_get(post_prices_time_series_eod_subsample_get_request)

Single subsample end-of-day data for a notation.

Single subsample end-of-day data for a notation. The sample is always adjusted for currency changes. The subsample may exceed the entitled date range, but will be based only on days that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_eod_subsample_get_request = PostPricesTimeSeriesEodSubsampleGetRequest(
        data=PostPricesTimeSeriesEodSubsampleGetRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            interval=PostPricesTimeSeriesEodSubsampleGetRequestDataInterval(
                start=dateutil_parser('1970-01-01').date(),
                end=dateutil_parser('1970-01-01').date(),
            ),
            adjustments=PostVendorChartIQTimeSeriesEodListRequestDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostPricesTimeSeriesEodSubsampleGetRequest | Request Body

    try:
        # Single subsample end-of-day data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_subsample_get(post_prices_time_series_eod_subsample_get_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_eod_subsample_get_request** | [**PostPricesTimeSeriesEodSubsampleGetRequest**](PostPricesTimeSeriesEodSubsampleGetRequest.md)| Request Body |

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
> InlineResponse2007 post_prices_time_series_eod_subsample_list(post_prices_time_series_eod_subsample_list_request)

Subsampled end-of-day time series data for a notation.

Subsampled end-of-day time series data for a notation. The resulting time series is always adjusted for currency changes. If a subsample's date range is not entirely within the maximally entitled date range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_eod_subsample_list_request = PostPricesTimeSeriesEodSubsampleListRequest(
        data=PostVendorChartIQTimeSeriesEodSubsampleListRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            interval_selection=PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelection(
                intervals=[
                    dateutil_parser('1970-01-01').date(),
                ],
                samples=PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples(
                    end=dateutil_parser('1970-01-01').date(),
                    number=1,
                    granularity="1w",
                ),
            ),
            newest_first=False,
            adjustments=PostVendorChartIQTimeSeriesEodListRequestDataAdjustments(
                payout=False,
                split=True,
            ),
        ),
        meta=PostVendorChartIQTimeSeriesEodListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PostVendorChartIQTimeSeriesEodListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostPricesTimeSeriesEodSubsampleListRequest | Request Body

    try:
        # Subsampled end-of-day time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_eod_subsample_list(post_prices_time_series_eod_subsample_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_eod_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_eod_subsample_list_request** | [**PostPricesTimeSeriesEodSubsampleListRequest**](PostPricesTimeSeriesEodSubsampleListRequest.md)| Request Body |

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
> InlineResponse2008 post_prices_time_series_intraday_list(post_prices_time_series_intraday_list_request)

Intraday time series data for a notation.

Intraday time series data for a notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_intraday_list_request = PostPricesTimeSeriesIntradayListRequest(
        data=PostPricesTimeSeriesIntradayListRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            range=PostPricesTimeSeriesIntradayListRequestDataRange(
                start="start_example",
                end="end_example",
            ),
            newest_first=False,
            apply_tick_corrections="none",
            include_volume_only_ticks=False,
            adjustments=PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments(
                split=True,
            ),
        ),
        meta=PostPricesTimeSeriesIntradayListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PostPricesTimeSeriesIntradayListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostPricesTimeSeriesIntradayListRequest | Request Body

    try:
        # Intraday time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_list(post_prices_time_series_intraday_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_intraday_list_request** | [**PostPricesTimeSeriesIntradayListRequest**](PostPricesTimeSeriesIntradayListRequest.md)| Request Body |

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
> InlineResponse2009 post_prices_time_series_intraday_subsample_get(post_prices_time_series_intraday_subsample_get_request)

Single subsample intraday data for a notation.

Single subsample intraday data for a notation. The subsample may exceed the entitled time range, but will be based only on ticks that are in the entitled range.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_intraday_subsample_get_request = PostPricesTimeSeriesIntradaySubsampleGetRequest(
        data=PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            _from="_from_example",
            granularity="1h",
            adjustments=PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments(
                split=True,
            ),
        ),
        meta=PostVendorChartIQTimeSeriesEodSubsampleGetRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
        ),
    ) # PostPricesTimeSeriesIntradaySubsampleGetRequest | Request Body

    try:
        # Single subsample intraday data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_subsample_get(post_prices_time_series_intraday_subsample_get_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_subsample_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_intraday_subsample_get_request** | [**PostPricesTimeSeriesIntradaySubsampleGetRequest**](PostPricesTimeSeriesIntradaySubsampleGetRequest.md)| Request Body |

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
> InlineResponse20010 post_prices_time_series_intraday_subsample_list(post_prices_time_series_intraday_subsample_list_request)

Subsampled intraday time series data for a notation.

Subsampled intraday time series data for a notation. If a subsample's time range is not entirely within the maximally entitled time range, the subsample is excluded from the response.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeTimeSeries
from fds.sdk.RealTimeTimeSeries.api import prices_api
from fds.sdk.RealTimeTimeSeries.models import *
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
configuration = fds.sdk.RealTimeTimeSeries.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeTimeSeries.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeTimeSeries.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    post_prices_time_series_intraday_subsample_list_request = PostPricesTimeSeriesIntradaySubsampleListRequest(
        data=PostVendorChartIQTimeSeriesIntradaySubsampleListRequestData(
            identifier=PostVendorChartIQTimeSeriesEodListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            type="trade",
            quality="DLY",
            range=PostVendorChartIQTimeSeriesIntradaySubsampleListRequestDataRange(
                start="start_example",
                end="end_example",
            ),
            granularity="1h",
            newest_first=False,
            adjustments=PostVendorChartIQTimeSeriesIntradaySubsampleGetRequestDataAdjustments(
                split=True,
            ),
        ),
        meta=PostVendorChartIQTimeSeriesEodListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PostVendorChartIQTimeSeriesEodListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostPricesTimeSeriesIntradaySubsampleListRequest | Request Body

    try:
        # Subsampled intraday time series data for a notation.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_time_series_intraday_subsample_list(post_prices_time_series_intraday_subsample_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeTimeSeries.ApiException as e:
        print("Exception when calling PricesApi->post_prices_time_series_intraday_subsample_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_time_series_intraday_subsample_list_request** | [**PostPricesTimeSeriesIntradaySubsampleListRequest**](PostPricesTimeSeriesIntradaySubsampleListRequest.md)| Request Body |

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

