# fds.sdk.RealTimePriceAlerting.AlertingApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_alerting_prices_basic_alert_get**](AlertingApi.md#get_alerting_prices_basic_alert_get) | **GET** /alerting/prices/basic/alert/get | Details of an alert.
[**get_alerting_prices_basic_alert_list**](AlertingApi.md#get_alerting_prices_basic_alert_list) | **GET** /alerting/prices/basic/alert/list | List of alerts.
[**get_alerting_prices_basic_trigger_get**](AlertingApi.md#get_alerting_prices_basic_trigger_get) | **GET** /alerting/prices/basic/trigger/get | Details of a trigger.
[**post_alerting_prices_basic_trigger_list**](AlertingApi.md#post_alerting_prices_basic_trigger_list) | **POST** /alerting/prices/basic/trigger/list | List of triggers.



# **get_alerting_prices_basic_alert_get**
> InlineResponse200 get_alerting_prices_basic_alert_get(id)

Details of an alert.

Details of an alert. The details include the trigger definition at the time of alert creation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimePriceAlerting
from fds.sdk.RealTimePriceAlerting.api import alerting_api
from fds.sdk.RealTimePriceAlerting.models import *
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
configuration = fds.sdk.RealTimePriceAlerting.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimePriceAlerting.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimePriceAlerting.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "4004" # str | Identifier of the alert.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of an alert.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_alerting_prices_basic_alert_get(id, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimePriceAlerting.ApiException as e:
        print("Exception when calling AlertingApi->get_alerting_prices_basic_alert_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the alert. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

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

# **get_alerting_prices_basic_alert_list**
> InlineResponse2001 get_alerting_prices_basic_alert_list()

List of alerts.

List of alerts in descending order of creation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimePriceAlerting
from fds.sdk.RealTimePriceAlerting.api import alerting_api
from fds.sdk.RealTimePriceAlerting.models import *
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
configuration = fds.sdk.RealTimePriceAlerting.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimePriceAlerting.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimePriceAlerting.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    meta_subscription_minimum_interval = 937 # float | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. (optional) if omitted the server will use the default value of 0
    pagination_cursor = "Lorem ipsum" # str | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default). (optional)
    pagination_limit = 20 # float | Non-negative maximum number of entries to return. (optional) if omitted the server will use the default value of 20

    try:
        # List of alerts.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_alerting_prices_basic_alert_list(attributes=attributes, meta_subscription_minimum_interval=meta_subscription_minimum_interval, pagination_cursor=pagination_cursor, pagination_limit=pagination_limit)

        pprint(api_response)

    except fds.sdk.RealTimePriceAlerting.ApiException as e:
        print("Exception when calling AlertingApi->get_alerting_prices_basic_alert_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **meta_subscription_minimum_interval** | **float**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] if omitted the server will use the default value of 0
 **pagination_cursor** | **str**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional]
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

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

# **get_alerting_prices_basic_trigger_get**
> InlineResponse2002 get_alerting_prices_basic_trigger_get(id)

Details of a trigger.

Details of a trigger.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimePriceAlerting
from fds.sdk.RealTimePriceAlerting.api import alerting_api
from fds.sdk.RealTimePriceAlerting.models import *
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
configuration = fds.sdk.RealTimePriceAlerting.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimePriceAlerting.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimePriceAlerting.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "4004" # str | Identifier of the trigger.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a trigger.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_alerting_prices_basic_trigger_get(id, attributes=attributes)

        pprint(api_response)

    except fds.sdk.RealTimePriceAlerting.ApiException as e:
        print("Exception when calling AlertingApi->get_alerting_prices_basic_trigger_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Identifier of the trigger. |
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

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

# **post_alerting_prices_basic_trigger_list**
> InlineResponse2003 post_alerting_prices_basic_trigger_list()

List of triggers.

Returns a list of triggers sorted in descending order of creation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.RealTimePriceAlerting
from fds.sdk.RealTimePriceAlerting.api import alerting_api
from fds.sdk.RealTimePriceAlerting.models import *
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
configuration = fds.sdk.RealTimePriceAlerting.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.RealTimePriceAlerting.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.RealTimePriceAlerting.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    post_alerting_prices_basic_trigger_list_request = PostAlertingPricesBasicTriggerListRequest(
        data=PostAlertingPricesBasicTriggerListRequestData(
            filter=PostAlertingPricesBasicTriggerListRequestDataFilter(
                status=PostAlertingPricesBasicTriggerListRequestDataFilterStatus(
                    code="active",
                ),
            ),
        ),
        meta=PostAlertingPricesBasicTriggerListRequestMeta(
            attributes=AttributesMember([]),
            pagination=PostAlertingPricesBasicTriggerListRequestMetaPagination(
                cursor="Lorem ipsum",
                limit=20,
            ),
        ),
    ) # PostAlertingPricesBasicTriggerListRequest | Request Body (optional)

    try:
        # List of triggers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_alerting_prices_basic_trigger_list(post_alerting_prices_basic_trigger_list_request=post_alerting_prices_basic_trigger_list_request)

        pprint(api_response)

    except fds.sdk.RealTimePriceAlerting.ApiException as e:
        print("Exception when calling AlertingApi->post_alerting_prices_basic_trigger_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **post_alerting_prices_basic_trigger_list_request** | [**PostAlertingPricesBasicTriggerListRequest**](PostAlertingPricesBasicTriggerListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

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

