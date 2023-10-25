# FactSet.SDK.NaturalLanguageProcessing.Api.NamedEntityRecognitionApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**NerEntities**](NamedEntityRecognitionApi.md#nerentities) | **POST** /ner/entities | Endpoint to detect entities from text



<a name="nerentities"></a>
# **NerEntities**
> NERResponseSchema NerEntities (NERInputSchema nERInputSchema = null)

Endpoint to detect entities from text

Detect entities (People, Places, Organizations, etc.) in plain text

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.NaturalLanguageProcessing.Api;
using FactSet.SDK.NaturalLanguageProcessing.Client;
using FactSet.SDK.NaturalLanguageProcessing.Model;

namespace Example
{
    public class NerEntitiesExample
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

            var apiInstance = new NamedEntityRecognitionApi(config);

            var nERInputSchema = new NERInputSchema(); // NERInputSchema |  (optional) 

            try
            {
                // Endpoint to detect entities from text
                NERResponseSchema result = apiInstance.NerEntities(nERInputSchema);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NamedEntityRecognitionApi.NerEntities: " + e.Message );
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
 **nERInputSchema** | [**NERInputSchema**](NERInputSchema.md)|  | [optional] 

### Return type
[**NERResponseSchema**](NERResponseSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Validation error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


