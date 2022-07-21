# FactSet.SDK.UniversalScreening.Api.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCalculateResults**](ScreeningOperationsApi.md#getcalculateresults) | **GET** /v2/job/{id} | 
[**PollCalculate**](ScreeningOperationsApi.md#pollcalculate) | **GET** /v2/job/{id}/status | 
[**SubmitArchiveOFDB**](ScreeningOperationsApi.md#submitarchiveofdb) | **POST** /v2/job/archive | 
[**SubmitCalculate**](ScreeningOperationsApi.md#submitcalculate) | **POST** /v2/job/calculate | 


<a name="getcalculateresults"></a>
# **GetCalculateResults**
> PaginatedCalculationResponse GetCalculateResults (string id, int? paginationLimit = null, int? paginationCursor = null)



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

            var apiInstance = new ScreeningOperationsApi(config);

            var id = "id_example";  // string | Unique identifier for a screen calculation job
            var paginationLimit = 56;  // int? | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional) 
            var paginationCursor = 56;  // int? | Paging index (Initial request may omit) (optional) 

            try
            {
                PaginatedCalculationResponse result = apiInstance.GetCalculateResults(id, paginationLimit, paginationCursor);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScreeningOperationsApi.GetCalculateResults: " + e.Message );
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
[**PaginatedCalculationResponse**](PaginatedCalculationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated Screen Results and Metadata |  -  |
| **202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **400** | The requested screen could not be opened. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="pollcalculate"></a>
# **PollCalculate**
> ResourceStatusResponse PollCalculate (string id)



Polls the job with a given screen ID and returns job status

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

            var apiInstance = new ScreeningOperationsApi(config);

            var id = "id_example";  // string | Unique identifier for a screen calculation job

            try
            {
                ResourceStatusResponse result = apiInstance.PollCalculate(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScreeningOperationsApi.PollCalculate: " + e.Message );
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
| **201** | Job completed |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitarchiveofdb"></a>
# **SubmitArchiveOFDB**
> ResourceStatusResponse SubmitArchiveOFDB (ScreenArchiveOFDBParameters screenArchiveOFDBParameters = null)



Begins archive of screen to OFDB. Subject to rate limiting by serial.

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

            var apiInstance = new ScreeningOperationsApi(config);

            var screenArchiveOFDBParameters = new ScreenArchiveOFDBParameters(); // ScreenArchiveOFDBParameters | Data required for an archive to OFDB request (optional) 

            try
            {
                ResourceStatusResponse result = apiInstance.SubmitArchiveOFDB(screenArchiveOFDBParameters);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScreeningOperationsApi.SubmitArchiveOFDB: " + e.Message );
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
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="submitcalculate"></a>
# **SubmitCalculate**
> ResourceStatusResponse SubmitCalculate (ScreenCalcParameters screenCalcParameters = null)



Begins calculation of screen. Subject to rate limiting by serial.

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

            var apiInstance = new ScreeningOperationsApi(config);

            var screenCalcParameters = new ScreenCalcParameters(); // ScreenCalcParameters | Data required for a calculation request (optional) 

            try
            {
                ResourceStatusResponse result = apiInstance.SubmitCalculate(screenCalcParameters);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScreeningOperationsApi.SubmitCalculate: " + e.Message );
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
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

