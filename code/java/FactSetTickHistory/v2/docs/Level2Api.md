# Level2Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getStatusLevel2**](Level2Api.md#getStatusLevel2) | **GET** /level2/files/status | Returns the status of the ID
[**getTickHistoryFilesLevel2**](Level2Api.md#getTickHistoryFilesLevel2) | **GET** /level2/files/get | Returns the tick history files requested in the /create endpoint
[**getlevel2id**](Level2Api.md#getlevel2id) | **POST** /level2/files/create | Returns the ID for the requested data.



## getStatusLevel2

> GetStatusLevel2ResponseWrapper getStatusLevel2(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.Level2Api;
import com.factset.sdk.FactSetTickHistory.api.Level2Api.GetStatusLevel2ResponseWrapper;

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

        Level2Api apiInstance = new Level2Api(defaultClient);
        String id = "id_example"; // String | id returned by files create endpoint to poll and collect status of the query
        try {
            GetStatusLevel2ResponseWrapper result = apiInstance.getStatusLevel2(id);
            switch(result.getStatusCode()) {
            
                case 201:
                    System.out.println(result.getResponse201()); // CompletedResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // SubmittedResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling Level2Api#getStatusLevel2");
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
 **id** | **String**| id returned by files create endpoint to poll and collect status of the query |

### Return type

GetStatusLevel2ResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |


## getTickHistoryFilesLevel2

> GetTickHistoryFilesLevel2ResponseWrapper getTickHistoryFilesLevel2(id, paginationLimit, paginationOffset)

Returns the tick history files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.Level2Api;
import com.factset.sdk.FactSetTickHistory.api.Level2Api.GetTickHistoryFilesLevel2ResponseWrapper;

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

        Level2Api apiInstance = new Level2Api(defaultClient);
        String id = "id_example"; // String | id returned by files create endpoint to poll and collect results of the query
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per response page
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            GetTickHistoryFilesLevel2ResponseWrapper result = apiInstance.getTickHistoryFilesLevel2(id, paginationLimit, paginationOffset);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // LeveltwoGetFilesResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // SubmittedResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling Level2Api#getTickHistoryFilesLevel2");
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
 **id** | **String**| id returned by files create endpoint to poll and collect results of the query |
 **paginationLimit** | **Integer**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type

GetTickHistoryFilesLevel2ResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **202** |  The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |


## getlevel2id

> SubmittedResponse getlevel2id(levelTwoRequest)

Returns the ID for the requested data.

Data available from past 6 years to current date.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.Level2Api;

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

        Level2Api apiInstance = new Level2Api(defaultClient);
        LevelTwoRequest levelTwoRequest = new LevelTwoRequest(); // LevelTwoRequest | 
        try {
            SubmittedResponse result = apiInstance.getlevel2id(levelTwoRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling Level2Api#getlevel2id");
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
 **levelTwoRequest** | [**LevelTwoRequest**](LevelTwoRequest.md)|  |

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

