# ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCalculateResults**](ScreeningOperationsApi.md#getCalculateResults) | **GET** /v2/job/{id} | 
[**pollCalculate**](ScreeningOperationsApi.md#pollCalculate) | **GET** /v2/job/{id}/status | 
[**submitArchiveOFDB**](ScreeningOperationsApi.md#submitArchiveOFDB) | **POST** /v2/job/archive | 
[**submitCalculate**](ScreeningOperationsApi.md#submitCalculate) | **POST** /v2/job/calculate | 



## getCalculateResults

> PaginatedCalculationResponse getCalculateResults(id, paginationLimit, paginationCursor)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.ScreeningOperationsApi;

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        Integer paginationLimit = 56; // Integer | Page size limit (minumum 1000, default 10,000, maximum 100,000)
        Integer paginationCursor = 56; // Integer | Paging index (Initial request may omit)
        try {
            PaginatedCalculationResponse result = apiInstance.getCalculateResults(id, paginationLimit, paginationCursor);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#getCalculateResults");
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

[**PaginatedCalculationResponse**](PaginatedCalculationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Paginated Screen Results and Metadata |  -  |
| **202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **400** | The requested screen could not be opened. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## pollCalculate

> ResourceStatusResponse pollCalculate(id)



Polls the job with a given screen ID and returns job status

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.ScreeningOperationsApi;

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        try {
            ResourceStatusResponse result = apiInstance.pollCalculate(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#pollCalculate");
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
| **201** | Job completed |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **202** | Calculation job still in progress |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-PickUp-Progress - Screen progress <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **404** | Job ID not found. |  -  |
| **410** | The results have been fetched for this ID. |  -  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitArchiveOFDB

> ResourceStatusResponse submitArchiveOFDB(screenArchiveOFDBParameters)



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.ScreeningOperationsApi;

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        ScreenArchiveOFDBParameters screenArchiveOFDBParameters = new ScreenArchiveOFDBParameters(); // ScreenArchiveOFDBParameters | Data required for an archive to OFDB request
        try {
            ResourceStatusResponse result = apiInstance.submitArchiveOFDB(screenArchiveOFDBParameters);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#submitArchiveOFDB");
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
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitCalculate

> ResourceStatusResponse submitCalculate(screenCalcParameters)



Begins calculation of screen. Subject to rate limiting by serial.

### Example

```java
// Import classes:
import com.factset.sdk.UniversalScreening.ApiClient;
import com.factset.sdk.UniversalScreening.ApiException;
import com.factset.sdk.UniversalScreening.Configuration;
import com.factset.sdk.UniversalScreening.auth.*;
import com.factset.sdk.UniversalScreening.models.*;
import com.factset.sdk.UniversalScreening.api.ScreeningOperationsApi;

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        ScreenCalcParameters screenCalcParameters = new ScreenCalcParameters(); // ScreenCalcParameters | Data required for a calculation request
        try {
            ResourceStatusResponse result = apiInstance.submitCalculate(screenCalcParameters);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#submitCalculate");
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
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location - Relative location to poll for status <br>  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  * RateLimit-Limit - Number of weekly jobs available. <br>  * RateLimit-Remaining - Number of remaining weekly jobs. <br>  * RateLimit-Reset - Time, in seconds, until weekly limit resets. <br>  |
| **400** | Invalid request body. |  -  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit - Maximum number of jobs. <br>  * X-FactSet-Api-Units-Remaining - Number of available jobs. <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

