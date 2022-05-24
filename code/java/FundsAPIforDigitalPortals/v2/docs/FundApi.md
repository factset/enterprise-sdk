# FundApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundHoldingListByInstrument**](FundApi.md#getFundHoldingListByInstrument) | **GET** /fund/holding/listByInstrument | Holdings of a fund.
[**getFundNotationKeyFiguresBenchmarkMonth1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkMonth1Get) | **GET** /fund/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
[**getFundNotationKeyFiguresBenchmarkMonth3Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkMonth3Get) | **GET** /fund/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
[**getFundNotationKeyFiguresBenchmarkWeek1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkWeek1Get) | **GET** /fund/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
[**getFundNotationKeyFiguresBenchmarkYear1Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear1Get) | **GET** /fund/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
[**getFundNotationKeyFiguresBenchmarkYear3Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear3Get) | **GET** /fund/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
[**getFundNotationKeyFiguresBenchmarkYear5Get**](FundApi.md#getFundNotationKeyFiguresBenchmarkYear5Get) | **GET** /fund/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
[**getFundShareClassGet**](FundApi.md#getFundShareClassGet) | **GET** /fund/shareClass/get | Fundamental data for a share class of a fund.
[**postFundIssuerSearch**](FundApi.md#postFundIssuerSearch) | **POST** /fund/issuer/search | Search for issuers of funds.
[**postFundNotationScreenerSearch**](FundApi.md#postFundNotationScreenerSearch) | **POST** /fund/notation/screener/search | Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
[**postFundNotationScreenerValueRangesGet**](FundApi.md#postFundNotationScreenerValueRangesGet) | **POST** /fund/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.



## getFundHoldingListByInstrument

> InlineResponse200 getFundHoldingListByInstrument(id, attributes, sort)

Holdings of a fund.

Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of an instrument of a fund share class.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse200 result = apiInstance.getFundHoldingListByInstrument(id, attributes, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundHoldingListByInstrument");
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
 **id** | **String**| Identifier of an instrument of a fund share class. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: holdings.name, -holdings.name, holdings.weight, -holdings.weight]

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


## getFundNotationKeyFiguresBenchmarkMonth1Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getFundNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkMonth1Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getFundNotationKeyFiguresBenchmarkMonth3Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getFundNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkMonth3Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getFundNotationKeyFiguresBenchmarkWeek1Get

> InlineResponse2003 getFundNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2003 result = apiInstance.getFundNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkWeek1Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
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


## getFundNotationKeyFiguresBenchmarkYear1Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getFundNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkYear1Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getFundNotationKeyFiguresBenchmarkYear3Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getFundNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkYear3Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getFundNotationKeyFiguresBenchmarkYear5Get

> InlineResponse2002 getFundNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language)

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the notation.
        java.util.Set<String> idNotationBenchmark = Arrays.asList(); // java.util.Set<String> | List of benchmark notations.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getFundNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundNotationKeyFiguresBenchmarkYear5Get");
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
 **idNotationBenchmark** | **List&lt;String&gt;**| List of benchmark notations. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getFundShareClassGet

> InlineResponse2006 getFundShareClassGet(id, attributes, language)

Fundamental data for a share class of a fund.

The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes. 

Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint `/basic/region/country/list` for possible values.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        String id = "id_example"; // String | Identifier of the instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2006 result = apiInstance.getFundShareClassGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#getFundShareClassGet");
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


## postFundIssuerSearch

> InlineResponse2001 postFundIssuerSearch(body)

Search for issuers of funds.

Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2001 result = apiInstance.postFundIssuerSearch(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#postFundIssuerSearch");
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


## postFundNotationScreenerSearch

> InlineResponse2004 postFundNotationScreenerSearch(body)

Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.

Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example `issuer.selection`. Others apply to the share classes, thus only notations of matching share classes are returned, for example `minimumInvestment.initial`. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`) and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.     
 A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2004 result = apiInstance.postFundNotationScreenerSearch(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#postFundNotationScreenerSearch");
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


## postFundNotationScreenerValueRangesGet

> InlineResponse2005 postFundNotationScreenerValueRangesGet(body)

Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/fund/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`), and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.

### Example

```java
// Import classes:
import com.factset.sdk.FundsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.FundsAPIforDigitalPortals.ApiException;
import com.factset.sdk.FundsAPIforDigitalPortals.Configuration;
import com.factset.sdk.FundsAPIforDigitalPortals.auth.*;
import com.factset.sdk.FundsAPIforDigitalPortals.models.*;
import com.factset.sdk.FundsAPIforDigitalPortals.api.FundApi;

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

        FundApi apiInstance = new FundApi(defaultClient);
        InlineObject2 body = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2005 result = apiInstance.postFundNotationScreenerValueRangesGet(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundApi#postFundNotationScreenerValueRangesGet");
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

