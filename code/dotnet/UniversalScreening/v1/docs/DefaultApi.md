# FactSet.SDK.UniversalScreening.Api.DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteActiveJob**](DefaultApi.md#deleteactivejob) | **DELETE** /v1/calculations/{id} | 
[**DeleteAllActiveJobs**](DefaultApi.md#deleteallactivejobs) | **DELETE** /v1/calculations | 
[**GetAllActiveJobs**](DefaultApi.md#getallactivejobs) | **GET** /v1/calculations | 
[**GetCalculateResults**](DefaultApi.md#getcalculateresults) | **GET** /v1/calculations/{id} | 
[**PollArchiveOFDB**](DefaultApi.md#pollarchiveofdb) | **GET** /v1/archive/{id}/status | 
[**PollCalculate**](DefaultApi.md#pollcalculate) | **GET** /v1/calculations/{id}/status | 
[**SubmitArchiveOFDB**](DefaultApi.md#submitarchiveofdb) | **POST** /v1/archive | 
[**SubmitCalculate**](DefaultApi.md#submitcalculate) | **POST** /v1/calculations | 


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

            var apiInstance = new DefaultApi(config);
            var id = "id_example";  // string | Unique identifier for a screen calculation job

            try
            {
                apiInstance.DeleteActiveJob(id);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.DeleteActiveJob: " + e.Message );
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

            var apiInstance = new DefaultApi(config);

            try
            {
                apiInstance.DeleteAllActiveJobs();
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.DeleteAllActiveJobs: " + e.Message );
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
> InlineResponse200 GetAllActiveJobs ()



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

            var apiInstance = new DefaultApi(config);

            try
            {
                InlineResponse200 result = apiInstance.GetAllActiveJobs();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.GetAllActiveJobs: " + e.Message );
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
[**InlineResponse200**](InlineResponse200.md)

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

<a name="getcalculateresults"></a>
# **GetCalculateResults**
> void GetCalculateResults (string id, int? paginationLimit = null, int? paginationCursor = null)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

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
    public class GetCalculateResultsExample
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

            var apiInstance = new DefaultApi(config);
            var id = "id_example";  // string | Unique identifier for a screen calculation job
            var paginationLimit = 56;  // int? | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional) 
            var paginationCursor = 56;  // int? | Paging index (Initial request may omit) (optional) 

            try
            {
                apiInstance.GetCalculateResults(id, paginationLimit, paginationCursor);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.GetCalculateResults: " + e.Message );
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
 **paginationLimit** | **int?**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional] 
 **paginationCursor** | **int?**| Paging index (Initial request may omit) | [optional] 

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
| **200** | Screen calculation complete. The screen results will be formatted as a STACH 2.0 table and in a property named data. In the case of pagination column metadata will only be returned with the first page. Results will be purged after they are retrieved or six hours. |  -  |
| **202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **400** | The requested screen could not be opened. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pollarchiveofdb"></a>
# **PollArchiveOFDB**
> ResourceStatusResponse PollArchiveOFDB (string id)



Polls the archive OFDB job with a given archive job ID and returns job status

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
    public class PollArchiveOFDBExample
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

            var apiInstance = new DefaultApi(config);
            var id = "id_example";  // string | Unique identifier for a screen archive to OFDB job

            try
            {
                ResourceStatusResponse result = apiInstance.PollArchiveOFDB(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.PollArchiveOFDB: " + e.Message );
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
 **id** | **string**| Unique identifier for a screen archive to OFDB job | 

### Return type
[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Archive job completed |  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **202** | Archive job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pollcalculate"></a>
# **PollCalculate**
> ResourceStatusResponse PollCalculate (string id)



Polls the calculation job with a given screen calculation ID and returns job status

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
    public class PollCalculateExample
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

            var apiInstance = new DefaultApi(config);
            var id = "id_example";  // string | Unique identifier for a screen calculation job

            try
            {
                ResourceStatusResponse result = apiInstance.PollCalculate(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.PollCalculate: " + e.Message );
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
[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Calculation job completed |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitarchiveofdb"></a>
# **SubmitArchiveOFDB**
> ResourceStatusResponse SubmitArchiveOFDB (ScreenArchiveOFDBParameters screenArchiveOFDBParameters = null)



Begins archive of screen to OFDB

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
    public class SubmitArchiveOFDBExample
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

            var apiInstance = new DefaultApi(config);
            var screenArchiveOFDBParameters = new ScreenArchiveOFDBParameters(); // ScreenArchiveOFDBParameters | Data required for an archive to OFDB request (optional) 

            try
            {
                ResourceStatusResponse result = apiInstance.SubmitArchiveOFDB(screenArchiveOFDBParameters);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.SubmitArchiveOFDB: " + e.Message );
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
 **screenArchiveOFDBParameters** | [**ScreenArchiveOFDBParameters**](ScreenArchiveOFDBParameters.md)| Data required for an archive to OFDB request | [optional] 

### Return type
[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitcalculate"></a>
# **SubmitCalculate**
> ResourceStatusResponse SubmitCalculate (ScreenCalcParameters screenCalcParameters = null)



Begins calculation of screen

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
    public class SubmitCalculateExample
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

            var apiInstance = new DefaultApi(config);
            var screenCalcParameters = new ScreenCalcParameters(); // ScreenCalcParameters | Data required for a calculation request (optional) 

            try
            {
                ResourceStatusResponse result = apiInstance.SubmitCalculate(screenCalcParameters);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DefaultApi.SubmitCalculate: " + e.Message );
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
 **screenCalcParameters** | [**ScreenCalcParameters**](ScreenCalcParameters.md)| Data required for a calculation request | [optional] 

### Return type
[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

