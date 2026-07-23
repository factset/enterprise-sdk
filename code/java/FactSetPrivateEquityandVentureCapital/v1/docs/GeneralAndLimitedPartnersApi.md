# GeneralAndLimitedPartnersApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFundLimitedPartners**](GeneralAndLimitedPartnersApi.md#getFundLimitedPartners) | **GET** /limited-partners/funds | Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.
[**getGP**](GeneralAndLimitedPartnersApi.md#getGP) | **GET** /general-partners | Retrieves historical data for specified General Partner (GP) firms.
[**getGPFunds**](GeneralAndLimitedPartnersApi.md#getGPFunds) | **GET** /general-partners/funds | Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.



## getFundLimitedPartners

> FundLimitedPartnersResponse getFundLimitedPartners(ids)

Retrieve the Limited Partners (LPs) and their capital commitments to specific funds.

Returns a list of **Limited Partners** (investors) associated with the specified funds, along with details of their **capital commitments** (investment amounts) and the **commit date**. This data is essential for understanding a fund's LP base.

Use the `/universe` endpoint and input the fund's name, setting the `entityType` to the most appropriate type (e.g., VEN, FAF, PVF).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.GeneralAndLimitedPartnersApi;

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

        GeneralAndLimitedPartnersApi apiInstance = new GeneralAndLimitedPartnersApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint
        try {
            FundLimitedPartnersResponse result = apiInstance.getFundLimitedPartners(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralAndLimitedPartnersApi#getFundLimitedPartners");
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
 **ids** | **List&lt;String&gt;**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**FundLimitedPartnersResponse**](FundLimitedPartnersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getGP

> GPDetailsResponse getGP(ids, asOfDate)

Retrieves historical data for specified General Partner (GP) firms.

Retrieves the primary descriptive and profile information for one or more General Partner firms. This includes firm-level details such as the **Asset Under Management (AUM)** and a high-level overview of their **investment strategy** (e.g., target industry, geography).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.GeneralAndLimitedPartnersApi;

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

        GeneralAndLimitedPartnersApi apiInstance = new GeneralAndLimitedPartnersApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.
        LocalDate asOfDate = LocalDate.parse("2023-08-27"); // LocalDate | The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint. 
        try {
            GPDetailsResponse result = apiInstance.getGP(ids, asOfDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralAndLimitedPartnersApi#getGP");
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
 **ids** | **List&lt;String&gt;**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. |
 **asOfDate** | **LocalDate**| The as-of date for the AUM data in **YYYY-MM-DD** format. Returns the AUM value as of the specified date.  Note:  - If omitted: The response will return the latest available AUM data. - Future dates (T+1) are not accepted in this endpoint.  | [optional]

### Return type

[**GPDetailsResponse**](GPDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getGPFunds

> GPFundsResponse getGPFunds(ids)

Retrieve the list of all Private Equity and Venture Capital Funds managed by specified General Partners.

Returns a list of all Private Equity and Venture Capital funds that are actively or historically managed by the specified General Partner firms. This provides a complete view of a GP's fund vintage and strategy history.

Use the `/universe` endpoint and input the GP firm name, with `entityType` set to `HOL`. Only use `entityId` values whose `entityTypeCode` is `HOL` in your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiClient;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.ApiException;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.Configuration;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.auth.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.models.*;
import com.factset.sdk.FactSetPrivateEquityandVentureCapital.api.GeneralAndLimitedPartnersApi;

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

        GeneralAndLimitedPartnersApi apiInstance = new GeneralAndLimitedPartnersApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds.
        try {
            GPFundsResponse result = apiInstance.getGPFunds(ids);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralAndLimitedPartnersApi#getGPFunds");
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
 **ids** | **List&lt;String&gt;**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **General Partner (GP) firms**. These IDs are used to identify the management companies of the funds. |

### Return type

[**GPFundsResponse**](GPFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

