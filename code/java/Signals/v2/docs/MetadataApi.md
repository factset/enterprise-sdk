# MetadataApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategories**](MetadataApi.md#getCategories) | **GET** /categories | 
[**getDataDictionary**](MetadataApi.md#getDataDictionary) | **GET** /data-dictionary | 
[**getDataDictionaryById**](MetadataApi.md#getDataDictionaryById) | **GET** /data-dictionary/{signalId} | 
[**getThemes**](MetadataApi.md#getThemes) | **GET** /themes | 



## getCategories

> SignalMetaData getCategories()



Fetch a list of available signal categories

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.MetadataApi;

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

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        try {
            SignalMetaData result = apiInstance.getCategories();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#getCategories");
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

[**SignalMetaData**](SignalMetaData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## getDataDictionary

> SignalMetaData getDataDictionary()



Fetch a list of all active signals

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.MetadataApi;

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

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        try {
            SignalMetaData result = apiInstance.getDataDictionary();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#getDataDictionary");
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

[**SignalMetaData**](SignalMetaData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## getDataDictionaryById

> SignalDefinition getDataDictionaryById(signalId)



Fetch the metadata and contract for the requested signal

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.MetadataApi;

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

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        String signalId = "dilutionTrigger"; // String | 
        try {
            SignalDefinition result = apiInstance.getDataDictionaryById(signalId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#getDataDictionaryById");
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
 **signalId** | **String**|  |

### Return type

[**SignalDefinition**](SignalDefinition.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not found |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## getThemes

> SignalMetaData getThemes()



Fetch a list of available signal themes

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.MetadataApi;

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

        MetadataApi apiInstance = new MetadataApi(defaultClient);
        try {
            SignalMetaData result = apiInstance.getThemes();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MetadataApi#getThemes");
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

[**SignalMetaData**](SignalMetaData.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |

