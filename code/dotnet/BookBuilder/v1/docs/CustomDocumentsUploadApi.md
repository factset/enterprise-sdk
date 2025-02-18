# FactSet.SDK.BookBuilder.Api.CustomDocumentsUploadApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**UploadCustomDocument**](CustomDocumentsUploadApi.md#uploadcustomdocument) | **POST** /upload-custom-document | Upload a custom document



<a name="uploadcustomdocument"></a>
# **UploadCustomDocument**
> List&lt;Object&gt; UploadCustomDocument (List<System.IO.Stream> file = null)

Upload a custom document

Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB. 

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
    public class UploadCustomDocumentExample
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

            var apiInstance = new CustomDocumentsUploadApi(config);

            var file = new List<System.IO.Stream>(); // List<System.IO.Stream> |  (optional) 

            try
            {
                // Upload a custom document
                List<Object> result = apiInstance.UploadCustomDocument(file);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CustomDocumentsUploadApi.UploadCustomDocument: " + e.Message );
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
 **file** | **List&lt;System.IO.Stream&gt;**|  | [optional] 

### Return type
**List<Object>**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains file name, fileURL of the book uploaded |  -  |
| **400** | Invalid ticker or Unknown error |  -  |
| **401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


