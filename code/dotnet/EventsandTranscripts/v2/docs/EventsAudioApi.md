# FactSet.SDK.EventsandTranscripts.Api.EventsAudioApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAudioHistoryFiles**](EventsAudioApi.md#getaudiohistoryfiles) | **GET** /audio/history | Retrieve historical audio recordings and related metadata within FactSet coverage.
[**SearchEventsAudio**](EventsAudioApi.md#searcheventsaudio) | **POST** /audio | Retrieve latest audio recordings and related metadata based on different search criteria.



<a name="getaudiohistoryfiles"></a>
# **GetAudioHistoryFiles**
> EventsAudioHistoryResponse GetAudioHistoryFiles (int year, bool? trimmed = null)

Retrieve historical audio recordings and related metadata within FactSet coverage.

 This endpoint retrieves an object containing a pre-signed URL from which an archive of all audio data for a specified year can be downloaded.  * Returns **untrimmed** historical audio recordings, which include complete audio files such as intro music & non-speaking portions, and related metadata dating back from May 10, 2011 to Sep 30, 2024.  * Returns **trimmed** historical audio recordings, which are audio files with the non-speaking portions removed, and related metadata dating back from May 10, 2011 to Dec 31, 2024. 

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
    public class GetAudioHistoryFilesExample
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
                EventsAudioHistoryResponse result = apiInstance.GetAudioHistoryFiles(year, trimmed);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.GetAudioHistoryFiles: " + e.Message );
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
[**EventsAudioHistoryResponse**](EventsAudioHistoryResponse.md)

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


<a name="searcheventsaudio"></a>
# **SearchEventsAudio**
> AudioResponse SearchEventsAudio (AudioRequest audioRequest)

Retrieve latest audio recordings and related metadata based on different search criteria.

Retrieves the most recent audio recordings and their metadata based on various criteria like date range, upload time, file name, or specific IDs. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object. 

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
    public class SearchEventsAudioExample
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

            var audioRequest = new AudioRequest(); // AudioRequest | Criteria to search for audio files. Select one mode of search.

            try
            {
                // Retrieve latest audio recordings and related metadata based on different search criteria.
                AudioResponse result = apiInstance.SearchEventsAudio(audioRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsAudioApi.SearchEventsAudio: " + e.Message );
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
 **audioRequest** | [**AudioRequest**](AudioRequest.md)| Criteria to search for audio files. Select one mode of search. | 

### Return type
[**AudioResponse**](AudioResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest audio recordings matching the specified criteria. |  -  |
| **400** | Bad Request. This can occur for several reasons, including invalid parameter combinations or malformed JSON. Please review the \&quot;details\&quot; for more information. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


