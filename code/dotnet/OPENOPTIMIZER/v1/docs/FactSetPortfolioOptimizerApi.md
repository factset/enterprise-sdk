# FactSet.SDK.OPENOPTIMIZER.Api.FactSetPortfolioOptimizerApi

All URIs are relative to *https://api.factset.com/open-optimizer/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CancelOptimizationByIdFPO**](FactSetPortfolioOptimizerApi.md#canceloptimizationbyidfpo) | **DELETE** /fpo/{id} | Cancel FPO optimization by id
[**GetGlobalVariablesFPO**](FactSetPortfolioOptimizerApi.md#getglobalvariablesfpo) | **GET** /fpo/settings/global-variables | Returns a dictionary with the name-value pairs for all global variables.
[**GetOptimizationResultByIdFPO**](FactSetPortfolioOptimizerApi.md#getoptimizationresultbyidfpo) | **GET** /fpo/{id} | Get FPO optimization result by id
[**GetOptimizationStatusByIdFPO**](FactSetPortfolioOptimizerApi.md#getoptimizationstatusbyidfpo) | **GET** /fpo/{id}/status | Get FPO optimization status by id
[**PostAndOptimize**](FactSetPortfolioOptimizerApi.md#postandoptimize) | **POST** /fpo/optimize | Create and Run FPO optimization
[**PostComponentsFPO**](FactSetPortfolioOptimizerApi.md#postcomponentsfpo) | **POST** /fpo/settings/components | Returns a dictionary with individually-filtered metadata for each component type.
[**PostStrategiesFPO**](FactSetPortfolioOptimizerApi.md#poststrategiesfpo) | **POST** /fpo/settings/strategies | Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.



<a name="canceloptimizationbyidfpo"></a>
# **CancelOptimizationByIdFPO**
> void CancelOptimizationByIdFPO (string id)

Cancel FPO optimization by id

This is the endpoint to cancel a previously submitted optimization. Instead of doing a GET on the polling URL, cancel the request by doing a DELETE.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class CancelOptimizationByIdFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var id = "id_example";  // string | from url, provided from the location header in the Run Optimization endpoint

            try
            {
                // Cancel FPO optimization by id
                apiInstance.CancelOptimizationByIdFPO(id);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.CancelOptimizationByIdFPO: " + e.Message );
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
 **id** | **string**| from url, provided from the location header in the Run Optimization endpoint | 

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
| **204** | Expected response, optimization was canceled successfully. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **404** | There was no request for the optimization identifier provided, or the request was already canceled for the provided identifier. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getglobalvariablesfpo"></a>
# **GetGlobalVariablesFPO**
> SettingsGlobalVarsResponse GetGlobalVariablesFPO (string cacheControl = null)

Returns a dictionary with the name-value pairs for all global variables.

Fetch all available global variables

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class GetGlobalVariablesFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var cacheControl = "cacheControl_example";  // string | Standard HTTP header.  Accepts max-stale. (optional) 

            try
            {
                // Returns a dictionary with the name-value pairs for all global variables.
                SettingsGlobalVarsResponse result = apiInstance.GetGlobalVariablesFPO(cacheControl);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.GetGlobalVariablesFPO: " + e.Message );
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
 **cacheControl** | **string**| Standard HTTP header.  Accepts max-stale. | [optional] 

### Return type
[**SettingsGlobalVarsResponse**](SettingsGlobalVarsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Name-value pairs for each global variable. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getoptimizationresultbyidfpo"></a>
# **GetOptimizationResultByIdFPO**
> ResultResponse GetOptimizationResultByIdFPO (string id)

Get FPO optimization result by id

This is the endpoint to get optimization result.  If the optimization result is available, a 200 is returned.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class GetOptimizationResultByIdFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var id = "id_example";  // string | from url, provided from the location header in the Create and Run FPO optimization endpoint

            try
            {
                // Get FPO optimization result by id
                ResultResponse result = apiInstance.GetOptimizationResultByIdFPO(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.GetOptimizationResultByIdFPO: " + e.Message );
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
 **id** | **string**| from url, provided from the location header in the Create and Run FPO optimization endpoint | 

### Return type
[**ResultResponse**](ResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets the optimization result. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getoptimizationstatusbyidfpo"></a>
# **GetOptimizationStatusByIdFPO**
> OptimizationStatus GetOptimizationStatusByIdFPO (string id)

Get FPO optimization status by id

This is the endpoint to check on the progress of a previously requested optimization.  If the optimization has finished computing, a 201 is returned and the result can be fetched using /fpo/{id} endpoint.   Otherwise, the optimization is still running and the body of the response will contain a detailed status in JSON besides its pickup id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class GetOptimizationStatusByIdFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var id = "id_example";  // string | from url, provided from the location header in the Create and Run FPO optimization endpoint

            try
            {
                // Get FPO optimization status by id
                OptimizationStatus result = apiInstance.GetOptimizationStatusByIdFPO(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.GetOptimizationStatusByIdFPO: " + e.Message );
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
 **id** | **string**| from url, provided from the location header in the Create and Run FPO optimization endpoint | 

### Return type
[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | This indicates that the optimization is complete and the result is now available. |  * Location - URL to fetch the optimization result <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Indicates optimization is in progress. The response body contains the detailed status. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postandoptimize"></a>
# **PostAndOptimize**
> OptimizationStatus PostAndOptimize (string cacheControl = null, FPOOptimizationParametersRequest fPOOptimizationParametersRequest = null)

Create and Run FPO optimization

This endpoint runs FPO optimization specified in the POST body parameters.                Remarks:                * Any settings in POST body will act as a one-time override over the settings saved in the strategy document.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class PostAndOptimizeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var cacheControl = "cacheControl_example";  // string | Standard HTTP header.  Accepts max-stale. (optional) 
            var fPOOptimizationParametersRequest = new FPOOptimizationParametersRequest(); // FPOOptimizationParametersRequest | Optimization Parameters (optional) 

            try
            {
                // Create and Run FPO optimization
                OptimizationStatus result = apiInstance.PostAndOptimize(cacheControl, fPOOptimizationParametersRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.PostAndOptimize: " + e.Message );
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
 **cacheControl** | **string**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **fPOOptimizationParametersRequest** | [**FPOOptimizationParametersRequest**](FPOOptimizationParametersRequest.md)| Optimization Parameters | [optional] 

### Return type
[**OptimizationStatus**](OptimizationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The request to run an optimization has been accepted. The response includes a 202 Accepted status code, the ID of the new resource, and a Location header with the URL to check the status of the optimization. |  * Location - URL to poll for the resulting optimization <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid identifier provided. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Optimization result was already returned, provided id was not a requested optimization, or the optimization was cancelled |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postcomponentsfpo"></a>
# **PostComponentsFPO**
> AvailableComponentsResponse PostComponentsFPO (FPOAvailableComponentsInput fPOAvailableComponentsInput = null)

Returns a dictionary with individually-filtered metadata for each component type.

Fetch metadata for all FPO component types. Output is individually-filtered for each component type.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class PostComponentsFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var fPOAvailableComponentsInput = new FPOAvailableComponentsInput(); // FPOAvailableComponentsInput |  (optional) 

            try
            {
                // Returns a dictionary with individually-filtered metadata for each component type.
                AvailableComponentsResponse result = apiInstance.PostComponentsFPO(fPOAvailableComponentsInput);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.PostComponentsFPO: " + e.Message );
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
 **fPOAvailableComponentsInput** | [**FPOAvailableComponentsInput**](FPOAvailableComponentsInput.md)|  | [optional] 

### Return type
[**AvailableComponentsResponse**](AvailableComponentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | A JSON object with filtered metadata for all requested components |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="poststrategiesfpo"></a>
# **PostStrategiesFPO**
> AvailableStrategiesResponse PostStrategiesFPO (string cacheControl = null, AvailableStrategiesInput availableStrategiesInput = null)

Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.

Fetch available FPO Strategies

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OPENOPTIMIZER.Api;
using FactSet.SDK.OPENOPTIMIZER.Client;
using FactSet.SDK.OPENOPTIMIZER.Model;

namespace Example
{
    public class PostStrategiesFPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OPENOPTIMIZER.Client.Configuration();

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

            var apiInstance = new FactSetPortfolioOptimizerApi(config);

            var cacheControl = "cacheControl_example";  // string | Standard HTTP header.  Accepts max-stale. (optional) 
            var availableStrategiesInput = new AvailableStrategiesInput(); // AvailableStrategiesInput |  (optional) 

            try
            {
                // Returns a dictionary containing all strategies stored in a specified directory. Returns all strategies if no directory is given.
                AvailableStrategiesResponse result = apiInstance.PostStrategiesFPO(cacheControl, availableStrategiesInput);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetPortfolioOptimizerApi.PostStrategiesFPO: " + e.Message );
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
 **cacheControl** | **string**| Standard HTTP header.  Accepts max-stale. | [optional] 
 **availableStrategiesInput** | [**AvailableStrategiesInput**](AvailableStrategiesInput.md)|  | [optional] 

### Return type
[**AvailableStrategiesResponse**](AvailableStrategiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response, contains the requested strategies. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **417** | Expectation Failed |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit exceeded. Check the X-RateLimit-* headers and resend the request. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


