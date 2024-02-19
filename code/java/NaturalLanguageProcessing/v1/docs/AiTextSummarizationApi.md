# AiTextSummarizationApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**summarizationHeadline**](AiTextSummarizationApi.md#summarizationHeadline) | **POST** /summarization/headline | Endpoint to generate a headline from text
[**summarizationHeadlineAndSummary**](AiTextSummarizationApi.md#summarizationHeadlineAndSummary) | **POST** /summarization/headline-and-summary | Endpoint to summarize and generate a headline from text
[**summarizationResult**](AiTextSummarizationApi.md#summarizationResult) | **GET** /summarization/result/{resultId} | Endpoint to obtain result of a particular summarization job
[**summarizationSummary**](AiTextSummarizationApi.md#summarizationSummary) | **POST** /summarization/summary | Endpoint to summarize text



## summarizationHeadline

> SummarizationResultID summarizationHeadline(summarizationRequest)

Endpoint to generate a headline from text

Generate a headline-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

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

        AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);
        SummarizationRequest summarizationRequest = new SummarizationRequest(); // SummarizationRequest | 
        try {
            SummarizationResultID result = apiInstance.summarizationHeadline(summarizationRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiTextSummarizationApi#summarizationHeadline");
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |


## summarizationHeadlineAndSummary

> SummarizationResultID summarizationHeadlineAndSummary(summarizationRequest)

Endpoint to summarize and generate a headline from text

Generate both a paragraph-length, and headline-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

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

        AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);
        SummarizationRequest summarizationRequest = new SummarizationRequest(); // SummarizationRequest | 
        try {
            SummarizationResultID result = apiInstance.summarizationHeadlineAndSummary(summarizationRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiTextSummarizationApi#summarizationHeadlineAndSummary");
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |


## summarizationResult

> SummarizationResult summarizationResult(resultId)

Endpoint to obtain result of a particular summarization job

Retrieve the summarization result from a job started with the other summarization endpoints

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

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

        AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);
        String resultId = "resultId_example"; // String | 
        try {
            SummarizationResult result = apiInstance.summarizationResult(resultId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiTextSummarizationApi#summarizationResult");
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
 **resultId** | **String**|  |

### Return type

[**SummarizationResult**](SummarizationResult.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **404** | Not found |  -  |
| **500** | Internal Server Error |  -  |


## summarizationSummary

> SummarizationResultID summarizationSummary(summarizationRequest)

Endpoint to summarize text

Generate a paragraph-length summary of plain text

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.NaturalLanguageProcessing.ApiClient;
import com.factset.sdk.NaturalLanguageProcessing.ApiException;
import com.factset.sdk.NaturalLanguageProcessing.Configuration;
import com.factset.sdk.NaturalLanguageProcessing.auth.*;
import com.factset.sdk.NaturalLanguageProcessing.models.*;
import com.factset.sdk.NaturalLanguageProcessing.api.AiTextSummarizationApi;

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

        AiTextSummarizationApi apiInstance = new AiTextSummarizationApi(defaultClient);
        SummarizationRequest summarizationRequest = new SummarizationRequest(); // SummarizationRequest | 
        try {
            SummarizationResultID result = apiInstance.summarizationSummary(summarizationRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiTextSummarizationApi#summarizationSummary");
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
 **summarizationRequest** | [**SummarizationRequest**](SummarizationRequest.md)|  | [optional]

### Return type

[**SummarizationResultID**](SummarizationResultID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Unique Result ID |  -  |
| **400** | Bad Request |  -  |
| **401** | Access Denied |  -  |
| **500** | Internal Server Error |  -  |

