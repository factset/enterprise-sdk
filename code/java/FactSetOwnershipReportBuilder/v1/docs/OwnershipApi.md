# OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipHolders**](OwnershipApi.md#getOwnershipHolders) | **GET** /holders | Holders of a company or fund
[**getOwnershipUltimateParent**](OwnershipApi.md#getOwnershipUltimateParent) | **GET** /ultimate-parent | Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.



## getOwnershipHolders

> ResponseHolders getOwnershipHolders(id, assetType, holderType, entityType, topn, date)

Holders of a company or fund

Holders of a company or fund

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
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
        String id = "FDS-US"; // String | Company or Fund Identifier
        String assetType = "EQUITY"; // String | Controls the Asset Type of the data returned
        String holderType = "ALL_HOLDERS"; // String | Controls the Holder Type of the data returned
        String entityType = "SECURITY"; // String | Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data.
        String topn = "ALL"; // String | Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0. 
        LocalDate date = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates.
        try {
            ResponseHolders result = apiInstance.getOwnershipHolders(id, assetType, holderType, entityType, topn, date);
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
 **entityType** | **String**| Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. | [optional] [default to SECURITY] [enum: SECURITY, COMPANY]
 **topn** | **String**| Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  | [optional]
 **date** | **LocalDate**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional]

### Return type

[**ResponseHolders**](ResponseHolders.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |


## getOwnershipUltimateParent

> ResponseUltimateParent getOwnershipUltimateParent(id, currency, attributes, period, holderType, date)

Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
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
        String id = "FDS-US"; // String | Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
        String currency = "LOCAL"; // String | Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on. 
        java.util.List<String> attributes = Arrays.asList(); // java.util.List<String> | The columns to be returned in the resulting table
        String period = "1m"; // String | The period over which we should return holdings for.
        String holderType = "allHolders"; // String | The holder types which should be included in this table
        LocalDate date = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2019"); // LocalDate | The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date.
        try {
            ResponseUltimateParent result = apiInstance.getOwnershipUltimateParent(id, currency, attributes, period, holderType, date);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OwnershipApi#getOwnershipUltimateParent");
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
 **id** | **String**| Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  |
 **currency** | **String**| Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  | [optional] [enum: LOCAL, AED, ARS, ATS, AUD, BBD, BDT, BEF, BHD, BMD, BOB, BRL, CAD, CHF, CLP, CNY, COP, CYP, CZK, DKK, DOP, EEK, EGP, ESP, EUR, FIM, FRF, GBP, GHS, GRD, HKD, HRK, HUF, IDR, IEP, ILS, INR, ISK, ITL, JMD, JOD, JPY, KES, KRW, KWD, KYD, KZT, LBP, LKR, LTL, LUF, LVL, MAD, MKD, MNT, MTL, MUR, MWK, MXN, MYR, NAD, NGN, NLG, NOK, NZD, OMR, PAB, PEN, PHP, PKR, PLN, PTE, PYG, QAR, RUB, SAR, SEK, SGD, SIT, SKK, SZL, THB, TND, TWD, TZS, UGX, USD, VND, XAF, ZAR]
 **attributes** | **List&lt;String&gt;**| The columns to be returned in the resulting table | [optional] [enum: percentOwnership, position, positionChange, marketValue, marketValueChange, percentPortfolio, reportDate, source, holderId, percentOwnershipChange, percentPortfolioChange, optionsIndirectShares, fullyDilutedShares, contactName, contactPhone, contactEmail, contactTitle, holderRegion, holderSubRegion, holderCountry, holderMetroRegion, holderCity, holderState, holderIsForeignOrDomestic, holderCapGroupStyle, holderManagerStyle, holderHoldingsStyles, holderTurnover, holderActivismLevel, holderUltimateParent, holderAssetsUnderManagement, holderGroupLevelCount, holderType, investorType, institutionOrInsider, equityAssets]
 **period** | **String**| The period over which we should return holdings for. | [optional] [default to 6m] [enum: 1m, 3m, 6m, 12m, recent]
 **holderType** | **String**| The holder types which should be included in this table | [optional] [default to institutions] [enum: allHolders, beneficialOwners, funds, institutions, institutionsInsiders, insidersStakeholders]
 **date** | **LocalDate**| The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. | [optional]

### Return type

[**ResponseUltimateParent**](ResponseUltimateParent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 3.1 table format |  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

