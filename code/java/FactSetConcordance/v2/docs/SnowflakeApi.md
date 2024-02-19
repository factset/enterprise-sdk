# SnowflakeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getSnowflakeEntityMatchForList**](SnowflakeApi.md#getSnowflakeEntityMatchForList) | **POST** /factset-concordance/v2/snowflake-entity-match | Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.
[**snowflakeEntityMappingPost**](SnowflakeApi.md#snowflakeEntityMappingPost) | **POST** /factset-concordance/v2/snowflake-entity-mapping | Save entity mappings to a universe



## getSnowflakeEntityMatchForList

> SnowflakeEntityMatchResponse getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest)

Perform an entity search and return a snowflake-friendly response. Up to 25 Names per request.

Finds the best candidate entities matching the given company name. Additional attributes can be supplied to narrow the search. *This endpoint is used natively within Snowflake and is not to be consumed directly by users. Reach out to your FactSet Account team to learn more about Concordance in Snowflake.*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.SnowflakeApi;

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

        SnowflakeApi apiInstance = new SnowflakeApi(defaultClient);
        SnowflakeEntityMatchRequest snowflakeEntityMatchRequest = new SnowflakeEntityMatchRequest(); // SnowflakeEntityMatchRequest | A request to match an entity name and its attributes within Snowflake.
        try {
            SnowflakeEntityMatchResponse result = apiInstance.getSnowflakeEntityMatchForList(snowflakeEntityMatchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SnowflakeApi#getSnowflakeEntityMatchForList");
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
 **snowflakeEntityMatchRequest** | [**SnowflakeEntityMatchRequest**](SnowflakeEntityMatchRequest.md)| A request to match an entity name and its attributes within Snowflake. |

### Return type

[**SnowflakeEntityMatchResponse**](SnowflakeEntityMatchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response object for the entity-match object in a snowflake friendly response model. |  -  |


## snowflakeEntityMappingPost

> SnowflakeEntityMappingResponse snowflakeEntityMappingPost(snowflakeEntityMappingRequest)

Save entity mappings to a universe

Manually save or update entity mappings with metadata

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.FactSetConcordance.ApiClient;
import com.factset.sdk.FactSetConcordance.ApiException;
import com.factset.sdk.FactSetConcordance.Configuration;
import com.factset.sdk.FactSetConcordance.auth.*;
import com.factset.sdk.FactSetConcordance.models.*;
import com.factset.sdk.FactSetConcordance.api.SnowflakeApi;

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

        SnowflakeApi apiInstance = new SnowflakeApi(defaultClient);
        SnowflakeEntityMappingRequest snowflakeEntityMappingRequest = new SnowflakeEntityMappingRequest(); // SnowflakeEntityMappingRequest | A request to save entity mappings to a universe
        try {
            SnowflakeEntityMappingResponse result = apiInstance.snowflakeEntityMappingPost(snowflakeEntityMappingRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling SnowflakeApi#snowflakeEntityMappingPost");
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
 **snowflakeEntityMappingRequest** | [**SnowflakeEntityMappingRequest**](SnowflakeEntityMappingRequest.md)| A request to save entity mappings to a universe |

### Return type

[**SnowflakeEntityMappingResponse**](SnowflakeEntityMappingResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | Response object according to snowflake external function spec |  -  |

