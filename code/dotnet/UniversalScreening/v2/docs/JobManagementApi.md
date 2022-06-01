# FactSet.SDK.UniversalScreening.Api.JobManagementApi

All URIs are relative to *https://api.factset.com/universal-screening*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteActiveJob**](JobManagementApi.md#deleteactivejob) | **DELETE** /v2/job/{id} | 
[**DeleteAllActiveJobs**](JobManagementApi.md#deleteallactivejobs) | **DELETE** /v2/jobs | 
[**GetAllActiveJobs**](JobManagementApi.md#getallactivejobs) | **GET** /v2/jobs | 


<a name="deleteactivejob"></a>
# **DeleteActiveJob**
> void DeleteActiveJob (string id)



Delete a specified job started by the requester's username-serial

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.UniversalScreening.Api;
using FactSet.SDK.UniversalScreening.Client;
using FactSet.SDK.UniversalScreening.Model;

namespace Example
{
    public class DeleteActiveJobExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.UniversalScreening.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
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
            var id = "id_example";  // string | Unique identifier for a screen calculation job

            try
            {
                apiInstance.DeleteActiveJob(id);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.DeleteActiveJob: " + e.Message );
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
 **id** | **string**| Unique identifier for a screen calculation job | 

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
| **204** | No content |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="deleteallactivejobs"></a>
# **DeleteAllActiveJobs**
> void DeleteAllActiveJobs ()



Delete all active jobs started by the requester's username-serial

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.UniversalScreening.Api;
using FactSet.SDK.UniversalScreening.Client;
using FactSet.SDK.UniversalScreening.Model;

namespace Example
{
    public class DeleteAllActiveJobsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.UniversalScreening.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
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
                apiInstance.DeleteAllActiveJobs();
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.DeleteAllActiveJobs: " + e.Message );
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
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getallactivejobs"></a>
# **GetAllActiveJobs**
> ActiveJobsData GetAllActiveJobs ()



Retrieve list of all active job ids started by requester's username-serial

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.UniversalScreening.Api;
using FactSet.SDK.UniversalScreening.Client;
using FactSet.SDK.UniversalScreening.Model;

namespace Example
{
    public class GetAllActiveJobsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.UniversalScreening.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
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
                ActiveJobsData result = apiInstance.GetAllActiveJobs();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling JobManagementApi.GetAllActiveJobs: " + e.Message );
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
[**ActiveJobsData**](ActiveJobsData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ActiveJobsResponse contains id of all of a user&#39;s active jobs |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

