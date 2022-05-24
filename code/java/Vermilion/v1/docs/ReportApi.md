# ReportApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TenantReportsGet**](ReportApi.md#v1TenantReportsGet) | **GET** /v1/{tenant}/reports | Gets all report definitions
[**v1TenantReportsReportDefinitionCodeGet**](ReportApi.md#v1TenantReportsReportDefinitionCodeGet) | **GET** /v1/{tenant}/reports/{reportDefinitionCode} | Gets a report definition



## v1TenantReportsGet

> java.util.List&lt;ReportDefinitionList&gt; v1TenantReportsGet(tenant, sort, paginationLimit, paginationOffset)

Gets all report definitions

Gets all report definitions the user has permissions for

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportApi;

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
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ReportApi apiInstance = new ReportApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String sort = "_sort=name"; // String | The column to sort on. Can add - to sort
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            java.util.List<ReportDefinitionList> result = apiInstance.v1TenantReportsGet(tenant, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#v1TenantReportsGet");
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
 **sort** | **String**| The column to sort on. Can add - to sort | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional]

### Return type

[**java.util.List&lt;ReportDefinitionList&gt;**](ReportDefinitionList.md)

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


## v1TenantReportsReportDefinitionCodeGet

> ReportDefinitionData v1TenantReportsReportDefinitionCodeGet(tenant, reportDefinitionCode)

Gets a report definition

Gets a report defintion based on the code specified

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportApi;

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
        ApiClient defaultClient = new ApiClient()
          .setFactSetOAuth2Client(confidentialClient);

        /* Basic authentication: FactSetApiKey */
        // See https://github.com/FactSet/enterprise-sdk#api-key
        // ApiClient defaultClient = new ApiClient()
        //   .setUsername("YOUR USERNAME")
        //   .setPassword("YOUR PASSWORD");

        ReportApi apiInstance = new ReportApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String reportDefinitionCode = "reportDefinitionCode_example"; // String | The code of the report definition
        try {
            ReportDefinitionData result = apiInstance.v1TenantReportsReportDefinitionCodeGet(tenant, reportDefinitionCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportApi#v1TenantReportsReportDefinitionCodeGet");
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

