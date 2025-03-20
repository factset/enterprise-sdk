# FactSet.SDK.DocumentsDistributorDocuments.Api.NewsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AsynchNewsV1CheckStatusGet**](NewsAPIApi.md#asynchnewsv1checkstatusget) | **GET** /asynch/news/v1/check-status | Returns the status and percentDone of the requested jobID and source
[**AsynchNewsV1GetFilesGet**](NewsAPIApi.md#asynchnewsv1getfilesget) | **GET** /asynch/news/v1/get-files | Returns the news filings for the specified daterange and source
[**AsynchNewsV1RequestFilesGet**](NewsAPIApi.md#asynchnewsv1requestfilesget) | **GET** /asynch/news/v1/request-files | Returns the jobID



<a name="asynchnewsv1checkstatusget"></a>
# **AsynchNewsV1CheckStatusGet**
> NewscheckstatusResponse AsynchNewsV1CheckStatusGet (string jobID, string source, int? paginationLimit = null, int? paginationOffset = null)

Returns the status and percentDone of the requested jobID and source

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.DocumentsDistributorDocuments.Api;
using FactSet.SDK.DocumentsDistributorDocuments.Client;
using FactSet.SDK.DocumentsDistributorDocuments.Model;

namespace Example
{
    public class AsynchNewsV1CheckStatusGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.DocumentsDistributorDocuments.Client.Configuration();

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

            var apiInstance = new NewsAPIApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to know the status and percentDone
            var source = "hkex";  // string | This parameter filters the results based on the source of the filings document
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the status and percentDone of the requested jobID and source
                NewscheckstatusResponse result = apiInstance.AsynchNewsV1CheckStatusGet(jobID, source, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsAPIApi.AsynchNewsV1CheckStatusGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings document | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type
[**NewscheckstatusResponse**](NewscheckstatusResponse.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="asynchnewsv1getfilesget"></a>
# **AsynchNewsV1GetFilesGet**
> NewsgetfilesResponse AsynchNewsV1GetFilesGet (string jobID, string source, int? paginationLimit = null, int? paginationOffset = null)

Returns the news filings for the specified daterange and source

Need to plug-in the source and jobID got from /request-files into /get-files endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.DocumentsDistributorDocuments.Api;
using FactSet.SDK.DocumentsDistributorDocuments.Client;
using FactSet.SDK.DocumentsDistributorDocuments.Model;

namespace Example
{
    public class AsynchNewsV1GetFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.DocumentsDistributorDocuments.Client.Configuration();

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

            var apiInstance = new NewsAPIApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to collect the results of the query
            var source = "hkex";  // string | This parameter filters the results based on the source of the filings document
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the news filings for the specified daterange and source
                NewsgetfilesResponse result = apiInstance.AsynchNewsV1GetFilesGet(jobID, source, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsAPIApi.AsynchNewsV1GetFilesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings document | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result | [optional] 
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional] 

### Return type
[**NewsgetfilesResponse**](NewsgetfilesResponse.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="asynchnewsv1requestfilesget"></a>
# **AsynchNewsV1RequestFilesGet**
> NewsrequestfilesResponse AsynchNewsV1RequestFilesGet (DateTime startDate, DateTime endDate, string source)

Returns the jobID

Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format.  This API only supports adhoc requests to retrieve historical files. <p>MT Newswire has two different products that enables 1 year of rolling history and 5 years of rolling history.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.DocumentsDistributorDocuments.Api;
using FactSet.SDK.DocumentsDistributorDocuments.Client;
using FactSet.SDK.DocumentsDistributorDocuments.Model;

namespace Example
{
    public class AsynchNewsV1RequestFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.DocumentsDistributorDocuments.Client.Configuration();

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

            var apiInstance = new NewsAPIApi(config);

            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
            var source = "hkex";  // string | This parameter filters the results based on the document source.

            try
            {
                // Returns the jobID
                NewsrequestfilesResponse result = apiInstance.AsynchNewsV1RequestFilesGet(startDate, endDate, source);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NewsAPIApi.AsynchNewsV1RequestFilesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the document source. | 

### Return type
[**NewsrequestfilesResponse**](NewsrequestfilesResponse.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


