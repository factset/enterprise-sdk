# fds.sdk.FactSetEntity.EntityStructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_structure**](EntityStructureApi.md#get_entity_structure) | **GET** /factset-entity/v1/entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
[**get_ultimate_entity_structure**](EntityStructureApi.md#get_ultimate_entity_structure) | **GET** /factset-entity/v1/ultimate-entity-structures | Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
[**post_entity_structure**](EntityStructureApi.md#post_entity_structure) | **POST** /factset-entity/v1/entity-structures | Returns all active or inactive entities below the requested entity id.
[**post_ultimate_entity_structure**](EntityStructureApi.md#post_ultimate_entity_structure) | **POST** /factset-entity/v1/ultimate-entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.


# **get_entity_structure**
> EntityStructureResponse get_entity_structure(ids)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities below the requested entity id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_structure_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_structure_api.EntityStructureApi(api_client)

    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
    level = -1 # int | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional) if omitted the server will use the default value of -1
    active = -1 # int | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional) if omitted the server will use the default value of -1

    try:
        # Returns all active or inactive entities and respective levels below the requested entity id.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_entity_structure(ids, level=level, active=active)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityStructureApi->get_entity_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **level** | **int**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] if omitted the server will use the default value of -1
 **active** | **int**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] if omitted the server will use the default value of -1

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Entity Structure |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ultimate_entity_structure**
> UltimateEntityStructureResponse get_ultimate_entity_structure(ids)

Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.

Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_structure_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_structure_api.EntityStructureApi(api_client)

    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
    level = -1 # int | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. (optional) if omitted the server will use the default value of -1
    active = -1 # int | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. (optional) if omitted the server will use the default value of -1

    try:
        # Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ultimate_entity_structure(ids, level=level, active=active)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityStructureApi->get_ultimate_entity_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **level** | **int**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] if omitted the server will use the default value of -1
 **active** | **int**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] if omitted the server will use the default value of -1

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Ultimate Entity Structure data for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_entity_structure**
> EntityStructureResponse post_entity_structure(entity_structure_request)

Returns all active or inactive entities below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_structure_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_structure_api.EntityStructureApi(api_client)

    entity_structure_request = EntityStructureRequest(
        ids=StructureIds(["FDS-US","0FPWZZ-E","TSLA-US"]),
        level=-1,
        active=Active(1),
    ) # EntityStructureRequest | Request Body to request a list of Entity Structure objects.

    try:
        # Returns all active or inactive entities below the requested entity id.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_entity_structure(entity_structure_request)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityStructureApi->post_entity_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_structure_request** | [**EntityStructureRequest**](EntityStructureRequest.md)| Request Body to request a list of Entity Structure objects. |

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Entity Structure data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_ultimate_entity_structure**
> UltimateEntityStructureResponse post_ultimate_entity_structure(ultimate_entity_structure_request)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_structure_api
from fds.sdk.FactSetEntity.models import *
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
configuration = fds.sdk.FactSetEntity.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_structure_api.EntityStructureApi(api_client)

    ultimate_entity_structure_request = UltimateEntityStructureRequest(
        ids=StructureIds(["FDS-US","0FPWZZ-E","TSLA-US"]),
        level=-1,
        active=Active(1),
    ) # UltimateEntityStructureRequest | Request Body to request a list of Ultimate Entity Structure objects.

    try:
        # Returns all active or inactive entities and respective levels below the requested entity id.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_ultimate_entity_structure(ultimate_entity_structure_request)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityStructureApi->post_ultimate_entity_structure: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ultimate_entity_structure_request** | [**UltimateEntityStructureRequest**](UltimateEntityStructureRequest.md)| Request Body to request a list of Ultimate Entity Structure objects. |

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Ultimate Entity Structure data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

