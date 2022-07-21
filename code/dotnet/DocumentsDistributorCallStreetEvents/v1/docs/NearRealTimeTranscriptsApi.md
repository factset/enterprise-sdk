# FactSet.SDK.DocumentsDistributorCallStreetEvents.Api.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
[**GetBulkDocumentsNrtV1IndexedNrt**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1indexednrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**GetBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1listsnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call
[**GetBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.


<a name="getbulkdocumentsnrtv1calls"></a>
# **GetBulkDocumentsNrtV1Calls**
> NRTCalls GetBulkDocumentsNrtV1Calls (string sort = null, int? reportId = null, int? audioSourceId = null, string entityId = null, string ticker = null, string callStatus = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the active calls happening at the moment

Returns the active calls happening at the moment

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
    public class GetBulkDocumentsNrtV1CallsExample
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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var sort = "startDate";  // string | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used (optional)  (default to -startDate)
            var reportId = 56;  // int? | Unique identifier for an event (optional) 
            var audioSourceId = 56;  // int? | Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. (optional) 
            var entityId = "entityId_example";  // string | Factset entity level identifier for the company hosting the event (optional) 
            var ticker = "ticker_example";  // string | Ticker-region identifier for the company hosting the event (optional) 
            var callStatus = "inProgress";  // string | Status of the call i.e. ended or inProgress or ewn or issueAtSource (optional) 
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the active calls happening at the moment
                NRTCalls result = apiInstance.GetBulkDocumentsNrtV1Calls(sort, reportId, audioSourceId, entityId, ticker, callStatus, paginationLimit, paginationOffset);
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
 **sort** | **string**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used | [optional] [default to -startDate]
 **reportId** | **int?**| Unique identifier for an event | [optional] 
 **audioSourceId** | **int?**| Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. | [optional] 
 **entityId** | **string**| Factset entity level identifier for the company hosting the event | [optional] 
 **ticker** | **string**| Ticker-region identifier for the company hosting the event | [optional] 
 **callStatus** | **string**| Status of the call i.e. ended or inProgress or ewn or issueAtSource | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type
[**NRTCalls**](NRTCalls.md)

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

<a name="getbulkdocumentsnrtv1indexednrt"></a>
# **GetBulkDocumentsNrtV1IndexedNrt**
> IndexedNRT GetBulkDocumentsNrtV1IndexedNrt (int audioSourceId, int? reportId = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

Returns the  indexed transcript data  in small increments throughout the duration of an active call.

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
    public class GetBulkDocumentsNrtV1IndexedNrtExample
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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 56;  // int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
            var reportId = 56;  // int? | Unique identifier for an event (optional) 
            var paginationLimit = 56;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=50 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the  indexed transcript data  in small increments throughout the duration of an active call.
                IndexedNRT result = apiInstance.GetBulkDocumentsNrtV1IndexedNrt(audioSourceId, reportId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1IndexedNrt: " + e.Message );
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. | 
 **reportId** | **int?**| Unique identifier for an event | [optional] 
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type
[**IndexedNRT**](IndexedNRT.md)

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

<a name="getbulkdocumentsnrtv1listsnippets"></a>
# **GetBulkDocumentsNrtV1ListSnippets**
> NRTSnippets GetBulkDocumentsNrtV1ListSnippets (int audioSourceId, int? reportId = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the latest transcript snippets from an active call

Returns the latest snippets from an active call

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
    public class GetBulkDocumentsNrtV1ListSnippetsExample
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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 56;  // int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
            var reportId = 56;  // int? | Unique identifier for an event (optional) 
            var paginationLimit = 56;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the latest transcript snippets from an active call
                NRTSnippets result = apiInstance.GetBulkDocumentsNrtV1ListSnippets(audioSourceId, reportId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1ListSnippets: " + e.Message );
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. | 
 **reportId** | **int?**| Unique identifier for an event | [optional] 
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type
[**NRTSnippets**](NRTSnippets.md)

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

<a name="getbulkdocumentsnrtv1speakerids"></a>
# **GetBulkDocumentsNrtV1Speakerids**
> NRTSpeakerids GetBulkDocumentsNrtV1Speakerids (int audioSourceId, string sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the latest speakerIds with the confidence scores generated for an active call.

Returns the latest speakerIds with the cosine scores(confidence scores) generated for an active call.

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
    public class GetBulkDocumentsNrtV1SpeakeridsExample
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

            var apiInstance = new NearRealTimeTranscriptsApi(config);

            var audioSourceId = 56;  // int | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. 
            var sort = "startDate";  // string | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used (optional)  (default to startDate)
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the latest speakerIds with the confidence scores generated for an active call.
                NRTSpeakerids result = apiInstance.GetBulkDocumentsNrtV1Speakerids(audioSourceId, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1Speakerids: " + e.Message );
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
 **audioSourceId** | **int**| The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids.  | 
 **sort** | **string**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used | [optional] [default to startDate]
 **paginationLimit** | **int?**| Specifies the number of results to return per page.[ Min&#x3D;0 ; Max&#x3D;500 ] | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 

### Return type
[**NRTSpeakerids**](NRTSpeakerids.md)

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

