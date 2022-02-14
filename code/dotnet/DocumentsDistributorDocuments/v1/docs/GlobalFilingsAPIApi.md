# FactSet.SDK.DocumentsDistributorDocuments.Api.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GlobalFilingsV1FormTypesGet**](GlobalFilingsAPIApi.md#globalfilingsv1formtypesget) | **GET** /global-filings/v1/form-types | Retrieve form types for each available Filings Source
[**GlobalFilingsV1ListFilesGet**](GlobalFilingsAPIApi.md#globalfilingsv1listfilesget) | **GET** /global-filings/v1/list-files | Retrieve filings and metadata within FactSet coverage


<a name="globalfilingsv1formtypesget"></a>
# **GlobalFilingsV1FormTypesGet**
> Response GlobalFilingsV1FormTypesGet (string source)

Retrieve form types for each available Filings Source

Gets all available form types for the filings sources. Source parameter can be used to filter the results.

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
    public class GlobalFilingsV1FormTypesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new GlobalFilingsAPIApi(config);
            var source = source_example;  // string | This parameter filters the results based on the source of the filings document.

            try
            {
                // Retrieve form types for each available Filings Source
                Response result = apiInstance.GlobalFilingsV1FormTypesGet(source);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GlobalFilingsAPIApi.GlobalFilingsV1FormTypesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings document. | 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Form Types data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="globalfilingsv1listfilesget"></a>
# **GlobalFilingsV1ListFilesGet**
> Response GlobalFilingsV1ListFilesGet (string source, int paginationLimit, int paginationOffset, string sort = null, string startDate = null, string endDate = null, string ids = null, string formType = null)

Retrieve filings and metadata within FactSet coverage

Gets the latest 25 filings files. Parameters can be used to filter and narrow down the results

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
    public class GlobalFilingsV1ListFilesGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

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

            var apiInstance = new GlobalFilingsAPIApi(config);
            var source = source_example;  // string | This parameter filters the results based on the source of the filings documents.
            var paginationLimit = 56;  // int | Specifies the maximum number of results to return per result (max. 25)
            var paginationOffset = 56;  // int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results
            var sort = sort_example;  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional)  (default to -startDate)
            var startDate = 2020-07-01;  // string | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format (optional) 
            var endDate = 2020-12-01;  // string | The latest date the API should fetch for. Dates can be YYYY-MM-DD format (optional) 
            var ids = AAPL;  // string | This parameter filters the results based on ticker ID. (optional) 
            var formType = 10-Q;  // string | This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. (optional) 

            try
            {
                // Retrieve filings and metadata within FactSet coverage
                Response result = apiInstance.GlobalFilingsV1ListFilesGet(source, paginationLimit, paginationOffset, sort, startDate, endDate, ids, formType);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling GlobalFilingsAPIApi.GlobalFilingsV1ListFilesGet: " + e.Message );
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
 **source** | **string**| This parameter filters the results based on the source of the filings documents. | 
 **paginationLimit** | **int**| Specifies the maximum number of results to return per result (max. 25) | 
 **paginationOffset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | 
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] [default to -startDate]
 **startDate** | **string**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **endDate** | **string**| The latest date the API should fetch for. Dates can be YYYY-MM-DD format | [optional] 
 **ids** | **string**| This parameter filters the results based on ticker ID. | [optional] 
 **formType** | **string**| This parameter filters the results based on filings formType. Use the form-types endpoint to view the formTypes available by filings source. | [optional] 

### Return type

[**Response**](Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Global Filings data items |  -  |
| **400** | Bad request- invalid or missing parameter |  -  |
| **401** | Authentication Failed |  -  |
| **403** | Entitlements Not Found |  -  |
| **500** | Internal Service Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

