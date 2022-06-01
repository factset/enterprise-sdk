# StreetAccountXmlApiApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asynchStreetaccountV1CheckStatusGet**](StreetAccountXmlApiApi.md#asynchStreetaccountV1CheckStatusGet) | **GET** /asynch/streetaccount/v1/check-status | Returns the status and percentDone of the requested jobID
[**asynchStreetaccountV1GetFilesGet**](StreetAccountXmlApiApi.md#asynchStreetaccountV1GetFilesGet) | **GET** /asynch/streetaccount/v1/get-files | Returns the SA XML files for the specified daterange
[**asynchStreetaccountV1RequestFilesGet**](StreetAccountXmlApiApi.md#asynchStreetaccountV1RequestFilesGet) | **GET** /asynch/streetaccount/v1/request-files | Returns the jobID



## asynchStreetaccountV1CheckStatusGet

> java.util.List<Checkstatus> asynchStreetaccountV1CheckStatusGet(jobID)

Returns the status and percentDone of the requested jobID

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.StreetAccountXmlApiApi;

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

        StreetAccountXmlApiApi apiInstance = new StreetAccountXmlApiApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone
        try {
            java.util.List<Checkstatus> result = apiInstance.asynchStreetaccountV1CheckStatusGet(jobID);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountXmlApiApi#asynchStreetaccountV1CheckStatusGet");
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
 **jobID** | **String**| jobID returned by the request-files endpoint to know the status and percentDone |

### Return type

[**java.util.List&lt;Checkstatus&gt;**](Checkstatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |


## asynchStreetaccountV1GetFilesGet

> java.util.List<Getfiles> asynchStreetaccountV1GetFilesGet(jobID)

Returns the SA XML files for the specified daterange

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.StreetAccountXmlApiApi;

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

        StreetAccountXmlApiApi apiInstance = new StreetAccountXmlApiApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query
        try {
            java.util.List<Getfiles> result = apiInstance.asynchStreetaccountV1GetFilesGet(jobID);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountXmlApiApi#asynchStreetaccountV1GetFilesGet");
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
 **jobID** | **String**| jobID returned by the request-files endpoint to collect the results of the query |

### Return type

[**java.util.List&lt;Getfiles&gt;**](Getfiles.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad request |  -  |


## asynchStreetaccountV1RequestFilesGet

> RequestfilesResponse asynchStreetaccountV1RequestFilesGet(startDate, endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format

This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.StreetAccountXmlApiApi;

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

        StreetAccountXmlApiApi apiInstance = new StreetAccountXmlApiApi(defaultClient);
        LocalDate startDate = LocalDate.now(); // LocalDate | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
        LocalDate endDate = LocalDate.now(); // LocalDate | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
        try {
            RequestfilesResponse result = apiInstance.asynchStreetaccountV1RequestFilesGet(startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountXmlApiApi#asynchStreetaccountV1RequestFilesGet");
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
 **startDate** | **LocalDate**| Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format |
 **endDate** | **LocalDate**| The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format |

### Return type

[**RequestfilesResponse**](RequestfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad request |  -  |

