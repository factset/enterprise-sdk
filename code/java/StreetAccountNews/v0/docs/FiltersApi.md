# FiltersApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStreetAccountFilters**](FiltersApi.md#getStreetAccountFilters) | **GET** /streetaccount/filters | Retrieve all StreetAccount filters



## getStreetAccountFilters

> FilterResponse getStreetAccountFilters(structured, flattened)

Retrieve all StreetAccount filters

Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.FiltersApi;

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

        FiltersApi apiInstance = new FiltersApi(defaultClient);
        Boolean structured = true; // Boolean | Pass structured to generate a structured view of the available filters.
        Boolean flattened = true; // Boolean | Pass flattened to generate a structured view of the available filters.
        try {
            FilterResponse result = apiInstance.getStreetAccountFilters(structured, flattened);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FiltersApi#getStreetAccountFilters");
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
 **structured** | **Boolean**| Pass structured to generate a structured view of the available filters. | [optional]
 **flattened** | **Boolean**| Pass flattened to generate a structured view of the available filters. | [optional]

### Return type

[**FilterResponse**](FilterResponse.md)

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
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

