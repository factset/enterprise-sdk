# HistoricalCreditParentApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getHistCredParent**](HistoricalCreditParentApi.md#getHistCredParent) | **GET** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).
[**postHistCredParent**](HistoricalCreditParentApi.md#postHistCredParent) | **POST** /factset-entity/v1/hist-credit-parent | Returns historical credit parents for the requested id(s).



## getHistCredParent

> CreditParentResponse getHistCredParent(ids, asOfDate)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is
also available if an asOfDate is provided. The full credit parent history of a security is returned if
no asOfDate is provided.

This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.HistoricalCreditParentApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        HistoricalCreditParentApi apiInstance = new HistoricalCreditParentApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.<p>**Max Ids Limit set to 50 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
        String asOfDate = "2020-01-01"; // String | The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned. 
        try {
            CreditParentResponse result = apiInstance.getHistCredParent(ids, asOfDate);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricalCreditParentApi#getHistCredParent");
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
 **ids** | **List&lt;String&gt;**| The requested security level Market Identifiers. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet -S Permanent Ids.&lt;p&gt;**Max Ids Limit set to 50 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **asOfDate** | **String**| The date requested for credit parent calculation. Represented in **YYYY-MM-DD** format. If left blank or not specified, the full credit parent history will be returned.  | [optional]

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Credit Parents |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postHistCredParent

> CreditParentResponse postHistCredParent(creditParentRequest)

Returns historical credit parents for the requested id(s).

Returns the credit parent for requested fixed income ids. Point in time credit parent retrieval is
also available if an asOfDate is provided. The full credit parent history of a security is returned if
no asOfDate is provided.

This endpoint uses a seven day calendar to account for changes that occur on all seven days of the week.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.HistoricalCreditParentApi;

import com.factset.sdk.utils.authentication.ConfidentialClient;

public class Example {
    public static void main(String[] args) throws Exception {
        // Examples for each supported authentication method are below,
        // choose one that satisfies your use case.

        /* (Preferred) OAuth 2.0: FactSetOAuth2 */
        // See https://github.com/FactSet/enterprise-sdk#oauth-20
        // for information on how to create the app-config.json file
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

        HistoricalCreditParentApi apiInstance = new HistoricalCreditParentApi(defaultClient);
        CreditParentRequest creditParentRequest = new CreditParentRequest(); // CreditParentRequest | Request Body to request a list of credit parent objects.
        try {
            CreditParentResponse result = apiInstance.postHistCredParent(creditParentRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling HistoricalCreditParentApi#postHistCredParent");
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
 **creditParentRequest** | [**CreditParentRequest**](CreditParentRequest.md)| Request Body to request a list of credit parent objects. |

### Return type

[**CreditParentResponse**](CreditParentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Credit parent data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

