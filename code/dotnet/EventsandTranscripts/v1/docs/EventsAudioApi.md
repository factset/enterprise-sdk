# FactSet.SDK.EventsandTranscripts.Api.EventsAudioApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDocsDistributorAudioV1HistoryFiles**](EventsAudioApi.md#getdocsdistributoraudiov1historyfiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**GetDocsDistributorAudioV1ListFilesDate**](EventsAudioApi.md#getdocsdistributoraudiov1listfilesdate) | **GET** /audio/by-date | Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
[**GetDocsDistributorAudioV1ListFilesFileName**](EventsAudioApi.md#getdocsdistributoraudiov1listfilesfilename) | **GET** /audio/by-file-name | Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
[**GetDocsDistributorAudioV1ListFilesIds**](EventsAudioApi.md#getdocsdistributoraudiov1listfilesids) | **GET** /audio/by-ids | Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
[**GetDocsDistributorAudioV1ListFilesUploadTime**](EventsAudioApi.md#getdocsdistributoraudiov1listfilesuploadtime) | **GET** /audio/by-upload-time | Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.



<a name="getdocsdistributoraudiov1historyfiles"></a>
# **GetDocsDistributorAudioV1HistoryFiles**
> EventsAudioHistory GetDocsDistributorAudioV1HistoryFiles (int year, bool? trimmed = null)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2022.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2022. 

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
    public class GetDocsDistributorAudioV1HistoryFilesExample
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

            var apiInstance = new EventsAudioApi(config);

            var year = 2021;  // int | Specifies the year for which the historical audio recordings and related metadata are to be retrieved. 
            var trimmed = false;  // bool? | Specifies if trimmed/untrimmed historical audio recordings should be returned. (optional)  (default to false)

            try
            {
                // Retrieve historical audio recordings and related metadata within FactSet coverage.
                EventsAudioHistory result = apiInstance.GetDocsDistributorAudioV1HistoryFiles(year, trimmed);
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
 **year** | **int**| Specifies the year for which the historical audio recordings and related metadata are to be retrieved.  | 
 **trimmed** | **bool?**| Specifies if trimmed/untrimmed historical audio recordings should be returned. | [optional] [default to false]

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
| **200** | The historical audio recordings based on the provided year. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdocsdistributoraudiov1listfilesdate"></a>
# **GetDocsDistributorAudioV1ListFilesDate**
> EventsAudioDaily GetDocsDistributorAudioV1ListFilesDate (DateTime? startDate = null, DateTime? endDate = null, int? startDateRelative = null, int? endDateRelative = null, string sourceCode = null, List<string> ids = null, bool? trimmed = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.

Retrieves the most recent audio recordings based on specified dates and allows filtering through both source code and Ids.

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
    public class GetDocsDistributorAudioV1ListFilesDateExample
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

            var apiInstance = new EventsAudioApi(config);

            var startDate = DateTime.Parse("2020-10-01");  // DateTime? | The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  (optional) 
            var endDate = DateTime.Parse("2020-12-26");  // DateTime? | The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  (optional) 
            var startDateRelative = 56;  // int? | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional) 
            var endDateRelative = 56;  // int? | The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  - Either `endDate` or `endDateRelative` should be used, but not both. - If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error. - If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.  (optional) 
            var sourceCode = "Phone";  // string | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay (optional) 
            var ids = new List<string>(); // List<string> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional) 
            var trimmed = false;  // bool? | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional)  (default to false)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on startDate.  (optional) 
            var paginationLimit = 25;  // int? | Specifies the number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Retrieve latest audio recordings and related metadata within FactSet coverage based on a specific date ranges.
                EventsAudioDaily result = apiInstance.GetDocsDistributorAudioV1ListFilesDate(startDate, endDate, startDateRelative, endDateRelative, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1ListFilesDate: " + e.Message );
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
 **startDate** | **DateTime?**| The earliest date of the audio file the API should fetch for.  - Format: Should be absolute (YYYY-MM-DD).  | [optional] 
 **endDate** | **DateTime?**| The latest date of the audio file the API should fetch for. - Format: Should be absolute (YYYY-MM-DD).  | [optional] 
 **startDateRelative** | **int?**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **endDateRelative** | **int?**| The latest date of the feed file the API should fetch based on the file timestamp.   Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  - Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both. - If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error. - If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.  | [optional] 
 **sourceCode** | **string**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional] 
 **trimmed** | **bool?**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided date ranges. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdocsdistributoraudiov1listfilesfilename"></a>
# **GetDocsDistributorAudioV1ListFilesFileName**
> EventsAudioDailyFileName GetDocsDistributorAudioV1ListFilesFileName (string fileName = null)

Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.

Retrieves the latest audio recordings corresponding to the provided file name.

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
    public class GetDocsDistributorAudioV1ListFilesFileNameExample
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

            var apiInstance = new EventsAudioApi(config);

            var fileName = "835A1FD9-3CE1-EC11-8128-8CDCD4AF21E4.mp3";  // string | This parameter is used to filter the data on based on the file name. (optional) 

            try
            {
                // Retrieve latest audio recordings and related metadata within FactSet coverage based on file name.
                EventsAudioDailyFileName result = apiInstance.GetDocsDistributorAudioV1ListFilesFileName(fileName);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1ListFilesFileName: " + e.Message );
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
 **fileName** | **string**| This parameter is used to filter the data on based on the file name. | [optional] 

### Return type
[**EventsAudioDailyFileName**](EventsAudioDailyFileName.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided file name. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdocsdistributoraudiov1listfilesids"></a>
# **GetDocsDistributorAudioV1ListFilesIds**
> EventsAudioDailyIds GetDocsDistributorAudioV1ListFilesIds (int? reportId = null, int? audioSourceId = null, bool? trimmed = null)

Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.

Retrieves the latest audio recordings based on the provided report ID and audio source ID.

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
    public class GetDocsDistributorAudioV1ListFilesIdsExample
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

            var apiInstance = new EventsAudioApi(config);

            var reportId = 3015749;  // int? | Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  (optional) 
            var audioSourceId = 594948;  // int? | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  (optional) 
            var trimmed = false;  // bool? | This parameters helps to search trimmed audio files. (optional)  (default to false)

            try
            {
                // Retrieve the latest audio recordings along with their corresponding metadata from the FactSet coverage based on specific IDs.
                EventsAudioDailyIds result = apiInstance.GetDocsDistributorAudioV1ListFilesIds(reportId, audioSourceId, trimmed);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1ListFilesIds: " + e.Message );
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
 **reportId** | **int?**| Unique identifier for fetching the audio file for an event. The same ID is used for the transcript of the same event.  | [optional] 
 **audioSourceId** | **int?**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (phone or webcast or vendor or replay). One ReportID can have multiple AudioSourceIDs.  | [optional] 
 **trimmed** | **bool?**| This parameters helps to search trimmed audio files. | [optional] [default to false]

### Return type
[**EventsAudioDailyIds**](EventsAudioDailyIds.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided report ID and audio source ID. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdocsdistributoraudiov1listfilesuploadtime"></a>
# **GetDocsDistributorAudioV1ListFilesUploadTime**
> EventsAudioDaily GetDocsDistributorAudioV1ListFilesUploadTime (int? uploadTime = null, string sourceCode = null, List<string> ids = null, bool? trimmed = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.

Returns the latest audio recordings based on upload time and allows filtering through both source code and Ids.

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
    public class GetDocsDistributorAudioV1ListFilesUploadTimeExample
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

            var apiInstance = new EventsAudioApi(config);

            var uploadTime = -20;  // int? | This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime = -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime= -1  Maximum is 1 week/168 hours i.e., uploadTime=-168 (optional) 
            var sourceCode = "Phone";  // string | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone = Originated from phone call * Webcast = Originated from a webcast * Vendor = Received from vendor * WebcastReplay = Replay of a webcast * Flash = Identical to webcast; can merge with \"Webcast\" in the future * Replay = Phone replay (optional) 
            var ids = new List<string>(); // List<string> | This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  (optional) 
            var trimmed = false;  // bool? | This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  (optional)  (default to false)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on uploadTime.  (optional) 
            var paginationLimit = 25;  // int? | Specifies the number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Retrieve latest audio recordings and related metadata within FactSet coverage based on upload time.
                EventsAudioDaily result = apiInstance.GetDocsDistributorAudioV1ListFilesUploadTime(uploadTime, sourceCode, ids, trimmed, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetDocsDistributorAudioV1ListFilesUploadTime: " + e.Message );
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
 **uploadTime** | **int?**| This parameter filters data based on uploadTime relative to the current time, in hours. For example:- uploadTime &#x3D; -15 (fetches audio files between 15 hours ago and now)  Minimum is 1 hour i.e., uploadTime&#x3D; -1  Maximum is 1 week/168 hours i.e., uploadTime&#x3D;-168 | [optional] 
 **sourceCode** | **string**| This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| This parameter filters the results based on ticker-region or Entity ID or the combination of both. A comma is used to separate each identifier.  | [optional] 
 **trimmed** | **bool?**| This parameter helps to search for trimmed audio files, with the non-speaking portions removed, and related metadata. The data ranges from May 10, 2011 to Dec 31, 2022.  | [optional] [default to false]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on uploadTime.  | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**EventsAudioDaily**](EventsAudioDaily.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings based on the provided upload time, source code and IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;details\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


