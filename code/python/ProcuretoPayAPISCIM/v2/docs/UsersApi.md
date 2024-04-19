# fds.sdk.ProcuretoPayAPISCIM.UsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**users_get**](UsersApi.md#users_get) | **GET** /Users | Get a list of users.
[**users_id_delete**](UsersApi.md#users_id_delete) | **DELETE** /Users/{id} | Delete a user
[**users_id_get**](UsersApi.md#users_id_get) | **GET** /Users/{id} | Get a user.
[**users_id_patch**](UsersApi.md#users_id_patch) | **PATCH** /Users/{id} | Patch a user (add, replace, or remove attributes of a user.)
[**users_id_put**](UsersApi.md#users_id_put) | **PUT** /Users/{id} | Replace a user.
[**users_post**](UsersApi.md#users_post) | **POST** /Users | Create a user.



# **users_get**
> UserResourceList users_get()

Get a list of users.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    filter = "filter_example" # str | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_index = 1 # int | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    count = 1 # int | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    attributes = "attributes_example" # str | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    excluded_attributes = "excludedAttributes_example" # str | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)

    try:
        # Get a list of users.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.users_get(filter=filter, start_index=start_index, count=count, attributes=attributes, excluded_attributes=excluded_attributes)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **filter** | **str**| Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \&quot;re\&quot; operator for regular expression matching against strings. | [optional]
 **start_index** | **int**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **int**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]
 **attributes** | **str**| Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. | [optional]
 **excluded_attributes** | **str**| Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. | [optional]

### Return type

[**UserResourceList**](UserResourceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Invalid filter value provided. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_id_delete**
> users_id_delete(id)

Delete a user

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.

    try:
        # Delete a user
        # example passing only required values which don't have defaults set
        api_instance.users_id_delete(id)


    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_id_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

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
**204** | User successfully deleted. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**404** | User not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_id_get**
> UserResource users_id_get(id)

Get a user.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.

    try:
        # Get a user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.users_id_get(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

### Return type

[**UserResource**](UserResource.md)

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
**404** | User not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_id_patch**
> UserResource users_id_patch(id)

Patch a user (add, replace, or remove attributes of a user.)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    patch = Patch(
        schemas=[
            "schemas_example",
        ],
        operations=[
            PatchOperations(
                op="op_example",
                path="path_example",
                value="value_example",
            ),
        ],
    ) # Patch |  (optional)

    try:
        # Patch a user (add, replace, or remove attributes of a user.)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.users_id_patch(id, patch=patch)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **patch** | [**Patch**](Patch.md)|  | [optional]

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Patch request invalid. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_id_put**
> UserResource users_id_put(id, user_resource)

Replace a user.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    user_resource = UserResource(
        schemas=["urn:ietf:params:scim:schemas:core:2.0:User","urn:scim:schemas:extension:FactSet:Core:1.0:User","urn:scim:schemas:extension:FactSet:VRS:1.0:User"],
        external_id="C3574707-FFF9-433C-A17F-DFF806C72A7F",
        name=UserResourceName(
            family_name="Doe",
            given_name="John",
        ),
        email="jdoe@factset.com",
        urnscimschemasextension_fact_set_core1_0_user=UserResourceUrnScimSchemasExtensionFactSetCore10User(
            username="FIN_WEALTH",
            location=LocationResourceReference(
                value="1598276",
                ref="https://api.factset.com/scim/v2/Locations/1598276",
                display="FIN Wealth Management",
            ),
            user_taxonomy_data=UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData(
                user_class=UserClassResourceReference(
                    value="20",
                    ref="https://api.factset.com/scim/v2/UserClasses/20",
                    display="Application Developer",
                ),
                user_position=UserPositionResourceReference(
                    value="46",
                    ref="https://api.factset.com/scim/v2/UserPositions/46",
                    display="Application Developer",
                ),
            ),
            role_name="Wealth Manager",
            royalty_class="royalty_class_example",
            products=[
                ProductResourceReference(
                    value="6781",
                    ref="https://api.factset.com/scim/v2/Products/6781",
                    display="FactSet Identity",
                ),
            ],
            assertion_value="exampleAssertionValue",
        ),
        urnscimschemasextension_fact_set_vrs1_0_user=UserResourceUrnScimSchemasExtensionFactSetVRS10User(
            domain_data=[
                UserResourceUrnScimSchemasExtensionFactSetVRS10UserDomainData(
                    domain_code="btud",
                    tenancies=UserResourceUrnScimSchemasExtensionFactSetVRS10UserTenancies(
                        value="MASTER",
                    ),
                    is_administrator=False,
                    password="password_example",
                ),
            ],
        ),
    ) # UserResource | User resource.

    try:
        # Replace a user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.users_id_put(id, user_resource)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **user_resource** | [**UserResource**](UserResource.md)| User resource. |

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success. |  -  |
**400** | Provided resource contains invalid data. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**404** | User not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **users_post**
> UserResource users_post(user_resource)

Create a user.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayAPISCIM.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayAPISCIM.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = users_api.UsersApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    user_resource = UserResource(
        schemas=["urn:ietf:params:scim:schemas:core:2.0:User","urn:scim:schemas:extension:FactSet:Core:1.0:User","urn:scim:schemas:extension:FactSet:VRS:1.0:User"],
        external_id="C3574707-FFF9-433C-A17F-DFF806C72A7F",
        name=UserResourceName(
            family_name="Doe",
            given_name="John",
        ),
        email="jdoe@factset.com",
        urnscimschemasextension_fact_set_core1_0_user=UserResourceUrnScimSchemasExtensionFactSetCore10User(
            username="FIN_WEALTH",
            location=LocationResourceReference(
                value="1598276",
                ref="https://api.factset.com/scim/v2/Locations/1598276",
                display="FIN Wealth Management",
            ),
            user_taxonomy_data=UserResourceUrnScimSchemasExtensionFactSetCore10UserUserTaxonomyData(
                user_class=UserClassResourceReference(
                    value="20",
                    ref="https://api.factset.com/scim/v2/UserClasses/20",
                    display="Application Developer",
                ),
                user_position=UserPositionResourceReference(
                    value="46",
                    ref="https://api.factset.com/scim/v2/UserPositions/46",
                    display="Application Developer",
                ),
            ),
            role_name="Wealth Manager",
            royalty_class="royalty_class_example",
            products=[
                ProductResourceReference(
                    value="6781",
                    ref="https://api.factset.com/scim/v2/Products/6781",
                    display="FactSet Identity",
                ),
            ],
            assertion_value="exampleAssertionValue",
        ),
        urnscimschemasextension_fact_set_vrs1_0_user=UserResourceUrnScimSchemasExtensionFactSetVRS10User(
            domain_data=[
                UserResourceUrnScimSchemasExtensionFactSetVRS10UserDomainData(
                    domain_code="btud",
                    tenancies=UserResourceUrnScimSchemasExtensionFactSetVRS10UserTenancies(
                        value="MASTER",
                    ),
                    is_administrator=False,
                    password="password_example",
                ),
            ],
        ),
    ) # UserResource | User resource.

    try:
        # Create a user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.users_post(user_resource)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling UsersApi->users_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **user_resource** | [**UserResource**](UserResource.md)| User resource. |

### Return type

[**UserResource**](UserResource.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/scim+json
 - **Accept**: application/scim+json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Success. |  -  |
**400** | Provided resource contains invalid data. |  -  |
**401** | User has not been authenticated. |  -  |
**403** | User is not authorized to use this API. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

