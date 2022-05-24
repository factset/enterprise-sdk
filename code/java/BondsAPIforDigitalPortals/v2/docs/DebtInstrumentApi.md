# DebtInstrumentApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDebtInstrumentGet**](DebtInstrumentApi.md#getDebtInstrumentGet) | **GET** /debtInstrument/get | Fundamental data for a debt instrument.
[**getDebtInstrumentKeyFiguresNotationGet**](DebtInstrumentApi.md#getDebtInstrumentKeyFiguresNotationGet) | **GET** /debtInstrument/keyFigures/notation/get | Key figures of a debt instrument.
[**postDebtInstrumentIssuerSearch**](DebtInstrumentApi.md#postDebtInstrumentIssuerSearch) | **POST** /debtInstrument/issuer/search | Search for issuers of debt instruments.
[**postDebtInstrumentNotationScreenerSearch**](DebtInstrumentApi.md#postDebtInstrumentNotationScreenerSearch) | **POST** /debtInstrument/notation/screener/search | Screener for debt instruments&#39; notations based on debt instrument-specific parameters.
[**postDebtInstrumentNotationScreenerValueRangesGet**](DebtInstrumentApi.md#postDebtInstrumentNotationScreenerValueRangesGet) | **POST** /debtInstrument/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;



## getDebtInstrumentGet

> InlineResponse200 getDebtInstrumentGet(id, attributes, language)

Fundamental data for a debt instrument.

Fundamental data for a debt instrument; any other instrument yields empty values for debt-instrument-specific attributes. Dates are interpreted in the timezone of the issuer.

### Example

```java
// Import classes:
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.auth.*;
import com.factset.sdk.BondsAPIforDigitalPortals.models.*;
import com.factset.sdk.BondsAPIforDigitalPortals.api.DebtInstrumentApi;

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

        DebtInstrumentApi apiInstance = new DebtInstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of the instrument.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String language = "language_example"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse200 result = apiInstance.getDebtInstrumentGet(id, attributes, language);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DebtInstrumentApi#getDebtInstrumentGet");
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
 **id** | **String**| Identifier of the instrument. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **language** | **String**| ISO 639-1 code of the language. | [optional]

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getDebtInstrumentKeyFiguresNotationGet

> InlineResponse2002 getDebtInstrumentKeyFiguresNotationGet(id, attributes)

Key figures of a debt instrument.

Key figures of a debt instrument. The key figures are calculated using delayed prices with an additional delay of 10 minutes after an  update of the debt instrument's price. Special product features such as the right to a maturity extension, an attached option, or convertibility are not considered for the key figure calculation. Further, a calculation is not performed for perpetual products and for products with variable interest rate.

### Example

```java
// Import classes:
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.auth.*;
import com.factset.sdk.BondsAPIforDigitalPortals.models.*;
import com.factset.sdk.BondsAPIforDigitalPortals.api.DebtInstrumentApi;

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

        DebtInstrumentApi apiInstance = new DebtInstrumentApi(defaultClient);
        String id = "id_example"; // String | Identifier of a notation.
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2002 result = apiInstance.getDebtInstrumentKeyFiguresNotationGet(id, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DebtInstrumentApi#getDebtInstrumentKeyFiguresNotationGet");
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
 **id** | **String**| Identifier of a notation. |
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## postDebtInstrumentIssuerSearch

> InlineResponse2001 postDebtInstrumentIssuerSearch(body)

Search for issuers of debt instruments.

Search for issuers of debt instruments. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

```java
// Import classes:
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.auth.*;
import com.factset.sdk.BondsAPIforDigitalPortals.models.*;
import com.factset.sdk.BondsAPIforDigitalPortals.api.DebtInstrumentApi;

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

        DebtInstrumentApi apiInstance = new DebtInstrumentApi(defaultClient);
        InlineObject body = new InlineObject(); // InlineObject | 
        try {
            InlineResponse2001 result = apiInstance.postDebtInstrumentIssuerSearch(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DebtInstrumentApi#postDebtInstrumentIssuerSearch");
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

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postDebtInstrumentNotationScreenerSearch

> InlineResponse2003 postDebtInstrumentNotationScreenerSearch(body)

Screener for debt instruments&#39; notations based on debt instrument-specific parameters.

Screener for debt instruments' notations based on debt instrument-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example

```java
// Import classes:
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.auth.*;
import com.factset.sdk.BondsAPIforDigitalPortals.models.*;
import com.factset.sdk.BondsAPIforDigitalPortals.api.DebtInstrumentApi;

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

        DebtInstrumentApi apiInstance = new DebtInstrumentApi(defaultClient);
        InlineObject1 body = new InlineObject1(); // InlineObject1 | 
        try {
            InlineResponse2003 result = apiInstance.postDebtInstrumentNotationScreenerSearch(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DebtInstrumentApi#postDebtInstrumentNotationScreenerSearch");
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional]

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


## postDebtInstrumentNotationScreenerValueRangesGet

> InlineResponse2004 postDebtInstrumentNotationScreenerValueRangesGet(body)

Possible values and value ranges for the parameters used in the endpoint &#x60;/debtInstrument/notation/screener/search.&#x60;

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/debtInstrument/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/debtInstrument/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.

### Example

```java
// Import classes:
import com.factset.sdk.BondsAPIforDigitalPortals.ApiClient;
import com.factset.sdk.BondsAPIforDigitalPortals.ApiException;
import com.factset.sdk.BondsAPIforDigitalPortals.Configuration;
import com.factset.sdk.BondsAPIforDigitalPortals.auth.*;
import com.factset.sdk.BondsAPIforDigitalPortals.models.*;
import com.factset.sdk.BondsAPIforDigitalPortals.api.DebtInstrumentApi;

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

        DebtInstrumentApi apiInstance = new DebtInstrumentApi(defaultClient);
        InlineObject2 body = new InlineObject2(); // InlineObject2 | 
        try {
            InlineResponse2004 result = apiInstance.postDebtInstrumentNotationScreenerValueRangesGet(body);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling DebtInstrumentApi#postDebtInstrumentNotationScreenerValueRangesGet");
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional]

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

