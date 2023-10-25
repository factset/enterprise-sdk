# fds.sdk.ProcuretoPayAPISCIM.GroupsApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**group_id_get**](GroupsApi.md#group_id_get) | **GET** /Group/{id} | Get a group.
[**group_id_patch**](GroupsApi.md#group_id_patch) | **PATCH** /Group/{id} | Patch a group (add, replace, or remove attributes of a group.)
[**group_id_put**](GroupsApi.md#group_id_put) | **PUT** /Group/{id} | Replace a group.
[**groups_get**](GroupsApi.md#groups_get) | **GET** /Groups | Get a list of groups.



# **group_id_get**
> GroupResource group_id_get(id)

Get a group.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import groups_api
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
    api_instance = groups_api.GroupsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.

    try:
        # Get a group.
        # example passing only required values which don't have defaults set
        api_response = api_instance.group_id_get(id)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling GroupsApi->group_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |

### Return type

[**GroupResource**](GroupResource.md)

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
**404** | Group not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **group_id_patch**
> GroupResource group_id_patch(id)

Patch a group (add, replace, or remove attributes of a group.)

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import groups_api
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
    api_instance = groups_api.GroupsApi(api_client)

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
        # Patch a group (add, replace, or remove attributes of a group.)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.group_id_patch(id, patch=patch)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling GroupsApi->group_id_patch: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **patch** | [**Patch**](Patch.md)|  | [optional]

### Return type

[**GroupResource**](GroupResource.md)

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

# **group_id_put**
> GroupResource group_id_put(id, group_resource)

Replace a group.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import groups_api
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
    api_instance = groups_api.GroupsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | ID of resource.
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    group_resource = GroupResource(
        schemas=["urn:ietf:params:scim:schemas:core:2.0:Group","urn:scim:schemas:extension:FactSet:EnterpriseHosting:1.0:Group","urn:scim:schemas:extension:FactSet:VRS:1.0:Group"],
        external_id="B8FE8BBD-0E04-40B2-9BB3-E5EE17C4C9C9",
        display_name="Domain btud - Pod 04 - CitrixApps - Cymba OMS",
        description="Group representing access to the Cymba OMS application.",
        members=[
            GroupResourceMembers(
                value="FIN_WEALTH-123456",
                ref="https://api.factset.com/scim/v2/Users/FIN_WEALTH-123456",
                type="User",
            ),
        ],
        urnscimschemasextension_fact_set_vrs1_0_group=GroupResourceUrnScimSchemasExtensionFactSetVRS10Group(
            tenant="QA",
            domain_code="btud",
        ),
    ) # GroupResource | Group resource.

    try:
        # Replace a group.
        # example passing only required values which don't have defaults set
        api_response = api_instance.group_id_put(id, group_resource)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling GroupsApi->group_id_put: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of resource. |
 **group_resource** | [**GroupResource**](GroupResource.md)| Group resource. |

### Return type

[**GroupResource**](GroupResource.md)

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
**404** | Group not found. |  -  |
**500** | Internal server error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **groups_get**
> GroupResourceList groups_get()

Get a list of groups.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayAPISCIM
from fds.sdk.ProcuretoPayAPISCIM.api import groups_api
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
    api_instance = groups_api.GroupsApi(api_client)

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
        # Get a list of groups.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.groups_get(filter=filter, start_index=start_index, count=count, attributes=attributes, excluded_attributes=excluded_attributes)

        pprint(api_response)

    except fds.sdk.ProcuretoPayAPISCIM.ApiException as e:
        print("Exception when calling GroupsApi->groups_get: %s\n" % e)
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

[**GroupResourceList**](GroupResourceList.md)

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

