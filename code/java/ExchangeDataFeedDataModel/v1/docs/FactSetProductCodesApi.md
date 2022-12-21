# FactSetProductCodesApi

All URIs are relative to *https://api.factset.com/RTDataModel*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getProducts**](FactSetProductCodesApi.md#getProducts) | **GET** /products | Request the enumeration table for FactSet product codes.



## getProducts

> RTDataModelProducts getProducts(format)

Request the enumeration table for FactSet product codes.


Data can be returned in CSV, JSON or XML format, use the `format` parameter to chnage from the default JSON format.
 

'*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*'


### Example

```java
// Import classes:
import com.factset.sdk.ExchangeDataFeedDataModel.ApiClient;
import com.factset.sdk.ExchangeDataFeedDataModel.ApiException;
import com.factset.sdk.ExchangeDataFeedDataModel.Configuration;
import com.factset.sdk.ExchangeDataFeedDataModel.auth.*;
import com.factset.sdk.ExchangeDataFeedDataModel.models.*;
import com.factset.sdk.ExchangeDataFeedDataModel.api.FactSetProductCodesApi;

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

        FactSetProductCodesApi apiInstance = new FactSetProductCodesApi(defaultClient);
        String format = "xml"; // String | The format of the output file.<p>**Try it Out** - All formats available</p>
        try {
            RTDataModelProducts result = apiInstance.getProducts(format);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling FactSetProductCodesApi#getProducts");
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
 **format** | **String**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to json] [enum: xml, json, csv]

### Return type

[**RTDataModelProducts**](RTDataModelProducts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response for the FactSet product codes table |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **402** | Invalid method. |  -  |
| **404** | The provided report name is not valid. |  -  |

