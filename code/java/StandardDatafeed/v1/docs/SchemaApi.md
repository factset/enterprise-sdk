# SchemaApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getV1ListSchemas**](SchemaApi.md#getV1ListSchemas) | **GET** /v1/list-schemas | schemas



## getV1ListSchemas

> ListSchema200Response getV1ListSchemas(schema, sequence)

schemas

<a href=https://api.factset.com/bulk-documents/sdf/v1/list-schemas>List-Schemas</a> helper end point provides the list of schemas subscribed by the client

This API provides a downloadable file for the schema & sequence number (version number of schema) specified

### Example

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
        String schema = "schema_example"; // String | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1**
        Integer sequence = 56; // Integer | Enter the sequence number associated with a schema</p> Provides a pre-signed url to download the respective schema file</p> \"**Example: \"8\" from acta_v1: [8],**
        try {
            ListSchema200Response result = apiInstance.getV1ListSchemas(schema, sequence);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SchemaApi#getV1ListSchemas");
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
 **schema** | **String**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional]
 **sequence** | **Integer**| Enter the sequence number associated with a schema&lt;/p&gt; Provides a pre-signed url to download the respective schema file&lt;/p&gt; \&quot;**Example: \&quot;8\&quot; from acta_v1: [8],** | [optional]

### Return type

[**ListSchema200Response**](ListSchema200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

