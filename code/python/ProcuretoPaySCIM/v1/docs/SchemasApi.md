# fds.sdk.ProcuretoPaySCIM.SchemasApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**schemas_get**](SchemasApi.md#schemas_get) | **GET** /Schemas | Get a list of schemas.
[**schemas_id_get**](SchemasApi.md#schemas_id_get) | **GET** /Schemas/{id} | Get a schema.


# **schemas_get**
> SchemaList schemas_get()

Get a list of schemas.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPaySCIM
from fds.sdk.ProcuretoPaySCIM.api import schemas_api
from fds.sdk.ProcuretoPaySCIM.model.error import Error
from fds.sdk.ProcuretoPaySCIM.model.schema_list import SchemaList
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPaySCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPaySCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPaySCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = schemas_api.SchemasApi(api_client)

    start_index = 1 # int | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
    count = 1 # int | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)

    try:
        # Get a list of schemas.
        api_response = api_instance.schemas_get(start_index=start_index, count=count)
        pprint(api_response)

    except fds.sdk.ProcuretoPaySCIM.ApiException as e:
        print("Exception when calling SchemasApi->schemas_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_index** | **int**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **int**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]

### Return type

[**SchemaList**](SchemaList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **schemas_id_get**
> Schema schemas_id_get(id)

Get a schema.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPaySCIM
from fds.sdk.ProcuretoPaySCIM.api import schemas_api
from fds.sdk.ProcuretoPaySCIM.model.schema import Schema
from fds.sdk.ProcuretoPaySCIM.model.error import Error
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPaySCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPaySCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPaySCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = schemas_api.SchemasApi(api_client)

    id = "id_example" # str | ID of resource.

    try:
        # Get a schema.
        api_response = api_instance.schemas_id_get(id)
        pprint(api_response)

    except fds.sdk.ProcuretoPaySCIM.ApiException as e:
        print("Exception when calling SchemasApi->schemas_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

### Return type

[**Schema**](Schema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**401** | User has not been authenticated. |  -  |
**404** | Schema not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

