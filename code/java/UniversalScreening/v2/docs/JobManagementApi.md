# JobManagementApi

All URIs are relative to *https://api.factset.com/universal-screening*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteActiveJob**](JobManagementApi.md#deleteActiveJob) | **DELETE** /v2/job/{id} | 
[**deleteAllActiveJobs**](JobManagementApi.md#deleteAllActiveJobs) | **DELETE** /v2/jobs | 
[**getAllActiveJobs**](JobManagementApi.md#getAllActiveJobs) | **GET** /v2/jobs | 



## deleteActiveJob

> deleteActiveJob(id)



Delete a specified job started by the requester's username-serial

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
import com.factset.sdk.UniversalScreening.api.JobManagementApi;

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
        String id = "id_example"; // String | Unique identifier for a screen calculation job
        try {
            apiInstance.deleteActiveJob(id);

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#deleteActiveJob");
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
import com.factset.sdk.UniversalScreening.api.JobManagementApi;

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
            apiInstance.deleteAllActiveJobs();

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#deleteAllActiveJobs");
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

> ActiveJobsData getAllActiveJobs()



Retrieve list of all active job ids started by requester's username-serial

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
import com.factset.sdk.UniversalScreening.api.JobManagementApi;

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
            ActiveJobsData result = apiInstance.getAllActiveJobs();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling JobManagementApi#getAllActiveJobs");
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

[**ActiveJobsData**](ActiveJobsData.md)

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

