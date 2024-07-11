# FactSet.SDK.OpenRisk.Api.OperationsApi

All URIs are relative to *https://api.factset.com/analytics/openrisk/linear/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CalculateFromHoldings**](OperationsApi.md#calculatefromholdings) | **POST** /calculate/from-holdings | Calculate risk statistics
[**GenerateIdMapping**](OperationsApi.md#generateidmapping) | **POST** /generate/id-mapping | Generate risk model ID mapping



<a name="calculatefromholdings"></a>
# **CalculateFromHoldings**
> InlineResponse2003 CalculateFromHoldings (CalculateFromHoldingsRequestBody calculateFromHoldingsRequestBody)

Calculate risk statistics

Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenRisk.Api;
using FactSet.SDK.OpenRisk.Client;
using FactSet.SDK.OpenRisk.Model;

namespace Example
{
    public class CalculateFromHoldingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenRisk.Client.Configuration();

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

            var apiInstance = new OperationsApi(config);

            var calculateFromHoldingsRequestBody = new CalculateFromHoldingsRequestBody(); // CalculateFromHoldingsRequestBody | 

            try
            {
                // Calculate risk statistics
                InlineResponse2003 result = apiInstance.CalculateFromHoldings(calculateFromHoldingsRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OperationsApi.CalculateFromHoldings: " + e.Message );
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
 **calculateFromHoldingsRequestBody** | [**CalculateFromHoldingsRequestBody**](CalculateFromHoldingsRequestBody.md)|  | 

### Return type
[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Calculate predicted risk statistics for provided holdings using risk model data. Asset symbols and market values/weights are required. |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="generateidmapping"></a>
# **GenerateIdMapping**
> InlineResponse2004 GenerateIdMapping (GenerateIdMappingRequestBody generateIdMappingRequestBody)

Generate risk model ID mapping

Resolve all input holdings IDs against a risk model for coverage and provide a mapping to security indices in the model or the reason for exclusion

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenRisk.Api;
using FactSet.SDK.OpenRisk.Client;
using FactSet.SDK.OpenRisk.Model;

namespace Example
{
    public class GenerateIdMappingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenRisk.Client.Configuration();

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

            var apiInstance = new OperationsApi(config);

            var generateIdMappingRequestBody = new GenerateIdMappingRequestBody(); // GenerateIdMappingRequestBody | 

            try
            {
                // Generate risk model ID mapping
                InlineResponse2004 result = apiInstance.GenerateIdMapping(generateIdMappingRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OperationsApi.GenerateIdMapping: " + e.Message );
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
 **generateIdMappingRequestBody** | [**GenerateIdMappingRequestBody**](GenerateIdMappingRequestBody.md)|  | 

### Return type
[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Provides a mapping to security indices in the risk model or the reason for exclusion |  -  |
| **400** | Request was malformed or the requested data is not available |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication |  -  |
| **403** | Access forbidden for the requested data |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **404** | Endpoint not found |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait until the time specified in header &#39;Retry-After&#39; has elapsed before making further requests. |  * Retry-After -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal server error occurred |  * api-supported-versions -  <br>  * api-version -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


