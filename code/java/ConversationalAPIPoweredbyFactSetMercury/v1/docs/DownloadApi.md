# DownloadApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**downloadFile**](DownloadApi.md#downloadFile) | **POST** /download/file | Retrieve data file based on file ID.



## downloadFile

> File downloadFile(fileDownloadRequest)

Retrieve data file based on file ID.

If your response from the `/result` endpoint contains a file ID within a NextStep Download action, you can retrieve the file using this endpoint.  Files are available for download for 24 hours after generation.

Returns a downloadable Excel .xlsx file referenced in the NextStep action returned from the `/result` endpoint.

Any of the following content can be embedded into a downloadable Excel file:
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
| **200** | OK |  * Content-Disposition - Content is expected to be an attachment. <br>  * Content-Type - Content type of the file. <br>  * Transfer-Encoding - Form of encoding used for the file. <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  |  -  |
| **404** | Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - This endpoint is currently rate-limited to 10 requests per second for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  |
| **500** | Internal Server Error |  -  |

