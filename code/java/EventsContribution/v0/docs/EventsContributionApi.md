# EventsContributionApi

All URIs are relative to *https://api.factset.com/events-contribution/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteEvent**](EventsContributionApi.md#deleteEvent) | **DELETE** /events/{eventId} | Delete Event data
[**getEvent**](EventsContributionApi.md#getEvent) | **GET** /events/{eventId} | Get Event Data
[**insertEvent**](EventsContributionApi.md#insertEvent) | **POST** /events | Insert Event data
[**updateEvent**](EventsContributionApi.md#updateEvent) | **PUT** /events/{eventId} | Update Event data



## deleteEvent

> DeleteResponse deleteEvent(eventId)

Delete Event data

This endpoint allows you to delete a previously inserted event with the corresponding event id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsContribution.ApiClient;
import com.factset.sdk.EventsContribution.ApiException;
import com.factset.sdk.EventsContribution.Configuration;
import com.factset.sdk.EventsContribution.auth.*;
import com.factset.sdk.EventsContribution.models.*;
import com.factset.sdk.EventsContribution.api.EventsContributionApi;

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

        EventsContributionApi apiInstance = new EventsContributionApi(defaultClient);
        String eventId = "1234"; // String | ID of event to be deleted. This ID is vendor generated and should be unique in each vendor's content set.
        try {
            DeleteResponse result = apiInstance.deleteEvent(eventId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsContributionApi#deleteEvent");
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
 **eventId** | **String**| ID of event to be deleted. This ID is vendor generated and should be unique in each vendor&#39;s content set. |

### Return type

[**DeleteResponse**](DeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## getEvent

> GetResponse getEvent(eventId)

Get Event Data

This endpoint retrieves previously submitted events by event ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsContribution.ApiClient;
import com.factset.sdk.EventsContribution.ApiException;
import com.factset.sdk.EventsContribution.Configuration;
import com.factset.sdk.EventsContribution.auth.*;
import com.factset.sdk.EventsContribution.models.*;
import com.factset.sdk.EventsContribution.api.EventsContributionApi;

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

        EventsContributionApi apiInstance = new EventsContributionApi(defaultClient);
        String eventId = "eventId_example"; // String | ID for event retrieval. This ID is vendor generated and should be unique in each vendor's content set.
        try {
            GetResponse result = apiInstance.getEvent(eventId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsContributionApi#getEvent");
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
 **eventId** | **String**| ID for event retrieval. This ID is vendor generated and should be unique in each vendor&#39;s content set. |

### Return type

[**GetResponse**](GetResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request. Invalid Parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## insertEvent

> InsertResponse insertEvent(insertRequest)

Insert Event data

This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsContribution.ApiClient;
import com.factset.sdk.EventsContribution.ApiException;
import com.factset.sdk.EventsContribution.Configuration;
import com.factset.sdk.EventsContribution.auth.*;
import com.factset.sdk.EventsContribution.models.*;
import com.factset.sdk.EventsContribution.api.EventsContributionApi;

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

        EventsContributionApi apiInstance = new EventsContributionApi(defaultClient);
        InsertRequest insertRequest = new InsertRequest(); // InsertRequest | INSERT request body which needs to be sent with request
        try {
            InsertResponse result = apiInstance.insertEvent(insertRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsContributionApi#insertEvent");
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
 **insertRequest** | [**InsertRequest**](InsertRequest.md)| INSERT request body which needs to be sent with request |

### Return type

[**InsertResponse**](InsertResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |


## updateEvent

> UpdateResponse updateEvent(eventId, updateRequest)

Update Event data

This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsContribution.ApiClient;
import com.factset.sdk.EventsContribution.ApiException;
import com.factset.sdk.EventsContribution.Configuration;
import com.factset.sdk.EventsContribution.auth.*;
import com.factset.sdk.EventsContribution.models.*;
import com.factset.sdk.EventsContribution.api.EventsContributionApi;

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

        EventsContributionApi apiInstance = new EventsContributionApi(defaultClient);
        String eventId = "1234"; // String | ID of event to be updated. This ID is vendor generated and should be unique in each vendor's content set.
        UpdateRequest updateRequest = new UpdateRequest(); // UpdateRequest | UPDATE request body which needs to be sent with request
        try {
            UpdateResponse result = apiInstance.updateEvent(eventId, updateRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EventsContributionApi#updateEvent");
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
 **eventId** | **String**| ID of event to be updated. This ID is vendor generated and should be unique in each vendor&#39;s content set. |
 **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| UPDATE request body which needs to be sent with request |

### Return type

[**UpdateResponse**](UpdateResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

