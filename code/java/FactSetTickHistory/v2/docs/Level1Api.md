# Level1Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getId**](Level1Api.md#getId) | **POST** /level1/files/create | Returns the ID for the requested data.
[**getStatusLevel1**](Level1Api.md#getStatusLevel1) | **GET** /level1/files/status | Returns the status of the ID
[**getTickHistoryCoverage**](Level1Api.md#getTickHistoryCoverage) | **GET** /level1/coverage | Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
[**getTickHistoryFiles**](Level1Api.md#getTickHistoryFiles) | **GET** /level1/files/get | Returns the tick history files requested in the /create endpoint



## getId

> SubmittedResponse getId(leveloneRequest)

Returns the ID for the requested data.

Data available from 20120101 to current date.

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.Level1Api;

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

        Level1Api apiInstance = new Level1Api(defaultClient);
        LeveloneRequest leveloneRequest = new LeveloneRequest(); // LeveloneRequest | 
        try {
            SubmittedResponse result = apiInstance.getId(leveloneRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling Level1Api#getId");
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
 **leveloneRequest** | [**LeveloneRequest**](LeveloneRequest.md)|  |

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
| **202** | The Request has been Accepted |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |


## getStatusLevel1

> GetStatusLevel1ResponseWrapper getStatusLevel1(id)

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
import com.factset.sdk.FactSetTickHistory.api.Level1Api;
import com.factset.sdk.FactSetTickHistory.api.Level1Api.GetStatusLevel1ResponseWrapper;

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

        Level1Api apiInstance = new Level1Api(defaultClient);
        String id = "id_example"; // String | id returned by files create endpoint to poll and collect status of the query
        try {
            GetStatusLevel1ResponseWrapper result = apiInstance.getStatusLevel1(id);
            switch(result.getStatusCode()) {
            
                case 201:
                    System.out.println(result.getResponse201()); // CompletedResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // SubmittedResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling Level1Api#getStatusLevel1");
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

GetStatusLevel1ResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |


## getTickHistoryCoverage

> CoverageResponse getTickHistoryCoverage(tickers, factsetExchangeCode, isins)

Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.

Returns coverage for specified tickers for Level1 Data

### Example

```java
// Import classes:
import com.factset.sdk.FactSetTickHistory.ApiClient;
import com.factset.sdk.FactSetTickHistory.ApiException;
import com.factset.sdk.FactSetTickHistory.Configuration;
import com.factset.sdk.FactSetTickHistory.auth.*;
import com.factset.sdk.FactSetTickHistory.models.*;
import com.factset.sdk.FactSetTickHistory.api.Level1Api;

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

        Level1Api apiInstance = new Level1Api(defaultClient);
        java.util.List<String> tickers = Arrays.asList(); // java.util.List<String> | <P> The requested list of one or more tickers.</p>   The `tickers` and `isins`  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   <P> Maximum 10 tickers per request</p>     
        String factsetExchangeCode = "AUS"; // String | <p>This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.</p> **NOTE**:Does not support multiple factsetExchangeCodes
        java.util.List<String> isins = Arrays.asList(); // java.util.List<String> | <P> Specifies the ISIN of the record. </p>    Please enter either the `tickers` or `isins` parameter.     <P> Maximum 10 ISINs per request.</p>      
        try {
            CoverageResponse result = apiInstance.getTickHistoryCoverage(tickers, factsetExchangeCode, isins);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling Level1Api#getTickHistoryCoverage");
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
 **tickers** | **List&lt;String&gt;**| &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      | [optional]
 **factsetExchangeCode** | **String**| &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes | [optional]
 **isins** | **List&lt;String&gt;**| &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       | [optional]

### Return type

[**CoverageResponse**](CoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |


## getTickHistoryFiles

> GetTickHistoryFilesResponseWrapper getTickHistoryFiles(id, paginationLimit, paginationOffset)

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
import com.factset.sdk.FactSetTickHistory.api.Level1Api;
import com.factset.sdk.FactSetTickHistory.api.Level1Api.GetTickHistoryFilesResponseWrapper;

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

        Level1Api apiInstance = new Level1Api(defaultClient);
        String id = "id_example"; // String | id returned by files create endpoint to poll and collect results of the query
        Integer paginationLimit = 20; // Integer | Specifies the maximum number of results to return per response page
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
        try {
            GetTickHistoryFilesResponseWrapper result = apiInstance.getTickHistoryFiles(id, paginationLimit, paginationOffset);
            switch(result.getStatusCode()) {
            
                case 200:
                    System.out.println(result.getResponse200()); // GetFilesResponse
            
                case 202:
                    System.out.println(result.getResponse202()); // SubmittedResponse
            
            }

        } catch (ApiException e) {
            System.err.println("Exception when calling Level1Api#getTickHistoryFiles");
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

GetTickHistoryFilesResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

