# FactSet.SDK.FactSetProgrammaticEnvironment.Api.CalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyticsQuantFpeV1CalculationsIdGet**](CalculationsApi.md#analyticsquantfpev1calculationsidget) | **GET** /analytics/quant/fpe/v1/calculations/{id} | Get calculation status by id
[**AnalyticsQuantFpeV1CalculationsIdLogGet**](CalculationsApi.md#analyticsquantfpev1calculationsidlogget) | **GET** /analytics/quant/fpe/v1/calculations/{id}/log | Get calculation log for a specific calculation
[**AnalyticsQuantFpeV1CalculationsIdOutputGet**](CalculationsApi.md#analyticsquantfpev1calculationsidoutputget) | **GET** /analytics/quant/fpe/v1/calculations/{id}/output | Get calculation output for a specific calculation
[**AnalyticsQuantFpeV1CalculationsPost**](CalculationsApi.md#analyticsquantfpev1calculationspost) | **POST** /analytics/quant/fpe/v1/calculations | Starts a new script calculation



<a name="analyticsquantfpev1calculationsidget"></a>
# **AnalyticsQuantFpeV1CalculationsIdGet**
> CalculationStatus AnalyticsQuantFpeV1CalculationsIdGet (string id)

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
    public class AnalyticsQuantFpeV1CalculationsIdGetExample
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
                CalculationStatus result = apiInstance.AnalyticsQuantFpeV1CalculationsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantFpeV1CalculationsIdGet: " + e.Message );
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


<a name="analyticsquantfpev1calculationsidlogget"></a>
# **AnalyticsQuantFpeV1CalculationsIdLogGet**
> System.IO.Stream AnalyticsQuantFpeV1CalculationsIdLogGet (string id)

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
    public class AnalyticsQuantFpeV1CalculationsIdLogGetExample
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
                System.IO.Stream result = apiInstance.AnalyticsQuantFpeV1CalculationsIdLogGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantFpeV1CalculationsIdLogGet: " + e.Message );
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


<a name="analyticsquantfpev1calculationsidoutputget"></a>
# **AnalyticsQuantFpeV1CalculationsIdOutputGet**
> System.IO.Stream AnalyticsQuantFpeV1CalculationsIdOutputGet (string id)

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
    public class AnalyticsQuantFpeV1CalculationsIdOutputGetExample
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
                System.IO.Stream result = apiInstance.AnalyticsQuantFpeV1CalculationsIdOutputGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantFpeV1CalculationsIdOutputGet: " + e.Message );
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


<a name="analyticsquantfpev1calculationspost"></a>
# **AnalyticsQuantFpeV1CalculationsPost**
> CalculationStatus AnalyticsQuantFpeV1CalculationsPost (Calculation calculation = null)

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
    public class AnalyticsQuantFpeV1CalculationsPostExample
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
                CalculationStatus result = apiInstance.AnalyticsQuantFpeV1CalculationsPost(calculation);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantFpeV1CalculationsPost: " + e.Message );
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


