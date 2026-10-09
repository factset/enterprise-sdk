# FactSet.SDK.FactSetNER.Api.AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostAdvancedNerExtraction**](AdvancedApi.md#postadvancednerextraction) | **POST** /advanced/extract | Advanced Processing



<a name="postadvancednerextraction"></a>
# **PostAdvancedNerExtraction**
> OutputRoot PostAdvancedNerExtraction (AdvancedRequestRoot advancedRequestRoot)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.  Optionally select a model via `data.model` in the request body. Supported models: - GPT 5.2 - Claude Sonnet 4.6 - Llama 4 Scout Instruct (the default)  Requests are limited to a 30-second timeout. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNER.Api;
using FactSet.SDK.FactSetNER.Client;
using FactSet.SDK.FactSetNER.Model;

namespace Example
{
    public class PostAdvancedNerExtractionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNER.Client.Configuration();

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

            var apiInstance = new AdvancedApi(config);

            var advancedRequestRoot = new AdvancedRequestRoot(); // AdvancedRequestRoot | 

            try
            {
                // Advanced Processing
                OutputRoot result = apiInstance.PostAdvancedNerExtraction(advancedRequestRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AdvancedApi.PostAdvancedNerExtraction: " + e.Message );
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
 **advancedRequestRoot** | [**AdvancedRequestRoot**](AdvancedRequestRoot.md)|  | 

### Return type
[**OutputRoot**](OutputRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful entity extraction |  -  |
| **400** | Invalid request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal server error |  -  |
| **502** | Upstream model gateway error |  -  |
| **504** | Request exceeded the 30-second processing timeout |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


