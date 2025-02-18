# TemplatesCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createTemplate**](TemplatesCreationApi.md#createTemplate) | **POST** /create-template | Kick off request to create template with reports of your choice



## createTemplate

> EnableTemplateInfoPost createTemplate(createTemplatePostRequest)

Kick off request to create template with reports of your choice

This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

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
import com.factset.sdk.BookBuilder.api.TemplatesCreationApi;

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

        TemplatesCreationApi apiInstance = new TemplatesCreationApi(defaultClient);
        CreateTemplatePostRequest createTemplatePostRequest = new CreateTemplatePostRequest(); // CreateTemplatePostRequest | 
        try {
            EnableTemplateInfoPost result = apiInstance.createTemplate(createTemplatePostRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling TemplatesCreationApi#createTemplate");
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
 **createTemplatePostRequest** | [**CreateTemplatePostRequest**](CreateTemplatePostRequest.md)|  |

### Return type

[**EnableTemplateInfoPost**](EnableTemplateInfoPost.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response contains book name and book ID |  -  |
| **400** | Invalid template type/section_id/report_id |  -  |
| **401** | Missing or invalid authentication |  -  |

