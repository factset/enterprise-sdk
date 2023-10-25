# FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Api.SnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetV1ListFiles**](SnapshotApi.md#getv1listfiles) | **GET** /v1/list-files | Snapshot



<a name="getv1listfiles"></a>
# **GetV1ListFiles**
> InlineResponse200 GetV1ListFiles (int product, DateTime startDate, DateTime endDate, string startTime, string endTime, string access = null)

Snapshot

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Api;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Client;
using FactSet.SDK.ExchangeDataFeedSnapshotAPIEntireExchange.Model;

namespace Example
{
    public class GetV1ListFilesExample
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

            var apiInstance = new SnapshotApi(config);

            var product = 10001;  // int | any product subscribed by client. Minimum value for prod code=9001
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | YYYYMMDD (Choose between 1 and 4 previous trading days)
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date)
            var startTime = "startTime_example";  // string | HHMM (24 hour time EST)
            var endTime = "endTime_example";  // string | HHMM (24 hour time EST)
            var access = "static";  // string | Option to select from static, DL or RT data (optional)  (default to DL)

            try
            {
                // Snapshot
                InlineResponse200 result = apiInstance.GetV1ListFiles(product, startDate, endDate, startTime, endTime, access);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SnapshotApi.GetV1ListFiles: " + e.Message );
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
 **product** | **int**| any product subscribed by client. Minimum value for prod code&#x3D;9001 | 
 **startDate** | **DateTime**| YYYYMMDD (Choose between 1 and 4 previous trading days) | 
 **endDate** | **DateTime**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) | 
 **startTime** | **string**| HHMM (24 hour time EST) | 
 **endTime** | **string**| HHMM (24 hour time EST) | 
 **access** | **string**| Option to select from static, DL or RT data | [optional] [default to DL]

### Return type
[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success  |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


