# FactSet.SDK.DocumentsDistributorCallStreetEvents.Api.EventsAudioApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDocsDistributorAudioV1ListFiles**](EventsAudioApi.md#getdocsdistributoraudiov1listfiles) | **GET** /docs-distributor/audio/v1/list-files | Retrieve audio recordings and metadata within FactSet coverage


<a name="getdocsdistributoraudiov1listfiles"></a>
# **GetDocsDistributorAudioV1ListFiles**
> EventsAudio GetDocsDistributorAudioV1ListFiles (string sort = null, int? paginationLimit = null, DateTime? startDate = null, int? paginationOffset = null, DateTime? endDate = null, int? reportId = null, string ids = null, string sourceCode = null, string fileName = null, bool? trimmed = null, int? uploadTime = null)

Retrieve audio recordings and metadata within FactSet coverage

Gets the latest 25 audio files. Parameters can be used to filter and narrow down the results

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

            var apiInstance = new EventsAudioApi(config);
            var sort = "-startDate";  // string | Sorts results in chronological order, reverse chronological order and by uploadTime(latest uploaded first). Results are in reverse chronological order by default. (optional)  (default to -startDate)
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page. [ Min=0 ; Max=500 ] (optional) 
            var startDate = DateTime.Parse("2013-10-20");  // DateTime? | Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)' (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 
            var endDate = DateTime.Parse("2013-10-20");  // DateTime? | Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) (optional) 
            var reportId = 56;  // int? | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event (optional) 
            var ids = "ids_example";  // string | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier (optional) 
            var sourceCode = "P";  // string | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P = Phone * W = Webcast * V = Vendor * I = Webcast Replay * F = Flash - identical to webcast; can merge with \"W\" in the future * R = Replay (Phone Replay) (optional) 
            var fileName = "fileName_example";  // string | This parameter is used to filter the data on based on the file name. (optional) 
            var trimmed = true;  // bool? | This parameters helps to search trimmed audio files (optional) 
            var uploadTime = 56;  // int? | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168  While using uploadTime, the startDate and endDate parameters will be ignored (optional) 

            try
            {
                // Retrieve audio recordings and metadata within FactSet coverage
                EventsAudio result = apiInstance.GetDocsDistributorAudioV1ListFiles(sort, paginationLimit, startDate, paginationOffset, endDate, reportId, ids, sourceCode, fileName, trimmed, uploadTime);
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
 **paginationLimit** | **int?**| Specifies the number of results to return per page. [ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] 
 **startDate** | **DateTime?**| Used in conjuction with endDate. The earliest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: -1 for yesterday)&#39; | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 
 **endDate** | **DateTime?**| Used in conjuction with startDate. The latest date of the audio file the API should fetch for (can be in absolute: YYYY-MM-DD or relative date: 0 for today) | [optional] 
 **reportId** | **int?**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event | [optional] 
 **ids** | **string**| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier | [optional] 
 **sourceCode** | **string**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
 **fileName** | **string**| This parameter is used to filter the data on based on the file name. | [optional] 
 **trimmed** | **bool?**| This parameters helps to search trimmed audio files | [optional] 
 **uploadTime** | **int?**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168  While using uploadTime, the startDate and endDate parameters will be ignored | [optional] 

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

