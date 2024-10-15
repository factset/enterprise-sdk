# FactSet.SDK.IssueTracker.Api.IssueApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIssue**](IssueApi.md#getissue) | **GET** /issues/{id} | Get the matched issue details
[**PatchIssue**](IssueApi.md#patchissue) | **PATCH** /issues/{id} | Update severity and subject of issue or productId and categoryId of issue
[**PostIssue**](IssueApi.md#postissue) | **POST** /issues | Creates a Issue Tracker issue
[**PostReply**](IssueApi.md#postreply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue



<a name="getissue"></a>
# **GetIssue**
> Issue GetIssue (string id)

Get the matched issue details

Retrieve the information of the client with the matching issue Id.

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
    public class GetIssueExample
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

            var apiInstance = new IssueApi(config);

            var id = "id_example";  // string | ID of Issue Tracker issue

            try
            {
                // Get the matched issue details
                Issue result = apiInstance.GetIssue(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IssueApi.GetIssue: " + e.Message );
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
 **id** | **string**| ID of Issue Tracker issue | 

### Return type
[**Issue**](Issue.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="patchissue"></a>
# **PatchIssue**
> void PatchIssue (string id, UpdateIssueRequest updateIssueRequest = null)

Update severity and subject of issue or productId and categoryId of issue

User can update either `isCritical` with `subject` or `productId` with `categoryId`.    **Note:** Users are not allowed to update `isCritical` with `productId` or `subject` with `productId`

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
    public class PatchIssueExample
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

            var apiInstance = new IssueApi(config);

            var id = "id_example";  // string | ID of Issue Tracker issue
            var updateIssueRequest = new UpdateIssueRequest(); // UpdateIssueRequest |  (optional) 

            try
            {
                // Update severity and subject of issue or productId and categoryId of issue
                apiInstance.PatchIssue(id, updateIssueRequest);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IssueApi.PatchIssue: " + e.Message );
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
 **id** | **string**| ID of Issue Tracker issue | 
 **updateIssueRequest** | [**UpdateIssueRequest**](UpdateIssueRequest.md)|  | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postissue"></a>
# **PostIssue**
> IdResponse PostIssue (IssueRequest issueRequest = null)

Creates a Issue Tracker issue

Creates a new issue in Issue Tracker

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
    public class PostIssueExample
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

            var apiInstance = new IssueApi(config);

            var issueRequest = new IssueRequest(); // IssueRequest |  (optional) 

            try
            {
                // Creates a Issue Tracker issue
                IdResponse result = apiInstance.PostIssue(issueRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IssueApi.PostIssue: " + e.Message );
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
 **issueRequest** | [**IssueRequest**](IssueRequest.md)|  | [optional] 

### Return type
[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postreply"></a>
# **PostReply**
> IdResponse PostReply (string id, CommentRequest commentRequest = null)

post comment to Issue Tracker issue

Reply to the existing matched issue 

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
    public class PostReplyExample
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

            var apiInstance = new IssueApi(config);

            var id = "id_example";  // string | ID of Issue Tracker issue
            var commentRequest = new CommentRequest(); // CommentRequest |  (optional) 

            try
            {
                // post comment to Issue Tracker issue
                IdResponse result = apiInstance.PostReply(id, commentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IssueApi.PostReply: " + e.Message );
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
 **id** | **string**| ID of Issue Tracker issue | 
 **commentRequest** | [**CommentRequest**](CommentRequest.md)|  | [optional] 

### Return type
[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


