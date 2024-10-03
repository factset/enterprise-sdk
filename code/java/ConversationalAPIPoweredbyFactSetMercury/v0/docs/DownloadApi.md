# DownloadApi

All URIs are relative to *https://api.factset.com/conversational/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](DownloadApi.md#downloadFile) | **POST** /download/file | Retrieve data file based on file ID.



## downloadFile

> File downloadFile(fileDownloadRequest)

Retrieve data file based on file ID.

Returns downloadable .xlsx file based on the NextStep action(s) returned from `/result` endpoint.
Use the file ID returned from the `/result` endpoint to retrieve your file.
Files are available for download for 24 hours after the initial request.

Current list of supported download types:
* ActiveGraph
* ExcelChart
* STACH Table (as Excel)


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.auth.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.models.*;
import com.factset.sdk.ConversationalAPIPoweredbyFactSetMercury.api.DownloadApi;

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

        DownloadApi apiInstance = new DownloadApi(defaultClient);
        FileDownloadRequest fileDownloadRequest = new FileDownloadRequest(); // FileDownloadRequest | ID refers to the file ID in the NextStep action returned from the `/result` endpoint
        try {
            File result = apiInstance.downloadFile(fileDownloadRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DownloadApi#downloadFile");
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
 **fileDownloadRequest** | [**FileDownloadRequest**](FileDownloadRequest.md)| ID refers to the file ID in the NextStep action returned from the &#x60;/result&#x60; endpoint |

### Return type

[**File**](File.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json, text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Content-Disposition - Content is expected to be an attachment <br>  * Api-Supported-Versions - Comma-separated list of supported major versions. <br>  * Api-Version - Full semantic version of the API. <br>  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  |
| **400** | Bad Request - This may be due to an invalid ID or an expired file. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you are logged in to the developer portal or using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the entitlements enabled for this service. Please reach out to your FactSet Support Team representative to receive the proper entitlements. |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - The &#x60;/download/file&#x60; endpoint is currently rate-limited to 10 requests per second for an individual organization. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). |  * RateLimit-Limit - Request limit per second. <br>  * RateLimit-Remaining - Number of available requests. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * Retry-After - How long (in seconds) to wait before attempting to send a new request. <br>  * X-RateLimit-Limit-minute - Request limit per minute. <br>  * X-RateLimit-Remaining-minute - Number of available requests in the current minute. <br>  * X-DataDirect-Request-Key - FactSet request ID. <br>  |
| **500** | Internal Server Error |  -  |

