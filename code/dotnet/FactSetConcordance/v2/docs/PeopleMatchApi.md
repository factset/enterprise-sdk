# FactSet.SDK.FactSetConcordance.Api.PeopleMatchApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPeopleMatch**](PeopleMatchApi.md#getpeoplematch) | **GET** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.People matches can be retrieved using person&#39;s name and other attributes like firstname, middlename and lastname.
[**GetPeopleMatchForList**](PeopleMatchApi.md#getpeoplematchforlist) | **POST** /factset-concordance/v2/people-match | Find potential people matches given a person&#39;s name.


<a name="getpeoplematch"></a>
# **GetPeopleMatch**
> PeopleMatchesResponse GetPeopleMatch (string entity, string personName = null, string salutation = null, string firstName = null, string middleName = null, string lastName = null, string suffix = null)

Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.

Finds the best people candidates matching the given name. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /people-match to fetch up to  names. Otherwise, use the \"People Match - Bulk\" workflow to submit larger universes of names to be concorded via a file.</p><p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleMatchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new PeopleMatchApi(config);

            var entity = Microsoft;  // string | Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match.
            var personName = Bill Gates;  // string | Name of Person to match. (optional) 
            var salutation = Mr;  // string | Title in person's name. This parameter should not be provided when the person name is provided as the input. (optional) 
            var firstName = Bill;  // string | First name of person. This parameter should not be provided when the person name is provided as the input. (optional) 
            var middleName = Henry;  // string | Middle name of person.This parameter should not be provided when the person name is provided as the input. (optional) 
            var lastName = Gates;  // string | Last name of person. This parameter should not be provided when the person name is provided as the input. (optional) 
            var suffix = III;  // string | Suffix in person's name. This parameter should not be provided when the person name is provided as the input. (optional) 

            try
            {
                // Find potential people matches given a person's name.People matches can be retrieved using person's name and other attributes like firstname, middlename and lastname.
                PeopleMatchesResponse result = apiInstance.GetPeopleMatch(entity, personName, salutation, firstName, middleName, lastName, suffix);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMatchApi.GetPeopleMatch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **entity** | **string**| Entity the person is associated with. It is used to filter the candidates before taking a match decision. Can be entity ID or name. The supported entity types match the what is supported via the /company match. | 
 **personName** | **string**| Name of Person to match. | [optional] 
 **salutation** | **string**| Title in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **firstName** | **string**| First name of person. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **middleName** | **string**| Middle name of person.This parameter should not be provided when the person name is provided as the input. | [optional] 
 **lastName** | **string**| Last name of person. This parameter should not be provided when the person name is provided as the input. | [optional] 
 **suffix** | **string**| Suffix in person&#39;s name. This parameter should not be provided when the person name is provided as the input. | [optional] 

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
| **200** | Response containing People Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getpeoplematchforlist"></a>
# **GetPeopleMatchForList**
> PeopleMatchesResponse GetPeopleMatchForList (PeopleMatchRequest peopleMatchRequest)

Find potential people matches given a person's name.

Finds the best candidate people matching the given people names. Additional attributes can be supplied to narrow the search. If a `universeId` is provided, any match for an input including a `clientId` will be saved to that universe. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetConcordance.Api;
using FactSet.SDK.FactSetConcordance.Client;
using FactSet.SDK.FactSetConcordance.Model;

namespace Example
{
    public class GetPeopleMatchForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetConcordance.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new PeopleMatchApi(config);

            var peopleMatchRequest = new PeopleMatchRequest(); // PeopleMatchRequest | A request to People match.

            try
            {
                // Find potential people matches given a person's name.
                PeopleMatchesResponse result = apiInstance.GetPeopleMatchForList(peopleMatchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PeopleMatchApi.GetPeopleMatchForList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **peopleMatchRequest** | [**PeopleMatchRequest**](PeopleMatchRequest.md)| A request to People match. | 

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
| **200** | Response containing People Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

