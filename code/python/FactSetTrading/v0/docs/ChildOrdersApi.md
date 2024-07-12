# fds.sdk.FactSetTrading.ChildOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_child_order**](ChildOrdersApi.md#cancel_child_order) | **POST** /child-orders/cancel | Cancel Child Orders on Trading system
[**create_child_order**](ChildOrdersApi.md#create_child_order) | **POST** /child-orders/create | Create Child Orders on Trading system.
[**replace_child_order**](ChildOrdersApi.md#replace_child_order) | **POST** /child-orders/replace | Replace the Child Orders on Trading system.



# **cancel_child_order**
> ChildOrdersResponseRoot cancel_child_order()

Cancel Child Orders on Trading system

This endpoint is used to cancel a specific child order on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import child_orders_api
from fds.sdk.FactSetTrading.models import *
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
configuration = fds.sdk.FactSetTrading.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTrading.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTrading.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = child_orders_api.ChildOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    cancel_child_orders_root = CancelChildOrdersRoot(
        data=CancelChildOrders(
            child_orders=[
                CancelChildOrder(
                    ticket_id="RKPW.3280015",
                    reason="mistyped order quantity to be routed",
                ),
            ],
        ),
    ) # CancelChildOrdersRoot |  (optional)

    try:
        # Cancel Child Orders on Trading system
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cancel_child_order(cancel_child_orders_root=cancel_child_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling ChildOrdersApi->cancel_child_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancel_child_orders_root** | [**CancelChildOrdersRoot**](CancelChildOrdersRoot.md)|  | [optional]

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  -  |
**400** | Invalid parameters provided. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_child_order**
> CreateChildOrdersResponseRoot create_child_order()

Create Child Orders on Trading system.

This endpoint is used to create child orders on Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import child_orders_api
from fds.sdk.FactSetTrading.models import *
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
configuration = fds.sdk.FactSetTrading.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTrading.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTrading.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = child_orders_api.ChildOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    child_orders_root = ChildOrdersRoot(
        data=ChildOrders(
            child_orders=[
                ChildOrder(
                    parent_id=ParentId(
                        symbol="FDS-USA",
                        basket_id="FACTSET_OMS-100823_12345",
                    ),
                    side="buy",
                    order_type="market",
                    order_quantity=250.01,
                    price=450.01,
                    time_in_force=TimeInForce(
                        tif="day",
                        expire_date="20230823",
                        expire_time="20230823-12:20:25",
                    ),
                    handling_instructions="autoOrderPublic",
                    ex_destination="America Stock Exchange",
                    destination="PAPER",
                    stop_price=250.01,
                    max_floor=100.01,
                    min_quantity=120.01,
                    settlement_type="regular",
                    settlement_date="20230823",
                    execution_instructions="notHeld",
                    locate_required=False,
                    text="routing 10 orders to PAPER destination",
                    profile="profile_example",
                    user_defined_fields={
                        "key": "key_example",
                    },
                ),
            ],
        ),
    ) # ChildOrdersRoot |  (optional)

    try:
        # Create Child Orders on Trading system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_child_order(child_orders_root=child_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling ChildOrdersApi->create_child_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **child_orders_root** | [**ChildOrdersRoot**](ChildOrdersRoot.md)|  | [optional]

### Return type

[**CreateChildOrdersResponseRoot**](CreateChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  -  |
**400** | Invalid parameters provided. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace_child_order**
> ChildOrdersResponseRoot replace_child_order()

Replace the Child Orders on Trading system.

This endpoint takes the child order to be replaced on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import child_orders_api
from fds.sdk.FactSetTrading.models import *
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
configuration = fds.sdk.FactSetTrading.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTrading.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTrading.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = child_orders_api.ChildOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    replace_child_orders_root = ReplaceChildOrdersRoot(
        data=ReplaceChildOrders(
            child_orders=[
                ReplaceChildOrder(
                    ticket_id="RKPW.3280015",
                    order_type="market",
                    order_quantity=100.01,
                    price=450.01,
                    time_in_force=TimeInForce(
                        tif="day",
                        expire_date="20230823",
                        expire_time="20230823-12:20:25",
                    ),
                    handling_instructions="autoOrderPublic",
                    stop_price=120.01,
                    max_floor=200.01,
                    min_quantity=120.01,
                    settlement_type="regular",
                    settlement_date="20230823",
                    execution_instructions="notHeld",
                    locate_required=False,
                    text="Replacing price to 300 for 50 orders",
                    user_defined_fields={
                        "key": "key_example",
                    },
                ),
            ],
        ),
    ) # ReplaceChildOrdersRoot |  (optional)

    try:
        # Replace the Child Orders on Trading system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.replace_child_order(replace_child_orders_root=replace_child_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling ChildOrdersApi->replace_child_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replace_child_orders_root** | [**ReplaceChildOrdersRoot**](ReplaceChildOrdersRoot.md)|  | [optional]

### Return type

[**ChildOrdersResponseRoot**](ChildOrdersResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. |  -  |
**400** | Invalid parameters provided. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

