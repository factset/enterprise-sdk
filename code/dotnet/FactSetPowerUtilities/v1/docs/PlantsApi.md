# FactSet.SDK.FactSetPowerUtilities.Api.PlantsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListPlantIds**](PlantsApi.md#listplantids) | **GET** /plants/ids | Returns discoverable power plant IDs



<a name="listplantids"></a>
# **ListPlantIds**
> PlantIdsResponse ListPlantIds (List<string> isoCode = null, List<string> country = null, List<string> region = null, List<string> plantStatus = null, List<string> plantIds = null, decimal? minCapacityMw = null, decimal? maxCapacityMw = null, int? paginationLimit = null, int? paginationOffset = null)

Returns discoverable power plant IDs

Returns a paginated list of FactSet power plant asset identifiers matching the specified filter criteria, along with plant name, status, fuel type, and geographic location (nearest city, region, country, continent, and coordinates).  For unit-level metadata and technical details, see `POST /units/details`. You can provide either plant IDs or unit IDs to `/units/details` to retrieve unit-level data with full mapping information (unit names, EIA codes, grades, regions).  Reflects current data only; historical or point-in-time values are not retained. 

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
    public class ListPlantIdsExample
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

            var apiInstance = new PlantsApi(config);

            var isoCode = new List<string>(); // List<string> | Filter plants by ISO/TSO market area code (e.g., `\"ERCOT\"`, `\"PJM\"` for US ISO/RTOs; other codes for non-US TSOs as coverage expands). (optional) 
            var country = new List<string>(); // List<string> | Filter plants by country name (e.g., `\"United States\"`, `\"Canada\"`, `\"United Kingdom\"`). (optional) 
            var region = new List<string>(); // List<string> | Filter plants by region (e.g., a US state name such as `\"Texas\"`, `\"Tennessee\"`). (optional) 
            var plantStatus = new List<string>(); // List<string> | Filter plants by operational status. (optional) 
            var plantIds = new List<string>(); // List<string> | Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. (optional) 
            var minCapacityMw = 100D;  // decimal? | Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. (optional) 
            var maxCapacityMw = 5000D;  // decimal? | Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. (optional) 
            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. Use with `_paginationLimit` for paging through large result sets. (optional)  (default to 0)

            try
            {
                // Returns discoverable power plant IDs
                PlantIdsResponse result = apiInstance.ListPlantIds(isoCode, country, region, plantStatus, plantIds, minCapacityMw, maxCapacityMw, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PlantsApi.ListPlantIds: " + e.Message );
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
 **isoCode** | [**List&lt;string&gt;**](string.md)| Filter plants by ISO/TSO market area code (e.g., &#x60;\&quot;ERCOT\&quot;&#x60;, &#x60;\&quot;PJM\&quot;&#x60; for US ISO/RTOs; other codes for non-US TSOs as coverage expands). | [optional] 
 **country** | [**List&lt;string&gt;**](string.md)| Filter plants by country name (e.g., &#x60;\&quot;United States\&quot;&#x60;, &#x60;\&quot;Canada\&quot;&#x60;, &#x60;\&quot;United Kingdom\&quot;&#x60;). | [optional] 
 **region** | [**List&lt;string&gt;**](string.md)| Filter plants by region (e.g., a US state name such as &#x60;\&quot;Texas\&quot;&#x60;, &#x60;\&quot;Tennessee\&quot;&#x60;). | [optional] 
 **plantStatus** | [**List&lt;string&gt;**](string.md)| Filter plants by operational status. | [optional] 
 **plantIds** | [**List&lt;string&gt;**](string.md)| Filter results to the specified FactSet plant asset identifiers. If omitted, all plants matching other filter criteria are returned. | [optional] 
 **minCapacityMw** | **decimal?**| Filter plants by minimum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity greater than or equal to this value. | [optional] 
 **maxCapacityMw** | **decimal?**| Filter plants by maximum nameplate capacity in megawatts (MW), inclusive. Returns plants with capacity less than or equal to this value. | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. Use with &#x60;_paginationLimit&#x60; for paging through large result sets. | [optional] [default to 0]

### Return type
[**PlantIdsResponse**](PlantIdsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of plant identifiers |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


