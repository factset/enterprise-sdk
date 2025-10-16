# CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFdsProfiles**](CompanyReportsApi.md#getFdsProfiles) | **GET** /company-reports/profile | Returns company profile information for a specified list of identifiers.
[**getFinancials**](CompanyReportsApi.md#getFinancials) | **GET** /company-reports/financial-statement | Returns company financial data.
[**getFundamentals**](CompanyReportsApi.md#getFundamentals) | **GET** /company-reports/fundamentals | Returns company fundamentals for a given list of identifiers.



## getFdsProfiles

> ProfileResponse getFdsProfiles(ids)

Returns company profile information for a specified list of identifiers.

Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.auth.*;
import com.factset.sdk.FactSetFundamentals.models.*;
import com.factset.sdk.FactSetFundamentals.api.CompanyReportsApi;

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

        CompanyReportsApi apiInstance = new CompanyReportsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p>
        try {
            ProfileResponse result = apiInstance.getFdsProfiles(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getFdsProfiles");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Profile data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |


## getFinancials

> FinancialResponse getFinancials(statementType, id, periodicity, currency, updateType, limit)

Returns company financial data.

Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.<br>
**Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.auth.*;
import com.factset.sdk.FactSetFundamentals.models.*;
import com.factset.sdk.FactSetFundamentals.api.CompanyReportsApi;

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

        CompanyReportsApi apiInstance = new CompanyReportsApi(defaultClient);
        String statementType = "BS"; // String | The type of financial statement being requested.
        String id = "IBM-US"; // String | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **SEMI_R** = Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  = Last Twelve Months,   * **YTD** = Year-to-date.   <br>  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.<br> 
        String currency = "LOCAL"; // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as `DOC` would give the values in reporting currency for the requested ids. 
        String updateType = "RP"; // String | Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data
        Integer limit = 4; // Integer | The time period for the returned data. Within range of 1 to 100. If not specified default will be 4.
        try {
            FinancialResponse result = apiInstance.getFinancials(statementType, id, periodicity, currency, updateType, limit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getFinancials");
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
 **statementType** | **String**| The type of financial statement being requested. | [enum: BS, CF, IS]
 **id** | **String**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. |
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  &#x3D; Last Twelve Months,   * **YTD** &#x3D; Year-to-date.   &lt;br&gt;  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.&lt;br&gt;  | [enum: ANN, ANN_R, QTR, QTR_R, SEMI, SEMI_R, LTM, YTD]
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  | [optional] [default to LOCAL]
 **updateType** | **String**| Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data | [optional] [default to RP] [enum: RP, RF]
 **limit** | **Integer**| The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. | [optional] [default to 4]

### Return type

[**FinancialResponse**](FinancialResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Financial data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |


## getFundamentals

> CompanyFundamentalsResponse getFundamentals(ids, currency, periodicity)

Returns company fundamentals for a given list of identifiers.

Returns detailed insights on specified publicly traded company's various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.<br>
**Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetFundamentals.ApiClient;
import com.factset.sdk.FactSetFundamentals.ApiException;
import com.factset.sdk.FactSetFundamentals.Configuration;
import com.factset.sdk.FactSetFundamentals.auth.*;
import com.factset.sdk.FactSetFundamentals.models.*;
import com.factset.sdk.FactSetFundamentals.api.CompanyReportsApi;

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

        CompanyReportsApi apiInstance = new CompanyReportsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p>
        String currency = "LOCAL"; // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as `DOC` would give the values in reporting currency for the requested ids. 
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods. If omitted, will return the latest available data irrespective of the periodicity.   * **ANN**  = Annual - Original,   * **QTR**  = Quarterly - Original   * **SEMI** = Semi-Annual 
        try {
            CompanyFundamentalsResponse result = apiInstance.getFundamentals(ids, currency, periodicity);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getFundamentals");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; |
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as &#x60;DOC&#x60; would give the values in reporting currency for the requested ids.  | [optional] [default to LOCAL]
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods. If omitted, will return the latest available data irrespective of the periodicity.   * **ANN**  &#x3D; Annual - Original,   * **QTR**  &#x3D; Quarterly - Original   * **SEMI** &#x3D; Semi-Annual  | [optional] [enum: ANN, QTR, SEMI]

### Return type

[**CompanyFundamentalsResponse**](CompanyFundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fundamentals data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

