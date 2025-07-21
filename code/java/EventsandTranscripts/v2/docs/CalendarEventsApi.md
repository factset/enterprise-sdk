# CalendarEventsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyEvent**](CalendarEventsApi.md#getCompanyEvent) | **POST** /calendar/events | Retrieve Company Event data



## getCompanyEvent

> CompanyEventResponse getCompanyEvent(companyEventRequest)

Retrieve Company Event data

This endpoint returns all company events with filters from the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.EventsandTranscripts.ApiClient;
import com.factset.sdk.EventsandTranscripts.ApiException;
import com.factset.sdk.EventsandTranscripts.Configuration;
import com.factset.sdk.EventsandTranscripts.auth.*;
import com.factset.sdk.EventsandTranscripts.models.*;
import com.factset.sdk.EventsandTranscripts.api.CalendarEventsApi;

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

        CalendarEventsApi apiInstance = new CalendarEventsApi(defaultClient);
        CompanyEventRequest companyEventRequest = new CompanyEventRequest(); // CompanyEventRequest | Company Events request body
        try {
            CompanyEventResponse result = apiInstance.getCompanyEvent(companyEventRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CalendarEventsApi#getCompanyEvent");
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
 **companyEventRequest** | [**CompanyEventRequest**](CompanyEventRequest.md)| Company Events request body |

### Return type

[**CompanyEventResponse**](CompanyEventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The company events based on provided filters from the request. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

