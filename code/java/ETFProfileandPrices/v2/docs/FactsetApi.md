# FactsetApi

All URIs are relative to *http://api-sandbox.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**factsetEtfAllocationAssetListBySymbolGet**](FactsetApi.md#factsetEtfAllocationAssetListBySymbolGet) | **GET** /factset/etf/allocation/asset/listBySymbol | This endpoint returns selected ETP&#39;s asset allocations.
[**factsetEtfAllocationCountryListBySymbolGet**](FactsetApi.md#factsetEtfAllocationCountryListBySymbolGet) | **GET** /factset/etf/allocation/country/listBySymbol | This endpoint returns selected ETP&#39;s country allocations.
[**factsetEtfAllocationExchangeListBySymbolGet**](FactsetApi.md#factsetEtfAllocationExchangeListBySymbolGet) | **GET** /factset/etf/allocation/exchange/listBySymbol | This endpoint returns selected ETP&#39;s exchange allocations.
[**factsetEtfAllocationRegionListBySymbolGet**](FactsetApi.md#factsetEtfAllocationRegionListBySymbolGet) | **GET** /factset/etf/allocation/region/listBySymbol | This endpoint returns selected ETP&#39;s region allocations.
[**factsetEtfAllocationSectorListBySymbolGet**](FactsetApi.md#factsetEtfAllocationSectorListBySymbolGet) | **GET** /factset/etf/allocation/sector/listBySymbol | This endpoint returns selected ETP&#39;s sector allocations.
[**factsetEtfCharacteristicsGetBySymbolGet**](FactsetApi.md#factsetEtfCharacteristicsGetBySymbolGet) | **GET** /factset/etf/characteristics/getBySymbol | Retrieve basic characteristic information for a specified ETP.
[**factsetEtfClassCategoryBroadListGet**](FactsetApi.md#factsetEtfClassCategoryBroadListGet) | **GET** /factset/etf/class/category/broad/list | List of ETP class broad categories.
[**factsetEtfClassCategoryFocusListGet**](FactsetApi.md#factsetEtfClassCategoryFocusListGet) | **GET** /factset/etf/class/category/focus/list | List of ETP class focus categories.
[**factsetEtfClassCategoryNicheListGet**](FactsetApi.md#factsetEtfClassCategoryNicheListGet) | **GET** /factset/etf/class/category/niche/list | List of ETP class niche categories.
[**factsetEtfClassGeographyListGet**](FactsetApi.md#factsetEtfClassGeographyListGet) | **GET** /factset/etf/class/geography/list | List of ETP class geographies.
[**factsetEtfClassGetBySymbolGet**](FactsetApi.md#factsetEtfClassGetBySymbolGet) | **GET** /factset/etf/class/getBySymbol | Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.
[**factsetEtfDistributionGetBySymbolGet**](FactsetApi.md#factsetEtfDistributionGetBySymbolGet) | **GET** /factset/etf/distribution/getBySymbol | Retrieve an ETP&#39;s current distribution details.
[**factsetEtfFundFlowsGetBySymbolGet**](FactsetApi.md#factsetEtfFundFlowsGetBySymbolGet) | **GET** /factset/etf/fundFlows/getBySymbol | Retrieve an ETP&#39;s cash inflow/outflows for various time periods.
[**factsetEtfGetBySymbolGet**](FactsetApi.md#factsetEtfGetBySymbolGet) | **GET** /factset/etf/getBySymbol | Retrieve basic profile information for a specified ETP.
[**factsetEtfGrowthOfTenKListBySymbolGet**](FactsetApi.md#factsetEtfGrowthOfTenKListBySymbolGet) | **GET** /factset/etf/growthOfTenK/listBySymbol | This endpoint returns selected ETP&#39;s Growth of 10K calculated values.
[**factsetEtfHoldingsListBySymbolGet**](FactsetApi.md#factsetEtfHoldingsListBySymbolGet) | **GET** /factset/etf/holdings/listBySymbol | Holdings details for an individual ETP.
[**factsetEtfPriceGetBySymbolGet**](FactsetApi.md#factsetEtfPriceGetBySymbolGet) | **GET** /factset/etf/price/getBySymbol | Retrieve historical ETP NAV values.
[**factsetEtfReturnsGetBySymbolGet**](FactsetApi.md#factsetEtfReturnsGetBySymbolGet) | **GET** /factset/etf/returns/getBySymbol | Retrieve total return data for a specified ETP.
[**factsetEtfStrategyGetBySymbolGet**](FactsetApi.md#factsetEtfStrategyGetBySymbolGet) | **GET** /factset/etf/strategy/getBySymbol | Retrieve various classification details for a specified ETP.
[**factsetEtfStrategySegmentListGet**](FactsetApi.md#factsetEtfStrategySegmentListGet) | **GET** /factset/etf/strategy/segment/list | Retrieve a list of ETP strategy segments.
[**factsetEtfStructureGetBySymbolGet**](FactsetApi.md#factsetEtfStructureGetBySymbolGet) | **GET** /factset/etf/structure/getBySymbol | Retrieve the basic structure information for a specified ETP.
[**factsetEtfTaxesAndFeesUsGetBySymbolGet**](FactsetApi.md#factsetEtfTaxesAndFeesUsGetBySymbolGet) | **GET** /factset/etf/taxesAndFees/us/getBySymbol | Retrieve the tax and fee related information for a specified ETP.
[**factsetEtfTimeSeriesListBySymbolGet**](FactsetApi.md#factsetEtfTimeSeriesListBySymbolGet) | **GET** /factset/etf/timeSeries/listBySymbol | Retrieve historical NAV data for a specified ETP.



## factsetEtfAllocationAssetListBySymbolGet

> InlineResponse2001 factsetEtfAllocationAssetListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s asset allocations.

This endpoint returns selected ETP's allocations grouped by asset class. The response will be sorted by weight in descending order.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2001 result = apiInstance.factsetEtfAllocationAssetListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfAllocationAssetListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfAllocationCountryListBySymbolGet

> InlineResponse2002 factsetEtfAllocationCountryListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s country allocations.

This endpoint returns selected ETP's allocations grouped by country names. The response will be sorted by weight in descending order.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2002 result = apiInstance.factsetEtfAllocationCountryListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfAllocationCountryListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfAllocationExchangeListBySymbolGet

> InlineResponse2003 factsetEtfAllocationExchangeListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s exchange allocations.

This endpoint returns selected ETP's allocations grouped by exchanges. The response will be sorted by weight in descending order.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2003 result = apiInstance.factsetEtfAllocationExchangeListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfAllocationExchangeListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfAllocationRegionListBySymbolGet

> InlineResponse2004 factsetEtfAllocationRegionListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s region allocations.

This endpoint returns selected ETP's allocations grouped by region names. The response will be sorted by weight in descending order.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2004 result = apiInstance.factsetEtfAllocationRegionListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfAllocationRegionListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfAllocationSectorListBySymbolGet

> InlineResponse2005 factsetEtfAllocationSectorListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s sector allocations.

This endpoint returns selected ETP's allocations grouped by sector names. The response will be sorted by weight in descending order.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2005 result = apiInstance.factsetEtfAllocationSectorListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfAllocationSectorListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfCharacteristicsGetBySymbolGet

> InlineResponse2006 factsetEtfCharacteristicsGetBySymbolGet(symbol, attributes)

Retrieve basic characteristic information for a specified ETP.

An ETP has many unique characteristics specific to its composition that differentiate it from other products. This includes details on leverage, hedging, derivatives, and service providers.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETF defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2006 result = apiInstance.factsetEtfCharacteristicsGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfCharacteristicsGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETF defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfClassCategoryBroadListGet

> InlineResponse2008 factsetEtfClassCategoryBroadListGet(attributes)

List of ETP class broad categories.

List of ETP class broad categories.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2008 result = apiInstance.factsetEtfClassCategoryBroadListGet(attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfClassCategoryBroadListGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfClassCategoryFocusListGet

> InlineResponse2009 factsetEtfClassCategoryFocusListGet(attributes, paginationOffset, paginationLimit)

List of ETP class focus categories.

List of ETP class focus categories.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2009 result = apiInstance.factsetEtfClassCategoryFocusListGet(attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfClassCategoryFocusListGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfClassCategoryNicheListGet

> InlineResponse20010 factsetEtfClassCategoryNicheListGet(attributes, paginationOffset, paginationLimit)

List of ETP class niche categories.

List of ETP class niche categories.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20010 result = apiInstance.factsetEtfClassCategoryNicheListGet(attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfClassCategoryNicheListGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfClassGeographyListGet

> InlineResponse20011 factsetEtfClassGeographyListGet(attributes)

List of ETP class geographies.

List of ETP class geographies.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20011 result = apiInstance.factsetEtfClassGeographyListGet(attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfClassGeographyListGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfClassGetBySymbolGet

> InlineResponse2007 factsetEtfClassGetBySymbolGet(symbol, attributes)

Retrieve an ETP&#39;s classification specific to asset class, geography, or investment strategy.

ETP classification is divided into three categories: Asset Class, Geography, and Investment Strategy. Asset class is determined based on the various asset types held by the fund, A fund's geography can be classified by region (e.g. Asia-Pac), specific geography (e.g. China) or economic development (e.g. BRIC). An ETP's investment strategy is classified in broad categories (e.g. Large Cap) and more granular categorizations.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2007 result = apiInstance.factsetEtfClassGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfClassGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfDistributionGetBySymbolGet

> InlineResponse20012 factsetEtfDistributionGetBySymbolGet(symbol, attributes)

Retrieve an ETP&#39;s current distribution details.

Retrieve distribution-related details for a specific ETP including dividend and capital gain distribution details.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20012 result = apiInstance.factsetEtfDistributionGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfDistributionGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfFundFlowsGetBySymbolGet

> InlineResponse20013 factsetEtfFundFlowsGetBySymbolGet(symbol, attributes)

Retrieve an ETP&#39;s cash inflow/outflows for various time periods.

Retrieve the amount invested or divested in a specific ETP over various time periods including one-day, one-week, one-month, one-year, and YTD.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20013 result = apiInstance.factsetEtfFundFlowsGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfFundFlowsGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfGetBySymbolGet

> InlineResponse200 factsetEtfGetBySymbolGet(symbol, attributes)

Retrieve basic profile information for a specified ETP.

An ETP can be profiled by defining several common attributes such as issuer, fund description, and benchmark.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.factsetEtfGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfGrowthOfTenKListBySymbolGet

> InlineResponse20014 factsetEtfGrowthOfTenKListBySymbolGet(symbol, timePeriod, calculationType, attributes, paginationOffset, paginationLimit)

This endpoint returns selected ETP&#39;s Growth of 10K calculated values.

Growth of 10K (or growth of 10,000) is a commonly used chart that highlights the change in the value of an initial 10,000 investment in the ETP during a given period of time. Often, this period of time is either since inception or the calculation between the pre-defined range.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        String timePeriod = "1M"; // String | Historice NAV date value.
        String calculationType = "I"; // String | Historice NAV date value.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20014 result = apiInstance.factsetEtfGrowthOfTenKListBySymbolGet(symbol, timePeriod, calculationType, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfGrowthOfTenKListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **timePeriod** | **String**| Historice NAV date value. | [optional] [enum: 1M, 3M, 6M, YTD, 1Y, 3Y, 5Y, 10Y, SI]
 **calculationType** | **String**| Historice NAV date value. | [optional] [enum: I, SI]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfHoldingsListBySymbolGet

> InlineResponse20015 factsetEtfHoldingsListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit)

Holdings details for an individual ETP.

Retrieve an ETP's holdings information including security, shares held, and weight.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20015 result = apiInstance.factsetEtfHoldingsListBySymbolGet(symbol, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfHoldingsListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfPriceGetBySymbolGet

> InlineResponse20016 factsetEtfPriceGetBySymbolGet(symbol, attributes)

Retrieve historical ETP NAV values.

Retrieve an ETP's historical NAV and shares outstanding for a specified time range.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20016 result = apiInstance.factsetEtfPriceGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfPriceGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfReturnsGetBySymbolGet

> InlineResponse20017 factsetEtfReturnsGetBySymbolGet(symbol, returnType, attributes)

Retrieve total return data for a specified ETP.

An ETP's total return data can be returned for various time frames including 1-month, 3-month, YTD, 1-year, 3-year, and 5-year. Total return market price is used to calcualte price returns. Total return nav is used to calcualte nav returns.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        String returnType = "price"; // String | Return type.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20017 result = apiInstance.factsetEtfReturnsGetBySymbolGet(symbol, returnType, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfReturnsGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **returnType** | **String**| Return type. | [optional] [default to price] [enum: price, nav]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfStrategyGetBySymbolGet

> InlineResponse20018 factsetEtfStrategyGetBySymbolGet(symbol, attributes)

Retrieve various classification details for a specified ETP.

ETP's can be classified in many different ways including investment strategy, security weightings, and fund composition.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20018 result = apiInstance.factsetEtfStrategyGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfStrategyGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfStrategySegmentListGet

> InlineResponse20019 factsetEtfStrategySegmentListGet(attributes, paginationOffset, paginationLimit)

Retrieve a list of ETP strategy segments.

Retrieve the various segments assigned to a specific ETP. Segment data is used to group funds for comparison and relative performance analyses.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20019 result = apiInstance.factsetEtfStrategySegmentListGet(attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfStrategySegmentListGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## factsetEtfStructureGetBySymbolGet

> InlineResponse20020 factsetEtfStructureGetBySymbolGet(symbol, attributes)

Retrieve the basic structure information for a specified ETP.

Retrieve details on a fund's structure including its type, investment style (active/passive), and legal structure.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20020 result = apiInstance.factsetEtfStructureGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfStructureGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfTaxesAndFeesUsGetBySymbolGet

> InlineResponse20021 factsetEtfTaxesAndFeesUsGetBySymbolGet(symbol, attributes)

Retrieve the tax and fee related information for a specified ETP.

Retrieve various fee and tax related details on a specified ETP including expense ratio and tax treatment for dividends and capital gains.

### Example

```java
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20021 result = apiInstance.factsetEtfTaxesAndFeesUsGetBySymbolGet(symbol, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfTaxesAndFeesUsGetBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## factsetEtfTimeSeriesListBySymbolGet

> InlineResponse20022 factsetEtfTimeSeriesListBySymbolGet(symbol, timePeriod, attributes, paginationOffset, paginationLimit)

Retrieve historical NAV data for a specified ETP.

Retrieve the historical NAV data and the respective fund flows and shares outstanding for a specified fund and time period. Please refer currency.fund in /factset/etf/getBySymbol for currency value.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.ETFProfileandPrices.ApiClient;
import com.factset.sdk.ETFProfileandPrices.ApiException;
import com.factset.sdk.ETFProfileandPrices.Configuration;
import com.factset.sdk.ETFProfileandPrices.auth.*;
import com.factset.sdk.ETFProfileandPrices.model.*;
import com.factset.sdk.ETFProfileandPrices.api.FactsetApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        FactsetApi apiInstance = new FactsetApi(defaultClient);
        String symbol = "symbol_example"; // String | Market symbol of ETP defined by FactSet.
        String timePeriod = "1M"; // String | Time frame of the data.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20022 result = apiInstance.factsetEtfTimeSeriesListBySymbolGet(symbol, timePeriod, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FactsetApi#factsetEtfTimeSeriesListBySymbolGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **symbol** | **String**| Market symbol of ETP defined by FactSet. |
 **timePeriod** | **String**| Time frame of the data. | [optional] [default to 1Y] [enum: 1M, 3M, 6M, YTD, 1Y, 3Y, 5Y, 10Y, SI]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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

