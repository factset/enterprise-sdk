# ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllReportDefinitions**](ReportApi.md#getAllReportDefinitions) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**getReportDefinitionByCode**](ReportApi.md#getReportDefinitionByCode) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition



## getAllReportDefinitions

> ReportDefinitionList getAllReportDefinitions(tenant, sort, paginationLimit, paginationOffset)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ReportApi;

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

        ReportApi apiInstance = new ReportApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add - to sort
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ReportDefinitionList result = apiInstance.getAllReportDefinitions(tenant, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#getAllReportDefinitions");
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
 **tenant** | **String**| The code of the tenancy |
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add - to sort | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

### Return type

[**ReportDefinitionList**](ReportDefinitionList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## getReportDefinitionByCode

> ReportDefinitionData getReportDefinitionByCode(tenant, reportDefinitionCode)

Gets a report definition

Gets a report defintion based on the code specified

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.models.*;
import com.factset.sdk.Vermilion.api.ReportApi;

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

        ReportApi apiInstance = new ReportApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String reportDefinitionCode = "RPCODE"; // String | The code of the report definition
        try {
            ReportDefinitionData result = apiInstance.getReportDefinitionByCode(tenant, reportDefinitionCode);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#getReportDefinitionByCode");
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
 **tenant** | **String**| The code of the tenancy |
 **reportDefinitionCode** | **String**| The code of the report definition |

### Return type

[**ReportDefinitionData**](ReportDefinitionData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report definition code was was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

