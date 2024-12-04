# CategoryApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryDatasetList**](CategoryApi.md#getCategoryDatasetList) | **GET** /category/dataset/list | List of entitled category datasets.
[**getCategoryGet**](CategoryApi.md#getCategoryGet) | **GET** /category/get | Details of a category.
[**getCategoryInstrumentList**](CategoryApi.md#getCategoryInstrumentList) | **GET** /category/instrument/list | List of instruments where a specific dataset has assigned a given category.
[**getCategoryLevelGet**](CategoryApi.md#getCategoryLevelGet) | **GET** /category/level/get | Details of a category level.
[**getCategoryList**](CategoryApi.md#getCategoryList) | **GET** /category/list | List of categories.
[**getCategoryListByLevel**](CategoryApi.md#getCategoryListByLevel) | **GET** /category/list-by-level | List of categories assigned to a category level.
[**getCategoryListBySystem**](CategoryApi.md#getCategoryListBySystem) | **GET** /category/list-by-system | List of categories assigned to a category system.
[**getCategoryPathGet**](CategoryApi.md#getCategoryPathGet) | **GET** /category/path/get | Path from the first level to the level of a specific category.
[**getCategorySystemGet**](CategoryApi.md#getCategorySystemGet) | **GET** /category/system/get | Details of an entitled category system.
[**getCategorySystemList**](CategoryApi.md#getCategorySystemList) | **GET** /category/system/list | List of entitled category systems.
[**getCategorySystemTypeList**](CategoryApi.md#getCategorySystemTypeList) | **GET** /category/system/type/list | List of category system types.



## getCategoryDatasetList

> InlineResponse20036 getCategoryDatasetList(attributes, metaLanguage)

List of entitled category datasets.

List of entitled category datasets.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20036 result = apiInstance.getCategoryDatasetList(attributes, metaLanguage);
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategoryGet

> InlineResponse20032 getCategoryGet(id, attributes, metaLanguage)

Details of a category.

Details of a category.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("4"); // BigDecimal | Identifier of a category.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20032 result = apiInstance.getCategoryGet(id, attributes, metaLanguage);
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
 **id** | **BigDecimal**| Identifier of a category. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategoryInstrumentList

> InlineResponse20037 getCategoryInstrumentList(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit)

List of instruments where a specific dataset has assigned a given category.

List of instruments where a specific dataset has assigned a given category.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal idCategory = new BigDecimal("1"); // BigDecimal | Identifier of a category.
        BigDecimal idCategoryDataset = new BigDecimal("3"); // BigDecimal | Identifier of a category dataset.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20037 result = apiInstance.getCategoryInstrumentList(idCategory, idCategoryDataset, attributes, paginationOffset, paginationLimit);
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
 **idCategory** | **BigDecimal**| Identifier of a category. |
 **idCategoryDataset** | **BigDecimal**| Identifier of a category dataset. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

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


## getCategoryLevelGet

> InlineResponse20038 getCategoryLevelGet(id, attributes, metaLanguage)

Details of a category level.

Details of a category level.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("4"); // BigDecimal | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20038 result = apiInstance.getCategoryLevelGet(id, attributes, metaLanguage);
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
 **id** | **BigDecimal**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategoryList

> InlineResponse20033 getCategoryList(ids, attributes, metaLanguage)

List of categories.

List of categories.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<BigDecimal> ids = Arrays.asList(); // java.util.Set<BigDecimal> | List of categories belonging to the same category system.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20033 result = apiInstance.getCategoryList(ids, attributes, metaLanguage);
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
 **ids** | **List&lt;BigDecimal&gt;**| List of categories belonging to the same category system. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategoryListByLevel

> InlineResponse20034 getCategoryListByLevel(id, attributes, metaLanguage, paginationOffset, paginationLimit)

List of categories assigned to a category level.

List of categories assigned to a category level.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("2"); // BigDecimal | Identifier of a category level. See attribute `levels` in endpoint `/category/system/get` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20034 result = apiInstance.getCategoryListByLevel(id, attributes, metaLanguage, paginationOffset, paginationLimit);
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
 **id** | **BigDecimal**| Identifier of a category level. See attribute &#x60;levels&#x60; in endpoint &#x60;/category/system/get&#x60; for valid values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
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


## getCategoryListBySystem

> InlineResponse20035 getCategoryListBySystem(id, attributes, metaLanguage, paginationOffset, paginationLimit)

List of categories assigned to a category system.

List of categories assigned to a category system.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("5"); // BigDecimal | Identifier of a category system. See endpoint `/category/system/list` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20035 result = apiInstance.getCategoryListBySystem(id, attributes, metaLanguage, paginationOffset, paginationLimit);
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
 **id** | **BigDecimal**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

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


## getCategoryPathGet

> InlineResponse20039 getCategoryPathGet(id, attributes, metaLanguage)

Path from the first level to the level of a specific category.

Path from the first level to the level of a specific category.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("2"); // BigDecimal | Identifier of a category.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20039 result = apiInstance.getCategoryPathGet(id, attributes, metaLanguage);
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
 **id** | **BigDecimal**| Identifier of a category. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategorySystemGet

> InlineResponse20040 getCategorySystemGet(id, attributes, metaLanguage)

Details of an entitled category system.

Details of an entitled category system.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal id = new BigDecimal("4"); // BigDecimal | Identifier of a category system. See endpoint `/category/system/list` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20040 result = apiInstance.getCategorySystemGet(id, attributes, metaLanguage);
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
 **id** | **BigDecimal**| Identifier of a category system. See endpoint &#x60;/category/system/list&#x60; for valid values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategorySystemList

> InlineResponse20041 getCategorySystemList(idType, attributes, metaLanguage)

List of entitled category systems.

List of entitled category systems.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        BigDecimal idType = new BigDecimal("1"); // BigDecimal | Filter for a specific category system type. See endpoint `/category/system/type/list` for valid values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20041 result = apiInstance.getCategorySystemList(idType, attributes, metaLanguage);
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
 **idType** | **BigDecimal**| Filter for a specific category system type. See endpoint &#x60;/category/system/type/list&#x60; for valid values. | [optional]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getCategorySystemTypeList

> InlineResponse20042 getCategorySystemTypeList(attributes, metaLanguage)

List of category system types.

List of category system types.

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
import com.factset.sdk.RealTimeNews.api.CategoryApi;

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

        CategoryApi apiInstance = new CategoryApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "en"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse20042 result = apiInstance.getCategorySystemTypeList(attributes, metaLanguage);
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
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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

