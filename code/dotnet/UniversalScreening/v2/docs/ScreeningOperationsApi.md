# FactSet.SDK.UniversalScreening.Api.ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCalculateResults**](ScreeningOperationsApi.md#getcalculateresults) | **GET** /job/{id} | 
[**PollCalculate**](ScreeningOperationsApi.md#pollcalculate) | **GET** /job/{id}/status | 
[**SubmitArchiveOFDB**](ScreeningOperationsApi.md#submitarchiveofdb) | **POST** /job/archive | 
[**SubmitCalculate**](ScreeningOperationsApi.md#submitcalculate) | **POST** /job/calculate | 



<a name="getcalculateresults"></a>
# **GetCalculateResults**
> PaginatedCalculationResponse GetCalculateResults (Guid id, int? paginationLimit = null, int? paginationCursor = null)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

            var apiInstance = new ScreeningOperationsApi(config);

            var id = "123e4567-e89b-12d3-a456-426655440000";  // Guid | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
            var paginationLimit = 10000;  // int? | Page size limit (minumum 1000, default 10,000, maximum 100,000) (optional)  (default to 10000)
            var paginationCursor = 0;  // int? | Paging index (Initial request may omit) (optional)  (default to 0)

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
 **id** | **Guid**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. | 
 **paginationLimit** | **int?**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional] [default to 10000]
 **paginationCursor** | **int?**| Paging index (Initial request may omit) | [optional] [default to 0]

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
| **200** | Paginated Screen Results and Metadata |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | The requested screen could not be opened. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **403** | User is not authorized for this operation. |  -  |
| **404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="pollcalculate"></a>
# **PollCalculate**
> ResourceStatusResponse PollCalculate (Guid id)



Polls the job with a given screen ID and returns job status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

            var apiInstance = new ScreeningOperationsApi(config);

            var id = "123e4567-e89b-12d3-a456-426655440000";  // Guid | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.

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
 **id** | **Guid**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. | 

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
| **201** | Job completed |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **403** | User is not authorized for this operation. |  -  |
| **404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="submitarchiveofdb"></a>
# **SubmitArchiveOFDB**
> ResourceStatusResponse SubmitArchiveOFDB (ScreenArchiveOFDBParameters screenArchiveOFDBParameters = null)



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="submitcalculate"></a>
# **SubmitCalculate**
> ResourceStatusResponse SubmitCalculate (ScreenCalcParameters screenCalcParameters = null)



Begins calculation of screen. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


