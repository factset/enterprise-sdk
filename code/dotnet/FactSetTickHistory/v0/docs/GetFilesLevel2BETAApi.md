# FactSet.SDK.FactSetTickHistory.Api.GetFilesLevel2BETAApi

All URIs are relative to *https://api.factset.com/bulk-documents/tick-history/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTickHistoryFilesLevel2**](GetFilesLevel2BETAApi.md#gettickhistoryfileslevel2) | **GET** /level2/get-files | Returns the files for the requested requestId



<a name="gettickhistoryfileslevel2"></a>
# **GetTickHistoryFilesLevel2**
> GetFilesResponseLevel2 GetTickHistoryFilesLevel2 (string requestId, int? paginationLimit = null, int? paginationOffset = null)

Returns the files for the requested requestId

Plugin the requestId from request-files endpoint to get-files endpoint

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
    public class GetTickHistoryFilesLevel2Example
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

            var apiInstance = new GetFilesLevel2BETAApi(config);

            var requestId = "requestId_example";  // string | RequestId returned by request-files endpoint to poll and collect results of the query
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per response page (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)

            try
            {
                // Returns the files for the requested requestId
                GetFilesResponseLevel2 result = apiInstance.GetTickHistoryFilesLevel2(requestId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GetFilesLevel2BETAApi.GetTickHistoryFilesLevel2: " + e.Message );
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
 **requestId** | **string**| RequestId returned by request-files endpoint to poll and collect results of the query | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type
[**GetFilesResponseLevel2**](GetFilesResponseLevel2.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


