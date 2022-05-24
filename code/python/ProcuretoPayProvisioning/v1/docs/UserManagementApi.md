# fds.sdk.ProcuretoPayProvisioning.UserManagementApi

All URIs are relative to *https://api.factset.com/procuretopay/provisioning*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancel_individual_post**](UserManagementApi.md#cancel_individual_post) | **POST** /cancelIndividual | Cancels an individual&#39;s serial and all productIds
[**create_individual_post**](UserManagementApi.md#create_individual_post) | **POST** /createIndividual | Provisions an individual for FactSet
[**get_individual_get**](UserManagementApi.md#get_individual_get) | **GET** /getIndividual | Returns an individual&#39;s details by uniqueId
[**list_individuals_get**](UserManagementApi.md#list_individuals_get) | **GET** /listIndividuals | Lists all individuals with details at all locations.
[**modify_individual_post**](UserManagementApi.md#modify_individual_post) | **POST** /modifyIndividual | Modifies an individual&#39;s attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.


# **cancel_individual_post**
> InlineResponse202 cancel_individual_post()

Cancels an individual's serial and all productIds

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import user_management_api
from fds.sdk.ProcuretoPayProvisioning.model.cancel_individual import CancelIndividual
from fds.sdk.ProcuretoPayProvisioning.model.inline_response202 import InlineResponse202
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_management_api.UserManagementApi(api_client)
    cancel_individual = CancelIndividual(
        unique_id="unique_id_example",
    ) # CancelIndividual |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Cancels an individual's serial and all productIds
        api_response = api_instance.cancel_individual_post(cancel_individual=cancel_individual)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling UserManagementApi->cancel_individual_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **cancel_individual** | [**CancelIndividual**](CancelIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_individual_post**
> InlineResponse202 create_individual_post()

Provisions an individual for FactSet

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import user_management_api
from fds.sdk.ProcuretoPayProvisioning.model.inline_response202 import InlineResponse202
from fds.sdk.ProcuretoPayProvisioning.model.create_individual import CreateIndividual
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_management_api.UserManagementApi(api_client)
    create_individual = CreateIndividual(
        first_name="first_name_example",
        last_name="last_name_example",
        unique_id="unique_id_example",
        role_id="role_id_example",
        email="email_example",
        assertion_field="assertion_field_example",
        location_id="location_id_example",
    ) # CreateIndividual |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Provisions an individual for FactSet
        api_response = api_instance.create_individual_post(create_individual=create_individual)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling UserManagementApi->create_individual_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_individual** | [**CreateIndividual**](CreateIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_individual_get**
> GetIndividual get_individual_get(uniqueid)

Returns an individual's details by uniqueId

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import user_management_api
from fds.sdk.ProcuretoPayProvisioning.model.get_individual import GetIndividual
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_management_api.UserManagementApi(api_client)
    uniqueid = "jdoe113901" # str | uniqueId to query

    # example passing only required values which don't have defaults set
    try:
        # Returns an individual's details by uniqueId
        api_response = api_instance.get_individual_get(uniqueid)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling UserManagementApi->get_individual_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uniqueid** | **str**| uniqueId to query |

### Return type

[**GetIndividual**](GetIndividual.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **list_individuals_get**
> ListIndividuals list_individuals_get()

Lists all individuals with details at all locations.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import user_management_api
from fds.sdk.ProcuretoPayProvisioning.model.list_individuals import ListIndividuals
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_management_api.UserManagementApi(api_client)
    include_product_ids = True # bool | <br>Optional, if =TRUE will return additional product array per object with all productIds for all returned individuals.</br> (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Lists all individuals with details at all locations.
        api_response = api_instance.list_individuals_get(include_product_ids=include_product_ids)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling UserManagementApi->list_individuals_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **include_product_ids** | **bool**| &lt;br&gt;Optional, if &#x3D;TRUE will return additional product array per object with all productIds for all returned individuals.&lt;/br&gt; | [optional]

### Return type

[**ListIndividuals**](ListIndividuals.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **modify_individual_post**
> InlineResponse202 modify_individual_post()

Modifies an individual's attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ProcuretoPayProvisioning
from fds.sdk.ProcuretoPayProvisioning.api import user_management_api
from fds.sdk.ProcuretoPayProvisioning.model.inline_response202 import InlineResponse202
from fds.sdk.ProcuretoPayProvisioning.model.modify_individual import ModifyIndividual
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ProcuretoPayProvisioning.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ProcuretoPayProvisioning.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = user_management_api.UserManagementApi(api_client)
    modify_individual = ModifyIndividual(
        first_name="first_name_example",
        last_name="last_name_example",
        unique_id="unique_id_example",
        role_id="role_id_example",
        email="email_example",
        assertion_field="assertion_field_example",
        location_id="location_id_example",
    ) # ModifyIndividual |  (optional)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Modifies an individual's attributes as determined by the uniqueId in the body of the request. Please note that the uniqueId may not be changed. Fields not changing may be passed as NULL but never empty.
        api_response = api_instance.modify_individual_post(modify_individual=modify_individual)
        pprint(api_response)
    except fds.sdk.ProcuretoPayProvisioning.ApiException as e:
        print("Exception when calling UserManagementApi->modify_individual_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **modify_individual** | [**ModifyIndividual**](ModifyIndividual.md)|  | [optional]

### Return type

[**InlineResponse202**](InlineResponse202.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json; charset=utf-8, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Accepted |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**400** | Bad Request |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Unauthenticated |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Unauthorized |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**429** | Rate limit reached |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

