# FactSet.SDK.StreetAccountNews.Api.StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StreetaccountHistoricalCheckStatusGet**](StreetAccountHistoricalStoriesApi.md#streetaccounthistoricalcheckstatusget) | **GET** /streetaccount/historical/check-status | Returns the status and percentage of completion for the requested jobID
[**StreetaccountHistoricalGetFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccounthistoricalgetfilesget) | **GET** /streetaccount/historical/get-files | Returns the StreetAccount XML files for the specified date range
[**StreetaccountHistoricalRequestFilesGet**](StreetAccountHistoricalStoriesApi.md#streetaccounthistoricalrequestfilesget) | **GET** /streetaccount/historical/request-files | Returns the jobID



<a name="streetaccounthistoricalcheckstatusget"></a>
# **StreetaccountHistoricalCheckStatusGet**
> CheckstatusResponse StreetaccountHistoricalCheckStatusGet (string jobID, int? paginationLimit = null, int? paginationOffset = null)

Returns the status and percentage of completion for the requested jobID

Need to plug-in the jobID from /request-files into /check-status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class StreetaccountHistoricalCheckStatusGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var apiInstance = new StreetAccountHistoricalStoriesApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to know the status and percentDone
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the status and percentage of completion for the requested jobID
                CheckstatusResponse result = apiInstance.StreetaccountHistoricalCheckStatusGet(jobID, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountHistoricalStoriesApi.StreetaccountHistoricalCheckStatusGet: " + e.Message );
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
 **jobID** | **string**| jobID returned by the request-files endpoint to know the status and percentDone | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type
[**CheckstatusResponse**](CheckstatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request |  -  |
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="streetaccounthistoricalgetfilesget"></a>
# **StreetaccountHistoricalGetFilesGet**
> GetfilesResponse StreetaccountHistoricalGetFilesGet (string jobID, int? paginationLimit = null, int? paginationOffset = null)

Returns the StreetAccount XML files for the specified date range

Need to plug-in the jobID from /check-status into /get-files endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class StreetaccountHistoricalGetFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var apiInstance = new StreetAccountHistoricalStoriesApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to collect the results of the query
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the StreetAccount XML files for the specified date range
                GetfilesResponse result = apiInstance.StreetaccountHistoricalGetFilesGet(jobID, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountHistoricalStoriesApi.StreetaccountHistoricalGetFilesGet: " + e.Message );
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
 **jobID** | **string**| jobID returned by the request-files endpoint to collect the results of the query | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type
[**GetfilesResponse**](GetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad request |  -  |
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="streetaccounthistoricalrequestfilesget"></a>
# **StreetaccountHistoricalRequestFilesGet**
> RequestfilesResponse StreetaccountHistoricalRequestFilesGet (DateTime startDate, DateTime endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format. This API only supports adhoc requests to retrieve historical files and does not support real-time files and if you interested in require real-time push should consider the other three methods (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class StreetaccountHistoricalRequestFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var apiInstance = new StreetAccountHistoricalStoriesApi(config);

            var startDate = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
            var endDate = DateTime.Parse("2013-10-20T19:20:30+01:00");  // DateTime | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format

            try
            {
                // Returns the jobID
                RequestfilesResponse result = apiInstance.StreetaccountHistoricalRequestFilesGet(startDate, endDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountHistoricalStoriesApi.StreetaccountHistoricalRequestFilesGet: " + e.Message );
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
 **startDate** | **DateTime**| Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format | 
 **endDate** | **DateTime**| The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format | 

### Return type
[**RequestfilesResponse**](RequestfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | success |  -  |
| **400** | Bad request |  -  |
| **401** | Bad request |  -  |
| **403** | Bad request |  -  |
| **500** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


