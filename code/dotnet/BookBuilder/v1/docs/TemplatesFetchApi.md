# FactSet.SDK.BookBuilder.Api.TemplatesFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTemplateList**](TemplatesFetchApi.md#gettemplatelist) | **GET** /template-list | Retrieves the list of templates that are available



<a name="gettemplatelist"></a>
# **GetTemplateList**
> List&lt;TemplateInfo&gt; GetTemplateList ()

Retrieves the list of templates that are available

A template is a predefined list of content to be compiled in a PDF. This end point works without any parameters and retrieves the list of templates available for the user. Templates need to defined/created in FactSet workstation.

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
    public class GetTemplateListExample
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

            var apiInstance = new TemplatesFetchApi(config);


            try
            {
                // Retrieves the list of templates that are available
                List<TemplateInfo> result = apiInstance.GetTemplateList();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TemplatesFetchApi.GetTemplateList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**List&lt;TemplateInfo&gt;**](TemplateInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains an array with template name, template ID, created date, template source and template type |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


