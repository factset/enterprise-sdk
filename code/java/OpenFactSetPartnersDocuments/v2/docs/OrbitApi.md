# OrbitApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getChineseTranscriptsDaily**](OrbitApi.md#getChineseTranscriptsDaily) | **GET** /orbit/transcripts/daily | Returns the daily files from Open:FactSet Partner - Orbit.
[**getChineseTranscriptsHistory**](OrbitApi.md#getChineseTranscriptsHistory) | **GET** /orbit/transcripts/history | Returns the history files from Open:FactSet Partner - Orbit



## getChineseTranscriptsDaily

> OrbitResponse getChineseTranscriptsDaily(sort, paginationLimit, paginationOffset, startDate, endDate, stockCode, fileName, title)

Returns the daily files from Open:FactSet Partner - Orbit.

Returns the daily files from Open:FactSet Partner - Orbit.

### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OrbitApi;

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

        OrbitApi apiInstance = new OrbitApi(defaultClient);
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        LocalDate startDate = LocalDate.parse("2021-09-01"); // LocalDate | The earliest date of the Orbit file the API should fetching for based on fileTimestamp.
        LocalDate endDate = LocalDate.parse("2021-10-08"); // LocalDate | The latest date of the Orbit file the API should fetching for based on fileTimestamp.
        String stockCode = "601236"; // String | The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers. 
        String fileName = "fileName_example"; // String | This parameter is used to filters the results based on file name.
        String title = "投资者关系活动记录表2022-001"; // String | This parameter is used to filter the results based on the headline of the transcript.
        try {
            OrbitResponse result = apiInstance.getChineseTranscriptsDaily(sort, paginationLimit, paginationOffset, startDate, endDate, stockCode, fileName, title);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrbitApi#getChineseTranscriptsDaily");
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
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate] [enum: startDate, -startDate]
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **startDate** | **LocalDate**| The earliest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional]
 **endDate** | **LocalDate**| The latest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional]
 **stockCode** | **String**| The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  | [optional]
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional]
 **title** | **String**| This parameter is used to filter the results based on the headline of the transcript. | [optional]

### Return type

[**OrbitResponse**](OrbitResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Orbit data. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |


## getChineseTranscriptsHistory

> OrbithistoryResponse getChineseTranscriptsHistory(paginationLimit, paginationOffset, fileName)

Returns the history files from Open:FactSet Partner - Orbit

Returns the historical files from February 28th, 2005 to current date. 

### Example

```java
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.OrbitApi;

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

        OrbitApi apiInstance = new OrbitApi(defaultClient);
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String fileName = "fileName_example"; // String | This parameter is used to filters the results based on file name.
        try {
            OrbithistoryResponse result = apiInstance.getChineseTranscriptsHistory(paginationLimit, paginationOffset, fileName);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OrbitApi#getChineseTranscriptsHistory");
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
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional]

### Return type

[**OrbithistoryResponse**](OrbithistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Orbit data. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

