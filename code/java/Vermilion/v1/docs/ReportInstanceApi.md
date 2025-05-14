# ReportInstanceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelReportGeneration**](ReportInstanceApi.md#cancelReportGeneration) | **DELETE** /v1/{tenant}/report-instances/{reportInstanceId} | Cancels a report generation
[**downloadReportFile**](ReportInstanceApi.md#downloadReportFile) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/results/{reportFileName} | Gets the generated file
[**getAllReportInstances**](ReportInstanceApi.md#getAllReportInstances) | **GET** /v1/{tenant}/report-instances | Gets a list of report instances
[**getReportGenerationLogs**](ReportInstanceApi.md#getReportGenerationLogs) | **GET** /v1/{tenant}/report-instances/{reportInstanceId}/logs | Gets a list of logs for the report instance generation
[**getReportInstanceById**](ReportInstanceApi.md#getReportInstanceById) | **GET** /v1/{tenant}/report-instances/{reportInstanceId} | Gets a report instance based on the ID
[**startReportGeneration**](ReportInstanceApi.md#startReportGeneration) | **POST** /v1/report-instances/generate | Generates a report



## cancelReportGeneration

> cancelReportGeneration(tenant, reportInstanceId)

Cancels a report generation

Sends a request to cancel a report generation based on the report instance id passed

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String reportInstanceId = "123456"; // String | The id of the report instance
        try {
            apiInstance.cancelReportGeneration(tenant, reportInstanceId);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#cancelReportGeneration");
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
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## downloadReportFile

> File downloadReportFile(tenant, reportInstanceId, reportFileName)

Gets the generated file

Get the generated file for a report instance. Users can fetch the generated report once the generation is finished. The report instance id and the report file name are passed in as path paramters. The following mapping defines the respective Content-Type for the outputFormat defined during report generation.
| outputFormat | Content-Type |
| ---------------- | ------------|
|WORD     | application/msword |
|WORD2010 |   application/vnd.openxmlformats-officedocument.wordprocessingml.document|
|EXCEL    |   application/vnd.ms-excel|
|EXCEL2010|   application/vnd.openxmlformats-officedocument.spreadsheetml.sheet|
|PPT      |   application/vnd.ms-powerpoint|
|PPT2010  |   application/vnd.openxmlformats-officedocument.presentationml.presentation|
|PDF      |   application/pdf|
|CSV      |   text/csv|
|XML      |   application/xml|
|VXML     |   application/xml|
|HTML     |   text/html|
|PS       |   application/postscript|

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String reportInstanceId = "123456"; // String | Used to validate that report file name belongs to the report instance passed
        String reportFileName = "xyz.pdf"; // String | The report file name that has to be retrieved. report file name. E.g: xyz.pdf
        try {
            File result = apiInstance.downloadReportFile(tenant, reportInstanceId, reportFileName);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#downloadReportFile");
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

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.wordprocessingml.document, application/msword, application/postscript, text/csv, text/html, application/xml, application/zip, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied report instance id was either missing or invalid or the report instance was not found. The supplied report file name was either invalid or not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view the generated file in VRS |  -  |
| **406** | Unsupported Accept header. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## getAllReportInstances

> ReportInstanceList getAllReportInstances(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, sort, paginationLimit, paginationOffset)

Gets a list of report instances

Gets a list of report instances. This can be filtered down further by including query parameters in the URL. For example, a report definition id can be added so the only report instances returned are the ones with a matching id

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String reportDefinitionCode = "RPCODE"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the report definition code
        String entityCodes = "SYSTEM_LANG"; // String | A series of query parameters used to filter the report instances by entity code. E.g: entityCode=DATE&entityCode=SYSTEM_LANG
        String entityKeys = "en-gb"; // String | A series of query parameters used to filter the report instances by entity keys. E.g: entityKey=en-gb
        String sectionFilter = "testFilter"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the section filter
        String outputFormat = "pdf"; // String | Acts as a filter for the retrieval process. Filters the report instances that match the output format
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ReportInstanceList result = apiInstance.getAllReportInstances(tenant, reportDefinitionCode, entityCodes, entityKeys, sectionFilter, outputFormat, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#getAllReportInstances");
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
 **sort** | **List&lt;String&gt;**| The column to sort on. Append - to sort in descending order. If parameter is not given, sorting will be based on the report instance id in descending order | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## getReportGenerationLogs

> ReportInstanceLogList getReportGenerationLogs(tenant, reportInstanceId, errorsOnly, sort, paginationLimit, paginationOffset)

Gets a list of logs for the report instance generation

Gets a list of logs for the generated report instance. Allows the user to sort on log message, type and date. Also allows for retrieving of just the errors & warnings'

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String reportInstanceId = "123456"; // String | Used to validate that report file name belongs to the report instance passed
        String errorsOnly = "true"; // String | If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly=true
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Can add - to sort
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip
        try {
            ReportInstanceLogList result = apiInstance.getReportGenerationLogs(tenant, reportInstanceId, errorsOnly, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#getReportGenerationLogs");
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
 **errorsOnly** | **String**| If the parameter is set to true the endpoint should return just errors and warnings E.g: errorsOnly&#x3D;true | [optional]
 **sort** | **List&lt;String&gt;**| The column to sort on. Can add - to sort | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip | [optional] [default to 0]

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
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## getReportInstanceById

> ReportInstanceData getReportInstanceById(reportInstanceId, tenant)

Gets a report instance based on the ID

Gets a report instance object based on the ID passed

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        String reportInstanceId = "123456"; // String | The ID of the report instance
        String tenant = "TENANT"; // String | The code of the tenancy
        try {
            ReportInstanceData result = apiInstance.getReportInstanceById(reportInstanceId, tenant);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#getReportInstanceById");
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

[**ReportInstanceData**](ReportInstanceData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  * Location - A callback URL to the updated group, for example https://example.com/VRSAPI/scim/v2/Groups/1 <br>  |
| **400** | The supplied report instance id was either missing or invalid, or the report instance was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view reports in VRS |  -  |
| **404** | The supplied report instance ID could not be found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |


## startReportGeneration

> ReportInstanceDataResponse startReportGeneration(reportGenerationRequestBody)

Generates a report

Generates a report using the specified ID and the JSON in the request body

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
import com.factset.sdk.Vermilion.api.ReportInstanceApi;

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

        ReportInstanceApi apiInstance = new ReportInstanceApi(defaultClient);
        ReportGenerationRequestBody reportGenerationRequestBody = new ReportGenerationRequestBody(); // ReportGenerationRequestBody | 
        try {
            ReportInstanceDataResponse result = apiInstance.startReportGeneration(reportGenerationRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReportInstanceApi#startReportGeneration");
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
 **reportGenerationRequestBody** | [**ReportGenerationRequestBody**](ReportGenerationRequestBody.md)|  |

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
| **500** | The server have encountered an unhandled error due to which request was not fulfilled. |  -  |

