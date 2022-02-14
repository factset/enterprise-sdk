# FactSet.SDK.ForeignExchangeRate.Api.ForwardsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFXForwards**](ForwardsApi.md#getfxforwards) | **GET** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs
[**GetFXForwardsForList**](ForwardsApi.md#getfxforwardsforlist) | **POST** /foreign-exchange/v1/forwards | Gets Forwards for a list of currency pairs


<a name="getfxforwards"></a>
# **GetFXForwards**
> ForwardsResponse GetFXForwards (List<string> ids, string forwardPeriod = null, string startDate = null, string endDate = null, string frequency = null)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ForeignExchangeRate.Api;
using FactSet.SDK.ForeignExchangeRate.Client;
using FactSet.SDK.ForeignExchangeRate.Model;

namespace Example
{
    public class GetFXForwardsExample
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

            var apiInstance = new ForwardsApi(config);
            var ids = new List<string>(); // List<string> | The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470)
            var forwardPeriod = ON;  // string | Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  (optional)  (default to 1M)
            var startDate = 2019-01-01;  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  (optional) 
            var endDate = 2019-12-31;  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  (optional) 
            var frequency = D;  // string | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional)  (default to D)

            try
            {
                // Gets Forwards for a list of currency pairs
                ForwardsResponse result = apiInstance.GetFXForwards(ids, forwardPeriod, startDate, endDate, frequency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ForwardsApi.GetFXForwards: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The currency pair requested in the format of a ISO {source}{target}. For a complete list of ISO currencies, please visit [OA 1470](https://my.apps.factset.com/oa/pages/1470) | 
 **forwardPeriod** | **string**| Bid, offer, and mid rates are available for the following 11 time periods.  * ON - Overnight  * TN - Tomorrow Next  * SW - One Week (Spot Week)  * 1M - One Month  * 2M - Two Months  * 3M - Three Months  * 6M - Six Months  * 9M - Nine Months  * 1Y - One Year  * 2Y - Two Years  * 5Y - Five Years  | [optional] [default to 1M]
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available.  | [optional] 
 **frequency** | **string**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).    * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] [default to D]

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of ids Forward Rates for the date range and frequency requested |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfxforwardsforlist"></a>
# **GetFXForwardsForList**
> ForwardsResponse GetFXForwardsForList (ForwardsRequest forwardsRequest)

Gets Forwards for a list of currency pairs

Forward rates are provided in 80+ currencies against the U.S. dollar, British pound, and euro. Forward quotes are provided by Reuters and coverage is determined by the amount of reliable currency trading in a particular currency. Bid, offer, and mid rates are available for 11 `forwardPeriod` periods - Overnight, Tomorrow Next, 1 Week (Spot Week), 1 month, 2 month, 3 month, 6 month, 9 month, 1 year, 2 year, 5 year. All identifiers have spot rates, but not all identifiers have forward rate data. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ForeignExchangeRate.Api;
using FactSet.SDK.ForeignExchangeRate.Client;
using FactSet.SDK.ForeignExchangeRate.Model;

namespace Example
{
    public class GetFXForwardsForListExample
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

            var apiInstance = new ForwardsApi(config);
            var forwardsRequest = new ForwardsRequest(); // ForwardsRequest | Request object for FX Forwards.

            try
            {
                // Gets Forwards for a list of currency pairs
                ForwardsResponse result = apiInstance.GetFXForwardsForList(forwardsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ForwardsApi.GetFXForwardsForList: " + e.Message );
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
 **forwardsRequest** | [**ForwardsRequest**](ForwardsRequest.md)| Request object for FX Forwards. | 

### Return type

[**ForwardsResponse**](ForwardsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of forward rates |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the servier is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

