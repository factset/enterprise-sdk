# StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFilesData**](StreetAccountHistoricalStoriesApi.md#getFilesData) | **GET** /historical/files/get | Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
[**getStatusData**](StreetAccountHistoricalStoriesApi.md#getStatusData) | **GET** /historical/files/status | Returns the status of the request
[**requestFiles**](StreetAccountHistoricalStoriesApi.md#requestFiles) | **POST** /historical/files/create | Requests the creation of StreetAccount News Files with historical data.



## getFilesData

> GetfilesResponse getFilesData(id, paginationLimit, paginationOffset)

Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.

Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint

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
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        String id = "id_example"; // String | ID returned by the /historical/files/create endpoint to collect the results of the query
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results
        try {
            GetfilesResponse result = apiInstance.getFilesData(id, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#getFilesData");
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
 **id** | **String**| ID returned by the /historical/files/create endpoint to collect the results of the query |
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**GetfilesResponse**](GetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad request |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## getStatusData

> GetStatusDataResponseWrapper getStatusData(id, paginationLimit, paginationOffset)

Returns the status of the request

Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint

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
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi.GetStatusDataResponseWrapper;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        String id = "id_example"; // String | ID returned by the /historical/files/create endpoint to know the status
        Integer paginationLimit = 56; // Integer | Specifies the maximum number of results to return per result
        Integer paginationOffset = 56; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            GetStatusDataResponseWrapper result = apiInstance.getStatusData(id, paginationLimit, paginationOffset);
            switch(result.getStatusCode()) {
            
                case 201:
                    System.out.println(result.getResponse201()); // SubmittedResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // AcceptedResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#getStatusData");
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
 **id** | **String**| ID returned by the /historical/files/create endpoint to know the status |
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per result | [optional]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

### Return type

GetStatusDataResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Request has been Created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has been Accepted.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## requestFiles

> AcceptedResponse requestFiles(createFilesRequest)

Requests the creation of StreetAccount News Files with historical data.

Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.

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
import com.factset.sdk.StreetAccountNews.api.StreetAccountHistoricalStoriesApi;

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

        StreetAccountHistoricalStoriesApi apiInstance = new StreetAccountHistoricalStoriesApi(defaultClient);
        CreateFilesRequest createFilesRequest = new CreateFilesRequest(); // CreateFilesRequest | 
        try {
            AcceptedResponse result = apiInstance.requestFiles(createFilesRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StreetAccountHistoricalStoriesApi#requestFiles");
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
 **createFilesRequest** | [**CreateFilesRequest**](CreateFilesRequest.md)|  |

### Return type

[**AcceptedResponse**](AcceptedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The Request has been Accepted.  |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Server Error |  -  |

