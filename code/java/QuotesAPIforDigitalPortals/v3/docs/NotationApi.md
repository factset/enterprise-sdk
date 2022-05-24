# NotationApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNotationCrossReferenceFactSetIdentifierGet**](NotationApi.md#getNotationCrossReferenceFactSetIdentifierGet) | **GET** /notation/crossReference/factSetIdentifier/get | Retrieve FactSet identifiers for a given notation.
[**getNotationCrossReferenceGetByFactSetMarketSymbol**](NotationApi.md#getNotationCrossReferenceGetByFactSetMarketSymbol) | **GET** /notation/crossReference/getByFactSetMarketSymbol | Translate a FactSet market symbol to a notation.
[**getNotationGet**](NotationApi.md#getNotationGet) | **GET** /notation/get | Basic data for a notation.
[**getNotationKeyFiguresMonth1Get**](NotationApi.md#getNotationKeyFiguresMonth1Get) | **GET** /notation/keyFigures/month/1/get | End-of-day (EOD) key figures for the time range of one month.
[**getNotationKeyFiguresMonth1List**](NotationApi.md#getNotationKeyFiguresMonth1List) | **GET** /notation/keyFigures/month/1/list | End-of-day (EOD) key figures for the time range of one month, for a list of notations.
[**getNotationKeyFiguresMonth3Get**](NotationApi.md#getNotationKeyFiguresMonth3Get) | **GET** /notation/keyFigures/month/3/get | End-of-day (EOD) key figures for the time range of three months.
[**getNotationKeyFiguresMonth3List**](NotationApi.md#getNotationKeyFiguresMonth3List) | **GET** /notation/keyFigures/month/3/list | End-of-day (EOD) key figures for the time range of three months, for a list of notations.
[**getNotationKeyFiguresMonth6Get**](NotationApi.md#getNotationKeyFiguresMonth6Get) | **GET** /notation/keyFigures/month/6/get | End-of-day (EOD) key figures for the time range of six months.
[**getNotationKeyFiguresMonth6List**](NotationApi.md#getNotationKeyFiguresMonth6List) | **GET** /notation/keyFigures/month/6/list | End-of-day (EOD) key figures for the time range of six months, for a list of notations.
[**getNotationKeyFiguresWeek1Get**](NotationApi.md#getNotationKeyFiguresWeek1Get) | **GET** /notation/keyFigures/week/1/get | End-of-day (EOD) key figures for the time range of one week.
[**getNotationKeyFiguresWeek1List**](NotationApi.md#getNotationKeyFiguresWeek1List) | **GET** /notation/keyFigures/week/1/list | End-of-day (EOD) key figures for the time range of one week, for a list of notations.
[**getNotationKeyFiguresYear1Get**](NotationApi.md#getNotationKeyFiguresYear1Get) | **GET** /notation/keyFigures/year/1/get | End-of-day (EOD) key figures for the time range of one year.
[**getNotationKeyFiguresYear1List**](NotationApi.md#getNotationKeyFiguresYear1List) | **GET** /notation/keyFigures/year/1/list | End-of-day (EOD) key figures for the time range of one year, for a list of notations.
[**getNotationKeyFiguresYear3Get**](NotationApi.md#getNotationKeyFiguresYear3Get) | **GET** /notation/keyFigures/year/3/get | End-of-day (EOD) key figures for the time range of three years.
[**getNotationKeyFiguresYear3List**](NotationApi.md#getNotationKeyFiguresYear3List) | **GET** /notation/keyFigures/year/3/list | End-of-day (EOD) key figures for the time range of three years, for a list of notations.
[**getNotationKeyFiguresYear5Get**](NotationApi.md#getNotationKeyFiguresYear5Get) | **GET** /notation/keyFigures/year/5/get | End-of-day (EOD) key figures for the time range of five years.
[**getNotationKeyFiguresYear5List**](NotationApi.md#getNotationKeyFiguresYear5List) | **GET** /notation/keyFigures/year/5/list | End-of-day (EOD) key figures for the time range of five years, for a list of notations.
[**getNotationKeyFiguresYearToDateGet**](NotationApi.md#getNotationKeyFiguresYearToDateGet) | **GET** /notation/keyFigures/yearToDate/get | End-of-day (EOD) key figures for the time range year-to-date (YTD)..
[**getNotationKeyFiguresYearToDateList**](NotationApi.md#getNotationKeyFiguresYearToDateList) | **GET** /notation/keyFigures/yearToDate/list | End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
[**getNotationList**](NotationApi.md#getNotationList) | **GET** /notation/list | Basic data for a list of notations.
[**getNotationSearchBasic**](NotationApi.md#getNotationSearchBasic) | **GET** /notation/search/basic | Basic search for notations.
[**getNotationSearchByTextRankedByVolume**](NotationApi.md#getNotationSearchByTextRankedByVolume) | **GET** /notation/searchByTextRankedByVolume | Basic search for notations.
[**getNotationStatusGet**](NotationApi.md#getNotationStatusGet) | **GET** /notation/status/get | Intraday trading status of a notation.
[**postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier**](NotationApi.md#postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier) | **POST** /notation/crossReference/factSetIdentifier/listByFactSetIdentifier | Retrieve a list of notations for a given FactSet identifier.
[**postNotationCrossReferenceFactSetIdentifierListByInstrument**](NotationApi.md#postNotationCrossReferenceFactSetIdentifierListByInstrument) | **POST** /notation/crossReference/factSetIdentifier/listByInstrument | Retrieve a list of FactSet identifiers for a given instrument.
[**postNotationCrossReferenceListByISIN**](NotationApi.md#postNotationCrossReferenceListByISIN) | **POST** /notation/crossReference/listByISIN | List of entitled notations.
[**postNotationCrossReferenceListByInstrument**](NotationApi.md#postNotationCrossReferenceListByInstrument) | **POST** /notation/crossReference/listByInstrument | List of entitled notations.
[**postNotationCrossReferenceListBySymbol**](NotationApi.md#postNotationCrossReferenceListBySymbol) | **POST** /notation/crossReference/listBySymbol | List of entitled notations.
[**postNotationSearchByText**](NotationApi.md#postNotationSearchByText) | **POST** /notation/searchByText | Text-based search for notations.



## getNotationCrossReferenceFactSetIdentifierGet

> InlineResponse20069 getNotationCrossReferenceFactSetIdentifierGet(id, attributes)

Retrieve FactSet identifiers for a given notation.

<p>Retrieve FactSet identifiers for a given notation. Security and listing-level identifiers are always included, regional level identifiers are included, if available.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20069 result = apiInstance.getNotationCrossReferenceFactSetIdentifierGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationCrossReferenceFactSetIdentifierGet");
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

### Return type

[**InlineResponse20069**](InlineResponse20069.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationCrossReferenceGetByFactSetMarketSymbol

> InlineResponse20066 getNotationCrossReferenceGetByFactSetMarketSymbol(factSetMarketSymbol, attributes, language)

Translate a FactSet market symbol to a notation.

Translate a FactSet market symbol to a notation. This symbol is also known as TICKER_EXCHANGE.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String factSetMarketSymbol = "factSetMarketSymbol_example"; // String | Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE).
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20066 result = apiInstance.getNotationCrossReferenceGetByFactSetMarketSymbol(factSetMarketSymbol, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationCrossReferenceGetByFactSetMarketSymbol");
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
 **factSetMarketSymbol** | **String**| Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE). |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getNotationGet

> InlineResponse20064 getNotationGet(id, attributes, language)

Basic data for a notation.

Basic data for a notation.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20064 result = apiInstance.getNotationGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationGet");
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

[**InlineResponse20064**](InlineResponse20064.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth1Get

> InlineResponse20072 getNotationKeyFiguresMonth1Get(id, attributes)

End-of-day (EOD) key figures for the time range of one month.

End-of-day (EOD) key figures for the time range of one month.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20072 result = apiInstance.getNotationKeyFiguresMonth1Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth1Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth1List

> InlineResponse20073 getNotationKeyFiguresMonth1List(ids, attributes)

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20073 result = apiInstance.getNotationKeyFiguresMonth1List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth1List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth3Get

> InlineResponse20074 getNotationKeyFiguresMonth3Get(id, attributes)

End-of-day (EOD) key figures for the time range of three months.

End-of-day (EOD) key figures for the time range of three months.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20074 result = apiInstance.getNotationKeyFiguresMonth3Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth3Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth3List

> InlineResponse20075 getNotationKeyFiguresMonth3List(ids, attributes)

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20075 result = apiInstance.getNotationKeyFiguresMonth3List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth3List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth6Get

> InlineResponse20074 getNotationKeyFiguresMonth6Get(id, attributes)

End-of-day (EOD) key figures for the time range of six months.

End-of-day (EOD) key figures for the time range of six months.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20074 result = apiInstance.getNotationKeyFiguresMonth6Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth6Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresMonth6List

> InlineResponse20075 getNotationKeyFiguresMonth6List(ids, attributes)

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20075 result = apiInstance.getNotationKeyFiguresMonth6List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresMonth6List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresWeek1Get

> InlineResponse20072 getNotationKeyFiguresWeek1Get(id, attributes)

End-of-day (EOD) key figures for the time range of one week.

End-of-day (EOD) key figures for the time range of one week.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20072 result = apiInstance.getNotationKeyFiguresWeek1Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresWeek1Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresWeek1List

> InlineResponse20073 getNotationKeyFiguresWeek1List(ids, attributes)

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20073 result = apiInstance.getNotationKeyFiguresWeek1List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresWeek1List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear1Get

> InlineResponse20072 getNotationKeyFiguresYear1Get(id, attributes)

End-of-day (EOD) key figures for the time range of one year.

End-of-day (EOD) key figures for the time range of one year.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20072 result = apiInstance.getNotationKeyFiguresYear1Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear1Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20072**](InlineResponse20072.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear1List

> InlineResponse20073 getNotationKeyFiguresYear1List(ids, attributes)

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20073 result = apiInstance.getNotationKeyFiguresYear1List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear1List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20073**](InlineResponse20073.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear3Get

> InlineResponse20074 getNotationKeyFiguresYear3Get(id, attributes)

End-of-day (EOD) key figures for the time range of three years.

End-of-day (EOD) key figures for the time range of three years.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20074 result = apiInstance.getNotationKeyFiguresYear3Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear3Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear3List

> InlineResponse20075 getNotationKeyFiguresYear3List(ids, attributes)

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20075 result = apiInstance.getNotationKeyFiguresYear3List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear3List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear5Get

> InlineResponse20074 getNotationKeyFiguresYear5Get(id, attributes)

End-of-day (EOD) key figures for the time range of five years.

End-of-day (EOD) key figures for the time range of five years.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20074 result = apiInstance.getNotationKeyFiguresYear5Get(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear5Get");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20074**](InlineResponse20074.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYear5List

> InlineResponse20075 getNotationKeyFiguresYear5List(ids, attributes)

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20075 result = apiInstance.getNotationKeyFiguresYear5List(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYear5List");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20075**](InlineResponse20075.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYearToDateGet

> InlineResponse20076 getNotationKeyFiguresYearToDateGet(id, attributes)

End-of-day (EOD) key figures for the time range year-to-date (YTD)..

End-of-day (EOD) key figures for the time range year-to-date (YTD). The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent trading day of the current calendar year for which EOD prices are available..

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20076 result = apiInstance.getNotationKeyFiguresYearToDateGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYearToDateGet");
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
 **id** | **String**| Identifier of the notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20076**](InlineResponse20076.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationKeyFiguresYearToDateList

> InlineResponse20077 getNotationKeyFiguresYearToDateList(ids, attributes)

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations. The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent tradingday of the current calendar year for which EOD prices are available..

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20077 result = apiInstance.getNotationKeyFiguresYearToDateList(ids, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationKeyFiguresYearToDateList");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20077**](InlineResponse20077.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationList

> InlineResponse20065 getNotationList(ids, attributes, language)

Basic data for a list of notations.

Basic data for a list of notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        java.util.Set<String> ids = Arrays.asList(); // java.util.Set<String> | List of notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20065 result = apiInstance.getNotationList(ids, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationList");
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
 **ids** | **List&lt;String&gt;**| List of notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getNotationSearchBasic

> InlineResponse20088 getNotationSearchBasic(searchValue, nsins, assetClass, onlyActive, popularity, attributes, language, paginationOffset, paginationLimit)

Basic search for notations.

Search for a notation whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered. Better matching results appear in the response before less relevant matches. If the parameter popularity is set to true, the popularity of the notation is the primary sort criterion. Popularity is affected mostly by the request frequency of the notation.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String searchValue = "searchValue_example"; // String | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
        java.util.Set<String> nsins = Arrays.asList(); // java.util.Set<String> | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched.
        String assetClass = "index"; // String | A parameter to limit the output to a particular asset class.
        Boolean onlyActive = true; // Boolean | If true, restricts the result to active notations.
        Boolean popularity = false; // Boolean | If true, the results are sorted by descending popularity.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20088 result = apiInstance.getNotationSearchBasic(searchValue, nsins, assetClass, onlyActive, popularity, attributes, language, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationSearchBasic");
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
 **searchValue** | **String**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. |
 **nsins** | **List&lt;String&gt;**| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] [enum: wkn, valor, cusip, sedol]
 **assetClass** | **String**| A parameter to limit the output to a particular asset class. | [optional] [enum: index, stock, fund, etf, debt, investmentProduct, leveragedProduct, currency, commodity, option, future, interestRate]
 **onlyActive** | **Boolean**| If true, restricts the result to active notations. | [optional] [default to true]
 **popularity** | **Boolean**| If true, the results are sorted by descending popularity. | [optional] [default to false]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20088**](InlineResponse20088.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationSearchByTextRankedByVolume

> InlineResponse20090 getNotationSearchByTextRankedByVolume(searchValue, idMarkets, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit)

Basic search for notations.

Search for notations whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String searchValue = "searchValue_example"; // String | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
        java.util.Set<BigDecimal> idMarkets = Arrays.asList(); // java.util.Set<BigDecimal> | List of market identifiers. Limits the results to the given markets. For possible values, see endpoint `/basic/market/list`.
        java.util.Set<String> nsins = Arrays.asList(); // java.util.Set<String> | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched.
        java.util.List<String> assetClass = Arrays.asList(); // java.util.List<String> | Limits the results to a particular asset class.
        Boolean onlyActive = true; // Boolean | If true, restricts the result to active notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20090 result = apiInstance.getNotationSearchByTextRankedByVolume(searchValue, idMarkets, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationSearchByTextRankedByVolume");
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
 **searchValue** | **String**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. |
 **idMarkets** | **List&lt;BigDecimal&gt;**| List of market identifiers. Limits the results to the given markets. For possible values, see endpoint &#x60;/basic/market/list&#x60;. | [optional]
 **nsins** | **List&lt;String&gt;**| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] [enum: wkn, valor, cusip, sedol]
 **assetClass** | **List&lt;String&gt;**| Limits the results to a particular asset class. | [optional] [enum: index, stock, fund, etf, debt, investmentProduct, leveragedProduct, currency, commodity, option, future, interestRate]
 **onlyActive** | **Boolean**| If true, restricts the result to active notations. | [optional] [default to true]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

### Return type

[**InlineResponse20090**](InlineResponse20090.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getNotationStatusGet

> InlineResponse20078 getNotationStatusGet(id, quality, attributes)

Intraday trading status of a notation.

Intraday trading status of a notation.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        String quality = "RLT"; // String | Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD).
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse20078 result = apiInstance.getNotationStatusGet(id, quality, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#getNotationStatusGet");
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
 **quality** | **String**| Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). | [optional] [default to DLY] [enum: RLT, DLY, BST]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse20078**](InlineResponse20078.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier

> InlineResponse20070 postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(body)

Retrieve a list of notations for a given FactSet identifier.

<p>Retrieve a list of notations for a given FactSet identifier, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.</p><p>The notation corresponding to the security's primary listing has the attributes <big><tt>regional.isPrimary</tt></big> and <big><tt>regional.listing.isPrimary</tt></big> both set to true.The security's primary listing might not be among the results depending on the entitlement.</p><p>See the group description for more information about the security's primary listing.</p>

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject19 body = new InlineObject19(); // InlineObject19 | 
        try {
            InlineResponse20070 result = apiInstance.postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier");
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
 **body** | [**InlineObject19**](InlineObject19.md)|  |

### Return type

[**InlineResponse20070**](InlineResponse20070.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postNotationCrossReferenceFactSetIdentifierListByInstrument

> InlineResponse20071 postNotationCrossReferenceFactSetIdentifierListByInstrument(body)

Retrieve a list of FactSet identifiers for a given instrument.

<p>Retrieve a list of FactSet identifiers for a given instrument, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.</p><p>The notation corresponding to the security's primary listing has the attributes <big><tt>regional.isPrimary</tt></big> and <big><tt>regional.listing.isPrimary</tt></big> both set to true.The security's primary listing might not be among the results depending on the entitlement.</p><p>The result contains only notations that have at least one FactSet identifier (see <big><tt>listing.permanentIdentifier</tt></big>, <big><tt>listing.tickerExchange</tt></big>).</p><p>See the group description for more information about the security's primary listing.</p>

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject20 body = new InlineObject20(); // InlineObject20 | 
        try {
            InlineResponse20071 result = apiInstance.postNotationCrossReferenceFactSetIdentifierListByInstrument(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationCrossReferenceFactSetIdentifierListByInstrument");
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
 **body** | [**InlineObject20**](InlineObject20.md)|  |

### Return type

[**InlineResponse20071**](InlineResponse20071.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postNotationCrossReferenceListByISIN

> InlineResponse20067 postNotationCrossReferenceListByISIN(body)

List of entitled notations.

List of entitled notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject17 body = new InlineObject17(); // InlineObject17 | 
        try {
            InlineResponse20067 result = apiInstance.postNotationCrossReferenceListByISIN(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationCrossReferenceListByISIN");
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
 **body** | [**InlineObject17**](InlineObject17.md)|  | [optional]

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


## postNotationCrossReferenceListByInstrument

> InlineResponse20067 postNotationCrossReferenceListByInstrument(body)

List of entitled notations.

List of entitled notations.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject16 body = new InlineObject16(); // InlineObject16 | 
        try {
            InlineResponse20067 result = apiInstance.postNotationCrossReferenceListByInstrument(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationCrossReferenceListByInstrument");
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
 **body** | [**InlineObject16**](InlineObject16.md)|  | [optional]

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


## postNotationCrossReferenceListBySymbol

> InlineResponse20068 postNotationCrossReferenceListBySymbol(body)

List of entitled notations.

List of entitled notations. Symbols are not globally unique; therefore, a given symbol interpreted in different markets might refer to different instruments.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject18 body = new InlineObject18(); // InlineObject18 | 
        try {
            InlineResponse20068 result = apiInstance.postNotationCrossReferenceListBySymbol(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationCrossReferenceListBySymbol");
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
 **body** | [**InlineObject18**](InlineObject18.md)|  | [optional]

### Return type

[**InlineResponse20068**](InlineResponse20068.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postNotationSearchByText

> InlineResponse20089 postNotationSearchByText(body)

Text-based search for notations.

Text-based search for notations in selected identifier and name attributes according to a tolerant full-text match algorithm. The results satisfy all selected filters; sorting by various attributes is possible. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.     
 The result is limited to 10000 notations. All identifiers used as parameters must be valid and entitled.

### Example

```java
// Import classes:
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiClient;
import com.factset.sdk.QuotesAPIforDigitalPortals.ApiException;
import com.factset.sdk.QuotesAPIforDigitalPortals.Configuration;
import com.factset.sdk.QuotesAPIforDigitalPortals.auth.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.models.*;
import com.factset.sdk.QuotesAPIforDigitalPortals.api.NotationApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        NotationApi apiInstance = new NotationApi(defaultClient);
        InlineObject22 body = new InlineObject22(); // InlineObject22 | 
        try {
            InlineResponse20089 result = apiInstance.postNotationSearchByText(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NotationApi#postNotationSearchByText");
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
 **body** | [**InlineObject22**](InlineObject22.md)|  |

### Return type

[**InlineResponse20089**](InlineResponse20089.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

