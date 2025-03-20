# FactSet.SDK.DocumentsDistributorDocuments.Api.StreetAccountXMLAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AsynchStreetaccountV1CheckStatusGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1checkstatusget) | **GET** /asynch/streetaccount/v1/check-status | Returns the status and percentDone of the requested jobID
[**AsynchStreetaccountV1GetFilesGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1getfilesget) | **GET** /asynch/streetaccount/v1/get-files | Returns the SA XML files for the specified daterange
[**AsynchStreetaccountV1RequestFilesGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1requestfilesget) | **GET** /asynch/streetaccount/v1/request-files | Returns the jobID



<a name="asynchstreetaccountv1checkstatusget"></a>
# **AsynchStreetaccountV1CheckStatusGet**
> CheckstatusResponse AsynchStreetaccountV1CheckStatusGet (string jobID, int? paginationLimit = null, int? paginationOffset = null)

Returns the status and percentDone of the requested jobID

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
    public class AsynchStreetaccountV1CheckStatusGetExample
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

            var apiInstance = new StreetAccountXMLAPIApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to know the status and percentDone
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the status and percentDone of the requested jobID
                CheckstatusResponse result = apiInstance.AsynchStreetaccountV1CheckStatusGet(jobID, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountXMLAPIApi.AsynchStreetaccountV1CheckStatusGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="asynchstreetaccountv1getfilesget"></a>
# **AsynchStreetaccountV1GetFilesGet**
> GetfilesResponse AsynchStreetaccountV1GetFilesGet (string jobID, int? paginationLimit = null, int? paginationOffset = null)

Returns the SA XML files for the specified daterange

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
    public class AsynchStreetaccountV1GetFilesGetExample
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

            var apiInstance = new StreetAccountXMLAPIApi(config);

            var jobID = "jobID_example";  // string | jobID returned by the request-files endpoint to collect the results of the query
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return per result (optional) 
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional) 

            try
            {
                // Returns the SA XML files for the specified daterange
                GetfilesResponse result = apiInstance.AsynchStreetaccountV1GetFilesGet(jobID, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountXMLAPIApi.AsynchStreetaccountV1GetFilesGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="asynchstreetaccountv1requestfilesget"></a>
# **AsynchStreetaccountV1RequestFilesGet**
> RequestfilesResponse AsynchStreetaccountV1RequestFilesGet (DateTime startDate, DateTime endDate)

Returns the jobID

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format.  This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

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
    public class AsynchStreetaccountV1RequestFilesGetExample
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

            var apiInstance = new StreetAccountXMLAPIApi(config);

            var startDate = DateTime.Parse("2013-10-20");  // DateTime | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format

            try
            {
                // Returns the jobID
                RequestfilesResponse result = apiInstance.AsynchStreetaccountV1RequestFilesGet(startDate, endDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling StreetAccountXMLAPIApi.AsynchStreetaccountV1RequestFilesGet: " + e.Message );
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


