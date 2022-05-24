# EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**v1TenantEntitiesEntityCodeValuesGet**](EntityApi.md#v1TenantEntitiesEntityCodeValuesGet) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



## v1TenantEntitiesEntityCodeValuesGet

> EntityFieldValueDTO v1TenantEntitiesEntityCodeValuesGet(tenant, entityCode, sort, paginationLimit, paginationOffset)

Gets the entity values

Gets the entity values for the specified entity

### Example

```java
// Import classes:
import com.factset.sdk.Vermilion.ApiClient;
import com.factset.sdk.Vermilion.ApiException;
import com.factset.sdk.Vermilion.Configuration;
import com.factset.sdk.Vermilion.auth.*;
import com.factset.sdk.Vermilion.model.*;
import com.factset.sdk.Vermilion.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        String tenant = "tenant_example"; // String | The code of the tenancy
        String entityCode = "entityCode_example"; // String | The code of the entity
        String sort = "_sort=entity key field"; // String | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        try {
            EntityFieldValueDTO result = apiInstance.v1TenantEntitiesEntityCodeValuesGet(tenant, entityCode, sort, paginationLimit, paginationOffset);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#v1TenantEntitiesEntityCodeValuesGet");
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
 **entityCode** | **String**| The code of the entity |
 **sort** | **String**| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return. Default is 25 | [optional]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip. Default is 0 | [optional]

### Return type

[**EntityFieldValueDTO**](EntityFieldValueDTO.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | The supplied entity code was either missing or invalid, or the entity was not found |  -  |
| **401** | Unauthorised |  -  |
| **403** | No permissions to view datasources in VRS |  -  |
| **404** | The supplied entity code was not found |  -  |
| **406** | Unsupported Accept header. Header needs to be set to application/json. |  -  |

