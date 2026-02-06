# ProductCodesApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProducts**](ProductCodesApi.md#getProducts) | **GET** /products | Request the enumeration table for FactSet product codes.



## getProducts

> ProductsResponse getProducts(productCode, format, accessFilter)

Request the enumeration table for FactSet product codes.

Data can be returned in CSV, JSON or XML format, use the `format` parameter to change from the default JSON format. *You must be logged into the Developer Portal and obtain an **[API key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response.
 Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*


### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.ExchangeDataFeedDataModel.ApiClient;
import com.factset.sdk.ExchangeDataFeedDataModel.ApiException;
import com.factset.sdk.ExchangeDataFeedDataModel.Configuration;
import com.factset.sdk.ExchangeDataFeedDataModel.auth.*;
import com.factset.sdk.ExchangeDataFeedDataModel.models.*;
import com.factset.sdk.ExchangeDataFeedDataModel.api.ProductCodesApi;

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

        ProductCodesApi apiInstance = new ProductCodesApi(defaultClient);
        java.util.List<Integer> productCode = Arrays.asList(); // java.util.List<Integer> | Allows filtering of specific product codes in the response.
        String format = "json"; // String | The format of the output file.
        String accessFilter = "anyAccess"; // String | Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list.
        try {
            ProductsResponse result = apiInstance.getProducts(productCode, format, accessFilter);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling ProductCodesApi#getProducts");
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
 **productCode** | **List&lt;Integer&gt;**| Allows filtering of specific product codes in the response. | [optional]
 **format** | **String**| The format of the output file. | [optional] [enum: json, xml, csv]
 **accessFilter** | **String**| Allows filtering based on Real-Time, delayed, or both access types. **Omit** this parameter for the complete list. | [optional] [enum: anyAccess, realTime, delayed]

### Return type

[**ProductsResponse**](ProductsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response for the FactSet product codes table |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **402** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
| **404** | The provided endpoint is not valid. |  -  |
| **500** | Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |

