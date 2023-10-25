# FactSet.SDK.FactSetPrices.Api.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBatchData**](BatchProcessingApi.md#getbatchdata) | **GET** /batch/v1/result | Returns the response for a Batch Request
[**GetBatchDataWithPost**](BatchProcessingApi.md#getbatchdatawithpost) | **POST** /batch/v1/result | Returns the response for a Batch Request
[**GetBatchStatus**](BatchProcessingApi.md#getbatchstatus) | **GET** /batch/v1/status | Returns the status for a Batch Request
[**GetBatchStatusWithPost**](BatchProcessingApi.md#getbatchstatuswithpost) | **POST** /batch/v1/status | Returns the status for a Batch Request



<a name="getbatchdata"></a>
# **GetBatchData**
> BatchDataResponse GetBatchData (Guid id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.

### Example
```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetBatchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var id = "id_example";  // Guid | Batch Request identifier.

            try
            {
                // Returns the response for a Batch Request
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
 **id** | **Guid**| Batch Request identifier. | 

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
| **200** | Request Response Object when batch request has completed and response is created |  -  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbatchdatawithpost"></a>
# **GetBatchDataWithPost**
> BatchDataResponse GetBatchDataWithPost (BatchDataRequest batchDataRequest)

Returns the response for a Batch Request

Return the response data for the underlying batch request that is specified by the id. 

### Example
```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetBatchDataWithPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var batchDataRequest = new BatchDataRequest(); // BatchDataRequest | Batch Data Request Post Body

            try
            {
                // Returns the response for a Batch Request
                BatchProcessingApi.GetBatchDataWithPostResponseWrapper result = apiInstance.GetBatchDataWithPost(batchDataRequest);

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
                Console.WriteLine("Exception when calling BatchProcessingApi.GetBatchDataWithPost: " + e.Message );
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
 **batchDataRequest** | [**BatchDataRequest**](BatchDataRequest.md)| Batch Data Request Post Body | 

### Return type
GetBatchDataWithPostResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Request Response Object when batch request has completed and response is created. |  -  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbatchstatus"></a>
# **GetBatchStatus**
> BatchStatusResponse GetBatchStatus (Guid id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetBatchStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var id = "id_example";  // Guid | Batch Request identifier.

            try
            {
                // Returns the status for a Batch Request
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
 **id** | **Guid**| Batch Request identifier. | 

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
| **201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbatchstatuswithpost"></a>
# **GetBatchStatusWithPost**
> BatchStatusResponse GetBatchStatusWithPost (BatchStatusRequest batchStatusRequest)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetBatchStatusWithPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var batchStatusRequest = new BatchStatusRequest(); // BatchStatusRequest | Batch Status Request Post Body

            try
            {
                // Returns the status for a Batch Request
                BatchStatusResponse result = apiInstance.GetBatchStatusWithPost(batchStatusRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BatchProcessingApi.GetBatchStatusWithPost: " + e.Message );
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
 **batchStatusRequest** | [**BatchStatusRequest**](BatchStatusRequest.md)| Batch Status Request Post Body | 

### Return type
[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | Batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


