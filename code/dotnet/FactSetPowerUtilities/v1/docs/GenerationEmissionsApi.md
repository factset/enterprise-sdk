# FactSet.SDK.FactSetPowerUtilities.Api.GenerationEmissionsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListHourlyGenerationUnits**](GenerationEmissionsApi.md#listhourlygenerationunits) | **POST** /generation/hourly/units | Returns hourly plant unit generation and emissions
[**ListMonthlyGeneration**](GenerationEmissionsApi.md#listmonthlygeneration) | **POST** /generation/monthly | Returns monthly plant generation and emissions



<a name="listhourlygenerationunits"></a>
# **ListHourlyGenerationUnits**
> HourlyGenerationResponse ListHourlyGenerationUnits (HourlyGenerationRequest hourlyGenerationRequest)

Returns hourly plant unit generation and emissions

Returns hourly net generation and emissions for the requested power plant units over the specified date range. Each record provides net generation in MWh and reported emissions of CO₂, SO₂, and N₂O (nitrous oxide) in metric tons, along with heat input in MMBtu and steam generation.  This endpoint operates at the unit level, matching the underlying source data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPowerUtilities.Api;
using FactSet.SDK.FactSetPowerUtilities.Client;
using FactSet.SDK.FactSetPowerUtilities.Model;

namespace Example
{
    public class ListHourlyGenerationUnitsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPowerUtilities.Client.Configuration();

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

            var apiInstance = new GenerationEmissionsApi(config);

            var hourlyGenerationRequest = new HourlyGenerationRequest(); // HourlyGenerationRequest | 

            try
            {
                // Returns hourly plant unit generation and emissions
                HourlyGenerationResponse result = apiInstance.ListHourlyGenerationUnits(hourlyGenerationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GenerationEmissionsApi.ListHourlyGenerationUnits: " + e.Message );
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
 **hourlyGenerationRequest** | [**HourlyGenerationRequest**](HourlyGenerationRequest.md)|  | 

### Return type
[**HourlyGenerationResponse**](HourlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with hourly generation and emissions |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
| **422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listmonthlygeneration"></a>
# **ListMonthlyGeneration**
> MonthlyGenerationResponse ListMonthlyGeneration (MonthlyGenerationRequest monthlyGenerationRequest)

Returns monthly plant generation and emissions

Returns monthly net generation and emissions for the requested power plants over the specified date range. Each record provides net generation in MWh, plant/fuel-type capacity and capacity factor, and total emissions of CO₂ (metric tons), SO₂ (short tons), and N₂O (nitrous oxide, short tons), along with heat input in MMBtu and a CO₂ intensity measure. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPowerUtilities.Api;
using FactSet.SDK.FactSetPowerUtilities.Client;
using FactSet.SDK.FactSetPowerUtilities.Model;

namespace Example
{
    public class ListMonthlyGenerationExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPowerUtilities.Client.Configuration();

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

            var apiInstance = new GenerationEmissionsApi(config);

            var monthlyGenerationRequest = new MonthlyGenerationRequest(); // MonthlyGenerationRequest | 

            try
            {
                // Returns monthly plant generation and emissions
                MonthlyGenerationResponse result = apiInstance.ListMonthlyGeneration(monthlyGenerationRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GenerationEmissionsApi.ListMonthlyGeneration: " + e.Message );
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
 **monthlyGenerationRequest** | [**MonthlyGenerationRequest**](MonthlyGenerationRequest.md)|  | 

### Return type
[**MonthlyGenerationResponse**](MonthlyGenerationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with monthly generation and emissions |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **415** | Unsupported Media Type — the request body was not JSON or the Content-Type header was missing. |  -  |
| **422** | Unprocessable Entity — the request was syntactically valid but semantically incorrect (e.g., invalid date range). |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


