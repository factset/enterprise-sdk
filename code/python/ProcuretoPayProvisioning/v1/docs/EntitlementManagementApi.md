# fds.sdk.ProcuretoPayProvisioning.EntitlementManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**add_products_post**](EntitlementManagementApi.md#add_products_post) | **POST** /addProducts | Adds listed productIds to an individual
[**remove_products_post**](EntitlementManagementApi.md#remove_products_post) | **POST** /removeProducts | Removes listed productIds from an individual


# **add_products_post**
> InlineResponse202 add_products_post()

Adds listed productIds to an individual

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import entitlement_management_api
from fds.sdk.ProcuretoPayProvisioning.model.manage_product_ids import ManageProductIds
from fds.sdk.ProcuretoPayProvisioning.model.inline_response202 import InlineResponse202
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entitlement_management_api.EntitlementManagementApi(api_client)
    manage_product_ids = ManageProductIds(
        unique_id="unique_id_example",
        product_ids=[
            "product_ids_example",
        ],
    ) # ManageProductIds |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Adds listed productIds to an individual
        api_response = api_instance.add_products_post(manage_product_ids=manage_product_ids)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling EntitlementManagementApi->add_products_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manage_product_ids** | [**ManageProductIds**](ManageProductIds.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **remove_products_post**
> InlineResponse202 remove_products_post()

Removes listed productIds from an individual

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import entitlement_management_api
from fds.sdk.ProcuretoPayProvisioning.model.manage_product_ids import ManageProductIds
from fds.sdk.ProcuretoPayProvisioning.model.inline_response202 import InlineResponse202
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entitlement_management_api.EntitlementManagementApi(api_client)
    manage_product_ids = ManageProductIds(
        unique_id="unique_id_example",
        product_ids=[
            "product_ids_example",
        ],
    ) # ManageProductIds |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Removes listed productIds from an individual
        api_response = api_instance.remove_products_post(manage_product_ids=manage_product_ids)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling EntitlementManagementApi->remove_products_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **manage_product_ids** | [**ManageProductIds**](ManageProductIds.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

