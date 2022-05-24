# RecommendationListApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRecommendationListGet**](RecommendationListApi.md#getRecommendationListGet) | **GET** /recommendationList/get | Attributes of a single list.
[**getRecommendationListRevisionElementList**](RecommendationListApi.md#getRecommendationListRevisionElementList) | **GET** /recommendationList/revision/element/list | List of elements of a given revision.
[**getRecommendationListRevisionGet**](RecommendationListApi.md#getRecommendationListRevisionGet) | **GET** /recommendationList/revision/get | Attributes of a single revision.
[**getRecommendationListRevisionSearch**](RecommendationListApi.md#getRecommendationListRevisionSearch) | **GET** /recommendationList/revision/search | Search for revisions of a recommendation list.
[**getRecommendationListSearch**](RecommendationListApi.md#getRecommendationListSearch) | **GET** /recommendationList/search | Search for recommendation lists.
[**postRecommendationListRevisionList**](RecommendationListApi.md#postRecommendationListRevisionList) | **POST** /recommendationList/revision/list | List of revisions of a recommendation list.



## getRecommendationListGet

> InlineResponse200 getRecommendationListGet(id, attributes, language)

Attributes of a single list.

Attributes of a single list, including data about its active revision.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of the list.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse200 result = apiInstance.getRecommendationListGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#getRecommendationListGet");
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
 **id** | **BigDecimal**| Identifier of the list. |
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


## getRecommendationListRevisionElementList

> InlineResponse2005 getRecommendationListRevisionElementList(idRevision, attributes, language)

List of elements of a given revision.

List of elements of a given revision.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        BigDecimal idRevision = new BigDecimal(78); // BigDecimal | Identifier of the revision.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2005 result = apiInstance.getRecommendationListRevisionElementList(idRevision, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#getRecommendationListRevisionElementList");
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
 **idRevision** | **BigDecimal**| Identifier of the revision. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## getRecommendationListRevisionGet

> InlineResponse2002 getRecommendationListRevisionGet(id, attributes, language)

Attributes of a single revision.

Attributes of a single revision.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | Identifier of the revision.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2002 result = apiInstance.getRecommendationListRevisionGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#getRecommendationListRevisionGet");
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
 **id** | **BigDecimal**| Identifier of the revision. |
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


## getRecommendationListRevisionSearch

> InlineResponse2004 getRecommendationListRevisionSearch(idNotation, idInstrument, attributes, language)

Search for revisions of a recommendation list.

Search for revisions of a recommendation list.

### Example

```java
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        String idNotation = "idNotation_example"; // String | Restrict the search to revisions containing an element associated with the identified notation.
        String idInstrument = "idInstrument_example"; // String | Restrict the search to revisions pointing to the identified instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2004 result = apiInstance.getRecommendationListRevisionSearch(idNotation, idInstrument, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#getRecommendationListRevisionSearch");
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
 **idNotation** | **String**| Restrict the search to revisions containing an element associated with the identified notation. | [optional]
 **idInstrument** | **String**| Restrict the search to revisions pointing to the identified instrument. | [optional]
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


## getRecommendationListSearch

> InlineResponse2001 getRecommendationListSearch(name, onlyActive, attributes, language)

Search for recommendation lists.

Search for recommendation lists, delivering an array of recommendation lists matching the specified filter criteria. The data provided for each recommendation list includes the currently active revision (or null in case no active revision exists).

### Example

```java
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        String name = "name_example"; // String | Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match.
        Boolean onlyActive = true; // Boolean | Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list's activeRange.end date). If set to false, recommendation lists will be returned regardless of their state.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2001 result = apiInstance.getRecommendationListSearch(name, onlyActive, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#getRecommendationListSearch");
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
 **name** | **String**| Restricts the search to recommendation lists, which contain the provided string in their name attribute. The filter is a case-insensitive substring match. | [optional]
 **onlyActive** | **Boolean**| Restrict the search to recommendation lists, which are currently active (e.g., current date is before the recommendation list&#39;s activeRange.end date). If set to false, recommendation lists will be returned regardless of their state. | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

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


## postRecommendationListRevisionList

> InlineResponse2003 postRecommendationListRevisionList(body)

List of revisions of a recommendation list.

List of revisions of a recommendation list, excluding the elements of each revision.

### Example

```java
// Import classes:
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiClient;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.ApiException;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.Configuration;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.auth.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.models.*;
import com.factset.sdk.RecommendationListAPIforDigitalPortals.api.RecommendationListApi;

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

        RecommendationListApi apiInstance = new RecommendationListApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2003 result = apiInstance.postRecommendationListRevisionList(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RecommendationListApi#postRecommendationListRevisionList");
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
 **body** | [**InlineObject**](InlineObject.md)|  |

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

