# FactSet.SDK.AnalyticsDatastore.Api.SwivelApi

All URIs are relative to *https://api-sandbox.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSwivelEndpoint**](SwivelApi.md#getswivelendpoint) | **GET** /analytics/pub-datastore/swivel/v1/{pubDoc}/{assetName}/{reportId}/{tileId}/{accountId} | Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.


<a name="getswivelendpoint"></a>
# **GetSwivelEndpoint**
> List&lt;string&gt; GetSwivelEndpoint (string pubDoc, string assetName, string reportId, string tileId, string accountId)

Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetSwivelEndpointExample
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

            var apiInstance = new SwivelApi(config);
            var pubDoc = "\"Analytics_Datastore\"";  // string | The publisher document containing the report (default to "Analytics_Datastore")
            var assetName = "\"ADS_Demo.PA3\"";  // string | The PA/SPAR asset name and extension (default to "ADS_Demo.PA3")
            var reportId = "\"report7\"";  // string | The PA/SPAR report ID (default to "report7")
            var tileId = "\"tile0\"";  // string | The PA/SPAR tile ID (default to "tile0")
            var accountId = "\"LARGE_CORE\"";  // string | The account ID (default to "LARGE_CORE")

            try
            {
                // Get Swivel endpoint, takes report parameter inputs and returns the Cargo location for the specified report via a 302 redirect.
                List<string> result = apiInstance.GetSwivelEndpoint(pubDoc, assetName, reportId, tileId, accountId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SwivelApi.GetSwivelEndpoint: " + e.Message );
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
 **pubDoc** | **string**| The publisher document containing the report | [default to &quot;Analytics_Datastore&quot;]
 **assetName** | **string**| The PA/SPAR asset name and extension | [default to &quot;ADS_Demo.PA3&quot;]
 **reportId** | **string**| The PA/SPAR report ID | [default to &quot;report7&quot;]
 **tileId** | **string**| The PA/SPAR tile ID | [default to &quot;tile0&quot;]
 **accountId** | **string**| The account ID | [default to &quot;LARGE_CORE&quot;]

### Return type
**List<string>**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: headers


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response (when redirect followed), returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/pub-datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

