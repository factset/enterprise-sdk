# SupplyChainApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**listSupplyChain**](SupplyChainApi.md#listSupplyChain) | **GET** /supply-chain | Get supply chain relationships for requested entities.
[**listSupplyChainForList**](SupplyChainApi.md#listSupplyChainForList) | **POST** /supply-chain | Get supply chain relationships for a large list of entity IDs.



## listSupplyChain

> SupplyChainResponse listSupplyChain(ids, relationshipType, date, fields, batch, paginationLimit, paginationOffset)

Get supply chain relationships for requested entities.

Retrieve supplier and customer relationships for the requested
entity or entities.

Includes:

- subsidiaries
- revenue percentages
- relevance grades
- centrality measures
- relationship keywords

Use the `relationshipType` parameter to filter by:

- `CUSTOMER`
- `SUPPLIER`

Historical data can be accessed only with the Historical product
subscription. If the product is not subscribed, data for the latest
available period will be returned.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
import java.time.LocalDate;
// Import classes:
import com.factset.sdk.FactSetSupplyChain.ApiClient;
import com.factset.sdk.FactSetSupplyChain.ApiException;
import com.factset.sdk.FactSetSupplyChain.Configuration;
import com.factset.sdk.FactSetSupplyChain.auth.*;
import com.factset.sdk.FactSetSupplyChain.models.*;
import com.factset.sdk.FactSetSupplyChain.api.SupplyChainApi;

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

        SupplyChainApi apiInstance = new SupplyChainApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.<p><strong>IDs limit</strong> = 20 per non-batch request and 1000 per batch request.</p><p>Make note, <strong>GET</strong> Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective <strong>POST</strong> method.</p>
        SupplyChainRelationshipType relationshipType = SupplyChainRelationshipType.fromValue("CUSTOMER"); // SupplyChainRelationshipType | Controls the type of supply chain relationship returned.   * **CUSTOMER** = Returns entities to which the source company sells products/services.   * **SUPPLIER** = Returns entities from which the source company purchases goods or services.
        LocalDate date = LocalDate.parse("2025-12-31"); // LocalDate | The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint.
        java.util.Set<SupplyChainFieldsEnum> fields = Arrays.asList(); // java.util.Set<SupplyChainFieldsEnum> | A specific set of attributes to return in the response. If omitted, all fields are returned. 
        Batch batch = Batch.fromValue("Y"); // Batch | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request for up to 20 minutes. Upon requesting batch=Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding `/batch-status` endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the `/batch-result` endpoint. 
        Integer paginationLimit = 5; // Integer | Specifies the number of results to return per page.
        Integer paginationOffset = 0; // Integer | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results.
        try {
            SupplyChainResponse result = apiInstance.listSupplyChain(ids, relationshipType, date, fields, batch, paginationLimit, paginationOffset);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SupplyChainApi#listSupplyChain");
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
 **ids** | **List&lt;String&gt;**| The requested identifier. FactSet identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs.&lt;p&gt;&lt;strong&gt;IDs limit&lt;/strong&gt; &#x3D; 20 per non-batch request and 1000 per batch request.&lt;/p&gt;&lt;p&gt;Make note, &lt;strong&gt;GET&lt;/strong&gt; Method URL request lines are also limited to a total length of 8192 bytes (8 KB). In cases where the service allows for large numbers of IDs, which may lead to exceeding this request line limit of 8 KB, it is advised that requests with large request lines be made through the respective &lt;strong&gt;POST&lt;/strong&gt; method.&lt;/p&gt; |
 **relationshipType** | **SupplyChainRelationshipType**| Controls the type of supply chain relationship returned.   * **CUSTOMER** &#x3D; Returns entities to which the source company sells products/services.   * **SUPPLIER** &#x3D; Returns entities from which the source company purchases goods or services. | [optional] [default to CUSTOMER] [enum: CUSTOMER, SUPPLIER]
 **date** | **LocalDate**| The date requested in YYYY-MM-DD format. If left blank, the API will default to the most recent available data. Future dates (T+1) are not accepted in this endpoint. | [optional]
 **fields** | **List&lt;SupplyChainFieldsEnum&gt;**| A specific set of attributes to return in the response. If omitted, all fields are returned.  | [optional]
 **batch** | **Batch**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request for up to 20 minutes. Upon requesting batch&#x3D;Y, the service will respond with an HTTP Status Code of 202. Once a batch request is submitted, use the corresponding &#x60;/batch-status&#x60; endpoint to see if the job has been completed. Once completed, retrieve the results of the request via the &#x60;/batch-result&#x60; endpoint.  | [optional] [default to N] [enum: Y, N]
 **paginationLimit** | **Integer**| Specifies the number of results to return per page. | [optional] [default to 5]
 **paginationOffset** | **Integer**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing supply chain relationships for the requested entity IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |


## listSupplyChainForList

> SupplyChainResponse listSupplyChainForList(supplyChainRequest)

Get supply chain relationships for a large list of entity IDs.

Retrieve supplier and customer relationships for a large list of
entity IDs.

Includes:

- subsidiaries
- revenue percentages
- relevance grades
- centrality measures
- relationship keywords

Use the `relationshipType` parameter to filter by:

- `CUSTOMER`
- `SUPPLIER`

Historical data can be accessed only with the Historical product
subscription. If the product is not subscribed, data for the latest
available period will be returned.


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetSupplyChain.ApiClient;
import com.factset.sdk.FactSetSupplyChain.ApiException;
import com.factset.sdk.FactSetSupplyChain.Configuration;
import com.factset.sdk.FactSetSupplyChain.auth.*;
import com.factset.sdk.FactSetSupplyChain.models.*;
import com.factset.sdk.FactSetSupplyChain.api.SupplyChainApi;

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

        SupplyChainApi apiInstance = new SupplyChainApi(defaultClient);
        SupplyChainRequest supplyChainRequest = new SupplyChainRequest(); // SupplyChainRequest | The Supply Chain request body, allowing the user to specify a list of IDs.
        try {
            SupplyChainResponse result = apiInstance.listSupplyChainForList(supplyChainRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SupplyChainApi#listSupplyChainForList");
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
 **supplyChainRequest** | [**SupplyChainRequest**](SupplyChainRequest.md)| The Supply Chain request body, allowing the user to specify a list of IDs. |

### Return type

[**SupplyChainResponse**](SupplyChainResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response containing supply chain relationships for the large list of entity IDs. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

