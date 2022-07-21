# FactSet.SDK.FactSetPrices.Api.HighLowApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetHighLow**](HighLowApi.md#gethighlow) | **GET** /factset-prices/v1/high-low | Gets the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.
[**GetHighLowForList**](HighLowApi.md#gethighlowforlist) | **POST** /factset-prices/v1/high-low | Requests the price high and price low of securities for a list of &#x60;ids&#x60; as of given date, period and frequency.


<a name="gethighlow"></a>
# **GetHighLow**
> HighLowResponse GetHighLow (List<string> ids, string date = null, string period = null, string priceType = null, string calendar = null, string currency = null, string adjust = null)

Gets the price high and price low of securities for a list of `ids` as of given date, period and frequency.

For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetHighLowExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var apiInstance = new HighLowApi(config);

            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var date = 2019-07-07;  // string | The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var period = "1D";  // string | The period of measure for the security's high and low pricing. This does not change display `frequency` but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** = Daily   * **W** = Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** = Year-to-Date   * **Y** =  Actual Annual, based on the start date.  (optional)  (default to 52W)
            var priceType = "INTRADAY";  // string | Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured.  (optional)  (default to CLOSE)
            var calendar = FIVEDAY;  // string | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (optional)  (default to FIVEDAY)
            var currency = USD;  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) 
            var adjust = SPLIT;  // string | Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments.  (optional)  (default to SPLIT)

            try
            {
                // Gets the price high and price low of securities for a list of `ids` as of given date, period and frequency.
                HighLowResponse result = apiInstance.GetHighLow(ids, date, period, priceType, calendar, currency, adjust);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HighLowApi.GetHighLow: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **date** | **string**| The as of date in **YYYY-MM-DD** format. This controls the perspective date in which the period parameter will be computed. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **period** | **string**| The period of measure for the security&#39;s high and low pricing. This does not change display &#x60;frequency&#x60; but rather the underlying period. For example, if you wish to fetch the latest 52 week high and low price, select 52W. All periods are referencing actual periods of measure, not period-ends where-    * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last trading day of the week. Use the 52W for representing the latest year.   * **M** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **YTD** &#x3D; Year-to-Date   * **Y** &#x3D;  Actual Annual, based on the start date.  | [optional] [default to 52W]
 **priceType** | **string**| Controls whether price high and low data is returned intraday or at the close. For example, by selecting INTRADAY, if a security price reached an all time high of 10 during trading hours over the period of measure but closed that day at 8, then the service will return 10. If CLOSE was selected the service would return 8 if that was the high for the period measured.  | [optional] [default to CLOSE]
 **calendar** | **string**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to FIVEDAY]
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **adjust** | **string**| Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  | [optional] [default to SPLIT]

### Return type
[**HighLowResponse**](HighLowResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of price high and price low values. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="gethighlowforlist"></a>
# **GetHighLowForList**
> HighLowResponse GetHighLowForList (HighLowRequest highLowRequest)

Requests the price high and price low of securities for a list of `ids` as of given date, period and frequency.

For given security(s), gets the high and low prices with the respective dates on which they occurred. This service gives options for fetching the price as of the close or intraday. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrices.Api;
using FactSet.SDK.FactSetPrices.Client;
using FactSet.SDK.FactSetPrices.Model;

namespace Example
{
    public class GetHighLowForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrices.Client.Configuration();

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

            var apiInstance = new HighLowApi(config);

            var highLowRequest = new HighLowRequest(); // HighLowRequest | Request object for high low prices.

            try
            {
                // Requests the price high and price low of securities for a list of `ids` as of given date, period and frequency.
                HighLowResponse result = apiInstance.GetHighLowForList(highLowRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling HighLowApi.GetHighLowForList: " + e.Message );
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
 **highLowRequest** | [**HighLowRequest**](HighLowRequest.md)| Request object for high low prices. | 

### Return type
[**HighLowResponse**](HighLowResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of company price high and price low values. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

