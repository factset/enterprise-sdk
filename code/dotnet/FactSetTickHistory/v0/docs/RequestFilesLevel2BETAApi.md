# FactSet.SDK.FactSetTickHistory.Api.RequestFilesLevel2BETAApi

All URIs are relative to *https://api.factset.com/bulk-documents/tick-history/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetrequestIdLevel2**](RequestFilesLevel2BETAApi.md#getrequestidlevel2) | **GET** /level2/request-files | Returns the requestId and status



<a name="getrequestidlevel2"></a>
# **GetrequestIdLevel2**
> Level2RequestFilesResponse GetrequestIdLevel2 (List<string> ticker, DateTime startDate, DateTime endDate, string mic, string responseFileType = null)

Returns the requestId and status

Returns the requestId and status.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class GetrequestIdLevel2Example
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new RequestFilesLevel2BETAApi(config);

            var ticker = new List<string>(); // List<string> | The requested list of one or more Market tickers.
            var startDate = DateTime.Parse("2023-01-01");  // DateTime | The date to which data is required.
            var endDate = DateTime.Parse("2023-01-30");  // DateTime | The date to which data is required.
            var mic = "XNYS";  // string | This parameter is used to filter the results based on the exchange code. <p>**NOTE**:Does not support multiple mic codes</p>
            var responseFileType = "csv";  // string | Specifies the fileType (optional)  (default to parquet)

            try
            {
                // Returns the requestId and status
                Level2RequestFilesResponse result = apiInstance.GetrequestIdLevel2(ticker, startDate, endDate, mic, responseFileType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RequestFilesLevel2BETAApi.GetrequestIdLevel2: " + e.Message );
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
 **ticker** | [**List&lt;string&gt;**](string.md)| The requested list of one or more Market tickers. | 
 **startDate** | **DateTime**| The date to which data is required. | 
 **endDate** | **DateTime**| The date to which data is required. | 
 **mic** | **string**| This parameter is used to filter the results based on the exchange code. &lt;p&gt;**NOTE**:Does not support multiple mic codes&lt;/p&gt; | 
 **responseFileType** | **string**| Specifies the fileType | [optional] [default to parquet]

### Return type
[**Level2RequestFilesResponse**](Level2RequestFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successs |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


