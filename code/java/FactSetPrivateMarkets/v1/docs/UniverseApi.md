# UniverseApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUniverse**](UniverseApi.md#getUniverse) | **GET** /factset-private-markets/v1/universe | Get Entity Candidates and Matches for a single name and attributes.
[**getUniverseForList**](UniverseApi.md#getUniverseForList) | **POST** /factset-private-markets/v1/universe | Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.



## getUniverse

> EntityMatchesResponse getUniverse(name, country)

Get Entity Candidates and Matches for a single name and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. <p>**Max of 1 Name permitted in a single GET request.** Use the POST method for /entity-match to fetch up to 25 names.</p><p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateMarkets.ApiClient;
import com.factset.sdk.FactSetPrivateMarkets.ApiException;
import com.factset.sdk.FactSetPrivateMarkets.Configuration;
import com.factset.sdk.FactSetPrivateMarkets.auth.*;
import com.factset.sdk.FactSetPrivateMarkets.models.*;
import com.factset.sdk.FactSetPrivateMarkets.api.UniverseApi;

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

        UniverseApi apiInstance = new UniverseApi(defaultClient);
        String name = "FactSet"; // String | Name of Entity to match.
        String country = "US"; // String | ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754).
        try {
            EntityMatchesResponse result = apiInstance.getUniverse(name, country);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniverseApi#getUniverse");
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
 **name** | **String**| Name of Entity to match. |
 **country** | **String**| ISO2 country code corresponding to the entity name that is used when evaluating candidates for a match. For a list of ISO2 Country codes, visit [OA 8754](https://my.apps.factset.com/oa/pages/8754). | [optional]

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Entity Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |


## getUniverseForList

> EntityMatchesResponse getUniverseForList(entityMatchRequest)

Get a list of Entity Candidates and Matches for a requested list of up to 25 names and attributes.

Finds the best candidate entities matching the given entity name. Country code can also be supplied to narrow the search. Finds the best candidate entities matching the given company name. <p>**Max of 25 Names inputted.**</p><p>


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetPrivateMarkets.ApiClient;
import com.factset.sdk.FactSetPrivateMarkets.ApiException;
import com.factset.sdk.FactSetPrivateMarkets.Configuration;
import com.factset.sdk.FactSetPrivateMarkets.auth.*;
import com.factset.sdk.FactSetPrivateMarkets.models.*;
import com.factset.sdk.FactSetPrivateMarkets.api.UniverseApi;

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

        UniverseApi apiInstance = new UniverseApi(defaultClient);
        EntityMatchRequest entityMatchRequest = new EntityMatchRequest(); // EntityMatchRequest | A request to match an Entity.
        try {
            EntityMatchesResponse result = apiInstance.getUniverseForList(entityMatchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling UniverseApi#getUniverseForList");
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
 **entityMatchRequest** | [**EntityMatchRequest**](EntityMatchRequest.md)| A request to match an Entity. |

### Return type

[**EntityMatchesResponse**](EntityMatchesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json;charset=utf-8, application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response containing Entity Match results. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

