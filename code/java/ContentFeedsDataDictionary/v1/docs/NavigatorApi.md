# NavigatorApi

All URIs are relative to *https://api.factset.com/data-dictionary*

Method | HTTP request | Description
------------- | ------------- | -------------
[**navigatorBasicSearchPost**](NavigatorApi.md#navigatorBasicSearchPost) | **POST** /navigator/basic_search | Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.
[**navigatorDataItemsProductIdGet**](NavigatorApi.md#navigatorDataItemsProductIdGet) | **GET** /navigator/data_items/{Product_id} | Get the list of data items associated with a product for Navigator.
[**navigatorProductsGet**](NavigatorApi.md#navigatorProductsGet) | **GET** /navigator/products | Get the list of products for Navigator.
[**navigatorSourcesDataItemIdGet**](NavigatorApi.md#navigatorSourcesDataItemIdGet) | **GET** /navigator/sources/{DataItem_id} | Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.
[**navigatorSourcesGet**](NavigatorApi.md#navigatorSourcesGet) | **GET** /navigator/sources | Get a list of sources by delivery method for the given product_id
[**navigatorTableFieldsTableIdGet**](NavigatorApi.md#navigatorTableFieldsTableIdGet) | **GET** /navigator/table_fields/{Table_id} | Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.



## navigatorBasicSearchPost

> BasicSearchResponse navigatorBasicSearchPost(basicSearchRequest)

Returns the data items (along with the products they belong to) that contain at least one of the search terms as a substring of either their name or description.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        BasicSearchRequest basicSearchRequest = new BasicSearchRequest(); // BasicSearchRequest | A list of search terms (each term must be at least two characters).
        try {
            BasicSearchResponse result = apiInstance.navigatorBasicSearchPost(basicSearchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorBasicSearchPost");
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
 **basicSearchRequest** | [**BasicSearchRequest**](BasicSearchRequest.md)| A list of search terms (each term must be at least two characters). |

### Return type

[**BasicSearchResponse**](BasicSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **400** | The request body was not formatted properly. |  -  |
| **401** | You are not authorized to view this page. |  -  |


## navigatorDataItemsProductIdGet

> java.util.List<DataItem> navigatorDataItemsProductIdGet(productId)

Get the list of data items associated with a product for Navigator.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        String productId = "productId_example"; // String | The id for the Product to fetch the list of data items for.
        try {
            java.util.List<DataItem> result = apiInstance.navigatorDataItemsProductIdGet(productId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorDataItemsProductIdGet");
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
 **productId** | **String**| The id for the Product to fetch the list of data items for. |

### Return type

[**java.util.List&lt;DataItem&gt;**](DataItem.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified Product_id was not found. |  -  |


## navigatorProductsGet

> java.util.List<Product> navigatorProductsGet()

Get the list of products for Navigator.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        try {
            java.util.List<Product> result = apiInstance.navigatorProductsGet();
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorProductsGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**java.util.List&lt;Product&gt;**](Product.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |


## navigatorSourcesDataItemIdGet

> NavigatorSourcesResponse navigatorSourcesDataItemIdGet(dataItemId, productId)

Get a list of sources where the specified data item can be found, for each delivery method, filtered to the appearances of the given data item within the specified product.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        String dataItemId = "dataItemId_example"; // String | The id for the DataItem to fetch the sources for.
        String productId = "productId_example"; // String | The id for the Product to filter down the sources returned on.
        try {
            NavigatorSourcesResponse result = apiInstance.navigatorSourcesDataItemIdGet(dataItemId, productId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorSourcesDataItemIdGet");
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
 **dataItemId** | **String**| The id for the DataItem to fetch the sources for. |
 **productId** | **String**| The id for the Product to filter down the sources returned on. |

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified DataItem_id was not found. |  -  |


## navigatorSourcesGet

> NavigatorSourcesResponse navigatorSourcesGet(productId)

Get a list of sources by delivery method for the given product_id

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        String productId = "productId_example"; // String | The id for the Product to filter down the sources returned on.
        try {
            NavigatorSourcesResponse result = apiInstance.navigatorSourcesGet(productId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorSourcesGet");
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
 **productId** | **String**| The id for the Product to filter down the sources returned on. |

### Return type

[**NavigatorSourcesResponse**](NavigatorSourcesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified DataItem_id was not found. |  -  |


## navigatorTableFieldsTableIdGet

> TableCodeFieldInfoResponse navigatorTableFieldsTableIdGet(tableId, dataItemId)

Get the list of fields associated with a table for Navigator, and the code information for the specified data item, if applicable.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ContentFeedsDataDictionary.ApiClient;
import com.factset.sdk.ContentFeedsDataDictionary.ApiException;
import com.factset.sdk.ContentFeedsDataDictionary.Configuration;
import com.factset.sdk.ContentFeedsDataDictionary.auth.*;
import com.factset.sdk.ContentFeedsDataDictionary.models.*;
import com.factset.sdk.ContentFeedsDataDictionary.api.NavigatorApi;

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

        NavigatorApi apiInstance = new NavigatorApi(defaultClient);
        String tableId = "tableId_example"; // String | The id for the Table to fetch the fields for.
        String dataItemId = "dataItemId_example"; // String | The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds.
        try {
            TableCodeFieldInfoResponse result = apiInstance.navigatorTableFieldsTableIdGet(tableId, dataItemId);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling NavigatorApi#navigatorTableFieldsTableIdGet");
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
 **tableId** | **String**| The id for the Table to fetch the fields for. |
 **dataItemId** | **String**| The id for the DataItem. This is required in case the data item is represented as a code in Standard DataFeeds. | [optional]

### Return type

[**TableCodeFieldInfoResponse**](TableCodeFieldInfoResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation. |  -  |
| **401** | You are not authorized to view this page. |  -  |
| **404** | The specified Table_id was not found. |  -  |

