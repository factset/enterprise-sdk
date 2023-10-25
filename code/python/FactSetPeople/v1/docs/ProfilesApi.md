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
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import profiles_api
from fds.sdk.FactSetPeople.models import *
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
configuration = fds.sdk.FactSetPeople.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = profiles_api.ProfilesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    ids = ["0DPHLH-E","07MZV9-E"] # [str] | List of FactSet Person Entity identifier.

    try:
        # Return information about the person with the specified entity ID.
        # example passing only required values which don't have defaults set
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
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPeople
from fds.sdk.FactSetPeople.api import profiles_api
from fds.sdk.FactSetPeople.models import *
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
configuration = fds.sdk.FactSetPeople.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPeople.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPeople.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = profiles_api.ProfilesApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    people_profiles_request = PeopleProfilesRequest(
        ids=Ids(["0DPHLH-E"]),
    ) # PeopleProfilesRequest | 

    try:
        # Returns profile information for a large list of people.
        # example passing only required values which don't have defaults set
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

