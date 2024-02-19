# FundHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHoldings**](FundHoldingsApi.md#getOwnershipHoldings) | **GET** /factset-ownership/v1/fund-holdings | Get underlying holdings information for a requested fund identifer.
[**postOwnershipHoldings**](FundHoldingsApi.md#postOwnershipHoldings) | **POST** /factset-ownership/v1/fund-holdings | Get holdings for a list of funds.



## getOwnershipHoldings

> FundHoldingsResponse getOwnershipHoldings(ids, date, topn, assetType, currency)

Get underlying holdings information for a requested fund identifer.

Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.FundHoldingsApi;

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

        FundHoldingsApi apiInstance = new FundHoldingsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>
        String date = "2019-12-31"; // String | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close.
        String topn = "ALL"; // String | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number.
        String assetType = "ALL"; // String | Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL 
        String currency = "USD"; // String | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470).
        try {
            FundHoldingsResponse result = apiInstance.getOwnershipHoldings(ids, date, topn, assetType, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundHoldingsApi#getOwnershipHoldings");
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
 **ids** | **List&lt;String&gt;**| List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; |
 **date** | **String**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional]
 **topn** | **String**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] [default to ALL]
 **assetType** | **String**| Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  | [optional] [default to EQ] [enum: ALL, EQ, FI]
 **currency** | **String**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Holdings Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postOwnershipHoldings

> FundHoldingsResponse postOwnershipHoldings(fundHoldingsRequest)

Get holdings for a list of funds.

Gets Holding information for a long list of Fund objects.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.FundHoldingsApi;

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

        FundHoldingsApi apiInstance = new FundHoldingsApi(defaultClient);
        FundHoldingsRequest fundHoldingsRequest = new FundHoldingsRequest(); // FundHoldingsRequest | Requesting Underlying Holdings for a list of Fund Identifiers.
        try {
            FundHoldingsResponse result = apiInstance.postOwnershipHoldings(fundHoldingsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FundHoldingsApi#postOwnershipHoldings");
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
 **fundHoldingsRequest** | [**FundHoldingsRequest**](FundHoldingsRequest.md)| Requesting Underlying Holdings for a list of Fund Identifiers. |

### Return type

[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Holdings Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

