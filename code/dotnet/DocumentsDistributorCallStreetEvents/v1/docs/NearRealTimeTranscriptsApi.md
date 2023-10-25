# FactSet.SDK.DocumentsDistributorCallStreetEvents.Api.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment.
[**GetBulkDocumentsNrtV1IndexedNrt**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1indexednrt) | **GET** /bulk-documents/nrt/v1/indexed-nrt | Returns the  indexed transcript data  in small increments throughout the duration of an active call.
[**GetBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1listsnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest transcript snippets from an active call.
[**GetBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.



<a name="getbulkdocumentsnrtv1calls"></a>
# **GetBulkDocumentsNrtV1Calls**
> NRTCalls GetBulkDocumentsNrtV1Calls (int? paginationLimit = null, int? paginationOffset = null, int? audioSourceId = null, int? reportId = null, string sort = null, string entityId = null, string ticker = null, string callStatus = null)

Returns the active calls happening at the moment.

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

            var paginationLimit = 200;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional)  (default to 200)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var audioSourceId = 471849;  // int? | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. (optional) 
            var reportId = 2683372;  // int? | Unique identifier for an event. (optional) 
            var sort = "startDate";  // string | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var entityId = "000CGP-E";  // string | Factset entity level identifier for the company hosting the event. (optional) 
            var ticker = "AZZ-US";  // string | Ticker-region identifier for the company hosting the event. (optional) 
            var callStatus = "inProgress";  // string | Status of the call i.e. ended or inProgress or ewn or issueAtSource. (optional) 

            try
            {
                // Returns the active calls happening at the moment.
                NRTCalls result = apiInstance.GetBulkDocumentsNrtV1Calls(paginationLimit, paginationOffset, audioSourceId, reportId, sort, entityId, ticker, callStatus);
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
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **audioSourceId** | **int?**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | [optional] 
 **reportId** | **int?**| Unique identifier for an event. | [optional] 
 **sort** | **string**| Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate]
 **entityId** | **string**| Factset entity level identifier for the company hosting the event. | [optional] 
 **ticker** | **string**| Ticker-region identifier for the company hosting the event. | [optional] 
 **callStatus** | **string**| Status of the call i.e. ended or inProgress or ewn or issueAtSource. | [optional] 

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1indexednrt"></a>
# **GetBulkDocumentsNrtV1IndexedNrt**
> IndexedNRT GetBulkDocumentsNrtV1IndexedNrt (int audioSourceId, int? paginationLimit = null, int? paginationOffset = null, int? reportId = null)

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
            var paginationLimit = 25;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=50 ] (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var reportId = 2683372;  // int? | Unique identifier for an event. (optional) 

            try
            {
                // Returns the  indexed transcript data  in small increments throughout the duration of an active call.
                IndexedNRT result = apiInstance.GetBulkDocumentsNrtV1IndexedNrt(audioSourceId, paginationLimit, paginationOffset, reportId);
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;50 ] | [optional] [default to 25]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **int?**| Unique identifier for an event. | [optional] 

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1listsnippets"></a>
# **GetBulkDocumentsNrtV1ListSnippets**
> NRTSnippets GetBulkDocumentsNrtV1ListSnippets (int audioSourceId, int? paginationLimit = null, int? paginationOffset = null, int? reportId = null)

Returns the latest transcript snippets from an active call.

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
            var paginationLimit = 200;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional)  (default to 200)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var reportId = 2683372;  // int? | Unique identifier for an event. (optional) 

            try
            {
                // Returns the latest transcript snippets from an active call.
                NRTSnippets result = apiInstance.GetBulkDocumentsNrtV1ListSnippets(audioSourceId, paginationLimit, paginationOffset, reportId);
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **reportId** | **int?**| Unique identifier for an event. | [optional] 

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbulkdocumentsnrtv1speakerids"></a>
# **GetBulkDocumentsNrtV1Speakerids**
> NRTSpeakerids GetBulkDocumentsNrtV1Speakerids (int audioSourceId, int? paginationLimit = null, int? paginationOffset = null, string sort = null)

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
            var paginationLimit = 200;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=500] (optional)  (default to 200)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)
            var sort = "startDate";  // string | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. (optional)  (default to startDate)

            try
            {
                // Returns the latest speakerIds with the confidence scores generated for an active call.
                NRTSpeakerids result = apiInstance.GetBulkDocumentsNrtV1Speakerids(audioSourceId, paginationLimit, paginationOffset, sort);
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
 **audioSourceId** | **int**| Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSourceIDs. | 
 **paginationLimit** | **int?**| Specifies the  number of results to return per page. [ Min&#x3D;0; Max&#x3D;500] | [optional] [default to 200]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **sort** | **string**| Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used. | [optional] [default to startDate]

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


