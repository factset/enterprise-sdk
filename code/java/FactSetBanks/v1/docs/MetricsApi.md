# MetricsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getMetrics**](MetricsApi.md#getMetrics) | **GET** /metrics | Returns available metrics and their definitions



## getMetrics

> MetricsResponse getMetrics(searchText, category, subcategory, dataType)

Returns available metrics and their definitions

Returns list of available metrics that can be used in the metrics parameter of related endpoints.

Use this endpoint to discover available financial metrics, their definitions, and metadata. Filter by category and subcategory to narrow results.

**For methodology definitions**, reference the `oaPageId` or `oaUrl` response items to launch the available methodology page.


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
import com.factset.sdk.FactSetBanks.api.MetricsApi;

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

        MetricsApi apiInstance = new MetricsApi(defaultClient);
        String searchText = "return on assets"; // String | Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching. 
        String category = "FINANCIALS"; // String | Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: `/financials`, `/aum`, `/focus` - **FILINGS** - Regulatory filing data (10-D). Endpoint: `/ten-d` - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: `/ubpr` - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: `/country-exposure` 
        String subcategory = "US"; // String | Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: `/financials` - **CANADA** - Canadian OSFI regulatory financials. Endpoint: `/financials` - **AUSTRALIA** - Australian regulatory financials. Endpoint: `/financials` - **CREDIT_UNION** - Credit union financial data. Endpoint: `/financials` - **INDUSTRY** - Industry-level financial aggregates. Endpoint: `/financials` - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: `/aum`, `/focus` - **TEN_D** - Form 10-D securitization filings. Endpoint: `/ten-d` - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: `/ubpr` - **COUNTRY** - Country exposure metrics. Endpoint: `/country-exposure` 
        String dataType = "string"; // String | Filter by metric data type
        try {
            MetricsResponse result = apiInstance.getMetrics(searchText, category, subcategory, dataType);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling MetricsApi#getMetrics");
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
 **searchText** | **String**| Free-text search to filter metrics whose metric code or description contains the supplied text. Case-insensitive partial matching.  | [optional]
 **category** | **String**| Filter metrics by major category: - **FINANCIALS** - Financial statement data, demographics, and core institution identifiers (US, Canada, Australia, Credit Union, Industry, Specialty Finance). Endpoint: &#x60;/financials&#x60;, &#x60;/aum&#x60;, &#x60;/focus&#x60; - **FILINGS** - Regulatory filing data (10-D). Endpoint: &#x60;/ten-d&#x60; - **PERFORMANCE** - Uniform Bank Performance Report (UBPR) metrics. Endpoint: &#x60;/ubpr&#x60; - **EXPOSURE** - Country exposure data (Form 009a). Endpoint: &#x60;/country-exposure&#x60;  | [optional] [enum: FINANCIALS, FILINGS, PERFORMANCE, EXPOSURE]
 **subcategory** | **String**| Sub-category filter for the primary category: - **US** - United States regulatory financials. Endpoint: &#x60;/financials&#x60; - **CANADA** - Canadian OSFI regulatory financials. Endpoint: &#x60;/financials&#x60; - **AUSTRALIA** - Australian regulatory financials. Endpoint: &#x60;/financials&#x60; - **CREDIT_UNION** - Credit union financial data. Endpoint: &#x60;/financials&#x60; - **INDUSTRY** - Industry-level financial aggregates. Endpoint: &#x60;/financials&#x60; - **SPECIALTY_FINANCE** - Specialty finance industry data including FOCUS reports, Form ADV, and Business Development Corporations. Endpoint: &#x60;/aum&#x60;, &#x60;/focus&#x60; - **TEN_D** - Form 10-D securitization filings. Endpoint: &#x60;/ten-d&#x60; - **UBPR** - Uniform Bank Performance Report metrics. Endpoint: &#x60;/ubpr&#x60; - **COUNTRY** - Country exposure metrics. Endpoint: &#x60;/country-exposure&#x60;  | [optional] [enum: US, CANADA, AUSTRALIA, CREDIT_UNION, INDUSTRY, SPECIALTY_FINANCE, TEN_D, UBPR, COUNTRY]
 **dataType** | **String**| Filter by metric data type | [optional] [enum: string, number, date, boolean]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Available metrics data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

