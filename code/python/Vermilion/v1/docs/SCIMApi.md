# fds.sdk.Vermilion.SCIMApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**scim_v2_groups_get**](SCIMApi.md#scim_v2_groups_get) | **GET** /scim/v2/Groups/ | Retrieves a list of VRS role
[**scim_v2_groups_group_id_delete**](SCIMApi.md#scim_v2_groups_group_id_delete) | **DELETE** /scim/v2/Groups/{groupId} | Deletes a VRS role
[**scim_v2_groups_group_id_get**](SCIMApi.md#scim_v2_groups_group_id_get) | **GET** /scim/v2/Groups/{groupId} | Retrieves a VRS role
[**scim_v2_groups_group_id_patch**](SCIMApi.md#scim_v2_groups_group_id_patch) | **PATCH** /scim/v2/Groups/{groupId} | Add or remove a user to/from a group
[**scim_v2_groups_group_id_put**](SCIMApi.md#scim_v2_groups_group_id_put) | **PUT** /scim/v2/Groups/{groupId} | Updates a VRS Group
[**scim_v2_groups_post**](SCIMApi.md#scim_v2_groups_post) | **POST** /scim/v2/Groups/ | Creates a role
[**scim_v2_users_get**](SCIMApi.md#scim_v2_users_get) | **GET** /scim/v2/Users/ | Retrieves a list of VRS users
[**scim_v2_users_post**](SCIMApi.md#scim_v2_users_post) | **POST** /scim/v2/Users/ | Creates a user
[**scim_v2_users_user_id_delete**](SCIMApi.md#scim_v2_users_user_id_delete) | **DELETE** /scim/v2/Users/{userId} | Deletes a VRS user
[**scim_v2_users_user_id_get**](SCIMApi.md#scim_v2_users_user_id_get) | **GET** /scim/v2/Users/{userId} | Retrieves a VRS User
[**scim_v2_users_user_id_patch**](SCIMApi.md#scim_v2_users_user_id_patch) | **PATCH** /scim/v2/Users/{userId} | Add or remove VRS user attributes
[**scim_v2_users_user_id_put**](SCIMApi.md#scim_v2_users_user_id_put) | **PUT** /scim/v2/Users/{userId} | Updates a VRS user


# **scim_v2_groups_get**
> ScimGroupListResponse scim_v2_groups_get()

Retrieves a list of VRS role

Retrieves a VRS roles

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.scim_group_list_response import ScimGroupListResponse
from fds.sdk.Vermilion.model.inline_response4031 import InlineResponse4031
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
    api_instance = scim_api.SCIMApi(api_client)
    count = 25 # int | Non-negative maximum number of entries to return (optional)
    start_index = 1 # int | The 1-based index of the first query result (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieves a list of VRS role
        api_response = api_instance.scim_v2_groups_get(count=count, start_index=start_index)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **int**| Non-negative maximum number of entries to return | [optional]
 **start_index** | **int**| The 1-based index of the first query result | [optional]

### Return type

[**ScimGroupListResponse**](ScimGroupListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**403** | Forbidden, user does not have permission to view roles |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_groups_group_id_delete**
> scim_v2_groups_group_id_delete(group_id)

Deletes a VRS role

Deletes a VRS role

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4038 import InlineResponse4038
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
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
    api_instance = scim_api.SCIMApi(api_client)
    group_id = "groupId_example" # str | The ID of the group

    # example passing only required values which don't have defaults set
    try:
        # Deletes a VRS role
        api_instance.scim_v2_groups_group_id_delete(group_id)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_group_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The ID of the group |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**403** | Forbidden, user does not have permission to delete roles |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_groups_group_id_get**
> ScimGroup scim_v2_groups_group_id_get(group_id)

Retrieves a VRS role

Retrieves a VRS role based on the ID

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
from fds.sdk.Vermilion.model.inline_response4031 import InlineResponse4031
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
    api_instance = scim_api.SCIMApi(api_client)
    group_id = "groupId_example" # str | The ID of the role

    # example passing only required values which don't have defaults set
    try:
        # Retrieves a VRS role
        api_response = api_instance.scim_v2_groups_group_id_get(group_id)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_group_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The ID of the role |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to view roles |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_groups_group_id_patch**
> ScimGroup scim_v2_groups_group_id_patch(group_id, inline_object2)

Add or remove a user to/from a group

Adds or removes a VRS user to/from a VRS role

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.inline_object2 import InlineObject2
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
    api_instance = scim_api.SCIMApi(api_client)
    group_id = "groupId_example" # str | The ID of the role
    inline_object2 = InlineObject2(
        schemas="schemas_example",
        operations=[
            None,
        ],
    ) # InlineObject2 | 

    # example passing only required values which don't have defaults set
    try:
        # Add or remove a user to/from a group
        api_response = api_instance.scim_v2_groups_group_id_patch(group_id, inline_object2)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_group_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The ID of the role |
 **inline_object2** | [**InlineObject2**](InlineObject2.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | Successfully added user to group |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_groups_group_id_put**
> ScimGroup scim_v2_groups_group_id_put(group_id, scim_group)

Updates a VRS Group

Updates (replaces) a VRS Group with the properties in the JSON

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4037 import InlineResponse4037
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
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
    api_instance = scim_api.SCIMApi(api_client)
    group_id = "groupId_example" # str | The ID of the group
    scim_group = ScimGroup(None) # ScimGroup | 

    # example passing only required values which don't have defaults set
    try:
        # Updates a VRS Group
        api_response = api_instance.scim_v2_groups_group_id_put(group_id, scim_group)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_group_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The ID of the group |
 **scim_group** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated group |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to update groups |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_groups_post**
> ScimGroup scim_v2_groups_post(scim_group)

Creates a role

Creates a VRS role

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4036 import InlineResponse4036
from fds.sdk.Vermilion.model.scim_group import ScimGroup
from fds.sdk.Vermilion.model.inline_response4091 import InlineResponse4091
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
    api_instance = scim_api.SCIMApi(api_client)
    scim_group = ScimGroup(None) # ScimGroup | 

    # example passing only required values which don't have defaults set
    try:
        # Creates a role
        api_response = api_instance.scim_v2_groups_post(scim_group)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_groups_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **scim_group** | [**ScimGroup**](ScimGroup.md)|  |

### Return type

[**ScimGroup**](ScimGroup.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to create roles |  -  |
**409** | Group already exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_get**
> ScimUserListResponse scim_v2_users_get()

Retrieves a list of VRS users

Retrieves a VRS users

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.scim_user_list_response import ScimUserListResponse
from fds.sdk.Vermilion.model.inline_response4031 import InlineResponse4031
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
    api_instance = scim_api.SCIMApi(api_client)
    count = 25 # int | Non-negative maximum number of entries to return (optional)
    start_index = 1 # int | The 1-based index of the first query result (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieves a list of VRS users
        api_response = api_instance.scim_v2_users_get(count=count, start_index=start_index)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **count** | **int**| Non-negative maximum number of entries to return | [optional]
 **start_index** | **int**| The 1-based index of the first query result | [optional]

### Return type

[**ScimUserListResponse**](ScimUserListResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**403** | Forbidden, user does not have permission to view users |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_post**
> CreatedScimUserJSONResponse scim_v2_users_post(create_scim_user_json_request)

Creates a user

Creates a VRS user

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.created_scim_user_json_response import CreatedScimUserJSONResponse
from fds.sdk.Vermilion.model.inline_response4004 import InlineResponse4004
from fds.sdk.Vermilion.model.inline_response4032 import InlineResponse4032
from fds.sdk.Vermilion.model.inline_response409 import InlineResponse409
from fds.sdk.Vermilion.model.create_scim_user_json_request import CreateScimUserJSONRequest
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
    api_instance = scim_api.SCIMApi(api_client)
    create_scim_user_json_request = CreateScimUserJSONRequest(None) # CreateScimUserJSONRequest | 

    # example passing only required values which don't have defaults set
    try:
        # Creates a user
        api_response = api_instance.scim_v2_users_post(create_scim_user_json_request)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_scim_user_json_request** | [**CreateScimUserJSONRequest**](CreateScimUserJSONRequest.md)|  |

### Return type

[**CreatedScimUserJSONResponse**](CreatedScimUserJSONResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**400** | Bad Request, required values not provided in JSON request body (e.g. tenant, name or userName (loginID) |  -  |
**403** | Forbidden, user does not have permission to create users or it does not have requested tenancy assigned to it |  -  |
**409** | User already exists |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_user_id_delete**
> scim_v2_users_user_id_delete(user_id)

Deletes a VRS user

Deletes a VRS user (this marks them as 'Deleted' in the database)

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4035 import InlineResponse4035
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
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
    api_instance = scim_api.SCIMApi(api_client)
    user_id = "userId_example" # str | The ID of the user

    # example passing only required values which don't have defaults set
    try:
        # Deletes a VRS user
        api_instance.scim_v2_users_user_id_delete(user_id)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_user_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The ID of the user |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**204** | No Content |  -  |
**403** | Forbidden, user does not have permission to delete users |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_user_id_get**
> ScimUser scim_v2_users_user_id_get(user_id)

Retrieves a VRS User

Retrieves a VRS user based on their ID

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4033 import InlineResponse4033
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
from fds.sdk.Vermilion.model.scim_user import ScimUser
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
    api_instance = scim_api.SCIMApi(api_client)
    user_id = "userId_example" # str | The ID of the user

    # example passing only required values which don't have defaults set
    try:
        # Retrieves a VRS User
        api_response = api_instance.scim_v2_users_user_id_get(user_id)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_user_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The ID of the user |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to view users |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_user_id_patch**
> ScimUser scim_v2_users_user_id_patch(user_id, inline_object1)

Add or remove VRS user attributes

Adds or removes VRS user attributes based on the JSON properties

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_object1 import InlineObject1
from fds.sdk.Vermilion.model.inline_response4034 import InlineResponse4034
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
from fds.sdk.Vermilion.model.scim_user import ScimUser
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
    api_instance = scim_api.SCIMApi(api_client)
    user_id = "userId_example" # str | The ID of the user
    inline_object1 = InlineObject1(
        schemas="schemas_example",
        operations=[
            None,
        ],
    ) # InlineObject1 | 

    # example passing only required values which don't have defaults set
    try:
        # Add or remove VRS user attributes
        api_response = api_instance.scim_v2_users_user_id_patch(user_id, inline_object1)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_user_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The ID of the user |
 **inline_object1** | [**InlineObject1**](InlineObject1.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated user |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to update users |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **scim_v2_users_user_id_put**
> ScimUser scim_v2_users_user_id_put(user_id, scim_user)

Updates a VRS user

Updates (replaces) a VRS user with the properties in the JSON

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import scim_api
from fds.sdk.Vermilion.model.inline_response4034 import InlineResponse4034
from fds.sdk.Vermilion.model.inline_response4044 import InlineResponse4044
from fds.sdk.Vermilion.model.scim_user import ScimUser
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
    api_instance = scim_api.SCIMApi(api_client)
    user_id = "userId_example" # str | The ID of the user
    scim_user = ScimUser(None) # ScimUser | 

    # example passing only required values which don't have defaults set
    try:
        # Updates a VRS user
        api_response = api_instance.scim_v2_users_user_id_put(user_id, scim_user)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling SCIMApi->scim_v2_users_user_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_id** | **str**| The ID of the user |
 **scim_user** | [**ScimUser**](ScimUser.md)|  |

### Return type

[**ScimUser**](ScimUser.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successfully updated user |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
**403** | Forbidden, user does not have permission to update users |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

