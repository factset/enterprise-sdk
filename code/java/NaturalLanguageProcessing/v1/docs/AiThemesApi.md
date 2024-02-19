# AiThemesApi

All URIs are relative to *https://api.factset.com/cognitive/nlp/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**themesExtractThemes**](AiThemesApi.md#themesExtractThemes) | **POST** /themes | Endpoint to begin theme extraction job
[**themesGetStatus**](AiThemesApi.md#themesGetStatus) | **GET** /themes/{id}/status | Endpoint to get the completion status of a themes job
[**themesGetThemes**](AiThemesApi.md#themesGetThemes) | **GET** /themes/{id} | Endpoint to get a theme (and sentiments if requested) job result



## themesExtractThemes

> TaskRoot themesExtractThemes(themesParametersRoot)

Endpoint to begin theme extraction job

Endpoint to extract themes from provided text. Optionally, can include sentiment for each theme extracted. Please check the schema(s) for each of the status codes for more details.

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
import com.factset.sdk.NaturalLanguageProcessing.api.AiThemesApi;

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

        AiThemesApi apiInstance = new AiThemesApi(defaultClient);
        ThemesParametersRoot themesParametersRoot = new ThemesParametersRoot(); // ThemesParametersRoot | 
        try {
            TaskRoot result = apiInstance.themesExtractThemes(themesParametersRoot);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiThemesApi#themesExtractThemes");
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
 **themesParametersRoot** | [**ThemesParametersRoot**](ThemesParametersRoot.md)|  |

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


## themesGetStatus

> TaskRoot themesGetStatus(id)

Endpoint to get the completion status of a themes job

Endpoint to obtain the completion status of the themes task request. The `id` parameter represents the task.

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
import com.factset.sdk.NaturalLanguageProcessing.api.AiThemesApi;

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

        AiThemesApi apiInstance = new AiThemesApi(defaultClient);
        String id = "id_example"; // String | Long running task identifier
        try {
            TaskRoot result = apiInstance.themesGetStatus(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiThemesApi#themesGetStatus");
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
 **id** | **String**| Long running task identifier |

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
| **404** | description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |


## themesGetThemes

> ThemeSentimentsRoot themesGetThemes(id)

Endpoint to get a theme (and sentiments if requested) job result

Endpoint to obtain the results from the original themes task request. The `id` parameter represents the identifier of the task generated from the POST request which created the task. Once the task is complete, the result can be fetched with this endpoint.

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
import com.factset.sdk.NaturalLanguageProcessing.api.AiThemesApi;

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

        AiThemesApi apiInstance = new AiThemesApi(defaultClient);
        String id = "id_example"; // String | Long running task identifier
        try {
            ThemeSentimentsRoot result = apiInstance.themesGetThemes(id);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling AiThemesApi#themesGetThemes");
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
 **id** | **String**| Long running task identifier |

### Return type

[**ThemeSentimentsRoot**](ThemeSentimentsRoot.md)

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
| **404** | description: The requested URL was not found on the server. If you entered the URL manually please check your spelling and try again. |  -  |
| **500** | The server encountered an internal error and was unable to complete your request. Either the server is overloaded or there is an error in the application. |  -  |

