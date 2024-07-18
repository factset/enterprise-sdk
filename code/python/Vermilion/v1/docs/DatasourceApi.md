# fds.sdk.Vermilion.DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_all_data_sources**](DatasourceApi.md#get_all_data_sources) | **GET** /v1/{tenant}/data-sources | Lists all datasources
[**get_data_source_by_code**](DatasourceApi.md#get_data_source_by_code) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**get_data_source_data**](DatasourceApi.md#get_data_source_data) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource



# **get_all_data_sources**
> DataSourceList get_all_data_sources(tenant)

Lists all datasources

List all datasources the user has permission to see

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.models import *
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    sort = ["name"] # [str] | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return. Default is 25 (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip. Default is 0 (optional) if omitted the server will use the default value of 0

    try:
        # Lists all datasources
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_all_data_sources(tenant, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->get_all_data_sources: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **sort** | **[str]**| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return. Default is 25 | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip. Default is 0 | [optional] if omitted the server will use the default value of 0

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

# **get_data_source_by_code**
> DataSourceData get_data_source_by_code(tenant, data_source_code)

Gets a datasource

Gets a datasource based on the code passed

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.models import *
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    data_source_code = "DSCODE" # str | The code of the datasource

    try:
        # Gets a datasource
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_data_source_by_code(tenant, data_source_code)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->get_data_source_by_code: %s\n" % e)
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

# **get_data_source_data**
> DataSourceDataInstance get_data_source_data(tenant, data_source_code)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import datasource_api
from fds.sdk.Vermilion.models import *
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    data_source_code = "DSCODE" # str | The code of the datasource
    entity_codes = "FUNDS" # str | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT&entityCodes=FUNDS (optional)
    entity_keys = "Test2" # str | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1&entityKeys=Test2 (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return. Default is 25 (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip. Default is 0 (optional) if omitted the server will use the default value of 0

    try:
        # Gets the data for the datasource
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_data_source_data(tenant, data_source_code, entity_codes=entity_codes, entity_keys=entity_keys, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling DatasourceApi->get_data_source_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **data_source_code** | **str**| The code of the datasource |
 **entity_codes** | **str**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS | [optional]
 **entity_keys** | **str**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return. Default is 25 | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip. Default is 0 | [optional] if omitted the server will use the default value of 0

### Return type

[**DataSourceDataInstance**](DataSourceDataInstance.md)

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

