# FactSet.SDK.IRNMeetings.Api.MeetingsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateMeeting**](MeetingsApi.md#createmeeting) | **POST** /meetings | Create a meeting
[**DeleteMeeting**](MeetingsApi.md#deletemeeting) | **DELETE** /meetings/{meetingId} | Delete a Meeting
[**GetMeeting**](MeetingsApi.md#getmeeting) | **GET** /meetings/{meetingId} | Get details of a meeting
[**GetMeetings**](MeetingsApi.md#getmeetings) | **GET** /meetings | Get all the meetings in the specified date range filtered on the given identifiers
[**UpdateMeeting**](MeetingsApi.md#updatemeeting) | **PUT** /meetings/{meetingId} | Update meeting



<a name="createmeeting"></a>
# **CreateMeeting**
> NewItemDto CreateMeeting (CreateMeetingDto createMeetingDto = null)

Create a meeting

Create a meeting with the given details like date, time, location, attendees, etc.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class CreateMeetingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new MeetingsApi(config);

            var createMeetingDto = new CreateMeetingDto(); // CreateMeetingDto | Note: The organizer property is deprecated in favor of organizerId (optional) 

            try
            {
                // Create a meeting
                NewItemDto result = apiInstance.CreateMeeting(createMeetingDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MeetingsApi.CreateMeeting: " + e.Message );
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
 **createMeetingDto** | [**CreateMeetingDto**](CreateMeetingDto.md)| Note: The organizer property is deprecated in favor of organizerId | [optional] 

### Return type
[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Success - Returns unique identifier of the meeting created |  -  |
| **400** | Bad Request |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletemeeting"></a>
# **DeleteMeeting**
> void DeleteMeeting (Guid meetingId)

Delete a Meeting

Delete a meeting by providing the meeting id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class DeleteMeetingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new MeetingsApi(config);

            var meetingId = "meetingId_example";  // Guid | Meeting Id

            try
            {
                // Delete a Meeting
                apiInstance.DeleteMeeting(meetingId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MeetingsApi.DeleteMeeting: " + e.Message );
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
 **meetingId** | **Guid**| Meeting Id | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getmeeting"></a>
# **GetMeeting**
> MeetingDto GetMeeting (Guid meetingId)

Get details of a meeting

Get details of a meeting by providing the meeting id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetMeetingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new MeetingsApi(config);

            var meetingId = "meetingId_example";  // Guid | Meeting Id

            try
            {
                // Get details of a meeting
                MeetingDto result = apiInstance.GetMeeting(meetingId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MeetingsApi.GetMeeting: " + e.Message );
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
 **meetingId** | **Guid**| Meeting Id | 

### Return type
[**MeetingDto**](MeetingDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getmeetings"></a>
# **GetMeetings**
> List&lt;MeetingSummaryDto&gt; GetMeetings (string start = null, string end = null, List<string> identifiers = null, int? limit = null, string modifiedSince = null, bool? includeRelatedEntities = null, bool? xIRNIncludeDeleted = null)

Get all the meetings in the specified date range filtered on the given identifiers

Get all the meetings in the specified date range filtered on the given identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetMeetingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new MeetingsApi(config);

            var start = "start_example";  // string | StartDate (optional) 
            var end = "end_example";  // string | EndDate (optional) 
            var identifiers = new List<string>(); // List<string> | Set of identifiers to filter on (optional) 
            var limit = 56;  // int? | Limit on the number of meetings retrieved (optional) 
            var modifiedSince = "modifiedSince_example";  // string | Only return meetings which have been modified or created since a particular time (optional) 
            var includeRelatedEntities = false;  // bool? | When set to true fetches meetings tagged with all the entities related to identifiers param (optional)  (default to false)
            var xIRNIncludeDeleted = false;  // bool? | Includes deleted meetings in results when set to true (optional)  (default to false)

            try
            {
                // Get all the meetings in the specified date range filtered on the given identifiers
                List<MeetingSummaryDto> result = apiInstance.GetMeetings(start, end, identifiers, limit, modifiedSince, includeRelatedEntities, xIRNIncludeDeleted);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MeetingsApi.GetMeetings: " + e.Message );
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
 **start** | **string**| StartDate | [optional] 
 **end** | **string**| EndDate | [optional] 
 **identifiers** | [**List&lt;string&gt;**](string.md)| Set of identifiers to filter on | [optional] 
 **limit** | **int?**| Limit on the number of meetings retrieved | [optional] 
 **modifiedSince** | **string**| Only return meetings which have been modified or created since a particular time | [optional] 
 **includeRelatedEntities** | **bool?**| When set to true fetches meetings tagged with all the entities related to identifiers param | [optional] [default to false]
 **xIRNIncludeDeleted** | **bool?**| Includes deleted meetings in results when set to true | [optional] [default to false]

### Return type
[**List&lt;MeetingSummaryDto&gt;**](MeetingSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updatemeeting"></a>
# **UpdateMeeting**
> void UpdateMeeting (Guid meetingId, UpdateMeetingDto updateMeetingDto = null)

Update meeting

Update the details of a meeting by providing the meeting id based on the given details.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class UpdateMeetingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new MeetingsApi(config);

            var meetingId = "meetingId_example";  // Guid | Meeting Id
            var updateMeetingDto = new UpdateMeetingDto(); // UpdateMeetingDto | Meeting details to update. Note: The organizer property is deprecated in favor of organizerId (optional) 

            try
            {
                // Update meeting
                apiInstance.UpdateMeeting(meetingId, updateMeetingDto);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MeetingsApi.UpdateMeeting: " + e.Message );
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
 **meetingId** | **Guid**| Meeting Id | 
 **updateMeetingDto** | [**UpdateMeetingDto**](UpdateMeetingDto.md)| Meeting details to update. Note: The organizer property is deprecated in favor of organizerId | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **0** | Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


