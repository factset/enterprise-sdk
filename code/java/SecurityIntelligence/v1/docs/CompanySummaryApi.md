# CompanySummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyDebtSummary**](CompanySummaryApi.md#getCompanyDebtSummary) | **GET** /company/debt | Get Company Debt Summary
[**getCompanyEvents**](CompanySummaryApi.md#getCompanyEvents) | **GET** /company/events | Get Company Events
[**getCompanyFinancialHighlights**](CompanySummaryApi.md#getCompanyFinancialHighlights) | **GET** /company/financials | Get Company Financial Highlights
[**getCompanyMNASummary**](CompanySummaryApi.md#getCompanyMNASummary) | **GET** /company/mna | Get Company M&amp;A Summary
[**getCompanyOwnershipInsights**](CompanySummaryApi.md#getCompanyOwnershipInsights) | **GET** /company/ownership | Get Company Ownership Insights



## getCompanyDebtSummary

> DebtSummaryResponse getCompanyDebtSummary(identifier)

Get Company Debt Summary

Presents the company's Debt Capital Structure maturity data, analysis of Total Debt, and information on debt obligations due in the near term.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.CompanySummaryApi;

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

        CompanySummaryApi apiInstance = new CompanySummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        try {
            DebtSummaryResponse result = apiInstance.getCompanyDebtSummary(identifier);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanySummaryApi#getCompanyDebtSummary");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |

### Return type

[**DebtSummaryResponse**](DebtSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |


## getCompanyEvents

> EventsSummaryResponse getCompanyEvents(identifier)

Get Company Events

Returns a summary of company events including Dividends, Earnings Releases and Stock Splits spanning 7 days in the past and 60 days into the future.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.CompanySummaryApi;

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

        CompanySummaryApi apiInstance = new CompanySummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        try {
            EventsSummaryResponse result = apiInstance.getCompanyEvents(identifier);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanySummaryApi#getCompanyEvents");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |

### Return type

[**EventsSummaryResponse**](EventsSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |


## getCompanyFinancialHighlights

> FinancialHighlightsResponse getCompanyFinancialHighlights(identifier)

Get Company Financial Highlights

Provides comprehensive financial data including Income Statement, Cash Flow Statement, and Balance Sheet for the past 1.5 years.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.CompanySummaryApi;

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

        CompanySummaryApi apiInstance = new CompanySummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        try {
            FinancialHighlightsResponse result = apiInstance.getCompanyFinancialHighlights(identifier);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanySummaryApi#getCompanyFinancialHighlights");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |

### Return type

[**FinancialHighlightsResponse**](FinancialHighlightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |


## getCompanyMNASummary

> MnaSummaryResponse getCompanyMNASummary(identifier)

Get Company M&amp;A Summary

Reports on Mergers and Acquisitions activity related to the company within the last 3 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.CompanySummaryApi;

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

        CompanySummaryApi apiInstance = new CompanySummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        try {
            MnaSummaryResponse result = apiInstance.getCompanyMNASummary(identifier);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanySummaryApi#getCompanyMNASummary");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |

### Return type

[**MnaSummaryResponse**](MnaSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |


## getCompanyOwnershipInsights

> OwnershipInsightsResponse getCompanyOwnershipInsights(identifier)

Get Company Ownership Insights

Provides information on any activists targeting the company, and highlights the largest ownership position changes over the last 6 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.SecurityIntelligence.ApiClient;
import com.factset.sdk.SecurityIntelligence.ApiException;
import com.factset.sdk.SecurityIntelligence.Configuration;
import com.factset.sdk.SecurityIntelligence.auth.*;
import com.factset.sdk.SecurityIntelligence.models.*;
import com.factset.sdk.SecurityIntelligence.api.CompanySummaryApi;

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

        CompanySummaryApi apiInstance = new CompanySummaryApi(defaultClient);
        String identifier = "identifier_example"; // String | Ticker or FactSet Entity ID of the company
        try {
            OwnershipInsightsResponse result = apiInstance.getCompanyOwnershipInsights(identifier);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanySummaryApi#getCompanyOwnershipInsights");
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
 **identifier** | **String**| Ticker or FactSet Entity ID of the company |

### Return type

[**OwnershipInsightsResponse**](OwnershipInsightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with company data |  -  |
| **400** | Bad request |  -  |
| **401** | Authentication Failed |  -  |
| **500** | Internal Server Error |  -  |

