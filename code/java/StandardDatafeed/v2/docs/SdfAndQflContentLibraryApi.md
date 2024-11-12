# SdfAndQflContentLibraryApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListFiles**](SdfAndQflContentLibraryApi.md#getListFiles) | **GET** /list-files | Returns delta &amp; full files for the schemas.
[**gethistoricalFiles**](SdfAndQflContentLibraryApi.md#gethistoricalFiles) | **GET** /historical-files | Returns full historic data of specified schema and bundle.



## getListFiles

> ListFile getListFiles(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort)

Returns delta &amp; full files for the schemas.

This endpoint returns delta and full files for all the schemas subscribed by the client.

- If the request does not include a date range filter, this endpoint returns the past 10 days of data by default. 
- If filtered by a date range, the data is limited to maximum of latest 30 days.


            


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.auth.*;
import com.factset.sdk.StandardDatafeed.models.*;
import com.factset.sdk.StandardDatafeed.api.SdfAndQflContentLibraryApi;

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

        SdfAndQflContentLibraryApi apiInstance = new SdfAndQflContentLibraryApi(defaultClient);
        String schema = "fgp_v1"; // String | Name of the schema.
        String bundle = "fgp_global_prices_am_v1"; // String | Name of the bundle.
        String type = "full"; // String | Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting 'Full' files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.   
        String startDate = "2023-01-01"; // String | The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in `startDate` and `endDate` along with `schema` parameter: The returned dataset is limited to a maximum of latest 30 days' worth of records. - Format: Should be absolute (YYYY-MM-DD). 
        Integer startDateRelative = 56; // Integer | The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in `startDate` and `endDate` along with `schema` parameter: The returned dataset is limited to a maximum of latest 30 days' worth of records. - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
        String endDate = "2023-01-28"; // String | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD. 
        Integer endDateRelative = 56; // Integer | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.* 
        Integer paginationLimit = 20; // Integer | Specifies the number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on startDate. 
        try {
            ListFile result = apiInstance.getListFiles(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SdfAndQflContentLibraryApi#getListFiles");
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
 **schema** | **String**| Name of the schema. | [optional]
 **bundle** | **String**| Name of the bundle. | [optional]
 **type** | **String**| Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    | [optional] [default to delta] [enum: full, delta]
 **startDate** | **String**| The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:   - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **startDateRelative** | **Integer**| The earliest date of the feed file the API should fetch based on the file timestamp. Consider the following points:  - Dates provided in &#x60;startDate&#x60; and &#x60;endDate&#x60; along with &#x60;schema&#x60; parameter: The returned dataset is limited to a maximum of latest 30 days&#39; worth of records. - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **endDate** | **String**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  | [optional]
 **endDateRelative** | **Integer**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] [enum: startDate, -startDate]

### Return type

[**ListFile**](ListFile.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
| **429** | Quantity Limits Exceeded |  -  |
| **500** | Internal Server Error |  -  |


## gethistoricalFiles

> HistoricalFile gethistoricalFiles(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort)

Returns full historic data of specified schema and bundle.

This endpoint returns historical data for the specified schema and bundle.

- If no date range is specified, this endpoint grants access to all archived records back to the first full.
- If filtered by a date range, the endpoint provides records within the specified date range; if it precedes the first full, all available records are included.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.auth.*;
import com.factset.sdk.StandardDatafeed.models.*;
import com.factset.sdk.StandardDatafeed.api.SdfAndQflContentLibraryApi;

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

        SdfAndQflContentLibraryApi apiInstance = new SdfAndQflContentLibraryApi(defaultClient);
        String schema = "fgp_v1"; // String | Name of the schema.
        String bundle = "fgp_global_prices_am_v1"; // String | Name of the bundle.
        String type = "full"; // String | Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting 'Full' files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.   
        String startDate = "2021-01-25"; // String | The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD). 
        Integer startDateRelative = 56; // Integer | The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.* 
        String endDate = "2023-01-28"; // String | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD. 
        Integer endDateRelative = 56; // Integer | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.* 
        Integer paginationLimit = 20; // Integer | Specifies the number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | Enables sorting data in ascending or descending chronological order based on startDate. 
        try {
            HistoricalFile result = apiInstance.gethistoricalFiles(schema, bundle, type, startDate, startDateRelative, endDate, endDateRelative, paginationLimit, paginationOffset, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SdfAndQflContentLibraryApi#gethistoricalFiles");
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
 **schema** | **String**| Name of the schema. | [optional]
 **bundle** | **String**| Name of the bundle. | [optional]
 **type** | **String**| Type of the file.  Note: - Full files are snapshots of the bundle capturing the most recent version of the bundle generated every weekend. When requesting &#39;Full&#39; files, ensure that the date range includes weekend dates. - Delta files include the incremental changes (inserts, updates, deletes), since the last file and have incremental sequence numbers.    | [optional] [default to delta] [enum: full, delta]
 **startDate** | **String**| The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Should be absolute (YYYY-MM-DD).  | [optional]
 **startDateRelative** | **Integer**| The earliest date of the feed file the API should fetch based on the file timestamp.    - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional]
 **endDate** | **String**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Should be absolute - YYYY-MM-DD.  | [optional]
 **endDateRelative** | **Integer**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.  *Note:* - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]
 **sort** | **List&lt;String&gt;**| Enables sorting data in ascending or descending chronological order based on startDate.  | [optional] [enum: startDate, -startDate]

### Return type

[**HistoricalFile**](HistoricalFile.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
| **429** | Quantity Limits Exceeded |  -  |
| **500** | Internal Server Error |  -  |

