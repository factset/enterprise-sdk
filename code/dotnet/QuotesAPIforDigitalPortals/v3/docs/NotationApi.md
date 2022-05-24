# FactSet.SDK.QuotesAPIforDigitalPortals.Api.NotationApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNotationCrossReferenceFactSetIdentifierGet**](NotationApi.md#getnotationcrossreferencefactsetidentifierget) | **GET** /notation/crossReference/factSetIdentifier/get | Retrieve FactSet identifiers for a given notation.
[**GetNotationCrossReferenceGetByFactSetMarketSymbol**](NotationApi.md#getnotationcrossreferencegetbyfactsetmarketsymbol) | **GET** /notation/crossReference/getByFactSetMarketSymbol | Translate a FactSet market symbol to a notation.
[**GetNotationGet**](NotationApi.md#getnotationget) | **GET** /notation/get | Basic data for a notation.
[**GetNotationKeyFiguresMonth1Get**](NotationApi.md#getnotationkeyfiguresmonth1get) | **GET** /notation/keyFigures/month/1/get | End-of-day (EOD) key figures for the time range of one month.
[**GetNotationKeyFiguresMonth1List**](NotationApi.md#getnotationkeyfiguresmonth1list) | **GET** /notation/keyFigures/month/1/list | End-of-day (EOD) key figures for the time range of one month, for a list of notations.
[**GetNotationKeyFiguresMonth3Get**](NotationApi.md#getnotationkeyfiguresmonth3get) | **GET** /notation/keyFigures/month/3/get | End-of-day (EOD) key figures for the time range of three months.
[**GetNotationKeyFiguresMonth3List**](NotationApi.md#getnotationkeyfiguresmonth3list) | **GET** /notation/keyFigures/month/3/list | End-of-day (EOD) key figures for the time range of three months, for a list of notations.
[**GetNotationKeyFiguresMonth6Get**](NotationApi.md#getnotationkeyfiguresmonth6get) | **GET** /notation/keyFigures/month/6/get | End-of-day (EOD) key figures for the time range of six months.
[**GetNotationKeyFiguresMonth6List**](NotationApi.md#getnotationkeyfiguresmonth6list) | **GET** /notation/keyFigures/month/6/list | End-of-day (EOD) key figures for the time range of six months, for a list of notations.
[**GetNotationKeyFiguresWeek1Get**](NotationApi.md#getnotationkeyfiguresweek1get) | **GET** /notation/keyFigures/week/1/get | End-of-day (EOD) key figures for the time range of one week.
[**GetNotationKeyFiguresWeek1List**](NotationApi.md#getnotationkeyfiguresweek1list) | **GET** /notation/keyFigures/week/1/list | End-of-day (EOD) key figures for the time range of one week, for a list of notations.
[**GetNotationKeyFiguresYear1Get**](NotationApi.md#getnotationkeyfiguresyear1get) | **GET** /notation/keyFigures/year/1/get | End-of-day (EOD) key figures for the time range of one year.
[**GetNotationKeyFiguresYear1List**](NotationApi.md#getnotationkeyfiguresyear1list) | **GET** /notation/keyFigures/year/1/list | End-of-day (EOD) key figures for the time range of one year, for a list of notations.
[**GetNotationKeyFiguresYear3Get**](NotationApi.md#getnotationkeyfiguresyear3get) | **GET** /notation/keyFigures/year/3/get | End-of-day (EOD) key figures for the time range of three years.
[**GetNotationKeyFiguresYear3List**](NotationApi.md#getnotationkeyfiguresyear3list) | **GET** /notation/keyFigures/year/3/list | End-of-day (EOD) key figures for the time range of three years, for a list of notations.
[**GetNotationKeyFiguresYear5Get**](NotationApi.md#getnotationkeyfiguresyear5get) | **GET** /notation/keyFigures/year/5/get | End-of-day (EOD) key figures for the time range of five years.
[**GetNotationKeyFiguresYear5List**](NotationApi.md#getnotationkeyfiguresyear5list) | **GET** /notation/keyFigures/year/5/list | End-of-day (EOD) key figures for the time range of five years, for a list of notations.
[**GetNotationKeyFiguresYearToDateGet**](NotationApi.md#getnotationkeyfiguresyeartodateget) | **GET** /notation/keyFigures/yearToDate/get | End-of-day (EOD) key figures for the time range year-to-date (YTD)..
[**GetNotationKeyFiguresYearToDateList**](NotationApi.md#getnotationkeyfiguresyeartodatelist) | **GET** /notation/keyFigures/yearToDate/list | End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
[**GetNotationList**](NotationApi.md#getnotationlist) | **GET** /notation/list | Basic data for a list of notations.
[**GetNotationSearchBasic**](NotationApi.md#getnotationsearchbasic) | **GET** /notation/search/basic | Basic search for notations.
[**GetNotationSearchByTextRankedByVolume**](NotationApi.md#getnotationsearchbytextrankedbyvolume) | **GET** /notation/searchByTextRankedByVolume | Basic search for notations.
[**GetNotationStatusGet**](NotationApi.md#getnotationstatusget) | **GET** /notation/status/get | Intraday trading status of a notation.
[**PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier**](NotationApi.md#postnotationcrossreferencefactsetidentifierlistbyfactsetidentifier) | **POST** /notation/crossReference/factSetIdentifier/listByFactSetIdentifier | Retrieve a list of notations for a given FactSet identifier.
[**PostNotationCrossReferenceFactSetIdentifierListByInstrument**](NotationApi.md#postnotationcrossreferencefactsetidentifierlistbyinstrument) | **POST** /notation/crossReference/factSetIdentifier/listByInstrument | Retrieve a list of FactSet identifiers for a given instrument.
[**PostNotationCrossReferenceListByISIN**](NotationApi.md#postnotationcrossreferencelistbyisin) | **POST** /notation/crossReference/listByISIN | List of entitled notations.
[**PostNotationCrossReferenceListByInstrument**](NotationApi.md#postnotationcrossreferencelistbyinstrument) | **POST** /notation/crossReference/listByInstrument | List of entitled notations.
[**PostNotationCrossReferenceListBySymbol**](NotationApi.md#postnotationcrossreferencelistbysymbol) | **POST** /notation/crossReference/listBySymbol | List of entitled notations.
[**PostNotationSearchByText**](NotationApi.md#postnotationsearchbytext) | **POST** /notation/searchByText | Text-based search for notations.


<a name="getnotationcrossreferencefactsetidentifierget"></a>
# **GetNotationCrossReferenceFactSetIdentifierGet**
> InlineResponse20069 GetNotationCrossReferenceFactSetIdentifierGet (string id, List<string> attributes = null)

Retrieve FactSet identifiers for a given notation.

<p>Retrieve FactSet identifiers for a given notation. Security and listing-level identifiers are always included, regional level identifiers are included, if available.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationCrossReferenceFactSetIdentifierGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of a notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Retrieve FactSet identifiers for a given notation.
                InlineResponse20069 result = apiInstance.GetNotationCrossReferenceFactSetIdentifierGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationCrossReferenceFactSetIdentifierGet: " + e.Message );
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
 **id** | **string**| Identifier of a notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20069**](InlineResponse20069.md)

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

<a name="getnotationcrossreferencegetbyfactsetmarketsymbol"></a>
# **GetNotationCrossReferenceGetByFactSetMarketSymbol**
> InlineResponse20066 GetNotationCrossReferenceGetByFactSetMarketSymbol (string factSetMarketSymbol, List<string> attributes = null, string language = null)

Translate a FactSet market symbol to a notation.

Translate a FactSet market symbol to a notation. This symbol is also known as TICKER_EXCHANGE.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationCrossReferenceGetByFactSetMarketSymbolExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var factSetMarketSymbol = "factSetMarketSymbol_example";  // string | Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE).
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Translate a FactSet market symbol to a notation.
                InlineResponse20066 result = apiInstance.GetNotationCrossReferenceGetByFactSetMarketSymbol(factSetMarketSymbol, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationCrossReferenceGetByFactSetMarketSymbol: " + e.Message );
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
 **factSetMarketSymbol** | **string**| Market symbol defined by FactSet to identify a notation (i.e. TICKER_EXCHANGE). | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20066**](InlineResponse20066.md)

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

<a name="getnotationget"></a>
# **GetNotationGet**
> InlineResponse20064 GetNotationGet (string id, List<string> attributes = null, string language = null)

Basic data for a notation.

Basic data for a notation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of a notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Basic data for a notation.
                InlineResponse20064 result = apiInstance.GetNotationGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationGet: " + e.Message );
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
 **id** | **string**| Identifier of a notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20064**](InlineResponse20064.md)

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

<a name="getnotationkeyfiguresmonth1get"></a>
# **GetNotationKeyFiguresMonth1Get**
> InlineResponse20072 GetNotationKeyFiguresMonth1Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one month.

End-of-day (EOD) key figures for the time range of one month.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one month.
                InlineResponse20072 result = apiInstance.GetNotationKeyFiguresMonth1Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20072**](InlineResponse20072.md)

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

<a name="getnotationkeyfiguresmonth1list"></a>
# **GetNotationKeyFiguresMonth1List**
> InlineResponse20073 GetNotationKeyFiguresMonth1List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

End-of-day (EOD) key figures for the time range of one month, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth1ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one month, for a list of notations.
                InlineResponse20073 result = apiInstance.GetNotationKeyFiguresMonth1List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth1List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20073**](InlineResponse20073.md)

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

<a name="getnotationkeyfiguresmonth3get"></a>
# **GetNotationKeyFiguresMonth3Get**
> InlineResponse20074 GetNotationKeyFiguresMonth3Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of three months.

End-of-day (EOD) key figures for the time range of three months.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of three months.
                InlineResponse20074 result = apiInstance.GetNotationKeyFiguresMonth3Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth3Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20074**](InlineResponse20074.md)

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

<a name="getnotationkeyfiguresmonth3list"></a>
# **GetNotationKeyFiguresMonth3List**
> InlineResponse20075 GetNotationKeyFiguresMonth3List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

End-of-day (EOD) key figures for the time range of three months, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth3ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of three months, for a list of notations.
                InlineResponse20075 result = apiInstance.GetNotationKeyFiguresMonth3List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth3List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20075**](InlineResponse20075.md)

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

<a name="getnotationkeyfiguresmonth6get"></a>
# **GetNotationKeyFiguresMonth6Get**
> InlineResponse20074 GetNotationKeyFiguresMonth6Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of six months.

End-of-day (EOD) key figures for the time range of six months.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth6GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of six months.
                InlineResponse20074 result = apiInstance.GetNotationKeyFiguresMonth6Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth6Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20074**](InlineResponse20074.md)

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

<a name="getnotationkeyfiguresmonth6list"></a>
# **GetNotationKeyFiguresMonth6List**
> InlineResponse20075 GetNotationKeyFiguresMonth6List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

End-of-day (EOD) key figures for the time range of six months, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresMonth6ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of six months, for a list of notations.
                InlineResponse20075 result = apiInstance.GetNotationKeyFiguresMonth6List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresMonth6List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20075**](InlineResponse20075.md)

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

<a name="getnotationkeyfiguresweek1get"></a>
# **GetNotationKeyFiguresWeek1Get**
> InlineResponse20072 GetNotationKeyFiguresWeek1Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one week.

End-of-day (EOD) key figures for the time range of one week.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresWeek1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one week.
                InlineResponse20072 result = apiInstance.GetNotationKeyFiguresWeek1Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresWeek1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20072**](InlineResponse20072.md)

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

<a name="getnotationkeyfiguresweek1list"></a>
# **GetNotationKeyFiguresWeek1List**
> InlineResponse20073 GetNotationKeyFiguresWeek1List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

End-of-day (EOD) key figures for the time range of one week, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresWeek1ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one week, for a list of notations.
                InlineResponse20073 result = apiInstance.GetNotationKeyFiguresWeek1List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresWeek1List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20073**](InlineResponse20073.md)

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

<a name="getnotationkeyfiguresyear1get"></a>
# **GetNotationKeyFiguresYear1Get**
> InlineResponse20072 GetNotationKeyFiguresYear1Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one year.

End-of-day (EOD) key figures for the time range of one year.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one year.
                InlineResponse20072 result = apiInstance.GetNotationKeyFiguresYear1Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear1Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20072**](InlineResponse20072.md)

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

<a name="getnotationkeyfiguresyear1list"></a>
# **GetNotationKeyFiguresYear1List**
> InlineResponse20073 GetNotationKeyFiguresYear1List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

End-of-day (EOD) key figures for the time range of one year, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear1ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of one year, for a list of notations.
                InlineResponse20073 result = apiInstance.GetNotationKeyFiguresYear1List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear1List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20073**](InlineResponse20073.md)

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

<a name="getnotationkeyfiguresyear3get"></a>
# **GetNotationKeyFiguresYear3Get**
> InlineResponse20074 GetNotationKeyFiguresYear3Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of three years.

End-of-day (EOD) key figures for the time range of three years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of three years.
                InlineResponse20074 result = apiInstance.GetNotationKeyFiguresYear3Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear3Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20074**](InlineResponse20074.md)

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

<a name="getnotationkeyfiguresyear3list"></a>
# **GetNotationKeyFiguresYear3List**
> InlineResponse20075 GetNotationKeyFiguresYear3List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

End-of-day (EOD) key figures for the time range of three years, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear3ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of three years, for a list of notations.
                InlineResponse20075 result = apiInstance.GetNotationKeyFiguresYear3List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear3List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20075**](InlineResponse20075.md)

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

<a name="getnotationkeyfiguresyear5get"></a>
# **GetNotationKeyFiguresYear5Get**
> InlineResponse20074 GetNotationKeyFiguresYear5Get (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of five years.

End-of-day (EOD) key figures for the time range of five years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear5GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of five years.
                InlineResponse20074 result = apiInstance.GetNotationKeyFiguresYear5Get(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear5Get: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20074**](InlineResponse20074.md)

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

<a name="getnotationkeyfiguresyear5list"></a>
# **GetNotationKeyFiguresYear5List**
> InlineResponse20075 GetNotationKeyFiguresYear5List (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

End-of-day (EOD) key figures for the time range of five years, for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYear5ListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range of five years, for a list of notations.
                InlineResponse20075 result = apiInstance.GetNotationKeyFiguresYear5List(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYear5List: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20075**](InlineResponse20075.md)

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

<a name="getnotationkeyfiguresyeartodateget"></a>
# **GetNotationKeyFiguresYearToDateGet**
> InlineResponse20076 GetNotationKeyFiguresYearToDateGet (string id, List<string> attributes = null)

End-of-day (EOD) key figures for the time range year-to-date (YTD)..

End-of-day (EOD) key figures for the time range year-to-date (YTD). The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent trading day of the current calendar year for which EOD prices are available..

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYearToDateGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range year-to-date (YTD)..
                InlineResponse20076 result = apiInstance.GetNotationKeyFiguresYearToDateGet(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYearToDateGet: " + e.Message );
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
 **id** | **string**| Identifier of the notation. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20076**](InlineResponse20076.md)

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

<a name="getnotationkeyfiguresyeartodatelist"></a>
# **GetNotationKeyFiguresYearToDateList**
> InlineResponse20077 GetNotationKeyFiguresYearToDateList (List<string> ids, List<string> attributes = null)

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..

End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations. The time range YTD begins with the last trading day of the previous calendar year for which EOD prices are available and ends with the most recent tradingday of the current calendar year for which EOD prices are available..

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationKeyFiguresYearToDateListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // End-of-day (EOD) key figures for the time range year-to-date (YTD), for a list of notations..
                InlineResponse20077 result = apiInstance.GetNotationKeyFiguresYearToDateList(ids, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationKeyFiguresYearToDateList: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20077**](InlineResponse20077.md)

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

<a name="getnotationlist"></a>
# **GetNotationList**
> InlineResponse20065 GetNotationList (List<string> ids, List<string> attributes = null, string language = null)

Basic data for a list of notations.

Basic data for a list of notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var ids = new List<string>(); // List<string> | List of notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Basic data for a list of notations.
                InlineResponse20065 result = apiInstance.GetNotationList(ids, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationList: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

### Return type
[**InlineResponse20065**](InlineResponse20065.md)

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

<a name="getnotationsearchbasic"></a>
# **GetNotationSearchBasic**
> InlineResponse20088 GetNotationSearchBasic (string searchValue, List<string> nsins = null, string assetClass = null, bool? onlyActive = null, bool? popularity = null, List<string> attributes = null, string language = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

Basic search for notations.

Search for a notation whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered. Better matching results appear in the response before less relevant matches. If the parameter popularity is set to true, the popularity of the notation is the primary sort criterion. Popularity is affected mostly by the request frequency of the notation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationSearchBasicExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var searchValue = "searchValue_example";  // string | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
            var nsins = new List<string>(); // List<string> | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional) 
            var assetClass = "index";  // string | A parameter to limit the output to a particular asset class. (optional) 
            var onlyActive = true;  // bool? | If true, restricts the result to active notations. (optional)  (default to true)
            var popularity = false;  // bool? | If true, the results are sorted by descending popularity. (optional)  (default to false)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 
            var paginationOffset = 0.0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 20.0MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // Basic search for notations.
                InlineResponse20088 result = apiInstance.GetNotationSearchBasic(searchValue, nsins, assetClass, onlyActive, popularity, attributes, language, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationSearchBasic: " + e.Message );
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
 **searchValue** | **string**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. | 
 **nsins** | [**List&lt;string&gt;**](string.md)| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] 
 **assetClass** | **string**| A parameter to limit the output to a particular asset class. | [optional] 
 **onlyActive** | **bool?**| If true, restricts the result to active notations. | [optional] [default to true]
 **popularity** | **bool?**| If true, the results are sorted by descending popularity. | [optional] [default to false]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type
[**InlineResponse20088**](InlineResponse20088.md)

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

<a name="getnotationsearchbytextrankedbyvolume"></a>
# **GetNotationSearchByTextRankedByVolume**
> InlineResponse20090 GetNotationSearchByTextRankedByVolume (string searchValue, List<decimal> idMarkets = null, List<string> nsins = null, List<string> assetClass = null, bool? onlyActive = null, List<string> attributes = null, string language = null, decimal? paginationOffset = null, decimal? paginationLimit = null)

Basic search for notations.

Search for notations whose ISIN, specified NSINs, name, or symbol match the search value according to a tolerant full-text match algorithm. If more than one notation of an instrument matches, only the notation with the highest monetary trading volume, averaged over one month, is considered.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationSearchByTextRankedByVolumeExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var searchValue = "searchValue_example";  // string | Full-text search string. It may be enclosed in double quotes (\"). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \" daimler\".
            var idMarkets = new List<decimal>(); // List<decimal> | List of market identifiers. Limits the results to the given markets. For possible values, see endpoint `/basic/market/list`. (optional) 
            var nsins = new List<string>(); // List<string> | A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. (optional) 
            var assetClass = new List<string>(); // List<string> | Limits the results to a particular asset class. (optional) 
            var onlyActive = true;  // bool? | If true, restricts the result to active notations. (optional)  (default to true)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 
            var paginationOffset = 0.0MD;  // decimal? | Non-negative number of entries to skip, or 0 (default). (optional)  (default to 0.0M)
            var paginationLimit = 20.0MD;  // decimal? | Non-negative maximum number of entries to return. (optional)  (default to 20.0M)

            try
            {
                // Basic search for notations.
                InlineResponse20090 result = apiInstance.GetNotationSearchByTextRankedByVolume(searchValue, idMarkets, nsins, assetClass, onlyActive, attributes, language, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationSearchByTextRankedByVolume: " + e.Message );
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
 **searchValue** | **string**| Full-text search string. It may be enclosed in double quotes (\&quot;). No escaping is provided, therefore it is impossible to specify a search string containing double quotes. Relevance of word starts is indicated by a phrase starting with a space character, such as \&quot; daimler\&quot;. | 
 **idMarkets** | [**List&lt;decimal&gt;**](decimal.md)| List of market identifiers. Limits the results to the given markets. For possible values, see endpoint &#x60;/basic/market/list&#x60;. | [optional] 
 **nsins** | [**List&lt;string&gt;**](string.md)| A set of NSIN kinds to consider in the search. If the parameter is absent or the value is empty, all valid NSIN kinds are searched. | [optional] 
 **assetClass** | [**List&lt;string&gt;**](string.md)| Limits the results to a particular asset class. | [optional] 
 **onlyActive** | **bool?**| If true, restricts the result to active notations. | [optional] [default to true]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 
 **paginationOffset** | **decimal?**| Non-negative number of entries to skip, or 0 (default). | [optional] [default to 0.0M]
 **paginationLimit** | **decimal?**| Non-negative maximum number of entries to return. | [optional] [default to 20.0M]

### Return type
[**InlineResponse20090**](InlineResponse20090.md)

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

<a name="getnotationstatusget"></a>
# **GetNotationStatusGet**
> InlineResponse20078 GetNotationStatusGet (string id, string quality = null, List<string> attributes = null)

Intraday trading status of a notation.

Intraday trading status of a notation.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class GetNotationStatusGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var id = "id_example";  // string | Identifier of a notation.
            var quality = "RLT";  // string | Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). (optional)  (default to DLY)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // Intraday trading status of a notation.
                InlineResponse20078 result = apiInstance.GetNotationStatusGet(id, quality, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.GetNotationStatusGet: " + e.Message );
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
 **id** | **string**| Identifier of a notation. | 
 **quality** | **string**| Quality of the trading status. The trading status and related data for a notation cannot be retrieved in end-of-day quality (EOD). | [optional] [default to DLY]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse20078**](InlineResponse20078.md)

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

<a name="postnotationcrossreferencefactsetidentifierlistbyfactsetidentifier"></a>
# **PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier**
> InlineResponse20070 PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier (InlineObject19 body)

Retrieve a list of notations for a given FactSet identifier.

<p>Retrieve a list of notations for a given FactSet identifier, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.</p><p>The notation corresponding to the security's primary listing has the attributes <big><tt>regional.isPrimary</tt></big> and <big><tt>regional.listing.isPrimary</tt></big> both set to true.The security's primary listing might not be among the results depending on the entitlement.</p><p>See the group description for more information about the security's primary listing.</p>

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifierExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject19(); // InlineObject19 | 

            try
            {
                // Retrieve a list of notations for a given FactSet identifier.
                InlineResponse20070 result = apiInstance.PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationCrossReferenceFactSetIdentifierListByFactSetIdentifier: " + e.Message );
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
 **body** | [**InlineObject19**](InlineObject19.md)|  | 

### Return type
[**InlineResponse20070**](InlineResponse20070.md)

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

<a name="postnotationcrossreferencefactsetidentifierlistbyinstrument"></a>
# **PostNotationCrossReferenceFactSetIdentifierListByInstrument**
> InlineResponse20071 PostNotationCrossReferenceFactSetIdentifierListByInstrument (InlineObject20 body)

Retrieve a list of FactSet identifiers for a given instrument.

<p>Retrieve a list of FactSet identifiers for a given instrument, grouped by regional identifiers, if available. Listings without a regional identifier are grouped at the end of the response.</p><p>The notation corresponding to the security's primary listing has the attributes <big><tt>regional.isPrimary</tt></big> and <big><tt>regional.listing.isPrimary</tt></big> both set to true.The security's primary listing might not be among the results depending on the entitlement.</p><p>The result contains only notations that have at least one FactSet identifier (see <big><tt>listing.permanentIdentifier</tt></big>, <big><tt>listing.tickerExchange</tt></big>).</p><p>See the group description for more information about the security's primary listing.</p>

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationCrossReferenceFactSetIdentifierListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject20(); // InlineObject20 | 

            try
            {
                // Retrieve a list of FactSet identifiers for a given instrument.
                InlineResponse20071 result = apiInstance.PostNotationCrossReferenceFactSetIdentifierListByInstrument(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationCrossReferenceFactSetIdentifierListByInstrument: " + e.Message );
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
 **body** | [**InlineObject20**](InlineObject20.md)|  | 

### Return type
[**InlineResponse20071**](InlineResponse20071.md)

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

<a name="postnotationcrossreferencelistbyisin"></a>
# **PostNotationCrossReferenceListByISIN**
> InlineResponse20067 PostNotationCrossReferenceListByISIN (InlineObject17 body = null)

List of entitled notations.

List of entitled notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationCrossReferenceListByISINExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject17(); // InlineObject17 |  (optional) 

            try
            {
                // List of entitled notations.
                InlineResponse20067 result = apiInstance.PostNotationCrossReferenceListByISIN(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationCrossReferenceListByISIN: " + e.Message );
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
 **body** | [**InlineObject17**](InlineObject17.md)|  | [optional] 

### Return type
[**InlineResponse20067**](InlineResponse20067.md)

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

<a name="postnotationcrossreferencelistbyinstrument"></a>
# **PostNotationCrossReferenceListByInstrument**
> InlineResponse20067 PostNotationCrossReferenceListByInstrument (InlineObject16 body = null)

List of entitled notations.

List of entitled notations.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationCrossReferenceListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject16(); // InlineObject16 |  (optional) 

            try
            {
                // List of entitled notations.
                InlineResponse20067 result = apiInstance.PostNotationCrossReferenceListByInstrument(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationCrossReferenceListByInstrument: " + e.Message );
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
 **body** | [**InlineObject16**](InlineObject16.md)|  | [optional] 

### Return type
[**InlineResponse20067**](InlineResponse20067.md)

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

<a name="postnotationcrossreferencelistbysymbol"></a>
# **PostNotationCrossReferenceListBySymbol**
> InlineResponse20068 PostNotationCrossReferenceListBySymbol (InlineObject18 body = null)

List of entitled notations.

List of entitled notations. Symbols are not globally unique; therefore, a given symbol interpreted in different markets might refer to different instruments.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationCrossReferenceListBySymbolExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject18(); // InlineObject18 |  (optional) 

            try
            {
                // List of entitled notations.
                InlineResponse20068 result = apiInstance.PostNotationCrossReferenceListBySymbol(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationCrossReferenceListBySymbol: " + e.Message );
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
 **body** | [**InlineObject18**](InlineObject18.md)|  | [optional] 

### Return type
[**InlineResponse20068**](InlineResponse20068.md)

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

<a name="postnotationsearchbytext"></a>
# **PostNotationSearchByText**
> InlineResponse20089 PostNotationSearchByText (InlineObject22 body)

Text-based search for notations.

Text-based search for notations in selected identifier and name attributes according to a tolerant full-text match algorithm. The results satisfy all selected filters; sorting by various attributes is possible. If more than one notation of an instrument matches the parameters, and no market priority has been specified, only the notation with the highest trading volume, averaged over one month, is considered.       The result is limited to 10000 notations. All identifiers used as parameters must be valid and entitled.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.QuotesAPIforDigitalPortals.Api;
using FactSet.SDK.QuotesAPIforDigitalPortals.Client;
using FactSet.SDK.QuotesAPIforDigitalPortals.Model;

namespace Example
{
    public class PostNotationSearchByTextExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.QuotesAPIforDigitalPortals.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new NotationApi(config);
            var body = new InlineObject22(); // InlineObject22 | 

            try
            {
                // Text-based search for notations.
                InlineResponse20089 result = apiInstance.PostNotationSearchByText(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NotationApi.PostNotationSearchByText: " + e.Message );
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
 **body** | [**InlineObject22**](InlineObject22.md)|  | 

### Return type
[**InlineResponse20089**](InlineResponse20089.md)

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

