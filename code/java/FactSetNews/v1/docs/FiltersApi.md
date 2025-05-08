# FiltersApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFilters**](FiltersApi.md#getFilters) | **GET** /filters | Retrieve all FactSet News filters
[**getNewsFiltersCategories**](FiltersApi.md#getNewsFiltersCategories) | **GET** /filters/categories | Retrieve all News filter categories
[**getNewsFiltersCountries**](FiltersApi.md#getNewsFiltersCountries) | **GET** /filters/countries | Retrieve all News filter countries
[**getNewsFiltersRegions**](FiltersApi.md#getNewsFiltersRegions) | **GET** /filters/regions | Retrieve all News filter regions
[**getNewsFiltersSources**](FiltersApi.md#getNewsFiltersSources) | **GET** /filters/sources | Retrieve all News filter sources
[**getNewsFiltersTopics**](FiltersApi.md#getNewsFiltersTopics) | **GET** /filters/topics | Retrieve all News filter topics
[**getNewsFiltersWatchlists**](FiltersApi.md#getNewsFiltersWatchlists) | **GET** /filters/watchlists | Retrieve all News filter watchlists



## getFilters

> FilterResponse getFilters(attributes)

Retrieve all FactSet News filters

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterResponse result = apiInstance.getFilters(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getFilters");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersCategories

> FilterCategoriesResponse getNewsFiltersCategories(attributes)

Retrieve all News filter categories

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter categories. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterCategoriesResponse result = apiInstance.getNewsFiltersCategories(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersCategories");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter categories. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterCategoriesResponse**](FilterCategoriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns news categories |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersCountries

> FilterCountriesResponse getNewsFiltersCountries(attributes)

Retrieve all News filter countries

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter countries. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterCountriesResponse result = apiInstance.getNewsFiltersCountries(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersCountries");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter countries. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterCountriesResponse**](FilterCountriesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News countries. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersRegions

> FilterRegionsResponse getNewsFiltersRegions(attributes)

Retrieve all News filter regions

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter regions. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterRegionsResponse result = apiInstance.getNewsFiltersRegions(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersRegions");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter regions. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterRegionsResponse**](FilterRegionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News regions. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersSources

> FilterSourcesResponse getNewsFiltersSources(attributes)

Retrieve all News filter sources

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter sources. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterSourcesResponse result = apiInstance.getNewsFiltersSources(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersSources");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter sources. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterSourcesResponse**](FilterSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News Sources. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersTopics

> FilterTopicResponse getNewsFiltersTopics(attributes)

Retrieve all News filter topics

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter topics. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterTopicResponse result = apiInstance.getNewsFiltersTopics(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersTopics");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter topics. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterTopicResponse**](FilterTopicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News topics. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |


## getNewsFiltersWatchlists

> FilterWatchlistsResponse getNewsFiltersWatchlists(attributes)

Retrieve all News filter watchlists

If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the `/headlines` and `/views/create` endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetNews.ApiClient;
import com.factset.sdk.FactSetNews.ApiException;
import com.factset.sdk.FactSetNews.Configuration;
import com.factset.sdk.FactSetNews.auth.*;
import com.factset.sdk.FactSetNews.models.*;
import com.factset.sdk.FactSetNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \"structured\" and/or \"flattened\". If no _attributes are specified, all filters will be returned in the response (this is the default response). 
        try {
            FilterWatchlistsResponse result = apiInstance.getNewsFiltersWatchlists(attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getNewsFiltersWatchlists");
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
 **attributes** | **List&lt;String&gt;**| Pass a list of filters to return the respective type of filter watchlists. Accepted list values are \&quot;structured\&quot; and/or \&quot;flattened\&quot;. If no _attributes are specified, all filters will be returned in the response (this is the default response).  | [optional] [enum: structured, flattened]

### Return type

[**FilterWatchlistsResponse**](FilterWatchlistsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns News watchlists. |  -  |
| **400** | Bad Request. This can occur for invalid parameter. |  -  |
| **401** | Unauthenticated |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |

