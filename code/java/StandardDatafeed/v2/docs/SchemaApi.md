# SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getListSchemaswithoutwithooutRequiredParameters**](SchemaApi.md#getListSchemaswithoutwithooutRequiredParameters) | **GET** /list-schemas | List of Standard DataFeed (SDF) schemas.
[**getSchemaDetails**](SchemaApi.md#getSchemaDetails) | **GET** /schema-details | Schema Details.



## getListSchemaswithoutwithooutRequiredParameters

> ListSchema getListSchemaswithoutwithooutRequiredParameters()

List of Standard DataFeed (SDF) schemas.

This helper endpoint provides the list of schemas subscribed by the client and their corresponding versions.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.auth.*;
import com.factset.sdk.StandardDatafeed.models.*;
import com.factset.sdk.StandardDatafeed.api.SchemaApi;

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

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        try {
            ListSchema result = apiInstance.getListSchemaswithoutwithooutRequiredParameters();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#getListSchemaswithoutwithooutRequiredParameters");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**ListSchema**](ListSchema.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
| **429** | Quantity Limits Exceeded |  -  |
| **500** | Internal Server Error |  -  |


## getSchemaDetails

> SchemaDetail getSchemaDetails(schema, version)

Schema Details.

If the schema and version number are passed in the request, this endpoint provides a pre-signed URL pointing to the location from where the schema details can be downloaded.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StandardDatafeed.ApiClient;
import com.factset.sdk.StandardDatafeed.ApiException;
import com.factset.sdk.StandardDatafeed.Configuration;
import com.factset.sdk.StandardDatafeed.auth.*;
import com.factset.sdk.StandardDatafeed.models.*;
import com.factset.sdk.StandardDatafeed.api.SchemaApi;

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

        SchemaApi apiInstance = new SchemaApi(defaultClient);
        String schema = "fgp_v1"; // String | Name of the schema.
        Integer version = 5; // Integer | Version number of the schema.
        try {
            SchemaDetail result = apiInstance.getSchemaDetails(schema, version);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#getSchemaDetails");
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
 **schema** | **String**| Name of the schema. |
 **version** | **Integer**| Version number of the schema. |

### Return type

[**SchemaDetail**](SchemaDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint but is not authorized to access it. The request was legal, but the server is refusing to respond. Please reach out to the FactSet Account Team for assistance with authorization.  |  -  |
| **429** | Quantity Limits Exceeded |  -  |
| **500** | Internal Server Error |  -  |

