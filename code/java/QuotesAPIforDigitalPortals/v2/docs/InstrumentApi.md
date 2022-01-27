# InstrumentApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstrumentBackgroundTextListByInstrument**](InstrumentApi.md#getInstrumentBackgroundTextListByInstrument) | **GET** /instrument/backgroundText/listByInstrument | Background texts of an instrument.
[**getInstrumentCompliancePropertyListByInstrument**](InstrumentApi.md#getInstrumentCompliancePropertyListByInstrument) | **GET** /instrument/complianceProperty/listByInstrument | Compliance properties of an instrument.
[**getInstrumentCompositeGet**](InstrumentApi.md#getInstrumentCompositeGet) | **GET** /instrument/composite/get | Composite instrument and its components.
[**getInstrumentCouponDayCountConventionTypeList**](InstrumentApi.md#getInstrumentCouponDayCountConventionTypeList) | **GET** /instrument/coupon/dayCountConvention/type/list | List of day count convention types.
[**getInstrumentCouponInterestRateTypeList**](InstrumentApi.md#getInstrumentCouponInterestRateTypeList) | **GET** /instrument/coupon/interestRate/type/list | List of interest rate types.
[**getInstrumentCouponKeyDataGet**](InstrumentApi.md#getInstrumentCouponKeyDataGet) | **GET** /instrument/coupon/keyData/get | Interest rate details for selected periods of an interest-bearing instrument.
[**getInstrumentCouponList**](InstrumentApi.md#getInstrumentCouponList) | **GET** /instrument/coupon/list | List of coupons for an interest-bearing instrument.
[**getInstrumentCrossReferenceGetByISIN**](InstrumentApi.md#getInstrumentCrossReferenceGetByISIN) | **GET** /instrument/crossReference/getByISIN | Translate ISIN to instrument.
[**getInstrumentCrossReferenceGetByWKN**](InstrumentApi.md#getInstrumentCrossReferenceGetByWKN) | **GET** /instrument/crossReference/getByWKN | Translate WKN to instrument.
[**getInstrumentCrossReferenceHistoryGetByISIN**](InstrumentApi.md#getInstrumentCrossReferenceHistoryGetByISIN) | **GET** /instrument/crossReference/history/getByISIN | ISIN to instrument translation history.
[**getInstrumentCrossReferenceHistoryGetByWKN**](InstrumentApi.md#getInstrumentCrossReferenceHistoryGetByWKN) | **GET** /instrument/crossReference/history/getByWKN | WKN to instrument translation history.
[**getInstrumentExchangeRateGet**](InstrumentApi.md#getInstrumentExchangeRateGet) | **GET** /instrument/exchangeRate/get | Retrieve an exchange rate instrument identifier.
[**getInstrumentExchangeRateGetByISOCode**](InstrumentApi.md#getInstrumentExchangeRateGetByISOCode) | **GET** /instrument/exchangeRate/getByISOCode | Retrieve an exchange rate instrument identifier.
[**getInstrumentGet**](InstrumentApi.md#getInstrumentGet) | **GET** /instrument/get | Basic data for an instrument.
[**getInstrumentGetByNotation**](InstrumentApi.md#getInstrumentGetByNotation) | **GET** /instrument/getByNotation | Basic data for an instrument.
[**getInstrumentLegalEntityBackgroundTextListByInstrument**](InstrumentApi.md#getInstrumentLegalEntityBackgroundTextListByInstrument) | **GET** /instrument/legalEntity/backgroundText/listByInstrument | Role-specific background texts of legal entities related to an instrument.
[**getInstrumentLegalEntityCompliancePropertyListByInstrument**](InstrumentApi.md#getInstrumentLegalEntityCompliancePropertyListByInstrument) | **GET** /instrument/legalEntity/complianceProperty/listByInstrument | Role-specific compliance properties of legal entities related to an instrument.
[**getInstrumentMifidGet**](InstrumentApi.md#getInstrumentMifidGet) | **GET** /instrument/mifid/get | MiFID II data for a financial instrument.
[**getInstrumentSearchBasic**](InstrumentApi.md#getInstrumentSearchBasic) | **GET** /instrument/search/basic | Basic search for instruments.
[**postInstrumentBackgroundTextTypeList**](InstrumentApi.md#postInstrumentBackgroundTextTypeList) | **POST** /instrument/backgroundText/type/list | List of background text types for instruments.
[**postInstrumentBenchmarkList**](InstrumentApi.md#postInstrumentBenchmarkList) | **POST** /instrument/benchmark/list | List of benchmarks of a financial instrument.
[**postInstrumentCategoryList**](InstrumentApi.md#postInstrumentCategoryList) | **POST** /instrument/category/list | List of categories assigned to a specific instrument the application is entitled to see.
[**postInstrumentCompliancePropertyList**](InstrumentApi.md#postInstrumentCompliancePropertyList) | **POST** /instrument/complianceProperty/list | List of compliance properties for instruments.
[**postInstrumentCrossReferenceListByISIN**](InstrumentApi.md#postInstrumentCrossReferenceListByISIN) | **POST** /instrument/crossReference/listByISIN | Translate a list of ISINs to instruments.
[**postInstrumentCrossReferenceListByWKN**](InstrumentApi.md#postInstrumentCrossReferenceListByWKN) | **POST** /instrument/crossReference/listByWKN | Translate a list of WKNs to instruments.
[**postInstrumentRatingGradeList**](InstrumentApi.md#postInstrumentRatingGradeList) | **POST** /instrument/rating/grade/list | List of rating grades for a list of instruments.



## getInstrumentBackgroundTextListByInstrument

> InlineResponse20044 getInstrumentBackgroundTextListByInstrument(id, attributes, language)

Background texts of an instrument.

Background texts of an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20044 result = apiInstance.getInstrumentBackgroundTextListByInstrument(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentBackgroundTextListByInstrument");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20044**](InlineResponse20044.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCompliancePropertyListByInstrument

> InlineResponse20049 getInstrumentCompliancePropertyListByInstrument(id, attributes, language)

Compliance properties of an instrument.

Compliance properties of an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20049 result = apiInstance.getInstrumentCompliancePropertyListByInstrument(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCompliancePropertyListByInstrument");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20049**](InlineResponse20049.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCompositeGet

> InlineResponse20050 getInstrumentCompositeGet(id, attributes, language)

Composite instrument and its components.

Composite instrument and its components.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of a composite instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20050 result = apiInstance.getInstrumentCompositeGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCompositeGet");
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
 **id** | **String**| Identifier of a composite instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20050**](InlineResponse20050.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCouponDayCountConventionTypeList

> InlineResponse20052 getInstrumentCouponDayCountConventionTypeList(attributes, language)

List of day count convention types.

List of day count convention types.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20052 result = apiInstance.getInstrumentCouponDayCountConventionTypeList(attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCouponDayCountConventionTypeList");
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
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20052**](InlineResponse20052.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCouponInterestRateTypeList

> InlineResponse20053 getInstrumentCouponInterestRateTypeList(attributes, language)

List of interest rate types.

List of interest rate types.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20053 result = apiInstance.getInstrumentCouponInterestRateTypeList(attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCouponInterestRateTypeList");
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
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20053**](InlineResponse20053.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCouponKeyDataGet

> InlineResponse20054 getInstrumentCouponKeyDataGet(id, attributes, language)

Interest rate details for selected periods of an interest-bearing instrument.

Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20054 result = apiInstance.getInstrumentCouponKeyDataGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCouponKeyDataGet");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20054**](InlineResponse20054.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCouponList

> InlineResponse20051 getInstrumentCouponList(id, attributes, language)

List of coupons for an interest-bearing instrument.

List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument. 

If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20051 result = apiInstance.getInstrumentCouponList(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCouponList");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20051**](InlineResponse20051.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCrossReferenceGetByISIN

> InlineResponse20055 getInstrumentCrossReferenceGetByISIN(isin, attributes)

Translate ISIN to instrument.

Translate a given ISIN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String isin = "isin_example"; // String | Source ISIN to be translated.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20055 result = apiInstance.getInstrumentCrossReferenceGetByISIN(isin, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCrossReferenceGetByISIN");
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
 **isin** | **String**| Source ISIN to be translated. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCrossReferenceGetByWKN

> InlineResponse20055 getInstrumentCrossReferenceGetByWKN(wkn, attributes)

Translate WKN to instrument.

Translate a given WKN to the respective most recent instrument identifier, retrieved from the Cross Reference Service.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String wkn = "wkn_example"; // String | Source WKN to be translated.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20055 result = apiInstance.getInstrumentCrossReferenceGetByWKN(wkn, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCrossReferenceGetByWKN");
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
 **wkn** | **String**| Source WKN to be translated. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20055**](InlineResponse20055.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCrossReferenceHistoryGetByISIN

> InlineResponse20058 getInstrumentCrossReferenceHistoryGetByISIN(isin, attributes, paginationOffset, paginationLimit)

ISIN to instrument translation history.

Retrieve the complete translation history of a given ISIN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String isin = "isin_example"; // String | Source ISIN to be translated.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("10.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20058 result = apiInstance.getInstrumentCrossReferenceHistoryGetByISIN(isin, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCrossReferenceHistoryGetByISIN");
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
 **isin** | **String**| Source ISIN to be translated. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 10.0]

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentCrossReferenceHistoryGetByWKN

> InlineResponse20058 getInstrumentCrossReferenceHistoryGetByWKN(wkn, attributes, paginationOffset, paginationLimit)

WKN to instrument translation history.

Retrieve the complete translation history of a given WKN to the respective instrument association from the Cross Reference Service. The results are sorted in descending order, starting with the most recent.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String wkn = "wkn_example"; // String | Source WKN to be translated.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("10.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20058 result = apiInstance.getInstrumentCrossReferenceHistoryGetByWKN(wkn, attributes, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentCrossReferenceHistoryGetByWKN");
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
 **wkn** | **String**| Source WKN to be translated. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 10.0]

### Return type

[**InlineResponse20058**](InlineResponse20058.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentExchangeRateGet

> InlineResponse20059 getInstrumentExchangeRateGet(target, source, attributes, language)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the identifier of the main currencies represented by that exchange rate. 

 An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        BigDecimal target = new BigDecimal(78); // BigDecimal | Identifier of the target main currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
        BigDecimal source = new BigDecimal(78); // BigDecimal | Identifier of the source main currency. See endpoint `/basic/valueUnit/currency/main/list` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20059 result = apiInstance.getInstrumentExchangeRateGet(target, source, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentExchangeRateGet");
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
 **target** | **BigDecimal**| Identifier of the target main currency. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for valid values. |
 **source** | **BigDecimal**| Identifier of the source main currency. See endpoint &#x60;/basic/valueUnit/currency/main/list&#x60; for valid values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentExchangeRateGetByISOCode

> InlineResponse20059 getInstrumentExchangeRateGetByISOCode(target, source, attributes, language)

Retrieve an exchange rate instrument identifier.

Retrieve an exchange rate instrument identifier using the ISO 4217 code of the main currencies represented by that exchange rate. 

An error is returned if one of the provided parameters is invalid or if no instrument is associated with the given combination of parameters.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String target = "target_example"; // String | ISO 4217 code of the target main currency.
        String source = "source_example"; // String | ISO 4217 code of the source main currency.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20059 result = apiInstance.getInstrumentExchangeRateGetByISOCode(target, source, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentExchangeRateGetByISOCode");
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
 **target** | **String**| ISO 4217 code of the target main currency. |
 **source** | **String**| ISO 4217 code of the source main currency. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20059**](InlineResponse20059.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentGet

> InlineResponse20042 getInstrumentGet(id, attributes, language)

Basic data for an instrument.

Basic data for an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20042 result = apiInstance.getInstrumentGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentGet");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20042**](InlineResponse20042.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentGetByNotation

> InlineResponse20043 getInstrumentGetByNotation(id, attributes, language)

Basic data for an instrument.

Basic data for an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20043 result = apiInstance.getInstrumentGetByNotation(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentGetByNotation");
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
 **id** | **String**| Identifier of a notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20043**](InlineResponse20043.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentLegalEntityBackgroundTextListByInstrument

> InlineResponse20060 getInstrumentLegalEntityBackgroundTextListByInstrument(id, attributes, language)

Role-specific background texts of legal entities related to an instrument.

Role-specific background texts of legal entities related to an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20060 result = apiInstance.getInstrumentLegalEntityBackgroundTextListByInstrument(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentLegalEntityBackgroundTextListByInstrument");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20060**](InlineResponse20060.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentLegalEntityCompliancePropertyListByInstrument

> InlineResponse20061 getInstrumentLegalEntityCompliancePropertyListByInstrument(id, attributes, language)

Role-specific compliance properties of legal entities related to an instrument.

Role-specic compliance properties of legal entities related to an instrument.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20061 result = apiInstance.getInstrumentLegalEntityCompliancePropertyListByInstrument(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentLegalEntityCompliancePropertyListByInstrument");
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
 **id** | **String**| Identifier of an instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20061**](InlineResponse20061.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentMifidGet

> InlineResponse20062 getInstrumentMifidGet(id, attributes, language)

MiFID II data for a financial instrument.

MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called "investment products".

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of the instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20062 result = apiInstance.getInstrumentMifidGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentMifidGet");
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
 **id** | **String**| Identifier of the instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse20062**](InlineResponse20062.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentSearchBasic

> InlineResponse20087 getInstrumentSearchBasic(searchValue, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit)

Basic search for instruments.

Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String searchValue = "searchValue_example"; // String | The search value of the instruments searching for. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
        java.util.Set<String> nsins = Arrays.asList(); // java.util.Set<String> | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched.
        String assetClass = "index"; // String | A parameter to limit the output to a particular asset class.
        Boolean onlyActive = true; // Boolean | If true, restricts the result to active instruments.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20087 result = apiInstance.getInstrumentSearchBasic(searchValue, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentSearchBasic");
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
 **searchValue** | **String**| The search value of the instruments searching for. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. |
 **nsins** | **List&lt;String&gt;**| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] [enum: wkn, valor, cusip, sedol]
 **assetClass** | **String**| A parameter to limit the output to a particular asset class. | [optional] [enum: index, stock, fund, etf, debt, investmentProduct, leveragedProduct, currency, commodity, option, future, interestRate]
 **onlyActive** | **Boolean**| If true, restricts the result to active instruments. | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20087**](InlineResponse20087.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentBackgroundTextTypeList

> InlineResponse20045 postInstrumentBackgroundTextTypeList(body)

List of background text types for instruments.

List of background text types for instruments.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject9 body = new InlineObject9(); // InlineObject9 | 
        try {
            InlineResponse20045 result = apiInstance.postInstrumentBackgroundTextTypeList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentBackgroundTextTypeList");
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
 **body** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse20045**](InlineResponse20045.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentBenchmarkList

> InlineResponse20046 postInstrumentBenchmarkList(body)

List of benchmarks of a financial instrument.

Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject10 body = new InlineObject10(); // InlineObject10 | 
        try {
            InlineResponse20046 result = apiInstance.postInstrumentBenchmarkList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentBenchmarkList");
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
 **body** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse20046**](InlineResponse20046.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentCategoryList

> InlineResponse20047 postInstrumentCategoryList(body)

List of categories assigned to a specific instrument the application is entitled to see.

List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject11 body = new InlineObject11(); // InlineObject11 | 
        try {
            InlineResponse20047 result = apiInstance.postInstrumentCategoryList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentCategoryList");
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
 **body** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**InlineResponse20047**](InlineResponse20047.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentCompliancePropertyList

> InlineResponse20048 postInstrumentCompliancePropertyList(body)

List of compliance properties for instruments.

List of compliance properties for instruments.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject12 body = new InlineObject12(); // InlineObject12 | 
        try {
            InlineResponse20048 result = apiInstance.postInstrumentCompliancePropertyList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentCompliancePropertyList");
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
 **body** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**InlineResponse20048**](InlineResponse20048.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentCrossReferenceListByISIN

> InlineResponse20056 postInstrumentCrossReferenceListByISIN(body)

Translate a list of ISINs to instruments.

Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject13 body = new InlineObject13(); // InlineObject13 | 
        try {
            InlineResponse20056 result = apiInstance.postInstrumentCrossReferenceListByISIN(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentCrossReferenceListByISIN");
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
 **body** | [**InlineObject13**](InlineObject13.md)|  |

### Return type

[**InlineResponse20056**](InlineResponse20056.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentCrossReferenceListByWKN

> InlineResponse20057 postInstrumentCrossReferenceListByWKN(body)

Translate a list of WKNs to instruments.

Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject14 body = new InlineObject14(); // InlineObject14 | 
        try {
            InlineResponse20057 result = apiInstance.postInstrumentCrossReferenceListByWKN(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentCrossReferenceListByWKN");
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
 **body** | [**InlineObject14**](InlineObject14.md)|  |

### Return type

[**InlineResponse20057**](InlineResponse20057.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentRatingGradeList

> InlineResponse20063 postInstrumentRatingGradeList(body)

List of rating grades for a list of instruments.

List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.model.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.InstrumentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.factset.com/wealth/v1");
        
        // Configure HTTP basic authorization: FactSetApiKey
        HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        FactSetApiKey.setUsername("YOUR USERNAME");
        FactSetApiKey.setPassword("YOUR PASSWORD");

        // Configure OAuth2 access token for authorization: FactSetOAuth2
        OAuth FactSetOAuth2 = (OAuth) defaultClient.getAuthentication("FactSetOAuth2");
        FactSetOAuth2.setAccessToken("YOUR ACCESS TOKEN");

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        InlineObject15 body = new InlineObject15(); // InlineObject15 | 
        try {
            InlineResponse20063 result = apiInstance.postInstrumentRatingGradeList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentRatingGradeList");
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
 **body** | [**InlineObject15**](InlineObject15.md)|  | [optional]

### Return type

[**InlineResponse20063**](InlineResponse20063.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

