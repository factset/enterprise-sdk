# FactSet.SDK.QuantitativeResearchEnvironment.Api.CalculationsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AnalyticsQuantQreV1CalculationsIdGet**](CalculationsApi.md#analyticsquantqrev1calculationsidget) | **GET** /analytics/quant/qre/v1/calculations/{id} | Get calculation status by id
[**AnalyticsQuantQreV1CalculationsIdLogGet**](CalculationsApi.md#analyticsquantqrev1calculationsidlogget) | **GET** /analytics/quant/qre/v1/calculations/{id}/log | Get calculation log for a specific calculation
[**AnalyticsQuantQreV1CalculationsIdOutputGet**](CalculationsApi.md#analyticsquantqrev1calculationsidoutputget) | **GET** /analytics/quant/qre/v1/calculations/{id}/output | Get calculation output for a specific calculation
[**AnalyticsQuantQreV1CalculationsPost**](CalculationsApi.md#analyticsquantqrev1calculationspost) | **POST** /analytics/quant/qre/v1/calculations | Starts a new script calculation


<a name="analyticsquantqrev1calculationsidget"></a>
# **AnalyticsQuantQreV1CalculationsIdGet**
> CalculationStatus AnalyticsQuantQreV1CalculationsIdGet (string id)

Get calculation status by id

This is the endpoint to check on the progress of a previous calculation request.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuantitativeResearchEnvironment.Api;
using FactSet.SDK.QuantitativeResearchEnvironment.Client;
using FactSet.SDK.QuantitativeResearchEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantQreV1CalculationsIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuantitativeResearchEnvironment.Client.Configuration();

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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation status by id
                CalculationStatus result = apiInstance.AnalyticsQuantQreV1CalculationsIdGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantQreV1CalculationsIdGet: " + e.Message );
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

<a name="analyticsquantqrev1calculationsidlogget"></a>
# **AnalyticsQuantQreV1CalculationsIdLogGet**
> System.IO.Stream AnalyticsQuantQreV1CalculationsIdLogGet (string id)

Get calculation log for a specific calculation

This endpoint returns the log from the calculation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuantitativeResearchEnvironment.Api;
using FactSet.SDK.QuantitativeResearchEnvironment.Client;
using FactSet.SDK.QuantitativeResearchEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantQreV1CalculationsIdLogGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuantitativeResearchEnvironment.Client.Configuration();

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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation log for a specific calculation
                System.IO.Stream result = apiInstance.AnalyticsQuantQreV1CalculationsIdLogGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantQreV1CalculationsIdLogGet: " + e.Message );
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

<a name="analyticsquantqrev1calculationsidoutputget"></a>
# **AnalyticsQuantQreV1CalculationsIdOutputGet**
> System.IO.Stream AnalyticsQuantQreV1CalculationsIdOutputGet (string id)

Get calculation output for a specific calculation

This endpoint returns the specified output from the calculation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuantitativeResearchEnvironment.Api;
using FactSet.SDK.QuantitativeResearchEnvironment.Client;
using FactSet.SDK.QuantitativeResearchEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantQreV1CalculationsIdOutputGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuantitativeResearchEnvironment.Client.Configuration();

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

            var apiInstance = new CalculationsApi(config);

            var id = "id_example";  // string | From url, provided by location header or response body in the calculation start endpoint

            try
            {
                // Get calculation output for a specific calculation
                System.IO.Stream result = apiInstance.AnalyticsQuantQreV1CalculationsIdOutputGet(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantQreV1CalculationsIdOutputGet: " + e.Message );
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

<a name="analyticsquantqrev1calculationspost"></a>
# **AnalyticsQuantQreV1CalculationsPost**
> CalculationStatus AnalyticsQuantQreV1CalculationsPost (Calculation calculation = null)

Starts a new script calculation

This endpoint takes a python script and starts executing it within QRE

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuantitativeResearchEnvironment.Api;
using FactSet.SDK.QuantitativeResearchEnvironment.Client;
using FactSet.SDK.QuantitativeResearchEnvironment.Model;

namespace Example
{
    public class AnalyticsQuantQreV1CalculationsPostExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuantitativeResearchEnvironment.Client.Configuration();

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

            var apiInstance = new CalculationsApi(config);

            var calculation = new Calculation(); // Calculation |  (optional) 

            try
            {
                // Starts a new script calculation
                CalculationStatus result = apiInstance.AnalyticsQuantQreV1CalculationsPost(calculation);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CalculationsApi.AnalyticsQuantQreV1CalculationsPost: " + e.Message );
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

