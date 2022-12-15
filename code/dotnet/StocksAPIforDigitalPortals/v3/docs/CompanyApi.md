# FactSet.SDK.StocksAPIforDigitalPortals.Api.CompanyApi

All URIs are relative to *https://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyBoardListByInstrument**](CompanyApi.md#getcompanyboardlistbyinstrument) | **GET** /company/board/listByInstrument | List of boards for a company, with their officers.
[**GetCompanyBoardOfficerFunctionDeliveryList**](CompanyApi.md#getcompanyboardofficerfunctiondeliverylist) | **GET** /company/board/officer/function/delivery/list | List of officer functions as provided by a delivery.
[**GetCompanyBoardTypeList**](CompanyApi.md#getcompanyboardtypelist) | **GET** /company/board/type/list | List of company board types.
[**PostCompanyEstimatesListByInstrument**](CompanyApi.md#postcompanyestimateslistbyinstrument) | **POST** /company/estimates/listByInstrument | Estimates for selected figures for a stock.
[**PostCompanyKeyItemsCurrentGetByInstrument**](CompanyApi.md#postcompanykeyitemscurrentgetbyinstrument) | **POST** /company/keyItems/current/getByInstrument | Fundamentals for a stock with potentially daily updates.
[**PostCompanyKeyItemsFiscalYearListByInstrument**](CompanyApi.md#postcompanykeyitemsfiscalyearlistbyinstrument) | **POST** /company/keyItems/fiscalYear/listByInstrument | Selected fundamentals for a stock with values as of the end of a fiscal year.


<a name="getcompanyboardlistbyinstrument"></a>
# **GetCompanyBoardListByInstrument**
> InlineResponse2005 GetCompanyBoardListByInstrument (string id, List<string> attributes = null, string language = null)

List of boards for a company, with their officers.

List of boards for a company, with their officers. A given person may be a member ofdifferent boards of the same company but also a member of boards of different companies.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetCompanyBoardListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var id = "id_example";  // string | 
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // List of boards for a company, with their officers.
                InlineResponse2005 result = apiInstance.GetCompanyBoardListByInstrument(id, attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyBoardListByInstrument: " + e.Message );
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
 **id** | **string**|  | 
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 
 **language** | **string**|  | [optional] 

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

<a name="getcompanyboardofficerfunctiondeliverylist"></a>
# **GetCompanyBoardOfficerFunctionDeliveryList**
> InlineResponse2006 GetCompanyBoardOfficerFunctionDeliveryList (List<string> attributes = null, string language = null)

List of officer functions as provided by a delivery.

List of officer functions as provided by a delivery.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetCompanyBoardOfficerFunctionDeliveryListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // List of officer functions as provided by a delivery.
                InlineResponse2006 result = apiInstance.GetCompanyBoardOfficerFunctionDeliveryList(attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyBoardOfficerFunctionDeliveryList: " + e.Message );
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
 **language** | **string**|  | [optional] 

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

<a name="getcompanyboardtypelist"></a>
# **GetCompanyBoardTypeList**
> InlineResponse2007 GetCompanyBoardTypeList (List<string> attributes = null, string language = null)

List of company board types.

List of company board types.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class GetCompanyBoardTypeListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 
            var language = "language_example";  // string |  (optional) 

            try
            {
                // List of company board types.
                InlineResponse2007 result = apiInstance.GetCompanyBoardTypeList(attributes, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyBoardTypeList: " + e.Message );
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
 **language** | **string**|  | [optional] 

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

<a name="postcompanyestimateslistbyinstrument"></a>
# **PostCompanyEstimatesListByInstrument**
> InlineResponse2002 PostCompanyEstimatesListByInstrument (PostCompanyEstimatesListByInstrumentRequest postCompanyEstimatesListByInstrumentRequest = null)

Estimates for selected figures for a stock.

Fiscal year estimates for selected figures of a stock. Data is available only for common shares; instruments such as preferred shares or depository receipts yield an empty result. For the share type, see endpoint `/instrument/category/list` using dataset 23. Data can be retrieved only for the current, the past, and three future fiscal years. For past fiscal years, the estimates are not being replaced by the reported figures. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostCompanyEstimatesListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var postCompanyEstimatesListByInstrumentRequest = new PostCompanyEstimatesListByInstrumentRequest(); // PostCompanyEstimatesListByInstrumentRequest |  (optional) 

            try
            {
                // Estimates for selected figures for a stock.
                InlineResponse2002 result = apiInstance.PostCompanyEstimatesListByInstrument(postCompanyEstimatesListByInstrumentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.PostCompanyEstimatesListByInstrument: " + e.Message );
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
 **postCompanyEstimatesListByInstrumentRequest** | [**PostCompanyEstimatesListByInstrumentRequest**](PostCompanyEstimatesListByInstrumentRequest.md)|  | [optional] 

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

<a name="postcompanykeyitemscurrentgetbyinstrument"></a>
# **PostCompanyKeyItemsCurrentGetByInstrument**
> InlineResponse200 PostCompanyKeyItemsCurrentGetByInstrument (PostCompanyKeyItemsCurrentGetByInstrumentRequest postCompanyKeyItemsCurrentGetByInstrumentRequest = null)

Fundamentals for a stock with potentially daily updates.

Fundamentals for a stock with potentially daily updates; any other instrument yields empty values for stock-specific attributes. The price used to calculate the various price-dependent figures is unspecified and the exchange for that price is not identified. Dates are interpreted in the timezone of the data provider. For reported company fundamentals of the previous fiscal years (only closed fiscal years) see endpoint `/company/keyItems/fiscalYear/listByInstrument.`

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostCompanyKeyItemsCurrentGetByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var postCompanyKeyItemsCurrentGetByInstrumentRequest = new PostCompanyKeyItemsCurrentGetByInstrumentRequest(); // PostCompanyKeyItemsCurrentGetByInstrumentRequest |  (optional) 

            try
            {
                // Fundamentals for a stock with potentially daily updates.
                InlineResponse200 result = apiInstance.PostCompanyKeyItemsCurrentGetByInstrument(postCompanyKeyItemsCurrentGetByInstrumentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.PostCompanyKeyItemsCurrentGetByInstrument: " + e.Message );
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
 **postCompanyKeyItemsCurrentGetByInstrumentRequest** | [**PostCompanyKeyItemsCurrentGetByInstrumentRequest**](PostCompanyKeyItemsCurrentGetByInstrumentRequest.md)|  | [optional] 

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="postcompanykeyitemsfiscalyearlistbyinstrument"></a>
# **PostCompanyKeyItemsFiscalYearListByInstrument**
> InlineResponse2001 PostCompanyKeyItemsFiscalYearListByInstrument (PostCompanyKeyItemsFiscalYearListByInstrumentRequest postCompanyKeyItemsFiscalYearListByInstrumentRequest = null)

Selected fundamentals for a stock with values as of the end of a fiscal year.

Selected fundamentals for a stock with values as of the end of a fiscal year; any other instrument yields empty values for stock-specific attributes. The endpoint allows the retrieval of data only for specified fiscal years by using the start and end properties. Since a fiscal year and a calendar year do not necessarily match with regard to their start and end dates, the year is derived as the calendar year occupied to a larger extent by the fiscal year, using a June through May fiscal year assignment. That means, fiscal years ending from the 1st of June onwards are assigned to the same calendar year. Dates are interpreted in the timezone of the location of the head office of the company.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StocksAPIforDigitalPortals.Api;
using FactSet.SDK.StocksAPIforDigitalPortals.Client;
using FactSet.SDK.StocksAPIforDigitalPortals.Model;

namespace Example
{
    public class PostCompanyKeyItemsFiscalYearListByInstrumentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StocksAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var postCompanyKeyItemsFiscalYearListByInstrumentRequest = new PostCompanyKeyItemsFiscalYearListByInstrumentRequest(); // PostCompanyKeyItemsFiscalYearListByInstrumentRequest |  (optional) 

            try
            {
                // Selected fundamentals for a stock with values as of the end of a fiscal year.
                InlineResponse2001 result = apiInstance.PostCompanyKeyItemsFiscalYearListByInstrument(postCompanyKeyItemsFiscalYearListByInstrumentRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.PostCompanyKeyItemsFiscalYearListByInstrument: " + e.Message );
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
 **postCompanyKeyItemsFiscalYearListByInstrumentRequest** | [**PostCompanyKeyItemsFiscalYearListByInstrumentRequest**](PostCompanyKeyItemsFiscalYearListByInstrumentRequest.md)|  | [optional] 

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

