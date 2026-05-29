# FactSet.SDK.NaturalLanguageProcessing.Api.AdvancedApi

All URIs are relative to *https://api.factset.com/aiml/ner/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostAdvancedNerExtraction**](AdvancedApi.md#postadvancednerextraction) | **POST** /advanced | Advanced Processing



<a name="postadvancednerextraction"></a>
# **PostAdvancedNerExtraction**
> OutputRoot PostAdvancedNerExtraction (AdvancedRequestRoot advancedRequestRoot, string model = null)

Advanced Processing

NER endpoint optimized for accuracy and entity coverage, supports single-input processing. Supports financial entity types such as cryptocurrency, index, rate, yield, commodity, currency, future, fund, asset, and debt instrument in addition to Express entity types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class PostAdvancedNerExtractionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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
            var model = "openai.gpt-5.2-2025-12-11";  // string | Optional override for the Advanced model backend. (optional)  (default to meta.llama-4-scout-instruct)

            try
            {
                // Advanced Processing
                OutputRoot result = apiInstance.PostAdvancedNerExtraction(advancedRequestRoot, model);
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
 **model** | **string**| Optional override for the Advanced model backend. | [optional] [default to meta.llama-4-scout-instruct]

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
| **403** | Forbidden |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


