# MappingsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInsightMapping**](MappingsApi.md#getInsightMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date} | Redirects to the underlying Insight/Vault data in a Stach format.
[**getPdfPptMapping**](MappingsApi.md#getPdfPptMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date} | Redirects to the raw PPT/PDF output created by the Publisher service.
[**getStachMapping**](MappingsApi.md#getStachMapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date} | Redirects to the underlying PA/SPAR data represented in a Stach format.
[**getStachMappingNoDate**](MappingsApi.md#getStachMappingNoDate) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId} | Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.



## getInsightMapping

> getInsightMapping(document, assetName, reportId, tileId, accountId, configId, date)

Redirects to the underlying Insight/Vault data in a Stach format.

The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.MappingsApi;

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

        MappingsApi apiInstance = new MappingsApi(defaultClient);
        String document = "Analytics_Datastore"; // String | The Analytics Datafeed document containing the report
        String assetName = "ADS_Demo.PA3"; // String | The PA/SPAR asset name and extension
        String reportId = "report7"; // String | The PA/SPAR report ID
        String tileId = "tile0"; // String | The PA/SPAR tile ID
        String accountId = "LARGE_CORE"; // String | The account ID
        String configId = "acb5150d-4333-49e7-8e33-4f7fa749691e"; // String | The Vault configuration ID
        LocalDate date = LocalDate.parse("2023-01-01"); // LocalDate | The as of date for the report
        try {
            apiInstance.getInsightMapping(document, assetName, reportId, tileId, accountId, configId, date);

        } catch (ApiException e) {
            System.err.println("Exception when calling MappingsApi#getInsightMapping");
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
 **document** | **String**| The Analytics Datafeed document containing the report |
 **assetName** | **String**| The PA/SPAR asset name and extension |
 **reportId** | **String**| The PA/SPAR report ID |
 **tileId** | **String**| The PA/SPAR tile ID |
 **accountId** | **String**| The account ID |
 **configId** | **String**| The Vault configuration ID |
 **date** | **LocalDate**| The as of date for the report |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |


## getPdfPptMapping

> getPdfPptMapping(document, accountId, date)

Redirects to the raw PPT/PDF output created by the Publisher service.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.MappingsApi;

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

        MappingsApi apiInstance = new MappingsApi(defaultClient);
        String document = "Analytics_Datastore"; // String | The Publisher document containing the report
        String accountId = "LARGE_CORE"; // String | The account ID
        LocalDate date = LocalDate.parse("2023-01-01"); // LocalDate | The as of date for the report
        try {
            apiInstance.getPdfPptMapping(document, accountId, date);

        } catch (ApiException e) {
            System.err.println("Exception when calling MappingsApi#getPdfPptMapping");
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
 **document** | **String**| The Publisher document containing the report |
 **accountId** | **String**| The account ID |
 **date** | **LocalDate**| The as of date for the report |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |


## getStachMapping

> getStachMapping(document, assetName, reportId, tileId, accountId, date)

Redirects to the underlying PA/SPAR data represented in a Stach format.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.MappingsApi;

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

        MappingsApi apiInstance = new MappingsApi(defaultClient);
        String document = "Analytics_Datastore"; // String | The Publisher or Analytics Datafeed document containing the report
        String assetName = "ADS_Demo.PA3"; // String | The PA/SPAR asset name and extension
        String reportId = "report7"; // String | The PA/SPAR report ID
        String tileId = "tile0"; // String | The PA/SPAR tile ID
        String accountId = "LARGE_CORE"; // String | The account ID
        LocalDate date = LocalDate.parse("2023-01-01"); // LocalDate | The as of date for the report
        try {
            apiInstance.getStachMapping(document, assetName, reportId, tileId, accountId, date);

        } catch (ApiException e) {
            System.err.println("Exception when calling MappingsApi#getStachMapping");
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
 **document** | **String**| The Publisher or Analytics Datafeed document containing the report |
 **assetName** | **String**| The PA/SPAR asset name and extension |
 **reportId** | **String**| The PA/SPAR report ID |
 **tileId** | **String**| The PA/SPAR tile ID |
 **accountId** | **String**| The account ID |
 **date** | **LocalDate**| The as of date for the report |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |


## getStachMappingNoDate

> getStachMappingNoDate(document, assetName, reportId, tileId, accountId)

Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.

Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.AnalyticsDatastore.ApiClient;
import com.factset.sdk.AnalyticsDatastore.ApiException;
import com.factset.sdk.AnalyticsDatastore.Configuration;
import com.factset.sdk.AnalyticsDatastore.auth.*;
import com.factset.sdk.AnalyticsDatastore.models.*;
import com.factset.sdk.AnalyticsDatastore.api.MappingsApi;

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

        MappingsApi apiInstance = new MappingsApi(defaultClient);
        String document = "Analytics_Datastore"; // String | The Publisher or Analytics Datafeed document containing the report
        String assetName = "ADS_Demo.PA3"; // String | The PA/SPAR asset name and extension
        String reportId = "report7"; // String | The PA/SPAR report ID
        String tileId = "tile0"; // String | The PA/SPAR tile ID
        String accountId = "LARGE_CORE"; // String | The account ID
        try {
            apiInstance.getStachMappingNoDate(document, assetName, reportId, tileId, accountId);

        } catch (ApiException e) {
            System.err.println("Exception when calling MappingsApi#getStachMappingNoDate");
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
 **document** | **String**| The Publisher or Analytics Datafeed document containing the report |
 **assetName** | **String**| The PA/SPAR asset name and extension |
 **reportId** | **String**| The PA/SPAR report ID |
 **tileId** | **String**| The PA/SPAR tile ID |
 **accountId** | **String**| The account ID |

### Return type

null (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

