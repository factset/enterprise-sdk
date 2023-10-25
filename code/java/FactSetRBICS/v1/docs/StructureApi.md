# StructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getRbicsStructure**](StructureApi.md#getRbicsStructure) | **GET** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.
[**getRbicsStructureForList**](StructureApi.md#getRbicsStructureForList) | **POST** /factset-rbics/v1/structure | Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.



## getRbicsStructure

> StructureResponse getRbicsStructure(rbicsIds, level, includeNames, date)

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Understand the full RBICS Taxonomy Structure through time to help organize your analysis or facilitate the use of RBICS in application development.

Designed to overcome disparate and non-standardized company disclosures, the RBICS taxonomy is a normalized global industry classification consisting of a fourteen-by-six matrix. There are twelve economies with two specialty sectors, each with six incremental detailed layers, resulting in over 1,600 sector groups.

The top-levels' market-defined approach groups companies based on their behavioral similarities and stock price co-movement, while the patented product-based approach used in the lower levels enables the necessary precision to capture the specialty sectors of global markets.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.StructureApi;

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

        StructureApi apiInstance = new StructureApi(defaultClient);
        java.util.List<String> rbicsIds = Arrays.asList(); // java.util.List<String> | RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested. 
        Integer level = 1; // Integer | RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, '3' returns all levels 1,2 and 3. To request all levels, request level=6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629| 
        Boolean includeNames = true; // Boolean | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names.
        String date = "2017-07-24"; // String | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity.
        try {
            StructureResponse result = apiInstance.getRbicsStructure(rbicsIds, level, includeNames, date);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StructureApi#getRbicsStructure");
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
 **rbicsIds** | **List&lt;String&gt;**| RBICS Taxonomy Id Filter. Use to lookup the structure details for the Id requested.  | [optional]
 **level** | **Integer**| RBICS industry levels to include in the response. All levels from 1-N will be returned. For example, &#39;3&#39; returns all levels 1,2 and 3. To request all levels, request level&#x3D;6. Level 1 is returned by default.   |Level|Description|Number of Groups|   |---|---|---|   |1|Economomy|14|   |2|Sector|37   |3|Sub-Sector|109|   |4|Industry Group|366|   |5|Inudstry|901|   |6|Sub-Industry|1629|  | [optional]
 **includeNames** | **Boolean**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] [default to true]
 **date** | **String**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional]

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of Entity Focus Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getRbicsStructureForList

> StructureResponse getRbicsStructureForList(structureRequest)

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods.

Get the full RBICS Taxonomy Structure Ids, Names, and effective periods. POST method is optimal for requesting large lists of `rbicsIds`.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetRBICS.ApiClient;
import com.factset.sdk.FactSetRBICS.ApiException;
import com.factset.sdk.FactSetRBICS.Configuration;
import com.factset.sdk.FactSetRBICS.auth.*;
import com.factset.sdk.FactSetRBICS.models.*;
import com.factset.sdk.FactSetRBICS.api.StructureApi;

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

        StructureApi apiInstance = new StructureApi(defaultClient);
        StructureRequest structureRequest = new StructureRequest(); // StructureRequest | Request Body to request a list of RBICS Structure objects.
        try {
            StructureResponse result = apiInstance.getRbicsStructureForList(structureRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling StructureApi#getRbicsStructureForList");
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
 **structureRequest** | [**StructureRequest**](StructureRequest.md)| Request Body to request a list of RBICS Structure objects. |

### Return type

[**StructureResponse**](StructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of RBICS Structure Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

