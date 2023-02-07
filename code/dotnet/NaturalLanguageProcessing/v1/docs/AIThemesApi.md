# FactSet.SDK.NaturalLanguageProcessing.Api.AIThemesApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**Themes**](AIThemesApi.md#themes) | **POST** /themes | Endpoint to extract themes from text


<a name="themes"></a>
# **Themes**
> ThemesRoot Themes (ThemeParametersRoot themeParametersRoot)

Endpoint to extract themes from text

This endpoint extracts themes from unstructured text. Each theme (`themeText`) is also given a score (`themeScore`). This score shows the relevancy of the theme within the text. Example Output: ```json {   \"data\": [   {     \"themeText\": \"home entertainment results\",     \"themeScore\": 0.92   },   {     \"themeText\": \".....\",     \"themeScore\": .....   }] } ``` 

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
    public class ThemesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.NaturalLanguageProcessing.Client.Configuration();

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

            var apiInstance = new AIThemesApi(config);

            var themeParametersRoot = new ThemeParametersRoot(); // ThemeParametersRoot | 

            try
            {
                // Endpoint to extract themes from text
                ThemesRoot result = apiInstance.Themes(themeParametersRoot);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AIThemesApi.Themes: " + e.Message );
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
 **themeParametersRoot** | [**ThemeParametersRoot**](ThemeParametersRoot.md)|  | 

### Return type
[**ThemesRoot**](ThemesRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, generated themes |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **400** | The browser (or proxy) sent a request that this server could not understand. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **403** | You don&#39;t have the permission to access the requested resource. It is either read-protected or not readable by the server. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |
| **503** | The server is temporarily unable to service your request due to maintenance downtime or capacity problems. Please try again later. |  * X-FactSet-Api-Request-Key - Key to uniquely identify an API request. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

