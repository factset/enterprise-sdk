# fds.sdk.FactSetEntity.EntityReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_references**](EntityReferenceApi.md#get_entity_references) | **GET** /factset-entity/v1/entity-references | Returns an entity reference profiles for an individual entity
[**post_entity_references**](EntityReferenceApi.md#post_entity_references) | **POST** /factset-entity/v1/entity-references | Returns an entity reference data for a list of ids.


# **get_entity_references**
> EntityReferenceResponse get_entity_references(ids)

Returns an entity reference profiles for an individual entity

Returns an Entity reference profile for the requested Entity Id(s). Data points include - Ultimate Parent Id, Credit Parent Id, Headquarters location details, Website URL, and Business Description. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_reference_api
from fds.sdk.FactSetEntity.model.entity_reference_response import EntityReferenceResponse
from fds.sdk.FactSetEntity.model.error_response import ErrorResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEntity.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEntity.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_reference_api.EntityReferenceApi(api_client)
    ids = ["AAPL-US","0FPWZZ-E","TSLA-US"] # [str] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

    # example passing only required values which don't have defaults set
    try:
        # Returns an entity reference profiles for an individual entity
        api_response = api_instance.get_entity_references(ids)
        pprint(api_response)
    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityReferenceApi->get_entity_references: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |

### Return type

[**EntityReferenceResponse**](EntityReferenceResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Entity Reference data for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_entity_references**
> EntityReferenceResponse post_entity_references(entity_reference_request)

Returns an entity reference data for a list of ids.

Returns an entity reference object for the requested entity ids. Data points include - ultimate parent id, headquarters location details, credit parent id, website, and business description. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_reference_api
from fds.sdk.FactSetEntity.model.entity_reference_response import EntityReferenceResponse
from fds.sdk.FactSetEntity.model.error_response import ErrorResponse
from fds.sdk.FactSetEntity.model.entity_reference_request import EntityReferenceRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetEntity.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetEntity.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetEntity.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEntity.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = entity_reference_api.EntityReferenceApi(api_client)
    entity_reference_request = EntityReferenceRequest(
        ids=Ids(["FDS-US","0FPWZZ-E","TSLA-US"]),
    ) # EntityReferenceRequest | Request Body to request a list of Entity Reference objects.

    # example passing only required values which don't have defaults set
    try:
        # Returns an entity reference data for a list of ids.
        api_response = api_instance.post_entity_references(entity_reference_request)
        pprint(api_response)
    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityReferenceApi->post_entity_references: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_reference_request** | [**EntityReferenceRequest**](EntityReferenceRequest.md)| Request Body to request a list of Entity Reference objects. |

### Return type

[**EntityReferenceResponse**](EntityReferenceResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Entity Reference data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

