# CompanyApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyEvent**](CompanyApi.md#getCompanyEvent) | **POST** /calendar/events | Retrieve Company Event data



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
import com.factset.sdk.EventCalendar.ApiClient;
import com.factset.sdk.EventCalendar.ApiException;
import com.factset.sdk.EventCalendar.Configuration;
import com.factset.sdk.EventCalendar.auth.*;
import com.factset.sdk.EventCalendar.models.*;
import com.factset.sdk.EventCalendar.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        CompanyEventRequest companyEventRequest = new CompanyEventRequest(); // CompanyEventRequest | Company Event request body
        try {
            CompanyEventResponse result = apiInstance.getCompanyEvent(companyEventRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyEvent");
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
 **companyEventRequest** | [**CompanyEventRequest**](CompanyEventRequest.md)| Company Event request body |

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
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

