# FactSet.SDK.IRNMeetings.Api.EventsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEvents**](EventsApi.md#getevents) | **GET** /v1/meetings/{meetingId}/events | Get all the record events that belong to a meeting
[**GetRecordEvent**](EventsApi.md#getrecordevent) | **GET** /v1/meetings/{meetingId}/events/{recordEventId} | Get details of a record event of a meeting



<a name="getevents"></a>
# **GetEvents**
> List&lt;RecordEventSummaryDto&gt; GetEvents (Guid meetingId)

Get all the record events that belong to a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetEventsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var meetingId = "meetingId_example";  // Guid | Meeting ID

            try
            {
                // Get all the record events that belong to a meeting
                List<RecordEventSummaryDto> result = apiInstance.GetEvents(meetingId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEvents: " + e.Message );
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
 **meetingId** | **Guid**| Meeting ID | 

### Return type
[**List&lt;RecordEventSummaryDto&gt;**](RecordEventSummaryDto.md)

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


<a name="getrecordevent"></a>
# **GetRecordEvent**
> MeetingEventDto GetRecordEvent (Guid meetingId, Guid recordEventId)

Get details of a record event of a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetRecordEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var meetingId = "meetingId_example";  // Guid | Meeting Id
            var recordEventId = "recordEventId_example";  // Guid | Record Event Id

            try
            {
                // Get details of a record event of a meeting
                MeetingEventDto result = apiInstance.GetRecordEvent(meetingId, recordEventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetRecordEvent: " + e.Message );
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
 **recordEventId** | **Guid**| Record Event Id | 

### Return type
[**MeetingEventDto**](MeetingEventDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


