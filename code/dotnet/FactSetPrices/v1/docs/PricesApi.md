# FactSet.SDK.FactSetPrices.Api.PricesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFixedSecurityPrices**](PricesApi.md#getfixedsecurityprices) | **GET** /factset-prices/v1/fixed-income | Gets pricing for a list of Fixed Income securities
[**GetFixedSecurityPricesForList**](PricesApi.md#getfixedsecuritypricesforlist) | **POST** /factset-prices/v1/fixed-income | Requests pricing for a list of Fixed Income securities for date range requested
[**GetSecurityPrices**](PricesApi.md#getsecurityprices) | **GET** /factset-prices/v1/prices | Gets end-of-day Open, High, Low, Close for a list of securities.
[**GetSecurityPricesForList**](PricesApi.md#getsecuritypricesforlist) | **POST** /factset-prices/v1/prices | Requests end-of-day Open, High, Low, Close for a large list of securities.


<a name="getfixedsecurityprices"></a>
# **GetFixedSecurityPrices**
> PricesFixedIncomeResponse GetFixedSecurityPrices (List<string> ids, string startDate = null, string endDate = null, string frequency = null)

Gets pricing for a list of Fixed Income securities

Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 

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
    public class GetFixedSecurityPricesExample
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

            var apiInstance = new PricesApi(config);
            var ids = new List<string>(); // List<string> | The requested list of Fixed Income security identifiers. <p>***ids limit** =  2000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var startDate = 2019-01-01;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var endDate = 2019-12-31;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var frequency = D;  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (optional)  (default to D)

            try
            {
                // Gets pricing for a list of Fixed Income securities
                PricesFixedIncomeResponse result = apiInstance.GetFixedSecurityPrices(ids, startDate, endDate, frequency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetFixedSecurityPrices: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of Fixed Income security identifiers. &lt;p&gt;***ids limit** &#x3D;  2000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] [default to D]

### Return type
[**PricesFixedIncomeResponse**](PricesFixedIncomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Fixed Income Security prices objects for date range requested |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfixedsecuritypricesforlist"></a>
# **GetFixedSecurityPricesForList**
> PricesFixedIncomeResponse GetFixedSecurityPricesForList (PricesFixedIncomeRequest pricesFixedIncomeRequest)

Requests pricing for a list of Fixed Income securities for date range requested

Get BID, MID, ASK, and Issuer Entity ID for a list of Fixed Income Securities as of a requested date range. Available for U.S. Corporate, Treasury and Agency bonds, Municipals, and non-U.S. Corporate and Government bonds. To learn more about Fixed Income Prices database, please review [OA:15995](https://my.apps.factset.com/oa/pages/15995) 

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
    public class GetFixedSecurityPricesForListExample
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

            var apiInstance = new PricesApi(config);
            var pricesFixedIncomeRequest = new PricesFixedIncomeRequest(); // PricesFixedIncomeRequest | Request object for Fixed Income `Security` prices.

            try
            {
                // Requests pricing for a list of Fixed Income securities for date range requested
                PricesFixedIncomeResponse result = apiInstance.GetFixedSecurityPricesForList(pricesFixedIncomeRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetFixedSecurityPricesForList: " + e.Message );
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
 **pricesFixedIncomeRequest** | [**PricesFixedIncomeRequest**](PricesFixedIncomeRequest.md)| Request object for Fixed Income &#x60;Security&#x60; prices. | 

### Return type
[**PricesFixedIncomeResponse**](PricesFixedIncomeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Fixed Income Security prices objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsecurityprices"></a>
# **GetSecurityPrices**
> PricesResponse GetSecurityPrices (List<string> ids, string startDate = null, string endDate = null, string frequency = null, string calendar = null, string currency = null, string adjust = null, string batch = null)

Gets end-of-day Open, High, Low, Close for a list of securities.

Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency. Prices are updated and at different times across the different regions around the globe. The Prices API automatically defaults relative price dates to the local region which is determined by the local region of the requested security id. To learn more about relative dates please visit [OA Page 4627](https://my.apps.factset.com/oa/pages/4627)  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. This feature is in **Beta**. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 

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
    public class GetSecurityPricesExample
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

            var apiInstance = new PricesApi(config);
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.<p>***ids limit** =  2000 per non-batch request / 5000 per batch request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var startDate = 2019-01-01;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var endDate = 2019-12-31;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var frequency = D;  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)  (default to D)
            var calendar = FIVEDAY;  // string | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (optional)  (default to FIVEDAY)
            var currency = USD;  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) 
            var adjust = SPLIT;  // string | Controls the split, spinoff, and dividend adjustments for the prices. <p>For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)</p>   * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **SPINOFF** = Splits & Spinoff Adjusted.   * **DIVADJ** = Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** = No Adjustments.  (optional)  (default to SPLIT)
            var batch = "Y";  // string | Enables the ability to asynchronously \"batch\" the request, supporting a long-running request up to **10 minutes**. Upon requesting batch=Y, the service will respond back with an HTTP Status Code of 202.  **`batch` is currently in **BETA**. Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \"Report Issue\" above and our support teams can assist.**  Once a batch request is submitted, use `batch/v1/status` to see if the job has completed. Once completed, retrieve the results of the request via `batch/v1/result`. See [Batching API](https://developer.factset.com/api-catalog/factset-content-api-batch) for more details.  When using Batch, `ids` limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It's advised to submit large lists of ids via POST method.  (optional)  (default to N)

            try
            {
                // Gets end-of-day Open, High, Low, Close for a list of securities.
                PricesApi.GetSecurityPricesResponseWrapper result = apiInstance.GetSecurityPrices(ids, startDate, endDate, frequency, calendar, currency, adjust, batch);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetSecurityPrices: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids.&lt;p&gt;***ids limit** &#x3D;  2000 per non-batch request / 5000 per batch request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] [default to D]
 **calendar** | **string**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] [default to FIVEDAY]
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **adjust** | **string**| Controls the split, spinoff, and dividend adjustments for the prices. &lt;p&gt;For more information, visit [Online Assistant Page 614](https://oa.apps.factset.com/pages/614)&lt;/p&gt;   * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **SPINOFF** &#x3D; Splits &amp; Spinoff Adjusted.   * **DIVADJ** &#x3D; Splits, Spinoffs, and Dividends adjusted.   * **UNSPLIT** &#x3D; No Adjustments.  | [optional] [default to SPLIT]
 **batch** | **string**| Enables the ability to asynchronously \&quot;batch\&quot; the request, supporting a long-running request up to **10 minutes**. Upon requesting batch&#x3D;Y, the service will respond back with an HTTP Status Code of 202.  **&#x60;batch&#x60; is currently in **BETA**. Additional Access Required. To gain access to this feature, reach out to your FactSet Account team or \&quot;Report Issue\&quot; above and our support teams can assist.**  Once a batch request is submitted, use &#x60;batch/v1/status&#x60; to see if the job has completed. Once completed, retrieve the results of the request via &#x60;batch/v1/result&#x60;. See [Batching API](https://developer.factset.com/api-catalog/factset-content-api-batch) for more details.  When using Batch, &#x60;ids&#x60; limit is increased to **5000** ids per request, though limits on query string via GET method still apply. It&#39;s advised to submit large lists of ids via POST method.  | [optional] [default to N]

### Return type
GetSecurityPricesResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security prices open, high, low, close, and volume. |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getsecuritypricesforlist"></a>
# **GetSecurityPricesForList**
> PricesResponse GetSecurityPricesForList (PricesRequest pricesRequest)

Requests end-of-day Open, High, Low, Close for a large list of securities.

 Gets security prices, Open, High, Low, Close, Volume, and currency for a specified date range and frequency.  *_/prices* endpoint currently supports Long Running asynchronous requests up to **10 minutes** via `batch` parameter. This feature is in **Beta**. **Additional Approvals needed for access**. Id limits increased to **5000 ids** per request using batch parameter. 

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
    public class GetSecurityPricesForListExample
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

            var apiInstance = new PricesApi(config);
            var pricesRequest = new PricesRequest(); // PricesRequest | Request object for `Security` prices.

            try
            {
                // Requests end-of-day Open, High, Low, Close for a large list of securities.
                PricesApi.GetSecurityPricesForListResponseWrapper result = apiInstance.GetSecurityPricesForList(pricesRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesApi.GetSecurityPricesForList: " + e.Message );
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
 **pricesRequest** | [**PricesRequest**](PricesRequest.md)| Request object for &#x60;Security&#x60; prices. | 

### Return type
GetSecurityPricesForListResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security prices |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request status. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

