# ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1ReportInstancesGeneratePost**](ReportInstanceApi.md#v1ReportInstancesGeneratePost) | **POST** /v1/report-instances/generate | Generates a report
[**v1TenantReportInstancesGet**](ReportInstanceApi.md#v1TenantReportInstancesGet) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**v1TenantReportInstancesReportInstanceIdDelete**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdDelete) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**v1TenantReportInstancesReportInstanceIdGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**v1TenantReportInstancesReportInstanceIdLogsGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdLogsGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet**](ReportInstanceApi.md#v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file



## v1ReportInstancesGeneratePost

> ReportInstanceDataResponse v1ReportInstancesGeneratePost(inlineObject)

Generates a report

Generates a report using the specified ID and the JSON in the request body

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        InlineObject inlineObject = new InlineObject(); // InlineObject | 
        try {
            ReportInstanceDataResponse result = apiInstance.v1ReportInstancesGeneratePost(inlineObject);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1ReportInstancesGeneratePost");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**ReportInstanceDataResponse**](ReportInstanceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Report generation request succeeded and report generation is in progress |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **400** | The supplied report definition code was either missing or invalid, or the report definition was not found |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **401** | Unauthorised |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The report code could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## v1TenantReportInstancesGet

> ReportInstanceList v1TenantReportInstancesGet(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, paginationLimit, paginationOffset)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String reportDefinitionCode = "reportDefinitionCode_example"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code
        String entityCodes = "entityCodes_example"; // String | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG
        String entityKeys = "entityKeys_example"; // String | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb
        String sectionFilter = "sectionFilter_example"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the section filter
        String outputFormat = "outputFormat_example"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the output format
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ReportInstanceList result = apiInstance.v1TenantReportInstancesGet(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1TenantReportInstancesGet");
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
 **reportDefinitionCode** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the report definition code | [optional]
 **entityCodes** | **String**| A series of query parameters used to filter the report instances by entity code. E.g: entityCode&#x3D;DATE&amp;entityCode&#x3D;SYSTEM_LANG | [optional]
 **entityKeys** | **String**| A series of query parameters used to filter the report instances by entity keys. E.g: entityKey&#x3D;en-gb | [optional]
 **sectionFilter** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the section filter | [optional]
 **outputFormat** | **String**| Acts as a filter for the retrieval process. Filters the report instances that match the output format | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional]

### Return type

[**ReportInstanceList**](ReportInstanceList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## v1TenantReportInstancesReportInstanceIdDelete

> v1TenantReportInstancesReportInstanceIdDelete(tenant, reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String reportInstanceId = "reportInstanceId_example"; // String | The id of the report instance
        try {
            apiInstance.v1TenantReportInstancesReportInstanceIdDelete(tenant, reportInstanceId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1TenantReportInstancesReportInstanceIdDelete");
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
 **reportInstanceId** | **String**| The id of the report instance |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful operation - no response |  -  |
| **400** | The supplied report instance id was either missing or invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## v1TenantReportInstancesReportInstanceIdGet

> v1TenantReportInstancesReportInstanceIdGet(reportInstanceId, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String reportInstanceId = "reportInstanceId_example"; // String | The ID of the report instance
        String tenant = "tenant_example"; // String | The code of the tenancy
        try {
            apiInstance.v1TenantReportInstancesReportInstanceIdGet(reportInstanceId, tenant);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1TenantReportInstancesReportInstanceIdGet");
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
 **reportInstanceId** | **String**| The ID of the report instance |
 **tenant** | **String**| The code of the tenancy |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Report generation has completed and the report is ready to download |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **202** | Expected response returned if the report generation is not yet completed. |  -  |
| **400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## v1TenantReportInstancesReportInstanceIdLogsGet

> ReportInstanceLogList v1TenantReportInstancesReportInstanceIdLogsGet(tenant, reportInstanceId, fullLog, sort, paginationLimit, paginationOffset)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String reportInstanceId = "reportInstanceId_example"; // String | Used to validate that report file name belongs to the report instance passed
        String fullLog = "fullLog_example"; // String | Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog=true
        String sort = "_sort=sequenceNumber"; // String | The column to sort on. Can add - to sort
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ReportInstanceLogList result = apiInstance.v1TenantReportInstancesReportInstanceIdLogsGet(tenant, reportInstanceId, fullLog, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1TenantReportInstancesReportInstanceIdLogsGet");
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
 **reportInstanceId** | **String**| Used to validate that report file name belongs to the report instance passed |
 **fullLog** | **String**| Determines if the endpoint should return a full set of logs or just the errors and warnings E.g: fullLog&#x3D;true | [optional]
 **sort** | **String**| The column to sort on. Can add - to sort | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional]

### Return type

[**ReportInstanceLogList**](ReportInstanceLogList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet

> v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(tenant, reportInstanceId, reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the genration is finished. The report instance id and the report file name are passed in as path paramters

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String reportInstanceId = "reportInstanceId_example"; // String | Used to validate that report file name belongs to the report instance passed
        String reportFileName = "reportFileName_example"; // String | The report file name that has to be retrieved. report file name. E.g: xyz.pdf
        try {
            apiInstance.v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet(tenant, reportInstanceId, reportFileName);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#v1TenantReportInstancesReportInstanceIdResultsReportFileNameGet");
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
 **reportInstanceId** | **String**| Used to validate that report file name belongs to the report instance passed |
 **reportFileName** | **String**| The report file name that has to be retrieved. report file name. E.g: xyz.pdf |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view the generated file in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

