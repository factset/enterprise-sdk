# EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventAdaptiveCardById**](EventsApi.md#getEventAdaptiveCardById) | **GET** /events/adaptive-cards/{eventId} | 
[**getEventDetailById**](EventsApi.md#getEventDetailById) | **GET** /events/details/{eventId} | 
[**postEventAdaptiveCards**](EventsApi.md#postEventAdaptiveCards) | **POST** /events/adaptive-cards | 
[**postEventDetails**](EventsApi.md#postEventDetails) | **POST** /events/details | 
[**postEventEntities**](EventsApi.md#postEventEntities) | **POST** /events/entities | 
[**postEventHeadlines**](EventsApi.md#postEventHeadlines) | **POST** /events/headlines | 



## getEventAdaptiveCardById

> EventAdaptiveCard getEventAdaptiveCardById(eventId)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        java.util.UUID eventId = new java.util.UUID(); // java.util.UUID | The UUID of the event to return.
        try {
            EventAdaptiveCard result = apiInstance.getEventAdaptiveCardById(eventId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventAdaptiveCardById");
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
 **eventId** | **java.util.UUID**| The UUID of the event to return. |

### Return type

[**EventAdaptiveCard**](EventAdaptiveCard.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## getEventDetailById

> EventDetail getEventDetailById(eventId)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        java.util.UUID eventId = new java.util.UUID(); // java.util.UUID | The UUID of the event to return.
        try {
            EventDetail result = apiInstance.getEventDetailById(eventId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventDetailById");
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
 **eventId** | **java.util.UUID**| The UUID of the event to return. |

### Return type

[**EventDetail**](EventDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## postEventAdaptiveCards

> EventAdaptiveCards postEventAdaptiveCards(eventRequestBody)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on at least one of the following filtering parameters: `ids`, `portfolios`

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventRequestBody eventRequestBody = new EventRequestBody(); // EventRequestBody | 
        try {
            EventAdaptiveCards result = apiInstance.postEventAdaptiveCards(eventRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEventAdaptiveCards");
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  |

### Return type

[**EventAdaptiveCards**](EventAdaptiveCards.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## postEventDetails

> EventDetails postEventDetails(eventRequestBody)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers and at least one of the following filtering parameters: `ids`, `portfolios`

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventRequestBody eventRequestBody = new EventRequestBody(); // EventRequestBody | 
        try {
            EventDetails result = apiInstance.postEventDetails(eventRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEventDetails");
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  |

### Return type

[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |


## postEventEntities

> EventsEntities postEventEntities(eventsEntitiesPost)



Fetch FactSet entity IDs for events that match the filtering criteria

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventsEntitiesPost eventsEntitiesPost = new EventsEntitiesPost(); // EventsEntitiesPost | 
        try {
            EventsEntities result = apiInstance.postEventEntities(eventsEntitiesPost);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEventEntities");
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
 **eventsEntitiesPost** | [**EventsEntitiesPost**](EventsEntitiesPost.md)|  |

### Return type

[**EventsEntities**](EventsEntities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |


## postEventHeadlines

> EventHeadlines postEventHeadlines(eventRequestBody)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers and at least one of the following filtering parameters: `ids`, `portfolios`

### Example

```java
// Import classes:
import com.factset.sdk.Signals.ApiClient;
import com.factset.sdk.Signals.ApiException;
import com.factset.sdk.Signals.Configuration;
import com.factset.sdk.Signals.auth.*;
import com.factset.sdk.Signals.models.*;
import com.factset.sdk.Signals.api.EventsApi;

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

        EventsApi apiInstance = new EventsApi(defaultClient);
        EventRequestBody eventRequestBody = new EventRequestBody(); // EventRequestBody | 
        try {
            EventHeadlines result = apiInstance.postEventHeadlines(eventRequestBody);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#postEventHeadlines");
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  |

### Return type

[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

