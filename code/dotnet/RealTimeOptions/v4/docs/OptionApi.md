# FactSet.SDK.RealTimeOptions.Api.OptionApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOptionGet**](OptionApi.md#getoptionget) | **GET** /option/get | Fundamental data for an option contract.
[**GetOptionKeyFiguresGet**](OptionApi.md#getoptionkeyfiguresget) | **GET** /option/key-figures/get | Key figures of an option contract.
[**PostOptionByClassList**](OptionApi.md#postoptionbyclasslist) | **POST** /option/by-class/list | List of option contracts for an option class.
[**PostOptionByClassValueRangesGet**](OptionApi.md#postoptionbyclassvaluerangesget) | **POST** /option/by-class/value-ranges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/option/by-class/list&#x60;.
[**PostOptionClassScreenerSearch**](OptionApi.md#postoptionclassscreenersearch) | **POST** /option/class/screener/search | Screener for option classes based on option class-specific parameters.



<a name="getoptionget"></a>
# **GetOptionGet**
> InlineResponse200 GetOptionGet (string identifier, string identifierType, List<string> attributes = null, string metaLanguage = null)

Fundamental data for an option contract.

Fundamental data for an option contract; any other instrument yields empty             values for option contract-specific attributes. Dates are interpreted in the time             zone of the exchange. Option contracts are exchange-specific; each option contract             instrument has exactly one notation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeOptions.Api;
using FactSet.SDK.RealTimeOptions.Client;
using FactSet.SDK.RealTimeOptions.Model;

namespace Example
{
    public class GetOptionGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeOptions.Client.Configuration();

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

            var apiInstance = new OptionApi(config);

            var identifier = "FDS-US";  // string | Identifier to resolve.
            var identifierType = "idInstrument";  // string | Type of the identifier. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Fundamental data for an option contract.
                InlineResponse200 result = apiInstance.GetOptionGet(identifier, identifierType, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionApi.GetOptionGet: " + e.Message );
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


<a name="getoptionkeyfiguresget"></a>
# **GetOptionKeyFiguresGet**
> InlineResponse2004 GetOptionKeyFiguresGet (string identifier, string identifierType, List<string> attributes = null)

Key figures of an option contract.

Key figures of an option contract.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeOptions.Api;
using FactSet.SDK.RealTimeOptions.Client;
using FactSet.SDK.RealTimeOptions.Model;

namespace Example
{
    public class GetOptionKeyFiguresGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeOptions.Client.Configuration();

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

            var apiInstance = new OptionApi(config);

            var identifier = "FDS-US";  // string | Identifier to resolve.
            var identifierType = "idInstrument";  // string | Type of the identifier. An instrument level identifier is resolved to a listing level identifier according to the configured listing selection rules. | Value | Description | | - -- | - -- | | idInstrument | MDG identifier of an instrument. | | idNotation | MDG identifier of a listing. | | fdsPermanentIdentifierSecurity | FactSet Permanent Identifier on security level. | | fdsPermanentIdentifierListing | FactSet Permanent Identifier on listing level. | | fdsPermanentIdentifierRegional | Regional FactSet Permanent Identifier, identifying the primary listing in the region. | | tickerExchange | FactSet market symbol of a listing. | | tickerRegion | Regional FactSet ticker symbol, identifying the primary listing in the region. | | sedol | SEDOL or IDII of a listing. | | isin | ISIN of an instrument. | | wkn | WKN of an instrument. | | valor | Valor number of an instrument. | | cusip | CUSIP or CINS identifier of an instrument |  
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Key figures of an option contract.
                InlineResponse2004 result = apiInstance.GetOptionKeyFiguresGet(identifier, identifierType, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionApi.GetOptionKeyFiguresGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postoptionbyclasslist"></a>
# **PostOptionByClassList**
> InlineResponse2001 PostOptionByClassList (PostOptionByClassListRequest postOptionByClassListRequest = null)

List of option contracts for an option class.

List of option contracts for an option class. The list can be filtered based on option contract-specific parameters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeOptions.Api;
using FactSet.SDK.RealTimeOptions.Client;
using FactSet.SDK.RealTimeOptions.Model;

namespace Example
{
    public class PostOptionByClassListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeOptions.Client.Configuration();

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

            var apiInstance = new OptionApi(config);

            var postOptionByClassListRequest = new PostOptionByClassListRequest(); // PostOptionByClassListRequest | Request Body (optional) 

            try
            {
                // List of option contracts for an option class.
                InlineResponse2001 result = apiInstance.PostOptionByClassList(postOptionByClassListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionApi.PostOptionByClassList: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postoptionbyclassvaluerangesget"></a>
# **PostOptionByClassValueRangesGet**
> InlineResponse2002 PostOptionByClassValueRangesGet (PostOptionByClassValueRangesGetRequest postOptionByClassValueRangesGetRequest = null)

Possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/option/by-class/list` endpoint so that performing a search always leads to a non-empty list of notations. Lists of distinct values, e.g. identifiers, are sorted descending by the number of notations for each value.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeOptions.Api;
using FactSet.SDK.RealTimeOptions.Client;
using FactSet.SDK.RealTimeOptions.Model;

namespace Example
{
    public class PostOptionByClassValueRangesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeOptions.Client.Configuration();

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

            var apiInstance = new OptionApi(config);

            var postOptionByClassValueRangesGetRequest = new PostOptionByClassValueRangesGetRequest(); // PostOptionByClassValueRangesGetRequest | Request Body (optional) 

            try
            {
                // Possible values and value ranges for the parameters used in the endpoint `/option/by-class/list`.
                InlineResponse2002 result = apiInstance.PostOptionByClassValueRangesGet(postOptionByClassValueRangesGetRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionApi.PostOptionByClassValueRangesGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postoptionclassscreenersearch"></a>
# **PostOptionClassScreenerSearch**
> InlineResponse2003 PostOptionClassScreenerSearch (PostOptionClassScreenerSearchRequest postOptionClassScreenerSearchRequest = null)

Screener for option classes based on option class-specific parameters.

Screener for option classes based on option class-specific parameters. An option class is defined by an exchange and includes all option contracts with the same reference data (e.g. underlying instrument). The result is limited to the 500 option classes with the most option contracts per class, that satisfy all the selected filters. All identifiers used as parameters must be valid and entitled.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeOptions.Api;
using FactSet.SDK.RealTimeOptions.Client;
using FactSet.SDK.RealTimeOptions.Model;

namespace Example
{
    public class PostOptionClassScreenerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeOptions.Client.Configuration();

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

            var apiInstance = new OptionApi(config);

            var postOptionClassScreenerSearchRequest = new PostOptionClassScreenerSearchRequest(); // PostOptionClassScreenerSearchRequest | Request Body (optional) 

            try
            {
                // Screener for option classes based on option class-specific parameters.
                InlineResponse2003 result = apiInstance.PostOptionClassScreenerSearch(postOptionClassScreenerSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionApi.PostOptionClassScreenerSearch: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


