# FactSet.SDK.FactSetProgrammaticEnvironment.Api.FilesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyticsQuantFpeV1FilesServerFilePost**](FilesApi.md#analyticsquantfpev1filesserverfilepost) | **POST** /analytics/quant/fpe/v1/files/{server}/{file} | Starts a file upload
[**AnalyticsQuantFpeV1FilesUploadsIdGet**](FilesApi.md#analyticsquantfpev1filesuploadsidget) | **GET** /analytics/quant/fpe/v1/files/uploads/{id} | Get upload status by id



<a name="analyticsquantfpev1filesserverfilepost"></a>
# **AnalyticsQuantFpeV1FilesServerFilePost**
> FileUploadStatus AnalyticsQuantFpeV1FilesServerFilePost (string server, string file, System.IO.Stream body = null)

Starts a file upload

This endpoint takes a file and uploads it

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantFpeV1FilesServerFilePostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetProgrammaticEnvironment.Client.Configuration();

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

            var apiInstance = new FilesApi(config);

            var server = "server_example";  // string | The server to upload the file to. Either `interactive` or `batch`.
            var file = "file_example";  // string | The file name to upload the file to. Existing directory can be specified.
            var body = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream |  (optional) 

            try
            {
                // Starts a file upload
                FileUploadStatus result = apiInstance.AnalyticsQuantFpeV1FilesServerFilePost(server, file, body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilesApi.AnalyticsQuantFpeV1FilesServerFilePost: " + e.Message );
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
 **server** | **string**| The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. | 
 **file** | **string**| The file name to upload the file to. Existing directory can be specified. | 
 **body** | **System.IO.Stream****System.IO.Stream**|  | [optional] 

### Return type
[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: *
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Expected response, contains the relative URL in the Location header to check the status of the upload. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="analyticsquantfpev1filesuploadsidget"></a>
# **AnalyticsQuantFpeV1FilesUploadsIdGet**
> FileUploadStatus AnalyticsQuantFpeV1FilesUploadsIdGet (string id)

Get upload status by id

This is the endpoint to check on the progress of a previous upload request.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantFpeV1FilesUploadsIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetProgrammaticEnvironment.Client.Configuration();

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

            var apiInstance = new FilesApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the upload start endpoint

            try
            {
                // Get upload status by id
                FileUploadStatus result = apiInstance.AnalyticsQuantFpeV1FilesUploadsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilesApi.AnalyticsQuantFpeV1FilesUploadsIdGet: " + e.Message );
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
 **id** | **string**| From url, provided by location header or response body in the upload start endpoint | 

### Return type
[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the upload is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the upload is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


