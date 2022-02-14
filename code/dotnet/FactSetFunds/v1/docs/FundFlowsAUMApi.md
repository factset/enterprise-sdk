# FactSet.SDK.FactSetFunds.Api.FundFlowsAUMApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFundsAum**](FundFlowsAUMApi.md#getfundsaum) | **GET** /factset-funds/v1/aum | Get Fund AUM for a requested date range and list of ids
[**GetFundsAumForList**](FundFlowsAUMApi.md#getfundsaumforlist) | **POST** /factset-funds/v1/aum | Get Fund AUM for a requested date range and large list of ids
[**GetFundsFlows**](FundFlowsAUMApi.md#getfundsflows) | **GET** /factset-funds/v1/flows | Get Fund Flows for a requested date range and list of ids
[**GetFundsFlowsForList**](FundFlowsAUMApi.md#getfundsflowsforlist) | **POST** /factset-funds/v1/flows | Get Fund Flows for a requested date range and large list of ids


<a name="getfundsaum"></a>
# **GetFundsAum**
> AumResponse GetFundsAum (List<string> ids, string startDate = null, string endDate = null, string frequency = null, string currency = null, string dataType = null)

Get Fund AUM for a requested date range and list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsAumExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FundFlowsAUMApi(config);
            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var startDate = 2018-12-31;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var endDate = 2019-12-31;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var frequency = frequency_example;  // string | Controls the display frequency of the data returned.   * **MTD** = Month-To-Date   * **M** = Monthly, based on the last trading day of the month.   * **CQTD** = Calendar Quarter-to-Date   * **CQ** = Calendar Quarterly   * **CYTD** = Calendar Year-to-Date   * **CY** = Calendar Yearly  (optional)  (default to M)
            var currency = USD;  // string | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional)  (default to "LOCAL")
            var dataType = dataType_example;  // string | The Data Type of the NAV expressed as Raw or Rolled values. (optional)  (default to ROLL)

            try
            {
                // Get Fund AUM for a requested date range and list of ids
                AumResponse result = apiInstance.GetFundsAum(ids, startDate, endDate, frequency, currency, dataType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundFlowsAUMApi.GetFundsAum: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **MTD** &#x3D; Month-To-Date   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CQTD** &#x3D; Calendar Quarter-to-Date   * **CQ** &#x3D; Calendar Quarterly   * **CYTD** &#x3D; Calendar Year-to-Date   * **CY** &#x3D; Calendar Yearly  | [optional] [default to M]
 **currency** | **string**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &quot;LOCAL&quot;]
 **dataType** | **string**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] [default to ROLL]

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AUM response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfundsaumforlist"></a>
# **GetFundsAumForList**
> AumResponse GetFundsAumForList (AumRequest aumRequest)

Get Fund AUM for a requested date range and large list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsAumForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FundFlowsAUMApi(config);
            var aumRequest = new AumRequest(); // AumRequest | The AUM request body, allowing the user to specify a list of ids.

            try
            {
                // Get Fund AUM for a requested date range and large list of ids
                AumResponse result = apiInstance.GetFundsAumForList(aumRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundFlowsAUMApi.GetFundsAumForList: " + e.Message );
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
 **aumRequest** | [**AumRequest**](AumRequest.md)| The AUM request body, allowing the user to specify a list of ids. | 

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AUM response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfundsflows"></a>
# **GetFundsFlows**
> FlowsResponse GetFundsFlows (List<string> ids, string startDate = null, string endDate = null, string frequency = null, string currency = null)

Get Fund Flows for a requested date range and list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsFlowsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FundFlowsAUMApi(config);
            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var startDate = 2018-12-31;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var endDate = 2019-12-31;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var frequency = frequency_example;  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)  (default to M)
            var currency = USD;  // string | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional)  (default to "LOCAL")

            try
            {
                // Get Fund Flows for a requested date range and list of ids
                FlowsResponse result = apiInstance.GetFundsFlows(ids, startDate, endDate, frequency, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundFlowsAUMApi.GetFundsFlows: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to M]
 **currency** | **string**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &quot;LOCAL&quot;]

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Flows response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfundsflowsforlist"></a>
# **GetFundsFlowsForList**
> FlowsResponse GetFundsFlowsForList (FlowsRequest flowsRequest)

Get Fund Flows for a requested date range and large list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p> 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsFlowsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new FundFlowsAUMApi(config);
            var flowsRequest = new FlowsRequest(); // FlowsRequest | The Fund Flows request body, allowing the user to specify a list of ids.

            try
            {
                // Get Fund Flows for a requested date range and large list of ids
                FlowsResponse result = apiInstance.GetFundsFlowsForList(flowsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundFlowsAUMApi.GetFundsFlowsForList: " + e.Message );
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
 **flowsRequest** | [**FlowsRequest**](FlowsRequest.md)| The Fund Flows request body, allowing the user to specify a list of ids. | 

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The AUM response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

