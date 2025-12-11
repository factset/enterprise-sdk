# FactSet.SDK.FactSetGlobalPrices.Api.CorporateActionsForCalendarApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCorporateActions**](CorporateActionsForCalendarApi.md#getcorporateactions) | **GET** /factset-global-prices/v1/calendar/corporate-actions | Retrieve Event Calendar information for Corporate Actions
[**GetDividends**](CorporateActionsForCalendarApi.md#getdividends) | **GET** /factset-global-prices/v1/calendar/dividends | Retrieve Dividend information
[**GetEventCount**](CorporateActionsForCalendarApi.md#geteventcount) | **GET** /factset-global-prices/v1/calendar/event-count | Retrieve daily event count for a given date range
[**GetExchanges**](CorporateActionsForCalendarApi.md#getexchanges) | **GET** /factset-global-prices/v1/calendar/meta/exchanges | Returns a list of exchanges for which event/action data is available.
[**GetRightsIssues**](CorporateActionsForCalendarApi.md#getrightsissues) | **GET** /factset-global-prices/v1/calendar/rights-issues | Retrieve Rights Issue information
[**GetSpinOffs**](CorporateActionsForCalendarApi.md#getspinoffs) | **GET** /factset-global-prices/v1/calendar/spin-offs | Retrieve Spin Off information
[**GetSplits**](CorporateActionsForCalendarApi.md#getsplits) | **GET** /factset-global-prices/v1/calendar/splits | Retrieve Split information
[**GetStockDistributions**](CorporateActionsForCalendarApi.md#getstockdistributions) | **GET** /factset-global-prices/v1/calendar/stock-distributions | Retrieve Stock Distribution information



<a name="getcorporateactions"></a>
# **GetCorporateActions**
> CorporateActionsResponseCalendar GetCorporateActions (List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> eventCategories = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Event Calendar information for Corporate Actions

Gives an overview of all available Corporate Actions over a specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetCorporateActionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var eventCategories = new List<string>(); // List<string> | Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `eventDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Event Calendar information for Corporate Actions
                CorporateActionsResponseCalendar result = apiInstance.GetCorporateActions(ids, startDate, endDate, eventCategories, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetCorporateActions: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **eventCategories** | [**List&lt;string&gt;**](string.md)| Select one or more Event Categories from the dropdown:   - **CASH_DIVS:** Includes Dividends(DVC), Dividend with DRP Option(DVCD), Dividend Reinvestment(DRP)   - **STOCK_DIST:** Includes Stock Dividend(DVS), Stock Dividend - Special(DVSS), Bonus(BNS), Bonus - Special(BNSS)   - **SPINOFFS:** Includes Spin Off(SPO)   - **RIGHTS:** Includes Rights Issue(DSR)   - **SPLITS:** Includes Forward Split(FSP), Reverse Split(RSP), Split(SPL), Exchange Of Securities(EXOS)  If omitted, the data is returned for all the available eventCategories.  | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**CorporateActionsResponseCalendar**](CorporateActionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Corporate Actions data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdividends"></a>
# **GetDividends**
> DividendsResponse GetDividends (List<string> eventIds = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Dividend information

Retrieves detailed dividend information including amounts, relevant dates, and other specifics for Dividends, Dividends with DRP Option, and Dividend Reinvestment events within the specified date range.   To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetDividendsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var eventIds = new List<string>(); // List<string> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional) 
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `effectiveDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Dividend information
                DividendsResponse result = apiInstance.GetDividends(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetDividends: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**DividendsResponse**](DividendsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Dividend data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="geteventcount"></a>
# **GetEventCount**
> EventCountResponse GetEventCount (List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null)

Retrieve daily event count for a given date range

Returns the overall count of various events for each day within the specified date range. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetEventCountExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `eventDate`. (optional) 

            try
            {
                // Retrieve daily event count for a given date range
                EventCountResponse result = apiInstance.GetEventCount(ids, startDate, endDate, exchanges, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetEventCount: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;eventDate&#x60;. | [optional] 

### Return type
[**EventCountResponse**](EventCountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Event Count data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getexchanges"></a>
# **GetExchanges**
> ExchangesResponse GetExchanges ()

Returns a list of exchanges for which event/action data is available.

Returns a list of available values for the exchanges parameter. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetExchangesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);


            try
            {
                // Returns a list of exchanges for which event/action data is available.
                ExchangesResponse result = apiInstance.GetExchanges();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetExchanges: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Exchange details |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrightsissues"></a>
# **GetRightsIssues**
> RightsIssuesResponse GetRightsIssues (List<string> eventIds = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Rights Issue information

Retrieves the prices, relevant dates, and other specifics over a specified date range for Rights Issue events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetRightsIssuesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var eventIds = new List<string>(); // List<string> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional) 
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `effectiveDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Rights Issue information
                RightsIssuesResponse result = apiInstance.GetRightsIssues(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetRightsIssues: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**RightsIssuesResponse**](RightsIssuesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Rights Issue data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getspinoffs"></a>
# **GetSpinOffs**
> SpinOffsResponse GetSpinOffs (List<string> eventIds = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Spin Off information

Retrieves the price adjustment factors, dates, and other specifics over a specified date range for Spin Off events.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetSpinOffsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var eventIds = new List<string>(); // List<string> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional) 
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `effectiveDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Spin Off information
                SpinOffsResponse result = apiInstance.GetSpinOffs(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetSpinOffs: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**SpinOffsResponse**](SpinOffsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Spin Off data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsplits"></a>
# **GetSplits**
> SplitsResponseCalendar GetSplits (List<string> eventIds = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Split information

Retrieves the split factors, dates, and other specifics over a specified date range for Forward Split,  Reverse Split, Split and Exchange of Securities event types.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetSplitsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var eventIds = new List<string>(); // List<string> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional) 
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `effectiveDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Split information
                SplitsResponseCalendar result = apiInstance.GetSplits(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetSplits: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**SplitsResponseCalendar**](SplitsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Split data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstockdistributions"></a>
# **GetStockDistributions**
> StockDistributionsResponseCalendar GetStockDistributions (List<string> eventIds = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, List<string> exchanges = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve Stock Distribution information

Retrieves detailed stock distribution information including price adjustment factors, relevant dates, and other  specifics for Stock Dividends, Stock Dividends(Special), Bonus Issues, and Bonus Issues(Special) events within  the specified date range.  To retrieve details of a given event for a company on a specific exchange, please pass both the eventId and the company identifier.  Note that passing eventId or (`eventId` + `ids`) will cause the end point to ignore the other parameters.  Passing values for any other combination of the parameters (`ids`, `startDate`, `endDate` and `exchanges`) will lead to an AND operation for all the parameters passed. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetGlobalPrices.Api;
using FactSet.SDK.FactSetGlobalPrices.Client;
using FactSet.SDK.FactSetGlobalPrices.Model;

namespace Example
{
    public class GetStockDistributionsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetGlobalPrices.Client.Configuration();

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

            var apiInstance = new CorporateActionsForCalendarApi(config);

            var eventIds = new List<string>(); // List<string> | FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. (optional) 
            var ids = new List<string>(); // List<string> | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. (optional) 
            var startDate = DateTime.Parse("Mon Dec 31 00:00:00 UTC 2018");  // DateTime? | The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. (optional) 
            var endDate = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. (optional) 
            var exchanges = new List<string>(); // List<string> | One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See `/meta/exchanges` for available values. (optional) 
            var sort = new List<string>(); // List<string> | Sorts the field in ascending or descending order of `effectiveDate`. (optional) 
            var paginationLimit = 50;  // int? | Specifies the number of results to return per page. The maximum limit is 500. (optional)  (default to 50)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                // Retrieve Stock Distribution information
                StockDistributionsResponseCalendar result = apiInstance.GetStockDistributions(eventIds, ids, startDate, endDate, exchanges, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CorporateActionsForCalendarApi.GetStockDistributions: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| FactSet Event Identifier - a unique identifier for an event across multiple exchanges. If provided, the API will return data for the specified event. | [optional] 
 **ids** | [**List&lt;string&gt;**](string.md)| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent IDs. If not specified, the data related to all the IDs is returned. | [optional] 
 **startDate** | **DateTime?**| The start date requested for a given date range in **YYYY-MM-DD** format. If both start and end dates are omitted, the API will return data for the current week starting from Monday. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in **YYYY-MM-DD** format. The max date range is 1 year for up to 100 identifiers. If IDs are more than 100 or omitted, the max range is restricted to 90 days. | [optional] 
 **exchanges** | [**List&lt;string&gt;**](string.md)| One or more exchange codes for which data is to be requested. When omitted, the data from all the supported exchanges is returned. See &#x60;/meta/exchanges&#x60; for available values. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Sorts the field in ascending or descending order of &#x60;effectiveDate&#x60;. | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. The maximum limit is 500. | [optional] [default to 50]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**StockDistributionsResponseCalendar**](StockDistributionsResponseCalendar.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Stock Distribution data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


