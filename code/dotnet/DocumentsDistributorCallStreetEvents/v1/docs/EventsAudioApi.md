# FactSet.SDK.DocumentsDistributorCallStreetEvents.Api.EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getdocsdistributoraudiov1historyfiles) | **GET** /docs-distributor/audio/v1/history-files | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**GetDocsDistributorAudioV1ListFiles**](EventsAudioApi.md#getdocsdistributoraudiov1listfiles) | **GET** /docs-distributor/audio/v1/list-files | Retrieve latest audio recordings and related metadata within FactSet coverage.



<a name="getdocsdistributoraudiov1historyfiles"></a>
# **GetDocsDistributorAudioV1HistoryFiles**
> EventsAudioHistory GetDocsDistributorAudioV1HistoryFiles (int? paginationLimit = null, int? paginationOffset = null, int? year = null)

Retrieve historical audio recordings and related metadata within FactSet coverage.

Returns the historical audio recordings and related metadata dating back from May 10, 2011 to Sep 30, 2022.  Query parameters can be used to filter and narrow down the results.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Api;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Client;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Model;

namespace Example
{
    public class GetDocsDistributorAudioV1HistoryFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.Configuration();

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

            var apiInstance = new EventsAudioApi(config);

            var paginationLimit = 25;  // int? | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var year = 2021;  // int? | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. (optional) 

            try
            {
                // Retrieve historical audio recordings and related metadata within FactSet coverage.
                EventsAudioHistory result = apiInstance.GetDocsDistributorAudioV1HistoryFiles(paginationLimit, paginationOffset, year);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1HistoryFiles: " + e.Message );
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
 **paginationLimit** | **int?**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **year** | **int?**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved. | [optional] 

### Return type
[**EventsAudioHistory**](EventsAudioHistory.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of presigned downloadable URLs consisting of historical audio recordings with related metadata. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdocsdistributoraudiov1listfiles"></a>
# **GetDocsDistributorAudioV1ListFiles**
> EventsAudio GetDocsDistributorAudioV1ListFiles (string sort = null, int? paginationLimit = null, string startDate = null, int? paginationOffset = null, string endDate = null, int? reportId = null, int? audioSourceId = null, List<string> ids = null, string sourceCode = null, string fileName = null, bool? trimmed = null, int? uploadTime = null)

Retrieve latest audio recordings and related metadata within FactSet coverage.

Returns the latest audio recordings. Query parameters can be used to filter and narrow down the results.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Api;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Client;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Model;

namespace Example
{
    public class GetDocsDistributorAudioV1ListFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.DocumentsDistributorCallStreetEvents.Client.Configuration();

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

            var apiInstance = new EventsAudioApi(config);

            var sort = "-startDate";  // string | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional)  (default to -startDate)
            var paginationLimit = 25;  // int? | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional)  (default to 25)
            var startDate = "2022-01-01T00:00:00.000Z";  // string | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). (optional) 
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var endDate = "2022-06-01T00:00:00.000Z";  // string | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). (optional) 
            var reportId = 2666621;  // int? | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. (optional) 
            var audioSourceId = 56;  // int? | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. (optional) 
            var ids = new List<string>(); // List<string> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. (optional) 
            var sourceCode = "P";  // string | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay) (optional) 
            var fileName = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3";  // string | This parameter is used to filter the data on based on the file name. (optional) 
            var trimmed = true;  // bool? | This parameters helps to search trimmed audio files. (optional) 
            var uploadTime = 56;  // int? | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored. (optional) 

            try
            {
                // Retrieve latest audio recordings and related metadata within FactSet coverage.
                EventsAudio result = apiInstance.GetDocsDistributorAudioV1ListFiles(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, audioSourceId, ids, sourceCode, fileName, trimmed, uploadTime);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1ListFiles: " + e.Message );
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
 **sort** | **string**| Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. | [optional] [default to -startDate]
 **paginationLimit** | **int?**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] [default to 25]
 **startDate** | **string**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **-1** for yesterday). | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **endDate** | **string**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: **YYYY-MM-DD** or relative date: **0** for today). | [optional] 
 **reportId** | **int?**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event. | [optional] 
 **audioSourceId** | **int?**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier. | [optional] 
 **sourceCode** | **string**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
 **fileName** | **string**| This parameter is used to filter the data on based on the file name. | [optional] 
 **trimmed** | **bool?**| This parameters helps to search trimmed audio files. | [optional] 
 **uploadTime** | **int?**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored. | [optional] 

### Return type
[**EventsAudio**](EventsAudio.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of URLs consisting of latest audio recordings and related metadata. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


