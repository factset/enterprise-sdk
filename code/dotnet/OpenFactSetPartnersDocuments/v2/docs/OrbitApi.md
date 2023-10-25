# FactSet.SDK.OpenFactSetPartnersDocuments.Api.OrbitApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetChineseTranscriptsDaily**](OrbitApi.md#getchinesetranscriptsdaily) | **GET** /orbit/transcripts/daily | Returns the daily files from Open:FactSet Partner - Orbit.
[**GetChineseTranscriptsHistory**](OrbitApi.md#getchinesetranscriptshistory) | **GET** /orbit/transcripts/history | Returns the history files from Open:FactSet Partner - Orbit



<a name="getchinesetranscriptsdaily"></a>
# **GetChineseTranscriptsDaily**
> OrbitResponse GetChineseTranscriptsDaily (string sort = null, int? paginationLimit = null, int? paginationOffset = null, DateTime? startDate = null, DateTime? endDate = null, string stockCode = null, string fileName = null, string title = null)

Returns the daily files from Open:FactSet Partner - Orbit.

Returns the daily files from Open:FactSet Partner - Orbit.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetChineseTranscriptsDailyExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

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

            var apiInstance = new OrbitApi(config);

            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var startDate = DateTime.Parse("2021-09-01");  // DateTime? | The earliest date of the Orbit file the API should fetching for based on fileTimestamp. (optional) 
            var endDate = DateTime.Parse("2021-10-08");  // DateTime? | The latest date of the Orbit file the API should fetching for based on fileTimestamp. (optional) 
            var stockCode = "601236";  // string | The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  (optional) 
            var fileName = "fileName_example";  // string | This parameter is used to filters the results based on file name. (optional) 
            var title = "投资者关系活动记录表2022-001";  // string | This parameter is used to filter the results based on the headline of the transcript. (optional) 

            try
            {
                // Returns the daily files from Open:FactSet Partner - Orbit.
                OrbitResponse result = apiInstance.GetChineseTranscriptsDaily(sort, paginationLimit, paginationOffset, startDate, endDate, stockCode, fileName, title);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OrbitApi.GetChineseTranscriptsDaily: " + e.Message );
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
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate]
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **startDate** | **DateTime?**| The earliest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional] 
 **endDate** | **DateTime?**| The latest date of the Orbit file the API should fetching for based on fileTimestamp. | [optional] 
 **stockCode** | **string**| The company/ticker which is associated with the transcript. Please submit a question via Issue Tracker under the Open:FactSet - Partner Communication to get the required list of tickers.  | [optional] 
 **fileName** | **string**| This parameter is used to filters the results based on file name. | [optional] 
 **title** | **string**| This parameter is used to filter the results based on the headline of the transcript. | [optional] 

### Return type
[**OrbitResponse**](OrbitResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Orbit data. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getchinesetranscriptshistory"></a>
# **GetChineseTranscriptsHistory**
> OrbithistoryResponse GetChineseTranscriptsHistory (int? paginationLimit = null, int? paginationOffset = null, string fileName = null)

Returns the history files from Open:FactSet Partner - Orbit

Returns the historical files from February 28th, 2005 to current date. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetChineseTranscriptsHistoryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

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

            var apiInstance = new OrbitApi(config);

            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var fileName = "fileName_example";  // string | This parameter is used to filters the results based on file name. (optional) 

            try
            {
                // Returns the history files from Open:FactSet Partner - Orbit
                OrbithistoryResponse result = apiInstance.GetChineseTranscriptsHistory(paginationLimit, paginationOffset, fileName);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OrbitApi.GetChineseTranscriptsHistory: " + e.Message );
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
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **fileName** | **string**| This parameter is used to filters the results based on file name. | [optional] 

### Return type
[**OrbithistoryResponse**](OrbithistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Orbit data. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


