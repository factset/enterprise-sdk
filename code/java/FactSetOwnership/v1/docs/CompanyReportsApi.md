# CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOwnershipCompanyReportsSummary**](CompanyReportsApi.md#getOwnershipCompanyReportsSummary) | **GET** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.
[**postOwnershipCompanyReportsSummary**](CompanyReportsApi.md#postOwnershipCompanyReportsSummary) | **POST** /company-reports/summary | Get current only ownership summary data for a list of requested identifiers.



## getOwnershipCompanyReportsSummary

> GetOwnershipCompanyReportsSummaryResponseWrapper getOwnershipCompanyReportsSummary(ids, batch)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.CompanyReportsApi;
import com.factset.sdk.FactSetOwnership.api.CompanyReportsApi.GetOwnershipCompanyReportsSummaryResponseWrapper;

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
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | Requested list of identifiers.  _**ids limit** = 10 per request_
        Batch batch = Batch.fromValue("Y"); // Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes.  When `batch=Y`, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It's advised to submit large lists of ids via POST method. 
        try {
            GetOwnershipCompanyReportsSummaryResponseWrapper result = apiInstance.getOwnershipCompanyReportsSummary(ids, batch);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // OwnershipSummaryResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#getOwnershipCompanyReportsSummary");
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
 **ids** | **List&lt;String&gt;**| Requested list of identifiers.  _**ids limit** &#x3D; 10 per request_ |
 **batch** | **Batch**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes.  When &#x60;batch&#x3D;Y&#x60;, the service will respond with an HTTP Status Code of 202.  Once a batch request is submitted, use batch status to see if the job has been completed.  Once completed, retrieve the results of the request via batch-result. When using Batch, ids     limit is increased to  1000 ids per request, though limits on query string via GET method still apply.  It&#39;s advised to submit large lists of ids via POST method.  | [optional] [default to N] [enum: Y, N]

### Return type

GetOwnershipCompanyReportsSummaryResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ownership Summary Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postOwnershipCompanyReportsSummary

> PostOwnershipCompanyReportsSummaryResponseWrapper postOwnershipCompanyReportsSummary(ownershipSummaryRequest)

Get current only ownership summary data for a list of requested identifiers.

Get current only ownership summary data for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetOwnership.ApiClient;
import com.factset.sdk.FactSetOwnership.ApiException;
import com.factset.sdk.FactSetOwnership.Configuration;
import com.factset.sdk.FactSetOwnership.auth.*;
import com.factset.sdk.FactSetOwnership.models.*;
import com.factset.sdk.FactSetOwnership.api.CompanyReportsApi;
import com.factset.sdk.FactSetOwnership.api.CompanyReportsApi.PostOwnershipCompanyReportsSummaryResponseWrapper;

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
        OwnershipSummaryRequest ownershipSummaryRequest = new OwnershipSummaryRequest(); // OwnershipSummaryRequest | Requesting Ownership Summary Details
        try {
            PostOwnershipCompanyReportsSummaryResponseWrapper result = apiInstance.postOwnershipCompanyReportsSummary(ownershipSummaryRequest);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // OwnershipSummaryResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // BatchStatusResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyReportsApi#postOwnershipCompanyReportsSummary");
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
 **ownershipSummaryRequest** | [**OwnershipSummaryRequest**](OwnershipSummaryRequest.md)| Requesting Ownership Summary Details |

### Return type

PostOwnershipCompanyReportsSummaryResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ownership Summary Response. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

