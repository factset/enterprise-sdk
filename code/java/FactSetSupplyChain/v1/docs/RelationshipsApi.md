# RelationshipsApi

All URIs are relative to *https://api.factset.com/content/factset-supply-chain/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRelationships**](RelationshipsApi.md#getRelationships) | **GET** /relationships | Returns Supply Chain Relationships Data.
[**getRelationshipsForList**](RelationshipsApi.md#getRelationshipsForList) | **POST** /relationships | Returns Supply Chain Relationships Data.



## getRelationships

> RelationshipsResponse getRelationships(ids, relationshipType, companyType, relationshipDirection)

Returns Supply Chain Relationships Data.

Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap.


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
        String relationshipType = "COMPETITORS"; // String |  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** = An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \"Customer\" relationships.)   * **COMPETITORS** = An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** = An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \"Supplier\" relationships.)   * **PARTNERS** = An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company. 
        String companyType = "PUBLIC_COMPANIES_ONLY"; // String | Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies. 
        String relationshipDirection = "ALL"; // String | Filters the list of available relationship directions -   * **ALL** = Include both direct and reverse relationships.   * **DIRECT** = Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** = Include only relationships where the target company identified and named the connection to the source company. 
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
 **relationshipType** | **String**|  The category describing how the source company is connected to another organization. Use this parameter to filter results based on the business relationship type. Defined as:    * **SUPPLIERS** &#x3D; An organization that provides goods or services to the source company. The source company acts as the buyer in this relationship. (inverse of \&quot;Customer\&quot; relationships.)   * **COMPETITORS** &#x3D; An organization explicitly identified by the source company as a rival, usually operating in the same market or industry sector.   * **CUSTOMERS** &#x3D; An organization that receives goods or services from the source company. The source company acts as the seller in this relationship. (Reverse of \&quot;Supplier\&quot; relationships.)   * **PARTNERS** &#x3D; An organization in which the source company holds an ownership interest (i.e., the source company owns shares or equity in the partner). This is the counterpart to an investor relationship, where the external party has an ownership interest in the source company.  | [default to SUPPLIERS] [enum: COMPETITORS, CUSTOMERS, SUPPLIERS, PARTNERS]
 **companyType** | **String**| Specifies the category of companies to include when filtering results:   * **PUBLIC_COMPANIES_ONLY**: Include only relationships involving companies that are publicly traded.            * **PRIVATE_COMPANIES_ONLY**: Include only relationships involving companies that are privately held (not publicly traded).            * **ALL**: Include relationships involving both public and private companies.  | [optional] [default to PUBLIC_COMPANIES_ONLY] [enum: PUBLIC_COMPANIES_ONLY, PRIVATE_COMPANIES_ONLY, ALL]
 **relationshipDirection** | **String**| Filters the list of available relationship directions -   * **ALL** &#x3D; Include both direct and reverse relationships.   * **DIRECT** &#x3D; Include only relationships where the source company identified and named the connection to the target company.   * **REVERSE** &#x3D; Include only relationships where the target company identified and named the connection to the source company.  | [optional] [default to ALL] [enum: ALL, DIRECT, REVERSE]

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

Retrieves Supply Chain Relationship data (current only). Results are first sorted by the number of overlapping products between companies, then by the percentage of overlap.


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

