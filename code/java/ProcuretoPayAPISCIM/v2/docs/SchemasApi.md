# SchemasApi

All URIs are relative to *https://api.factset.com/scim/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSchema**](SchemasApi.md#getSchema) | **GET** /Schemas/{id} | Get a schema.
[**getSchemas**](SchemasApi.md#getSchemas) | **GET** /Schemas | Get a list of schemas.



## getSchema

> Schema getSchema(id)

Get a schema.

Get a specific schema. See RFC 7643 section 7.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.SchemasApi;

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

        SchemasApi apiInstance = new SchemasApi(defaultClient);
        String id = "id_example"; // String | ID of resource.
        try {
            Schema result = apiInstance.getSchema(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#getSchema");
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
 **id** | **String**| ID of resource. |

### Return type

[**Schema**](Schema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **404** | Schema not found. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |


## getSchemas

> SchemaList getSchemas(startIndex, count)

Get a list of schemas.

Get a list of supported resource schemas. See RFC 7644 section 4.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ProcuretoPayAPISCIM.ApiClient;
import com.factset.sdk.ProcuretoPayAPISCIM.ApiException;
import com.factset.sdk.ProcuretoPayAPISCIM.Configuration;
import com.factset.sdk.ProcuretoPayAPISCIM.auth.*;
import com.factset.sdk.ProcuretoPayAPISCIM.models.*;
import com.factset.sdk.ProcuretoPayAPISCIM.api.SchemasApi;

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

        SchemasApi apiInstance = new SchemasApi(defaultClient);
        Integer startIndex = 56; // Integer | Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument.
        Integer count = 56; // Integer | Maximum resource count. The server will not return more resources than this value, although it may return fewer.
        try {
            SchemaList result = apiInstance.getSchemas(startIndex, count);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemasApi#getSchemas");
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
 **startIndex** | **Integer**| Result start index. The one-based index of the first result to be returned in the list of resources. For example, to exclude the first two resources, use a *startIndex* value of 3. This parameter has a default value of 1. This index applies *after* any resource filtration has been applied as specified by the *filter* argument. | [optional]
 **count** | **Integer**| Maximum resource count. The server will not return more resources than this value, although it may return fewer. | [optional]

### Return type

[**SchemaList**](SchemaList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/scim+json, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | User has not been authenticated. |  -  |
| **403** | User is not authorized to use this API. |  -  |
| **429** | User is accessing this API too frequently. |  -  |
| **500** | Internal server error. |  -  |

