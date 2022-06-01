# fds.sdk.FactSetConcordance.PeopleMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_people_match**](PeopleMatchApi.md#get_people_match) | **GET** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
[**get_people_match_for_list**](PeopleMatchApi.md#get_people_match_for_list) | **POST** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.


# **get_people_match**
> PeopleMatchesResponse get_people_match(entity)

Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.

Finds the best people candidates matching the given name. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to  names. Otherwise, use the \"People Match - Bulk\" workflow to submit larger universes of names to be concorded via a file.</p><p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import people_match_api
from fds.sdk.FactSetConcordance.model.error_response import ErrorResponse
from fds.sdk.FactSetConcordance.model.people_matches_response import PeopleMatchesResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = people_match_api.PeopleMatchApi(api_client)

    entity = "Microsoft" # str | Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
    person_name = "Bill Gates" # str | Name of Person to match. (optional)
    salutation = "Mr" # str | Title in person's name. This parameter should not be provided when the person name is provided as the input. (optional)
    first_name = "Bill" # str | First name of person. This parameter should not be provided when the person name is provided as the input. (optional)
    middle_name = "Henry" # str | Middle name of person.This parameter should not be provided when the person name is provided as the input. (optional)
    last_name = "Gates" # str | Last name of person. This parameter should not be provided when the person name is provided as the input. (optional)
    suffix = "III" # str | Suffix in person's name. This parameter should not be provided when the person name is provided as the input. (optional)

    try:
        # Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.
        api_response = api_instance.get_people_match(entity, person_name=person_name, salutation=salutation, first_name=first_name, middle_name=middle_name, last_name=last_name, suffix=suffix)
        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling PeopleMatchApi->get_people_match: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **str**| Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. |
 **person_name** | **str**| Name of Person to match. | [optional]
 **salutation** | **str**| Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional]
 **first_name** | **str**| First name of person. This parameter should not be provided when the person name is provided as the input. | [optional]
 **middle_name** | **str**| Middle name of person.This parameter should not be provided when the person name is provided as the input. | [optional]
 **last_name** | **str**| Last name of person. This parameter should not be provided when the person name is provided as the input. | [optional]
 **suffix** | **str**| Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional]

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing People Match results. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_people_match_for_list**
> PeopleMatchesResponse get_people_match_for_list(people_match_request)

Find potential people matches given a person's name.

Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetConcordance
from fds.sdk.FactSetConcordance.api import people_match_api
from fds.sdk.FactSetConcordance.model.error_response import ErrorResponse
from fds.sdk.FactSetConcordance.model.people_matches_response import PeopleMatchesResponse
from fds.sdk.FactSetConcordance.model.people_match_request import PeopleMatchRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetConcordance.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetConcordance.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetConcordance.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = people_match_api.PeopleMatchApi(api_client)

    people_match_request = PeopleMatchRequest(
        input=[
            PeopleMatchRequestInput(
                person_name="Bill Gates",
                client_id="abc-123",
                salutation="Mr",
                first_name="Bill",
                middle_name="Henry",
                last_name="Gates",
                suffix="III",
                entity="Microsoft",
            ),
        ],
        universe_id=1,
    ) # PeopleMatchRequest | A request to People match.

    try:
        # Find potential people matches given a person's name.
        api_response = api_instance.get_people_match_for_list(people_match_request)
        pprint(api_response)

    except fds.sdk.FactSetConcordance.ApiException as e:
        print("Exception when calling PeopleMatchApi->get_people_match_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **people_match_request** | [**PeopleMatchRequest**](PeopleMatchRequest.md)| A request to People match. |

### Return type

[**PeopleMatchesResponse**](PeopleMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json;charset=utf-8
 - **Accept**: application/json;charset=utf-8, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Response containing People Match results. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

