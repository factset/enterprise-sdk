# ModelRefreshApi

All URIs are relative to *https://api.factset.com/office-refresh/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFileById**](ModelRefreshApi.md#getFileById) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**getStatusById**](ModelRefreshApi.md#getStatusById) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**postWorkbook**](ModelRefreshApi.md#postWorkbook) | **POST** /refresh | Upload a model



## getFileById

> GetFileByIdResponseWrapper getFileById(id, outputFileName)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

```java
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.ModelRefreshApi;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.ModelRefreshApi.GetFileByIdResponseWrapper;

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

        ModelRefreshApi apiInstance = new ModelRefreshApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Resource ID
        String outputFileName = "outputFileName_example"; // String | Optional name for returned output file as set in the Content-Disposition response header.
        try {
            GetFileByIdResponseWrapper result = apiInstance.getFileById(id, outputFileName);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // File
            
                case 202:
                    System.out.println(result.getResponse202()); // JobStatus
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling ModelRefreshApi#getFileById");
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
 **id** | **java.util.UUID**| Resource ID |
 **outputFileName** | **String**| Optional name for returned output file as set in the Content-Disposition response header. | [optional]

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
| **200** | Expected response; body will contain calculated file |  -  |
| **202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |


## getStatusById

> JobStatus getStatusById(id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by ID

### Example

```java
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.ModelRefreshApi;

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

        ModelRefreshApi apiInstance = new ModelRefreshApi(defaultClient);
        java.util.UUID id = new java.util.UUID(); // java.util.UUID | Resource ID
        try {
            JobStatus result = apiInstance.getStatusById(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ModelRefreshApi#getStatusById");
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
 **id** | **java.util.UUID**| Resource ID |

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
| **201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Absolute URL to check status of the request. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |


## postWorkbook

> JobStatus postWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays)

Upload a model

Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.

### Example

```java
import java.io.File;
// Import classes:
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiClient;
import com.factset.sdk.InvestmentBankingOfficeRefresh.ApiException;
import com.factset.sdk.InvestmentBankingOfficeRefresh.Configuration;
import com.factset.sdk.InvestmentBankingOfficeRefresh.auth.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.models.*;
import com.factset.sdk.InvestmentBankingOfficeRefresh.api.ModelRefreshApi;

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

        ModelRefreshApi apiInstance = new ModelRefreshApi(defaultClient);
        File body = new File("/path/to/file"); // File | 
        Boolean nowHandlingEnabled = true; // Boolean | Option to handle =NOW codes.
        Boolean refreshAutoFilters = true; // Boolean | Option to refresh codes in autofilters.
        Boolean resizeArrays = true; // Boolean | Option to resize arrays
        try {
            JobStatus result = apiInstance.postWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ModelRefreshApi#postWorkbook");
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
 **nowHandlingEnabled** | **Boolean**| Option to handle &#x3D;NOW codes. | [optional]
 **refreshAutoFilters** | **Boolean**| Option to refresh codes in autofilters. | [optional]
 **resizeArrays** | **Boolean**| Option to resize arrays | [optional]

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
| **202** | Accepted |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |

