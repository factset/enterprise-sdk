# FactSet.SDK.DocumentsDistributorDocuments.Api.StreetAccountXMLAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AsynchStreetaccountV1CheckStatusGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1checkstatusget) | **GET** /asynch/streetaccount/v1/check-status | Returns the status and percentDone of the requested jobID
[**AsynchStreetaccountV1GetFilesGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1getfilesget) | **GET** /asynch/streetaccount/v1/get-files | Returns the SA XML files for the specified daterange
[**AsynchStreetaccountV1RequestFilesGet**](StreetAccountXMLAPIApi.md#asynchstreetaccountv1requestfilesget) | **GET** /asynch/streetaccount/v1/request-files | Returns the jobID


<a name="asynchstreetaccountv1checkstatusget"></a>
# **AsynchStreetaccountV1CheckStatusGet**
> List&lt;Checkstatus&gt; AsynchStreetaccountV1CheckStatusGet (string jobID)

Returns the status and percentDone of the requested jobID

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example
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

            try
            {
                // Returns the status and percentDone of the requested jobID
                List<Checkstatus> result = apiInstance.AsynchStreetaccountV1CheckStatusGet(jobID);
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

### Return type
[**List&lt;Checkstatus&gt;**](Checkstatus.md)

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
> List&lt;Getfiles&gt; AsynchStreetaccountV1GetFilesGet (string jobID)

Returns the SA XML files for the specified daterange

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example
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

            try
            {
                // Returns the SA XML files for the specified daterange
                List<Getfiles> result = apiInstance.AsynchStreetaccountV1GetFilesGet(jobID);
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

### Return type
[**List&lt;Getfiles&gt;**](Getfiles.md)

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

Give the startDate and endDate parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format  This API only supports adhoc requests to retrieve historical files and does not support real-time       files and if you interested in require real-time push should consider the other three methods         (pushed via SFTP, to QNT account, or your Azure Storage). Per API request able to query till 2 years of data

### Example
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

