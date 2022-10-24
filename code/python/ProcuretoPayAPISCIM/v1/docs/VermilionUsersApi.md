# fds.sdk.ProcuretoPayAPISCIM.VermilionUsersApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**vermilion_users_get**](VermilionUsersApi.md#vermilion_users_get) | **GET** /VermilionUsers | Get a list of Vermilion users.
[**vermilion_users_id_delete**](VermilionUsersApi.md#vermilion_users_id_delete) | **DELETE** /VermilionUsers/{id} | Delete a Vermilion user.
[**vermilion_users_id_get**](VermilionUsersApi.md#vermilion_users_id_get) | **GET** /VermilionUsers/{id} | Get a Vermilion user.
[**vermilion_users_id_patch**](VermilionUsersApi.md#vermilion_users_id_patch) | **PATCH** /VermilionUsers/{id} | Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)
[**vermilion_users_id_put**](VermilionUsersApi.md#vermilion_users_id_put) | **PUT** /VermilionUsers/{id} | Replace a Vermilion user.
[**vermilion_users_post**](VermilionUsersApi.md#vermilion_users_post) | **POST** /VermilionUsers | Create a Vermilion user.


# **vermilion_users_get**
> VermilionUserResource vermilion_users_get()

Get a list of Vermilion users.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    filter = "filter_example" # str | Resource filter string. See [RFC 7644 section 3.4.2.2](https://tools.ietf.org/html/rfc7644#section-3.4.2.2) for syntax. Note this API implementation also supports a non-standard \"re\" operator for regular expression matching against strings. (optional)
    start_index = 1 # int | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. (optional)
    count = 1 # int | Maximum resource count. The server will not return more resources than this value, although it may return fewer. (optional)
    attributes = "attributes_example" # str | Attribute whitelist filter string. A comma-separated list of resource attribute names to be returned in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *excludedAttributes* parameter. (optional)
    excluded_attributes = "excludedAttributes_example" # str | Attribute blacklist filter string. A comma-separated list of resource attribute names to be excluded in the response, overriding the set of attributes that would be returned by default. Attribute names must be specified in standard attribute notation (see [RFC 7644 section 3.10](https://datatracker.ietf.org/doc/html/rfc7644#section-3.10).) This parameter cannot be used with the *attributes* parameter. (optional)

    try:
        # Get a list of Vermilion users.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.vermilion_users_get(filter=filter, start_index=start_index, count=count, attributes=attributes, excluded_attributes=excluded_attributes)
        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_get: %s\n" % e)
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

[**VermilionUserResource**](VermilionUserResource.md)

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

# **vermilion_users_id_delete**
> vermilion_users_id_delete(id)

Delete a Vermilion user.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    id = "id_example" # str | ID of resource.

    try:
        # Delete a Vermilion user.
        # example passing only required values which don't have defaults set
        api_instance.vermilion_users_id_delete(id)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_id_delete: %s\n" % e)
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
**404** | Vermilion user not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **vermilion_users_id_get**
> VermilionUserResource vermilion_users_id_get(id)

Get a Vermilion user.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    id = "id_example" # str | ID of resource.

    try:
        # Get a Vermilion user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.vermilion_users_id_get(id)
        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

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

# **vermilion_users_id_patch**
> VermilionUserResource vermilion_users_id_patch(id)

Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    id = "id_example" # str | ID of resource.
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
        # Patch a Vermilion user (add, replace, or remove attributes of a Vermilion user.)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.vermilion_users_id_patch(id, patch=patch)
        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **patch** | [**Patch**](Patch.md)|  | [optional]

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

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

# **vermilion_users_id_put**
> VermilionUserResource vermilion_users_id_put(id, vermilion_user_resource)

Replace a Vermilion user.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    id = "id_example" # str | ID of resource.
    vermilion_user_resource = VermilionUserResource(
        schemas=["urn:scim:schemas:extension:FactSet:VRS:1.0:User"],
        name=VermilionUserResourceName(
            formatted="John Doe",
            family_name="Doe",
            given_name="John",
        ),
        display_name="John Doe",
        profile_url="http://example.com/profiles/john.doe",
        user_type="0",
        preferred_language="en_US",
        active=False,
        password="hunter2",
        authenticated_user_name="john.doe",
        tenant="MASTER",
        tenancies=[
            "MASTER",
        ],
        emails=[
            VermilionUserResourceEmails(
                value="john.doe@example.com",
                display="john.doe@example.com",
                type="work",
                primary=True,
            ),
        ],
        phone_numbers=[
            VermilionUserResourcePhoneNumbers(
                value="tel:5558675309",
                display="(555) 867-5309",
                type="work",
                primary=True,
            ),
        ],
        photos=[
            VermilionUserResourcePhotos(
                value="http://example.com/profiles/john.doe",
                display="display_example",
                type="photo",
                primary=False,
            ),
        ],
        groups=[
            VermilionUserResourceGroups(
                value="vrsqa-jrs-01:431",
                ref="https://api.factset.com/scim/v2/VermilionGroups/vrsqa-jrs-01%3A431",
                display="System Admin",
                type="direct",
            ),
        ],
        entitlements=[
            VermilionUserResourceEntitlements(
                value="value_example",
                display="display_example",
                type="type_example",
                primary=True,
            ),
        ],
        roles=[
            VermilionUserResourceRoles(
                value="value_example",
                display="display_example",
                type="type_example",
                primary=True,
            ),
        ],
        domain_code="domain_code_example",
        is_administrator=True,
    ) # VermilionUserResource | Vermilion user resource.

    try:
        # Replace a Vermilion user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.vermilion_users_id_put(id, vermilion_user_resource)
        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **vermilion_user_resource** | [**VermilionUserResource**](VermilionUserResource.md)| Vermilion user resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

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

# **vermilion_users_post**
> VermilionUserResource vermilion_users_post(vermilion_user_resource)

Create a Vermilion user.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import vermilion_users_api
from fds.sdk.ProcuretoPayAPISCIM.models import *
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
    api_instance = vermilion_users_api.VermilionUsersApi(api_client)

    vermilion_user_resource = VermilionUserResource(
        schemas=["urn:scim:schemas:extension:FactSet:VRS:1.0:User"],
        name=VermilionUserResourceName(
            formatted="John Doe",
            family_name="Doe",
            given_name="John",
        ),
        display_name="John Doe",
        profile_url="http://example.com/profiles/john.doe",
        user_type="0",
        preferred_language="en_US",
        active=False,
        password="hunter2",
        authenticated_user_name="john.doe",
        tenant="MASTER",
        tenancies=[
            "MASTER",
        ],
        emails=[
            VermilionUserResourceEmails(
                value="john.doe@example.com",
                display="john.doe@example.com",
                type="work",
                primary=True,
            ),
        ],
        phone_numbers=[
            VermilionUserResourcePhoneNumbers(
                value="tel:5558675309",
                display="(555) 867-5309",
                type="work",
                primary=True,
            ),
        ],
        photos=[
            VermilionUserResourcePhotos(
                value="http://example.com/profiles/john.doe",
                display="display_example",
                type="photo",
                primary=False,
            ),
        ],
        groups=[
            VermilionUserResourceGroups(
                value="vrsqa-jrs-01:431",
                ref="https://api.factset.com/scim/v2/VermilionGroups/vrsqa-jrs-01%3A431",
                display="System Admin",
                type="direct",
            ),
        ],
        entitlements=[
            VermilionUserResourceEntitlements(
                value="value_example",
                display="display_example",
                type="type_example",
                primary=True,
            ),
        ],
        roles=[
            VermilionUserResourceRoles(
                value="value_example",
                display="display_example",
                type="type_example",
                primary=True,
            ),
        ],
        domain_code="domain_code_example",
        is_administrator=True,
    ) # VermilionUserResource | Vermilion user resource.

    try:
        # Create a Vermilion user.
        # example passing only required values which don't have defaults set
        api_response = api_instance.vermilion_users_post(vermilion_user_resource)
        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling VermilionUsersApi->vermilion_users_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **vermilion_user_resource** | [**VermilionUserResource**](VermilionUserResource.md)| Vermilion user resource. |

### Return type

[**VermilionUserResource**](VermilionUserResource.md)

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

