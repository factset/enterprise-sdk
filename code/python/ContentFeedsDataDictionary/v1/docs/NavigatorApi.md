# fds.sdk.ContentFeedsDataDictionary.NavigatorApi

All URIs are relative to *https://api.factset.com/data-dictionary*

Method | HTTP request | Description
------------- | ------------- | -------------
[**navigator_basic_search_post**](NavigatorApi.md#navigator_basic_search_post) | **POST** /navigator/basic_search | Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
[**navigator_data_items_product_id_get**](NavigatorApi.md#navigator_data_items_product_id_get) | **GET** /navigator/data_items/{Product_id} | Get the list of data items associated with a product for Navigator.
[**navigator_products_get**](NavigatorApi.md#navigator_products_get) | **GET** /navigator/products | Get the list of products for Navigator.
[**navigator_sources_data_item_id_get**](NavigatorApi.md#navigator_sources_data_item_id_get) | **GET** /navigator/sources/{DataItem_id} | Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
[**navigator_sources_get**](NavigatorApi.md#navigator_sources_get) | **GET** /navigator/sources | Get a list of sources by delivery method for the given product_id
[**navigator_table_fields_table_id_get**](NavigatorApi.md#navigator_table_fields_table_id_get) | **GET** /navigator/table_fields/{Table_id} | Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.



# **navigator_basic_search_post**
> BasicSearchResponse navigator_basic_search_post(basic_search_request)

Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    basic_search_request = BasicSearchRequest(None) # BasicSearchRequest | A list of search terms (each term must be at least two characters).

    try:
        # Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
        # example passing only required values which don't have defaults set
        api_response = api_instance.navigator_basic_search_post(basic_search_request)

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_basic_search_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **basic_search_request** | [**BasicSearchRequest**](BasicSearchRequest.md)| A list of search terms (each term must be at least two characters). |

### Return type

[**BasicSearchResponse**](BasicSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**400** | The request body was not formatted properly. |  -  |
**401** | You are not authorized to view this page. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **navigator_data_items_product_id_get**
> [DataItem] navigator_data_items_product_id_get(product_id)

Get the list of data items associated with a product for Navigator.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    product_id = "Product_id_example" # str | The id for the Product to fetch the list of data items for.

    try:
        # Get the list of data items associated with a product for Navigator.
        # example passing only required values which don't have defaults set
        api_response = api_instance.navigator_data_items_product_id_get(product_id)

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_data_items_product_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| The id for the Product to fetch the list of data items for. |

### Return type

[**[DataItem]**](DataItem.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**401** | You are not authorized to view this page. |  -  |
**404** | The specified Product_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **navigator_products_get**
> [Product] navigator_products_get()

Get the list of products for Navigator.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)


    try:
        # Get the list of products for Navigator.
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.navigator_products_get()

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_products_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**[Product]**](Product.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**401** | You are not authorized to view this page. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **navigator_sources_data_item_id_get**
> NavigatorSourcesResponse navigator_sources_data_item_id_get(data_item_id, product_id)

Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    data_item_id = "DataItem_id_example" # str | The id for the DataItem to fetch the sources for.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    product_id = "Product_id_example" # str | The id for the Product to filter down the sources returned on.

    try:
        # Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
        # example passing only required values which don't have defaults set
        api_response = api_instance.navigator_sources_data_item_id_get(data_item_id, product_id)

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_sources_data_item_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **data_item_id** | **str**| The id for the DataItem to fetch the sources for. |
 **product_id** | **str**| The id for the Product to filter down the sources returned on. |

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**401** | You are not authorized to view this page. |  -  |
**404** | The specified DataItem_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **navigator_sources_get**
> NavigatorSourcesResponse navigator_sources_get(product_id)

Get a list of sources by delivery method for the given product_id

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    product_id = "Product_id_example" # str | The id for the Product to filter down the sources returned on.

    try:
        # Get a list of sources by delivery method for the given product_id
        # example passing only required values which don't have defaults set
        api_response = api_instance.navigator_sources_get(product_id)

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_sources_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product_id** | **str**| The id for the Product to filter down the sources returned on. |

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**401** | You are not authorized to view this page. |  -  |
**404** | The specified DataItem_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **navigator_table_fields_table_id_get**
> TableCodeFieldInfoResponse navigator_table_fields_table_id_get(table_id)

Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ContentFeedsDataDictionary
from fds.sdk.ContentFeedsDataDictionary.api import navigator_api
from fds.sdk.ContentFeedsDataDictionary.models import *
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
configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ContentFeedsDataDictionary.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ContentFeedsDataDictionary.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = navigator_api.NavigatorApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    table_id = "Table_id_example" # str | The id for the Table to fetch the fields for.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    data_item_id = "DataItem_id_example" # str | The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. (optional)

    try:
        # Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.navigator_table_fields_table_id_get(table_id, data_item_id=data_item_id)

        pprint(api_response)

    except fds.sdk.ContentFeedsDataDictionary.ApiException as e:
        print("Exception when calling NavigatorApi->navigator_table_fields_table_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **table_id** | **str**| The id for the Table to fetch the fields for. |
 **data_item_id** | **str**| The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. | [optional]

### Return type

[**TableCodeFieldInfoResponse**](TableCodeFieldInfoResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation. |  -  |
**401** | You are not authorized to view this page. |  -  |
**404** | The specified Table_id was not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

