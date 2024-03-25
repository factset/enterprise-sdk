# SdfAndQflContentLibraryApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListFiles**](SdfAndQflContentLibraryApi.md#getV1ListFiles) | **GET** /list-files | 



## getV1ListFiles

> ListFiles200Response getV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort)



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
        String schema = "schema_example"; // String | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1** 
        String bundle = "bundle_example"; // String | bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups
        String type = "full"; // String | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**
        String startDate = "startDate_example"; // String | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday
        String endDate = "endDate_example"; // String | The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today
        Integer paginationLimit = 20; // Integer | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        String sort = "startDate"; // String | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used
        try {
            ListFiles200Response result = apiInstance.getV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SdfAndQflContentLibraryApi#getV1ListFiles");
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
 **schema** | **String**| schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  | [optional]
 **bundle** | **String**| bundle name&lt;/p&gt; If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families &amp; factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups | [optional]
 **type** | **String**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional] [enum: full, delta]
 **startDate** | **String**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt;     - If the schema parameter is specified in the request, date range can be greater than 10 days maximum upto latest 30 days. - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday | [optional]
 **endDate** | **String**| The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today | [optional]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]
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

