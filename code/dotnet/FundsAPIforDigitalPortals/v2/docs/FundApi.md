# FactSet.SDK.FundsAPIforDigitalPortals.Api.FundApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFundHoldingListByInstrument**](FundApi.md#getfundholdinglistbyinstrument) | **GET** /fund/holding/listByInstrument | Holdings of a fund.
[**GetFundNotationKeyFiguresBenchmarkMonth1Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkmonth1get) | **GET** /fund/notation/keyFigures/benchmark/month/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
[**GetFundNotationKeyFiguresBenchmarkMonth3Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkmonth3get) | **GET** /fund/notation/keyFigures/benchmark/month/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
[**GetFundNotationKeyFiguresBenchmarkWeek1Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkweek1get) | **GET** /fund/notation/keyFigures/benchmark/week/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
[**GetFundNotationKeyFiguresBenchmarkYear1Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkyear1get) | **GET** /fund/notation/keyFigures/benchmark/year/1/get | End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
[**GetFundNotationKeyFiguresBenchmarkYear3Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkyear3get) | **GET** /fund/notation/keyFigures/benchmark/year/3/get | End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
[**GetFundNotationKeyFiguresBenchmarkYear5Get**](FundApi.md#getfundnotationkeyfiguresbenchmarkyear5get) | **GET** /fund/notation/keyFigures/benchmark/year/5/get | End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
[**GetFundShareClassGet**](FundApi.md#getfundshareclassget) | **GET** /fund/shareClass/get | Fundamental data for a share class of a fund.
[**PostFundIssuerSearch**](FundApi.md#postfundissuersearch) | **POST** /fund/issuer/search | Search for issuers of funds.
[**PostFundNotationScreenerSearch**](FundApi.md#postfundnotationscreenersearch) | **POST** /fund/notation/screener/search | Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
[**PostFundNotationScreenerValueRangesGet**](FundApi.md#postfundnotationscreenervaluerangesget) | **POST** /fund/notation/screener/valueRanges/get | Possible values and value ranges for the parameters used in the endpoint &#x60;/fund/notation/screener/search&#x60;.


<a name="getfundholdinglistbyinstrument"></a>
# **GetFundHoldingListByInstrument**
> InlineResponse200 GetFundHoldingListByInstrument (string id, List<string> attributes = null, List<string> sort = null)

Holdings of a fund.

Holdings of a fund. Only the top 10 holdings with regard to their weighting in the fund portfolio are returned. Therefore, the weights of the holdings do not add up to 1 (i.e. 100%).

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundHoldingListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of an instrument of a fund share class.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var sort = new List<string>(); // List<string> | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. (optional) 

            try
            {
                // Holdings of a fund.
                InlineResponse200 result = apiInstance.GetFundHoldingListByInstrument(id, attributes, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundHoldingListByInstrument: " + e.Message );
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
 **id** | **string**| Identifier of an instrument of a fund share class. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkmonth1get"></a>
# **GetFundNotationKeyFiguresBenchmarkMonth1Get**
> InlineResponse2002 GetFundNotationKeyFiguresBenchmarkMonth1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

End-of-day (EOD) benchmark key figures of a fund for the time range of one month.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkMonth1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of one month.
                InlineResponse2002 result = apiInstance.GetFundNotationKeyFiguresBenchmarkMonth1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkMonth1Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkmonth3get"></a>
# **GetFundNotationKeyFiguresBenchmarkMonth3Get**
> InlineResponse2002 GetFundNotationKeyFiguresBenchmarkMonth3Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

End-of-day (EOD) benchmark key figures of a fund for the time range of three months.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkMonth3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of three months.
                InlineResponse2002 result = apiInstance.GetFundNotationKeyFiguresBenchmarkMonth3Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkMonth3Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkweek1get"></a>
# **GetFundNotationKeyFiguresBenchmarkWeek1Get**
> InlineResponse2003 GetFundNotationKeyFiguresBenchmarkWeek1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

End-of-day (EOD) benchmark key figures of a fund for the time range of one week.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkWeek1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of one week.
                InlineResponse2003 result = apiInstance.GetFundNotationKeyFiguresBenchmarkWeek1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkWeek1Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkyear1get"></a>
# **GetFundNotationKeyFiguresBenchmarkYear1Get**
> InlineResponse2002 GetFundNotationKeyFiguresBenchmarkYear1Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

End-of-day (EOD) benchmark key figures of a fund for the time range of one year.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkYear1GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of one year.
                InlineResponse2002 result = apiInstance.GetFundNotationKeyFiguresBenchmarkYear1Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkYear1Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkyear3get"></a>
# **GetFundNotationKeyFiguresBenchmarkYear3Get**
> InlineResponse2002 GetFundNotationKeyFiguresBenchmarkYear3Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

End-of-day (EOD) benchmark key figures of a fund for the time range of three years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkYear3GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of three years.
                InlineResponse2002 result = apiInstance.GetFundNotationKeyFiguresBenchmarkYear3Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkYear3Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundnotationkeyfiguresbenchmarkyear5get"></a>
# **GetFundNotationKeyFiguresBenchmarkYear5Get**
> InlineResponse2002 GetFundNotationKeyFiguresBenchmarkYear5Get (string id, List<string> idNotationBenchmark, List<string> attributes = null, string language = null)

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

End-of-day (EOD) benchmark key figures of a fund for the time range of five years.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundNotationKeyFiguresBenchmarkYear5GetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the notation.
            var idNotationBenchmark = new List<string>(); // List<string> | List of benchmark notations.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // End-of-day (EOD) benchmark key figures of a fund for the time range of five years.
                InlineResponse2002 result = apiInstance.GetFundNotationKeyFiguresBenchmarkYear5Get(id, idNotationBenchmark, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundNotationKeyFiguresBenchmarkYear5Get: " + e.Message );
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
 **idNotationBenchmark** | [**List&lt;string&gt;**](string.md)| List of benchmark notations. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="getfundshareclassget"></a>
# **GetFundShareClassGet**
> InlineResponse2006 GetFundShareClassGet (string id, List<string> attributes = null, string language = null)

Fundamental data for a share class of a fund.

The provided fundamental data comprises share class-specific data and data applying to the fund and thus to all its share classes. An instrument other than a fund share class yields empty values for share class-specific or fund-specific attributes.   Dates are interpreted in the timezone of the fund company. For attributes referring to a country, see endpoint `/basic/region/country/list` for possible values.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class GetFundShareClassGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var id = "id_example";  // string | Identifier of the instrument.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string | ISO 639-1 code of the language. (optional) 

            try
            {
                // Fundamental data for a share class of a fund.
                InlineResponse2006 result = apiInstance.GetFundShareClassGet(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.GetFundShareClassGet: " + e.Message );
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
 **id** | **string**| Identifier of the instrument. | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**| ISO 639-1 code of the language. | [optional] 

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

<a name="postfundissuersearch"></a>
# **PostFundIssuerSearch**
> InlineResponse2001 PostFundIssuerSearch (InlineObject body = null)

Search for issuers of funds.

Search for issuers of funds. FactSet does not consolidate the data provided by different suppliers, therefore the result may contain more than one identifier for a given issuer. The response is limited to 100 results.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostFundIssuerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var body = new InlineObject(); // InlineObject |  (optional) 

            try
            {
                // Search for issuers of funds.
                InlineResponse2001 result = apiInstance.PostFundIssuerSearch(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.PostFundIssuerSearch: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postfundnotationscreenersearch"></a>
# **PostFundNotationScreenerSearch**
> InlineResponse2004 PostFundNotationScreenerSearch (InlineObject1 body = null)

Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.

Screener for notations of share classes of mutual and exchange traded funds (ETF) based on fund-specific parameters. The funds represent legal entities, juristic persons in particular, and may have more than one share class. The share classes represent instruments, and the notations represent price sources for the share classes. Some parameters apply to the fund as a whole, i.e. a notation for each share class of a fund matching the criteria is returned, for example `issuer.selection`. Others apply to the share classes, thus only notations of matching share classes are returned, for example `minimumInvestment.initial`. The result is limited to the notations that satisfy all the selected filters. In order to guarantee comparability when using the performance parameters, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`) and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.       A specific set of share classes or share class notations can be restricted to or excluded by using customer-specific instrument or notation selection lists respectively. Such selection lists are set up by FactSet upon request. All identifiers used as parameters must be valid and entitled.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostFundNotationScreenerSearchExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var body = new InlineObject1(); // InlineObject1 |  (optional) 

            try
            {
                // Screener for notations of share classes of mutual and exchange traded funds based on fund-specific parameters.
                InlineResponse2004 result = apiInstance.PostFundNotationScreenerSearch(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.PostFundNotationScreenerSearch: " + e.Message );
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
 **body** | [**InlineObject1**](InlineObject1.md)|  | [optional] 

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

<a name="postfundnotationscreenervaluerangesget"></a>
# **PostFundNotationScreenerValueRangesGet**
> InlineResponse2005 PostFundNotationScreenerValueRangesGet (InlineObject2 body = null)

Possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`.

The endpoint returns the possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`. It allows to request the values and value ranges only for a restricted set of notations that match predefined parameters. The functionality may be used to pre-fill the values and value ranges of the parameters of the `/fund/notation/screener/search` endpoint so that performing a search always leads to a non-empty set of notations. In order to guarantee comparability when using the performance parameter, the endpoint is restricted to three markets only, Mountain-View Funds (`id=1126`), FactSet Fund Prices (`id=1127`), and WM Datenservice (`id=1050`) since the notations from these markets provide a net asset value (NAV) - based total performance. The total performance factors in all earnings distributions of a share class and thus allows to compare the overall (total) performance of distributing and non-distributing share classes.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FundsAPIforDigitalPortals.Api;
using FactSet.SDK.FundsAPIforDigitalPortals.Client;
using FactSet.SDK.FundsAPIforDigitalPortals.Model;

namespace Example
{
    public class PostFundNotationScreenerValueRangesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FundsAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new FundApi(config);
            var body = new InlineObject2(); // InlineObject2 |  (optional) 

            try
            {
                // Possible values and value ranges for the parameters used in the endpoint `/fund/notation/screener/search`.
                InlineResponse2005 result = apiInstance.PostFundNotationScreenerValueRangesGet(body);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundApi.PostFundNotationScreenerValueRangesGet: " + e.Message );
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
 **body** | [**InlineObject2**](InlineObject2.md)|  | [optional] 

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

