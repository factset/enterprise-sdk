# NewsApi

All URIs are relative to *https://api.factset.com/wealth/v1*

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        String code = "code_example"; // String | 
        Boolean includeMedia = false; // Boolean | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
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
 **code** | **String**|  |
 **includeMedia** | **Boolean**|  | [optional] [default to false]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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

> InlineResponse2005 getNewsArticleTypeGet(id, attributes, language)

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2005 result = apiInstance.getNewsArticleTypeGet(id, attributes, language);
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
 **id** | **BigDecimal**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

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


## getNewsArticleTypeList

> InlineResponse2006 getNewsArticleTypeList(attributes, language)

List of news article types.

List of news article types.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse2006 result = apiInstance.getNewsArticleTypeList(attributes, language);
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
 **language** | **String**|  | [optional]

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


## getNewsDistributorGet

> InlineResponse2007 getNewsDistributorGet(id, attributes)

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2007 result = apiInstance.getNewsDistributorGet(id, attributes);
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
 **id** | **BigDecimal**|  |
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


## getNewsDistributorList

> InlineResponse2008 getNewsDistributorList(ids, attributes, sort)

List of distributors.

List of distributors.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2008 result = apiInstance.getNewsDistributorList(ids, attributes, sort);
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
 **ids** | **List&lt;BigDecimal&gt;**|  | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

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


## getNewsPublisherGet

> InlineResponse2009 getNewsPublisherGet(id, attributes)

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2009 result = apiInstance.getNewsPublisherGet(id, attributes);
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
 **id** | **BigDecimal**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## getNewsPublisherList

> InlineResponse20010 getNewsPublisherList(ids, attributes, sort, paginationOffset, paginationLimit)

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20010 result = apiInstance.getNewsPublisherList(ids, attributes, sort, paginationOffset, paginationLimit);
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
 **ids** | **List&lt;BigDecimal&gt;**|  | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

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


## getNewsPublisherListByDistributor

> InlineResponse20011 getNewsPublisherListByDistributor(id, attributes, sort)

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
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse20011 result = apiInstance.getNewsPublisherListByDistributor(id, attributes, sort);
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
 **id** | **BigDecimal**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

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


## postNewsArticleList

> InlineResponse2001 postNewsArticleList(postNewsArticleListRequest)

List of news articles.

List of news articles.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleListRequest postNewsArticleListRequest = new PostNewsArticleListRequest(); // PostNewsArticleListRequest | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleList(postNewsArticleListRequest);
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
 **postNewsArticleListRequest** | [**PostNewsArticleListRequest**](PostNewsArticleListRequest.md)|  | [optional]

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

> InlineResponse2002 postNewsArticleListByChain(postNewsArticleListByChainRequest)

List news articles of an article chain.

List news articles of an article chain.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleListByChainRequest postNewsArticleListByChainRequest = new PostNewsArticleListByChainRequest(); // PostNewsArticleListByChainRequest | 
        try {
            InlineResponse2002 result = apiInstance.postNewsArticleListByChain(postNewsArticleListByChainRequest);
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
 **postNewsArticleListByChainRequest** | [**PostNewsArticleListByChainRequest**](PostNewsArticleListByChainRequest.md)|  | [optional]

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

> InlineResponse2003 postNewsArticleListByIndex(postNewsArticleListByIndexRequest)

News articles for instruments that are constituents of the given indices.

News articles for instruments that are constituents of the given indices.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleListByIndexRequest postNewsArticleListByIndexRequest = new PostNewsArticleListByIndexRequest(); // PostNewsArticleListByIndexRequest | 
        try {
            InlineResponse2003 result = apiInstance.postNewsArticleListByIndex(postNewsArticleListByIndexRequest);
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
 **postNewsArticleListByIndexRequest** | [**PostNewsArticleListByIndexRequest**](PostNewsArticleListByIndexRequest.md)|  | [optional]

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


## postNewsArticleListByInstrument

> InlineResponse2004 postNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest)

News articles for instruments.

News articles for instruments.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleListByInstrumentRequest postNewsArticleListByInstrumentRequest = new PostNewsArticleListByInstrumentRequest(); // PostNewsArticleListByInstrumentRequest | 
        try {
            InlineResponse2004 result = apiInstance.postNewsArticleListByInstrument(postNewsArticleListByInstrumentRequest);
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
 **postNewsArticleListByInstrumentRequest** | [**PostNewsArticleListByInstrumentRequest**](PostNewsArticleListByInstrumentRequest.md)|  | [optional]

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


## postNewsArticleListByMediaKind

> InlineResponse2001 postNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest)

List news articles which contain media of specific media kinds.

List news articles which contain media of specific media kinds.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleListByMediaKindRequest postNewsArticleListByMediaKindRequest = new PostNewsArticleListByMediaKindRequest(); // PostNewsArticleListByMediaKindRequest | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleListByMediaKind(postNewsArticleListByMediaKindRequest);
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
 **postNewsArticleListByMediaKindRequest** | [**PostNewsArticleListByMediaKindRequest**](PostNewsArticleListByMediaKindRequest.md)|  | [optional]

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

> InlineResponse2001 postNewsArticleSearchByText(postNewsArticleSearchByTextRequest)

Search for news articles using a fulltext search.

Search for news articles using a fulltext search. All specified criteria need to be fulfilled for an article to match. Each criterion is handled according to its selectionType; "include" requires the criterion to evaluate to true, "exclude" requires the criterion to evaluate to false. A criterion is fulfilled when at least one of its values is found.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsArticleSearchByTextRequest postNewsArticleSearchByTextRequest = new PostNewsArticleSearchByTextRequest(); // PostNewsArticleSearchByTextRequest | 
        try {
            InlineResponse2001 result = apiInstance.postNewsArticleSearchByText(postNewsArticleSearchByTextRequest);
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
 **postNewsArticleSearchByTextRequest** | [**PostNewsArticleSearchByTextRequest**](PostNewsArticleSearchByTextRequest.md)|  | [optional]

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

> InlineResponse20011 postNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest)

Search for publishers.

Search for publishers by the name of the publisher.

### Example

```java
// Import classes:
import com.factset.sdk.NewsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.NewsAPIforDigitalPortals.ApiException;
import com.factset.sdk.NewsAPIforDigitalPortals.Configuration;
import com.factset.sdk.NewsAPIforDigitalPortals.auth.*;
import com.factset.sdk.NewsAPIforDigitalPortals.models.*;
import com.factset.sdk.NewsAPIforDigitalPortals.api.NewsApi;

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

        NewsApi apiInstance = new NewsApi(defaultClient);
        PostNewsPublisherSearchByNameRequest postNewsPublisherSearchByNameRequest = new PostNewsPublisherSearchByNameRequest(); // PostNewsPublisherSearchByNameRequest | 
        try {
            InlineResponse20011 result = apiInstance.postNewsPublisherSearchByName(postNewsPublisherSearchByNameRequest);
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
 **postNewsPublisherSearchByNameRequest** | [**PostNewsPublisherSearchByNameRequest**](PostNewsPublisherSearchByNameRequest.md)|  | [optional]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

