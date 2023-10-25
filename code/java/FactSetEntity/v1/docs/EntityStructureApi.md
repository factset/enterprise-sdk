# EntityStructureApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getEntityStructure**](EntityStructureApi.md#getEntityStructure) | **GET** /factset-entity/v1/entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.
[**getUltimateEntityStructure**](EntityStructureApi.md#getUltimateEntityStructure) | **GET** /factset-entity/v1/ultimate-entity-structures | Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.
[**postEntityStructure**](EntityStructureApi.md#postEntityStructure) | **POST** /factset-entity/v1/entity-structures | Returns all active or inactive entities below the requested entity id.
[**postUltimateEntityStructure**](EntityStructureApi.md#postUltimateEntityStructure) | **POST** /factset-entity/v1/ultimate-entity-structures | Returns all active or inactive entities and respective levels below the requested entity id.



## getEntityStructure

> EntityStructureResponse getEntityStructure(ids, level, active)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities below the requested entity id.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.EntityStructureApi;

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

        EntityStructureApi apiInstance = new EntityStructureApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
        Integer level = -1; // Integer | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
        Integer active = -1; // Integer | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
        try {
            EntityStructureResponse result = apiInstance.getEntityStructure(ids, level, active);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityStructureApi#getEntityStructure");
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
 **ids** | **List&lt;String&gt;**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **level** | **Integer**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **Integer**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Entity Structure |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getUltimateEntityStructure

> UltimateEntityStructureResponse getUltimateEntityStructure(ids, level, active)

Returns the full ultimate parent entity hiearachy. Control levels and active status of underlying entities.

Returns full ultimate entity structure including ultimate parent and all subordinates. Will accept entity from any level of entity structure or active vs. inactive status of entity.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.EntityStructureApi;

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

        EntityStructureApi apiInstance = new EntityStructureApi(defaultClient);
        java.util.List<String> ids = Arrays.asList(); // java.util.List<String> | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 100 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
        Integer level = -1; // Integer | Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level.
        Integer active = -1; // Integer | Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive.
        try {
            UltimateEntityStructureResponse result = apiInstance.getUltimateEntityStructure(ids, level, active);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityStructureApi#getUltimateEntityStructure");
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
 **ids** | **List&lt;String&gt;**| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 100 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  |
 **level** | **Integer**| Controls the levels returned in the hierarchy. Use -1 to return all levels, or 1-n for a specific level. | [optional] [default to -1]
 **active** | **Integer**| Controls active or inactive securities returned in the hierarchy. Enter 1 to return only active entities, 0 for inactive entities, and -1 for all active and inactive. | [optional] [default to -1]

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Ultimate Entity Structure data for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postEntityStructure

> EntityStructureResponse postEntityStructure(entityStructureRequest)

Returns all active or inactive entities below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.EntityStructureApi;

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

        EntityStructureApi apiInstance = new EntityStructureApi(defaultClient);
        EntityStructureRequest entityStructureRequest = new EntityStructureRequest(); // EntityStructureRequest | Request Body to request a list of Entity Structure objects.
        try {
            EntityStructureResponse result = apiInstance.postEntityStructure(entityStructureRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityStructureApi#postEntityStructure");
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
 **entityStructureRequest** | [**EntityStructureRequest**](EntityStructureRequest.md)| Request Body to request a list of Entity Structure objects. |

### Return type

[**EntityStructureResponse**](EntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Entity Structure data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## postUltimateEntityStructure

> UltimateEntityStructureResponse postUltimateEntityStructure(ultimateEntityStructureRequest)

Returns all active or inactive entities and respective levels below the requested entity id.

Returns all active or inactive entities and respective levels below the requested entity id.


### Example

```java
// Import classes:
import com.factset.sdk.FactSetEntity.ApiClient;
import com.factset.sdk.FactSetEntity.ApiException;
import com.factset.sdk.FactSetEntity.Configuration;
import com.factset.sdk.FactSetEntity.auth.*;
import com.factset.sdk.FactSetEntity.models.*;
import com.factset.sdk.FactSetEntity.api.EntityStructureApi;

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

        EntityStructureApi apiInstance = new EntityStructureApi(defaultClient);
        UltimateEntityStructureRequest ultimateEntityStructureRequest = new UltimateEntityStructureRequest(); // UltimateEntityStructureRequest | Request Body to request a list of Ultimate Entity Structure objects.
        try {
            UltimateEntityStructureResponse result = apiInstance.postUltimateEntityStructure(ultimateEntityStructureRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling EntityStructureApi#postUltimateEntityStructure");
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
 **ultimateEntityStructureRequest** | [**UltimateEntityStructureRequest**](UltimateEntityStructureRequest.md)| Request Body to request a list of Ultimate Entity Structure objects. |

### Return type

[**UltimateEntityStructureResponse**](UltimateEntityStructureResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ultimate Entity Structure data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

