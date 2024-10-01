# FactSet.SDK.InvestmentBankingOfficeRefresh.Api.RefreshOperationsApi

All URIs are relative to *https://api.factset.com/office-refresh/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFileById**](RefreshOperationsApi.md#getfilebyid) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**GetStatusById**](RefreshOperationsApi.md#getstatusbyid) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**PostWorkbook**](RefreshOperationsApi.md#postworkbook) | **POST** /refresh/calculate | Refresh a spreadsheet file



<a name="getfilebyid"></a>
# **GetFileById**
> System.IO.Stream GetFileById (Guid id, bool? deleteFile = null)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Api;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Client;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Model;

namespace Example
{
    public class GetFileByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentBankingOfficeRefresh.Client.Configuration();

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

            var apiInstance = new RefreshOperationsApi(config);

            var id = "id_example";  // Guid | Unique identifier for the job (resource ID returned from FactSet).
            var deleteFile = true;  // bool? | Delete the file from FactSet servers after completing the request. (optional)  (default to true)

            try
            {
                // Retrieve a calculated file by resource ID.
                RefreshOperationsApi.GetFileByIdResponseWrapper result = apiInstance.GetFileById(id, deleteFile);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RefreshOperationsApi.GetFileById: " + e.Message );
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
 **id** | **Guid**| Unique identifier for the job (resource ID returned from FactSet). | 
 **deleteFile** | **bool?**| Delete the file from FactSet servers after completing the request. | [optional] [default to true]

### Return type
**System.IO.Stream**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; body will contain calculated file |  * Content-Disposition - Standard HTTP header. Content is expected to be displayed as an attachment. <br>  * Content-Type - Standard HTTP header. The file format type. <br>  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Failed to refresh file |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstatusbyid"></a>
# **GetStatusById**
> JobStatus GetStatusById (Guid id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by the resource ID

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Api;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Client;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Model;

namespace Example
{
    public class GetStatusByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentBankingOfficeRefresh.Client.Configuration();

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

            var apiInstance = new RefreshOperationsApi(config);

            var id = "id_example";  // Guid | Unique identifier for the job (resource ID returned from FactSet).

            try
            {
                // Get the status of the refresh job with the given resource ID
                JobStatus result = apiInstance.GetStatusById(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RefreshOperationsApi.GetStatusById: " + e.Message );
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
 **id** | **Guid**| Unique identifier for the job (resource ID returned from FactSet). | 

### Return type
[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Relative URL to check status of the request. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Relative URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **422** | Failed to refresh file |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postworkbook"></a>
# **PostWorkbook**
> JobStatus PostWorkbook (System.IO.Stream body, bool? nowHandlingEnabled = null, bool? refreshAutoFilters = null, bool? resizeArrays = null)

Refresh a spreadsheet file

Start refreshing a spreadsheet file (in the Open Office XML format).

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Api;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Client;
using FactSet.SDK.InvestmentBankingOfficeRefresh.Model;

namespace Example
{
    public class PostWorkbookExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentBankingOfficeRefresh.Client.Configuration();

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

            var apiInstance = new RefreshOperationsApi(config);

            var body = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | 
            var nowHandlingEnabled = true;  // bool? | Return \\#VALUE for =FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. (optional) 
            var refreshAutoFilters = true;  // bool? | Option to refresh =FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional) 
            var resizeArrays = true;  // bool? | Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds (optional) 

            try
            {
                // Refresh a spreadsheet file
                JobStatus result = apiInstance.PostWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RefreshOperationsApi.PostWorkbook: " + e.Message );
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
 **body** | **System.IO.Stream****System.IO.Stream**|  | 
 **nowHandlingEnabled** | **bool?**| Return \\#VALUE for &#x3D;FDS codes dependent on NOW(). Default is true. For more information on volatile code handling, see Online Assistant https://my.apps.factset.com/oa/pages/16118. | [optional] 
 **refreshAutoFilters** | **bool?**| Option to refresh &#x3D;FDS codes within autofilters.  Codes that are filtered out will not be refreshed, unless this option is set to true.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional] 
 **resizeArrays** | **bool?**| Option to allow automatic array-resizing, which allows you to return a time series of data without manually setting an array.  Default is true.  For more information, see Online Assistant https://my.apps.factset.com/oa/pages/21084#fds | [optional] 

### Return type
[**JobStatus**](JobStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/vnd.openxmlformats-officedocument.spreadsheetml.sheet
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location - Relative URL to check status of the request. <br>  * X-Concurrent-Limit -  <br>  * X-Concurrent-Limit-Remaining -  <br>  * X-Weekly-Limit -  <br>  * X-Weekly-Limit-Remaining -  <br>  |
| **400** | Bad Request |  -  |
| **403** | Forbidden. The user&#39;s subscription is missing required CACCESS. |  -  |
| **413** | File Too Large.  Currently only accepting files up to 50MB. |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


