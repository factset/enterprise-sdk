# fds.sdk.Vermilion.EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_values_by_code**](EntityApi.md#get_entity_values_by_code) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



# **get_entity_values_by_code**
> EntityFieldValueDTO get_entity_values_by_code(tenant, entity_code)

Gets the entity values

Gets the entity values for the specified entity

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Vermilion
from fds.sdk.Vermilion.api import entity_api
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
    api_instance = entity_api.EntityApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    tenant = "TENANT" # str | The code of the tenancy
    entity_code = "ENTCODE" # str | The code of the entity
    sort = ["entity key field"] # [str] | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default (optional)
    pagination_limit = 10 # int | Non-negative maximum number of entries to return. Default is 25 (optional) if omitted the server will use the default value of 25
    pagination_offset = 0 # int | Non-negative number of entries to skip. Default is 0 (optional) if omitted the server will use the default value of 0
    show_all = 1 # int | Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too. (optional) if omitted the server will use the default value of 0

    try:
        # Gets the entity values
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_entity_values_by_code(tenant, entity_code, sort=sort, pagination_limit=pagination_limit, pagination_offset=pagination_offset, show_all=show_all)

        pprint(api_response)

    except fds.sdk.Vermilion.ApiException as e:
        print("Exception when calling EntityApi->get_entity_values_by_code: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tenant** | **str**| The code of the tenancy |
 **entity_code** | **str**| The code of the entity |
 **sort** | **[str]**| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional]
 **pagination_limit** | **int**| Non-negative maximum number of entries to return. Default is 25 | [optional] if omitted the server will use the default value of 25
 **pagination_offset** | **int**| Non-negative number of entries to skip. Default is 0 | [optional] if omitted the server will use the default value of 0
 **show_all** | **int**| Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \&quot;fieldsWithValues\&quot;, with each array value being a string in the format of \&quot;**&lt;FIELD_NAME&gt; : &lt;FIELD_VALUE&gt;**\&quot;. Both key and description field values will be included in this JSON array too. | [optional] if omitted the server will use the default value of 0

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

