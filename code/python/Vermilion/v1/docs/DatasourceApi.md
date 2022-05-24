# fds.sdk.Vermilion.DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_tenant_data_sources_data_source_code_data_get**](DatasourceApi.md#v1_tenant_data_sources_data_source_code_data_get) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource
[**v1_tenant_data_sources_data_source_code_get**](DatasourceApi.md#v1_tenant_data_sources_data_source_code_get) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**v1_tenant_data_sources_get**](DatasourceApi.md#v1_tenant_data_sources_get) | **GET** /v1/{tenant}/data-sources | Lists all datasources


# **v1_tenant_data_sources_data_source_code_data_get**
> [DataSourceDataInstance] v1_tenant_data_sources_data_source_code_data_get(tenant, data_source_code)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the da

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.model.inline_response400 import InlineResponse400
from fds.sdk.Vermilion.model.data_source_data_instance import DataSourceDataInstance
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.inline_response404 import InlineResponse404
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = datasource_api.DatasourceApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    data_source_code = "dataSourceCode_example" # str | The code of the datasource
    entity_codes = "entityCodes_example" # str | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT&entityCodes=FUNDS (optional)
    entity_keys = "entityKeys_example" # str | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1&entityKeys=Test2 (optional)

    # example passing only required values which don't have defaults set
    try:
        # Gets the data for the datasource
        api_response = api_instance.v1_tenant_data_sources_data_source_code_data_get(tenant, data_source_code)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->v1_tenant_data_sources_data_source_code_data_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets the data for the datasource
        api_response = api_instance.v1_tenant_data_sources_data_source_code_data_get(tenant, data_source_code, entity_codes=entity_codes, entity_keys=entity_keys)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->v1_tenant_data_sources_data_source_code_data_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **data_source_code** | **str**| The code of the datasource |
 **entity_codes** | **str**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS | [optional]
 **entity_keys** | **str**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 | [optional]

### Return type

[**[DataSourceDataInstance]**](DataSourceDataInstance.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation - returns data for the datasource |  -  |
**400** | The supplied datasource code was either missing or invalid, or the query parameters are invalid |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view datasources in VRS |  -  |
**404** | The supplied datasource code was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_tenant_data_sources_data_source_code_get**
> DataSourceData v1_tenant_data_sources_data_source_code_get(tenant, data_source_code)

Gets a datasource

Gets a datasource based on the code passed

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.data_source_data import DataSourceData
from fds.sdk.Vermilion.model.inline_response404 import InlineResponse404
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = datasource_api.DatasourceApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    data_source_code = "dataSourceCode_example" # str | The code of the datasource

    # example passing only required values which don't have defaults set
    try:
        # Gets a datasource
        api_response = api_instance.v1_tenant_data_sources_data_source_code_get(tenant, data_source_code)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->v1_tenant_data_sources_data_source_code_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **data_source_code** | **str**| The code of the datasource |

### Return type

[**DataSourceData**](DataSourceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view datasources in VRS |  -  |
**404** | The supplied datasource code was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_tenant_data_sources_get**
> DataSourceList v1_tenant_data_sources_get(tenant)

Lists all datasources

List all datasources the user has permission to see

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.model.data_source_list import DataSourceList
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Vermilion.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Vermilion.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Vermilion.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = datasource_api.DatasourceApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    sort = "_sort=name" # str | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional)
    pagination_limit = 25 # int | Non-negative maximum number of entries to return. Default is 25 (optional)
    pagination_offset = 0 # int | Non-negative number of entries to skip. Default is 0 (optional)

    # example passing only required values which don't have defaults set
    try:
        # Lists all datasources
        api_response = api_instance.v1_tenant_data_sources_get(tenant)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->v1_tenant_data_sources_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Lists all datasources
        api_response = api_instance.v1_tenant_data_sources_get(tenant, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->v1_tenant_data_sources_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **sort** | **str**| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return. Default is 25 | [optional]
 **pagination_offset** | **int**| Non-negative number of entries to skip. Default is 0 | [optional]

### Return type

[**DataSourceList**](DataSourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view datasources in VRS |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

