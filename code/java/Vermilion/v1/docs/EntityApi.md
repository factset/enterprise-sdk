# EntityApi

All URIs are relative to *http://localhost*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityValuesByCode**](EntityApi.md#getEntityValuesByCode) | **GET** /v1/{tenant}/entities/{entityCode}/values | Gets the entity values



## getEntityValuesByCode

> EntityFieldValueDTO getEntityValuesByCode(tenant, entityCode, sort, paginationLimit, paginationOffset, showAll)

Gets the entity values

Gets the entity values for the specified entity

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
import com.factset.sdk.Vermilion.api.EntityApi;

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

        EntityApi apiInstance = new EntityApi(defaultClient);
        String tenant = "TENANT"; // String | The code of the tenancy
        String entityCode = "ENTCODE"; // String | The code of the entity
        java.util.List<String> sort = Arrays.asList(); // java.util.List<String> | The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \"-\" to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default
        Integer paginationLimit = 25; // Integer | Non-negative maximum number of entries to return. Default is 25
        Integer paginationOffset = 0; // Integer | Non-negative number of entries to skip. Default is 0
        Integer showAll = 0; // Integer | Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \"fieldsWithValues\", with each array value being a string in the format of \"**<FIELD_NAME> : <FIELD_VALUE>**\". Both key and description field values will be included in this JSON array too.
        try {
            EntityFieldValueDTO result = apiInstance.getEntityValuesByCode(tenant, entityCode, sort, paginationLimit, paginationOffset, showAll);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityApi#getEntityValuesByCode");
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
 **sort** | **List&lt;String&gt;**| The entity field to sort on. Can only be sorted on entity key, description or secondary key fields. Append \&quot;-\&quot; to sort in descending order. If no parameter given, it will be sorted by key field in ascending order by default | [optional]
 **paginationLimit** | **Integer**| Non-negative maximum number of entries to return. Default is 25 | [optional] [default to 25]
 **paginationOffset** | **Integer**| Non-negative number of entries to skip. Default is 0 | [optional] [default to 0]
 **showAll** | **Integer**| Whether to show all field values for each entity row. Value should either be 1 or 0. Default is 0 (false). Otherwise, show all field values in a JSON array named \&quot;fieldsWithValues\&quot;, with each array value being a string in the format of \&quot;**&lt;FIELD_NAME&gt; : &lt;FIELD_VALUE&gt;**\&quot;. Both key and description field values will be included in this JSON array too. | [optional] [default to 0]

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

