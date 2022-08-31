# NewsApiApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asynchNewsV1CheckStatusGet**](NewsApiApi.md#asynchNewsV1CheckStatusGet) | **GET** /asynch/news/v1/check-status | Returns the status and percentDone of the requested jobID and source
[**asynchNewsV1GetFilesGet**](NewsApiApi.md#asynchNewsV1GetFilesGet) | **GET** /asynch/news/v1/get-files | Returns the news filings for the specified daterange and source
[**asynchNewsV1RequestFilesGet**](NewsApiApi.md#asynchNewsV1RequestFilesGet) | **GET** /asynch/news/v1/request-files | Returns the jobID



## asynchNewsV1CheckStatusGet

> NewscheckstatusResponse asynchNewsV1CheckStatusGet(jobID, source, paginationLimit, paginationOffset)

Returns the status and percentDone of the requested jobID and source

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.NewsApiApi;

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

        NewsApiApi apiInstance = new NewsApiApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone
        String source = "news_ukwd"; // String | This parameter filters the results based on the source of the filings document
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
        try {
            NewscheckstatusResponse result = apiInstance.asynchNewsV1CheckStatusGet(jobID, source, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApiApi#asynchNewsV1CheckStatusGet");
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
 **source** | **String**| This parameter filters the results based on the source of the filings document | [enum: news_ukwd, hkex]
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**NewscheckstatusResponse**](NewscheckstatusResponse.md)

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


## asynchNewsV1GetFilesGet

> NewsgetfilesResponse asynchNewsV1GetFilesGet(jobID, source, paginationLimit, paginationOffset)

Returns the news filings for the specified daterange and source

Need to plug-in the source and jobID got from /request-files into /get-files endpoint

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.NewsApiApi;

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

        NewsApiApi apiInstance = new NewsApiApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query
        String source = "news_ukwd"; // String | This parameter filters the results based on the source of the filings document
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
        try {
            NewsgetfilesResponse result = apiInstance.asynchNewsV1GetFilesGet(jobID, source, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApiApi#asynchNewsV1GetFilesGet");
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
 **source** | **String**| This parameter filters the results based on the source of the filings document | [enum: news_ukwd, hkex]
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**NewsgetfilesResponse**](NewsgetfilesResponse.md)

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


## asynchNewsV1RequestFilesGet

> NewsrequestfilesResponse asynchNewsV1RequestFilesGet(startDate, endDate, source)

Returns the jobID

Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format
This API only supports adhoc requests to retrieve historical files

### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.NewsApiApi;

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

        NewsApiApi apiInstance = new NewsApiApi(defaultClient);
        LocalDate startDate = LocalDate.now(); // LocalDate | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
        LocalDate endDate = LocalDate.now(); // LocalDate | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
        String source = "news_ukwd"; // String | This parameter filters the results based on the source of the filings document
        try {
            NewsrequestfilesResponse result = apiInstance.asynchNewsV1RequestFilesGet(startDate, endDate, source);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NewsApiApi#asynchNewsV1RequestFilesGet");
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
 **source** | **String**| This parameter filters the results based on the source of the filings document | [enum: news_ukwd, hkex]

### Return type

[**NewsrequestfilesResponse**](NewsrequestfilesResponse.md)

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

