# FactSet.SDK.FactSetFunds.Api.MarketAggregatesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMarketAggregates**](MarketAggregatesApi.md#getmarketaggregates) | **GET** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.
[**GetMarketAggregatesForList**](MarketAggregatesApi.md#getmarketaggregatesforlist) | **POST** /factset-funds/v1/aggregates/market | Get market aggregates for a requested time series.



<a name="getmarketaggregates"></a>
# **GetMarketAggregates**
> MarketAggregatesResponse GetMarketAggregates (List<string> ids, string startDate = null, string endDate = null, string frequency = null, string currency = null)

Get market aggregates for a requested time series.

Retrieves FactSet market aggregate data for the funds and date range specified. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetMarketAggregatesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var apiInstance = new MarketAggregatesApi(config);

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var startDate = "2018-12-31";  // string | The `start date` requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var endDate = "2019-12-31";  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var frequency = "D";  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.     (optional)  (default to M)
            var currency = "\"LOCAL\"";  // string | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  (optional)  (default to "LOCAL")

            try
            {
                // Get market aggregates for a requested time series.
                MarketAggregatesResponse result = apiInstance.GetMarketAggregates(ids, startDate, endDate, frequency, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketAggregatesApi.GetMarketAggregates: " + e.Message );
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
 **startDate** | **string**| The &#x60;start date&#x60; requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.     | [optional] [default to M]
 **currency** | **string**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  | [optional] [default to &quot;LOCAL&quot;]

### Return type
[**MarketAggregatesResponse**](MarketAggregatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Market Aggregates response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getmarketaggregatesforlist"></a>
# **GetMarketAggregatesForList**
> MarketAggregatesResponse GetMarketAggregatesForList (MarketAggregatesRequest marketAggregatesRequest)

Get market aggregates for a requested time series.

Retrieves FactSet market aggregate data for the funds and date range specified. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetMarketAggregatesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var apiInstance = new MarketAggregatesApi(config);

            var marketAggregatesRequest = new MarketAggregatesRequest(); // MarketAggregatesRequest | The Market Aggregates request body, allowing the user to specify a list of ids and date range.

            try
            {
                // Get market aggregates for a requested time series.
                MarketAggregatesResponse result = apiInstance.GetMarketAggregatesForList(marketAggregatesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MarketAggregatesApi.GetMarketAggregatesForList: " + e.Message );
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
 **marketAggregatesRequest** | [**MarketAggregatesRequest**](MarketAggregatesRequest.md)| The Market Aggregates request body, allowing the user to specify a list of ids and date range. | 

### Return type
[**MarketAggregatesResponse**](MarketAggregatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Market Aggregates response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


