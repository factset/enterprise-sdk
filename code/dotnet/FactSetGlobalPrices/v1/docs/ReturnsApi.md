# FactSet.SDK.FactSetGlobalPrices.Api.ReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetReturns**](ReturnsApi.md#getreturns) | **GET** /factset-global-prices/v1/returns | Gets Returns for a list of &#x60;ids&#x60; as of given date range.
[**GetReturnsForList**](ReturnsApi.md#getreturnsforlist) | **POST** /factset-global-prices/v1/returns | Gets Returns for a list of &#x60;ids&#x60; as of given date range.


<a name="getreturns"></a>
# **GetReturns**
> ReturnsResponse GetReturns (List<string> ids, string startDate, string endDate = null, string currency = null, string frequency = null, string dividendAdjust = null)

Gets Returns for a list of `ids` as of given date range.

Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetReturnsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new ReturnsApi(config);

            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var startDate = 2021-08-27;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = 2021-08-27;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  (optional) 
            var currency = USD;  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) 
            var frequency = "D";  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **AD** = Actual Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** =  Actual Quarterly   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** = Actual Semi-annual   * **CSA** = Calendar Semi-annual   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.     (optional)  (default to D)
            var dividendAdjust = "PRICE";  // string | Controls the dividend reinvestment for the returns calculation.   * **PRICE** = Price Change - Dividends Excluded.   * **EXDATE** = Simple Return - Dividends Received on exdate but not reinvested.   * **EXDATE_C** = Compound Return - Dividends reinvested on exdate.      (optional)  (default to EXDATE_C)

            try
            {
                // Gets Returns for a list of `ids` as of given date range.
                ReturnsResponse result = apiInstance.GetReturns(ids, startDate, endDate, currency, frequency, dividendAdjust);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReturnsApi.GetReturns: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. The input start date must be before the input end date. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. The input end date must be after the input start date. Future dates (T+1) are not accepted in this endpoint.  | [optional] 
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **AD** &#x3D; Actual Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D;  Actual Quarterly   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **ASA** &#x3D; Actual Semi-annual   * **CSA** &#x3D; Calendar Semi-annual   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.     | [optional] [default to D]
 **dividendAdjust** | **string**| Controls the dividend reinvestment for the returns calculation.   * **PRICE** &#x3D; Price Change - Dividends Excluded.   * **EXDATE** &#x3D; Simple Return - Dividends Received on exdate but not reinvested.   * **EXDATE_C** &#x3D; Compound Return - Dividends reinvested on exdate.      | [optional] [default to EXDATE_C]

### Return type
[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of Returns Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getreturnsforlist"></a>
# **GetReturnsForList**
> ReturnsResponse GetReturnsForList (ReturnsRequest returnsRequest)

Gets Returns for a list of `ids` as of given date range.

Returns for the requested ids and currency for the given dates. Depending on the input parameters the return data is provided.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetReturnsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new ReturnsApi(config);

            var returnsRequest = new ReturnsRequest(); // ReturnsRequest | Request object for `Returns`.

            try
            {
                // Gets Returns for a list of `ids` as of given date range.
                ReturnsResponse result = apiInstance.GetReturnsForList(returnsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReturnsApi.GetReturnsForList: " + e.Message );
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
 **returnsRequest** | [**ReturnsRequest**](ReturnsRequest.md)| Request object for &#x60;Returns&#x60;. | 

### Return type
[**ReturnsResponse**](ReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of security prices |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

