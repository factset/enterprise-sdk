# fds.sdk.IRNConfiguration.GroupApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1_group_client_sales_representative_get**](GroupApi.md#v1_group_client_sales_representative_get) | **GET** /v1/group/client-sales-representative | 
[**v1_group_get**](GroupApi.md#v1_group_get) | **GET** /v1/group | Get Group details


# **v1_group_client_sales_representative_get**
> ClientSalesRepresentativeDto v1_group_client_sales_representative_get()



### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import group_api
from fds.sdk.IRNConfiguration.model.problem_details import ProblemDetails
from fds.sdk.IRNConfiguration.model.client_sales_representative_dto import ClientSalesRepresentativeDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = group_api.GroupApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        api_response = api_instance.v1_group_client_sales_representative_get()
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling GroupApi->v1_group_client_sales_representative_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**ClientSalesRepresentativeDto**](ClientSalesRepresentativeDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **v1_group_get**
> GroupConfigDto v1_group_get()

Get Group details

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNConfiguration
from fds.sdk.IRNConfiguration.api import group_api
from fds.sdk.IRNConfiguration.model.group_config_dto import GroupConfigDto
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.IRNConfiguration.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNConfiguration.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNConfiguration.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = group_api.GroupApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Get Group details
        api_response = api_instance.v1_group_get()
        pprint(api_response)
    except fds.sdk.IRNConfiguration.ApiException as e:
        print("Exception when calling GroupApi->v1_group_get: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**GroupConfigDto**](GroupConfigDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

