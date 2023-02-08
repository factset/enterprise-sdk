# fds.sdk.FactSetEntity.EntityReferenceChineseApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_entity_reference_chi**](EntityReferenceChineseApi.md#get_entity_reference_chi) | **GET** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.
[**get_entity_reference_chi_for_list**](EntityReferenceChineseApi.md#get_entity_reference_chi_for_list) | **POST** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.



# **get_entity_reference_chi**
> EntityReferenceChiResponse get_entity_reference_chi(ids)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_reference_chinese_api
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
    api_instance = entity_reference_chinese_api.EntityReferenceChineseApi(api_client)

    ids = ["05X6LC-E","062T6N-E"] # [str] | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 1500 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

    try:
        # Returns entity reference data in Chinese for an individual entity.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_entity_reference_chi(ids)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityReferenceChineseApi->get_entity_reference_chi: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 1500 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |

### Return type

[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Entity Reference data in Chinese for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_entity_reference_chi_for_list**
> EntityReferenceChiResponse get_entity_reference_chi_for_list(entity_reference_chi_request)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEntity
from fds.sdk.FactSetEntity.api import entity_reference_chinese_api
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
    api_instance = entity_reference_chinese_api.EntityReferenceChineseApi(api_client)

    entity_reference_chi_request = EntityReferenceChiRequest(
        ids=IdsChi(["05X6LC-E","062T6N-E"]),
    ) # EntityReferenceChiRequest | Request Body to request a list of Entity Reference Chinese objects.

    try:
        # Returns entity reference data in Chinese for an individual entity.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_entity_reference_chi_for_list(entity_reference_chi_request)
        pprint(api_response)

    except fds.sdk.FactSetEntity.ApiException as e:
        print("Exception when calling EntityReferenceChineseApi->get_entity_reference_chi_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity_reference_chi_request** | [**EntityReferenceChiRequest**](EntityReferenceChiRequest.md)| Request Body to request a list of Entity Reference Chinese objects. |

### Return type

[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Entity Reference data in Chinese for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

