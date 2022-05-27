# DefaultApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteActiveJob**](DefaultApi.md#deleteActiveJob) | **DELETE** /v1/calculations/{id} | 
[**deleteAllActiveJobs**](DefaultApi.md#deleteAllActiveJobs) | **DELETE** /v1/calculations | 
[**getAllActiveJobs**](DefaultApi.md#getAllActiveJobs) | **GET** /v1/calculations | 
[**getCalculateResults**](DefaultApi.md#getCalculateResults) | **GET** /v1/calculations/{id} | 
[**pollArchiveOFDB**](DefaultApi.md#pollArchiveOFDB) | **GET** /v1/archive/{id}/status | 
[**pollCalculate**](DefaultApi.md#pollCalculate) | **GET** /v1/calculations/{id}/status | 
[**submitArchiveOFDB**](DefaultApi.md#submitArchiveOFDB) | **POST** /v1/archive | 
[**submitCalculate**](DefaultApi.md#submitCalculate) | **POST** /v1/calculations | 



## deleteActiveJob

> deleteActiveJob(id)



Delete a specified job started by the requester's username-serial

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        try {
            apiInstance.deleteActiveJob(id);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteActiveJob");
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
 **id** | **String**| Unique identifier for a screen calculation job |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## deleteAllActiveJobs

> deleteAllActiveJobs()



Delete all active jobs started by the requester's username-serial

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.deleteAllActiveJobs();

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteAllActiveJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## getAllActiveJobs

> InlineResponse200 getAllActiveJobs()



Retrieve list of all active job ids started by requester's username-serial

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            InlineResponse200 result = apiInstance.getAllActiveJobs();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getAllActiveJobs");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

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
| **200** | ActiveJobsResponse contains id of all of a user&#39;s active jobs |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## getCalculateResults

> getCalculateResults(id, paginationLimit, paginationCursor)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        Integer paginationLimit = 56; // Integer | Page size limit (minumum 1000, default 10,000, maximum 100,000)
        Integer paginationCursor = 56; // Integer | Paging index (Initial request may omit)
        try {
            apiInstance.getCalculateResults(id, paginationLimit, paginationCursor);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getCalculateResults");
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
 **id** | **String**| Unique identifier for a screen calculation job |
 **paginationLimit** | **Integer**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional]
 **paginationCursor** | **Integer**| Paging index (Initial request may omit) | [optional]

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Screen calculation complete. The screen results will be formatted as a STACH 2.0 table and in a property named data. In the case of pagination column metadata will only be returned with the first page. Results will be purged after they are retrieved or six hours. |  -  |
| **202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **400** | The requested screen could not be opened. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## pollArchiveOFDB

> ResourceStatusResponse pollArchiveOFDB(id)



Polls the archive OFDB job with a given archive job ID and returns job status

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen archive to OFDB job
        try {
            ResourceStatusResponse result = apiInstance.pollArchiveOFDB(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pollArchiveOFDB");
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
 **id** | **String**| Unique identifier for a screen archive to OFDB job |

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Archive job completed |  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **202** | Archive job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## pollCalculate

> ResourceStatusResponse pollCalculate(id)



Polls the calculation job with a given screen calculation ID and returns job status

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        try {
            ResourceStatusResponse result = apiInstance.pollCalculate(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#pollCalculate");
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
 **id** | **String**| Unique identifier for a screen calculation job |

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Calculation job completed |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **202** | Calculation job still in progress |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-PickUp-Progress - Screen calculation progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitArchiveOFDB

> ResourceStatusResponse submitArchiveOFDB(screenArchiveOFDBParameters)



Begins archive of screen to OFDB

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ScreenArchiveOFDBParameters screenArchiveOFDBParameters = new ScreenArchiveOFDBParameters(); // ScreenArchiveOFDBParameters | Data required for an archive to OFDB request
        try {
            ResourceStatusResponse result = apiInstance.submitArchiveOFDB(screenArchiveOFDBParameters);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#submitArchiveOFDB");
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
 **screenArchiveOFDBParameters** | [**ScreenArchiveOFDBParameters**](ScreenArchiveOFDBParameters.md)| Data required for an archive to OFDB request | [optional]

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitCalculate

> ResourceStatusResponse submitCalculate(screenCalcParameters)



Begins calculation of screen

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.DefaultApi;

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

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ScreenCalcParameters screenCalcParameters = new ScreenCalcParameters(); // ScreenCalcParameters | Data required for a calculation request
        try {
            ResourceStatusResponse result = apiInstance.submitCalculate(screenCalcParameters);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#submitCalculate");
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
 **screenCalcParameters** | [**ScreenCalcParameters**](ScreenCalcParameters.md)| Data required for a calculation request | [optional]

### Return type

[**ResourceStatusResponse**](ResourceStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to pick up screen calculation results <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

