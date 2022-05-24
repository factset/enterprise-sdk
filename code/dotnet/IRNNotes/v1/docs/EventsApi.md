# FactSet.SDK.IRNNotes.Api.EventsApi

All URIs are relative to *https://api-sandbox.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAllEvents**](EventsApi.md#getallevents) | **GET** /v1/events | Get all the record events in the specified date range filtered on the given types
[**GetEvents**](EventsApi.md#getevents) | **GET** /v1/notes/{noteId}/events | Get all the record events that belong to a note
[**GetRecordEvent**](EventsApi.md#getrecordevent) | **GET** /v1/notes/{noteId}/events/{recordEventId} | Get details of a record event of a note


<a name="getallevents"></a>
# **GetAllEvents**
> List&lt;EventSnippetDto&gt; GetAllEvents (string startDate, string endDate = null, List<string> types = null)

Get all the record events in the specified date range filtered on the given types

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetAllEventsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var startDate = "startDate_example";  // string | StartDate
            var endDate = "endDate_example";  // string | EndDate (optional) 
            var types = new List<string>(); // List<string> | Set of event types to filter on (optional) 

            try
            {
                // Get all the record events in the specified date range filtered on the given types
                List<EventSnippetDto> result = apiInstance.GetAllEvents(startDate, endDate, types);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetAllEvents: " + e.Message );
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
 **startDate** | **string**| StartDate | 
 **endDate** | **string**| EndDate | [optional] 
 **types** | [**List&lt;string&gt;**](string.md)| Set of event types to filter on | [optional] 

### Return type
[**List&lt;EventSnippetDto&gt;**](EventSnippetDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain, application/json, text/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success - Returns events list |  -  |
| **400** | Bad Request - Returns error message |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevents"></a>
# **GetEvents**
> List&lt;RecordEventSummaryDto&gt; GetEvents (Guid noteId)

Get all the record events that belong to a note

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetEventsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var noteId = "noteId_example";  // Guid | Note Id

            try
            {
                // Get all the record events that belong to a note
                List<RecordEventSummaryDto> result = apiInstance.GetEvents(noteId);
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
 **noteId** | **Guid**| Note Id | 

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
> NoteEventDto GetRecordEvent (Guid noteId, Guid recordEventId)

Get details of a record event of a note

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetRecordEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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
            var noteId = "noteId_example";  // Guid | Note Id
            var recordEventId = "recordEventId_example";  // Guid | Record Event Id

            try
            {
                // Get details of a record event of a note
                NoteEventDto result = apiInstance.GetRecordEvent(noteId, recordEventId);
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
 **noteId** | **Guid**| Note Id | 
 **recordEventId** | **Guid**| Record Event Id | 

### Return type
[**NoteEventDto**](NoteEventDto.md)

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

