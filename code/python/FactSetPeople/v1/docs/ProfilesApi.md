# fds.sdk.FactSetPeople.ProfilesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_people_profiles**](ProfilesApi.md#get_people_profiles) | **GET** /factset-people/v1/profiles | Return information about the person with the specified entity ID.
[**get_people_profiles_for_list**](ProfilesApi.md#get_people_profiles_for_list) | **POST** /factset-people/v1/profiles | Returns profile information for a large list of people.


# **get_people_profiles**
> PeopleProfilesResponse get_people_profiles(ids)

Return information about the person with the specified entity ID.

Returns a summary of basic information about the person referenced by the entityId specified in the URI. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import profiles_api
from fds.sdk.FactSetPeople.model.error_response import ErrorResponse
from fds.sdk.FactSetPeople.model.people_profiles_response import PeopleProfilesResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetPeople.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetPeople.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = profiles_api.ProfilesApi(api_client)
    ids = ["0DPHLH-E","07MZV9-E"] # [str] | List of FactSet Person Entity identifier.

    # example passing only required values which don't have defaults set
    try:
        # Return information about the person with the specified entity ID.
        api_response = api_instance.get_people_profiles(ids)
        pprint(api_response)
    except fds.sdk.FactSetPeople.ApiException as e:
        print("Exception when calling ProfilesApi->get_people_profiles: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| List of FactSet Person Entity identifier. |

### Return type

[**PeopleProfilesResponse**](PeopleProfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of Profile Ojects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_people_profiles_for_list**
> PeopleProfilesResponse get_people_profiles_for_list(people_profiles_request)

Returns profile information for a large list of people.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import profiles_api
from fds.sdk.FactSetPeople.model.people_profiles_request import PeopleProfilesRequest
from fds.sdk.FactSetPeople.model.error_response import ErrorResponse
from fds.sdk.FactSetPeople.model.people_profiles_response import PeopleProfilesResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetPeople.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetPeople.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = profiles_api.ProfilesApi(api_client)
    people_profiles_request = PeopleProfilesRequest(
        ids=Ids(["0DPHLH-E"]),
    ) # PeopleProfilesRequest | 

    # example passing only required values which don't have defaults set
    try:
        # Returns profile information for a large list of people.
        api_response = api_instance.get_people_profiles_for_list(people_profiles_request)
        pprint(api_response)
    except fds.sdk.FactSetPeople.ApiException as e:
        print("Exception when calling ProfilesApi->get_people_profiles_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **people_profiles_request** | [**PeopleProfilesRequest**](PeopleProfilesRequest.md)|  |

### Return type

[**PeopleProfilesResponse**](PeopleProfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Array of People Profile Objects |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

