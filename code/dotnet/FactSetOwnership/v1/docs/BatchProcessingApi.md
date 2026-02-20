# FactSet.SDK.FactSetOwnership.Api.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBatchData**](BatchProcessingApi.md#getbatchdata) | **GET** /batch-result | Returns the response for the Batch Request
[**GetBatchStatus**](BatchProcessingApi.md#getbatchstatus) | **GET** /batch-status | Returns the latest status and metadata for the Batch Request.



<a name="getbatchdata"></a>
# **GetBatchData**
> BatchResultResponse GetBatchData (Guid id)

Returns the response for the Batch Request

Returns the response data for the specified batch id upon successful completion.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetBatchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new BatchProcessingApi(config);

            var id = "id_example";  // Guid | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

            try
            {
                // Returns the response for the Batch Request
                BatchProcessingApi.GetBatchDataResponseWrapper result = apiInstance.GetBatchData(id);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BatchProcessingApi.GetBatchData: " + e.Message );
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
 **id** | **Guid**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. | 

### Return type
GetBatchDataResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the request&#39;s response object after the batch request has finished processing and the response is created |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **404** | Resource not found. |  -  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbatchstatus"></a>
# **GetBatchStatus**
> BatchStatusResponse GetBatchStatus (Guid id)

Returns the latest status and metadata for the Batch Request.

Returns the current processing status of the batch request identified by the specified batch Id. Use this endpoint to monitor and track the progress or completion of long-running batch operations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetBatchStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new BatchProcessingApi(config);

            var id = "id_example";  // Guid | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

            try
            {
                // Returns the latest status and metadata for the Batch Request.
                BatchStatusResponse result = apiInstance.GetBatchStatus(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BatchProcessingApi.GetBatchStatus: " + e.Message );
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
 **id** | **Guid**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. | 

### Return type
[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Batch request processing is complete and response has been created. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Location - Path to Batch Request result. <br>  |
| **202** | Batch request processing is still in progress and the result is not yet available. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **404** | Resource not found. |  -  |
| **429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


