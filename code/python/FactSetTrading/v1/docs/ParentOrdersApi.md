# fds.sdk.FactSetTrading.ParentOrdersApi

All URIs are relative to *https://api.factset.com/trading/ems/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**update_parent_order**](ParentOrdersApi.md#update_parent_order) | **PUT** /parent-orders/update | Update Parent Orders



# **update_parent_order**
> ParentOrdersUpdateResponseRoot update_parent_order()

Update Parent Orders

This endpoint allows the user to update parent orders which are already present in Trading system.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTrading
from fds.sdk.FactSetTrading.api import parent_orders_api
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
    api_instance = parent_orders_api.ParentOrdersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    parent_orders_update_root = ParentOrdersUpdateRoot(
        data=ParentOrdersUpdate(
            parent_orders=[
                ParentOrder(
                    parent_id=ParentId(
                        symbol="FDS-USA",
                        basket_id="FACTSET_OMS-100823_12345",
                    ),
                    user_group="user_group_example",
                    user_defined_fields={
                        "key": "key_example",
                    },
                ),
            ],
        ),
    ) # ParentOrdersUpdateRoot |  (optional)

    try:
        # Update Parent Orders
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.update_parent_order(parent_orders_update_root=parent_orders_update_root)

        pprint(api_response)

    except fds.sdk.FactSetTrading.ApiException as e:
        print("Exception when calling ParentOrdersApi->update_parent_order: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **parent_orders_update_root** | [**ParentOrdersUpdateRoot**](ParentOrdersUpdateRoot.md)|  | [optional]

### Return type

[**ParentOrdersUpdateResponseRoot**](ParentOrdersUpdateResponseRoot.md)

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

