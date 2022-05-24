# fds.sdk.PriceAlertingAPIforDigitalPortals.AlertingApi

All URIs are relative to *https://api.factset.com/wealth/v1*

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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PriceAlertingAPIforDigitalPortals
from fds.sdk.PriceAlertingAPIforDigitalPortals.api import alerting_api
from fds.sdk.PriceAlertingAPIforDigitalPortals.model.inline_response200 import InlineResponse200
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PriceAlertingAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    id = "id_example" # str | Identifier of the alert.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of an alert.
        api_response = api_instance.get_alerting_prices_basic_alert_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.PriceAlertingAPIforDigitalPortals.ApiException as e:
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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PriceAlertingAPIforDigitalPortals
from fds.sdk.PriceAlertingAPIforDigitalPortals.api import alerting_api
from fds.sdk.PriceAlertingAPIforDigitalPortals.model.inline_response2001 import InlineResponse2001
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PriceAlertingAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)
    subscription_minimum_interval = 0.0 # float | Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. (optional) (default to 0.0)
    pagination_cursor = "_paginationCursor_example" # str | Starting point as returned in the attributes `pagination.next` or `pagination.previous` by a prior invocation of this endpoint, or undefined (default). (optional)
    pagination_limit = 20.0 # float | Non-negative maximum number of entries to return. (optional) (default to 20.0)

    try:
        # List of alerts.
        api_response = api_instance.get_alerting_prices_basic_alert_list(attributes=attributes, subscription_minimum_interval=subscription_minimum_interval, pagination_cursor=pagination_cursor, pagination_limit=pagination_limit)
        pprint(api_response)

    except fds.sdk.PriceAlertingAPIforDigitalPortals.ApiException as e:
        print("Exception when calling AlertingApi->get_alerting_prices_basic_alert_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **[str]**| Limit the attributes returned in the response to the specified set. | [optional]
 **subscription_minimum_interval** | **float**| Non-negative number of milliseconds to throttle the update rate from 0ms to 5000ms. Set to 0 for sending updates immediately. | [optional] if omitted the server will use the default value of 0.0
 **pagination_cursor** | **str**| Starting point as returned in the attributes &#x60;pagination.next&#x60; or &#x60;pagination.previous&#x60; by a prior invocation of this endpoint, or undefined (default). | [optional]
 **pagination_limit** | **float**| Non-negative maximum number of entries to return. | [optional] if omitted the server will use the default value of 20.0

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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PriceAlertingAPIforDigitalPortals
from fds.sdk.PriceAlertingAPIforDigitalPortals.api import alerting_api
from fds.sdk.PriceAlertingAPIforDigitalPortals.model.inline_response2002 import InlineResponse2002
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PriceAlertingAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    id = "id_example" # str | Identifier of the trigger.
    attributes = [
        "_attributes_example",
    ] # [str] | Limit the attributes returned in the response to the specified set. (optional)

    try:
        # Details of a trigger.
        api_response = api_instance.get_alerting_prices_basic_trigger_get(id, attributes=attributes)
        pprint(api_response)

    except fds.sdk.PriceAlertingAPIforDigitalPortals.ApiException as e:
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

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.PriceAlertingAPIforDigitalPortals
from fds.sdk.PriceAlertingAPIforDigitalPortals.api import alerting_api
from fds.sdk.PriceAlertingAPIforDigitalPortals.model.inline_response2003 import InlineResponse2003
from fds.sdk.PriceAlertingAPIforDigitalPortals.model.inline_object import InlineObject
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.PriceAlertingAPIforDigitalPortals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.PriceAlertingAPIforDigitalPortals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = alerting_api.AlertingApi(api_client)

    body = InlineObject(
        data=AlertingPricesBasicTriggerListData(
            filter=AlertingPricesBasicTriggerListDataFilter(
                status=AlertingPricesBasicTriggerListDataFilterStatus(
                    code="active",
                ),
            ),
        ),
        meta=AlertingPricesBasicTriggerListMeta(
            attributes=AttributesMember([
                "attributes_example",
            ]),
            pagination=AlertingPricesBasicTriggerListMetaPagination(
                cursor="cursor_example",
                limit=0,
            ),
        ),
    ) # InlineObject |  (optional)

    try:
        # List of triggers.
        api_response = api_instance.post_alerting_prices_basic_trigger_list(body=body)
        pprint(api_response)

    except fds.sdk.PriceAlertingAPIforDigitalPortals.ApiException as e:
        print("Exception when calling AlertingApi->post_alerting_prices_basic_trigger_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

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

