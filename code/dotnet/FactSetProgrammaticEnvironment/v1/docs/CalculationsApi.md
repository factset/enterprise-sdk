# FactSet.SDK.FactSetProgrammaticEnvironment.Api.CalculationsApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateCalculations**](CalculationsApi.md#createcalculations) | **POST** /calculations | Starts a new script calculation
[**GetCalculations**](CalculationsApi.md#getcalculations) | **GET** /calculations/{id} | Get calculation status by id
[**GetCalculationsLog**](CalculationsApi.md#getcalculationslog) | **GET** /calculations/{id}/log | Get calculation log for a specific calculation
[**GetCalculationsOutput**](CalculationsApi.md#getcalculationsoutput) | **GET** /calculations/{id}/output | Get calculation output for a specific calculation



<a name="createcalculations"></a>
# **CreateCalculations**
> CalculationStatus CreateCalculations (Calculation calculation = null)

Starts a new script calculation

This endpoint takes a python script and starts executing it within FPE

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class CreateCalculationsExample
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

            var apiInstance = new CalculationsApi(config);

            var calculation = new Calculation(); // Calculation |  (optional) 

            try
            {
                // Starts a new script calculation
                CalculationStatus result = apiInstance.CreateCalculations(calculation);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.CreateCalculations: " + e.Message );
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
 **calculation** | [**Calculation**](Calculation.md)|  | [optional] 

### Return type
[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Expected response, contains the relative URL in the Location header to check the status of the calculation. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **400** | Invalid request body provided |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcalculations"></a>
# **GetCalculations**
> CalculationStatus GetCalculations (string id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class GetCalculationsExample
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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation status by id
                CalculationStatus result = apiInstance.GetCalculations(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.GetCalculations: " + e.Message );
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
 **id** | **string**| From url, provided by location header or response body in the calculation start endpoint | 

### Return type
[**CalculationStatus**](CalculationStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcalculationslog"></a>
# **GetCalculationsLog**
> System.IO.Stream GetCalculationsLog (string id)

Get calculation log for a specific calculation

This endpoint returns the log from the calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class GetCalculationsLogExample
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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation log for a specific calculation
                System.IO.Stream result = apiInstance.GetCalculationsLog(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.GetCalculationsLog: " + e.Message );
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
 **id** | **string**| From url, provided by location header or response body in the calculation start endpoint | 

### Return type
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. Log from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress and no log is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcalculationsoutput"></a>
# **GetCalculationsOutput**
> System.IO.Stream GetCalculationsOutput (string id)

Get calculation output for a specific calculation

This endpoint returns the specified output from the calculation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class GetCalculationsOutputExample
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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation output for a specific calculation
                System.IO.Stream result = apiInstance.GetCalculationsOutput(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.GetCalculationsOutput: " + e.Message );
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
 **id** | **string**| From url, provided by location header or response body in the calculation start endpoint | 

### Return type
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: *


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response. Signals that the calculation is finished. Output from the calculation is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  * Content-Type - The content type of the output specified in the calculation&#39;s script. <br>  |
| **202** | Expected response. Signals that the calculation is still in progress and no output is returned. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


