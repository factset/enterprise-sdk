# CompanyApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCompanyLogoGet**](CompanyApi.md#getCompanyLogoGet) | **GET** /company/logo/get | List of URLs of company logos.



## getCompanyLogoGet

> InlineResponse200 getCompanyLogoGet(identifier, identifierType, format, attributes)

List of URLs of company logos.

List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are: 

 **Small**:
 * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.
 * square:  31 x 31 pixels.


 **Medium**: small logo scaled up by 200%.

 **Large**: small logo scaled up by 300%.

 **Vector**: can be rendered at any size.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```java
// Import classes:
import com.factset.sdk.CompanyLogo.ApiClient;
import com.factset.sdk.CompanyLogo.ApiException;
import com.factset.sdk.CompanyLogo.Configuration;
import com.factset.sdk.CompanyLogo.auth.*;
import com.factset.sdk.CompanyLogo.models.*;
import com.factset.sdk.CompanyLogo.api.CompanyApi;

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

        CompanyApi apiInstance = new CompanyApi(defaultClient);
        String identifier = "FDS-US"; // String | Identifier to resolve.
        String identifierType = "idInstrument"; // String | Type of the identifier. | Value | Description | | --- | --- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
        String format = "rectangular"; // String | Format of the logos. | Value | Description | | --- | --- | | rectangular | Logos in rectangular format | | square | Logos in square format |  
        java.util.Set<String> attributes = Arrays.asList(); // java.util.Set<String> | Limit the attributes returned in the response to the specified set.
        try {
            InlineResponse200 result = apiInstance.getCompanyLogoGet(identifier, identifierType, format, attributes);
            System.out.println(result);

        } catch (ApiException e) {
            System.err.println("Exception when calling CompanyApi#getCompanyLogoGet");
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
 **format** | **String**| Format of the logos. | Value | Description | | --- | --- | | rectangular | Logos in rectangular format | | square | Logos in square format |   | [optional] [default to rectangular] [enum: rectangular, square]
 **attributes** | **List&lt;String&gt;**| Limit the attributes returned in the response to the specified set. | [optional]

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

