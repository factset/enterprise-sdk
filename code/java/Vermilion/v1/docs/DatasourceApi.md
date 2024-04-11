# DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAllDataSources**](DatasourceApi.md#getAllDataSources) | **GET** /v1/{tenant}/data-sources | Lists all datasources
[**getDataSourceByCode**](DatasourceApi.md#getDataSourceByCode) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**getDataSourceData**](DatasourceApi.md#getDataSourceData) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource



## getAllDataSources

> DataSourceList getAllDataSources(tenant, sort, paginationLimit, paginationOffset)

Lists all datasources

List all datasources the user has permission to see

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
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "XXXXXXXXXX"; // String | The code of the tenancy
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        try {
            DataSourceList result = apiInstance.getAllDataSources(tenant, sort, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#getAllDataSources");
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
 **sort** | **List&lt;String&gt;**| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return. Default is 25 | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip. Default is 0 | [optional]

### Return type

[**DataSourceList**](DataSourceList.md)

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
| **403** | No permissions to view datasources in VRS |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## getDataSourceByCode

> DataSourceData getDataSourceByCode(tenant, dataSourceCode)

Gets a datasource

Gets a datasource based on the code passed

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
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "XXXXXXXXXX"; // String | The code of the tenancy
        String dataSourceCode = "XXXXXXXXXX"; // String | The code of the datasource
        try {
            DataSourceData result = apiInstance.getDataSourceByCode(tenant, dataSourceCode);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#getDataSourceByCode");
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
 **dataSourceCode** | **String**| The code of the datasource |

### Return type

[**DataSourceData**](DataSourceData.md)

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
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied datasource code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |


## getDataSourceData

> DataSourceDataInstance getDataSourceData(tenant, dataSourceCode, entityCodes, entityKeys, paginationLimit, paginationOffset)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the data

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
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "XXXXXXXXXX"; // String | The code of the tenancy
        String dataSourceCode = "XXXXXXXXXX"; // String | The code of the datasource
        String entityCodes = "FUNDS"; // String | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT&entityCodes=FUNDS
        String entityKeys = "Test2"; // String | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1&entityKeys=Test2
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        try {
            DataSourceDataInstance result = apiInstance.getDataSourceData(tenant, dataSourceCode, entityCodes, entityKeys, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#getDataSourceData");
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
 **dataSourceCode** | **String**| The code of the datasource |
 **entityCodes** | **String**| A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes&#x3D;ACCOUNT&amp;entityCodes&#x3D;FUNDS | [optional]
 **entityKeys** | **String**| A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys&#x3D;1&amp;entityKeys&#x3D;Test2 | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return. Default is 25 | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip. Default is 0 | [optional]

### Return type

[**DataSourceDataInstance**](DataSourceDataInstance.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation - returns data for the datasource |  -  |
| **400** | The supplied datasource code was either missing or invalid, or the query parameters are invalid |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied datasource code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

