# FactSet.SDK.DocumentsDistributorCallStreetEvents.Api.NearRealTimeTranscriptsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBulkDocumentsNrtV1Calls**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1calls) | **GET** /bulk-documents/nrt/v1/calls | Returns the active calls happening at the moment
[**GetBulkDocumentsNrtV1ListSnippets**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1listsnippets) | **GET** /bulk-documents/nrt/v1/list-snippets | Returns the latest snippets from an active call
[**GetBulkDocumentsNrtV1Speakerids**](NearRealTimeTranscriptsApi.md#getbulkdocumentsnrtv1speakerids) | **GET** /bulk-documents/nrt/v1/speakerids | Returns the latest speakerIds with the confidence scores generated for an active call.


<a name="getbulkdocumentsnrtv1calls"></a>
# **GetBulkDocumentsNrtV1Calls**
> NRTCalls GetBulkDocumentsNrtV1Calls (string sort = null, int? reportId = null, int? audioSourceId = null, string entityId = null, string ticker = null, string callStatus = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the active calls happening at the moment

Returns the active calls happening at the moment

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Api;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Client;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1CallsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new NearRealTimeTranscriptsApi(config);
            var sort = sort_example;  // string | Enables to get the data in chronological or reverse chronological order based on startDate. Results are in reverse chronological order if this parameter is not used (optional)  (default to -startDate)
            var reportId = 56;  // int? | Unique identifier for an event (optional) 
            var audioSourceId = 56;  // int? | Unique Id for an internal recording specific to reportId. For example, reportId X would have multiple recordings from different source (dial-in or webcast).One reportId can have multiple audiosource ids. (optional) 
            var entityId = entityId_example;  // string | Factset entity level identifier for the company hosting the event (optional) 
            var ticker = ticker_example;  // string | Ticker-region identifier for the company hosting the event (optional) 
            var callStatus = callStatus_example;  // string | Status of the call i.e. ended or inProgress or ewn or issueAtSource (optional) 
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the active calls happening at the moment
                NRTCalls result = apiInstance.GetBulkDocumentsNrtV1Calls(sort, reportId, audioSourceId, entityId, ticker, callStatus, paginationLimit, paginationOffset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1Calls: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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

<a name="getbulkdocumentsnrtv1listsnippets"></a>
# **GetBulkDocumentsNrtV1ListSnippets**
> NRTSnippets GetBulkDocumentsNrtV1ListSnippets (int audioSourceId, int? reportId = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the latest snippets from an active call

Returns the latest snippets from an active call

### Example
```csharp
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Api;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Client;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1ListSnippetsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new NearRealTimeTranscriptsApi(config);
            var audioSourceId = 56;  // int | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (dial-in or webcast). One ReportID can have multiple AudioSource ids.
            var reportId = 56;  // int? | Unique identifier for an event (optional) 
            var paginationLimit = 56;  // int? | Specifies the  number of results to return per page. [ Min=0; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the latest snippets from an active call
                NRTSnippets result = apiInstance.GetBulkDocumentsNrtV1ListSnippets(audioSourceId, reportId, paginationLimit, paginationOffset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1ListSnippets: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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
using System.Collections.Generic;
using System.Diagnostics;
using FactSet.SDK.Utils.Authentication;
using Microsoft.IdentityModel.Tokens;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Api;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Client;
using FactSet.SDK.DocumentsDistributorCallStreetEvents.Model;

namespace Example
{
    public class GetBulkDocumentsNrtV1SpeakeridsExample
    {
        public static void Main()
        {
            Configuration config = new Configuration();
            config.BasePath = "https://api.factset.com";
            // Configure HTTP basic authorization: FactSetApiKey
            config.Username = "YOUR_USERNAME";
            config.Password = "YOUR_PASSWORD";
            // Configure OAuth2 access token for authorization: FactSetOAuth2
            config.AccessToken = "YOUR_ACCESS_TOKEN";

            // Configure FactSet Authentication Client to automatically retrieve token for: FactSetOAuth2

            // using path to configuration:
            String pathToConfig = "";   // String contining absolute path to your configuration
            config.OAuth2Client = new ConfidentialClient(pathToConfig);

            // OR

            // If your configuration information is not within a file, you will provide the following information to create a new configuration.
            //   `name` - "Application Name registered with the FactSet Developer Portal",
            //   `clientId` - "Client ID registered with the FactSet Developer Portal",
            //   `clientAuthType` - For confidential client this will be "Confidential",
            //   `owners` - new List<string>() { "Owner ID(s) of this configuration" },
            //   `jwk` - new JsonWebKey(@"{
            //                     'kty': 'RSA',
            //                     'use': 'sig',
            //                     'alg': 'RS256',
            //                     'kid': 'Key ID',
            //                     'd': 'ECC Private Key',
            //                     'n': 'Modulus',
            //                     'e': 'Exponent',
            //                     'p': 'First Prime Factor',
            //                     'q': 'Second Prime Factor',
            //                     'dp': 'First Factor CRT Exponent',
            //                     'dq': 'Second Factor CRT Exponent',
            //                      'qi': 'First CRT Coefficient',
            //           }");

            // `NB`: Within the JWK parameters kty, alg, use, kid, n, e, d, p, q, dp, dq, qi are required for authorization.
            
            var config = new FactSet.SDK.Utils.Authentication.Configuration(name, clientId, clientAuthType, owners, jwk);
            config.OAuth2Client = new ConfidentialClient(config);

            var apiInstance = new NearRealTimeTranscriptsApi(config);
            var audioSourceId = 56;  // int | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. 
            var sort = sort_example;  // string | Enables to get the data in chronological or reverse chronological order. Results are in chronological order if this parameter is not used (optional)  (default to startDate)
            var paginationLimit = 56;  // int? | Specifies the number of results to return per page.[ Min=0 ; Max=500 ] (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 

            try
            {
                // Returns the latest speakerIds with the confidence scores generated for an active call.
                NRTSpeakerids result = apiInstance.GetBulkDocumentsNrtV1Speakerids(audioSourceId, sort, paginationLimit, paginationOffset);
                Debug.WriteLine(result);
            }
            catch (ApiException  e)
            {
                Debug.Print("Exception when calling NearRealTimeTranscriptsApi.GetBulkDocumentsNrtV1Speakerids: " + e.Message );
                Debug.Print("Status Code: "+ e.ErrorCode);
                Debug.Print(e.StackTrace);
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

