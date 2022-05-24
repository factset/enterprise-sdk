# FactSet.SDK.MarketIntelligence.Api.CreateReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreatePost**](CreateReportApi.md#createpost) | **POST** /create | Create new report templates including portfolio or market news and data.


<a name="createpost"></a>
# **CreatePost**
> PostResponseInfo CreatePost (MIAPIPostRequest mIAPIPostRequest)

Create new report templates including portfolio or market news and data.

Endpoint to create a new Market Intelligence report. If you want to retrieve a report you created, use get-reports call mentioned below.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.MarketIntelligence.Api;
using FactSet.SDK.MarketIntelligence.Client;
using FactSet.SDK.MarketIntelligence.Model;

namespace Example
{
    public class CreatePostExample
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

            var apiInstance = new CreateReportApi(config);
            var mIAPIPostRequest = new MIAPIPostRequest(); // MIAPIPostRequest | 

            try
            {
                // Create new report templates including portfolio or market news and data.
                PostResponseInfo result = apiInstance.CreatePost(mIAPIPostRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CreateReportApi.CreatePost: " + e.Message );
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
 **mIAPIPostRequest** | [**MIAPIPostRequest**](MIAPIPostRequest.md)|  | 

### Return type
[**PostResponseInfo**](PostResponseInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response, report created. |  -  |
| **400** | Invalid identifier or Unknown error |  -  |
| **401** | Missing/invalid Credentials or Authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

