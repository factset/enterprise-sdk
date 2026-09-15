# FactSet.SDK.FactSetPowerUtilities.Api.UnitsApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListPlantUnits**](UnitsApi.md#listplantunits) | **POST** /units/details | Returns power plant unit metadata and technical details
[**ListUnitsOwnership**](UnitsApi.md#listunitsownership) | **POST** /units/ownership | Returns power plant unit ownership details



<a name="listplantunits"></a>
# **ListPlantUnits**
> PlantUnitsResponse ListPlantUnits (PlantUnitsRequest plantUnitsRequest)

Returns power plant unit metadata and technical details

Returns metadata and technical detail data for one of five categories, selected via the `category` discriminator in the request body:  * **`Metadata`** — General plant metadata: plant name, ISO/TSO assignment, primary fuel type, nameplate capacity, operational status, owner details, and key lifecycle dates. * **`Pipeline`** — Gas pipeline connections: pipeline name and pipeline sequence (for units supplied by more than one pipeline). * **`Solar`** — Solar-specific technical specifications: installed capacity (DC), array/tracking type, tilt and azimuth angle, thin-film flag, and land area. * **`Wind`** — Wind turbine technical specifications: turbine count, model, manufacturer, hub height, and rotor swept area. * **`Thermal`** — Thermal/fossil technical specifications: design heat rate.  For unit ownership details, use `POST /units/ownership`.  This endpoint operates at the unit level, matching the underlying source data.  Reflects current data only; historical or point-in-time values are not retained.  **Input flexibility:** You can provide either plant IDs or unit IDs. When you provide a plant ID, all units within that plant are returned. Unit names, parent plant IDs, EIA codes, project grades, and regional mappings are included in the metadata response. 

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
    public class ListPlantUnitsExample
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

            var apiInstance = new UnitsApi(config);

            var plantUnitsRequest = new PlantUnitsRequest(); // PlantUnitsRequest | 

            try
            {
                // Returns power plant unit metadata and technical details
                PlantUnitsResponse result = apiInstance.ListPlantUnits(plantUnitsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UnitsApi.ListPlantUnits: " + e.Message );
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
 **plantUnitsRequest** | [**PlantUnitsRequest**](PlantUnitsRequest.md)|  | 

### Return type
[**PlantUnitsResponse**](PlantUnitsResponse.md)

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


<a name="listunitsownership"></a>
# **ListUnitsOwnership**
> UnitsOwnershipResponse ListUnitsOwnership (UnitsOwnershipRequest unitsOwnershipRequest)

Returns power plant unit ownership details

Returns ownership records for the specified unit IDs, including owner name, FactSet entity ID, ownership percentage, ultimate parent entity, and the plant ID for each unit.  This endpoint is a convenience endpoint that returns ownership data with the plant ID included. For other unit detail categories (metadata, pipeline, solar, wind, thermal), use `POST /units/details`.  Reflects current data only; historical or point-in-time values are not retained. 

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
    public class ListUnitsOwnershipExample
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

            var apiInstance = new UnitsApi(config);

            var unitsOwnershipRequest = new UnitsOwnershipRequest(); // UnitsOwnershipRequest | 

            try
            {
                // Returns power plant unit ownership details
                UnitsOwnershipResponse result = apiInstance.ListUnitsOwnership(unitsOwnershipRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling UnitsApi.ListUnitsOwnership: " + e.Message );
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
 **unitsOwnershipRequest** | [**UnitsOwnershipRequest**](UnitsOwnershipRequest.md)|  | 

### Return type
[**UnitsOwnershipResponse**](UnitsOwnershipResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with unit ownership records. |  -  |
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


