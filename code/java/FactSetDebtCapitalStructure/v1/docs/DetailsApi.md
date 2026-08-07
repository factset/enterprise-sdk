# DetailsApi

All URIs are relative to *https://api.factset.com/content/factset-dcs/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDetailsList**](DetailsApi.md#getDetailsList) | **POST** /details | Returns debt instruments for a list of companies.
[**getDetailsSummary**](DetailsApi.md#getDetailsSummary) | **GET** /details-summary | Returns debt instrument totals details for specified list of companies.
[**getInterimDetailsList**](DetailsApi.md#getInterimDetailsList) | **POST** /details-interim | Returns most recently available debt instrument data for a list of companies.



## getDetailsList

> DetailsResponse getDetailsList(detailsRequest)

Returns debt instruments for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.auth.*;
import com.factset.sdk.FactSetDebtCapitalStructure.models.*;
import com.factset.sdk.FactSetDebtCapitalStructure.api.DetailsApi;

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

        DetailsApi apiInstance = new DetailsApi(defaultClient);
        DetailsRequest detailsRequest = new DetailsRequest(); // DetailsRequest | Request object for `Details`.
        try {
            DetailsResponse result = apiInstance.getDetailsList(detailsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DetailsApi#getDetailsList");
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
 **detailsRequest** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Details&#x60;. |

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of details |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getDetailsSummary

> DetailsSummaryResponse getDetailsSummary(ids, periodicity, startDate, currency)

Returns debt instrument totals details for specified list of companies.

Gets totals for instruments of varying types such as Revolving Credit, Term Loans,  ST Debt Total, Notes/Bonds, and Other. 


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.auth.*;
import com.factset.sdk.FactSetDebtCapitalStructure.models.*;
import com.factset.sdk.FactSetDebtCapitalStructure.api.DetailsApi;

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

        DetailsApi apiInstance = new DetailsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.  
        String periodicity = "ANN"; // String | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual Original,   * **QTR**  = Quarterly 
        LocalDate startDate = LocalDate.parse("2024-01-01"); // LocalDate | The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint. 
        String currency = "LOCAL"; // String | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470). 
        try {
            DetailsSummaryResponse result = apiInstance.getDetailsSummary(ids, periodicity, startDate, currency);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DetailsApi#getDetailsSummary");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers,  SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.   |
 **periodicity** | **String**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual Original,   * **QTR**  &#x3D; Quarterly  | [enum: ANN, QTR]
 **startDate** | **LocalDate**| The date of the period requested in YYYY-MM-DD format.  Future dates (T+1) are not accepted in this endpoint.  |
 **currency** | **String**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to LOCAL]

### Return type

[**DetailsSummaryResponse**](DetailsSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details summary object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getInterimDetailsList

> DetailsResponse getInterimDetailsList(interimDetailsRequest)

Returns most recently available debt instrument data for a list of companies.

Gets instruments of varying types such as Revolving Credit, Term Loans, ST Debt Total, Notes/Bonds, and Other. The data returned by this endpoint is for the interim period and only returns the most recently available value.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetDebtCapitalStructure.ApiClient;
import com.factset.sdk.FactSetDebtCapitalStructure.ApiException;
import com.factset.sdk.FactSetDebtCapitalStructure.Configuration;
import com.factset.sdk.FactSetDebtCapitalStructure.auth.*;
import com.factset.sdk.FactSetDebtCapitalStructure.models.*;
import com.factset.sdk.FactSetDebtCapitalStructure.api.DetailsApi;

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

        DetailsApi apiInstance = new DetailsApi(defaultClient);
        InterimDetailsRequest interimDetailsRequest = new InterimDetailsRequest(); // InterimDetailsRequest | Request object for `Details`.
        try {
            DetailsResponse result = apiInstance.getInterimDetailsList(interimDetailsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DetailsApi#getInterimDetailsList");
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
 **interimDetailsRequest** | [**InterimDetailsRequest**](InterimDetailsRequest.md)| Request object for &#x60;Details&#x60;. |

### Return type

[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of interim details |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

