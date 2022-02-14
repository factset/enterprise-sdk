# NewsApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getNewsArticleGet**](NewsApi.md#getNewsArticleGet) | **GET** /news/article/get | Details for a news article.
[**getNewsArticleTypeGet**](NewsApi.md#getNewsArticleTypeGet) | **GET** /news/article/type/get | Details for a news article type.
[**getNewsArticleTypeList**](NewsApi.md#getNewsArticleTypeList) | **GET** /news/article/type/list | List of news article types.
[**getNewsDistributorGet**](NewsApi.md#getNewsDistributorGet) | **GET** /news/distributor/get | Details of a distributor.
[**getNewsDistributorList**](NewsApi.md#getNewsDistributorList) | **GET** /news/distributor/list | List of distributors.
[**getNewsPublisherGet**](NewsApi.md#getNewsPublisherGet) | **GET** /news/publisher/get | Details of a publisher.
[**getNewsPublisherList**](NewsApi.md#getNewsPublisherList) | **GET** /news/publisher/list | List of publishers.
[**getNewsPublisherListByDistributor**](NewsApi.md#getNewsPublisherListByDistributor) | **GET** /news/publisher/listByDistributor | List of publishers provided by the given distributor.
[**postNewsArticleList**](NewsApi.md#postNewsArticleList) | **POST** /news/article/list | List of news articles.
[**postNewsArticleListByChain**](NewsApi.md#postNewsArticleListByChain) | **POST** /news/article/listByChain | List news articles of an article chain.
[**postNewsArticleListByIndex**](NewsApi.md#postNewsArticleListByIndex) | **POST** /news/article/listByIndex | News articles for instruments that are constituents of the given indices.
[**postNewsArticleListByInstrument**](NewsApi.md#postNewsArticleListByInstrument) | **POST** /news/article/listByInstrument | News articles for instruments.
[**postNewsArticleListByMediaKind**](NewsApi.md#postNewsArticleListByMediaKind) | **POST** /news/article/listByMediaKind | List news articles which contain media of specific media kinds.
[**postNewsArticleSearchByText**](NewsApi.md#postNewsArticleSearchByText) | **POST** /news/article/searchByText | Search for news articles using a fulltext search.
[**postNewsPublisherSearchByName**](NewsApi.md#postNewsPublisherSearchByName) | **POST** /news/publisher/searchByName | Search for publishers.



## getNewsArticleGet

> InlineResponse200 getNewsArticleGet(code, includeMedia, attributes, language)

Details for a news article.

Details for a news article.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        String code = "code_example"; // String | Identifier of a news article.
        Boolean includeMedia = false; // Boolean | If true, media references are included if available.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse200 result = apiInstance.getNewsArticleGet(code, includeMedia, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsArticleGet");
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
 **code** | **String**| Identifier of a news article. |
 **includeMedia** | **Boolean**| If true, media references are included if available. | [optional] [default to false]
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


## getNewsArticleTypeGet

> InlineResponse2003 getNewsArticleTypeGet(id, attributes, language)

Details for a news article type.

Details for a news article type.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of a news article type.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2003 result = apiInstance.getNewsArticleTypeGet(id, attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsArticleTypeGet");
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
 **id** | **BigDecimal**| Identifier of a news article type. |
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


## getNewsArticleTypeList

> InlineResponse2004 getNewsArticleTypeList(attributes, language)

List of news article types.

List of news article types.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2004 result = apiInstance.getNewsArticleTypeList(attributes, language);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsArticleTypeList");
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


## getNewsDistributorGet

> InlineResponse2005 getNewsDistributorGet(id, attributes)

Details of a distributor.

Details of a distributor.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of a distributor.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2005 result = apiInstance.getNewsDistributorGet(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsDistributorGet");
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
 **id** | **BigDecimal**| Identifier of a distributor. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## getNewsDistributorList

> InlineResponse2006 getNewsDistributorList(ids, attributes, sort)

List of distributors.

List of distributors.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | Identifiers of distributors.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2006 result = apiInstance.getNewsDistributorList(ids, attributes, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsDistributorList");
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
 **ids** | **List&lt;BigDecimal&gt;**| Identifiers of distributors. | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

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


## getNewsPublisherGet

> InlineResponse2007 getNewsPublisherGet(id, attributes)

Details of a publisher.

Details of a publisher.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of a publisher.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2007 result = apiInstance.getNewsPublisherGet(id, attributes);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsPublisherGet");
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
 **id** | **BigDecimal**| Identifier of a publisher. |
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


## getNewsPublisherList

> InlineResponse2008 getNewsPublisherList(ids, attributes, sort, paginationOffset, paginationLimit)

List of publishers.

List of publishers.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | Identifiers of publishers.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0.0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20.0"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2008 result = apiInstance.getNewsPublisherList(ids, attributes, sort, paginationOffset, paginationLimit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsPublisherList");
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
 **ids** | **List&lt;BigDecimal&gt;**| Identifiers of publishers. | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20.0]

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


## getNewsPublisherListByDistributor

> InlineResponse2009 getNewsPublisherListByDistributor(id, attributes, sort)

List of publishers provided by the given distributor.

List of publishers provided by the given distributor.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of a distributor.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2009 result = apiInstance.getNewsPublisherListByDistributor(id, attributes, sort);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#getNewsPublisherListByDistributor");
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
 **id** | **BigDecimal**| Identifier of a distributor. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

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


## postNewsArticleList

> InlineResponse2001 postNewsArticleList(body)

List of news articles.

List of news articles.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleList(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleList");
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


## postNewsArticleListByChain

> InlineResponse2002 postNewsArticleListByChain(body)

List news articles of an article chain.

List news articles of an article chain.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2002 result = apiInstance.postNewsArticleListByChain(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleListByChain");
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
 **body** | [**InlineObject1**](InlineObject1.md)|  |

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


## postNewsArticleListByIndex

> InlineResponse2001 postNewsArticleListByIndex(body)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject2 body = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleListByIndex(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleListByIndex");
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
 **body** | [**InlineObject2**](InlineObject2.md)|  |

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


## postNewsArticleListByInstrument

> InlineResponse2001 postNewsArticleListByInstrument(body)

News articles for instruments.

News articles for instruments.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject3 body = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleListByInstrument(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleListByInstrument");
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
 **body** | [**InlineObject3**](InlineObject3.md)|  |

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


## postNewsArticleListByMediaKind

> InlineResponse2001 postNewsArticleListByMediaKind(body)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject4 body = new InlineObject4(); // InlineObject4 | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleListByMediaKind(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleListByMediaKind");
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
 **body** | [**InlineObject4**](InlineObject4.md)|  |

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


## postNewsArticleSearchByText

> InlineResponse2001 postNewsArticleSearchByText(body)

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; "include" requires the criterion to evaluate to true, "exclude" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject5 body = new InlineObject5(); // InlineObject5 | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleSearchByText(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsArticleSearchByText");
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
 **body** | [**InlineObject5**](InlineObject5.md)|  | [optional]

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


## postNewsPublisherSearchByName

> InlineResponse2009 postNewsPublisherSearchByName(body)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.model.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        InlineObject6 body = new InlineObject6(); // InlineObject6 | 
        try {
            InlineResponse2009 result = apiInstance.postNewsPublisherSearchByName(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApi#postNewsPublisherSearchByName");
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
 **body** | [**InlineObject6**](InlineObject6.md)|  |

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

