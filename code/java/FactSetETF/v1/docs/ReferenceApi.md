# ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEtfReferenceData**](ReferenceApi.md#getEtfReferenceData) | **GET** /factset-etf/v1/reference | Return reference data for an ETF.
[**getEtfReferenceDataForList**](ReferenceApi.md#getEtfReferenceDataForList) | **POST** /factset-etf/v1/reference | Fetch Reference Data for a large list of ETF securities.



## getEtfReferenceData

> EtfReferenceDataResponse getEtfReferenceData(ids, metrics, categories)

Return reference data for an ETF.

Returns reference data items for Exchange Traded Funds.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetETF.ApiClient;
import com.factset.sdk.FactSetETF.ApiException;
import com.factset.sdk.FactSetETF.Configuration;
import com.factset.sdk.FactSetETF.auth.*;
import com.factset.sdk.FactSetETF.models.*;
import com.factset.sdk.FactSetETF.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
        java.util.List<String> metrics = Arrays.asList(); // java.util.List<String> | List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint. 
        java.util.List<Category> categories = Arrays.asList(); // java.util.List<Category> | Groupings of `metrics` data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.| 
        try {
            EtfReferenceDataResponse result = apiInstance.getEtfReferenceData(ids, metrics, categories);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#getEtfReferenceData");
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
 **ids** | **List&lt;String&gt;**| The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **metrics** | **List&lt;String&gt;**| List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint.  | [optional]
 **categories** | **List&lt;Category&gt;**| Groupings of &#x60;metrics&#x60; data items. Supply a list of categories below to return collections of data items in response. |category|description| |---|---| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  | [optional]

### Return type

[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETF Reference Data Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getEtfReferenceDataForList

> EtfReferenceDataResponse getEtfReferenceDataForList(etfReferenceDataRequest)

Fetch Reference Data for a large list of ETF securities.

Returns reference data items for a list of Exchange Traded Funds.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetETF.ApiClient;
import com.factset.sdk.FactSetETF.ApiException;
import com.factset.sdk.FactSetETF.Configuration;
import com.factset.sdk.FactSetETF.auth.*;
import com.factset.sdk.FactSetETF.models.*;
import com.factset.sdk.FactSetETF.api.ReferenceApi;

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

        ReferenceApi apiInstance = new ReferenceApi(defaultClient);
        EtfReferenceDataRequest etfReferenceDataRequest = new EtfReferenceDataRequest(); // EtfReferenceDataRequest | Request object for Exchange Traded Funds
        try {
            EtfReferenceDataResponse result = apiInstance.getEtfReferenceDataForList(etfReferenceDataRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ReferenceApi#getEtfReferenceDataForList");
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
 **etfReferenceDataRequest** | [**EtfReferenceDataRequest**](EtfReferenceDataRequest.md)| Request object for Exchange Traded Funds |

### Return type

[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETF Reference Data Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

