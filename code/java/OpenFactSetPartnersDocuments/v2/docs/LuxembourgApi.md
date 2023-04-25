# LuxembourgApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLuxembourgGreenbondsDaily**](LuxembourgApi.md#getLuxembourgGreenbondsDaily) | **GET** /luxembourg/green-bonds/daily | Returns daily files from Open:FactSet Partner - Luxembourg



## getLuxembourgGreenbondsDaily

> LuxResponse getLuxembourgGreenbondsDaily(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type)

Returns daily files from Open:FactSet Partner - Luxembourg

Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg.


### Example

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.LuxembourgApi;

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

        LuxembourgApi apiInstance = new LuxembourgApi(defaultClient);
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String isin = "XS2486610541"; // String | Specifies the ISIN of the record. 
        LocalDate preissuancePubDate = LocalDate.parse("2022-08-26"); // LocalDate | The pre-issuance date of the record. 
        String type = "type_example"; // String | Please input the value as **idMap** to get the symbology files    
        try {
            LuxResponse result = apiInstance.getLuxembourgGreenbondsDaily(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling LuxembourgApi#getLuxembourgGreenbondsDaily");
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
 **isin** | **String**| Specifies the ISIN of the record.  | [optional]
 **preissuancePubDate** | **LocalDate**| The pre-issuance date of the record.  | [optional]
 **type** | **String**| Please input the value as **idMap** to get the symbology files     | [optional]

### Return type

[**LuxResponse**](LuxResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for luxembourg files. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

