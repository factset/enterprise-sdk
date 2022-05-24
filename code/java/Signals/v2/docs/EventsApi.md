# EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEventAdaptiveCardById**](EventsApi.md#getEventAdaptiveCardById) | **GET** /events/adaptive-cards/{eventId} | 
[**getEventAdaptiveCards**](EventsApi.md#getEventAdaptiveCards) | **GET** /events/adaptive-cards | 
[**getEventDetailById**](EventsApi.md#getEventDetailById) | **GET** /events/details/{eventId} | 
[**getEventDetails**](EventsApi.md#getEventDetails) | **GET** /events/details | 
[**getEventEntities**](EventsApi.md#getEventEntities) | **GET** /events/entities | 
[**getEventHeadlines**](EventsApi.md#getEventHeadlines) | **GET** /events/headlines | 
[**postEventDetails**](EventsApi.md#postEventDetails) | **POST** /events/details | 
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
| **500** | Internal Server Error |  -  |


## getEventAdaptiveCards

> EventAdaptiveCards getEventAdaptiveCards(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria

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
        DateTimeInterval created = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
        DateTimeInterval updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
        String signalIds = "dilutionTrigger,freeCashFlow"; // String | 
        String ids = "FDS-US,AMZN-US"; // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
        String portfolios = "portfolios_example"; // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
        String themes = "themes_example"; // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
        String categories = "categories_example"; // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
        RelevanceScoreRange userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
        String sort = "-userRelevanceScore,-eventDate"; // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
        try {
            EventAdaptiveCards result = apiInstance.getEventAdaptiveCards(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventAdaptiveCards");
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signalIds** | **String**|  | [optional]
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventAdaptiveCards**](EventAdaptiveCards.md)

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
| **500** | Internal Server Error |  -  |


## getEventDetails

> EventDetails getEventDetails(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort)



Fetch Signals event headlines plus all additional event details based on the filtering criteria

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
        DateTimeInterval created = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
        DateTimeInterval updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
        String signalIds = "dilutionTrigger,freeCashFlow"; // String | 
        String ids = "FDS-US,AMZN-US"; // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
        String portfolios = "portfolios_example"; // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
        String themes = "themes_example"; // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
        String categories = "categories_example"; // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
        RelevanceScoreRange userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
        String sort = "-userRelevanceScore,-eventDate"; // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
        try {
            EventDetails result = apiInstance.getEventDetails(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventDetails");
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signalIds** | **String**|  | [optional]
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventDetails**](EventDetails.md)

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
| **500** | Internal Server Error |  -  |


## getEventEntities

> EventsEntities getEventEntities(created, updated, signalIds, themes, categories, userRelevanceScore)



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
        DateTimeInterval created = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
        DateTimeInterval updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
        String signalIds = "dilutionTrigger,freeCashFlow"; // String | 
        String themes = "themes_example"; // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
        String categories = "categories_example"; // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
        RelevanceScoreRange userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
        try {
            EventsEntities result = apiInstance.getEventEntities(created, updated, signalIds, themes, categories, userRelevanceScore);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventEntities");
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signalIds** | **String**|  | [optional]
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional]

### Return type

[**EventsEntities**](EventsEntities.md)

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
| **500** | Internal Server Error |  -  |


## getEventHeadlines

> EventHeadlines getEventHeadlines(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort)



Fetch Signals event headlines based on the filtering criteria

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
        DateTimeInterval created = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted.
        DateTimeInterval updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted.
        String signalIds = "dilutionTrigger,freeCashFlow"; // String | 
        String ids = "FDS-US,AMZN-US"; // String | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used.
        String portfolios = "portfolios_example"; // String | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb
        String themes = "themes_example"; // String | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes.
        String categories = "categories_example"; // String | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories.
        RelevanceScoreRange userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score.
        String sort = "-userRelevanceScore,-eventDate"; // String | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order).
        try {
            EventHeadlines result = apiInstance.getEventHeadlines(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsApi#getEventHeadlines");
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional]
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional]
 **signalIds** | **String**|  | [optional]
 **ids** | **String**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional]
 **portfolios** | **String**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional]
 **themes** | **String**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional]
 **categories** | **String**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional]
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional]
 **sort** | **String**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional]

### Return type

[**EventHeadlines**](EventHeadlines.md)

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
| **500** | Internal Server Error |  -  |


## postEventDetails

> EventDetails postEventDetails(eventRequestBody)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers

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


## postEventHeadlines

> EventHeadlines postEventHeadlines(eventRequestBody)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers

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

