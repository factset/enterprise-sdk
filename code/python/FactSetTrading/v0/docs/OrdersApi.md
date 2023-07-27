# fds.sdk.FactSetTrading.OrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](OrdersApi.md#cancel) | **POST** /orders/cancel | Cancel the orders on EMS system.
[**create**](OrdersApi.md#create) | **POST** /orders/create | Send orders to EMS for execution.
[**replace**](OrdersApi.md#replace) | **POST** /orders/replace | Replace the orders on EMS system.



# **cancel**
> EMSOrdersCreateResponseRoot cancel()

Cancel the orders on EMS system.

This endpoint takes the list of orders to be cancelled on the EMS system.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import orders_api
from fds.sdk.FactSetTrading.models import *
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
    api_instance = orders_api.OrdersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ems_cancel_orders_root = EMSCancelOrdersRoot(
        data=EMSCancelOrders(
            investor_id="investor_id_example",
            orders=[
                EMSCancelOrder(
                    original_order_id="original_order_id_example",
                    inbound_destination="inbound_destination_example",
                ),
            ],
        ),
    ) # EMSCancelOrdersRoot |  (optional)

    try:
        # Cancel the orders on EMS system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cancel(ems_cancel_orders_root=ems_cancel_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling OrdersApi->cancel: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ems_cancel_orders_root** | [**EMSCancelOrdersRoot**](EMSCancelOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns the list of order ids. |  -  |
**400** | Invalid post body parameters. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> EMSOrdersCreateResponseRoot create()

Send orders to EMS for execution.

This endpoint takes the list of orders and place them on EMS for execution.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import orders_api
from fds.sdk.FactSetTrading.models import *
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
    api_instance = orders_api.OrdersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ems_orders_root = EMSOrdersRoot(
        data=EMSOrders(
            investor_id="DEMO-12345",
            orders=[
                EMSOrder(
                    order_id="12322123",
                    instrument=Instrument(
                        symbol="TATAMOTORS",
                        security_type="security_type_example",
                        cfi_code="cfi_code_example",
                        security_exchange="security_exchange_example",
                        issuer="issuer_example",
                        security_description="security_description_example",
                        maturity_month_year="maturity_month_year_example",
                        maturity_day="maturity_day_example",
                    ),
                    side="buy",
                    order_type="market",
                    order_quantity=350,
                    price=800,
                    stop_price=800,
                    strike_price=400,
                    currency="USD",
                    is_covered=False,
                    max_show=100,
                    max_floor=100,
                    prev_close_price=100,
                    settlement_type="regular",
                    settlement_date="20210622",
                    handling_instructions="auto_ord_pub",
                    execution_instructions="not_held",
                    locate_required=False,
                    effective_time="20210622-12:15:30",
                    account="Test.ACCT",
                    time_in_force=TimeInForce(
                        tif="DAY",
                        expire_date="expire_date_example",
                        expire_time="expire_time_example",
                    ),
                    inbound_destination="inbound_destination_example",
                    user_defined_fields={
                        "key": "key_example",
                    },
                ),
            ],
        ),
    ) # EMSOrdersRoot |  (optional)

    try:
        # Send orders to EMS for execution.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create(ems_orders_root=ems_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling OrdersApi->create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ems_orders_root** | [**EMSOrdersRoot**](EMSOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns the list of orders. |  -  |
**400** | Invalid post body parameters. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace**
> EMSOrdersCreateResponseRoot replace()

Replace the orders on EMS system.

This endpoint takes the list of orders to be replaced on the EMS system.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import orders_api
from fds.sdk.FactSetTrading.models import *
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
    api_instance = orders_api.OrdersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ems_replace_orders_root = EMSReplaceOrdersRoot(
        data=EMSReplaceOrders(
            investor_id="DEMO-12345",
            orders=[
                EMSReplaceOrder(
                    original_order_id="original_order_id_example",
                    order=EMSOrder(
                        order_id="12322123",
                        instrument=Instrument(
                            symbol="TATAMOTORS",
                            security_type="security_type_example",
                            cfi_code="cfi_code_example",
                            security_exchange="security_exchange_example",
                            issuer="issuer_example",
                            security_description="security_description_example",
                            maturity_month_year="maturity_month_year_example",
                            maturity_day="maturity_day_example",
                        ),
                        side="buy",
                        order_type="market",
                        order_quantity=350,
                        price=800,
                        stop_price=800,
                        strike_price=400,
                        currency="USD",
                        is_covered=False,
                        max_show=100,
                        max_floor=100,
                        prev_close_price=100,
                        settlement_type="regular",
                        settlement_date="20210622",
                        handling_instructions="auto_ord_pub",
                        execution_instructions="not_held",
                        locate_required=False,
                        effective_time="20210622-12:15:30",
                        account="Test.ACCT",
                        time_in_force=TimeInForce(
                            tif="DAY",
                            expire_date="expire_date_example",
                            expire_time="expire_time_example",
                        ),
                        inbound_destination="inbound_destination_example",
                        user_defined_fields={
                            "key": "key_example",
                        },
                    ),
                ),
            ],
        ),
    ) # EMSReplaceOrdersRoot |  (optional)

    try:
        # Replace the orders on EMS system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.replace(ems_replace_orders_root=ems_replace_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling OrdersApi->replace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ems_replace_orders_root** | [**EMSReplaceOrdersRoot**](EMSReplaceOrdersRoot.md)|  | [optional]

### Return type

[**EMSOrdersCreateResponseRoot**](EMSOrdersCreateResponseRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns the list of order ids. |  -  |
**400** | Invalid post body parameters. |  -  |
**401** | Missing or invalid authentication. |  -  |
**403** | User is forbidden with current credentials |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

