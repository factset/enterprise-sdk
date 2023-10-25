# FactSet.SDK.DocumentsDistributorDocuments.Api.GlobalFilingsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GlobalFilingsV1ListFilesGet**](GlobalFilingsAPIApi.md#globalfilingsv1listfilesget) | **GET** /global-filings/v1/list-files | Retrieve filings within FactSet coverage



<a name="globalfilingsv1listfilesget"></a>
# **GlobalFilingsV1ListFilesGet**
> List&lt;FilingsFiles&gt; GlobalFilingsV1ListFilesGet (string dataset, DateTime startDate, DateTime endDate)

Retrieve filings within FactSet coverage

Parameters can be used to get the filings

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

            var apiInstance = new GlobalFilingsAPIApi(config);

            var dataset = "edgar";  // string | This parameter filters the results based on the dataset of the filings documents.
            var startDate = DateTime.Parse("2013-10-20");  // DateTime | The earliest date the API should fetch for. Dates can be YYYY-MM-DD format
            var endDate = DateTime.Parse("2013-10-20");  // DateTime | The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format

            try
            {
                // Retrieve filings within FactSet coverage
                List<FilingsFiles> result = apiInstance.GlobalFilingsV1ListFilesGet(dataset, startDate, endDate);
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
 **dataset** | **string**| This parameter filters the results based on the dataset of the filings documents. | 
 **startDate** | **DateTime**| The earliest date the API should fetch for. Dates can be YYYY-MM-DD format | 
 **endDate** | **DateTime**| The date after upto eight days of the earliest date given the API should fetch for. Dates can be YYYY-MM-DD format | 

### Return type
[**List&lt;FilingsFiles&gt;**](FilingsFiles.md)

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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


