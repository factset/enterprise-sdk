# BasicApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBasicAssetClassList**](BasicApi.md#getBasicAssetClassList) | **GET** /basic/asset-class/list | List of asset classes.
[**getBasicBenchmarkTypeList**](BasicApi.md#getBasicBenchmarkTypeList) | **GET** /basic/benchmark/type/list | List of benchmark types.
[**getBasicFrequencyTypeList**](BasicApi.md#getBasicFrequencyTypeList) | **GET** /basic/frequency/type/list | List of frequency types.
[**getBasicLanguageGet**](BasicApi.md#getBasicLanguageGet) | **GET** /basic/language/get | Details for a language.
[**getBasicLanguageGetByCode**](BasicApi.md#getBasicLanguageGetByCode) | **GET** /basic/language/get-by-code | Details for a language identified by code.
[**getBasicLanguageList**](BasicApi.md#getBasicLanguageList) | **GET** /basic/language/list | List of languages.
[**getBasicMarketGet**](BasicApi.md#getBasicMarketGet) | **GET** /basic/market/get | Details of a market.
[**getBasicMarketGroupList**](BasicApi.md#getBasicMarketGroupList) | **GET** /basic/market/group/list | List of market groups.
[**getBasicMarketTypeList**](BasicApi.md#getBasicMarketTypeList) | **GET** /basic/market/type/list | List of market types.
[**getBasicMediaKindList**](BasicApi.md#getBasicMediaKindList) | **GET** /basic/media/kind/list | List of media kinds.
[**getBasicRegionContinentGet**](BasicApi.md#getBasicRegionContinentGet) | **GET** /basic/region/continent/get | Details for a continent.
[**getBasicRegionContinentList**](BasicApi.md#getBasicRegionContinentList) | **GET** /basic/region/continent/list | List of continents.
[**getBasicRegionCountryGet**](BasicApi.md#getBasicRegionCountryGet) | **GET** /basic/region/country/get | Details for a country.
[**getBasicRegionCountryGetByCode**](BasicApi.md#getBasicRegionCountryGetByCode) | **GET** /basic/region/country/get-by-code | Details for a country identified by code.
[**getBasicRegionCountryList**](BasicApi.md#getBasicRegionCountryList) | **GET** /basic/region/country/list | List of countries.
[**getBasicRegionGet**](BasicApi.md#getBasicRegionGet) | **GET** /basic/region/get | Details for a region.
[**getBasicRegionList**](BasicApi.md#getBasicRegionList) | **GET** /basic/region/list | List of regions.
[**getBasicTimezoneGet**](BasicApi.md#getBasicTimezoneGet) | **GET** /basic/timezone/get | Details of a timezone.
[**getBasicTimezoneGetByName**](BasicApi.md#getBasicTimezoneGetByName) | **GET** /basic/timezone/get-by-name | Details of a timezone identified by name.
[**getBasicValueUnitAlternativeList**](BasicApi.md#getBasicValueUnitAlternativeList) | **GET** /basic/value-unit/alternative/list | List of alternative units.
[**getBasicValueUnitCurrencyFractionalGet**](BasicApi.md#getBasicValueUnitCurrencyFractionalGet) | **GET** /basic/value-unit/currency/fractional/get | Details of a fractional currency.
[**getBasicValueUnitCurrencyFractionalList**](BasicApi.md#getBasicValueUnitCurrencyFractionalList) | **GET** /basic/value-unit/currency/fractional/list | List of fractional currencies.
[**getBasicValueUnitGet**](BasicApi.md#getBasicValueUnitGet) | **GET** /basic/value-unit/get | Details of a value unit.
[**postBasicBackgroundTextTypeList**](BasicApi.md#postBasicBackgroundTextTypeList) | **POST** /basic/background-text/type/list | List of background text types.
[**postBasicDeliveryList**](BasicApi.md#postBasicDeliveryList) | **POST** /basic/delivery/list | List of deliveries.
[**postBasicMarketList**](BasicApi.md#postBasicMarketList) | **POST** /basic/market/list | List of markets.
[**postBasicMediaTypeList**](BasicApi.md#postBasicMediaTypeList) | **POST** /basic/media/type/list | List of Internet media types.
[**postBasicMicOperatingList**](BasicApi.md#postBasicMicOperatingList) | **POST** /basic/mic/operating/list | List of operating market identifier codes (MIC).
[**postBasicTimezoneList**](BasicApi.md#postBasicTimezoneList) | **POST** /basic/timezone/list | List of timezones.
[**postBasicValueUnitCurrencyList**](BasicApi.md#postBasicValueUnitCurrencyList) | **POST** /basic/value-unit/currency/list | List of currencies.
[**postBasicValueUnitCurrencyMainList**](BasicApi.md#postBasicValueUnitCurrencyMainList) | **POST** /basic/value-unit/currency/main/list | List of main currencies.
[**postBasicValueUnitList**](BasicApi.md#postBasicValueUnitList) | **POST** /basic/value-unit/list | List of value units.



## getBasicAssetClassList

> InlineResponse200 getBasicAssetClassList(attributes)

List of asset classes.

List of asset classes as defined by FactSet Digital Solutions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getBasicAssetClassList(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicAssetClassList");
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


## getBasicBenchmarkTypeList

> InlineResponse2002 getBasicBenchmarkTypeList(attributes, metaLanguage)

List of benchmark types.

List of benchmark types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getBasicBenchmarkTypeList(attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicBenchmarkTypeList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicFrequencyTypeList

> InlineResponse2004 getBasicFrequencyTypeList(attributes, metaLanguage)

List of frequency types.

List of frequency types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2004 result = apiInstance.getBasicFrequencyTypeList(attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicFrequencyTypeList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicLanguageGet

> InlineResponse2005 getBasicLanguageGet(id, attributes, metaLanguage)

Details for a language.

Details for a language.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("2"); // BigDecimal | Identifier of a language.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2005 result = apiInstance.getBasicLanguageGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicLanguageGet");
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
 **id** | **BigDecimal**| Identifier of a language. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicLanguageGetByCode

> InlineResponse2006 getBasicLanguageGetByCode(code, attributes, metaLanguage)

Details for a language identified by code.

Details for a language identified by code.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        String code = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2006 result = apiInstance.getBasicLanguageGetByCode(code, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicLanguageGetByCode");
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
 **code** | **String**| ISO 639-1 code of the language. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicLanguageList

> InlineResponse2007 getBasicLanguageList(attributes, metaLanguage, sort)

List of languages.

List of languages.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |  
        try {
            InlineResponse2007 result = apiInstance.getBasicLanguageList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicLanguageList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |   | [optional] [enum: code, -code, name, -name]

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


## getBasicMarketGet

> InlineResponse2008 getBasicMarketGet(id, attributes, metaLanguage)

Details of a market.

Details of a market.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("2"); // BigDecimal | Identifier of a market.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2008 result = apiInstance.getBasicMarketGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicMarketGet");
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
 **id** | **BigDecimal**| Identifier of a market. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicMarketGroupList

> InlineResponse20010 getBasicMarketGroupList(attributes, metaLanguage, sort)

List of market groups.

List of market groups.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name | | shortName | | -shortName |  
        try {
            InlineResponse20010 result = apiInstance.getBasicMarketGroupList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicMarketGroupList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name | | shortName | | -shortName |   | [optional] [enum: name, -name, shortName, -shortName]

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


## getBasicMarketTypeList

> InlineResponse20011 getBasicMarketTypeList(attributes, metaLanguage, sort)

List of market types.

List of market types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |  
        try {
            InlineResponse20011 result = apiInstance.getBasicMarketTypeList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicMarketTypeList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |   | [optional] [enum: name, -name]

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


## getBasicMediaKindList

> InlineResponse20012 getBasicMediaKindList(attributes)

List of media kinds.

List of media kinds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20012 result = apiInstance.getBasicMediaKindList(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicMediaKindList");
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


## getBasicRegionContinentGet

> InlineResponse20017 getBasicRegionContinentGet(id, attributes, metaLanguage)

Details for a continent.

Details for a continent.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("1"); // BigDecimal | Identifier of a continent.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20017 result = apiInstance.getBasicRegionContinentGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionContinentGet");
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
 **id** | **BigDecimal**| Identifier of a continent. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicRegionContinentList

> InlineResponse20018 getBasicRegionContinentList(attributes, metaLanguage, sort)

List of continents.

List of continents.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |  
        try {
            InlineResponse20018 result = apiInstance.getBasicRegionContinentList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionContinentList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |   | [optional] [enum: name, -name]

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


## getBasicRegionCountryGet

> InlineResponse20019 getBasicRegionCountryGet(id, attributes, metaLanguage)

Details for a country.

Details for a country.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("4"); // BigDecimal | Identifier of a country.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20019 result = apiInstance.getBasicRegionCountryGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionCountryGet");
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
 **id** | **BigDecimal**| Identifier of a country. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicRegionCountryGetByCode

> InlineResponse20020 getBasicRegionCountryGetByCode(code, attributes, metaLanguage)

Details for a country identified by code.

Details for a country identified by code.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        String code = "DE"; // String | ISO 3166-1 alpha-2 code of a country.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20020 result = apiInstance.getBasicRegionCountryGetByCode(code, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionCountryGetByCode");
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
 **code** | **String**| ISO 3166-1 alpha-2 code of a country. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicRegionCountryList

> InlineResponse20021 getBasicRegionCountryList(attributes, metaLanguage, sort)

List of countries.

List of countries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |  
        try {
            InlineResponse20021 result = apiInstance.getBasicRegionCountryList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionCountryList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |   | [optional] [enum: code, -code, name, -name]

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


## getBasicRegionGet

> InlineResponse20015 getBasicRegionGet(id, attributes, metaLanguage)

Details for a region.

Details for a geographic, political, or economic region.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("5"); // BigDecimal | Identifier of a region.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20015 result = apiInstance.getBasicRegionGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionGet");
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
 **id** | **BigDecimal**| Identifier of a region. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getBasicRegionList

> InlineResponse20016 getBasicRegionList(attributes, metaLanguage, sort)

List of regions.

List of geographic, political, and economic regions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |  
        try {
            InlineResponse20016 result = apiInstance.getBasicRegionList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicRegionList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | code | | -code | | name | | -name |   | [optional] [enum: code, -code, name, -name]

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


## getBasicTimezoneGet

> InlineResponse20022 getBasicTimezoneGet(id, attributes)

Details of a timezone.

Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("1"); // BigDecimal | Identifier of a timezone. An invalid or unsupported identifier will result in an error.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20022 result = apiInstance.getBasicTimezoneGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicTimezoneGet");
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
 **id** | **BigDecimal**| Identifier of a timezone. An invalid or unsupported identifier will result in an error. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## getBasicTimezoneGetByName

> InlineResponse20023 getBasicTimezoneGetByName(name, attributes)

Details of a timezone identified by name.

Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        String name = "America/New_York"; // String | Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20023 result = apiInstance.getBasicTimezoneGetByName(name, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicTimezoneGetByName");
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
 **name** | **String**| Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20023**](InlineResponse20023.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getBasicValueUnitAlternativeList

> InlineResponse20027 getBasicValueUnitAlternativeList(attributes, metaLanguage, sort)

List of alternative units.

List of alternative units.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |  
        try {
            InlineResponse20027 result = apiInstance.getBasicValueUnitAlternativeList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicValueUnitAlternativeList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |   | [optional] [enum: name, -name]

### Return type

[**InlineResponse20027**](InlineResponse20027.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getBasicValueUnitCurrencyFractionalGet

> InlineResponse20029 getBasicValueUnitCurrencyFractionalGet(id, attributes, metaLanguage)

Details of a fractional currency.

Details of a fractional currency.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("1"); // BigDecimal | Identifier of a fractional currency.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20029 result = apiInstance.getBasicValueUnitCurrencyFractionalGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicValueUnitCurrencyFractionalGet");
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
 **id** | **BigDecimal**| Identifier of a fractional currency. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20029**](InlineResponse20029.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getBasicValueUnitCurrencyFractionalList

> InlineResponse20030 getBasicValueUnitCurrencyFractionalList(attributes, metaLanguage, sort)

List of fractional currencies.

List of fractional currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |  
        try {
            InlineResponse20030 result = apiInstance.getBasicValueUnitCurrencyFractionalList(attributes, metaLanguage, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicValueUnitCurrencyFractionalList");
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name |   | [optional] [enum: name, -name]

### Return type

[**InlineResponse20030**](InlineResponse20030.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getBasicValueUnitGet

> InlineResponse20025 getBasicValueUnitGet(id, attributes, metaLanguage)

Details of a value unit.

Details of a value unit.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        BigDecimal id = new BigDecimal("5"); // BigDecimal | Identifier of a value unit.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20025 result = apiInstance.getBasicValueUnitGet(id, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#getBasicValueUnitGet");
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
 **id** | **BigDecimal**| Identifier of a value unit. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20025**](InlineResponse20025.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicBackgroundTextTypeList

> InlineResponse2001 postBasicBackgroundTextTypeList(postBasicBackgroundTextTypeListRequest)

List of background text types.

List of background text types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicBackgroundTextTypeListRequest postBasicBackgroundTextTypeListRequest = new PostBasicBackgroundTextTypeListRequest(); // PostBasicBackgroundTextTypeListRequest | Request Body
        try {
            InlineResponse2001 result = apiInstance.postBasicBackgroundTextTypeList(postBasicBackgroundTextTypeListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicBackgroundTextTypeList");
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
 **postBasicBackgroundTextTypeListRequest** | [**PostBasicBackgroundTextTypeListRequest**](PostBasicBackgroundTextTypeListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicDeliveryList

> InlineResponse2003 postBasicDeliveryList(postBasicDeliveryListRequest)

List of deliveries.

List of deliveries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicDeliveryListRequest postBasicDeliveryListRequest = new PostBasicDeliveryListRequest(); // PostBasicDeliveryListRequest | Request Body
        try {
            InlineResponse2003 result = apiInstance.postBasicDeliveryList(postBasicDeliveryListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicDeliveryList");
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
 **postBasicDeliveryListRequest** | [**PostBasicDeliveryListRequest**](PostBasicDeliveryListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicMarketList

> InlineResponse2009 postBasicMarketList(postBasicMarketListRequest)

List of markets.

List of markets.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicMarketListRequest postBasicMarketListRequest = new PostBasicMarketListRequest(); // PostBasicMarketListRequest | Request Body
        try {
            InlineResponse2009 result = apiInstance.postBasicMarketList(postBasicMarketListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicMarketList");
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
 **postBasicMarketListRequest** | [**PostBasicMarketListRequest**](PostBasicMarketListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicMediaTypeList

> InlineResponse20013 postBasicMediaTypeList(postBasicMediaTypeListRequest)

List of Internet media types.

List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicMediaTypeListRequest postBasicMediaTypeListRequest = new PostBasicMediaTypeListRequest(); // PostBasicMediaTypeListRequest | Request Body
        try {
            InlineResponse20013 result = apiInstance.postBasicMediaTypeList(postBasicMediaTypeListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicMediaTypeList");
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
 **postBasicMediaTypeListRequest** | [**PostBasicMediaTypeListRequest**](PostBasicMediaTypeListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20013**](InlineResponse20013.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicMicOperatingList

> InlineResponse20014 postBasicMicOperatingList(postBasicMicOperatingListRequest)

List of operating market identifier codes (MIC).

List of operating market identifier codes (MIC).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicMicOperatingListRequest postBasicMicOperatingListRequest = new PostBasicMicOperatingListRequest(); // PostBasicMicOperatingListRequest | Request Body
        try {
            InlineResponse20014 result = apiInstance.postBasicMicOperatingList(postBasicMicOperatingListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicMicOperatingList");
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
 **postBasicMicOperatingListRequest** | [**PostBasicMicOperatingListRequest**](PostBasicMicOperatingListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20014**](InlineResponse20014.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicTimezoneList

> InlineResponse20024 postBasicTimezoneList(postBasicTimezoneListRequest)

List of timezones.

List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicTimezoneListRequest postBasicTimezoneListRequest = new PostBasicTimezoneListRequest(); // PostBasicTimezoneListRequest | Request Body
        try {
            InlineResponse20024 result = apiInstance.postBasicTimezoneList(postBasicTimezoneListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicTimezoneList");
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
 **postBasicTimezoneListRequest** | [**PostBasicTimezoneListRequest**](PostBasicTimezoneListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20024**](InlineResponse20024.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicValueUnitCurrencyList

> InlineResponse20028 postBasicValueUnitCurrencyList(postBasicValueUnitCurrencyListRequest)

List of currencies.

List of currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicValueUnitCurrencyListRequest postBasicValueUnitCurrencyListRequest = new PostBasicValueUnitCurrencyListRequest(); // PostBasicValueUnitCurrencyListRequest | Request Body
        try {
            InlineResponse20028 result = apiInstance.postBasicValueUnitCurrencyList(postBasicValueUnitCurrencyListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicValueUnitCurrencyList");
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
 **postBasicValueUnitCurrencyListRequest** | [**PostBasicValueUnitCurrencyListRequest**](PostBasicValueUnitCurrencyListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20028**](InlineResponse20028.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicValueUnitCurrencyMainList

> InlineResponse20031 postBasicValueUnitCurrencyMainList(postBasicValueUnitCurrencyMainListRequest)

List of main currencies.

List of main currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicValueUnitCurrencyMainListRequest postBasicValueUnitCurrencyMainListRequest = new PostBasicValueUnitCurrencyMainListRequest(); // PostBasicValueUnitCurrencyMainListRequest | Request Body
        try {
            InlineResponse20031 result = apiInstance.postBasicValueUnitCurrencyMainList(postBasicValueUnitCurrencyMainListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicValueUnitCurrencyMainList");
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
 **postBasicValueUnitCurrencyMainListRequest** | [**PostBasicValueUnitCurrencyMainListRequest**](PostBasicValueUnitCurrencyMainListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postBasicValueUnitList

> InlineResponse20026 postBasicValueUnitList(postBasicValueUnitListRequest)

List of value units.

List of value units.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeNews.ApiClient;
import com.factset.sdk.RealTimeNews.ApiException;
import com.factset.sdk.RealTimeNews.Configuration;
import com.factset.sdk.RealTimeNews.auth.*;
import com.factset.sdk.RealTimeNews.models.*;
import com.factset.sdk.RealTimeNews.api.BasicApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        //
        // The confidential client instance should be reused in production environments.
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        BasicApi apiInstance = new BasicApi(defaultClient);
        PostBasicValueUnitListRequest postBasicValueUnitListRequest = new PostBasicValueUnitListRequest(); // PostBasicValueUnitListRequest | Request Body
        try {
            InlineResponse20026 result = apiInstance.postBasicValueUnitList(postBasicValueUnitListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BasicApi#postBasicValueUnitList");
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
 **postBasicValueUnitListRequest** | [**PostBasicValueUnitListRequest**](PostBasicValueUnitListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20026**](InlineResponse20026.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

