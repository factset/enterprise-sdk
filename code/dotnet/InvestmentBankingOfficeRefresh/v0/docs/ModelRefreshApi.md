# FactSet.SDK.InvestmentBankingOfficeRefresh.Api.ModelRefreshApi

All URIs are relative to *https://api.factset.com/office-refresh/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFileById**](ModelRefreshApi.md#getfilebyid) | **GET** /refresh/{id} | Retrieve a calculated file by resource ID.
[**GetStatusById**](ModelRefreshApi.md#getstatusbyid) | **GET** /refresh/{id}/status | Get the status of the refresh job with the given resource ID
[**PostWorkbook**](ModelRefreshApi.md#postworkbook) | **POST** /refresh | Upload a model



<a name="getfilebyid"></a>
# **GetFileById**
> System.IO.Stream GetFileById (Guid id, string outputFileName = null)

Retrieve a calculated file by resource ID.

If the requested job is complete, the calculated file will be returned.

### Example
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
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new ModelRefreshApi(config);

            var id = "id_example";  // Guid | Resource ID
            var outputFileName = "outputFileName_example";  // string | Optional name for returned output file as set in the Content-Disposition response header. (optional) 

            try
            {
                // Retrieve a calculated file by resource ID.
                ModelRefreshApi.GetFileByIdResponseWrapper result = apiInstance.GetFileById(id, outputFileName);

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
                Console.WriteLine("Exception when calling ModelRefreshApi.GetFileById: " + e.Message );
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
 **id** | **Guid**| Resource ID | 
 **outputFileName** | **string**| Optional name for returned output file as set in the Content-Disposition response header. | [optional] 

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
| **200** | Expected response; body will contain calculated file |  -  |
| **202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstatusbyid"></a>
# **GetStatusById**
> JobStatus GetStatusById (Guid id)

Get the status of the refresh job with the given resource ID

Check the status of the given job by ID

### Example
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
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new ModelRefreshApi(config);

            var id = "id_example";  // Guid | Resource ID

            try
            {
                // Get the status of the refresh job with the given resource ID
                JobStatus result = apiInstance.GetStatusById(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ModelRefreshApi.GetStatusById: " + e.Message );
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
 **id** | **Guid**| Resource ID | 

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
| **201** | Created (the calculated workbook is ready to be retrieved) |  * Location - Absolute URL to check status of the request. <br>  |
| **202** | Accepted (resource not ready yet) |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postworkbook"></a>
# **PostWorkbook**
> JobStatus PostWorkbook (System.IO.Stream body, bool? nowHandlingEnabled = null, bool? refreshAutoFilters = null, bool? resizeArrays = null)

Upload a model

Upload a model (e.g., an Excel workbook in Open Office XML format) for FactSet to refresh.

### Example
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
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new ModelRefreshApi(config);

            var body = new System.IO.MemoryStream(System.IO.File.ReadAllBytes("/path/to/file.txt"));  // System.IO.Stream | 
            var nowHandlingEnabled = true;  // bool? | Option to handle =NOW codes. (optional) 
            var refreshAutoFilters = true;  // bool? | Option to refresh codes in autofilters. (optional) 
            var resizeArrays = true;  // bool? | Option to resize arrays (optional) 

            try
            {
                // Upload a model
                JobStatus result = apiInstance.PostWorkbook(body, nowHandlingEnabled, refreshAutoFilters, resizeArrays);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ModelRefreshApi.PostWorkbook: " + e.Message );
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
 **nowHandlingEnabled** | **bool?**| Option to handle &#x3D;NOW codes. | [optional] 
 **refreshAutoFilters** | **bool?**| Option to refresh codes in autofilters. | [optional] 
 **resizeArrays** | **bool?**| Option to resize arrays | [optional] 

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
| **202** | Accepted |  * Location - Absolute URL to check status of the request. <br>  |
| **400** | Bad Request |  -  |
| **429** | Limit Exceeded |  -  |
| **500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


