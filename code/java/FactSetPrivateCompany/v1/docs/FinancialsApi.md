# FinancialsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFinancials**](FinancialsApi.md#getFinancials) | **GET** /financials | Returns Private Company Financial Data.
[**getFinancialsForList**](FinancialsApi.md#getFinancialsForList) | **POST** /financials | Returns Private Company Financial Data.



## getFinancials

> FinancialsResponse getFinancials(ids, metrics, startDate, endDate)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items. 


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetPrivateCompany.ApiClient;
import com.factset.sdk.FactSetPrivateCompany.ApiException;
import com.factset.sdk.FactSetPrivateCompany.Configuration;
import com.factset.sdk.FactSetPrivateCompany.auth.*;
import com.factset.sdk.FactSetPrivateCompany.models.*;
import com.factset.sdk.FactSetPrivateCompany.api.FinancialsApi;

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

        FinancialsApi apiInstance = new FinancialsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
        java.util.List<String> metrics = Arrays.asList(); // java.util.List<String> | Requested list of Private Company Financial items 
        LocalDate startDate = LocalDate.parse("Mon Jan 01 00:00:00 UTC 2024"); // LocalDate | The start date requested for a given date range in YYYY-MM-DD format. <br/> Future dates (T+1) are not accepted in this endpoint. 
        LocalDate endDate = LocalDate.parse("Tue Dec 31 00:00:00 UTC 2024"); // LocalDate | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. <br/> Future dates (T+1) are not accepted in this endpoint. 
        try {
            FinancialsResponse result = apiInstance.getFinancials(ids, metrics, startDate, endDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsApi#getFinancials");
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
 **ids** | **List&lt;String&gt;**| The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  |
 **metrics** | **List&lt;String&gt;**| Requested list of Private Company Financial items  |
 **startDate** | **LocalDate**| The start date requested for a given date range in YYYY-MM-DD format. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  |
 **endDate** | **LocalDate**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close. &lt;br/&gt; Future dates (T+1) are not accepted in this endpoint.  | [optional]

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Private Company Financials for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getFinancialsForList

> FinancialsResponse getFinancialsForList(financialsRequest)

Returns Private Company Financial Data.

Retrieves Financial Data for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company  identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items. 


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
import com.factset.sdk.FactSetPrivateCompany.api.FinancialsApi;

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

        FinancialsApi apiInstance = new FinancialsApi(defaultClient);
        FinancialsRequest financialsRequest = new FinancialsRequest(); // FinancialsRequest | Request Body to request a list of Private Company financials objects.
        try {
            FinancialsResponse result = apiInstance.getFinancialsForList(financialsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FinancialsApi#getFinancialsForList");
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
 **financialsRequest** | [**FinancialsRequest**](FinancialsRequest.md)| Request Body to request a list of Private Company financials objects. |

### Return type

[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Private Company financials data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

