# JobManagementApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelActiveJob**](JobManagementApi.md#cancelActiveJob) | **DELETE** /jobs/{id} | Cancel a job with the given resource ID
[**cancelAllActiveJobs**](JobManagementApi.md#cancelAllActiveJobs) | **DELETE** /jobs | Cancel all active jobs
[**getJobs**](JobManagementApi.md#getJobs) | **GET** /jobs | Get information on all active jobs



## cancelActiveJob

> cancelActiveJob(id)

Cancel a job with the given resource ID

Cancel a specific job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OfficeCloudRefresh.ApiClient;
import com.factset.sdk.OfficeCloudRefresh.ApiException;
import com.factset.sdk.OfficeCloudRefresh.Configuration;
import com.factset.sdk.OfficeCloudRefresh.auth.*;
import com.factset.sdk.OfficeCloudRefresh.models.*;
import com.factset.sdk.OfficeCloudRefresh.api.JobManagementApi;

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

        JobManagementApi apiInstance = new JobManagementApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for the job (resource ID returned from FactSet).
        try {
            apiInstance.cancelActiveJob(id);

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#cancelActiveJob");
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
 **id** | **java.util.UUID**| Unique identifier for the job (resource ID returned from FactSet). |

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
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## cancelAllActiveJobs

> cancelAllActiveJobs()

Cancel all active jobs

Cancel all active (on_hold, queued, executing) jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OfficeCloudRefresh.ApiClient;
import com.factset.sdk.OfficeCloudRefresh.ApiException;
import com.factset.sdk.OfficeCloudRefresh.Configuration;
import com.factset.sdk.OfficeCloudRefresh.auth.*;
import com.factset.sdk.OfficeCloudRefresh.models.*;
import com.factset.sdk.OfficeCloudRefresh.api.JobManagementApi;

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

        JobManagementApi apiInstance = new JobManagementApi(defaultClient);
        try {
            apiInstance.cancelAllActiveJobs();

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#cancelAllActiveJobs");
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
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |


## getJobs

> ActiveJobStatusList getJobs()

Get information on all active jobs

Get the ids and status of all active jobs

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.OfficeCloudRefresh.ApiClient;
import com.factset.sdk.OfficeCloudRefresh.ApiException;
import com.factset.sdk.OfficeCloudRefresh.Configuration;
import com.factset.sdk.OfficeCloudRefresh.auth.*;
import com.factset.sdk.OfficeCloudRefresh.models.*;
import com.factset.sdk.OfficeCloudRefresh.api.JobManagementApi;

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

        JobManagementApi apiInstance = new JobManagementApi(defaultClient);
        try {
            ActiveJobStatusList result = apiInstance.getJobs();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#getJobs");
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

[**ActiveJobStatusList**](ActiveJobStatusList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  |
| **400** | Bad Request |  -  |
| **500** | Server Error |  -  |

