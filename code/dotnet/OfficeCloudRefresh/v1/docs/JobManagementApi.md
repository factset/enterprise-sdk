# FactSet.SDK.OfficeCloudRefresh.Api.JobManagementApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelActiveJob**](JobManagementApi.md#cancelactivejob) | **DELETE** /jobs/{id} | Cancel a job with the given resource ID
[**CancelAllActiveJobs**](JobManagementApi.md#cancelallactivejobs) | **DELETE** /jobs | Cancel all active jobs
[**GetJobs**](JobManagementApi.md#getjobs) | **GET** /jobs | Get information on all active jobs



<a name="cancelactivejob"></a>
# **CancelActiveJob**
> void CancelActiveJob (Guid id)

Cancel a job with the given resource ID

Cancel a specific job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OfficeCloudRefresh.Api;
using FactSet.SDK.OfficeCloudRefresh.Client;
using FactSet.SDK.OfficeCloudRefresh.Model;

namespace Example
{
    public class CancelActiveJobExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OfficeCloudRefresh.Client.Configuration();

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

            var apiInstance = new JobManagementApi(config);

            var id = "id_example";  // Guid | Unique identifier for the job (resource ID returned from FactSet).

            try
            {
                // Cancel a job with the given resource ID
                apiInstance.CancelActiveJob(id);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.CancelActiveJob: " + e.Message );
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
 **id** | **Guid**| Unique identifier for the job (resource ID returned from FactSet). | 

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
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="cancelallactivejobs"></a>
# **CancelAllActiveJobs**
> void CancelAllActiveJobs ()

Cancel all active jobs

Cancel all active (on_hold, queued, executing) jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OfficeCloudRefresh.Api;
using FactSet.SDK.OfficeCloudRefresh.Client;
using FactSet.SDK.OfficeCloudRefresh.Model;

namespace Example
{
    public class CancelAllActiveJobsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OfficeCloudRefresh.Client.Configuration();

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

            var apiInstance = new JobManagementApi(config);


            try
            {
                // Cancel all active jobs
                apiInstance.CancelAllActiveJobs();
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.CancelAllActiveJobs: " + e.Message );
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
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getjobs"></a>
# **GetJobs**
> ActiveJobStatusList GetJobs ()

Get information on all active jobs

Get the ids and status of all active jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OfficeCloudRefresh.Api;
using FactSet.SDK.OfficeCloudRefresh.Client;
using FactSet.SDK.OfficeCloudRefresh.Model;

namespace Example
{
    public class GetJobsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OfficeCloudRefresh.Client.Configuration();

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

            var apiInstance = new JobManagementApi(config);


            try
            {
                // Get information on all active jobs
                ActiveJobStatusList result = apiInstance.GetJobs();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.GetJobs: " + e.Message );
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
[**ActiveJobStatusList**](ActiveJobStatusList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


