# FactSet.SDK.FactSetPeople.Api.JobHistoryApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPeopleJobs**](JobHistoryApi.md#getpeoplejobs) | **GET** /factset-people/v1/jobs | Returns the Job history of the person.
[**GetPeopleJobsForList**](JobHistoryApi.md#getpeoplejobsforlist) | **POST** /factset-people/v1/jobs | Returns the Job history for the large list of people.



<a name="getpeoplejobs"></a>
# **GetPeopleJobs**
> PeopleJobsResponse GetPeopleJobs (List<string> ids, string status = null, string level = null, string type = null)

Returns the Job history of the person.

Returns the `Job` history of the person referenced by the entityId specified in the request. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetPeopleJobsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new JobHistoryApi(config);

            var ids = new List<string>(); // List<string> | List of FactSet Person Entity identifier.
            var status = "ALL";  // string | Select only Jobs with a certain status primary, active, or inactive. (optional)  (default to ALL)
            var level = "SUMMARY";  // string | Select the level of detail only main Jobs or include other Jobs at a company. (optional)  (default to DETAIL)
            var type = "ALL";  // string | Select only Jobs of a certain type board member or employee. (optional)  (default to ALL)

            try
            {
                // Returns the Job history of the person.
                PeopleJobsResponse result = apiInstance.GetPeopleJobs(ids, status, level, type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobHistoryApi.GetPeopleJobs: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of FactSet Person Entity identifier. | 
 **status** | **string**| Select only Jobs with a certain status primary, active, or inactive. | [optional] [default to ALL]
 **level** | **string**| Select the level of detail only main Jobs or include other Jobs at a company. | [optional] [default to DETAIL]
 **type** | **string**| Select only Jobs of a certain type board member or employee. | [optional] [default to ALL]

### Return type
[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Job objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpeoplejobsforlist"></a>
# **GetPeopleJobsForList**
> PeopleJobsResponse GetPeopleJobsForList (PeopleJobsRequest peopleJobsRequest)

Returns the Job history for the large list of people.

Returns the `Job` history of the person referenced by the entityId specified in the request. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPeople.Api;
using FactSet.SDK.FactSetPeople.Client;
using FactSet.SDK.FactSetPeople.Model;

namespace Example
{
    public class GetPeopleJobsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPeople.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new JobHistoryApi(config);

            var peopleJobsRequest = new PeopleJobsRequest(); // PeopleJobsRequest | 

            try
            {
                // Returns the Job history for the large list of people.
                PeopleJobsResponse result = apiInstance.GetPeopleJobsForList(peopleJobsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobHistoryApi.GetPeopleJobsForList: " + e.Message );
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
 **peopleJobsRequest** | [**PeopleJobsRequest**](PeopleJobsRequest.md)|  | 

### Return type
[**PeopleJobsResponse**](PeopleJobsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Job objects. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


