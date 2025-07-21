# CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancialsReport**](CompanyReportsApi.md#getFinancialsReport) | **GET** /company-reports/financial-statement | Returns Private Company Financial Data
[**getProfileReport**](CompanyReportsApi.md#getProfileReport) | **GET** /company-reports/profile | Returns Private Company Non-Periodic Data



## getFinancialsReport

> FinancialStatementsResponse getFinancialsReport(ids, statementType, currency, numberAnnualPeriods)

Returns Private Company Financial Data

Returns financial data for specified private companies and statement type (income,  balance sheet, cash flow, and ratios) over an annual reporting period. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/><br/>
**Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for  a currency other than local, when compared to workstation.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateCompany.ApiClient;
import com.factset.sdk.FactSetPrivateCompany.ApiException;
import com.factset.sdk.FactSetPrivateCompany.Configuration;
import com.factset.sdk.FactSetPrivateCompany.auth.*;
import com.factset.sdk.FactSetPrivateCompany.models.*;
import com.factset.sdk.FactSetPrivateCompany.api.CompanyReportsApi;

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 
        String statementType = "BS"; // String | The type of financial statement being requested
        String currency = "LOCAL"; // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids. 
        Integer numberAnnualPeriods = 4; // Integer | The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. </br>Within range of 1 to 100. If not specified default will be 4.      
        try {
            FinancialStatementsResponse result = apiInstance.getFinancialsReport(ids, statementType, currency, numberAnnualPeriods);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getFinancialsReport");
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
 **ids** | **List&lt;String&gt;**| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |
 **statementType** | **String**| The type of financial statement being requested | [enum: BS, CF, IS, R]
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] [default to LOCAL]
 **numberAnnualPeriods** | **Integer**| The number of annual periods for the returned data which will be displayed in descending order from most recent annual period for the number of annual periods specified. &lt;/br&gt;Within range of 1 to 100. If not specified default will be 4.       | [optional] [default to 4]

### Return type

[**FinancialStatementsResponse**](FinancialStatementsResponse.md)

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
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |


## getProfileReport

> ProfileResponse getProfileReport(ids)

Returns Private Company Non-Periodic Data

Retrieves a comprehensive overview of key non-periodic details and information for a  specified list of identifiers. All values provided in the response are absolute. <br/> Use the ```/universe``` endpoint to retrieve valid Private Company identifiers.<br/>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateCompany.ApiClient;
import com.factset.sdk.FactSetPrivateCompany.ApiException;
import com.factset.sdk.FactSetPrivateCompany.Configuration;
import com.factset.sdk.FactSetPrivateCompany.auth.*;
import com.factset.sdk.FactSetPrivateCompany.models.*;
import com.factset.sdk.FactSetPrivateCompany.api.CompanyReportsApi;

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of Factset Private Company identifiers in XXXXXX-E format <p>***ids limit** =  50 per request*</p> 
        try {
            ProfileResponse result = apiInstance.getProfileReport(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getProfileReport");
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
 **ids** | **List&lt;String&gt;**| The requested list of Factset Private Company identifiers in XXXXXX-E format &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |

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
| **200** | Non-periodic data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

