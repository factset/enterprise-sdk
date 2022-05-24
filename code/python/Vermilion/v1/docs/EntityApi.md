# fds.sdk.Vermilion.EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_tenant_entities_entity_code_values_get**](EntityApi.md#v1_tenant_entities_entity_code_values_get) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values


# **v1_tenant_entities_entity_code_values_get**
> EntityFieldValueDTO v1_tenant_entities_entity_code_values_get(tenant, entity_code)

Gets the entity values

Gets the entity values for the specified entity

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import entity_api
from fds.sdk.Vermilion.model.inline_response403 import InlineResponse403
from fds.sdk.Vermilion.model.inline_response4041 import InlineResponse4041
from fds.sdk.Vermilion.model.inline_response401 import InlineResponse401
from fds.sdk.Vermilion.model.inline_response406 import InlineResponse406
from fds.sdk.Vermilion.model.entity_field_value_dto import EntityFieldValueDTO
from fds.sdk.Vermilion.model.inline_response4001 import InlineResponse4001
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
    api_instance = entity_api.EntityApi(api_client)
    tenant = "tenant_example" # str | The code of the tenancy
    entity_code = "entityCode_example" # str | The code of the entity
    sort = "_sort=entity key field" # str | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional)
    pagination_limit = 25 # int | Non-negative maximum number of entries to return. Default is 25 (optional)
    pagination_offset = 0 # int | Non-negative number of entries to skip. Default is 0 (optional)

    # example passing only required values which don't have defaults set
    try:
        # Gets the entity values
        api_response = api_instance.v1_tenant_entities_entity_code_values_get(tenant, entity_code)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling EntityApi->v1_tenant_entities_entity_code_values_get: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Gets the entity values
        api_response = api_instance.v1_tenant_entities_entity_code_values_get(tenant, entity_code, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset)
        pprint(api_response)
    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling EntityApi->v1_tenant_entities_entity_code_values_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **entity_code** | **str**| The code of the entity |
 **sort** | **str**| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return. Default is 25 | [optional]
 **pagination_offset** | **int**| Non-negative number of entries to skip. Default is 0 | [optional]

### Return type

[**EntityFieldValueDTO**](EntityFieldValueDTO.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful operation |  -  |
**400** | The supplied entity code was either missing or invalid, or the entity was not found |  -  |
**401** | Unauthorised |  -  |
**403** | No permissions to view datasources in VRS |  -  |
**404** | The supplied entity code was not found |  -  |
**406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

