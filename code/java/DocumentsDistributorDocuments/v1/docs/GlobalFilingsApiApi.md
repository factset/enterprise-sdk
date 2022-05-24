# GlobalFilingsApiApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**globalFilingsV1ListFilesGet**](GlobalFilingsApiApi.md#globalFilingsV1ListFilesGet) | **GET** /global-filings/v1/list-files | Retrieve filings within FactSet coverage



## globalFilingsV1ListFilesGet

> java.util.List<FilingsFiles> globalFilingsV1ListFilesGet(dataset, startDate, endDate)

Retrieve filings within FactSet coverage

Parameters can be used to get the filings

### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.DocumentsDistributorDocuments.ApiClient;
import com.factset.sdk.DocumentsDistributorDocuments.ApiException;
import com.factset.sdk.DocumentsDistributorDocuments.Configuration;
import com.factset.sdk.DocumentsDistributorDocuments.auth.*;
import com.factset.sdk.DocumentsDistributorDocuments.models.*;
import com.factset.sdk.DocumentsDistributorDocuments.api.GlobalFilingsApiApi;

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

        GlobalFilingsApiApi apiInstance = new GlobalFilingsApiApi(defaultClient);
        String dataset = "edgar"; // String | This parameter filters the results based on the dataset of the filings documents.
        LocalDate startDate = LocalDate.now(); // LocalDate | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
        LocalDate endDate = LocalDate.now(); // LocalDate | The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format
        try {
            java.util.List<FilingsFiles> result = apiInstance.globalFilingsV1ListFilesGet(dataset, startDate, endDate);
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
 **dataset** | **String**| This parameter filters the results based on the dataset of the filings documents. | [enum: edgar]
 **startDate** | **LocalDate**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format |
 **endDate** | **LocalDate**| The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format |

### Return type

[**java.util.List&lt;FilingsFiles&gt;**](FilingsFiles.md)

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

