# InstrumentApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInstrumentBackgroundTextList**](InstrumentApi.md#getInstrumentBackgroundTextList) | **GET** /instrument/backgroundText/list | Background texts of an instrument.
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
[**getInstrumentLegalEntityBackgroundTextList**](InstrumentApi.md#getInstrumentLegalEntityBackgroundTextList) | **GET** /instrument/legalEntity/backgroundText/list | Role-specific background texts of legal entities related to an instrument.
[**getInstrumentLegalEntityCompliancePropertyList**](InstrumentApi.md#getInstrumentLegalEntityCompliancePropertyList) | **GET** /instrument/legalEntity/complianceProperty/list | Role-specific compliance properties of legal entities related to an instrument.
[**getInstrumentMifidGet**](InstrumentApi.md#getInstrumentMifidGet) | **GET** /instrument/mifid/get | MiFID II data for a financial instrument.
[**getInstrumentSearchBasic**](InstrumentApi.md#getInstrumentSearchBasic) | **GET** /instrument/search/basic | Basic search for instruments.
[**getInstrumentSelectionListList**](InstrumentApi.md#getInstrumentSelectionListList) | **GET** /instrument/selectionList/list | Set of custom instrument-level selection lists.
[**getInstrumentSelectionListListByInstrument**](InstrumentApi.md#getInstrumentSelectionListListByInstrument) | **GET** /instrument/selectionList/listByInstrument | For each given instrument, returns the instrument-level selection lists of which the instrument is a member.
[**postInstrumentBackgroundTextTypeList**](InstrumentApi.md#postInstrumentBackgroundTextTypeList) | **POST** /instrument/backgroundText/type/list | List of background text types for instruments.
[**postInstrumentBenchmarkList**](InstrumentApi.md#postInstrumentBenchmarkList) | **POST** /instrument/benchmark/list | List of benchmarks of a financial instrument.
[**postInstrumentCategoryList**](InstrumentApi.md#postInstrumentCategoryList) | **POST** /instrument/category/list | List of categories assigned to a specific instrument the application is entitled to see.
[**postInstrumentCompliancePropertyList**](InstrumentApi.md#postInstrumentCompliancePropertyList) | **POST** /instrument/complianceProperty/list | List of compliance properties for instruments.
[**postInstrumentCrossReferenceListByISIN**](InstrumentApi.md#postInstrumentCrossReferenceListByISIN) | **POST** /instrument/crossReference/listByISIN | Translate a list of ISINs to instruments.
[**postInstrumentCrossReferenceListByWKN**](InstrumentApi.md#postInstrumentCrossReferenceListByWKN) | **POST** /instrument/crossReference/listByWKN | Translate a list of WKNs to instruments.
[**postInstrumentNotationList**](InstrumentApi.md#postInstrumentNotationList) | **POST** /instrument/notation/list | List of active, entitled notations for a set of instruments.
[**postInstrumentRatingGradeList**](InstrumentApi.md#postInstrumentRatingGradeList) | **POST** /instrument/rating/grade/list | List of rating grades for a list of instruments.
[**postInstrumentSelectionListMembersList**](InstrumentApi.md#postInstrumentSelectionListMembersList) | **POST** /instrument/selectionList/members/list | List of instruments belonging to an instrument-level selection list.



## getInstrumentBackgroundTextList

> InlineResponse20044 getInstrumentBackgroundTextList(identifier, identifierType, attributes, language)

Background texts of an instrument.

Background texts of an instrument.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20044 result = apiInstance.getInstrumentBackgroundTextList(identifier, identifierType, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentBackgroundTextList");
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20049 getInstrumentCompliancePropertyListByInstrument(identifier, identifierType, attributes, language)

Compliance properties of an instrument.

Compliance properties of an instrument.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20049 result = apiInstance.getInstrumentCompliancePropertyListByInstrument(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20050 getInstrumentCompositeGet(identifier, identifierType, attributes, language)

Composite instrument and its components.

Composite instrument and its components.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20050 result = apiInstance.getInstrumentCompositeGet(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **language** | **String**|  | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **language** | **String**|  | [optional]

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

> InlineResponse20054 getInstrumentCouponKeyDataGet(identifier, identifierType, attributes, language)

Interest rate details for selected periods of an interest-bearing instrument.

Interest rate details for selected periods of an interest-bearing instrument; any other instrument yields empty values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20054 result = apiInstance.getInstrumentCouponKeyDataGet(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20051 getInstrumentCouponList(identifier, identifierType, attributes, language)

List of coupons for an interest-bearing instrument.

List of coupons for an interest-bearing instrument; any other instrument yields empty values. The endpoint provides details regarding the coupon period, the respective interest rate, and payable amount (the latter only for instruments with a fixed nominal value). The list of coupons is generally not available for a perpetual, i.e. without a predefined maturity date, interst-bearing instrument. 

If there is no entitled provider supplying a full list of coupons, the list will be synthesized from summary data available from entitled suppliers (if any). Since the exact product terms are not known, e.g. the handling of holidays and weekends, the list may be imprecise.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20051 result = apiInstance.getInstrumentCouponList(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String isin = "isin_example"; // String | 
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
 **isin** | **String**|  |
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String wkn = "wkn_example"; // String | 
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
 **wkn** | **String**|  |
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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String isin = "isin_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("10"); // BigDecimal | Non-negative maximum number of entries to return.
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
 **isin** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 10]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String wkn = "wkn_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("10"); // BigDecimal | Non-negative maximum number of entries to return.
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
 **wkn** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 10]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        BigDecimal target = new BigDecimal(78); // BigDecimal | 
        BigDecimal source = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **target** | **BigDecimal**|  |
 **source** | **BigDecimal**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String target = "target_example"; // String | 
        String source = "source_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **target** | **String**|  |
 **source** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20042 getInstrumentGet(identifier, identifierType, attributes, language)

Basic data for an instrument.

Basic data for an instrument.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20042 result = apiInstance.getInstrumentGet(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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


## getInstrumentLegalEntityBackgroundTextList

> InlineResponse20060 getInstrumentLegalEntityBackgroundTextList(identifier, identifierType, attributes, language)

Role-specific background texts of legal entities related to an instrument.

Role-specific background texts of legal entities related to an instrument.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20060 result = apiInstance.getInstrumentLegalEntityBackgroundTextList(identifier, identifierType, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentLegalEntityBackgroundTextList");
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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


## getInstrumentLegalEntityCompliancePropertyList

> InlineResponse20061 getInstrumentLegalEntityCompliancePropertyList(identifier, identifierType, attributes, language)

Role-specific compliance properties of legal entities related to an instrument.

Role-specic compliance properties of legal entities related to an instrument.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20061 result = apiInstance.getInstrumentLegalEntityCompliancePropertyList(identifier, identifierType, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentLegalEntityCompliancePropertyList");
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20062 getInstrumentMifidGet(identifier, identifierType, attributes, language)

MiFID II data for a financial instrument.

MiFID II data for a specified financial instrument. The instruments governed by MiFID II are called "investment products".

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String identifier = "identifier_example"; // String | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20062 result = apiInstance.getInstrumentMifidGet(identifier, identifierType, attributes, language);
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
 **identifier** | **String**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse20097 getInstrumentSearchBasic(searchValue, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit)

Basic search for instruments.

Search for instruments whose ISIN, specified NSINs, or name match the search value according to a tolerant full-text match algorithm. Better matching results appear in the response before less relevant matches.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        String searchValue = "searchValue_example"; // String | 
        java.util.Set<String> nsins = Arrays.asList(); // java.util.Set<String> | 
        String assetClass = "index"; // String | 
        Boolean onlyActive = true; // Boolean | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20097 result = apiInstance.getInstrumentSearchBasic(searchValue, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit);
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
 **searchValue** | **String**|  |
 **nsins** | **List&lt;String&gt;**|  | [optional] [enum: wkn, valor, cusip, sedol]
 **assetClass** | **String**|  | [optional] [enum: index, stock, fund, etf, debt, investmentProduct, leveragedProduct, currency, commodity, option, future, interestRate, right]
 **onlyActive** | **Boolean**|  | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20097**](InlineResponse20097.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentSelectionListList

> InlineResponse20065 getInstrumentSelectionListList(attributes)

Set of custom instrument-level selection lists.

Set of custom instrument-level selection lists.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20065 result = apiInstance.getInstrumentSelectionListList(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentSelectionListList");
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

[**InlineResponse20065**](InlineResponse20065.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getInstrumentSelectionListListByInstrument

> InlineResponse20066 getInstrumentSelectionListListByInstrument(identifiers, identifierType, attributes)

For each given instrument, returns the instrument-level selection lists of which the instrument is a member.

For each given instrument, returns the instrument-level selection lists of which the instrument is a member.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        java.util.Set<String> identifiers = Arrays.asList(); // java.util.Set<String> | 
        String identifierType = "idInstrument"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20066 result = apiInstance.getInstrumentSelectionListListByInstrument(identifiers, identifierType, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#getInstrumentSelectionListListByInstrument");
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
 **identifiers** | **List&lt;String&gt;**|  |
 **identifierType** | **String**|  | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20066**](InlineResponse20066.md)

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

> InlineResponse20045 postInstrumentBackgroundTextTypeList(postInstrumentBackgroundTextTypeListRequest)

List of background text types for instruments.

List of background text types for instruments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentBackgroundTextTypeListRequest postInstrumentBackgroundTextTypeListRequest = new PostInstrumentBackgroundTextTypeListRequest(); // PostInstrumentBackgroundTextTypeListRequest | Request Body
        try {
            InlineResponse20045 result = apiInstance.postInstrumentBackgroundTextTypeList(postInstrumentBackgroundTextTypeListRequest);
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
 **postInstrumentBackgroundTextTypeListRequest** | [**PostInstrumentBackgroundTextTypeListRequest**](PostInstrumentBackgroundTextTypeListRequest.md)| Request Body | [optional]

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

> InlineResponse20046 postInstrumentBenchmarkList(postInstrumentBenchmarkListRequest)

List of benchmarks of a financial instrument.

Provides a list of benchmark notations for a selected financial instrument, optionally restricted to specific benchmark types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentBenchmarkListRequest postInstrumentBenchmarkListRequest = new PostInstrumentBenchmarkListRequest(); // PostInstrumentBenchmarkListRequest | Request Body
        try {
            InlineResponse20046 result = apiInstance.postInstrumentBenchmarkList(postInstrumentBenchmarkListRequest);
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
 **postInstrumentBenchmarkListRequest** | [**PostInstrumentBenchmarkListRequest**](PostInstrumentBenchmarkListRequest.md)| Request Body | [optional]

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

> InlineResponse20047 postInstrumentCategoryList(postInstrumentCategoryListRequest)

List of categories assigned to a specific instrument the application is entitled to see.

List of categories assigned to a specific instrument the application is entitled to see. Optionally it is possible to restrict the output to only list those for a specific category dataset.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentCategoryListRequest postInstrumentCategoryListRequest = new PostInstrumentCategoryListRequest(); // PostInstrumentCategoryListRequest | Request Body
        try {
            InlineResponse20047 result = apiInstance.postInstrumentCategoryList(postInstrumentCategoryListRequest);
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
 **postInstrumentCategoryListRequest** | [**PostInstrumentCategoryListRequest**](PostInstrumentCategoryListRequest.md)| Request Body | [optional]

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

> InlineResponse20048 postInstrumentCompliancePropertyList(postInstrumentCompliancePropertyListRequest)

List of compliance properties for instruments.

List of compliance properties for instruments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentCompliancePropertyListRequest postInstrumentCompliancePropertyListRequest = new PostInstrumentCompliancePropertyListRequest(); // PostInstrumentCompliancePropertyListRequest | Request Body
        try {
            InlineResponse20048 result = apiInstance.postInstrumentCompliancePropertyList(postInstrumentCompliancePropertyListRequest);
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
 **postInstrumentCompliancePropertyListRequest** | [**PostInstrumentCompliancePropertyListRequest**](PostInstrumentCompliancePropertyListRequest.md)| Request Body | [optional]

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

> InlineResponse20056 postInstrumentCrossReferenceListByISIN(postInstrumentCrossReferenceListByISINRequest)

Translate a list of ISINs to instruments.

Translate a given list of ISINs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentCrossReferenceListByISINRequest postInstrumentCrossReferenceListByISINRequest = new PostInstrumentCrossReferenceListByISINRequest(); // PostInstrumentCrossReferenceListByISINRequest | Request Body
        try {
            InlineResponse20056 result = apiInstance.postInstrumentCrossReferenceListByISIN(postInstrumentCrossReferenceListByISINRequest);
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
 **postInstrumentCrossReferenceListByISINRequest** | [**PostInstrumentCrossReferenceListByISINRequest**](PostInstrumentCrossReferenceListByISINRequest.md)| Request Body |

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

> InlineResponse20057 postInstrumentCrossReferenceListByWKN(postInstrumentCrossReferenceListByWKNRequest)

Translate a list of WKNs to instruments.

Translate a given list of WKNs to the respective most recent instrument identifiers, retrieved from the Cross Reference Service.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentCrossReferenceListByWKNRequest postInstrumentCrossReferenceListByWKNRequest = new PostInstrumentCrossReferenceListByWKNRequest(); // PostInstrumentCrossReferenceListByWKNRequest | Request Body
        try {
            InlineResponse20057 result = apiInstance.postInstrumentCrossReferenceListByWKN(postInstrumentCrossReferenceListByWKNRequest);
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
 **postInstrumentCrossReferenceListByWKNRequest** | [**PostInstrumentCrossReferenceListByWKNRequest**](PostInstrumentCrossReferenceListByWKNRequest.md)| Request Body |

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


## postInstrumentNotationList

> InlineResponse20063 postInstrumentNotationList(postInstrumentNotationListRequest)

List of active, entitled notations for a set of instruments.

List of active, entitled notations for a set of instruments. By default the list of notations (per instrument) is sorted descending by the trading volume, averaged over one month. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentNotationListRequest postInstrumentNotationListRequest = new PostInstrumentNotationListRequest(); // PostInstrumentNotationListRequest | Request Body
        try {
            InlineResponse20063 result = apiInstance.postInstrumentNotationList(postInstrumentNotationListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentNotationList");
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
 **postInstrumentNotationListRequest** | [**PostInstrumentNotationListRequest**](PostInstrumentNotationListRequest.md)| Request Body | [optional]

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


## postInstrumentRatingGradeList

> InlineResponse20064 postInstrumentRatingGradeList(postInstrumentRatingGradeListRequest)

List of rating grades for a list of instruments.

List of rating grades for a list of instruments. The list can be restricted to rating grades belonging to particular rating systems.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentRatingGradeListRequest postInstrumentRatingGradeListRequest = new PostInstrumentRatingGradeListRequest(); // PostInstrumentRatingGradeListRequest | Request Body
        try {
            InlineResponse20064 result = apiInstance.postInstrumentRatingGradeList(postInstrumentRatingGradeListRequest);
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
 **postInstrumentRatingGradeListRequest** | [**PostInstrumentRatingGradeListRequest**](PostInstrumentRatingGradeListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postInstrumentSelectionListMembersList

> InlineResponse20067 postInstrumentSelectionListMembersList(postInstrumentSelectionListMembersListRequest)

List of instruments belonging to an instrument-level selection list.

List of instruments belonging to an instrument-level selection list.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.InstrumentApi;

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

        InstrumentApi apiInstance = new InstrumentApi(defaultClient);
        PostInstrumentSelectionListMembersListRequest postInstrumentSelectionListMembersListRequest = new PostInstrumentSelectionListMembersListRequest(); // PostInstrumentSelectionListMembersListRequest | Request Body
        try {
            InlineResponse20067 result = apiInstance.postInstrumentSelectionListMembersList(postInstrumentSelectionListMembersListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling InstrumentApi#postInstrumentSelectionListMembersList");
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
 **postInstrumentSelectionListMembersListRequest** | [**PostInstrumentSelectionListMembersListRequest**](PostInstrumentSelectionListMembersListRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse20067**](InlineResponse20067.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

