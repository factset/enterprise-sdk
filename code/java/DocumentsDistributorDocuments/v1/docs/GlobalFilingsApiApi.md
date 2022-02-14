# GlobalFilingsApiApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalFilingsV1FormTypesGet**](GlobalFilingsApiApi.md#globalFilingsV1FormTypesGet) | **GET** /global-filings/v1/form-types | Retrieve form types for each available Filings Source
[**globalFilingsV1ListFilesGet**](GlobalFilingsApiApi.md#globalFilingsV1ListFilesGet) | **GET** /global-filings/v1/list-files | Retrieve filings and metadata within FactSet coverage



## globalFilingsV1FormTypesGet

> Response globalFilingsV1FormTypesGet(source)

Retrieve form types for each available Filings Source

Gets all available form types for the filings sources. Source parameter can be used to filter the results.

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.model.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.GlobalFilingsApiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        GlobalFilingsApiApi apiInstance = new GlobalFilingsApiApi(defaultClient);
        String source = "EDG"; // String | This parameter filters the results based on the source of the filings document.
        try {
            Response result = apiInstance.globalFilingsV1FormTypesGet(source);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalFilingsApiApi#globalFilingsV1FormTypesGet");
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
 **source** | **String**| This parameter filters the results based on the source of the filings document. | [enum: EDG, SWD]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Form Types data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |


## globalFilingsV1ListFilesGet

> Response globalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, sort, startDate, endDate, ids, formType)

Retrieve filings and metadata within FactSet coverage

Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results

### Example

```java
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.model.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.GlobalFilingsApiApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;


public class Example {
    public static void main(String[] args) {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
        // See https://github.com/FactSet/enterprise-sdk-utils-java#authentication
        // for more information on using the ConfidentialClient class
        ConfidentialClient confidentialClient = new ConfidentialClient("./path/to/config.json");
        ApiClient defaultClient = new ApiClient(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient();
        // HttpBasicAuth FactSetApiKey = (HttpBasicAuth) defaultClient.getAuthentication("FactSetApiKey");
        // FactSetApiKey.setUsername("YOUR USERNAME");
        // FactSetApiKey.setPassword("YOUR PASSWORD");

        GlobalFilingsApiApi apiInstance = new GlobalFilingsApiApi(defaultClient);
        String source = "EDG"; // String | This parameter filters the results based on the source of the filings documents.
        Integer paginationLimit = 5; // Integer | Specifies the maximum number of results to return per result (max. 25)
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
        String startDate = "2020-07-01"; // String | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
        String endDate = "2020-12-01"; // String | The latest date the API should fetch for. Dates can be YYYY-MM-DD format
        String ids = "AAPL"; // String | This parameter filters the results based on ticker ID.
        String formType = "10-Q"; // String | This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source.
        try {
            Response result = apiInstance.globalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, sort, startDate, endDate, ids, formType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GlobalFilingsApiApi#globalFilingsV1ListFilesGet");
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
 **source** | **String**| This parameter filters the results based on the source of the filings documents. | [enum: EDG, SWD]
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result (max. 25) | [enum: 5]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [enum: 0]
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] [default to -startDate] [enum: startDate, -startDate]
 **startDate** | **String**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional]
 **endDate** | **String**| The latest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional]
 **ids** | **String**| This parameter filters the results based on ticker ID. | [optional]
 **formType** | **String**| This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Global Filings data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |

