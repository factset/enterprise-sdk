# CategoryApi

All URIs are relative to *https://api.factset.com/wealth/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryDatasetList**](CategoryApi.md#getCategoryDatasetList) | **GET** /category/dataset/list | List of entitled category datasets.
[**getCategoryGet**](CategoryApi.md#getCategoryGet) | **GET** /category/get | Details of a category.
[**getCategoryInstrumentList**](CategoryApi.md#getCategoryInstrumentList) | **GET** /category/instrument/list | List of instruments where a specific dataset has assigned a given category.
[**getCategoryLevelGet**](CategoryApi.md#getCategoryLevelGet) | **GET** /category/level/get | Details of a category level.
[**getCategoryList**](CategoryApi.md#getCategoryList) | **GET** /category/list | List of categories.
[**getCategoryListByLevel**](CategoryApi.md#getCategoryListByLevel) | **GET** /category/listByLevel | List of categories assigned to a category level.
[**getCategoryListBySystem**](CategoryApi.md#getCategoryListBySystem) | **GET** /category/listBySystem | List of categories assigned to a category system.
[**getCategoryPathGet**](CategoryApi.md#getCategoryPathGet) | **GET** /category/path/get | Path from the first level to the level of a specific category.
[**getCategorySystemGet**](CategoryApi.md#getCategorySystemGet) | **GET** /category/system/get | Details of an entitled category system.
[**getCategorySystemList**](CategoryApi.md#getCategorySystemList) | **GET** /category/system/list | List of entitled category systems.
[**getCategorySystemTypeList**](CategoryApi.md#getCategorySystemTypeList) | **GET** /category/system/type/list | List of category system types.



## getCategoryDatasetList

> InlineResponse20035 getCategoryDatasetList(attributes, language)

List of entitled category datasets.

List of entitled category datasets.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20035 result = apiInstance.getCategoryDatasetList(attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryDatasetList");
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

[**InlineResponse20035**](InlineResponse20035.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryGet

> InlineResponse20031 getCategoryGet(id, attributes, language)

Details of a category.

Details of a category.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20031 result = apiInstance.getCategoryGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryGet");
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

[**InlineResponse20031**](InlineResponse20031.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryInstrumentList

> InlineResponse20036 getCategoryInstrumentList(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit)

List of instruments where a specific dataset has assigned a given category.

List of instruments where a specific dataset has assigned a given category.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal idCategory = new BigDecimal(78); // BigDecimal | 
        BigDecimal idCategoryDataset = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20036 result = apiInstance.getCategoryInstrumentList(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryInstrumentList");
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
 **idCategory** | **BigDecimal**|  |
 **idCategoryDataset** | **BigDecimal**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20036**](InlineResponse20036.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryLevelGet

> InlineResponse20037 getCategoryLevelGet(id, attributes, language)

Details of a category level.

Details of a category level.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20037 result = apiInstance.getCategoryLevelGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryLevelGet");
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

[**InlineResponse20037**](InlineResponse20037.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryList

> InlineResponse20032 getCategoryList(ids, attributes, language)

List of categories.

List of categories.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20032 result = apiInstance.getCategoryList(ids, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryList");
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
 **ids** | **List&lt;BigDecimal&gt;**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20032**](InlineResponse20032.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryListByLevel

> InlineResponse20033 getCategoryListByLevel(id, attributes, language, paginationOffset, paginationLimit)

List of categories assigned to a category level.

List of categories assigned to a category level.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20033 result = apiInstance.getCategoryListByLevel(id, attributes, language, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryListByLevel");
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
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20033**](InlineResponse20033.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryListBySystem

> InlineResponse20034 getCategoryListBySystem(id, attributes, language, paginationOffset, paginationLimit)

List of categories assigned to a category system.

List of categories assigned to a category system.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20034 result = apiInstance.getCategoryListBySystem(id, attributes, language, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryListBySystem");
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
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20034**](InlineResponse20034.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategoryPathGet

> InlineResponse20038 getCategoryPathGet(id, attributes, language)

Path from the first level to the level of a specific category.

Path from the first level to the level of a specific category.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20038 result = apiInstance.getCategoryPathGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategoryPathGet");
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

[**InlineResponse20038**](InlineResponse20038.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategorySystemGet

> InlineResponse20039 getCategorySystemGet(id, attributes, language)

Details of an entitled category system.

Details of an entitled category system.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20039 result = apiInstance.getCategorySystemGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategorySystemGet");
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

[**InlineResponse20039**](InlineResponse20039.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategorySystemList

> InlineResponse20040 getCategorySystemList(idType, attributes, language)

List of entitled category systems.

List of entitled category systems.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal idType = new BigDecimal(78); // BigDecimal | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20040 result = apiInstance.getCategorySystemList(idType, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategorySystemList");
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
 **idType** | **BigDecimal**|  | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]

### Return type

[**InlineResponse20040**](InlineResponse20040.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCategorySystemTypeList

> InlineResponse20041 getCategorySystemTypeList(attributes, language)

List of category system types.

List of category system types.

### Example

```java
// Import classes:
import com.factset.sdk.RealTimeQuotes.ApiClient;
import com.factset.sdk.RealTimeQuotes.ApiException;
import com.factset.sdk.RealTimeQuotes.Configuration;
import com.factset.sdk.RealTimeQuotes.auth.*;
import com.factset.sdk.RealTimeQuotes.models.*;
import com.factset.sdk.RealTimeQuotes.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        try {
            InlineResponse20041 result = apiInstance.getCategorySystemTypeList(attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CategoryApi#getCategorySystemTypeList");
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

[**InlineResponse20041**](InlineResponse20041.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

