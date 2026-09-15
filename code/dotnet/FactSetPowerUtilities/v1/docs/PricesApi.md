# FactSet.SDK.FactSetPowerUtilities.Api.PricesApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListPrices**](PricesApi.md#listprices) | **POST** /prices | Returns power spot prices, spark spreads, capacity prices, or forward prices



<a name="listprices"></a>
# **ListPrices**
> PricesResponse ListPrices (PricesRequest pricesRequest)

Returns power spot prices, spark spreads, capacity prices, or forward prices

Returns power market price data for one of four categories, selected via the `category` discriminator in the request body:  * **`Power`** — Daily spot power prices in $/MWh at major hubs and zones. Includes on-peak, off-peak, and around-the-clock prices. * **`SparkSpread`** — Natural gas spark spreads in $/MWh at four fixed assumed heat rates (7,000 / 8,000 / 10,000 / 12,000 MMBtu/MWh), representing the difference between the power price and the cost of gas needed to generate one MWh. * **`Capacity`** — Capacity auction clearing prices in $/MW-day from ISO/RTO forward capacity markets. Includes delivery year and auction type. * **`Forward`** — Forward power price curves in $/MWh for future delivery months, reported as a rolling 3-day average. Includes on-peak, off-peak, and around-the-clock products.  Use `GET /reference/location-mapping` to discover valid `ids` for the `Power`, `SparkSpread`, and `Forward` categories, or `GET /reference/zone-mapping` for the `Capacity` category. 

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
    public class ListPricesExample
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

            var apiInstance = new PricesApi(config);

            var pricesRequest = new PricesRequest(); // PricesRequest | 

            try
            {
                // Returns power spot prices, spark spreads, capacity prices, or forward prices
                PricesResponse result = apiInstance.ListPrices(pricesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.ListPrices: " + e.Message );
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
 **pricesRequest** | [**PricesRequest**](PricesRequest.md)|  | 

### Return type
[**PricesResponse**](PricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Record shape matches the requested &#x60;category&#x60;. |  -  |
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


