# SaBurstsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getLatestBurstFile**](SaBurstsApi.md#getLatestBurstFile) | **GET** /sa-bursts/latest-file | Retrieve the latest burst file metadata and download URL



## getLatestBurstFile

> BurstFileResponse getLatestBurstFile()

Retrieve the latest burst file metadata and download URL

Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the `downloadUrl` in the response to download the file.

**Response fields**

- **`burstDateTime`** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).

- **`downloadUrl`** — Opaque URL to download the burst file. Issue
  a `GET` request to this URL to receive an HTTP 302 redirect to the file.
  The URL contains a short-lived token unique to this burst and
  is valid for **5 minutes**.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.StreetAccountNews.ApiClient;
import com.factset.sdk.StreetAccountNews.ApiException;
import com.factset.sdk.StreetAccountNews.Configuration;
import com.factset.sdk.StreetAccountNews.auth.*;
import com.factset.sdk.StreetAccountNews.models.*;
import com.factset.sdk.StreetAccountNews.api.SaBurstsApi;

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

        SaBurstsApi apiInstance = new SaBurstsApi(defaultClient);
        try {
            BurstFileResponse result = apiInstance.getLatestBurstFile();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SaBurstsApi#getLatestBurstFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**BurstFileResponse**](BurstFileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Latest burst file metadata. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | No burst file available. |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

