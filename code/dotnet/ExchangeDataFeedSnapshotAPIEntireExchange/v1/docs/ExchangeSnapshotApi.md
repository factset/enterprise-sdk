# FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Api.ExchangeSnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetListFiles**](ExchangeSnapshotApi.md#getlistfiles) | **GET** /list-files | List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range



<a name="getlistfiles"></a>
# **GetListFiles**
> EntireExchangeSnapshotResponse GetListFiles (int product, DateTime startDate, DateTime endDate, string startTime, string endTime, string access = null)

List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Api;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Client;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Model;

namespace Example
{
    public class GetListFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Client.Configuration();

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

            var apiInstance = new ExchangeSnapshotApi(config);

            var product = 10001;  // int | any product subscribed by client
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts `start_date` (snake_case), which is deprecated and exists for backward compatibility.
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts `end_date` (snake_case), which is deprecated and exists for backward compatibility.
            var startTime = "startTime_example";  // string | HHMM (24 hour time EST). Also accepts `start_time` (snake_case), which is deprecated and exists for backward compatibility.
            var endTime = "endTime_example";  // string | HHMM (24 hour time EST). Also accepts `end_time` (snake_case), which is deprecated and exists for backward compatibility.
            var access = "static";  // string | Option to select from static, DL or RT data (optional)  (default to DL)

            try
            {
                // List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range
                EntireExchangeSnapshotResponse result = apiInstance.GetListFiles(product, startDate, endDate, startTime, endTime, access);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExchangeSnapshotApi.GetListFiles: " + e.Message );
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
 **product** | **int**| any product subscribed by client | 
 **startDate** | **DateTime**| YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **endDate** | **DateTime**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **startTime** | **string**| HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **endTime** | **string**| HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. | 
 **access** | **string**| Option to select from static, DL or RT data | [optional] [default to DL]

### Return type
[**EntireExchangeSnapshotResponse**](EntireExchangeSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success  |  -  |
| **400** | Bad Request |  -  |
| **401** | Authentication Failed |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **408** | Request Timeout |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


