# FactSet.SDK.FactSetEstimates.Api.BrokerDetailApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFixedDetail**](BrokerDetailApi.md#getfixeddetail) | **GET** /factset-estimates/v2/fixed-detail | Estimates detail data for fixed fiscal periods
[**GetFixedDetailForList**](BrokerDetailApi.md#getfixeddetailforlist) | **POST** /factset-estimates/v2/fixed-detail | Estimates detail data for fixed fiscal periods
[**GetRollingDetail**](BrokerDetailApi.md#getrollingdetail) | **GET** /factset-estimates/v2/rolling-detail | FactSet estimates detail data for rolling fiscal periods
[**GetRollingDetailForList**](BrokerDetailApi.md#getrollingdetailforlist) | **POST** /factset-estimates/v2/rolling-detail | FactSet estimates detail data for rolling fiscal periods



<a name="getfixeddetail"></a>
# **GetFixedDetail**
> DetailResponse GetFixedDetail (List<string> ids, List<string> metrics, DateTime? startDate = null, DateTime? endDate = null, string frequency = null, string periodicity = null, bool? includeAll = null, string fiscalPeriodStart = null, string fiscalPeriodEnd = null, string currency = null, List<string> brokerNames = null, bool? updatesOnly = null)

Estimates detail data for fixed fiscal periods

Updated intraday, the FactSet detail estimates apis provide individual broker-level estimates collected from over 800 sell-side analysts. This database contains 20+ years of broker history across more than 59,000 global companies. Content is provided for \"fixed\" fiscal periods. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetFixedDetailExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

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

            var apiInstance = new BrokerDetailApi(config);

            var ids = new List<string>(); // List<string> | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
            var metrics = new List<string>(); // List<string> | Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
            var startDate = DateTime.Parse("2019-07-30");  // DateTime? | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var endDate = DateTime.Parse("2019-08-30");  // DateTime? | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  (optional)  (default to D)
            var periodicity = "ANN";  // string | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   (optional)  (default to ANN)
            var includeAll = false;  // bool? | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus  (optional)  (default to false)
            var fiscalPeriodStart = "2019";  // string | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional) 
            var fiscalPeriodEnd = "2020";  // string | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional) 
            var currency = "USD";  // string | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional) 
            var brokerNames = new List<string>(); // List<string> | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). (optional) 
            var updatesOnly = false;  // bool? | When set to 'true', the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to 'false', data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as 'false' by default. (optional)  (default to false)

            try
            {
                // Estimates detail data for fixed fiscal periods
                DetailResponse result = apiInstance.GetFixedDetail(ids, metrics, startDate, endDate, frequency, periodicity, includeAll, fiscalPeriodStart, fiscalPeriodEnd, currency, brokerNames, updatesOnly);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BrokerDetailApi.GetFixedDetail: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
 **metrics** | [**List&lt;string&gt;**](string.md)| Requested metrics. Use the &#x60;/metrics&#x60; endpoint to return a list of available estimate items. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **DateTime?**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **DateTime?**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **string**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.  | [optional] [default to D]
 **periodicity** | **string**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   | [optional] [default to ANN]
 **includeAll** | **bool?**| Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  | [optional] [default to false]
 **fiscalPeriodStart** | **string**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
 **fiscalPeriodEnd** | **string**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional] 
 **currency** | **string**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **brokerNames** | [**List&lt;string&gt;**](string.md)| Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). | [optional] 
 **updatesOnly** | **bool?**| When set to &#39;true&#39;, the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to &#39;false&#39;, data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as &#39;false&#39; by default. | [optional] [default to false]

### Return type
[**DetailResponse**](DetailResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfixeddetailforlist"></a>
# **GetFixedDetailForList**
> DetailResponse GetFixedDetailForList (FixedDetailRequest fixedDetailRequest)

Estimates detail data for fixed fiscal periods

Updated intraday, the FactSet detail estimates apis provide individual broker-level estimates collected from over 800 sell-side analysts. This database contains 20+ years of broker history across more than 59,000 global companies. Content is provided for \"fixed\" fiscal periods. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetFixedDetailForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

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

            var apiInstance = new BrokerDetailApi(config);

            var fixedDetailRequest = new FixedDetailRequest(); // FixedDetailRequest | Request object for Estimate Data Items.

            try
            {
                // Estimates detail data for fixed fiscal periods
                DetailResponse result = apiInstance.GetFixedDetailForList(fixedDetailRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BrokerDetailApi.GetFixedDetailForList: " + e.Message );
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
 **fixedDetailRequest** | [**FixedDetailRequest**](FixedDetailRequest.md)| Request object for Estimate Data Items. | 

### Return type
[**DetailResponse**](DetailResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrollingdetail"></a>
# **GetRollingDetail**
> DetailResponse GetRollingDetail (List<string> ids, List<string> metrics, DateTime? startDate = null, DateTime? endDate = null, string frequency = null, string periodicity = null, bool? includeAll = null, int? relativeFiscalStart = null, int? relativeFiscalEnd = null, string currency = null, List<string> brokerNames = null, bool? updatesOnly = null)

FactSet estimates detail data for rolling fiscal periods

Updated intraday, the FactSet detail estimates apis provide individual broker-level estimates collected from over 800 sell-side analysts. This database contains 20+ years of broker history across more than 59,000 global companies. Content is provided for \"rolling\" fiscal periods.      

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetRollingDetailExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

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

            var apiInstance = new BrokerDetailApi(config);

            var ids = new List<string>(); // List<string> | Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. <p><b>Performance Note:</b> Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.</p> <p>If requesting long historical data, limit the history to <b>10 years per metric per ID</b>.</p> 
            var metrics = new List<string>(); // List<string> | Requested metrics. Use the `/metrics` endpoint to return a list of available estimate items. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
            var startDate = DateTime.Parse("2019-07-30");  // DateTime? | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var endDate = DateTime.Parse("2019-08-30");  // DateTime? | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional) 
            var frequency = "D";  // string | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.  (optional)  (default to D)
            var periodicity = "ANN";  // string | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   (optional)  (default to ANN)
            var includeAll = false;  // bool? | Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** = Returns all the brokers included and excluded in the consensus   * **FALSE** = Returns only the broker details included in the consensus  (optional)  (default to false)
            var relativeFiscalStart = 1;  // int? | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). (optional) 
            var relativeFiscalEnd = 2;  // int? | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). (optional) 
            var currency = "USD";  // string | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional) 
            var brokerNames = new List<string>(); // List<string> | Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). (optional) 
            var updatesOnly = false;  // bool? | When set to 'true', the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to 'false', data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as 'false' by default. (optional)  (default to false)

            try
            {
                // FactSet estimates detail data for rolling fiscal periods
                DetailResponse result = apiInstance.GetRollingDetail(ids, metrics, startDate, endDate, frequency, periodicity, includeAll, relativeFiscalStart, relativeFiscalEnd, currency, brokerNames, updatesOnly);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BrokerDetailApi.GetRollingDetail: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Security or Entity identifiers. Accepted inputs include FactSet Identifiers, tickers, CUSIP, and SEDOL. &lt;p&gt;&lt;b&gt;Performance Note:&lt;/b&gt; Requests that increase the number of metrics or request long historical data may trigger the 30-second service timeout threshold. To ensure system stability and performance, please keep requests lightweight.&lt;/p&gt; &lt;p&gt;If requesting long historical data, limit the history to &lt;b&gt;10 years per metric per ID&lt;/b&gt;.&lt;/p&gt;  | 
 **metrics** | [**List&lt;string&gt;**](string.md)| Requested metrics. Use the &#x60;/metrics&#x60; endpoint to return a list of available estimate items. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  | 
 **startDate** | **DateTime?**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **endDate** | **DateTime?**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional] 
 **frequency** | **string**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.  | [optional] [default to D]
 **periodicity** | **string**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, and Annual Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual   | [optional] [default to ANN]
 **includeAll** | **bool?**| Include All filter is used to identify included and excluded broker details from the consensus   By default the service would return only the brokers included in the consensus-   * **TRUE** &#x3D; Returns all the brokers included and excluded in the consensus   * **FALSE** &#x3D; Returns only the broker details included in the consensus  | [optional] [default to false]
 **relativeFiscalStart** | **int?**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional] 
 **relativeFiscalEnd** | **int?**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional] 
 **currency** | **string**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional] 
 **brokerNames** | [**List&lt;string&gt;**](string.md)| Filter to return estimate data from specific brokers only. Accepts broker names as input.  The endpoint returns data from all available brokers if this parameter is not specified. For a list of available brokers, visit [Online Assistant Page #14706](https://oa.apps.factset.com/pages/14706). | [optional] 
 **updatesOnly** | **bool?**| When set to &#39;true&#39;, the endpoint returns the first reported estimates during this period and any subsequent changes reported by the brokers. When set to &#39;false&#39;, data is returned for all dates in the requested date range based on the selected frequency. If unspecified, it is treated as &#39;false&#39; by default. | [optional] [default to false]

### Return type
[**DetailResponse**](DetailResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrollingdetailforlist"></a>
# **GetRollingDetailForList**
> DetailResponse GetRollingDetailForList (RollingDetailRequest rollingDetailRequest)

FactSet estimates detail data for rolling fiscal periods

Updated intraday, the FactSet detail estimates apis provide individual broker-level estimates collected from over 800 sell-side analysts. This database contains 20+ years of broker history across more than 59,000 global companies. Content is provided for \"rolling\" fiscal periods. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEstimates.Api;
using FactSet.SDK.FactSetEstimates.Client;
using FactSet.SDK.FactSetEstimates.Model;

namespace Example
{
    public class GetRollingDetailForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEstimates.Client.Configuration();

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

            var apiInstance = new BrokerDetailApi(config);

            var rollingDetailRequest = new RollingDetailRequest(); // RollingDetailRequest | Request object for Estimate Data Items.

            try
            {
                // FactSet estimates detail data for rolling fiscal periods
                DetailResponse result = apiInstance.GetRollingDetailForList(rollingDetailRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BrokerDetailApi.GetRollingDetailForList: " + e.Message );
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
 **rollingDetailRequest** | [**RollingDetailRequest**](RollingDetailRequest.md)| Request object for Estimate Data Items. | 

### Return type
[**DetailResponse**](DetailResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Estimate data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


