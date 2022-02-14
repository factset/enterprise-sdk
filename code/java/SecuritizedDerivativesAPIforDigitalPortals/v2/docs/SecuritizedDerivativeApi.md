# SecuritizedDerivativeApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSecuritizedDerivativeBarrierTypeList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeBarrierTypeList) | **GET** /securitizedDerivative/barrier/type/list | List of barrier types.
[**getSecuritizedDerivativeGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeGet) | **GET** /securitizedDerivative/get | Fundamental data for a single securitized derivative.
[**getSecuritizedDerivativeKeyFiguresNotationGet**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeKeyFiguresNotationGet) | **GET** /securitizedDerivative/keyFigures/notation/get | Notation-based key figures of a securitized derivative.
[**getSecuritizedDerivativeUnderlyingList**](SecuritizedDerivativeApi.md#getSecuritizedDerivativeUnderlyingList) | **GET** /securitizedDerivative/underlying/list | List of underlyings with barrier and cash flow information.
[**postSecuritizedDerivativeIssuerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeIssuerSearch) | **POST** /securitizedDerivative/issuer/search | Search for issuers of securitized derivatives.
[**postSecuritizedDerivativeNotationRankingIntradayList**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationRankingIntradayList) | **POST** /securitizedDerivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**postSecuritizedDerivativeNotationScreenerSearch**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerSearch) | **POST** /securitizedDerivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**postSecuritizedDerivativeNotationScreenerValueRangesGet**](SecuritizedDerivativeApi.md#postSecuritizedDerivativeNotationScreenerValueRangesGet) | **POST** /securitizedDerivative/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivative/notation/screener/search&#x60;.



## getSecuritizedDerivativeBarrierTypeList

> InlineResponse2001 getSecuritizedDerivativeBarrierTypeList(attributes)

List of barrier types.

List of barrier types.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2001 result = apiInstance.getSecuritizedDerivativeBarrierTypeList(attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#getSecuritizedDerivativeBarrierTypeList");
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


## getSecuritizedDerivativeGet

> InlineResponse200 getSecuritizedDerivativeGet(id, attributes, language)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        String id = "id_example"; // String | Identifier of the instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse200 result = apiInstance.getSecuritizedDerivativeGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#getSecuritizedDerivativeGet");
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


## getSecuritizedDerivativeKeyFiguresNotationGet

> InlineResponse2003 getSecuritizedDerivativeKeyFiguresNotationGet(id, attributes, language)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references: 

Cover ratio - see attribute `underlyings.coverRatio` in endpoint `/securitizedDerivative/underlying/list`.

Various barrier types (e.g. strike, knock in) - see endpoint `/securitizedDerivative/barrier/type/list`.

Exercise right - see attribute `exercise.right` in endpoint `/securitizedDerivative/get`.

Issue price - see attribute `issue.price` in endpoint `/securitizedDerivative/get`.

Ask price - see attribute `prices.ask`.

Bid price - see attribute `prices.bid`.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2003 result = apiInstance.getSecuritizedDerivativeKeyFiguresNotationGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#getSecuritizedDerivativeKeyFiguresNotationGet");
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


## getSecuritizedDerivativeUnderlyingList

> InlineResponse2007 getSecuritizedDerivativeUnderlyingList(id, attributes, language)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term "level" is used instead of "price", e.g. underlying level instead of underlying price.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2007 result = apiInstance.getSecuritizedDerivativeUnderlyingList(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#getSecuritizedDerivativeUnderlyingList");
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


## postSecuritizedDerivativeIssuerSearch

> InlineResponse2002 postSecuritizedDerivativeIssuerSearch(body)

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2002 result = apiInstance.postSecuritizedDerivativeIssuerSearch(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#postSecuritizedDerivativeIssuerSearch");
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
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postSecuritizedDerivativeNotationRankingIntradayList

> InlineResponse2004 postSecuritizedDerivativeNotationRankingIntradayList(body)

Ranking of securitized derivatives&#39; notations using intraday figures.

Ranking of securitized derivatives' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute:
- absolute and relative performance (see the response attributes `trade.performance.absolute` and `trade.performance.relative`) - the notation with the most recent trade price is used
- number trades, trading value and trading volume (see the response attributes `accumulated.numberTrades`, `accumulated.tradingVolume` and `accumulated.tradingValue`) - the notation with highest (lowest) value is used

By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters `valueUnit` and/or `currency` have not been specified.

The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

All identifiers used as parameters must be valid and entitled.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2004 result = apiInstance.postSecuritizedDerivativeNotationRankingIntradayList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#postSecuritizedDerivativeNotationRankingIntradayList");
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postSecuritizedDerivativeNotationScreenerSearch

> InlineResponse2006 postSecuritizedDerivativeNotationScreenerSearch(body)

Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.

Screener for securitized derivatives's notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.

 Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term "level" is used instead of "price", e.g. underlying level instead of underlying price.

 The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.

 The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        InlineObject3 body = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2006 result = apiInstance.postSecuritizedDerivativeNotationScreenerSearch(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#postSecuritizedDerivativeNotationScreenerSearch");
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
 **body** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postSecuritizedDerivativeNotationScreenerValueRangesGet

> InlineResponse2005 postSecuritizedDerivativeNotationScreenerValueRangesGet(body)

Possible values and value ranges for the parameters used in the endpoint &#x60;/securitizedDerivative/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/securitizedDerivatives/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches, only the notation with the best market priority (according to the parameter `market.priority`) or, in the absence of market priorities, with the highest monetary trading volume, averaged over 30 trading days, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/securitizedDerivatives/notation/screener/search` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.

 Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term "level" is used instead of "price", e.g. underlying level instead of underlying price.

 The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.

 The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

```java
// Import classes:
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.ApiException;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.Configuration;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.auth.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.model.*;
import com.factset.sdk.SecuritizedDerivativesAPIforDigitalPortals.api.SecuritizedDerivativeApi;

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

        SecuritizedDerivativeApi apiInstance = new SecuritizedDerivativeApi(defaultClient);
        InlineObject2 body = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2005 result = apiInstance.postSecuritizedDerivativeNotationScreenerValueRangesGet(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecuritizedDerivativeApi#postSecuritizedDerivativeNotationScreenerValueRangesGet");
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

