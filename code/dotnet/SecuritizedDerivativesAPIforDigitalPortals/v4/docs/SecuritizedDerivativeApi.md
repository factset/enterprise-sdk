# FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api.SecuritizedDerivativeApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSecuritizedDerivativeBarrierTypeList**](SecuritizedDerivativeApi.md#getsecuritizedderivativebarriertypelist) | **GET** /securitized-derivative/barrier/type/list | List of barrier types.
[**GetSecuritizedDerivativeGet**](SecuritizedDerivativeApi.md#getsecuritizedderivativeget) | **GET** /securitized-derivative/get | Fundamental data for a single securitized derivative.
[**GetSecuritizedDerivativeKeyFiguresNotationGet**](SecuritizedDerivativeApi.md#getsecuritizedderivativekeyfiguresnotationget) | **GET** /securitized-derivative/key-figures/notation/get | Notation-based key figures of a securitized derivative.
[**GetSecuritizedDerivativeUnderlyingList**](SecuritizedDerivativeApi.md#getsecuritizedderivativeunderlyinglist) | **GET** /securitized-derivative/underlying/list | List of underlyings with barrier and cash flow information.
[**PostSecuritizedDerivativeIssuerSearch**](SecuritizedDerivativeApi.md#postsecuritizedderivativeissuersearch) | **POST** /securitized-derivative/issuer/search | Search for issuers of securitized derivatives.
[**PostSecuritizedDerivativeNotationRankingIntradayList**](SecuritizedDerivativeApi.md#postsecuritizedderivativenotationrankingintradaylist) | **POST** /securitized-derivative/notation/ranking/intraday/list | Ranking of securitized derivatives&#39; notations using intraday figures.
[**PostSecuritizedDerivativeNotationScreenerSearch**](SecuritizedDerivativeApi.md#postsecuritizedderivativenotationscreenersearch) | **POST** /securitized-derivative/notation/screener/search | Screener for securitized derivatives&#39;s notations based on securitized derivatives-specific parameters.
[**PostSecuritizedDerivativeNotationScreenerValueRangesGet**](SecuritizedDerivativeApi.md#postsecuritizedderivativenotationscreenervaluerangesget) | **POST** /securitized-derivative/notation/screener/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/securitized-derivative/notation/screener/search&#x60;.



<a name="getsecuritizedderivativebarriertypelist"></a>
# **GetSecuritizedDerivativeBarrierTypeList**
> InlineResponse2001 GetSecuritizedDerivativeBarrierTypeList (List<string> attributes = null)

List of barrier types.

List of barrier types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetSecuritizedDerivativeBarrierTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of barrier types.
                InlineResponse2001 result = apiInstance.GetSecuritizedDerivativeBarrierTypeList(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.GetSecuritizedDerivativeBarrierTypeList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsecuritizedderivativeget"></a>
# **GetSecuritizedDerivativeGet**
> InlineResponse200 GetSecuritizedDerivativeGet (string identifier, string identifierType, List<string> attributes = null, string metaLanguage = null)

Fundamental data for a single securitized derivative.

Fundamental data for a single securitized derivative. Dates are interpreted in the timezone of the issuer.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetSecuritizedDerivativeGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var identifier = "FDS-US";  // string | Identifier to resolve.
            var identifierType = "idInstrument";  // string | Type of the identifier. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Fundamental data for a single securitized derivative.
                InlineResponse200 result = apiInstance.GetSecuritizedDerivativeGet(identifier, identifierType, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.GetSecuritizedDerivativeGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **string**| Identifier to resolve. | 
 **identifierType** | **string**| Type of the identifier. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsecuritizedderivativekeyfiguresnotationget"></a>
# **GetSecuritizedDerivativeKeyFiguresNotationGet**
> InlineResponse2003 GetSecuritizedDerivativeKeyFiguresNotationGet (string identifier, string identifierType, List<string> attributes = null, string metaLanguage = null)

Notation-based key figures of a securitized derivative.

Notation-based key figures of a securitized derivative. Not all key figures are applicable and/or calculated for all types of securitized derivatives. Following, some frequently used references:   Cover ratio - see attribute `underlyings.coverRatio` in endpoint `/securitized-derivative/underlying/list`.  Various barrier types (e.g. strike, knock in) - see endpoint `/securitized-derivative/barrier/type/list`.  Exercise right - see attribute `exercise.right` in endpoint `/securitized-derivative/get`.  Issue price - see attribute `issue.price` in endpoint `/securitized-derivative/get`.  Ask price - see attribute `prices.ask`.  Bid price - see attribute `prices.bid`.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetSecuritizedDerivativeKeyFiguresNotationGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var identifier = "FDS-US";  // string | Identifier to resolve.
            var identifierType = "idInstrument";  // string | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Notation-based key figures of a securitized derivative.
                InlineResponse2003 result = apiInstance.GetSecuritizedDerivativeKeyFiguresNotationGet(identifier, identifierType, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.GetSecuritizedDerivativeKeyFiguresNotationGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **string**| Identifier to resolve. | 
 **identifierType** | **string**| Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsecuritizedderivativeunderlyinglist"></a>
# **GetSecuritizedDerivativeUnderlyingList**
> InlineResponse2007 GetSecuritizedDerivativeUnderlyingList (string identifier, string identifierType, List<string> attributes = null, string metaLanguage = null)

List of underlyings with barrier and cash flow information.

Provides details regarding the underlyings, their respective barriers and related cash flows (if any) of a securitized derivative. A unique combination of a cash flow and related barrier modalities, such as observation and level, is called a condition. In case of a securitized derivative with multiple underlyings, a condition comprises the respective barriers of all underlyings participating in that condition. Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetSecuritizedDerivativeUnderlyingListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var identifier = "FDS-US";  // string | Identifier to resolve.
            var identifierType = "idInstrument";  // string | Type of the identifier. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of underlyings with barrier and cash flow information.
                InlineResponse2007 result = apiInstance.GetSecuritizedDerivativeUnderlyingList(identifier, identifierType, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.GetSecuritizedDerivativeUnderlyingList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **string**| Identifier to resolve. | 
 **identifierType** | **string**| Type of the identifier. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |   | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2007**](InlineResponse2007.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsecuritizedderivativeissuersearch"></a>
# **PostSecuritizedDerivativeIssuerSearch**
> InlineResponse2002 PostSecuritizedDerivativeIssuerSearch (PostSecuritizedDerivativeIssuerSearchRequest postSecuritizedDerivativeIssuerSearchRequest)

Search for issuers of securitized derivatives.

Search for issuers of securitized derivatives, including issuer groups, which do not represent actual juristic persons, but are defined by FactSet to facilitate searching. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostSecuritizedDerivativeIssuerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var postSecuritizedDerivativeIssuerSearchRequest = new PostSecuritizedDerivativeIssuerSearchRequest(); // PostSecuritizedDerivativeIssuerSearchRequest | Request Body

            try
            {
                // Search for issuers of securitized derivatives.
                InlineResponse2002 result = apiInstance.PostSecuritizedDerivativeIssuerSearch(postSecuritizedDerivativeIssuerSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.PostSecuritizedDerivativeIssuerSearch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSecuritizedDerivativeIssuerSearchRequest** | [**PostSecuritizedDerivativeIssuerSearchRequest**](PostSecuritizedDerivativeIssuerSearchRequest.md)| Request Body | 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsecuritizedderivativenotationrankingintradaylist"></a>
# **PostSecuritizedDerivativeNotationRankingIntradayList**
> InlineResponse2004 PostSecuritizedDerivativeNotationRankingIntradayList (PostSecuritizedDerivativeNotationRankingIntradayListRequest postSecuritizedDerivativeNotationRankingIntradayListRequest = null)

Ranking of securitized derivatives' notations using intraday figures.

Ranking of securitized derivatives' notations using intraday figures. The result is limited to 100 notations that all must satisfy all selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, the selection of the notation depends on the sort attribute: - absolute and relative performance (see the response attributes `trade.performance.absolute` and `trade.performance.relative`) - the notation with the most recent trade price is used - number trades, trading value and trading volume (see the response attributes `accumulated.numberTrades`, `accumulated.tradingVolume` and `accumulated.tradingValue`) - the notation with highest (lowest) value is used  By default, the result is sorted descending by the relative intraday performance corresponding to the most recent trade price, see attribute `trade.performance.relative`. The result may contain sortable values based on different currencies, possibly making the ranking nonsensical, if the parameters `valueUnit` and/or `currency` have not been specified.  The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.  All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostSecuritizedDerivativeNotationRankingIntradayListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var postSecuritizedDerivativeNotationRankingIntradayListRequest = new PostSecuritizedDerivativeNotationRankingIntradayListRequest(); // PostSecuritizedDerivativeNotationRankingIntradayListRequest | Request Body (optional) 

            try
            {
                // Ranking of securitized derivatives' notations using intraday figures.
                InlineResponse2004 result = apiInstance.PostSecuritizedDerivativeNotationRankingIntradayList(postSecuritizedDerivativeNotationRankingIntradayListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.PostSecuritizedDerivativeNotationRankingIntradayList: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSecuritizedDerivativeNotationRankingIntradayListRequest** | [**PostSecuritizedDerivativeNotationRankingIntradayListRequest**](PostSecuritizedDerivativeNotationRankingIntradayListRequest.md)| Request Body | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsecuritizedderivativenotationscreenersearch"></a>
# **PostSecuritizedDerivativeNotationScreenerSearch**
> InlineResponse2006 PostSecuritizedDerivativeNotationScreenerSearch (PostSecuritizedDerivativeNotationScreenerSearchRequest postSecuritizedDerivativeNotationScreenerSearchRequest = null)

Screener for securitized derivatives's notations based on securitized derivatives-specific parameters.

Screener for securitized derivatives's notations based on securitized derivatives-specific parameters. The result is limited to the notations that satisfy all the selected filters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. All identifiers used as parameters must be valid and entitled.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.   The endpoint does not support the search for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are returned in the result.   The search can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostSecuritizedDerivativeNotationScreenerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var postSecuritizedDerivativeNotationScreenerSearchRequest = new PostSecuritizedDerivativeNotationScreenerSearchRequest(); // PostSecuritizedDerivativeNotationScreenerSearchRequest | Request Body (optional) 

            try
            {
                // Screener for securitized derivatives's notations based on securitized derivatives-specific parameters.
                InlineResponse2006 result = apiInstance.PostSecuritizedDerivativeNotationScreenerSearch(postSecuritizedDerivativeNotationScreenerSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.PostSecuritizedDerivativeNotationScreenerSearch: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSecuritizedDerivativeNotationScreenerSearchRequest** | [**PostSecuritizedDerivativeNotationScreenerSearchRequest**](PostSecuritizedDerivativeNotationScreenerSearchRequest.md)| Request Body | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsecuritizedderivativenotationscreenervaluerangesget"></a>
# **PostSecuritizedDerivativeNotationScreenerValueRangesGet**
> InlineResponse2005 PostSecuritizedDerivativeNotationScreenerValueRangesGet (PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest postSecuritizedDerivativeNotationScreenerValueRangesGetRequest = null)

Possible values and value ranges for the parameters used in the endpoint `/securitized-derivative/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/securitized-derivatives/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/securitized-derivatives/notation/screener/search` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.   Since some underlyings, e.g. an index or a performance difference of a stock and an index (alpha structure), do not represent a directly tradable asset, they do not have a price in the classical sense. Therefore, the term \"level\" is used instead of \"price\", e.g. underlying level instead of underlying price.   The endpoint does not support possible values and value ranges for securitized derivatives with multiple underlyings, thus only securitized derivatives with a single underlying are considered.   The possible values and value ranges can be restricted to a specific set of products by using customer-specific instrument or notation lists. Such restriction lists are set up by FactSet upon request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Api;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client;
using FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostSecuritizedDerivativeNotationScreenerValueRangesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.SecuritizedDerivativesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            //
            // The confidential client instance should be reused in production environments.
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new SecuritizedDerivativeApi(config);

            var postSecuritizedDerivativeNotationScreenerValueRangesGetRequest = new PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest(); // PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest | Request Body (optional) 

            try
            {
                // Possible values and value ranges for the parameters used in the endpoint `/securitized-derivative/notation/screener/search`.
                InlineResponse2005 result = apiInstance.PostSecuritizedDerivativeNotationScreenerValueRangesGet(postSecuritizedDerivativeNotationScreenerValueRangesGetRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecuritizedDerivativeApi.PostSecuritizedDerivativeNotationScreenerValueRangesGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **postSecuritizedDerivativeNotationScreenerValueRangesGetRequest** | [**PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest**](PostSecuritizedDerivativeNotationScreenerValueRangesGetRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


