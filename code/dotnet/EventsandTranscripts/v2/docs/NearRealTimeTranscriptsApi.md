# FactSet.SDK.EventsandTranscripts.Api.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIndexedNrt**](NearRealTimeTranscriptsApi.md#getindexednrt) | **GET** /nrt/indexed | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**GetSpeakerIds**](NearRealTimeTranscriptsApi.md#getspeakerids) | **GET** /nrt/speaker-ids | Returns the latest speakerIds with the confidence scores generated for an active call.
[**SearchNrtCalls**](NearRealTimeTranscriptsApi.md#searchnrtcalls) | **POST** /nrt/calls | Returns the active calls happening at the moment based on ticker/entity or specific IDs.



<a name="getindexednrt"></a>
# **GetIndexedNrt**
> IndexedNrtResponse GetIndexedNrt (int audioSourceId, int? paginationLimit = null, int? paginationOffset = null)

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
    public class GetIndexedNrtExample
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
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional)  (default to 0)

            try
            {
                // Returns the  indexed transcript data  in small increments throughout the duration of an active call.
                IndexedNrtResponse result = apiInstance.GetIndexedNrt(audioSourceId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetIndexedNrt: " + e.Message );
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
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type
[**IndexedNrtResponse**](IndexedNrtResponse.md)

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


<a name="getspeakerids"></a>
# **GetSpeakerIds**
> NrtSpeakerIdsResponse GetSpeakerIds (int audioSourceId, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

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
    public class GetSpeakerIdsExample
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
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional)  (default to 0)

            try
            {
                // Returns the latest speakerIds with the confidence scores generated for an active call.
                NrtSpeakerIdsResponse result = apiInstance.GetSpeakerIds(audioSourceId, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetSpeakerIds: " + e.Message );
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
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type
[**NrtSpeakerIdsResponse**](NrtSpeakerIdsResponse.md)

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


<a name="searchnrtcalls"></a>
# **SearchNrtCalls**
> NrtCallsResponse SearchNrtCalls (NrtCallsRequest nrtCallsRequest)

Returns the active calls happening at the moment based on ticker/entity or specific IDs.

Retrieves active Near Real-Time (NRT) calls based on either ticker/entity/status criteria or specific audio source/report IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object. 

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
    public class SearchNrtCallsExample
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

            var nrtCallsRequest = new NrtCallsRequest(); // NrtCallsRequest | Criteria to search for NRT calls. Select one mode of search.

            try
            {
                // Returns the active calls happening at the moment based on ticker/entity or specific IDs.
                NrtCallsResponse result = apiInstance.SearchNrtCalls(nrtCallsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.SearchNrtCalls: " + e.Message );
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
 **nrtCallsRequest** | [**NrtCallsRequest**](NrtCallsRequest.md)| Criteria to search for NRT calls. Select one mode of search. | 

### Return type
[**NrtCallsResponse**](NrtCallsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The active calls happening at the moment, matching the specified criteria. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization.  |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


