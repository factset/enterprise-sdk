# FactSet.SDK.FactSetMacroeconomics.Api.AsReportedEconomicsApi

All URIs are relative to *https://api.factset.com/content/economics/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAsReportedEconomics**](AsReportedEconomicsApi.md#getasreportedeconomics) | **GET** /as-reported-economics | Retrieve as-reported economic time series data



<a name="getasreportedeconomics"></a>
# **GetAsReportedEconomics**
> AsReportedEconomicsResponse GetAsReportedEconomics (string seriesId, DateTime? startDate = null, DateTime? endDate = null, string countryCode = null, string frequency = null, int? paginationLimit = null, int? paginationOffset = null)

Retrieve as-reported economic time series data

Returns as-reported economic time series data for a given series ID, with optional frequency conversion and data transformation. Use `/meta/series` to discover available series IDs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMacroeconomics.Api;
using FactSet.SDK.FactSetMacroeconomics.Client;
using FactSet.SDK.FactSetMacroeconomics.Model;

namespace Example
{
    public class GetAsReportedEconomicsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMacroeconomics.Client.Configuration();

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

            var apiInstance = new AsReportedEconomicsApi(config);

            var seriesId = "FRBRIFSPPCD90@US";  // string | The Series ID identifying the economic series to retrieve. Use the `/meta/series` endpoint to get a list of available series IDs. 
            var startDate = DateTime.Parse("Thu Jan 01 00:00:00 UTC 2026");  // DateTime? | Start date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day  (optional) 
            var endDate = DateTime.Parse("Wed Jul 01 00:00:00 UTC 2026");  // DateTime? | End date for the query range.  - **Default:** If both `startDate` and `endDate` are omitted, the API defaults to the most recent available calendar day  (optional) 
            var countryCode = "US";  // string | ISO country code for filtering events by country. Use the `/meta/events?type=countries` endpoint to retrieve available country codes.  (optional) 
            var frequency = "D";  // string | Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When `frequency` is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  (optional) 
            var paginationLimit = 25;  // int? | Maximum number of results to return per page. If not specified, the default page size is applied.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Number of results to skip before returning the first result. Used for pagination in combination with `_paginationLimit`.  (optional)  (default to 0)

            try
            {
                // Retrieve as-reported economic time series data
                AsReportedEconomicsResponse result = apiInstance.GetAsReportedEconomics(seriesId, startDate, endDate, countryCode, frequency, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling AsReportedEconomicsApi.GetAsReportedEconomics: " + e.Message );
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
 **seriesId** | **string**| The Series ID identifying the economic series to retrieve. Use the &#x60;/meta/series&#x60; endpoint to get a list of available series IDs.  | 
 **startDate** | **DateTime?**| Start date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional] 
 **endDate** | **DateTime?**| End date for the query range.  - **Default:** If both &#x60;startDate&#x60; and &#x60;endDate&#x60; are omitted, the API defaults to the most recent available calendar day  | [optional] 
 **countryCode** | **string**| ISO country code for filtering events by country. Use the &#x60;/meta/events?type&#x3D;countries&#x60; endpoint to retrieve available country codes.  | [optional] 
 **frequency** | **string**| Controls the output frequency of the data returned. The supported frequencies are:  - **D**: Daily. - **W**: Weekly. - **M**: Monthly. - **Q**: Quarterly. - **Y**: Yearly.  When &#x60;frequency&#x60; is not specified: If multiple frequencies are available for the seriesId, data is returned at the highest frequency (e.g., monthly over quarterly). If only one frequency is available, data is returned at that frequency.  | [optional] 
 **paginationLimit** | **int?**| Maximum number of results to return per page. If not specified, the default page size is applied.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Number of results to skip before returning the first result. Used for pagination in combination with &#x60;_paginationLimit&#x60;.  | [optional] [default to 0]

### Return type
[**AsReportedEconomicsResponse**](AsReportedEconomicsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully retrieved as-reported economic data. |  -  |
| **400** | Bad Request. The request contains syntax errors or is malformed (e.g., malformed JSON, invalid protocol formatting, illegal characters in query strings). The server cannot parse the request.  |  -  |
| **401** | Unauthenticated - API authentication failed. Ensure you have successfully generated a valid API key, included the API key in your request via Basic Auth, and the API key is valid for your IP range. For help with connectivity issues, please contact FactSet support.  |  -  |
| **403** | Forbidden - You do not have permission to access this endpoint or resource. Your API key or account may not have the required access level. Please reach out to your FactSet Account Team for assistance with authorization.  |  -  |
| **404** | Not Found - The requested endpoint or resource does not exist. Please verify that the endpoint path is correct, all required path parameters are provided, and the resource identifier (if any) is valid.  |  -  |
| **422** | Unprocessable Entity - Your request data was syntactically correct but semantically invalid. This can occur for validation errors such as invalid date format, invalid parameter values, missing required parameters, invalid enum values, or invalid date ranges. Check the required parameters and their value constraints.  |  -  |
| **429** | Too Many Requests - You have exceeded the allowed request rate for this API. Please wait and retry your request after some time.  |  -  |
| **500** | Internal Server Error - An unexpected error occurred on the server. Please try your request again. If the problem persists, contact FactSet support and provide the error ID from the response for investigation.  |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


