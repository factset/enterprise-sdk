# FactSet.SDK.EventsandTranscripts.Api.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1calls) | **GET** /nrt/by-ticker | Returns the active calls happening at the moment based on ticker,call status and entity ID.
[**GetBulkDocumentsNrtV1CallsByAudioSourceId**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1callsbyaudiosourceid) | **GET** /nrt/by-ids | Returns the active calls happening at the moment based on audio source ID and report ID.
[**GetBulkDocumentsNrtV1Indexedrt**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1indexedrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**GetBulkDocumentsNrtV1SpeakerIds**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1speakerids) | **GET** /nrt/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



<a name="getbulkdocumentsnrtv1calls"></a>
# **GetBulkDocumentsNrtV1Calls**
> NrtCalls GetBulkDocumentsNrtV1Calls (string ticker = null, string entityId = null, string callStatus = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the active calls happening at the moment based on ticker,call status and entity ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1CallsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var ticker = "AZZ-US";  // string | Ticker-region identifier for the company hosting the event. (optional) 
            var entityId = "000CGP-E";  // string | Factset entity level identifier for the company hosting the event. (optional) 
            var callStatus = "InProgress";  // string | Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the active calls happening at the moment based on ticker,call status and entity ID.
                NrtCalls result = apiInstance.GetBulkDocumentsNrtV1Calls(ticker, entityId, callStatus, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1Calls: " + e.Message );
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
 **ticker** | **string**| Ticker-region identifier for the company hosting the event. | [optional] 
 **entityId** | **string**| Factset entity level identifier for the company hosting the event. | [optional] 
 **callStatus** | **string**| Status of the call, i.e., Ended, InProgress, EndedWithoutNotification, or IssueAtSource. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, based on the provided ticker, call status, and entity ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1callsbyaudiosourceid"></a>
# **GetBulkDocumentsNrtV1CallsByAudioSourceId**
> NrtCalls GetBulkDocumentsNrtV1CallsByAudioSourceId (int? audioSourceId = null, int? reportId = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the active calls happening at the moment based on audio source ID and report ID.

Returns the active calls happening at the moment

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1CallsByAudioSourceIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 471849;  // int? | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional) 
            var reportId = 2683372;  // int? | Unique identifier for an event. (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the active calls happening at the moment based on audio source ID and report ID.
                NrtCalls result = apiInstance.GetBulkDocumentsNrtV1CallsByAudioSourceId(audioSourceId, reportId, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1CallsByAudioSourceId: " + e.Message );
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
 **audioSourceId** | **int?**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **reportId** | **int?**| Unique identifier for an event. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDatetimeUtc.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**NrtCalls**](NrtCalls.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, based on IDs. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1indexedrt"></a>
# **GetBulkDocumentsNrtV1Indexedrt**
> IndexedNrt GetBulkDocumentsNrtV1Indexedrt (int audioSourceId, int? paginationLimit = null, int? paginationOffset = null)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1IndexedrtExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 471849;  // int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the  indexed transcript data  in small increments throughout the duration of an active call.
                IndexedNrt result = apiInstance.GetBulkDocumentsNrtV1Indexedrt(audioSourceId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1Indexedrt: " + e.Message );
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**IndexedNrt**](IndexedNrt.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The transcript data that has been indexed according to the specific audio source ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1speakerids"></a>
# **GetBulkDocumentsNrtV1SpeakerIds**
> NrtSpeakerIds GetBulkDocumentsNrtV1SpeakerIds (int audioSourceId, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the confidence scores generated for an active call.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1SpeakerIdsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 471849;  // int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs.
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the latest speakerIds with the confidence scores generated for an active call.
                NrtSpeakerIds result = apiInstance.GetBulkDocumentsNrtV1SpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1SpeakerIds: " + e.Message );
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on the start offset of the speaker.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**NrtSpeakerIds**](NrtSpeakerIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The up-to-date speaker IDs and their associated confidence scores, based on the audio source ID. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


