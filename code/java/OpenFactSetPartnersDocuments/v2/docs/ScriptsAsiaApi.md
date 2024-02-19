# ScriptsAsiaApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getScriptsAsiaFiles**](ScriptsAsiaApi.md#getScriptsAsiaFiles) | **GET** /scripts-asia/transcripts | Returns the daily files from Open:FactSet Partner - Scripts Asia.



## getScriptsAsiaFiles

> ScriptsAsiaResponse getScriptsAsiaFiles(sort, paginationLimit, paginationOffset, trackingId, saId, startDate, endDate, companyName, eventType, languageType, fileName, type)

Returns the daily files from Open:FactSet Partner - Scripts Asia.

Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia.
- type=delta returns the files from March 1st 2023 to current date.
- type=full will returns the files from start of date until Feb 28th 2023.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiClient;
import com.factset.sdk.OpenFactSetPartnersDocuments.ApiException;
import com.factset.sdk.OpenFactSetPartnersDocuments.Configuration;
import com.factset.sdk.OpenFactSetPartnersDocuments.auth.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.models.*;
import com.factset.sdk.OpenFactSetPartnersDocuments.api.ScriptsAsiaApi;

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

        ScriptsAsiaApi apiInstance = new ScriptsAsiaApi(defaultClient);
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used.
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per result.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records.
        String trackingId = "431eb8d0-cc45-11ed-8609-0f67251fe7a4"; // String | Unique Scripts Asia identifier assigned to an event. 
        String saId = "SA002220_2023Mar27_a_02"; // String | This parameter filters the results based on saId of the Transcript. 
        LocalDate startDate = LocalDate.parse("2023-03-20"); // LocalDate | The earliest date of the Scripts Asia file the API should return based on date. 
        LocalDate endDate = LocalDate.parse("2023-03-28"); // LocalDate | The latest date of the Scripts Asia file the API should return based on date.          
        String companyName = "Beijing Shunxin Agriculture Co Ltd"; // String | This parameter filters the results based on Company Name of the Transcript. 
        String eventType = "01"; // String | This parameter filters the results based on eventType of the Transcript.  * 01 = Shareholders Meeting * 02 = Earnings Announcement * 03 = Medium-term Management Plan Announcement * 04 = Analyst Meeting * 05 = Special Announcement * 06 = Investor Conference 
        String languageType = "eng"; // String | This parameter filters the results based on language type(either English or local) of the Transcript. 
        String fileName = "SA002220_2023Mar27_a_02_fds_xml_local.xml"; // String | This parameter is used to filters the results based on file name.
        String type = "full"; // String | Specifies the type of the file.
        try {
            ScriptsAsiaResponse result = apiInstance.getScriptsAsiaFiles(sort, paginationLimit, paginationOffset, trackingId, saId, startDate, endDate, companyName, eventType, languageType, fileName, type);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ScriptsAsiaApi#getScriptsAsiaFiles");
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
 **trackingId** | **String**| Unique Scripts Asia identifier assigned to an event.  | [optional]
 **saId** | **String**| This parameter filters the results based on saId of the Transcript.  | [optional]
 **startDate** | **LocalDate**| The earliest date of the Scripts Asia file the API should return based on date.  | [optional]
 **endDate** | **LocalDate**| The latest date of the Scripts Asia file the API should return based on date.           | [optional]
 **companyName** | **String**| This parameter filters the results based on Company Name of the Transcript.  | [optional]
 **eventType** | **String**| This parameter filters the results based on eventType of the Transcript.  * 01 &#x3D; Shareholders Meeting * 02 &#x3D; Earnings Announcement * 03 &#x3D; Medium-term Management Plan Announcement * 04 &#x3D; Analyst Meeting * 05 &#x3D; Special Announcement * 06 &#x3D; Investor Conference  | [optional] [enum: 01, 02, 03, 04, 05, 06]
 **languageType** | **String**| This parameter filters the results based on language type(either English or local) of the Transcript.  | [optional] [default to local] [enum: eng, local]
 **fileName** | **String**| This parameter is used to filters the results based on file name. | [optional]
 **type** | **String**| Specifies the type of the file. | [optional] [default to delta] [enum: full, delta]

### Return type

[**ScriptsAsiaResponse**](ScriptsAsiaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Scripts Asia files. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

