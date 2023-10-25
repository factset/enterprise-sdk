# FactSet.SDK.IRNMeetings.Api.CommentsApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateComment**](CommentsApi.md#createcomment) | **POST** /v1/meetings/{meetingId}/comments | Create a comment to a Meeting
[**CreateCommentAttachment**](CommentsApi.md#createcommentattachment) | **POST** /v1/meetings/{meetingId}/comments/{commentId}/attachments | Create a comment attachment to a Meeting
[**DeleteComment**](CommentsApi.md#deletecomment) | **DELETE** /v1/meetings/{meetingId}/comments/{commentId} | Delete a Comment from a Meeting
[**DownloadCommentAttachmentForComment**](CommentsApi.md#downloadcommentattachmentforcomment) | **GET** /v1/meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download | Download single attachment detail of a comment belonging to a meeting
[**GetComment**](CommentsApi.md#getcomment) | **GET** /v1/meetings/{meetingId}/comments/{commentId} | Get details of a comment belonging to a meeting
[**GetCommentAttachments**](CommentsApi.md#getcommentattachments) | **GET** /v1/meetings/{meetingId}/comments/{commentId}/attachments | Get attachments summary of a comment belonging to a meeting
[**GetComments**](CommentsApi.md#getcomments) | **GET** /v1/meetings/{meetingId}/comments | Get all comments for a meeting
[**PatchComment**](CommentsApi.md#patchcomment) | **PATCH** /v1/meetings/{meetingId}/comments/{commentId} | Edit a comment for a meeting



<a name="createcomment"></a>
# **CreateComment**
> NewItemDto CreateComment (Guid meetingId, CreateCommentDto createCommentDto = null)

Create a comment to a Meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class CreateCommentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var createCommentDto = new CreateCommentDto(); // CreateCommentDto |  (optional) 

            try
            {
                // Create a comment to a Meeting
                NewItemDto result = apiInstance.CreateComment(meetingId, createCommentDto);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.CreateComment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **createCommentDto** | [**CreateCommentDto**](CreateCommentDto.md)|  | [optional] 

### Return type
[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="createcommentattachment"></a>
# **CreateCommentAttachment**
> NewItemDto CreateCommentAttachment (Guid meetingId, Guid commentId, System.IO.Stream file)

Create a comment attachment to a Meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class CreateCommentAttachmentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 
            var file = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | 

            try
            {
                // Create a comment attachment to a Meeting
                NewItemDto result = apiInstance.CreateCommentAttachment(meetingId, commentId, file);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.CreateCommentAttachment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 
 **file** | **System.IO.Stream****System.IO.Stream**|  | 

### Return type
[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletecomment"></a>
# **DeleteComment**
> void DeleteComment (Guid meetingId, Guid commentId)

Delete a Comment from a Meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class DeleteCommentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 

            try
            {
                // Delete a Comment from a Meeting
                apiInstance.DeleteComment(meetingId, commentId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.DeleteComment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="downloadcommentattachmentforcomment"></a>
# **DownloadCommentAttachmentForComment**
> void DownloadCommentAttachmentForComment (Guid meetingId, Guid commentId, Guid attachmentId)

Download single attachment detail of a comment belonging to a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class DownloadCommentAttachmentForCommentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 
            var attachmentId = "attachmentId_example";  // Guid | 

            try
            {
                // Download single attachment detail of a comment belonging to a meeting
                apiInstance.DownloadCommentAttachmentForComment(meetingId, commentId, attachmentId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.DownloadCommentAttachmentForComment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 
 **attachmentId** | **Guid**|  | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcomment"></a>
# **GetComment**
> CommentDto GetComment (Guid meetingId, Guid commentId)

Get details of a comment belonging to a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetCommentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 

            try
            {
                // Get details of a comment belonging to a meeting
                CommentDto result = apiInstance.GetComment(meetingId, commentId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.GetComment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 

### Return type
[**CommentDto**](CommentDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcommentattachments"></a>
# **GetCommentAttachments**
> List&lt;AttachmentSummaryDto&gt; GetCommentAttachments (Guid meetingId, Guid commentId)

Get attachments summary of a comment belonging to a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetCommentAttachmentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 

            try
            {
                // Get attachments summary of a comment belonging to a meeting
                List<AttachmentSummaryDto> result = apiInstance.GetCommentAttachments(meetingId, commentId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.GetCommentAttachments: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 

### Return type
[**List&lt;AttachmentSummaryDto&gt;**](AttachmentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcomments"></a>
# **GetComments**
> List&lt;CommentSummaryDto&gt; GetComments (Guid meetingId)

Get all comments for a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class GetCommentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 

            try
            {
                // Get all comments for a meeting
                List<CommentSummaryDto> result = apiInstance.GetComments(meetingId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.GetComments: " + e.Message );
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
 **meetingId** | **Guid**|  | 

### Return type
[**List&lt;CommentSummaryDto&gt;**](CommentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="patchcomment"></a>
# **PatchComment**
> void PatchComment (Guid meetingId, Guid commentId, List<Operation> operation = null)

Edit a comment for a meeting

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNMeetings.Api;
using FactSet.SDK.IRNMeetings.Client;
using FactSet.SDK.IRNMeetings.Model;

namespace Example
{
    public class PatchCommentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNMeetings.Client.Configuration();

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

            var apiInstance = new CommentsApi(config);

            var meetingId = "meetingId_example";  // Guid | 
            var commentId = "commentId_example";  // Guid | 
            var operation = new List<Operation>(); // List<Operation> |  (optional) 

            try
            {
                // Edit a comment for a meeting
                apiInstance.PatchComment(meetingId, commentId, operation);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CommentsApi.PatchComment: " + e.Message );
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
 **meetingId** | **Guid**|  | 
 **commentId** | **Guid**|  | 
 **operation** | [**List&lt;Operation&gt;**](Operation.md)|  | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/_*+json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


