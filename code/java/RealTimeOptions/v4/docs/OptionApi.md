# OptionApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOptionGet**](OptionApi.md#getOptionGet) | **GET** /option/get | Fundamental data for an option contract.
[**getOptionKeyFiguresGet**](OptionApi.md#getOptionKeyFiguresGet) | **GET** /option/key-figures/get | Key figures of an option contract.
[**postOptionByClassList**](OptionApi.md#postOptionByClassList) | **POST** /option/by-class/list | List of option contracts for an option class.
[**postOptionByClassValueRangesGet**](OptionApi.md#postOptionByClassValueRangesGet) | **POST** /option/by-class/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
[**postOptionClassScreenerSearch**](OptionApi.md#postOptionClassScreenerSearch) | **POST** /option/class/screener/search | Screener for option classes based on option class-specific parameters.



## getOptionGet

> InlineResponse200 getOptionGet(identifier, identifierType, attributes, metaLanguage)

Fundamental data for an option contract.

Fundamental data for an option contract; any other instrument yields empty
            values for option contract-specific attributes. Dates are interpreted in the time
            zone of the exchange. Option contracts are exchange-specific; each option contract
            instrument has exactly one notation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.auth.*;
import com.factset.sdk.RealTimeOptions.models.*;
import com.factset.sdk.RealTimeOptions.api.OptionApi;

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

        OptionApi apiInstance = new OptionApi(defaultClient);
        String identifier = "FDS-US"; // String | Identifier to resolve.
        String identifierType = "idInstrument"; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        String metaLanguage = "de"; // String | ISO 639-1 code of the language.
        try {
            InlineResponse200 result = apiInstance.getOptionGet(identifier, identifierType, attributes, metaLanguage);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#getOptionGet");
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
 **identifier** | **String**| Identifier to resolve. |
 **identifierType** | **String**| Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]
 **metaLanguage** | **String**| ISO 639-1 code of the language. | [optional]

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


## getOptionKeyFiguresGet

> InlineResponse2004 getOptionKeyFiguresGet(identifier, identifierType, attributes)

Key figures of an option contract.

Key figures of an option contract.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.auth.*;
import com.factset.sdk.RealTimeOptions.models.*;
import com.factset.sdk.RealTimeOptions.api.OptionApi;

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

        OptionApi apiInstance = new OptionApi(defaultClient);
        String identifier = "FDS-US"; // String | Identifier to resolve.
        String identifierType = "idInstrument"; // String | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse2004 result = apiInstance.getOptionKeyFiguresGet(identifier, identifierType, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#getOptionKeyFiguresGet");
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
 **identifier** | **String**| Identifier to resolve. |
 **identifierType** | **String**| Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | [enum: idInstrument, idNotation, fdsPermanentIdentifierSecurity, fdsPermanentIdentifierListing, fdsPermanentIdentifierRegional, tickerExchange, tickerRegion, sedol, isin, wkn, valor, cusip]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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


## postOptionByClassList

> InlineResponse2001 postOptionByClassList(postOptionByClassListRequest)

List of option contracts for an option class.

List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.auth.*;
import com.factset.sdk.RealTimeOptions.models.*;
import com.factset.sdk.RealTimeOptions.api.OptionApi;

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

        OptionApi apiInstance = new OptionApi(defaultClient);
        PostOptionByClassListRequest postOptionByClassListRequest = new PostOptionByClassListRequest(); // PostOptionByClassListRequest | Request Body
        try {
            InlineResponse2001 result = apiInstance.postOptionByClassList(postOptionByClassListRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#postOptionByClassList");
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
 **postOptionByClassListRequest** | [**PostOptionByClassListRequest**](PostOptionByClassListRequest.md)| Request Body | [optional]

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


## postOptionByClassValueRangesGet

> InlineResponse2002 postOptionByClassValueRangesGet(postOptionByClassValueRangesGetRequest)

Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/option/by-class/list` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.auth.*;
import com.factset.sdk.RealTimeOptions.models.*;
import com.factset.sdk.RealTimeOptions.api.OptionApi;

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

        OptionApi apiInstance = new OptionApi(defaultClient);
        PostOptionByClassValueRangesGetRequest postOptionByClassValueRangesGetRequest = new PostOptionByClassValueRangesGetRequest(); // PostOptionByClassValueRangesGetRequest | Request Body
        try {
            InlineResponse2002 result = apiInstance.postOptionByClassValueRangesGet(postOptionByClassValueRangesGetRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#postOptionByClassValueRangesGet");
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
 **postOptionByClassValueRangesGetRequest** | [**PostOptionByClassValueRangesGetRequest**](PostOptionByClassValueRangesGetRequest.md)| Request Body | [optional]

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## postOptionClassScreenerSearch

> InlineResponse2003 postOptionClassScreenerSearch(postOptionClassScreenerSearchRequest)

Screener for option classes based on option class-specific parameters.

Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.RealTimeOptions.ApiClient;
import com.factset.sdk.RealTimeOptions.ApiException;
import com.factset.sdk.RealTimeOptions.Configuration;
import com.factset.sdk.RealTimeOptions.auth.*;
import com.factset.sdk.RealTimeOptions.models.*;
import com.factset.sdk.RealTimeOptions.api.OptionApi;

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

        OptionApi apiInstance = new OptionApi(defaultClient);
        PostOptionClassScreenerSearchRequest postOptionClassScreenerSearchRequest = new PostOptionClassScreenerSearchRequest(); // PostOptionClassScreenerSearchRequest | Request Body
        try {
            InlineResponse2003 result = apiInstance.postOptionClassScreenerSearch(postOptionClassScreenerSearchRequest);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#postOptionClassScreenerSearch");
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
 **postOptionClassScreenerSearchRequest** | [**PostOptionClassScreenerSearchRequest**](PostOptionClassScreenerSearchRequest.md)| Request Body | [optional]

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

