# fds.sdk.QuotesAPIforDigitalPortals.PricesApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_prices_bid_ask_get**](PricesApi.md#get_prices_bid_ask_get) | **GET** /prices/bidAsk/get | Current bid and ask prices (best bid / offer) for a notation.
[**get_prices_bid_ask_list**](PricesApi.md#get_prices_bid_ask_list) | **GET** /prices/bidAsk/list | Current bid and ask prices (best bid / offer) for a list of notations.
[**get_prices_get**](PricesApi.md#get_prices_get) | **GET** /prices/get | Overview of trading on the current trading day, including the latest price, for a notation.
[**get_prices_list**](PricesApi.md#get_prices_list) | **GET** /prices/list | Overview of trading on the current trading day, including the latest price, for a list of notations.
[**get_prices_orderbook_aggregated_get**](PricesApi.md#get_prices_orderbook_aggregated_get) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**get_prices_orderbook_full_get**](PricesApi.md#get_prices_orderbook_full_get) | **GET** /prices/orderbook/full/get | Full orderbook
[**get_prices_trading_schedule_event_type_list**](PricesApi.md#get_prices_trading_schedule_event_type_list) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**post_prices_trading_schedule_event_list**](PricesApi.md#post_prices_trading_schedule_event_list) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.


# **get_prices_bid_ask_get**
> InlineResponse20081 get_prices_bid_ask_get(id)

Current bid and ask prices (best bid / offer) for a notation.

Current bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20081 import InlineResponse20081
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    quality = "DLY" # str | Quality of the price. (optional) (default to "DLY")
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000.0 # float | Minimum number of milliseconds at which updates are send. (optional) (default to 5000.0)

    try:
        # Current bid and ask prices (best bid / offer) for a notation.
        api_response = api_instance.get_prices_bid_ask_get(id, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_bid_ask_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "DLY"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Minimum number of milliseconds at which updates are send. | [optional] if omitted the server will use the default value of 5000.0

### Return type

[**InlineResponse20081**](InlineResponse20081.md)

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

# **get_prices_bid_ask_list**
> InlineResponse20082 get_prices_bid_ask_list(ids)

Current bid and ask prices (best bid / offer) for a list of notations.

Current bid and ask prices (best bid / offer) for a list of notations.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20082 import InlineResponse20082
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | List of notations.
    quality = "DLY" # str | Quality of the price. (optional) (default to "DLY")
    same_quality = True # bool | Assure that the prices for all notations are of the same quality. (optional) (default to True)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Current bid and ask prices (best bid / offer) for a list of notations.
        api_response = api_instance.get_prices_bid_ask_list(ids, quality=quality, same_quality=same_quality, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_bid_ask_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of notations. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "DLY"
 **same_quality** | **bool**| Assure that the prices for all notations are of the same quality. | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20082**](InlineResponse20082.md)

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

# **get_prices_get**
> InlineResponse20079 get_prices_get(id)

Overview of trading on the current trading day, including the latest price, for a notation.

Overview of trading on the current trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20079 import InlineResponse20079
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    quality = "DLY" # str | Quality of the price. (optional) (default to "DLY")
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000.0 # float | Minimum number of milliseconds at which updates are sent. (optional) (default to 5000.0)

    try:
        # Overview of trading on the current trading day, including the latest price, for a notation.
        api_response = api_instance.get_prices_get(id, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "DLY"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Minimum number of milliseconds at which updates are sent. | [optional] if omitted the server will use the default value of 5000.0

### Return type

[**InlineResponse20079**](InlineResponse20079.md)

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

# **get_prices_list**
> InlineResponse20080 get_prices_list(ids)

Overview of trading on the current trading day, including the latest price, for a list of notations.

Overview of trading on the current trading day, including the latest price, for a list of notations.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20080 import InlineResponse20080
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | List of notations.
    quality = "DLY" # str | Quality of the price. (optional) (default to "DLY")
    same_quality = True # bool | Assure that the prices for all notations are of the same quality. (optional) (default to True)
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Overview of trading on the current trading day, including the latest price, for a list of notations.
        api_response = api_instance.get_prices_list(ids, quality=quality, same_quality=same_quality, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of notations. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "DLY"
 **same_quality** | **bool**| Assure that the prices for all notations are of the same quality. | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20080**](InlineResponse20080.md)

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

# **get_prices_orderbook_aggregated_get**
> InlineResponse20083 get_prices_orderbook_aggregated_get(id)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20083 import InlineResponse20083
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    quality = "RLT" # str | Quality of the price. (optional) (default to "RLT")
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Orderbook aggregated by price.
        api_response = api_instance.get_prices_orderbook_aggregated_get(id, quality=quality, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_orderbook_aggregated_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "RLT"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20083**](InlineResponse20083.md)

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

# **get_prices_orderbook_full_get**
> InlineResponse20084 get_prices_orderbook_full_get(id)

Full orderbook

Full orderbook

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20084 import InlineResponse20084
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    id = "id_example" # str | Identifier of the notation.
    quality = "RLT" # str | Quality of the price. (optional) (default to "RLT")
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Full orderbook
        api_response = api_instance.get_prices_orderbook_full_get(id, quality=quality, attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_orderbook_full_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the notation. |
 **quality** | **str**| Quality of the price. | [optional] if omitted the server will use the default value of "RLT"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20084**](InlineResponse20084.md)

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

# **get_prices_trading_schedule_event_type_list**
> InlineResponse20086 get_prices_trading_schedule_event_type_list()

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20086 import InlineResponse20086
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Trading schedule event types.
        api_response = api_instance.get_prices_trading_schedule_event_type_list(attributes=attributes)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->get_prices_trading_schedule_event_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20086**](InlineResponse20086.md)

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

# **post_prices_trading_schedule_event_list**
> InlineResponse20085 post_prices_trading_schedule_event_list(body)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuotesAPIforDigitalPortals
from fds.sdk.QuotesAPIforDigitalPortals.api import prices_api
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_response20085 import InlineResponse20085
from fds.sdk.QuotesAPIforDigitalPortals.model.inline_object21 import InlineObject21
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.QuotesAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuotesAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    body = InlineObject21(
        data=PricesTradingScheduleEventListData(
            id="id_example",
            filter=PricesTradingScheduleEventListDataFilter(
                types=[
                    3.14,
                ],
                range=PricesTradingScheduleEventListDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
            ),
        ),
        meta=PricesTradingScheduleEventListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PricesTradingScheduleEventListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject21 | 

    try:
        # Sequence of market-related events.
        api_response = api_instance.post_prices_trading_schedule_event_list(body)
        pprint(api_response)

    except fds.sdk.QuotesAPIforDigitalPortals.ApiException as e:
        print("Exception when calling PricesApi->post_prices_trading_schedule_event_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject21**](InlineObject21.md)|  |

### Return type

[**InlineResponse20085**](InlineResponse20085.md)

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

