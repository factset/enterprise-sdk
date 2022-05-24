# DatasourceApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TenantDataSourcesDataSourceCodeDataGet**](DatasourceApi.md#v1TenantDataSourcesDataSourceCodeDataGet) | **GET** /v1/{tenant}/data-sources/{dataSourceCode}/data | Gets the data for the datasource
[**v1TenantDataSourcesDataSourceCodeGet**](DatasourceApi.md#v1TenantDataSourcesDataSourceCodeGet) | **GET** /v1/{tenant}/data-sources/{dataSourceCode} | Gets a datasource
[**v1TenantDataSourcesGet**](DatasourceApi.md#v1TenantDataSourcesGet) | **GET** /v1/{tenant}/data-sources | Lists all datasources



## v1TenantDataSourcesDataSourceCodeDataGet

> java.util.List&lt;DataSourceDataInstance&gt; v1TenantDataSourcesDataSourceCodeDataGet(tenant, dataSourceCode, entityCodes, entityKeys)

Gets the data for the datasource

Gets the data for the datasource. There are optional query parameters to filter the da

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String dataSourceCode = "dataSourceCode_example"; // String | The code of the datasource
        String entityCodes = "entityCodes_example"; // String | A series of query parameter used to filter the data for a datasource. This represents the entities for the datasource. E.g.: entityCodes=ACCOUNT&entityCodes=FUNDS
        String entityKeys = "entityKeys_example"; // String | A series of query parameter used to filter the data for a datasource. This is the entity key value for an entity selection. E.g.: entityKeys=1&entityKeys=Test2
        try {
            java.util.List<DataSourceDataInstance> result = apiInstance.v1TenantDataSourcesDataSourceCodeDataGet(tenant, dataSourceCode, entityCodes, entityKeys);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#v1TenantDataSourcesDataSourceCodeDataGet");
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

### Return type

[**java.util.List&lt;DataSourceDataInstance&gt;**](DataSourceDataInstance.md)

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


## v1TenantDataSourcesDataSourceCodeGet

> DataSourceData v1TenantDataSourcesDataSourceCodeGet(tenant, dataSourceCode)

Gets a datasource

Gets a datasource based on the code passed

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String dataSourceCode = "dataSourceCode_example"; // String | The code of the datasource
        try {
            DataSourceData result = apiInstance.v1TenantDataSourcesDataSourceCodeGet(tenant, dataSourceCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#v1TenantDataSourcesDataSourceCodeGet");
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


## v1TenantDataSourcesGet

> DataSourceList v1TenantDataSourcesGet(tenant, sort, paginationLimit, paginationOffset)

Lists all datasources

List all datasources the user has permission to see

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.DatasourceApi;

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

        DatasourceApi apiInstance = new DatasourceApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String sort = "_sort=name"; // String | The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        try {
            DataSourceList result = apiInstance.v1TenantDataSourcesGet(tenant, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DatasourceApi#v1TenantDataSourcesGet");
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
 **sort** | **String**| The column to sort on. Append - to sort in descending order. If parameter is not given, no sorting will be done | [optional]
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

