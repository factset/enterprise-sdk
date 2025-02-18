# TemplatesFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getTemplateList**](TemplatesFetchApi.md#getTemplateList) | **GET** /template-list | Retrieves the list of templates that are available



## getTemplateList

> java.util.List<TemplateInfo> getTemplateList()

Retrieves the list of templates that are available

A template is a predefined list of content to be compiled in a PDF. This end point works without any parameters and retrieves the list of templates available for the user. Templates need to defined/created in FactSet workstation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.BookBuilder.ApiClient;
import com.factset.sdk.BookBuilder.ApiException;
import com.factset.sdk.BookBuilder.Configuration;
import com.factset.sdk.BookBuilder.auth.*;
import com.factset.sdk.BookBuilder.models.*;
import com.factset.sdk.BookBuilder.api.TemplatesFetchApi;

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

        TemplatesFetchApi apiInstance = new TemplatesFetchApi(defaultClient);
        try {
            java.util.List<TemplateInfo> result = apiInstance.getTemplateList();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesFetchApi#getTemplateList");
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

[**java.util.List&lt;TemplateInfo&gt;**](TemplateInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains an array with template name, template ID, created date, template source and template type |  -  |
| **401** | Missing or invalid authentication |  -  |

