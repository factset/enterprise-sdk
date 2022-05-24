# SchemasBundlesApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListFiles**](SchemasBundlesApi.md#getV1ListFiles) | **GET** /v1/list-files | 



## getV1ListFiles

> ListFiles200Response getV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort)



<a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order for all the schemas & bundles subscribed by the client


### Example

```java
// Import classes:
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.auth.*;
import com.factset.sdk.StandardDatafeed.models.*;
import com.factset.sdk.StandardDatafeed.api.SchemasBundlesApi;

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

        SchemasBundlesApi apiInstance = new SchemasBundlesApi(defaultClient);
        String schema = "schema_example"; // String | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1**
        String bundle = "bundle_example"; // String | bundle name</p> Default is all the bundles client is subscribed to</p> **Do not use \"schema\" parameter** when searching for a specific bundle
        String type = "full"; // String | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**
        String startDate = "startDate_example"; // String | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p> Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**</p>**Date format -  YYYY-MM-DD**
        String endDate = "endDate_example"; // String | The latest date of the feed file the API should fetch for based on the fileTimestamp</p>**Date format -  YYYY-MM-DD**
        Integer paginationLimit = 20; // Integer | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
        try {
            ListFiles200Response result = apiInstance.getV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasBundlesApi#getV1ListFiles");
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
 **schema** | **String**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional]
 **bundle** | **String**| bundle name&lt;/p&gt; Default is all the bundles client is subscribed to&lt;/p&gt; **Do not use \&quot;schema\&quot; parameter** when searching for a specific bundle | [optional]
 **type** | **String**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional] [enum: full, delta]
 **startDate** | **String**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt; Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional]
 **endDate** | **String**| The latest date of the feed file the API should fetch for based on the fileTimestamp&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]
 **sort** | **String**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] [enum: startDate]

### Return type

[**ListFiles200Response**](ListFiles200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

