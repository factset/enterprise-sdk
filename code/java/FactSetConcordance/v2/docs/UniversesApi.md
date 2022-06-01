# UniversesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityUniverseStatistics**](UniversesApi.md#getEntityUniverseStatistics) | **GET** /factset-concordance/v2/entity-universe-statistics | Get statistics on a given universe
[**getUniverseForList**](UniversesApi.md#getUniverseForList) | **POST** /factset-concordance/v2/universe | Create a new universe
[**getUniverseStatistics**](UniversesApi.md#getUniverseStatistics) | **GET** /factset-concordance/v2/universe-statistics | Get statistics on a given universe
[**getUniverses**](UniversesApi.md#getUniverses) | **GET** /factset-concordance/v2/universes | Fetch metadata for universes
[**getUpdateUniverseForList**](UniversesApi.md#getUpdateUniverseForList) | **POST** /factset-concordance/v2/update-universe | Update metadata for an existing universe



## getEntityUniverseStatistics

> EntityUniverseStatisticsResponse getEntityUniverseStatistics(universeId)

Get statistics on a given universe

Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.UniversesApi;

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

        UniversesApi apiInstance = new UniversesApi(defaultClient);
        Integer universeId = 1; // Integer | Universe identifier. *To create a universe, use the `/universe' endpoint.*
        try {
            EntityUniverseStatisticsResponse result = apiInstance.getEntityUniverseStatistics(universeId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniversesApi#getEntityUniverseStatistics");
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
 **universeId** | **Integer**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* |

### Return type

[**EntityUniverseStatisticsResponse**](EntityUniverseStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for mapping statistics for a universe |  -  |
| **0** | Error Response |  -  |


## getUniverseForList

> UniverseMetaResponse getUniverseForList(createUniverseRequest)

Create a new universe

Create a new universe that is distinct from any existing universe


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.UniversesApi;

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

        UniversesApi apiInstance = new UniversesApi(defaultClient);
        CreateUniverseRequest createUniverseRequest = new CreateUniverseRequest(); // CreateUniverseRequest | A request to create a user's universe
        try {
            UniverseMetaResponse result = apiInstance.getUniverseForList(createUniverseRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniversesApi#getUniverseForList");
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
 **createUniverseRequest** | [**CreateUniverseRequest**](CreateUniverseRequest.md)| A request to create a user&#39;s universe |

### Return type

[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on a single universe |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |
| **0** | Error Response |  -  |


## getUniverseStatistics

> UniverseStatisticsResponse getUniverseStatistics(universeId)

Get statistics on a given universe

Get the total number of mappings in a universe, as well as the number of mapped, unmapped and indeterminate mappings


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.UniversesApi;

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

        UniversesApi apiInstance = new UniversesApi(defaultClient);
        Integer universeId = 1; // Integer | Universe identifier. *To create a universe, use the `/universe' endpoint.*
        try {
            UniverseStatisticsResponse result = apiInstance.getUniverseStatistics(universeId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniversesApi#getUniverseStatistics");
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
 **universeId** | **Integer**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* |

### Return type

[**UniverseStatisticsResponse**](UniverseStatisticsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for mapping statistics for a universe |  -  |
| **0** | Error Response |  -  |


## getUniverses

> UniversesResponse getUniverses(universeId, universeType)

Fetch metadata for universes

Fetch information on active universes for the current user. Optionally filter for a specific universe given a `universeId`


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.UniversesApi;

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

        UniversesApi apiInstance = new UniversesApi(defaultClient);
        Integer universeId = 1; // Integer | Universe identifier. *To create a universe, use the `/universe' endpoint.*
        String universeType = "ENTITY"; // String | Universe Type.
        try {
            UniversesResponse result = apiInstance.getUniverses(universeId, universeType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniversesApi#getUniverses");
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
 **universeId** | **Integer**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* | [optional]
 **universeType** | **String**| Universe Type. | [optional] [enum: ENTITY, PEOPLE]

### Return type

[**UniversesResponse**](UniversesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on multiple universes |  -  |
| **0** | Error Response |  -  |


## getUpdateUniverseForList

> UniverseMetaResponse getUpdateUniverseForList(updateUniverseRequest)

Update metadata for an existing universe

Update metadata for an existing universe


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.UniversesApi;

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

        UniversesApi apiInstance = new UniversesApi(defaultClient);
        UpdateUniverseRequest updateUniverseRequest = new UpdateUniverseRequest(); // UpdateUniverseRequest | A request to update a user's universe
        try {
            UniverseMetaResponse result = apiInstance.getUpdateUniverseForList(updateUniverseRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniversesApi#getUpdateUniverseForList");
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
 **updateUniverseRequest** | [**UpdateUniverseRequest**](UpdateUniverseRequest.md)| A request to update a user&#39;s universe |

### Return type

[**UniverseMetaResponse**](UniverseMetaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Metadata on a single universe |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |
| **0** | Error Response |  -  |

