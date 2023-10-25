# OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHolders**](OwnershipApi.md#getOwnershipHolders) | **GET** /holders | Holders of a company or fund



## getOwnershipHolders

> Response getOwnershipHolders(id, assetType, holderType, topn, date)

Holders of a company or fund

Holders of a company or fund

### Example

```java
// Import classes:
import com.factset.sdk.FactSetOwnershipReportBuilder.ApiClient;
import com.factset.sdk.FactSetOwnershipReportBuilder.ApiException;
import com.factset.sdk.FactSetOwnershipReportBuilder.Configuration;
import com.factset.sdk.FactSetOwnershipReportBuilder.auth.*;
import com.factset.sdk.FactSetOwnershipReportBuilder.models.*;
import com.factset.sdk.FactSetOwnershipReportBuilder.api.OwnershipApi;

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

        OwnershipApi apiInstance = new OwnershipApi(defaultClient);
        String id = "FDS"; // String | Company or Fund Identifier
        String assetType = "EQUITY"; // String | Controls the Asset Type of the data returned
        String holderType = "ALL_HOLDERS"; // String | Controls the Holder Type of the data returned
        String topn = "ALL"; // String | Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0. 
        String date = "2019-12-31"; // String | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
        try {
            Response result = apiInstance.getOwnershipHolders(id, assetType, holderType, topn, date);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OwnershipApi#getOwnershipHolders");
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
 **id** | **String**| Company or Fund Identifier |
 **assetType** | **String**| Controls the Asset Type of the data returned | [optional] [default to EQUITY] [enum: EQUITY, DEBT]
 **holderType** | **String**| Controls the Holder Type of the data returned | [optional] [default to INSTITUTIONS] [enum: ALL_HOLDERS, BENEFICIAL_OWNERS, FUNDS, INSTITUTIONS, INSTITUTIONS_INSIDERS, INSIDERS_STAKEHOLDERS]
 **topn** | **String**| Limits the number of holders returned based on their Market Value position in the security.   Default is ALL, otherwise use a valid number above 0.  | [optional]
 **date** | **String**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional]

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

