# BranchesApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBranches**](BranchesApi.md#getBranches) | **POST** /branches | Returns bank branch and location data



## getBranches

> BranchesResponse getBranches(branchesRequest)

Returns bank branch and location data

Returns branch and location data for banks and financial institutions. Use the `coverage` field to specify the data source:

* **US** — FDIC-insured bank branches with branch counts and deposit market share by county, ZIP, and MSA. 85,000+ current branches across 9,000+ banks and BHCs. Sourced from the FDIC Summary of Deposits (annual) and Institutions and Locations (weekly). Current-only feed; deposit balances as of the most recent June 30.
* **CREDIT_UNION** — US credit union branches and ATMs with service flags. 5,800+ credit unions, 21,000+ branches, and 17,000+ ATM addresses; reported quarterly since September 2022.
* **AUSTRALIA** — Service channel locations with remoteness classifications. 149+ banks; 30,000+ branches, 47,000+ ATMs, 6,600+ other face-to-face, and 4.9M+ EFTPOS channels. Annual data as of June 30.
* **GLOBAL** — Global bank branches and ATMs ex-US with country, region, city, lat/long, postal, and street details where available. 300,000+ banks, 800,000+ locations, 180+ countries. Current-only feed.


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
import com.factset.sdk.FactSetBanks.api.BranchesApi;

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

        BranchesApi apiInstance = new BranchesApi(defaultClient);
        BranchesRequest branchesRequest = new BranchesRequest(); // BranchesRequest | 
        try {
            BranchesResponse result = apiInstance.getBranches(branchesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling BranchesApi#getBranches");
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
 **branchesRequest** | [**BranchesRequest**](BranchesRequest.md)|  |

### Return type

[**BranchesResponse**](BranchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Branch and location data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

