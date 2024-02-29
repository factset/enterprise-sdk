# RefreshOperationsApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileById**](RefreshOperationsApi.md#getFileById) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**getStatusById**](RefreshOperationsApi.md#getStatusById) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**postWorkbook**](RefreshOperationsApi.md#postWorkbook) | **POST** /refresh/calculate | Upload a spreadsheet file



## getFileById

> GetFileByIdResponseWrapper getFileById(id)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.RefreshOperationsApi;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.RefreshOperationsApi.GetFileByIdResponseWrapper;

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

        RefreshOperationsApi apiInstance = new RefreshOperationsApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for the job (resource ID returned from FactSet).
        try {
            GetFileByIdResponseWrapper result = apiInstance.getFileById(id);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // File
            
                case 202:
                    System.out.println(result.getResponse202()); // JobStatus
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling RefreshOperationsApi#getFileById");
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

GetFileByIdResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; body will contain calculated file |  * Content-Disposition - Standard HTTP header. Content is expected to be displayed as an attachment. <br>  * Content-Type - Standard HTTP header. The file format type. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Failed to refresh file |  -  |
| **500** | Server Error |  -  |


## getStatusById

> JobStatus getStatusById(id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.RefreshOperationsApi;

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

        RefreshOperationsApi apiInstance = new RefreshOperationsApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Unique identifier for the job (resource ID returned from FactSet).
        try {
            JobStatus result = apiInstance.getStatusById(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RefreshOperationsApi#getStatusById");
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

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Relative URL to check status of the request. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Failed to refresh file |  -  |
| **500** | Server Error |  -  |


## postWorkbook

> JobStatus postWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays)

Upload a spreadsheet file

Upload a spreadsheet file (in the Open Office XML format) for FactSet to refresh.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.io.File;
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.RefreshOperationsApi;

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

        RefreshOperationsApi apiInstance = new RefreshOperationsApi(defaultClient);
        File body = new File("/path/to/file"); // File | 
        Boolean nowHandlingEnabled = true; // Boolean | Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118.
        Boolean refreshAutoFilters = true; // Boolean | Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is false.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
        Boolean resizeArrays = true; // Boolean | Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds
        try {
            JobStatus result = apiInstance.postWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RefreshOperationsApi#postWorkbook");
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
 **body** | **File**|  |
 **nowHandlingEnabled** | **Boolean**| Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. | [optional]
 **refreshAutoFilters** | **Boolean**| Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is false.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional]
 **resizeArrays** | **Boolean**| Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional]

### Return type

[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Relative URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden. The user&#39;s subscription is missing required CACCESS. |  -  |
| **413** | File Too Large.  Currently only accepting files up to 50MB. |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Server Error |  -  |

