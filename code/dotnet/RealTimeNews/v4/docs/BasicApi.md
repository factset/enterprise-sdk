# FactSet.SDK.RealTimeNews.Api.BasicApi

All URIs are relative to *https://api.factset.com/wealth/v4*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBasicAssetClassList**](BasicApi.md#getbasicassetclasslist) | **GET** /basic/asset-class/list | List of asset classes.
[**GetBasicBenchmarkTypeList**](BasicApi.md#getbasicbenchmarktypelist) | **GET** /basic/benchmark/type/list | List of benchmark types.
[**GetBasicFrequencyTypeList**](BasicApi.md#getbasicfrequencytypelist) | **GET** /basic/frequency/type/list | List of frequency types.
[**GetBasicLanguageGet**](BasicApi.md#getbasiclanguageget) | **GET** /basic/language/get | Details for a language.
[**GetBasicLanguageGetByCode**](BasicApi.md#getbasiclanguagegetbycode) | **GET** /basic/language/get-by-code | Details for a language identified by code.
[**GetBasicLanguageList**](BasicApi.md#getbasiclanguagelist) | **GET** /basic/language/list | List of languages.
[**GetBasicMarketGet**](BasicApi.md#getbasicmarketget) | **GET** /basic/market/get | Details of a market.
[**GetBasicMarketGroupList**](BasicApi.md#getbasicmarketgrouplist) | **GET** /basic/market/group/list | List of market groups.
[**GetBasicMarketTypeList**](BasicApi.md#getbasicmarkettypelist) | **GET** /basic/market/type/list | List of market types.
[**GetBasicMediaKindList**](BasicApi.md#getbasicmediakindlist) | **GET** /basic/media/kind/list | List of media kinds.
[**GetBasicRegionContinentGet**](BasicApi.md#getbasicregioncontinentget) | **GET** /basic/region/continent/get | Details for a continent.
[**GetBasicRegionContinentList**](BasicApi.md#getbasicregioncontinentlist) | **GET** /basic/region/continent/list | List of continents.
[**GetBasicRegionCountryGet**](BasicApi.md#getbasicregioncountryget) | **GET** /basic/region/country/get | Details for a country.
[**GetBasicRegionCountryGetByCode**](BasicApi.md#getbasicregioncountrygetbycode) | **GET** /basic/region/country/get-by-code | Details for a country identified by code.
[**GetBasicRegionCountryList**](BasicApi.md#getbasicregioncountrylist) | **GET** /basic/region/country/list | List of countries.
[**GetBasicRegionGet**](BasicApi.md#getbasicregionget) | **GET** /basic/region/get | Details for a region.
[**GetBasicRegionList**](BasicApi.md#getbasicregionlist) | **GET** /basic/region/list | List of regions.
[**GetBasicTimezoneGet**](BasicApi.md#getbasictimezoneget) | **GET** /basic/timezone/get | Details of a timezone.
[**GetBasicTimezoneGetByName**](BasicApi.md#getbasictimezonegetbyname) | **GET** /basic/timezone/get-by-name | Details of a timezone identified by name.
[**GetBasicValueUnitAlternativeList**](BasicApi.md#getbasicvalueunitalternativelist) | **GET** /basic/value-unit/alternative/list | List of alternative units.
[**GetBasicValueUnitCurrencyFractionalGet**](BasicApi.md#getbasicvalueunitcurrencyfractionalget) | **GET** /basic/value-unit/currency/fractional/get | Details of a fractional currency.
[**GetBasicValueUnitCurrencyFractionalList**](BasicApi.md#getbasicvalueunitcurrencyfractionallist) | **GET** /basic/value-unit/currency/fractional/list | List of fractional currencies.
[**GetBasicValueUnitGet**](BasicApi.md#getbasicvalueunitget) | **GET** /basic/value-unit/get | Details of a value unit.
[**PostBasicBackgroundTextTypeList**](BasicApi.md#postbasicbackgroundtexttypelist) | **POST** /basic/background-text/type/list | List of background text types.
[**PostBasicDeliveryList**](BasicApi.md#postbasicdeliverylist) | **POST** /basic/delivery/list | List of deliveries.
[**PostBasicMarketList**](BasicApi.md#postbasicmarketlist) | **POST** /basic/market/list | List of markets.
[**PostBasicMediaTypeList**](BasicApi.md#postbasicmediatypelist) | **POST** /basic/media/type/list | List of Internet media types.
[**PostBasicMicOperatingList**](BasicApi.md#postbasicmicoperatinglist) | **POST** /basic/mic/operating/list | List of operating market identifier codes (MIC).
[**PostBasicTimezoneList**](BasicApi.md#postbasictimezonelist) | **POST** /basic/timezone/list | List of timezones.
[**PostBasicValueUnitCurrencyList**](BasicApi.md#postbasicvalueunitcurrencylist) | **POST** /basic/value-unit/currency/list | List of currencies.
[**PostBasicValueUnitCurrencyMainList**](BasicApi.md#postbasicvalueunitcurrencymainlist) | **POST** /basic/value-unit/currency/main/list | List of main currencies.
[**PostBasicValueUnitList**](BasicApi.md#postbasicvalueunitlist) | **POST** /basic/value-unit/list | List of value units.



<a name="getbasicassetclasslist"></a>
# **GetBasicAssetClassList**
> InlineResponse200 GetBasicAssetClassList (List<string> attributes = null)

List of asset classes.

List of asset classes as defined by FactSet Digital Solutions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicAssetClassListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of asset classes.
                InlineResponse200 result = apiInstance.GetBasicAssetClassList(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicAssetClassList: " + e.Message );
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


<a name="getbasicbenchmarktypelist"></a>
# **GetBasicBenchmarkTypeList**
> InlineResponse2002 GetBasicBenchmarkTypeList (List<string> attributes = null, string metaLanguage = null)

List of benchmark types.

List of benchmark types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicBenchmarkTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of benchmark types.
                InlineResponse2002 result = apiInstance.GetBasicBenchmarkTypeList(attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicBenchmarkTypeList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbasicfrequencytypelist"></a>
# **GetBasicFrequencyTypeList**
> InlineResponse2004 GetBasicFrequencyTypeList (List<string> attributes = null, string metaLanguage = null)

List of frequency types.

List of frequency types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicFrequencyTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // List of frequency types.
                InlineResponse2004 result = apiInstance.GetBasicFrequencyTypeList(attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicFrequencyTypeList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

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


<a name="getbasiclanguageget"></a>
# **GetBasicLanguageGet**
> InlineResponse2005 GetBasicLanguageGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details for a language.

Details for a language.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicLanguageGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 2D;  // decimal | Identifier of a language.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a language.
                InlineResponse2005 result = apiInstance.GetBasicLanguageGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicLanguageGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a language. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbasiclanguagegetbycode"></a>
# **GetBasicLanguageGetByCode**
> InlineResponse2006 GetBasicLanguageGetByCode (string code, List<string> attributes = null, string metaLanguage = null)

Details for a language identified by code.

Details for a language identified by code.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicLanguageGetByCodeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var code = "de";  // string | ISO 639-1 code of the language.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a language identified by code.
                InlineResponse2006 result = apiInstance.GetBasicLanguageGetByCode(code, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicLanguageGetByCode: " + e.Message );
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
 **code** | **string**| ISO 639-1 code of the language. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2006**](InlineResponse2006.md)

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


<a name="getbasiclanguagelist"></a>
# **GetBasicLanguageList**
> InlineResponse2007 GetBasicLanguageList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of languages.

List of languages.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicLanguageListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   (optional) 

            try
            {
                // List of languages.
                InlineResponse2007 result = apiInstance.GetBasicLanguageList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicLanguageList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   | [optional] 

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


<a name="getbasicmarketget"></a>
# **GetBasicMarketGet**
> InlineResponse2008 GetBasicMarketGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of a market.

Details of a market.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicMarketGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 2D;  // decimal | Identifier of a market.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of a market.
                InlineResponse2008 result = apiInstance.GetBasicMarketGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicMarketGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a market. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse2008**](InlineResponse2008.md)

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


<a name="getbasicmarketgrouplist"></a>
# **GetBasicMarketGroupList**
> InlineResponse20010 GetBasicMarketGroupList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of market groups.

List of market groups.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicMarketGroupListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name | | shortName | | -shortName |   (optional) 

            try
            {
                // List of market groups.
                InlineResponse20010 result = apiInstance.GetBasicMarketGroupList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicMarketGroupList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name | | shortName | | -shortName |   | [optional] 

### Return type
[**InlineResponse20010**](InlineResponse20010.md)

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


<a name="getbasicmarkettypelist"></a>
# **GetBasicMarketTypeList**
> InlineResponse20011 GetBasicMarketTypeList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of market types.

List of market types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicMarketTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   (optional) 

            try
            {
                // List of market types.
                InlineResponse20011 result = apiInstance.GetBasicMarketTypeList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicMarketTypeList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getbasicmediakindlist"></a>
# **GetBasicMediaKindList**
> InlineResponse20012 GetBasicMediaKindList (List<string> attributes = null)

List of media kinds.

List of media kinds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicMediaKindListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of media kinds.
                InlineResponse20012 result = apiInstance.GetBasicMediaKindList(attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicMediaKindList: " + e.Message );
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
[**InlineResponse20012**](InlineResponse20012.md)

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


<a name="getbasicregioncontinentget"></a>
# **GetBasicRegionContinentGet**
> InlineResponse20017 GetBasicRegionContinentGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details for a continent.

Details for a continent.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionContinentGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 1D;  // decimal | Identifier of a continent.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a continent.
                InlineResponse20017 result = apiInstance.GetBasicRegionContinentGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionContinentGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a continent. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20017**](InlineResponse20017.md)

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


<a name="getbasicregioncontinentlist"></a>
# **GetBasicRegionContinentList**
> InlineResponse20018 GetBasicRegionContinentList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of continents.

List of continents.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionContinentListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   (optional) 

            try
            {
                // List of continents.
                InlineResponse20018 result = apiInstance.GetBasicRegionContinentList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionContinentList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   | [optional] 

### Return type
[**InlineResponse20018**](InlineResponse20018.md)

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


<a name="getbasicregioncountryget"></a>
# **GetBasicRegionCountryGet**
> InlineResponse20019 GetBasicRegionCountryGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details for a country.

Details for a country.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionCountryGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 4D;  // decimal | Identifier of a country.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a country.
                InlineResponse20019 result = apiInstance.GetBasicRegionCountryGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionCountryGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a country. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20019**](InlineResponse20019.md)

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


<a name="getbasicregioncountrygetbycode"></a>
# **GetBasicRegionCountryGetByCode**
> InlineResponse20020 GetBasicRegionCountryGetByCode (string code, List<string> attributes = null, string metaLanguage = null)

Details for a country identified by code.

Details for a country identified by code.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionCountryGetByCodeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var code = "DE";  // string | ISO 3166-1 alpha-2 code of a country.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a country identified by code.
                InlineResponse20020 result = apiInstance.GetBasicRegionCountryGetByCode(code, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionCountryGetByCode: " + e.Message );
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
 **code** | **string**| ISO 3166-1 alpha-2 code of a country. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20020**](InlineResponse20020.md)

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


<a name="getbasicregioncountrylist"></a>
# **GetBasicRegionCountryList**
> InlineResponse20021 GetBasicRegionCountryList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of countries.

List of countries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionCountryListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   (optional) 

            try
            {
                // List of countries.
                InlineResponse20021 result = apiInstance.GetBasicRegionCountryList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionCountryList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   | [optional] 

### Return type
[**InlineResponse20021**](InlineResponse20021.md)

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


<a name="getbasicregionget"></a>
# **GetBasicRegionGet**
> InlineResponse20015 GetBasicRegionGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details for a region.

Details for a geographic, political, or economic region.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 5D;  // decimal | Identifier of a region.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details for a region.
                InlineResponse20015 result = apiInstance.GetBasicRegionGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a region. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20015**](InlineResponse20015.md)

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


<a name="getbasicregionlist"></a>
# **GetBasicRegionList**
> InlineResponse20016 GetBasicRegionList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of regions.

List of geographic, political, and economic regions.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicRegionListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   (optional) 

            try
            {
                // List of regions.
                InlineResponse20016 result = apiInstance.GetBasicRegionList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicRegionList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | code | | -code | | name | | -name |   | [optional] 

### Return type
[**InlineResponse20016**](InlineResponse20016.md)

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


<a name="getbasictimezoneget"></a>
# **GetBasicTimezoneGet**
> InlineResponse20022 GetBasicTimezoneGet (decimal id, List<string> attributes = null)

Details of a timezone.

Details of a timezone identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicTimezoneGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 1D;  // decimal | Identifier of a timezone. An invalid or unsupported identifier will result in an error.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a timezone.
                InlineResponse20022 result = apiInstance.GetBasicTimezoneGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicTimezoneGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a timezone. An invalid or unsupported identifier will result in an error. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20022**](InlineResponse20022.md)

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


<a name="getbasictimezonegetbyname"></a>
# **GetBasicTimezoneGetByName**
> InlineResponse20023 GetBasicTimezoneGetByName (string name, List<string> attributes = null)

Details of a timezone identified by name.

Details of a timezone identified by name, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicTimezoneGetByNameExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var name = "America/New_York";  // string | Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Details of a timezone identified by name.
                InlineResponse20023 result = apiInstance.GetBasicTimezoneGetByName(name, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicTimezoneGetByName: " + e.Message );
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
 **name** | **string**| Name of a timezone. The result is determined by a case-sensitive equality comparison with the stored timezone names. An invalid or unsupported name will result in an error. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20023**](InlineResponse20023.md)

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


<a name="getbasicvalueunitalternativelist"></a>
# **GetBasicValueUnitAlternativeList**
> InlineResponse20027 GetBasicValueUnitAlternativeList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of alternative units.

List of alternative units.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicValueUnitAlternativeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   (optional) 

            try
            {
                // List of alternative units.
                InlineResponse20027 result = apiInstance.GetBasicValueUnitAlternativeList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicValueUnitAlternativeList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   | [optional] 

### Return type
[**InlineResponse20027**](InlineResponse20027.md)

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


<a name="getbasicvalueunitcurrencyfractionalget"></a>
# **GetBasicValueUnitCurrencyFractionalGet**
> InlineResponse20029 GetBasicValueUnitCurrencyFractionalGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of a fractional currency.

Details of a fractional currency.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicValueUnitCurrencyFractionalGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 1D;  // decimal | Identifier of a fractional currency.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of a fractional currency.
                InlineResponse20029 result = apiInstance.GetBasicValueUnitCurrencyFractionalGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicValueUnitCurrencyFractionalGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a fractional currency. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20029**](InlineResponse20029.md)

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


<a name="getbasicvalueunitcurrencyfractionallist"></a>
# **GetBasicValueUnitCurrencyFractionalList**
> InlineResponse20030 GetBasicValueUnitCurrencyFractionalList (List<string> attributes = null, string metaLanguage = null, List<string> sort = null)

List of fractional currencies.

List of fractional currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicValueUnitCurrencyFractionalListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "en";  // string | ISO 639-1 code of the language. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   (optional) 

            try
            {
                // List of fractional currencies.
                InlineResponse20030 result = apiInstance.GetBasicValueUnitCurrencyFractionalList(attributes, metaLanguage, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicValueUnitCurrencyFractionalList: " + e.Message );
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
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | - -- | | name | | -name |   | [optional] 

### Return type
[**InlineResponse20030**](InlineResponse20030.md)

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


<a name="getbasicvalueunitget"></a>
# **GetBasicValueUnitGet**
> InlineResponse20025 GetBasicValueUnitGet (decimal id, List<string> attributes = null, string metaLanguage = null)

Details of a value unit.

Details of a value unit.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class GetBasicValueUnitGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var id = 5D;  // decimal | Identifier of a value unit.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var metaLanguage = "de";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Details of a value unit.
                InlineResponse20025 result = apiInstance.GetBasicValueUnitGet(id, attributes, metaLanguage);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.GetBasicValueUnitGet: " + e.Message );
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
 **id** | **decimal**| Identifier of a value unit. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **metaLanguage** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20025**](InlineResponse20025.md)

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


<a name="postbasicbackgroundtexttypelist"></a>
# **PostBasicBackgroundTextTypeList**
> InlineResponse2001 PostBasicBackgroundTextTypeList (PostBasicBackgroundTextTypeListRequest postBasicBackgroundTextTypeListRequest = null)

List of background text types.

List of background text types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicBackgroundTextTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicBackgroundTextTypeListRequest = new PostBasicBackgroundTextTypeListRequest(); // PostBasicBackgroundTextTypeListRequest | Request Body (optional) 

            try
            {
                // List of background text types.
                InlineResponse2001 result = apiInstance.PostBasicBackgroundTextTypeList(postBasicBackgroundTextTypeListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicBackgroundTextTypeList: " + e.Message );
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
 **postBasicBackgroundTextTypeListRequest** | [**PostBasicBackgroundTextTypeListRequest**](PostBasicBackgroundTextTypeListRequest.md)| Request Body | [optional] 

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


<a name="postbasicdeliverylist"></a>
# **PostBasicDeliveryList**
> InlineResponse2003 PostBasicDeliveryList (PostBasicDeliveryListRequest postBasicDeliveryListRequest = null)

List of deliveries.

List of deliveries.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicDeliveryListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicDeliveryListRequest = new PostBasicDeliveryListRequest(); // PostBasicDeliveryListRequest | Request Body (optional) 

            try
            {
                // List of deliveries.
                InlineResponse2003 result = apiInstance.PostBasicDeliveryList(postBasicDeliveryListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicDeliveryList: " + e.Message );
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
 **postBasicDeliveryListRequest** | [**PostBasicDeliveryListRequest**](PostBasicDeliveryListRequest.md)| Request Body | [optional] 

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


<a name="postbasicmarketlist"></a>
# **PostBasicMarketList**
> InlineResponse2009 PostBasicMarketList (PostBasicMarketListRequest postBasicMarketListRequest = null)

List of markets.

List of markets.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicMarketListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicMarketListRequest = new PostBasicMarketListRequest(); // PostBasicMarketListRequest | Request Body (optional) 

            try
            {
                // List of markets.
                InlineResponse2009 result = apiInstance.PostBasicMarketList(postBasicMarketListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicMarketList: " + e.Message );
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
 **postBasicMarketListRequest** | [**PostBasicMarketListRequest**](PostBasicMarketListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse2009**](InlineResponse2009.md)

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


<a name="postbasicmediatypelist"></a>
# **PostBasicMediaTypeList**
> InlineResponse20013 PostBasicMediaTypeList (PostBasicMediaTypeListRequest postBasicMediaTypeListRequest = null)

List of Internet media types.

List of Internet media types. See http://www.iana.org/assignments/media-types/ for further details. Not all such Internet media types are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicMediaTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicMediaTypeListRequest = new PostBasicMediaTypeListRequest(); // PostBasicMediaTypeListRequest | Request Body (optional) 

            try
            {
                // List of Internet media types.
                InlineResponse20013 result = apiInstance.PostBasicMediaTypeList(postBasicMediaTypeListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicMediaTypeList: " + e.Message );
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
 **postBasicMediaTypeListRequest** | [**PostBasicMediaTypeListRequest**](PostBasicMediaTypeListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20013**](InlineResponse20013.md)

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


<a name="postbasicmicoperatinglist"></a>
# **PostBasicMicOperatingList**
> InlineResponse20014 PostBasicMicOperatingList (PostBasicMicOperatingListRequest postBasicMicOperatingListRequest = null)

List of operating market identifier codes (MIC).

List of operating market identifier codes (MIC).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicMicOperatingListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicMicOperatingListRequest = new PostBasicMicOperatingListRequest(); // PostBasicMicOperatingListRequest | Request Body (optional) 

            try
            {
                // List of operating market identifier codes (MIC).
                InlineResponse20014 result = apiInstance.PostBasicMicOperatingList(postBasicMicOperatingListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicMicOperatingList: " + e.Message );
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
 **postBasicMicOperatingListRequest** | [**PostBasicMicOperatingListRequest**](PostBasicMicOperatingListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20014**](InlineResponse20014.md)

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


<a name="postbasictimezonelist"></a>
# **PostBasicTimezoneList**
> InlineResponse20024 PostBasicTimezoneList (PostBasicTimezoneListRequest postBasicTimezoneListRequest = null)

List of timezones.

List of timezones identified by id, as specified by the Internet Assigned Numbers Authority. See http://www.iana.org/time-zones for further details. Not all such timezones are available on the MDG.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicTimezoneListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicTimezoneListRequest = new PostBasicTimezoneListRequest(); // PostBasicTimezoneListRequest | Request Body (optional) 

            try
            {
                // List of timezones.
                InlineResponse20024 result = apiInstance.PostBasicTimezoneList(postBasicTimezoneListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicTimezoneList: " + e.Message );
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
 **postBasicTimezoneListRequest** | [**PostBasicTimezoneListRequest**](PostBasicTimezoneListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20024**](InlineResponse20024.md)

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


<a name="postbasicvalueunitcurrencylist"></a>
# **PostBasicValueUnitCurrencyList**
> InlineResponse20028 PostBasicValueUnitCurrencyList (PostBasicValueUnitCurrencyListRequest postBasicValueUnitCurrencyListRequest = null)

List of currencies.

List of currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicValueUnitCurrencyListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicValueUnitCurrencyListRequest = new PostBasicValueUnitCurrencyListRequest(); // PostBasicValueUnitCurrencyListRequest | Request Body (optional) 

            try
            {
                // List of currencies.
                InlineResponse20028 result = apiInstance.PostBasicValueUnitCurrencyList(postBasicValueUnitCurrencyListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicValueUnitCurrencyList: " + e.Message );
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
 **postBasicValueUnitCurrencyListRequest** | [**PostBasicValueUnitCurrencyListRequest**](PostBasicValueUnitCurrencyListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20028**](InlineResponse20028.md)

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


<a name="postbasicvalueunitcurrencymainlist"></a>
# **PostBasicValueUnitCurrencyMainList**
> InlineResponse20031 PostBasicValueUnitCurrencyMainList (PostBasicValueUnitCurrencyMainListRequest postBasicValueUnitCurrencyMainListRequest = null)

List of main currencies.

List of main currencies.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicValueUnitCurrencyMainListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicValueUnitCurrencyMainListRequest = new PostBasicValueUnitCurrencyMainListRequest(); // PostBasicValueUnitCurrencyMainListRequest | Request Body (optional) 

            try
            {
                // List of main currencies.
                InlineResponse20031 result = apiInstance.PostBasicValueUnitCurrencyMainList(postBasicValueUnitCurrencyMainListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicValueUnitCurrencyMainList: " + e.Message );
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
 **postBasicValueUnitCurrencyMainListRequest** | [**PostBasicValueUnitCurrencyMainListRequest**](PostBasicValueUnitCurrencyMainListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20031**](InlineResponse20031.md)

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


<a name="postbasicvalueunitlist"></a>
# **PostBasicValueUnitList**
> InlineResponse20026 PostBasicValueUnitList (PostBasicValueUnitListRequest postBasicValueUnitListRequest = null)

List of value units.

List of value units.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.RealTimeNews.Api;
using FactSet.SDK.RealTimeNews.Client;
using FactSet.SDK.RealTimeNews.Model;

namespace Example
{
    public class PostBasicValueUnitListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.RealTimeNews.Client.Configuration();

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

            var apiInstance = new BasicApi(config);

            var postBasicValueUnitListRequest = new PostBasicValueUnitListRequest(); // PostBasicValueUnitListRequest | Request Body (optional) 

            try
            {
                // List of value units.
                InlineResponse20026 result = apiInstance.PostBasicValueUnitList(postBasicValueUnitListRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BasicApi.PostBasicValueUnitList: " + e.Message );
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
 **postBasicValueUnitListRequest** | [**PostBasicValueUnitListRequest**](PostBasicValueUnitListRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse20026**](InlineResponse20026.md)

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


