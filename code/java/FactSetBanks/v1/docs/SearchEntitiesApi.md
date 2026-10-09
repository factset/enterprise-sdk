# SearchEntitiesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSearchEntities**](SearchEntitiesApi.md#getSearchEntities) | **POST** /search-entities | Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name



## getSearchEntities

> SearchEntitiesResponse getSearchEntities(searchEntitiesRequest)

Returns subsidiary and private affiliate entities for a parent ticker, entity ID, or name

Finds the subsidiary or private affiliate entity IDs needed to query other Banks API endpoints from a given parent ticker, ultimate parent entity ID, or entity name. Several endpoints require an entity ID that differs from the parent's public ticker:

* `/financials`, `/branches`, and `/country-exposure` require bank entities from the parent company.
* `/ubpr`, `/ucc1`, and `/deposit-rates` require the **subsidiary** bank entity, not the holding company.
* `/ten-d` requires the **asset-backed trust** entity, not the subsidiary bank or holding company. For auto loan securitizations, the trust's ultimate parent may itself be a non-bank company (e.g., an auto manufacturer's finance arm like GM Financial, Toyota Financial, or Harley-Davidson Financial).
* `/aum/ria` requires the **private Registered Investment Adviser** entity.
* `/focus` requires the **private broker-dealer** entity.

Use `reportType` to select which of these destination endpoints you're resolving entities for; only entities eligible for that report type are returned, and the response's `reportType` field echoes back your selection. Pass the resulting `factsetEntityId` values into the `ids` field of the corresponding endpoint.

Not every bank has a holding company above it with its own ticker — for those, use `searchText` to look the entity up by (partial) name instead of `ids`. At least one of `ids` or `searchText` is required.

**Date filtering behavior:**
* **No dates entered**: Returns only currently active subsidiaries (those with no end date).
* **Dates entered**: Returns only subsidiaries active during the specified time period.
* **End date is null**: The end date defaults to today's date for filtering purposes.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetBanks.ApiClient;
import com.factset.sdk.FactSetBanks.ApiException;
import com.factset.sdk.FactSetBanks.Configuration;
import com.factset.sdk.FactSetBanks.auth.*;
import com.factset.sdk.FactSetBanks.models.*;
import com.factset.sdk.FactSetBanks.api.SearchEntitiesApi;

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

        SearchEntitiesApi apiInstance = new SearchEntitiesApi(defaultClient);
        SearchEntitiesRequest searchEntitiesRequest = new SearchEntitiesRequest(); // SearchEntitiesRequest | 
        try {
            SearchEntitiesResponse result = apiInstance.getSearchEntities(searchEntitiesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SearchEntitiesApi#getSearchEntities");
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
 **searchEntitiesRequest** | [**SearchEntitiesRequest**](SearchEntitiesRequest.md)|  |

### Return type

[**SearchEntitiesResponse**](SearchEntitiesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Search entity data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

