# FactSet.SDK.FactSetPowerUtilities.Api.ReferenceApi

All URIs are relative to *https://api.factset.com/content/factset-power-utilities/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ListEntityHistory**](ReferenceApi.md#listentityhistory) | **GET** /reference/entity-history | Returns entity and security history records
[**ListIsoMapping**](ReferenceApi.md#listisomapping) | **GET** /reference/iso-mapping | Returns ISO/TSO mapping data
[**ListLocationMapping**](ReferenceApi.md#listlocationmapping) | **GET** /reference/location-mapping | Returns power price location mapping data
[**ListZoneMapping**](ReferenceApi.md#listzonemapping) | **GET** /reference/zone-mapping | Returns price zone and hub mapping data



<a name="listentityhistory"></a>
# **ListEntityHistory**
> EntityHistoryResponse ListEntityHistory (string factsetEntityId = null, int? paginationLimit = null, int? paginationOffset = null)

Returns entity and security history records

Returns entity and security history records combining security-to-entity identifier mappings and entity ownership structure history, including immediate and ultimate parent entities.  **Helpful for:** Understanding entity relationships and parent-subsidiary structures related to plant ownership data returned by `POST /units/ownership`. 

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
    public class ListEntityHistoryExample
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

            var apiInstance = new ReferenceApi(config);

            var factsetEntityId = "0GSF7D-E";  // string | Filter records by a specific FactSet entity identifier (e.g., `\"0GSF7D-E\"`). (optional) 
            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. (optional)  (default to 0)

            try
            {
                // Returns entity and security history records
                EntityHistoryResponse result = apiInstance.ListEntityHistory(factsetEntityId, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.ListEntityHistory: " + e.Message );
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
 **factsetEntityId** | **string**| Filter records by a specific FactSet entity identifier (e.g., &#x60;\&quot;0GSF7D-E\&quot;&#x60;). | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. | [optional] [default to 0]

### Return type
[**EntityHistoryResponse**](EntityHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with entity history records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listisomapping"></a>
# **ListIsoMapping**
> IsoMappingResponse ListIsoMapping (int? paginationLimit = null, int? paginationOffset = null)

Returns ISO/TSO mapping data

Returns the complete list of ISO/TSO codes and their corresponding names.  **Helpful for:** Use this endpoint to understand available ISO/TSO codes for filtering in `GET /plants/ids` (via the `isoCode` parameter) and `GET /market-data/coverage`.  Reflects current data only; historical or point-in-time values are not retained. 

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
    public class ListIsoMappingExample
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

            var apiInstance = new ReferenceApi(config);

            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. (optional)  (default to 0)

            try
            {
                // Returns ISO/TSO mapping data
                IsoMappingResponse result = apiInstance.ListIsoMapping(paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.ListIsoMapping: " + e.Message );
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
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. | [optional] [default to 0]

### Return type
[**IsoMappingResponse**](IsoMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with ISO/TSO mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listlocationmapping"></a>
# **ListLocationMapping**
> LocationMappingResponse ListLocationMapping (string isoCode = null, int? paginationLimit = null, int? paginationOffset = null)

Returns power price location mapping data

Returns the list of ISO/TSO power price location codes (hub codes) used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories, with their names. Use the returned `locationId` values as input to those endpoints.  Note: these `iso_loc_code` identifiers are a distinct code space from the `iso_zone_code` identifiers used by `POST /prices?category=Capacity` — see `GET /reference/zone-mapping` for those.  Reflects current data only; historical or point-in-time values are not retained. 

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
    public class ListLocationMappingExample
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

            var apiInstance = new ReferenceApi(config);

            var isoCode = "ERCOT";  // string | Filter locations by ISO/TSO market. (optional) 
            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. (optional)  (default to 0)

            try
            {
                // Returns power price location mapping data
                LocationMappingResponse result = apiInstance.ListLocationMapping(isoCode, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.ListLocationMapping: " + e.Message );
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
 **isoCode** | **string**| Filter locations by ISO/TSO market. | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. | [optional] [default to 0]

### Return type
[**LocationMappingResponse**](LocationMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with power price location mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="listzonemapping"></a>
# **ListZoneMapping**
> ZoneMappingResponse ListZoneMapping (string isoCode = null, int? paginationLimit = null, int? paginationOffset = null)

Returns price zone and hub mapping data

Returns the list of ISO/TSO load distribution area and zone codes used by `POST /prices?category=Capacity`, with their names, price units, and auction frequency. Use the returned `locationId` values as input to that endpoint.  Note: these `iso_zone_code` identifiers are a distinct code space from the `iso_loc_code` identifiers used by `POST /prices` for the `Power`, `SparkSpread`, and `Forward` categories.  Reflects current data only; historical or point-in-time values are not retained. 

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
    public class ListZoneMappingExample
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

            var apiInstance = new ReferenceApi(config);

            var isoCode = "PJM";  // string | Filter locations by ISO/TSO market. (optional) 
            var paginationLimit = 100;  // int? | Maximum number of results to return per request. (optional)  (default to 100)
            var paginationOffset = 0;  // int? | Number of results to skip. (optional)  (default to 0)

            try
            {
                // Returns price zone and hub mapping data
                ZoneMappingResponse result = apiInstance.ListZoneMapping(isoCode, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.ListZoneMapping: " + e.Message );
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
 **isoCode** | **string**| Filter locations by ISO/TSO market. | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per request. | [optional] [default to 100]
 **paginationOffset** | **int?**| Number of results to skip. | [optional] [default to 0]

### Return type
[**ZoneMappingResponse**](ZoneMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with zone and hub mapping records |  -  |
| **400** | Bad Request — the request was malformed or a required parameter was missing. |  -  |
| **401** | Unauthenticated — no valid credentials were provided. |  -  |
| **403** | Forbidden — the credentials provided do not have access to this resource. |  -  |
| **404** | Not Found — the requested resource was not found. |  -  |
| **429** | Too Many Requests — the rate limit for this endpoint has been exceeded. |  -  |
| **500** | Internal Server Error — an unexpected error occurred on the server. |  -  |
| **503** | Service Unavailable — the service is temporarily unavailable. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


