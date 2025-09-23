# ScreeningOperationsApi

All URIs are relative to *https://api.factset.com/universal-screening/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCalculateResults**](ScreeningOperationsApi.md#getCalculateResults) | **GET** /job/{id} | 
[**getExportResults**](ScreeningOperationsApi.md#getExportResults) | **GET** /job/{id}/export | 
[**pollCalculate**](ScreeningOperationsApi.md#pollCalculate) | **GET** /job/{id}/status | 
[**submitArchiveOFDB**](ScreeningOperationsApi.md#submitArchiveOFDB) | **POST** /job/archive | 
[**submitCalculate**](ScreeningOperationsApi.md#submitCalculate) | **POST** /job/calculate | 
[**submitExport**](ScreeningOperationsApi.md#submitExport) | **POST** /job/export | 



## getCalculateResults

> PaginatedCalculationResponse getCalculateResults(id, paginationLimit, paginationCursor)



Retrieve results of complete screen calculation. Screens with more than 10,000 rows will be returned in a paginated format. Results may be fetched in pages of 1,000 - 100,000 results with 10,000 being the default page size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
        Integer paginationLimit = 10000; // Integer | Page size limit (minumum 1000, default 10,000, maximum 100,000)
        Integer paginationCursor = 0; // Integer | Paging index (Initial request may omit)
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
 **id** | **java.util.UUID**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |
 **paginationLimit** | **Integer**| Page size limit (minumum 1000, default 10,000, maximum 100,000) | [optional] [default to 10000]
 **paginationCursor** | **Integer**| Paging index (Initial request may omit) | [optional] [default to 0]

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
| **200** | Paginated Screen Results and Metadata |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | The requested screen could not be opened. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **403** | User is not authorized for this operation. |  -  |
| **404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## getExportResults

> File getExportResults(id)



Retrieve results of an export request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
        try {
            File result = apiInstance.getExportResults(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#getExportResults");
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
 **id** | **java.util.UUID**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/csv, text/plain, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Body of the requested export file. Content-type will be conditioned on requested export type. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Content-Disposition -  <br>  |
| **202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | The requested screen could not be opened. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **403** | User is not authorized for this operation. |  -  |
| **404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## pollCalculate

> ResourceStatusResponse pollCalculate(id)



Polls the job with a given screen ID and returns job status

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for a job. \"Job\" refers to a screen calculation or archival.
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
 **id** | **java.util.UUID**| Unique identifier for a job. \&quot;Job\&quot; refers to a screen calculation or archival. |

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
| **201** | Job completed |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **202** | Long-running job still in progress |  * Location -  <br>  * X-FactSet-Api-PickUp-Progress -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **403** | User is not authorized for this operation. |  -  |
| **404** | Job ID not found. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **410** | The results have been fetched for this ID. |  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitArchiveOFDB

> ResourceStatusResponse submitArchiveOFDB(screenArchiveOFDBParameters)



Begins archive of screen to OFDB. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **202** | Successful archive OFDB submission response, returns the job ID unique to this archive and the URL in the Location header to check the status of the archive. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitCalculate

> ResourceStatusResponse submitCalculate(screenCalcParameters)



Begins calculation of screen. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **202** | Successful calculation submission response, returns the job ID unique to this calculation and the URL in the Location header to check the status of the calculation. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |


## submitExport

> SubmitExportResponse submitExport(screenExportParameters)



Begins the calculate and export of screen to specified file format. Subject to rate limiting by serial.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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

        ScreeningOperationsApi apiInstance = new ScreeningOperationsApi(defaultClient);
        ScreenExportParameters screenExportParameters = new ScreenExportParameters(); // ScreenExportParameters | Data required for an export request
        try {
            SubmitExportResponse result = apiInstance.submitExport(screenExportParameters);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScreeningOperationsApi#submitExport");
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
 **screenExportParameters** | [**ScreenExportParameters**](ScreenExportParameters.md)| Data required for an export request | [optional]

### Return type

[**SubmitExportResponse**](SubmitExportResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Successful export submission response, returns the job ID unique to this export and the URL in the Location header to check the status of the export. |  * Location -  <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **400** | Invalid request body. |  * X-RateLimit-Limit-604800 -  <br>  * X-RateLimit-Remaining-604800 -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **401** | Invalid or missing authentication. |  -  |
| **429** | Too many requests. |  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Internal Server Error |  * Request-Key - Provide this key when reporting this issue <br>  |

