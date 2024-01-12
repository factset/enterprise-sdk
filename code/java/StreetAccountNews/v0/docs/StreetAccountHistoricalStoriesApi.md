# StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**streetaccountHistoricalCheckStatusGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalCheckStatusGet) | **GET** /streetaccount/historical/check-status | Returns the status and percentage of completion for the requested jobID
[**streetaccountHistoricalGetFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalGetFilesGet) | **GET** /streetaccount/historical/get-files | Returns the StreetAccount XML files for the specified date range
[**streetaccountHistoricalRequestFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccountHistoricalRequestFilesGet) | **GET** /streetaccount/historical/request-files | Returns the jobID



## streetaccountHistoricalCheckStatusGet

> CheckstatusResponse streetaccountHistoricalCheckStatusGet(jobID, paginationLimit, paginationOffset)

Returns the status and percentage of completion for the requested jobID

Need to plug-in the jobID from /request-files into /check-status endpoint

### Example

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to know the status and percentDone
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
        try {
            CheckstatusResponse result = apiInstance.streetaccountHistoricalCheckStatusGet(jobID, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#streetaccountHistoricalCheckStatusGet");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**CheckstatusResponse**](CheckstatusResponse.md)

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
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |


## streetaccountHistoricalGetFilesGet

> GetfilesResponse streetaccountHistoricalGetFilesGet(jobID, paginationLimit, paginationOffset)

Returns the StreetAccount XML files for the specified date range

Need to plug-in the jobID from /check-status into /get-files endpoint

### Example

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        String jobID = "jobID_example"; // String | jobID returned by the request-files endpoint to collect the results of the query
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
        try {
            GetfilesResponse result = apiInstance.streetaccountHistoricalGetFilesGet(jobID, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#streetaccountHistoricalGetFilesGet");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**GetfilesResponse**](GetfilesResponse.md)

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
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |


## streetaccountHistoricalRequestFilesGet

> RequestfilesResponse streetaccountHistoricalRequestFilesGet(startDate, endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example

```java
import java.time.OffsetDateTime;
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
        OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
        try {
            RequestfilesResponse result = apiInstance.streetaccountHistoricalRequestFilesGet(startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#streetaccountHistoricalRequestFilesGet");
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
 **startDate** | **OffsetDateTime**| Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format |
 **endDate** | **OffsetDateTime**| The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format |

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
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |

