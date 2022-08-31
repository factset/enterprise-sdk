# PortfolioApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getPortfolioGet**](PortfolioApi.md#getPortfolioGet) | **GET** /portfolio/get | Details of a portfolio.
[**getPortfolioList**](PortfolioApi.md#getPortfolioList) | **GET** /portfolio/list | List of portfolios with keyfigures.
[**getPortfolioNameList**](PortfolioApi.md#getPortfolioNameList) | **GET** /portfolio/name/list | List of portfolios.
[**getPortfolioPositionList**](PortfolioApi.md#getPortfolioPositionList) | **GET** /portfolio/position/list | List all open positions of a portfolio.
[**getPortfolioTransactionList**](PortfolioApi.md#getPortfolioTransactionList) | **GET** /portfolio/transaction/list | List of transactions in a portfolio.
[**postPortfolioCreate**](PortfolioApi.md#postPortfolioCreate) | **POST** /portfolio/create | Create a portfolio.
[**postPortfolioDelete**](PortfolioApi.md#postPortfolioDelete) | **POST** /portfolio/delete | Delete a portfolio.
[**postPortfolioEvaluationList**](PortfolioApi.md#postPortfolioEvaluationList) | **POST** /portfolio/evaluation/list | Evaluate a portfolio.
[**postPortfolioModify**](PortfolioApi.md#postPortfolioModify) | **POST** /portfolio/modify | Modify a portfolio.
[**postPortfolioPayoutCreate**](PortfolioApi.md#postPortfolioPayoutCreate) | **POST** /portfolio/payout/create | Add a payout to a portfolio.
[**postPortfolioPayoutDelete**](PortfolioApi.md#postPortfolioPayoutDelete) | **POST** /portfolio/payout/delete | Delete a payout of a portfolio.
[**postPortfolioPayoutList**](PortfolioApi.md#postPortfolioPayoutList) | **POST** /portfolio/payout/list | List of payouts in a portfolio.
[**postPortfolioPayoutModify**](PortfolioApi.md#postPortfolioPayoutModify) | **POST** /portfolio/payout/modify | Modify a payout in a portfolio.
[**postPortfolioPositionClosedList**](PortfolioApi.md#postPortfolioPositionClosedList) | **POST** /portfolio/position/closed/list | List all closed positions of a portfolio.
[**postPortfolioTransactionCashCreate**](PortfolioApi.md#postPortfolioTransactionCashCreate) | **POST** /portfolio/transaction/cash/create | Add a cash transaction to a portfolio.
[**postPortfolioTransactionCashDelete**](PortfolioApi.md#postPortfolioTransactionCashDelete) | **POST** /portfolio/transaction/cash/delete | Delete a cash transaction.
[**postPortfolioTransactionCreate**](PortfolioApi.md#postPortfolioTransactionCreate) | **POST** /portfolio/transaction/create | Add a transaction to a portfolio.
[**postPortfolioTransactionDelete**](PortfolioApi.md#postPortfolioTransactionDelete) | **POST** /portfolio/transaction/delete | Delete a transaction of a portfolio.
[**postPortfolioTransactionModify**](PortfolioApi.md#postPortfolioTransactionModify) | **POST** /portfolio/transaction/modify | Modify a transaction in a portfolio.



## getPortfolioGet

> InlineResponse2001 getPortfolioGet(id, attributes)

Details of a portfolio.

Details of a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2001 result = apiInstance.getPortfolioGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPortfolioGet");
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPortfolioList

> InlineResponse2002 getPortfolioList(attributes, sort)

List of portfolios with keyfigures.

List of portfolios with keyfigures.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2002 result = apiInstance.getPortfolioList(attributes, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPortfolioList");
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPortfolioNameList

> InlineResponse2005 getPortfolioNameList(attributes, sort)

List of portfolios.

List of portfolios.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed.
        try {
            InlineResponse2005 result = apiInstance.getPortfolioNameList(attributes, sort);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPortfolioNameList");
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
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: id, -id, name, -name]

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


## getPortfolioPositionList

> InlineResponse2009 getPortfolioPositionList(id, attributes, language, sort, paginationOffset, paginationLimit)

List all open positions of a portfolio.

List all open positions of a portfolio.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse2009 result = apiInstance.getPortfolioPositionList(id, attributes, language, sort, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPortfolioPositionList");
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 10 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: positions.instrument.name, -positions.instrument.name, positions.instrument.shortName, -positions.instrument.shortName, positions.instrument.assetClass.code, -positions.instrument.assetClass.code, positions.instrument.type.name, -positions.instrument.type.name, positions.shares.open, -positions.shares.open, positions.purchase.value, -positions.purchase.value, positions.value, -positions.value, positions.weight, -positions.weight, positions.profitLoss.intraday.absolute, -positions.profitLoss.intraday.absolute, positions.profitLoss.intraday.relative, -positions.profitLoss.intraday.relative, positions.profitLoss.potential.absolute, -positions.profitLoss.potential.absolute, positions.profitLoss.potential.relative, -positions.profitLoss.potential.relative]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse2009**](InlineResponse2009.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getPortfolioTransactionList

> InlineResponse20011 getPortfolioTransactionList(id, attributes, language, sort, paginationOffset, paginationLimit)

List of transactions in a portfolio.

List of transactions in a portfolio.

### Example

```java
import java.math.BigDecimal;
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        String id = "id_example"; // String | 
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | 
        java.util.Set<String> sort = Arrays.asList(); // java.util.Set<String> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed.
        BigDecimal paginationOffset = new BigDecimal("0"); // BigDecimal | Non-negative number of entries to skip, or 0 (default).
        BigDecimal paginationLimit = new BigDecimal("20"); // BigDecimal | Non-negative maximum number of entries to return.
        try {
            InlineResponse20011 result = apiInstance.getPortfolioTransactionList(id, attributes, language, sort, paginationOffset, paginationLimit);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#getPortfolioTransactionList");
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
 **id** | **String**|  |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**|  | [optional]
 **sort** | **List&lt;String&gt;**| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | [optional] [enum: instrument.name, -instrument.name, instrument.shortName, -instrument.shortName, instrument.assetClass.code, -instrument.assetClass.code, instrument.type.name, -instrument.type.name, type, -type, time, -time, numberShares, -numberShares]
 **paginationOffset** | **BigDecimal**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0]
 **paginationLimit** | **BigDecimal**| Non-negative maximum number of entries to return. | [optional] [default to 20]

### Return type

[**InlineResponse20011**](InlineResponse20011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioCreate

> InlineResponse201 postPortfolioCreate(inlineObject)

Create a portfolio.

Create a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|The number of portfolios would exceed 100.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject inlineObject = new InlineObject(); // InlineObject | 
        try {
            InlineResponse201 result = apiInstance.postPortfolioCreate(inlineObject);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioCreate");
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
 **inlineObject** | [**InlineObject**](InlineObject.md)|  |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## postPortfolioDelete

> InlineResponse200 postPortfolioDelete(inlineObject1)

Delete a portfolio.

Delete a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject1 inlineObject1 = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse200 result = apiInstance.postPortfolioDelete(inlineObject1);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioDelete");
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
 **inlineObject1** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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


## postPortfolioEvaluationList

> InlineResponse2004 postPortfolioEvaluationList(inlineObject3)

Evaluate a portfolio.

Performs an evaluation over a period of time and returns portfolio key figures for each day, week, or month.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject3 inlineObject3 = new InlineObject3(); // InlineObject3 | 
        try {
            InlineResponse2004 result = apiInstance.postPortfolioEvaluationList(inlineObject3);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioEvaluationList");
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
 **inlineObject3** | [**InlineObject3**](InlineObject3.md)|  | [optional]

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioModify

> InlineResponse2003 postPortfolioModify(inlineObject2)

Modify a portfolio.

Modify a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject2 inlineObject2 = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2003 result = apiInstance.postPortfolioModify(inlineObject2);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioModify");
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
 **inlineObject2** | [**InlineObject2**](InlineObject2.md)|  | [optional]

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioPayoutCreate

> InlineResponse2011 postPortfolioPayoutCreate(inlineObject4)

Add a payout to a portfolio.

Add a payout to a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject4 inlineObject4 = new InlineObject4(); // InlineObject4 | 
        try {
            InlineResponse2011 result = apiInstance.postPortfolioPayoutCreate(inlineObject4);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioPayoutCreate");
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
 **inlineObject4** | [**InlineObject4**](InlineObject4.md)|  | [optional]

### Return type

[**InlineResponse2011**](InlineResponse2011.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## postPortfolioPayoutDelete

> InlineResponse2006 postPortfolioPayoutDelete(inlineObject5)

Delete a payout of a portfolio.

Delete a payout of a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|Invalid payout identifier.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject5 inlineObject5 = new InlineObject5(); // InlineObject5 | 
        try {
            InlineResponse2006 result = apiInstance.postPortfolioPayoutDelete(inlineObject5);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioPayoutDelete");
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
 **inlineObject5** | [**InlineObject5**](InlineObject5.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioPayoutList

> InlineResponse2007 postPortfolioPayoutList(inlineObject6)

List of payouts in a portfolio.

List of payouts in a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject6 inlineObject6 = new InlineObject6(); // InlineObject6 | 
        try {
            InlineResponse2007 result = apiInstance.postPortfolioPayoutList(inlineObject6);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioPayoutList");
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
 **inlineObject6** | [**InlineObject6**](InlineObject6.md)|  |

### Return type

[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioPayoutModify

> InlineResponse2008 postPortfolioPayoutModify(inlineObject7)

Modify a payout in a portfolio.

Modify a payout in a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|At least one of the parameters `notation`, `type`, `amount`, `transaction` or `time` must be set.|400 Bad Request|
|Invalid payout identifier.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject7 inlineObject7 = new InlineObject7(); // InlineObject7 | 
        try {
            InlineResponse2008 result = apiInstance.postPortfolioPayoutModify(inlineObject7);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioPayoutModify");
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
 **inlineObject7** | [**InlineObject7**](InlineObject7.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioPositionClosedList

> InlineResponse20010 postPortfolioPositionClosedList(inlineObject8)

List all closed positions of a portfolio.

List all closed positions of a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject8 inlineObject8 = new InlineObject8(); // InlineObject8 | 
        try {
            InlineResponse20010 result = apiInstance.postPortfolioPositionClosedList(inlineObject8);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioPositionClosedList");
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
 **inlineObject8** | [**InlineObject8**](InlineObject8.md)|  | [optional]

### Return type

[**InlineResponse20010**](InlineResponse20010.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioTransactionCashCreate

> InlineResponse2012 postPortfolioTransactionCashCreate(inlineObject12)

Add a cash transaction to a portfolio.

Add a cash transaction to a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|The number of transactions would exceed 1000.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject12 inlineObject12 = new InlineObject12(); // InlineObject12 | 
        try {
            InlineResponse2012 result = apiInstance.postPortfolioTransactionCashCreate(inlineObject12);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioTransactionCashCreate");
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
 **inlineObject12** | [**InlineObject12**](InlineObject12.md)|  | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioTransactionCashDelete

> InlineResponse2006 postPortfolioTransactionCashDelete(inlineObject13)

Delete a cash transaction.

Delete a cash transaction.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject13 inlineObject13 = new InlineObject13(); // InlineObject13 | 
        try {
            InlineResponse2006 result = apiInstance.postPortfolioTransactionCashDelete(inlineObject13);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioTransactionCashDelete");
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
 **inlineObject13** | [**InlineObject13**](InlineObject13.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioTransactionCreate

> InlineResponse2012 postPortfolioTransactionCreate(inlineObject9)

Add a transaction to a portfolio.

Add a transaction to a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|The number of transactions would exceed 1000.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject9 inlineObject9 = new InlineObject9(); // InlineObject9 | 
        try {
            InlineResponse2012 result = apiInstance.postPortfolioTransactionCreate(inlineObject9);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioTransactionCreate");
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
 **inlineObject9** | [**InlineObject9**](InlineObject9.md)|  | [optional]

### Return type

[**InlineResponse2012**](InlineResponse2012.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |


## postPortfolioTransactionDelete

> InlineResponse2006 postPortfolioTransactionDelete(inlineObject10)

Delete a transaction of a portfolio.

Delete a transaction of a portfolio.

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject10 inlineObject10 = new InlineObject10(); // InlineObject10 | 
        try {
            InlineResponse2006 result = apiInstance.postPortfolioTransactionDelete(inlineObject10);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioTransactionDelete");
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
 **inlineObject10** | [**InlineObject10**](InlineObject10.md)|  | [optional]

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postPortfolioTransactionModify

> InlineResponse2008 postPortfolioTransactionModify(inlineObject11)

Modify a transaction in a portfolio.

Modify a transaction in a portfolio.

Certain error conditions yield errors as follows: 

|Error Condition|HTTP Error|
|-------|--------|
|At least one of the parameters `numberShares`, `price`, `charges`, `exchangeRate` or `time` must be set.|400 Bad Request|

### Example

```java
// Import classes:
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiClient;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.ApiException;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.Configuration;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.auth.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.models.*;
import com.factset.sdk.VirtualPortfolioAPIforDigitalPortals.api.PortfolioApi;

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

        PortfolioApi apiInstance = new PortfolioApi(defaultClient);
        InlineObject11 inlineObject11 = new InlineObject11(); // InlineObject11 | 
        try {
            InlineResponse2008 result = apiInstance.postPortfolioTransactionModify(inlineObject11);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling PortfolioApi#postPortfolioTransactionModify");
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
 **inlineObject11** | [**InlineObject11**](InlineObject11.md)|  | [optional]

### Return type

[**InlineResponse2008**](InlineResponse2008.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

