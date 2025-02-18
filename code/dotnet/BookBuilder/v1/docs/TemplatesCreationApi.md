# FactSet.SDK.BookBuilder.Api.TemplatesCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateTemplate**](TemplatesCreationApi.md#createtemplate) | **POST** /create-template | Kick off request to create template with reports of your choice



<a name="createtemplate"></a>
# **CreateTemplate**
> EnableTemplateInfoPost CreateTemplate (CreateTemplatePostRequest createTemplatePostRequest)

Kick off request to create template with reports of your choice

This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.BookBuilder.Api;
using FactSet.SDK.BookBuilder.Client;
using FactSet.SDK.BookBuilder.Model;

namespace Example
{
    public class CreateTemplateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.BookBuilder.Client.Configuration();

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

            var apiInstance = new TemplatesCreationApi(config);

            var createTemplatePostRequest = new CreateTemplatePostRequest(); // CreateTemplatePostRequest | 

            try
            {
                // Kick off request to create template with reports of your choice
                EnableTemplateInfoPost result = apiInstance.CreateTemplate(createTemplatePostRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TemplatesCreationApi.CreateTemplate: " + e.Message );
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
 **createTemplatePostRequest** | [**CreateTemplatePostRequest**](CreateTemplatePostRequest.md)|  | 

### Return type
[**EnableTemplateInfoPost**](EnableTemplateInfoPost.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains book name and book ID |  -  |
| **400** | Invalid template type/section_id/report_id |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


