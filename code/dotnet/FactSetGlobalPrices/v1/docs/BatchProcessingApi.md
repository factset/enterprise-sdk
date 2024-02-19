# FactSet.SDK.FactSetGlobalPrices.Api.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBatchData**](BatchProcessingApi.md#getbatchdata) | **GET** /factset-global-prices/v1/batch-result | Returns the response for a Batch Request 
[**GetBatchStatus**](BatchProcessingApi.md#getbatchstatus) | **GET** /factset-global-prices/v1/batch-status | Returns the status for a Batch Request 



<a name="getbatchdata"></a>
# **GetBatchData**
> BatchResultResponse GetBatchData (Guid id)

Returns the response for a Batch Request 

Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \"accept\" parameter as \"text/csv\" instead of \"application/json\". 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetBatchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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
| **200** | Request Response Object when the batch request has been completed and the response is created |  -  |
| **202** | The batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbatchstatus"></a>
# **GetBatchStatus**
> BatchStatusResponse GetBatchStatus (Guid id)

Returns the status for a Batch Request 

Return the status for the underlying batch request that is specified by the id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetBatchStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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
| **201** | The batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
| **202** | The batch Request has not finished and the result has NOT been created. |  -  |
| **404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


