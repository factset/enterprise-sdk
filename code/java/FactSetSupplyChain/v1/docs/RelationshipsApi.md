# RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationships**](RelationshipsApi.md#getRelationships) | **GET** /relationships | Returns Supply Chain Relationships Data.
[**getRelationshipsForList**](RelationshipsApi.md#getRelationshipsForList) | **POST** /relationships | Returns Supply Chain Relationships Data.



## getRelationships

> RelationshipsResponse getRelationships(ids, relationshipType, companyType, relationshipDirection)

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage.


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
import com.factset.sdk.FactSetSupplyChain.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500 
        String relationshipType = "COMPETITORS"; // String | Specifies the type of relationship to filter the results  -   * **SUPPLIERS** = Entities from which the source company purchases goods or services; the opposite of “Customer” relationship.   * **COMPETITORS** = Entities disclosed by the source company as competitors.   * **CUSTOMERS** = Entities to which the source company sells products/services; the “opposite” of Supplier relationship.   * **PARTNERS** = Entities in which the source company owns an equity stake (“opposite” of an Investor relationship). 
        String companyType = "PUBLIC_COMPANIES_ONLY"; // String | Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** = Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** = Display private company relationships only.   * **ALL** = Display public and private company relationships. 
        String relationshipDirection = "ALL"; // String | Filters the list of available relationship directions -   * **ALL** = All relationship directions.   * **DIRECT** = Direct indicates that the source company named the relationship.   * **REVERSE** = Reverse indicates that the target company named the relationship. 
        try {
            RelationshipsResponse result = apiInstance.getRelationships(ids, relationshipType, companyType, relationshipDirection);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#getRelationships");
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
 **ids** | **List&lt;String&gt;**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. * Make Note - id limit of 500  |
 **relationshipType** | **String**| Specifies the type of relationship to filter the results  -   * **SUPPLIERS** &#x3D; Entities from which the source company purchases goods or services; the opposite of “Customer” relationship.   * **COMPETITORS** &#x3D; Entities disclosed by the source company as competitors.   * **CUSTOMERS** &#x3D; Entities to which the source company sells products/services; the “opposite” of Supplier relationship.   * **PARTNERS** &#x3D; Entities in which the source company owns an equity stake (“opposite” of an Investor relationship).  | [default to SUPPLIERS] [enum: COMPETITORS, CUSTOMERS, SUPPLIERS, PARTNERS]
 **companyType** | **String**| Specifies the type of companies to filter by  -   * **PUBLIC_COMPANIES_ONLY** &#x3D; Display public company relationships only.   * **PRIVATE_COMPANIES_ONLY** &#x3D; Display private company relationships only.   * **ALL** &#x3D; Display public and private company relationships.  | [optional] [default to PUBLIC_COMPANIES_ONLY] [enum: PUBLIC_COMPANIES_ONLY, PRIVATE_COMPANIES_ONLY, ALL]
 **relationshipDirection** | **String**| Filters the list of available relationship directions -   * **ALL** &#x3D; All relationship directions.   * **DIRECT** &#x3D; Direct indicates that the source company named the relationship.   * **REVERSE** &#x3D; Reverse indicates that the target company named the relationship.  | [optional] [default to ALL] [enum: ALL, DIRECT, REVERSE]

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches supply chain relationships data for the requested list of identifiers. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRelationshipsForList

> RelationshipsResponse getRelationshipsForList(relationshipsRequest)

Returns Supply Chain Relationships Data.

Returns Supply Chain Relationships Data. This data is sorted primarily by the number of overlapping products, followed by the overlap percentage.


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
import com.factset.sdk.FactSetSupplyChain.api.RelationshipsApi;

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

        RelationshipsApi apiInstance = new RelationshipsApi(defaultClient);
        RelationshipsRequest relationshipsRequest = new RelationshipsRequest(); // RelationshipsRequest | Request body to request a list of Supply Chain financials objects.
        try {
            RelationshipsResponse result = apiInstance.getRelationshipsForList(relationshipsRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling RelationshipsApi#getRelationshipsForList");
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
 **relationshipsRequest** | [**RelationshipsRequest**](RelationshipsRequest.md)| Request body to request a list of Supply Chain financials objects. |

### Return type

[**RelationshipsResponse**](RelationshipsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Supply Chain Relationships data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

