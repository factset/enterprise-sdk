# FactSet.SDK.IssueTracker.Api.AttachmentApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFileAttachment**](AttachmentApi.md#getfileattachment) | **GET** /attachments/{id}/{name} | get the matched file attachment
[**GetFileExtensions**](AttachmentApi.md#getfileextensions) | **GET** /attachments/file-extensions | Allowed file types GET endpoint
[**PostFileAttachment**](AttachmentApi.md#postfileattachment) | **POST** /attachments | Post file attachment to Issue Tracker Issue or comment



<a name="getfileattachment"></a>
# **GetFileAttachment**
> System.IO.Stream GetFileAttachment (string id, string name)

get the matched file attachment

It retreive matched file. However, File read won't work until it used in any issue tracker issue/comment.     Note: the Accept header gets ignored and the originally uploaded content-type is returned

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IssueTracker.Api;
using FactSet.SDK.IssueTracker.Client;
using FactSet.SDK.IssueTracker.Model;

namespace Example
{
    public class GetFileAttachmentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IssueTracker.Client.Configuration();

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

            var apiInstance = new AttachmentApi(config);

            var id = "id_example";  // string | identity value of file attachment
            var name = "name_example";  // string | name of the file

            try
            {
                // get the matched file attachment
                System.IO.Stream result = apiInstance.GetFileAttachment(id, name);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AttachmentApi.GetFileAttachment: " + e.Message );
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
 **id** | **string**| identity value of file attachment | 
 **name** | **string**| name of the file | 

### Return type
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/bmp, image/png, image/gif, image/jpeg, application/pdf, text/csv, application/vnd.openxmlformats-officedocument.wordprocessingml.document, text/plain, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/x-r-source, application/x-dosexec, text/html, application/xml, application/sql, application/vnd.ms-officetheme, application/msword, application/vnd.openxmlformats-officedocument.wordprocessingml.template, application/vnd.openxmlformats-officedocument.presentationml.template, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/zip, application/x-7z-compressed, application/octet-stream, text/tab-separated-values, application/x-iwork-keynote, application/vnd.ms-word.document.macroEnabled.12, application/vnd.ms-word.template.macroEnabled.12, application/vnd.ms-excel.sheet.macroEnabled.12, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfileextensions"></a>
# **GetFileExtensions**
> FileExtension GetFileExtensions ()

Allowed file types GET endpoint

This will provide information about file extensions allowed to attachments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IssueTracker.Api;
using FactSet.SDK.IssueTracker.Client;
using FactSet.SDK.IssueTracker.Model;

namespace Example
{
    public class GetFileExtensionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IssueTracker.Client.Configuration();

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

            var apiInstance = new AttachmentApi(config);


            try
            {
                // Allowed file types GET endpoint
                FileExtension result = apiInstance.GetFileExtensions();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AttachmentApi.GetFileExtensions: " + e.Message );
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
[**FileExtension**](FileExtension.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postfileattachment"></a>
# **PostFileAttachment**
> AttachmentResponse PostFileAttachment (System.IO.Stream file)

Post file attachment to Issue Tracker Issue or comment

  This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call.     File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review \"attachments/file-extensions\" endpoint for list allowed file types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IssueTracker.Api;
using FactSet.SDK.IssueTracker.Client;
using FactSet.SDK.IssueTracker.Model;

namespace Example
{
    public class PostFileAttachmentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IssueTracker.Client.Configuration();

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

            var apiInstance = new AttachmentApi(config);

            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | input file for upload

            try
            {
                // Post file attachment to Issue Tracker Issue or comment
                AttachmentResponse result = apiInstance.PostFileAttachment(file);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AttachmentApi.PostFileAttachment: " + e.Message );
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
 **file** | **System.IO.Stream****System.IO.Stream**| input file for upload | 

### Return type
[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


