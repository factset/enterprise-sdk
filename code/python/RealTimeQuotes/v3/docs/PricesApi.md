# fds.sdk.RealTimeQuotes.PricesApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_prices_bid_ask_get**](PricesApi.md#get_prices_bid_ask_get) | **GET** /prices/bidAsk/get | Most recent bid and ask prices (best bid / offer) for a notation.
[**get_prices_bid_ask_list**](PricesApi.md#get_prices_bid_ask_list) | **GET** /prices/bidAsk/list | Most recent bid and ask prices (best bid / offer) for a list of notations.
[**get_prices_get**](PricesApi.md#get_prices_get) | **GET** /prices/get | Overview of trading on the most recent trading day, including the latest price, for a notation.
[**get_prices_list**](PricesApi.md#get_prices_list) | **GET** /prices/list | Overview of trading on the most recent trading day, including the latest price, for a list of notations.
[**get_prices_orderbook_aggregated_get**](PricesApi.md#get_prices_orderbook_aggregated_get) | **GET** /prices/orderbook/aggregated/get | Orderbook aggregated by price.
[**get_prices_orderbook_full_get**](PricesApi.md#get_prices_orderbook_full_get) | **GET** /prices/orderbook/full/get | Full orderbook
[**get_prices_trading_schedule_event_type_list**](PricesApi.md#get_prices_trading_schedule_event_type_list) | **GET** /prices/tradingSchedule/event/type/list | Trading schedule event types.
[**post_prices_trading_schedule_event_list**](PricesApi.md#post_prices_trading_schedule_event_list) | **POST** /prices/tradingSchedule/event/list | Sequence of market-related events.



# **get_prices_bid_ask_get**
> InlineResponse20091 get_prices_bid_ask_get(identifier, identifier_type)

Most recent bid and ask prices (best bid / offer) for a notation.

Most recent bid and ask prices (best bid / offer) for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "80728880015" # str | 
    identifier_type = "idNotation" # str | 
    quality = "DLY" # str |  (optional) if omitted the server will use the default value of "DLY"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000 # float | Minimum number of milliseconds at which updates are send. (optional) if omitted the server will use the default value of 5000

    try:
        # Most recent bid and ask prices (best bid / offer) for a notation.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_bid_ask_get(identifier, identifier_type, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_bid_ask_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "DLY"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Minimum number of milliseconds at which updates are send. | [optional] if omitted the server will use the default value of 5000

### Return type

[**InlineResponse20091**](InlineResponse20091.md)

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
> InlineResponse20092 get_prices_bid_ask_list(identifiers, identifier_type)

Most recent bid and ask prices (best bid / offer) for a list of notations.

Most recent bid and ask prices (best bid / offer) for a list of notations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifiers = [
        "80728880015",
    ] # [str] | 
    identifier_type = "idNotation" # str | 
    quality = "DLY" # str |  (optional) if omitted the server will use the default value of "DLY"
    same_quality = True # bool |  (optional) if omitted the server will use the default value of True
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Most recent bid and ask prices (best bid / offer) for a list of notations.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_bid_ask_list(identifiers, identifier_type, quality=quality, same_quality=same_quality, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_bid_ask_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifiers** | **[str]**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "DLY"
 **same_quality** | **bool**|  | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20092**](InlineResponse20092.md)

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
> InlineResponse20089 get_prices_get(identifier, identifier_type)

Overview of trading on the most recent trading day, including the latest price, for a notation.

Overview of trading on the most recent trading day, including the latest price, for a notation.  The endpoint is subscribable to provide push updates. See attribute `_subscriptionMinimalInterval` for valid update rates.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "80728880015" # str | 
    identifier_type = "idNotation" # str | 
    quality = "DLY" # str |  (optional) if omitted the server will use the default value of "DLY"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000 # float | Minimum number of milliseconds at which updates are sent. (optional) if omitted the server will use the default value of 5000

    try:
        # Overview of trading on the most recent trading day, including the latest price, for a notation.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_get(identifier, identifier_type, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "DLY"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Minimum number of milliseconds at which updates are sent. | [optional] if omitted the server will use the default value of 5000

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

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
> InlineResponse20090 get_prices_list(identifiers, identifier_type)

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

Overview of trading on the most recent trading day, including the latest price, for a list of notations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifiers = [
        "80728880015",
    ] # [str] | 
    identifier_type = "idNotation" # str | 
    quality = "DLY" # str |  (optional) if omitted the server will use the default value of "DLY"
    same_quality = True # bool |  (optional) if omitted the server will use the default value of True
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Overview of trading on the most recent trading day, including the latest price, for a list of notations.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_list(identifiers, identifier_type, quality=quality, same_quality=same_quality, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifiers** | **[str]**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "DLY"
 **same_quality** | **bool**|  | [optional] if omitted the server will use the default value of True
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

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
> InlineResponse20093 get_prices_orderbook_aggregated_get(identifier, identifier_type)

Orderbook aggregated by price.

Orderbook aggregated by price.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "80728880015" # str | 
    identifier_type = "idNotation" # str | 
    quality = "RLT" # str |  (optional) if omitted the server will use the default value of "RLT"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000 # float | Non-negative number of milliseconds to throttle the update rate. (optional) if omitted the server will use the default value of 5000

    try:
        # Orderbook aggregated by price.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_orderbook_aggregated_get(identifier, identifier_type, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_orderbook_aggregated_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "RLT"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Non-negative number of milliseconds to throttle the update rate. | [optional] if omitted the server will use the default value of 5000

### Return type

[**InlineResponse20093**](InlineResponse20093.md)

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
> InlineResponse20094 get_prices_orderbook_full_get(identifier, identifier_type)

Full orderbook

Full orderbook

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "80728880015" # str | 
    identifier_type = "idNotation" # str | 
    quality = "RLT" # str |  (optional) if omitted the server will use the default value of "RLT"
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 5000 # float | Non-negative number of milliseconds to throttle the update rate. (optional) if omitted the server will use the default value of 5000

    try:
        # Full orderbook
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_orderbook_full_get(identifier, identifier_type, quality=quality, attributes=attributes, subscription_minimum_interval=subscription_minimum_interval)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_orderbook_full_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**|  |
 **identifier_type** | **str**|  |
 **quality** | **str**|  | [optional] if omitted the server will use the default value of "RLT"
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Non-negative number of milliseconds to throttle the update rate. | [optional] if omitted the server will use the default value of 5000

### Return type

[**InlineResponse20094**](InlineResponse20094.md)

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
> InlineResponse20096 get_prices_trading_schedule_event_type_list()

Trading schedule event types.

Trading schedule event types define the events which may occur during any period of trading. Types of trading schedule events are for instance OPEN, CLOSE, END_OF_DAY.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Trading schedule event types.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_prices_trading_schedule_event_type_list(attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->get_prices_trading_schedule_event_type_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20096**](InlineResponse20096.md)

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
> InlineResponse20095 post_prices_trading_schedule_event_list(post_prices_trading_schedule_event_list_request)

Sequence of market-related events.

Sequence of market-related events like the opening time or closing time of a market of a specific notation.<br><br>Pagination to a previous page is not supported and `pagination.previous` is always `null`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimeQuotes
from fds.sdk.RealTimeQuotes.api import prices_api
from fds.sdk.RealTimeQuotes.models import *
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
configuration = fds.sdk.RealTimeQuotes.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimeQuotes.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimeQuotes.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_api.PricesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_prices_trading_schedule_event_list_request = PostPricesTradingScheduleEventListRequest(
        data=PostPricesTradingScheduleEventListRequestData(
            identifier=PostPricesTradingScheduleEventListRequestDataIdentifier(
                value="80728880015",
                type="idNotation",
            ),
            filter=PostPricesTradingScheduleEventListRequestDataFilter(
                types=[
                    3.14,
                ],
                range=PostPricesTradingScheduleEventListRequestDataFilterRange(
                    start="start_example",
                    end="end_example",
                ),
            ),
        ),
        meta=PostPricesTradingScheduleEventListRequestMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=PostPricesTradingScheduleEventListRequestMetaPagination(
                cursor="cursor_example",
                limit=20,
            ),
        ),
    ) # PostPricesTradingScheduleEventListRequest | Request Body

    try:
        # Sequence of market-related events.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_prices_trading_schedule_event_list(post_prices_trading_schedule_event_list_request)

        pprint(api_response)

    except fds.sdk.RealTimeQuotes.ApiException as e:
        print("Exception when calling PricesApi->post_prices_trading_schedule_event_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_prices_trading_schedule_event_list_request** | [**PostPricesTradingScheduleEventListRequest**](PostPricesTradingScheduleEventListRequest.md)| Request Body |

### Return type

[**InlineResponse20095**](InlineResponse20095.md)

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

