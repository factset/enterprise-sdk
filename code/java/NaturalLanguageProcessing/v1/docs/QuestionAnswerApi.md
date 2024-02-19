# QuestionAnswerApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**qnaGetAnswers**](QuestionAnswerApi.md#qnaGetAnswers) | **GET** /qna/answers/{id} | Endpoint to get the answer(s)
[**qnaGetStatus**](QuestionAnswerApi.md#qnaGetStatus) | **GET** /qna/answers/{id}/status | Endpoint to get the completion status for a Q&amp;A request
[**qnaPostQuestion**](QuestionAnswerApi.md#qnaPostQuestion) | **POST** /qna/answers | Endpoint to submit a question for answer(s)



## qnaGetAnswers

> QnaGetAnswersResponseWrapper qnaGetAnswers(id)

Endpoint to get the answer(s)

Endpoint to obtain the results from the original Q&A task request. The `id` parameter represents the identifier from the task and comes from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

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
import com.factset.sdk.NaturalLanguageProcessing.api.QuestionAnswerApi;
import com.factset.sdk.NaturalLanguageProcessing.api.QuestionAnswerApi.QnaGetAnswersResponseWrapper;

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

        QuestionAnswerApi apiInstance = new QuestionAnswerApi(defaultClient);
        String id = "id_example"; // String | Identifier from the Question & Answer task and comes from the POST request which created the task
        try {
            QnaGetAnswersResponseWrapper result = apiInstance.qnaGetAnswers(id);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // QnAAnswerRoot
            
                case 202:
                    System.out.println(result.getResponse202()); // TaskRoot
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionAnswerApi#qnaGetAnswers");
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
 **id** | **String**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task |

### Return type

QnaGetAnswersResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |


## qnaGetStatus

> TaskRoot qnaGetStatus(id)

Endpoint to get the completion status for a Q&amp;A request

Endpoint to obtain the status of the Q&A task request. The `id` parameter represents the identifier of the task created and comes from the POST request which created the task.

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
import com.factset.sdk.NaturalLanguageProcessing.api.QuestionAnswerApi;

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

        QuestionAnswerApi apiInstance = new QuestionAnswerApi(defaultClient);
        String id = "id_example"; // String | Identifier from the Question & Answer task and comes from the POST request which created the task
        try {
            TaskRoot result = apiInstance.qnaGetStatus(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionAnswerApi#qnaGetStatus");
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
 **id** | **String**| Identifier from the Question &amp; Answer task and comes from the POST request which created the task |

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **404** | The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |


## qnaPostQuestion

> TaskRoot qnaPostQuestion(qnAAnswerParametersRoot)

Endpoint to submit a question for answer(s)

Endpoint to create a task submission by providing plain text and question(s). The underlying model will answer the question. The created task needs to be polled to obtain the results. Please check the schema(s) for each of the status codes for more details about the task.

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
import com.factset.sdk.NaturalLanguageProcessing.api.QuestionAnswerApi;

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

        QuestionAnswerApi apiInstance = new QuestionAnswerApi(defaultClient);
        QnAAnswerParametersRoot qnAAnswerParametersRoot = new QnAAnswerParametersRoot(); // QnAAnswerParametersRoot | 
        try {
            TaskRoot result = apiInstance.qnaPostQuestion(qnAAnswerParametersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling QuestionAnswerApi#qnaPostQuestion");
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
 **qnAAnswerParametersRoot** | [**QnAAnswerParametersRoot**](QnAAnswerParametersRoot.md)|  |

### Return type

[**TaskRoot**](TaskRoot.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - The &#x60;Location&#x60; response header indicates the URL to redirect a page to. <br>  |
| **400** | The browser (or proxy) sent a request that this server could not understand. |  -  |
| **401** | The server could not verify that you are authorized to access the URL requested. You either supplied the wrong credentials (e.g. a bad password), or your browser doesn&#39;t understand how to supply the credentials required. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

