# CompanyApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyBoardListByInstrument**](CompanyApi.md#getCompanyBoardListByInstrument) | **GET** /company/board/listByInstrument | List of boards for a company, with their officers.
[**getCompanyBoardOfficerFunctionDeliveryList**](CompanyApi.md#getCompanyBoardOfficerFunctionDeliveryList) | **GET** /company/board/officer/function/delivery/list | List of officer functions as provided by a delivery.
[**getCompanyBoardTypeList**](CompanyApi.md#getCompanyBoardTypeList) | **GET** /company/board/type/list | List of company board types.
[**postCompanyEstimatesListByInstrument**](CompanyApi.md#postCompanyEstimatesListByInstrument) | **POST** /company/estimates/listByInstrument | Estimates for selected figures for a stock.



## getCompanyBoardListByInstrument

> InlineResponse2003 getCompanyBoardListByInstrument(id, attributes, language)

List of boards for a company, with their officers.

List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String id = "id_example"; // String | Identifier of the instrument representing company shares.Any other instrument yields empty values.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2003 result = apiInstance.getCompanyBoardListByInstrument(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyBoardListByInstrument");
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
 **id** | **String**| Identifier of the instrument representing company shares.Any other instrument yields empty values. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCompanyBoardOfficerFunctionDeliveryList

> InlineResponse2004 getCompanyBoardOfficerFunctionDeliveryList(attributes, language)

List of officer functions as provided by a delivery.

List of officer functions as provided by a delivery.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2004 result = apiInstance.getCompanyBoardOfficerFunctionDeliveryList(attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyBoardOfficerFunctionDeliveryList");
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
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getCompanyBoardTypeList

> InlineResponse2005 getCompanyBoardTypeList(attributes, language)

List of company board types.

List of company board types.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse2005 result = apiInstance.getCompanyBoardTypeList(attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyBoardTypeList");
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
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postCompanyEstimatesListByInstrument

> InlineResponse200 postCompanyEstimatesListByInstrument(body)

Estimates for selected figures for a stock.

Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint `/instrument/category/list` using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example

```java
// Import classes:
import com.factset.sdk.StocksAPIforDigitalPortals.ApiClient;
import com.factset.sdk.StocksAPIforDigitalPortals.ApiException;
import com.factset.sdk.StocksAPIforDigitalPortals.Configuration;
import com.factset.sdk.StocksAPIforDigitalPortals.auth.*;
import com.factset.sdk.StocksAPIforDigitalPortals.models.*;
import com.factset.sdk.StocksAPIforDigitalPortals.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse200 result = apiInstance.postCompanyEstimatesListByInstrument(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#postCompanyEstimatesListByInstrument");
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
 **body** | [**InlineObject**](InlineObject.md)|  | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

