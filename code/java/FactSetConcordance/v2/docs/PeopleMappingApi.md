# PeopleMappingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPeopleMappingDeleteForList**](PeopleMappingApi.md#getPeopleMappingDeleteForList) | **POST** /factset-concordance/v2/people-mapping-delete | Deletes mapping specified by the client.
[**getPeopleMappingForList**](PeopleMappingApi.md#getPeopleMappingForList) | **POST** /factset-concordance/v2/people-mapping | Saves a single-mapping specified by the client.
[**getPeopleUniverse**](PeopleMappingApi.md#getPeopleUniverse) | **GET** /factset-concordance/v2/people-universe | Retrieve all saved mappings within a requested universe
[**getPeopleUniverseForList**](PeopleMappingApi.md#getPeopleUniverseForList) | **POST** /factset-concordance/v2/people-universe | Retrieve all saved mappings within a requested universe or large list of client ids



## getPeopleMappingDeleteForList

> PeopleMappingDeleteResponse getPeopleMappingDeleteForList(entityMappingDeleteRequest)

Deletes mapping specified by the client.

Delete a Concordance Mapping to the client universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and universeId are required.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMappingApi;

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

        PeopleMappingApi apiInstance = new PeopleMappingApi(defaultClient);
        EntityMappingDeleteRequest entityMappingDeleteRequest = new EntityMappingDeleteRequest(); // EntityMappingDeleteRequest | A request to delete people mappings specified by the client
        try {
            PeopleMappingDeleteResponse result = apiInstance.getPeopleMappingDeleteForList(entityMappingDeleteRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMappingApi#getPeopleMappingDeleteForList");
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
 **entityMappingDeleteRequest** | [**EntityMappingDeleteRequest**](EntityMappingDeleteRequest.md)| A request to delete people mappings specified by the client |

### Return type

[**PeopleMappingDeleteResponse**](PeopleMappingDeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for the people-mapping-delete endpoint |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPeopleMappingForList

> PeopleMappingResponse getPeopleMappingForList(peopleMappingRequest)

Saves a single-mapping specified by the client.

Saves a single Concordance People Mapping to a given universe. When making a post, all exiting values are overwritten in the database with the values passed in the request. clientId and clientName are required.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMappingApi;

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

        PeopleMappingApi apiInstance = new PeopleMappingApi(defaultClient);
        PeopleMappingRequest peopleMappingRequest = new PeopleMappingRequest(); // PeopleMappingRequest | A request to create a single mapping.
        try {
            PeopleMappingResponse result = apiInstance.getPeopleMappingForList(peopleMappingRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMappingApi#getPeopleMappingForList");
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
 **peopleMappingRequest** | [**PeopleMappingRequest**](PeopleMappingRequest.md)| A request to create a single mapping. |

### Return type

[**PeopleMappingResponse**](PeopleMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Single people mapping |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPeopleUniverse

> PeopleUniverseResponse getPeopleUniverse(universeId, clientId, mapStatus, offset, limit)

Retrieve all saved mappings within a requested universe

Retrieves all people mappings within a requested universe.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMappingApi;

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

        PeopleMappingApi apiInstance = new PeopleMappingApi(defaultClient);
        Integer universeId = 1; // Integer | Universe identifier. *To create a universe, use the `/universe' endpoint.*
        java.util.List<String> clientId = Arrays.asList(); // java.util.List<String> | Filter by the clientId(s) created by the user in a previous mapping. 
        java.util.List<String> mapStatus = Arrays.asList(); // java.util.List<String> | Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping. 
        Integer offset = 0; // Integer | Starting row for records to return or rows to skip.
        Integer limit = 10; // Integer | Limits the number of records in the response.
        try {
            PeopleUniverseResponse result = apiInstance.getPeopleUniverse(universeId, clientId, mapStatus, offset, limit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMappingApi#getPeopleUniverse");
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
 **universeId** | **Integer**| Universe identifier. *To create a universe, use the &#x60;/universe&#39; endpoint.* |
 **clientId** | **List&lt;String&gt;**| Filter by the clientId(s) created by the user in a previous mapping.  | [optional]
 **mapStatus** | **List&lt;String&gt;**| Filter by the Entity Decisions that have the specified mapStatus, where -   * MAPPED - The requested Entity Name is successfully mapped to a FactSet Entity Id (-E)   * UNMAPPED - The requested Entity Name is unmapped by FactSet.   * INDETERMINATE - The requested Entity Name was unable to make a mapping.  | [optional] [enum: MAPPED, UNMAPPED, INDETERMINATE]
 **offset** | **Integer**| Starting row for records to return or rows to skip. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of records in the response. | [optional]

### Return type

[**PeopleUniverseResponse**](PeopleUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for FactSet Concordance Universe detail. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getPeopleUniverseForList

> PeopleUniverseResponse getPeopleUniverseForList(peopleUniverseRequest)

Retrieve all saved mappings within a requested universe or large list of client ids

Retrieves all people mappings that were saved in a given universe. Supports filtering by a large number of `clientId`s


### Example

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.PeopleMappingApi;

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

        PeopleMappingApi apiInstance = new PeopleMappingApi(defaultClient);
        PeopleUniverseRequest peopleUniverseRequest = new PeopleUniverseRequest(); // PeopleUniverseRequest | A request to fetch all entities of a given universe
        try {
            PeopleUniverseResponse result = apiInstance.getPeopleUniverseForList(peopleUniverseRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PeopleMappingApi#getPeopleUniverseForList");
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
 **peopleUniverseRequest** | [**PeopleUniverseRequest**](PeopleUniverseRequest.md)| A request to fetch all entities of a given universe |

### Return type

[**PeopleUniverseResponse**](PeopleUniverseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for FactSet Concordance Universe detail. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

