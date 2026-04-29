# FactSet.SDK.FactSetFunds.Api.ScoringApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetScoringDetails**](ScoringApi.md#getscoringdetails) | **GET** /scoring | Get Scoring Details for ETFs
[**GetScoringForList**](ScoringApi.md#getscoringforlist) | **POST** /scoring | Get Scoring Details for ETFs



<a name="getscoringdetails"></a>
# **GetScoringDetails**
> ScoringResponse GetScoringDetails (List<string> ids, DateTime? startDate = null, DateTime? endDate = null, Frequency? frequency = null, int? paginationLimit = null, int? paginationOffset = null)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

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
    public class GetScoringDetailsExample
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

            var apiInstance = new ScoringApi(config);

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
            var startDate = DateTime.Parse("2025-01-01");  // DateTime? | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional) 
            var endDate = DateTime.Parse("2025-12-31");  // DateTime? | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional) 
            var frequency = (Frequency) "D";  // Frequency? | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional) 
            var paginationLimit = 20;  // int? | The maximum number of records to return. The default is 20. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | The number of records to skip before the first record to return. The default is 0. (optional)  (default to 0)

            try
            {
                // Get Scoring Details for ETFs
                ScoringResponse result = apiInstance.GetScoringDetails(ids, startDate, endDate, frequency, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScoringApi.GetScoringDetails: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* | 
 **startDate** | **DateTime?**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional] 
 **endDate** | **DateTime?**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional] 
 **frequency** | **Frequency?**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] 
 **paginationLimit** | **int?**| The maximum number of records to return. The default is 20. | [optional] [default to 20]
 **paginationOffset** | **int?**| The number of records to skip before the first record to return. The default is 0. | [optional] [default to 0]

### Return type
[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Scoring response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getscoringforlist"></a>
# **GetScoringForList**
> ScoringResponse GetScoringForList (ScoringRequest scoringRequest)

Get Scoring Details for ETFs

Returns ETF scores, segment averages, analyst recommendations, and grade. * Calculated scores include efficiency, tradability, and fit.  * Segment averages include efficiency, tradability, and fit.   * Analyst pick flags an ETF that provides comprehensive, market like exposure to an area of the market/segment, keeping costs and liquidity in mind.  *  Opportunities list flags an ETF that provides potentially valuable but alternative   exposure to the market/segment, keeping costs and liquidity in mind.  * Grade combines efficiency and tradability scores and assigns a letter grade  This endpoint is available only with Analytics product subscription. If the product is not subscribed, an error will be returned. 

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
    public class GetScoringForListExample
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

            var apiInstance = new ScoringApi(config);

            var scoringRequest = new ScoringRequest(); // ScoringRequest | The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency.

            try
            {
                // Get Scoring Details for ETFs
                ScoringResponse result = apiInstance.GetScoringForList(scoringRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScoringApi.GetScoringForList: " + e.Message );
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
 **scoringRequest** | [**ScoringRequest**](ScoringRequest.md)| The Scoring request body, allowing the user to specify a list of IDs, date ranges and frequency. | 

### Return type
[**ScoringResponse**](ScoringResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Scoring response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested resource was not found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


