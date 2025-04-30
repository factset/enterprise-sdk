# fds.sdk.OpenFactSetMarketplace.ProductsApi

All URIs are relative to *https://api.factset.com/ofs/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_product_by_id**](ProductsApi.md#get_product_by_id) | **GET** /product/{id} | 
[**get_products**](ProductsApi.md#get_products) | **GET** /products | 



# **get_product_by_id**
> ProductSuccessResponse get_product_by_id(id)



Get a single Open:FactSet Marketplace Catalog product by ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetMarketplace
from fds.sdk.OpenFactSetMarketplace.api import products_api
from fds.sdk.OpenFactSetMarketplace.models import *
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
configuration = fds.sdk.OpenFactSetMarketplace.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetMarketplace.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetMarketplace.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = products_api.ProductsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of the product or partner

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_product_by_id(id)

        pprint(api_response)

    except fds.sdk.OpenFactSetMarketplace.ApiException as e:
        print("Exception when calling ProductsApi->get_product_by_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of the product or partner |

### Return type

[**ProductSuccessResponse**](ProductSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Get a single Open:FactSet Marketplace Catalog product by ID. |  -  |
**401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
**403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
**404** | Product not found |  -  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_products**
> ProductsSuccessResponse get_products()



Get all products published on the Open:FactSet Marketplace Catalog.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OpenFactSetMarketplace
from fds.sdk.OpenFactSetMarketplace.api import products_api
from fds.sdk.OpenFactSetMarketplace.models import *
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
configuration = fds.sdk.OpenFactSetMarketplace.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OpenFactSetMarketplace.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OpenFactSetMarketplace.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = products_api.ProductsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    pagination_limit = 10 # int | Limit for number of records returned per page (optional) if omitted the server will use the default value of 10
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional) if omitted the server will use the default value of 0

    try:
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_products(pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.OpenFactSetMarketplace.ApiException as e:
        print("Exception when calling ProductsApi->get_products: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **pagination_limit** | **int**| Limit for number of records returned per page | [optional] if omitted the server will use the default value of 10
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] if omitted the server will use the default value of 0

### Return type

[**ProductsSuccessResponse**](ProductsSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response to get all products published on the Open:FactSet Marketplace Catalog. |  -  |
**401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
**403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

