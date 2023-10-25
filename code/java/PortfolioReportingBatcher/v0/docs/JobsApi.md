# JobsApi

All URIs are relative to *https://api.factset.com/analytics/prb/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailsForJob**](JobsApi.md#getDetailsForJob) | **GET** /jobs/{type}/{name} | Get details for the given PRB job



## getDetailsForJob

> JobDetailsResponse getDetailsForJob(type, name, attribute)

Get details for the given PRB job

Use this endpoint to fetch the documents, tasks, accounts, and/or runs for the PRB job given in the path. Please note jobs with type PD will not return tasks nor accounts so this will be ignored if given as part of the array of attributes in the request.

### Example

```java
// Import classes:
import com.factset.sdk.PortfolioReportingBatcher.ApiClient;
import com.factset.sdk.PortfolioReportingBatcher.ApiException;
import com.factset.sdk.PortfolioReportingBatcher.Configuration;
import com.factset.sdk.PortfolioReportingBatcher.auth.*;
import com.factset.sdk.PortfolioReportingBatcher.models.*;
import com.factset.sdk.PortfolioReportingBatcher.api.JobsApi;

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

        JobsApi apiInstance = new JobsApi(defaultClient);
        JobTypes type = JobTypes.fromValue("ADF"); // JobTypes | The jobs type
        String name = "name_example"; // String | The jobs name
        java.util.List<String> attribute = Arrays.asList(); // java.util.List<String> | The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job.
        try {
            JobDetailsResponse result = apiInstance.getDetailsForJob(type, name, attribute);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling JobsApi#getDetailsForJob");
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
 **type** | **JobTypes**| The jobs type | [enum: ADF, PA, PD, PI, PUB, vault]
 **name** | **String**| The jobs name |
 **attribute** | **List&lt;String&gt;**| The attribute parameter accepts a list of the given enums, separated by commas. Each of them returns the respective data associated with the job. Runs returns the run history of the job. | [optional] [enum: documents, tasks, accounts, runs]

### Return type

[**JobDetailsResponse**](JobDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **400** | Invalid post body parameters. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **404** | Not Found - invalid inputs |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-FactSet-Api-RateLimit-Limit -  <br>  * X-FactSet-Api-RateLimit-Remaining -  <br>  * X-FactSet-Api-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has reached. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  |

