# FactSet.SDK.ETFProfileandPrices.Api.FactsetApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**FactsetEtfAllocationAssetListBySymbolGet**](FactsetApi.md#factsetetfallocationassetlistbysymbolget) | **GET** /factset/etf/allocation/asset/listBySymbol | This endpoint returns selected ETP&#39;s asset allocations.
[**FactsetEtfAllocationCountryListBySymbolGet**](FactsetApi.md#factsetetfallocationcountrylistbysymbolget) | **GET** /factset/etf/allocation/country/listBySymbol | This endpoint returns selected ETP&#39;s country allocations.
[**FactsetEtfAllocationExchangeListBySymbolGet**](FactsetApi.md#factsetetfallocationexchangelistbysymbolget) | **GET** /factset/etf/allocation/exchange/listBySymbol | This endpoint returns selected ETP&#39;s exchange allocations.
[**FactsetEtfAllocationRegionListBySymbolGet**](FactsetApi.md#factsetetfallocationregionlistbysymbolget) | **GET** /factset/etf/allocation/region/listBySymbol | This endpoint returns selected ETP&#39;s region allocations.
[**FactsetEtfAllocationSectorListBySymbolGet**](FactsetApi.md#factsetetfallocationsectorlistbysymbolget) | **GET** /factset/etf/allocation/sector/listBySymbol | This endpoint returns selected ETP&#39;s sector allocations.
[**FactsetEtfCharacteristicsGetBySymbolGet**](FactsetApi.md#factsetetfcharacteristicsgetbysymbolget) | **GET** /factset/etf/characteristics/getBySymbol | Retrieve basic characteristic information for a specified ETP.
[**FactsetEtfClassCategoryBroadListGet**](FactsetApi.md#factsetetfclasscategorybroadlistget) | **GET** /factset/etf/class/category/broad/list | List of ETP class broad categories.
[**FactsetEtfClassCategoryFocusListGet**](FactsetApi.md#factsetetfclasscategoryfocuslistget) | **GET** /factset/etf/class/category/focus/list | List of ETP class focus categories.
[**FactsetEtfClassCategoryNicheListGet**](FactsetApi.md#factsetetfclasscategorynichelistget) | **GET** /factset/etf/class/category/niche/list | List of ETP class niche categories.
[**FactsetEtfClassGeographyListGet**](FactsetApi.md#factsetetfclassgeographylistget) | **GET** /factset/etf/class/geography/list | List of ETP class geographies.
[**FactsetEtfClassGetBySymbolGet**](FactsetApi.md#factsetetfclassgetbysymbolget) | **GET** /factset/etf/class/getBySymbol | Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
[**FactsetEtfDistributionGetBySymbolGet**](FactsetApi.md#factsetetfdistributiongetbysymbolget) | **GET** /factset/etf/distribution/getBySymbol | Retrieve an ETP&#39;s current distribution details.
[**FactsetEtfFundFlowsGetBySymbolGet**](FactsetApi.md#factsetetffundflowsgetbysymbolget) | **GET** /factset/etf/fundFlows/getBySymbol | Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
[**FactsetEtfGetBySymbolGet**](FactsetApi.md#factsetetfgetbysymbolget) | **GET** /factset/etf/getBySymbol | Retrieve basic profile information for a specified ETP.
[**FactsetEtfGrowthOfTenKListBySymbolGet**](FactsetApi.md#factsetetfgrowthoftenklistbysymbolget) | **GET** /factset/etf/growthOfTenK/listBySymbol | This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
[**FactsetEtfHoldingsListBySymbolGet**](FactsetApi.md#factsetetfholdingslistbysymbolget) | **GET** /factset/etf/holdings/listBySymbol | Holdings details for an individual ETP.
[**FactsetEtfPriceGetBySymbolGet**](FactsetApi.md#factsetetfpricegetbysymbolget) | **GET** /factset/etf/price/getBySymbol | Retrieve historical ETP NAV values.
[**FactsetEtfReturnsGetBySymbolGet**](FactsetApi.md#factsetetfreturnsgetbysymbolget) | **GET** /factset/etf/returns/getBySymbol | Retrieve total return data for a specified ETP.
[**FactsetEtfStrategyGetBySymbolGet**](FactsetApi.md#factsetetfstrategygetbysymbolget) | **GET** /factset/etf/strategy/getBySymbol | Retrieve various classification details for a specified ETP.
[**FactsetEtfStrategySegmentListGet**](FactsetApi.md#factsetetfstrategysegmentlistget) | **GET** /factset/etf/strategy/segment/list | Retrieve a list of ETP strategy segments.
[**FactsetEtfStructureGetBySymbolGet**](FactsetApi.md#factsetetfstructuregetbysymbolget) | **GET** /factset/etf/structure/getBySymbol | Retrieve the basic structure information for a specified ETP.
[**FactsetEtfTaxesAndFeesUsGetBySymbolGet**](FactsetApi.md#factsetetftaxesandfeesusgetbysymbolget) | **GET** /factset/etf/taxesAndFees/us/getBySymbol | Retrieve the tax and fee related information for a specified ETP.
[**FactsetEtfTimeSeriesListBySymbolGet**](FactsetApi.md#factsetetftimeserieslistbysymbolget) | **GET** /factset/etf/timeSeries/listBySymbol | Retrieve historical NAV data for a specified ETP.


<a name="factsetetfallocationassetlistbysymbolget"></a>
# **FactsetEtfAllocationAssetListBySymbolGet**
> InlineResponse2001 FactsetEtfAllocationAssetListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's asset allocations.

This endpoint returns selected ETP's allocations grouped by asset class. The response will be sorted by weight in descending order.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfAllocationAssetListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's asset allocations.
                InlineResponse2001 result = apiInstance.FactsetEtfAllocationAssetListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfAllocationAssetListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfallocationcountrylistbysymbolget"></a>
# **FactsetEtfAllocationCountryListBySymbolGet**
> InlineResponse2002 FactsetEtfAllocationCountryListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's country allocations.

This endpoint returns selected ETP's allocations grouped by country names. The response will be sorted by weight in descending order.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfAllocationCountryListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's country allocations.
                InlineResponse2002 result = apiInstance.FactsetEtfAllocationCountryListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfAllocationCountryListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfallocationexchangelistbysymbolget"></a>
# **FactsetEtfAllocationExchangeListBySymbolGet**
> InlineResponse2003 FactsetEtfAllocationExchangeListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's exchange allocations.

This endpoint returns selected ETP's allocations grouped by exchanges. The response will be sorted by weight in descending order.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfAllocationExchangeListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's exchange allocations.
                InlineResponse2003 result = apiInstance.FactsetEtfAllocationExchangeListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfAllocationExchangeListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfallocationregionlistbysymbolget"></a>
# **FactsetEtfAllocationRegionListBySymbolGet**
> InlineResponse2004 FactsetEtfAllocationRegionListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's region allocations.

This endpoint returns selected ETP's allocations grouped by region names. The response will be sorted by weight in descending order.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfAllocationRegionListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's region allocations.
                InlineResponse2004 result = apiInstance.FactsetEtfAllocationRegionListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfAllocationRegionListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfallocationsectorlistbysymbolget"></a>
# **FactsetEtfAllocationSectorListBySymbolGet**
> InlineResponse2005 FactsetEtfAllocationSectorListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's sector allocations.

This endpoint returns selected ETP's allocations grouped by sector names. The response will be sorted by weight in descending order.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfAllocationSectorListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's sector allocations.
                InlineResponse2005 result = apiInstance.FactsetEtfAllocationSectorListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfAllocationSectorListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfcharacteristicsgetbysymbolget"></a>
# **FactsetEtfCharacteristicsGetBySymbolGet**
> InlineResponse2006 FactsetEtfCharacteristicsGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve basic characteristic information for a specified ETP.

An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfCharacteristicsGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETF defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve basic characteristic information for a specified ETP.
                InlineResponse2006 result = apiInstance.FactsetEtfCharacteristicsGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfCharacteristicsGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETF defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfclasscategorybroadlistget"></a>
# **FactsetEtfClassCategoryBroadListGet**
> InlineResponse2008 FactsetEtfClassCategoryBroadListGet (List<string> attributes = null)

List of ETP class broad categories.

List of ETP class broad categories.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfClassCategoryBroadListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of ETP class broad categories.
                InlineResponse2008 result = apiInstance.FactsetEtfClassCategoryBroadListGet(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfClassCategoryBroadListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfclasscategoryfocuslistget"></a>
# **FactsetEtfClassCategoryFocusListGet**
> InlineResponse2009 FactsetEtfClassCategoryFocusListGet (List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of ETP class focus categories.

List of ETP class focus categories.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfClassCategoryFocusListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // List of ETP class focus categories.
                InlineResponse2009 result = apiInstance.FactsetEtfClassCategoryFocusListGet(attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfClassCategoryFocusListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfclasscategorynichelistget"></a>
# **FactsetEtfClassCategoryNicheListGet**
> InlineResponse20010 FactsetEtfClassCategoryNicheListGet (List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

List of ETP class niche categories.

List of ETP class niche categories.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfClassCategoryNicheListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // List of ETP class niche categories.
                InlineResponse20010 result = apiInstance.FactsetEtfClassCategoryNicheListGet(attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfClassCategoryNicheListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfclassgeographylistget"></a>
# **FactsetEtfClassGeographyListGet**
> InlineResponse20011 FactsetEtfClassGeographyListGet (List<string> attributes = null)

List of ETP class geographies.

List of ETP class geographies.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfClassGeographyListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of ETP class geographies.
                InlineResponse20011 result = apiInstance.FactsetEtfClassGeographyListGet(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfClassGeographyListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfclassgetbysymbolget"></a>
# **FactsetEtfClassGetBySymbolGet**
> InlineResponse2007 FactsetEtfClassGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve an ETP's classification specific to asset class, geography, or investment strategy.

ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund's geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP's investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfClassGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve an ETP's classification specific to asset class, geography, or investment strategy.
                InlineResponse2007 result = apiInstance.FactsetEtfClassGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfClassGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfdistributiongetbysymbolget"></a>
# **FactsetEtfDistributionGetBySymbolGet**
> InlineResponse20012 FactsetEtfDistributionGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve an ETP's current distribution details.

Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfDistributionGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve an ETP's current distribution details.
                InlineResponse20012 result = apiInstance.FactsetEtfDistributionGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfDistributionGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20012**](InlineResponse20012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetffundflowsgetbysymbolget"></a>
# **FactsetEtfFundFlowsGetBySymbolGet**
> InlineResponse20013 FactsetEtfFundFlowsGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve an ETP's cash inflow/outflows for various time periods.

Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfFundFlowsGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve an ETP's cash inflow/outflows for various time periods.
                InlineResponse20013 result = apiInstance.FactsetEtfFundFlowsGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfFundFlowsGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfgetbysymbolget"></a>
# **FactsetEtfGetBySymbolGet**
> InlineResponse200 FactsetEtfGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve basic profile information for a specified ETP.

An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve basic profile information for a specified ETP.
                InlineResponse200 result = apiInstance.FactsetEtfGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfgrowthoftenklistbysymbolget"></a>
# **FactsetEtfGrowthOfTenKListBySymbolGet**
> InlineResponse20014 FactsetEtfGrowthOfTenKListBySymbolGet (string symbol, string timePeriod = null, string calculationType = null, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

This endpoint returns selected ETP's Growth of 10K calculated values.

Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfGrowthOfTenKListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var timePeriod = timePeriod_example;  // string | Historice NAV date value. (optional) 
            var calculationType = calculationType_example;  // string | Historice NAV date value. (optional) 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // This endpoint returns selected ETP's Growth of 10K calculated values.
                InlineResponse20014 result = apiInstance.FactsetEtfGrowthOfTenKListBySymbolGet(symbol, timePeriod, calculationType, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfGrowthOfTenKListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **timePeriod** | **string**| Historice NAV date value. | [optional] 
 **calculationType** | **string**| Historice NAV date value. | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfholdingslistbysymbolget"></a>
# **FactsetEtfHoldingsListBySymbolGet**
> InlineResponse20015 FactsetEtfHoldingsListBySymbolGet (string symbol, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

Holdings details for an individual ETP.

Retrieve an ETP's holdings information including security, shares held, and weight.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfHoldingsListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // Holdings details for an individual ETP.
                InlineResponse20015 result = apiInstance.FactsetEtfHoldingsListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfHoldingsListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse20015**](InlineResponse20015.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfpricegetbysymbolget"></a>
# **FactsetEtfPriceGetBySymbolGet**
> InlineResponse20016 FactsetEtfPriceGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve historical ETP NAV values.

Retrieve an ETP's historical NAV and shares outstanding for a specified time range.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfPriceGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve historical ETP NAV values.
                InlineResponse20016 result = apiInstance.FactsetEtfPriceGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfPriceGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20016**](InlineResponse20016.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfreturnsgetbysymbolget"></a>
# **FactsetEtfReturnsGetBySymbolGet**
> InlineResponse20017 FactsetEtfReturnsGetBySymbolGet (string symbol, string returnType = null, List<string> attributes = null)

Retrieve total return data for a specified ETP.

An ETP's total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return market price is used to calcualte price returns. Total return nav is used to calcualte nav returns.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfReturnsGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var returnType = returnType_example;  // string | Return type. (optional)  (default to price)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve total return data for a specified ETP.
                InlineResponse20017 result = apiInstance.FactsetEtfReturnsGetBySymbolGet(symbol, returnType, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfReturnsGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **returnType** | **string**| Return type. | [optional] [default to price]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20017**](InlineResponse20017.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfstrategygetbysymbolget"></a>
# **FactsetEtfStrategyGetBySymbolGet**
> InlineResponse20018 FactsetEtfStrategyGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve various classification details for a specified ETP.

ETP's can be classified in many different ways including investment strategy, security weightings, and fund composition.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfStrategyGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve various classification details for a specified ETP.
                InlineResponse20018 result = apiInstance.FactsetEtfStrategyGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfStrategyGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20018**](InlineResponse20018.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfstrategysegmentlistget"></a>
# **FactsetEtfStrategySegmentListGet**
> InlineResponse20019 FactsetEtfStrategySegmentListGet (List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

Retrieve a list of ETP strategy segments.

Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfStrategySegmentListGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // Retrieve a list of ETP strategy segments.
                InlineResponse20019 result = apiInstance.FactsetEtfStrategySegmentListGet(attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfStrategySegmentListGet: " + e.Message );
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
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse20019**](InlineResponse20019.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetfstructuregetbysymbolget"></a>
# **FactsetEtfStructureGetBySymbolGet**
> InlineResponse20020 FactsetEtfStructureGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve the basic structure information for a specified ETP.

Retrieve details on a fund's structure including its type, investment style (active/passive), and legal structure.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfStructureGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve the basic structure information for a specified ETP.
                InlineResponse20020 result = apiInstance.FactsetEtfStructureGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfStructureGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20020**](InlineResponse20020.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetftaxesandfeesusgetbysymbolget"></a>
# **FactsetEtfTaxesAndFeesUsGetBySymbolGet**
> InlineResponse20021 FactsetEtfTaxesAndFeesUsGetBySymbolGet (string symbol, List<string> attributes = null)

Retrieve the tax and fee related information for a specified ETP.

Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfTaxesAndFeesUsGetBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve the tax and fee related information for a specified ETP.
                InlineResponse20021 result = apiInstance.FactsetEtfTaxesAndFeesUsGetBySymbolGet(symbol, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfTaxesAndFeesUsGetBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type

[**InlineResponse20021**](InlineResponse20021.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="factsetetftimeserieslistbysymbolget"></a>
# **FactsetEtfTimeSeriesListBySymbolGet**
> InlineResponse20022 FactsetEtfTimeSeriesListBySymbolGet (string symbol, string timePeriod = null, List<string> attributes = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

Retrieve historical NAV data for a specified ETP.

Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ETFProfileandPrices.Api;
using FactSet.SDK.ETFProfileandPrices.Client;
using FactSet.SDK.ETFProfileandPrices.Model;

namespace Example
{
    public class FactsetEtfTimeSeriesListBySymbolGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FactsetApi(config);
            var symbol = symbol_example;  // string | Market symbol of ETP defined by FactSet.
            var timePeriod = timePeriod_example;  // string | Time frame of the data. (optional)  (default to 1Y)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var paginationOffset = 8.14;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 8.14;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // Retrieve historical NAV data for a specified ETP.
                InlineResponse20022 result = apiInstance.FactsetEtfTimeSeriesListBySymbolGet(symbol, timePeriod, attributes, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactsetApi.FactsetEtfTimeSeriesListBySymbolGet: " + e.Message );
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
 **symbol** | **string**| Market symbol of ETP defined by FactSet. | 
 **timePeriod** | **string**| Time frame of the data. | [optional] [default to 1Y]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type

[**InlineResponse20022**](InlineResponse20022.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

