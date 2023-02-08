# FactSet.SDK.MarketIntelligence.Api.RetrieveRefreshedReportApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataReportIdGet**](RetrieveRefreshedReportApi.md#getdatareportidget) | **GET** /get-data/{report_id} | Retrieve data for desired report.



<a name="getdatareportidget"></a>
# **GetDataReportIdGet**
> FetchReportPollID GetDataReportIdGet (string reportId)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. If the report has been refreshed within 1 hour, the report data from the most recent refresh will be returned.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.MarketIntelligence.Api;
using FactSet.SDK.MarketIntelligence.Client;
using FactSet.SDK.MarketIntelligence.Model;

namespace Example
{
    public class GetDataReportIdGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.MarketIntelligence.Client.Configuration();

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

            var apiInstance = new RetrieveRefreshedReportApi(config);

            var reportId = "reportId_example";  // string | example: 65ba6dd63fb366464646426d0b

            try
            {
                // Retrieve data for desired report.
                FetchReportPollID result = apiInstance.GetDataReportIdGet(reportId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RetrieveRefreshedReportApi.GetDataReportIdGet: " + e.Message );
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
 **reportId** | **string**| example: 65ba6dd63fb366464646426d0b | 

### Return type
[**FetchReportPollID**](FetchReportPollID.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. If the report requested has been refreshed within an hour, the report data will be returned. If the report has not been refreshed within the last hour, a pollUrl will be returned which can be used to call the refreshed report. |  -  |
| **202** | Your report is being processed. Please Check again after sometime. |  -  |
| **400** | Unknown Error. |  -  |
| **401** | Missing/invalid Credentials or authentication failure |  -  |
| **503** | Unrecognized report_id |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


