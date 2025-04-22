# fds.sdk.FactSetTrading.InboundOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel**](InboundOrdersApi.md#cancel) | **POST** /inbound-orders/cancel | Cancel the inbound orders on Trading system.
[**create**](InboundOrdersApi.md#create) | **POST** /inbound-orders/create | Send inbound orders to Trading system for execution.
[**replace**](InboundOrdersApi.md#replace) | **POST** /inbound-orders/replace | Replace the inbound orders on Trading system.



# **cancel**
> InboundOrdersResponseRoot cancel()

Cancel the inbound orders on Trading system.

This endpoint takes the list of inbound orders to be cancelled on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import inbound_orders_api
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
    api_instance = inbound_orders_api.InboundOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    cancel_inbound_orders_root = CancelInboundOrdersRoot(
        data=CancelInboundOrders(
            investor_id="DEMO-12345",
            inbound_orders=[
                CancelInboundOrder(
                    original_client_order_id="original_client_order_id_example",
                    inbound_destination="inbound_destination_example",
                ),
            ],
        ),
    ) # CancelInboundOrdersRoot |  (optional)

    try:
        # Cancel the inbound orders on Trading system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.cancel(cancel_inbound_orders_root=cancel_inbound_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling InboundOrdersApi->cancel: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancel_inbound_orders_root** | [**CancelInboundOrdersRoot**](CancelInboundOrdersRoot.md)|  | [optional]

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create**
> InboundOrdersResponseRoot create()

Send inbound orders to Trading system for execution.

This endpoint takes the list of inbound orders and place them on Trading system for execution.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import inbound_orders_api
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
    api_instance = inbound_orders_api.InboundOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    inbound_orders_root = InboundOrdersRoot(
        data=InboundOrders(
            investor_id="DEMO-12345",
            inbound_orders=[
                InboundOrder(
                    client_order_id="12322123",
                    instrument=Instrument(
                        symbol="TATAMOTORS",
                        security_type="security_type_example",
                        cfi_code="cfi_code_example",
                        security_exchange="security_exchange_example",
                        issuer="issuer_example",
                        security_description="security_description_example",
                        maturity_month_year="maturity_month_year_example",
                        maturity_day="maturity_day_example",
                        put_or_call="put",
                        underlying_security_type="underlying_security_type_example",
                    ),
                    side="buy",
                    order_type="market",
                    order_quantity=350.01,
                    price=800.01,
                    stop_price=800.01,
                    strike_price=400.01,
                    currency="USD",
                    is_covered=False,
                    max_show=100.01,
                    max_floor=100.01,
                    prev_close_price=100.01,
                    settlement_type="regular",
                    settlement_date="20210622",
                    handling_instructions="autoOrderPublic",
                    execution_instructions="notHeld",
                    locate_required=False,
                    effective_time="20210622-12:15:30",
                    account="Test.ACCT",
                    time_in_force=TimeInForce(
                        tif="day",
                        expire_date="20230823",
                        expire_time="20230823-12:20:25",
                    ),
                    inbound_destination="inbound_destination_example",
                    user_defined_fields={
                        "key": "key_example",
                    },
                ),
            ],
        ),
    ) # InboundOrdersRoot |  (optional)

    try:
        # Send inbound orders to Trading system for execution.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create(inbound_orders_root=inbound_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling InboundOrdersApi->create: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **inbound_orders_root** | [**InboundOrdersRoot**](InboundOrdersRoot.md)|  | [optional]

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **replace**
> InboundOrdersResponseRoot replace()

Replace the inbound orders on Trading system.

This endpoint takes the list of orders to be replaced on the Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import inbound_orders_api
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
    api_instance = inbound_orders_api.InboundOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    replace_inbound_orders_root = ReplaceInboundOrdersRoot(
        data=ReplaceInboundOrders(
            investor_id="DEMO-12345",
            inbound_orders=[
                ReplaceInboundOrder(
                    original_client_order_id="original_client_order_id_example",
                    inbound_order=InboundOrder(
                        client_order_id="12322123",
                        instrument=Instrument(
                            symbol="TATAMOTORS",
                            security_type="security_type_example",
                            cfi_code="cfi_code_example",
                            security_exchange="security_exchange_example",
                            issuer="issuer_example",
                            security_description="security_description_example",
                            maturity_month_year="maturity_month_year_example",
                            maturity_day="maturity_day_example",
                            put_or_call="put",
                            underlying_security_type="underlying_security_type_example",
                        ),
                        side="buy",
                        order_type="market",
                        order_quantity=350.01,
                        price=800.01,
                        stop_price=800.01,
                        strike_price=400.01,
                        currency="USD",
                        is_covered=False,
                        max_show=100.01,
                        max_floor=100.01,
                        prev_close_price=100.01,
                        settlement_type="regular",
                        settlement_date="20210622",
                        handling_instructions="autoOrderPublic",
                        execution_instructions="notHeld",
                        locate_required=False,
                        effective_time="20210622-12:15:30",
                        account="Test.ACCT",
                        time_in_force=TimeInForce(
                            tif="day",
                            expire_date="20230823",
                            expire_time="20230823-12:20:25",
                        ),
                        inbound_destination="inbound_destination_example",
                        user_defined_fields={
                            "key": "key_example",
                        },
                    ),
                ),
            ],
        ),
    ) # ReplaceInboundOrdersRoot |  (optional)

    try:
        # Replace the inbound orders on Trading system.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.replace(replace_inbound_orders_root=replace_inbound_orders_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling InboundOrdersApi->replace: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **replace_inbound_orders_root** | [**ReplaceInboundOrdersRoot**](ReplaceInboundOrdersRoot.md)|  | [optional]

### Return type

[**InboundOrdersResponseRoot**](InboundOrdersResponseRoot.md)

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
**403** | User is forbidden with current credentials. |  -  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  -  |
**429** | Rate limit reached. Wait before sending further requests. |  -  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  -  |
**503** | Request timed out. Retry the request in sometime. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

