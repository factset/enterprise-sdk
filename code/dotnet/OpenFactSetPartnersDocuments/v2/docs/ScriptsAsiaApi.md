# FactSet.SDK.OpenFactSetPartnersDocuments.Api.ScriptsAsiaApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetScriptsAsiaFiles**](ScriptsAsiaApi.md#getscriptsasiafiles) | **GET** /scripts-asia/transcripts | Returns the daily files from Open:FactSet Partner - Scripts Asia.



<a name="getscriptsasiafiles"></a>
# **GetScriptsAsiaFiles**
> ScriptsAsiaResponse GetScriptsAsiaFiles (string sort = null, int? paginationLimit = null, int? paginationOffset = null, string trackingId = null, string saId = null, DateTime? startDate = null, DateTime? endDate = null, string companyName = null, string eventType = null, string languageType = null, string fileName = null, string type = null)

Returns the daily files from Open:FactSet Partner - Scripts Asia.

Returns XML files and relevant metadata provided by Open: FactSet Partner – Scripts Asia. - type=delta returns the files from March 1st 2023 to current date. - type=full will returns the files from start of date until Feb 28th 2023.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetScriptsAsiaFilesExample
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

            var apiInstance = new ScriptsAsiaApi(config);

            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var trackingId = "431eb8d0-cc45-11ed-8609-0f67251fe7a4";  // string | Unique Scripts Asia identifier assigned to an event.  (optional) 
            var saId = "SA002220_2023Mar27_a_02";  // string | This parameter filters the results based on saId of the Transcript.  (optional) 
            var startDate = DateTime.Parse("2023-03-20");  // DateTime? | The earliest date of the Scripts Asia file the API should return based on date.  (optional) 
            var endDate = DateTime.Parse("2023-03-28");  // DateTime? | The latest date of the Scripts Asia file the API should return based on date.           (optional) 
            var companyName = "Beijing Shunxin Agriculture Co Ltd";  // string | This parameter filters the results based on Company Name of the Transcript.  (optional) 
            var eventType = "01";  // string | This parameter filters the results based on eventType of the Transcript.  * 01 = Shareholders Meeting * 02 = Earnings Announcement * 03 = Medium-term Management Plan Announcement * 04 = Analyst Meeting * 05 = Special Announcement * 06 = Investor Conference  (optional) 
            var languageType = "eng";  // string | This parameter filters the results based on language type(either English or local) of the Transcript.  (optional)  (default to local)
            var fileName = "SA002220_2023Mar27_a_02_fds_xml_local.xml";  // string | This parameter is used to filters the results based on file name. (optional) 
            var type = "full";  // string | Specifies the type of the file. (optional)  (default to delta)

            try
            {
                // Returns the daily files from Open:FactSet Partner - Scripts Asia.
                ScriptsAsiaResponse result = apiInstance.GetScriptsAsiaFiles(sort, paginationLimit, paginationOffset, trackingId, saId, startDate, endDate, companyName, eventType, languageType, fileName, type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ScriptsAsiaApi.GetScriptsAsiaFiles: " + e.Message );
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
 **trackingId** | **string**| Unique Scripts Asia identifier assigned to an event.  | [optional] 
 **saId** | **string**| This parameter filters the results based on saId of the Transcript.  | [optional] 
 **startDate** | **DateTime?**| The earliest date of the Scripts Asia file the API should return based on date.  | [optional] 
 **endDate** | **DateTime?**| The latest date of the Scripts Asia file the API should return based on date.           | [optional] 
 **companyName** | **string**| This parameter filters the results based on Company Name of the Transcript.  | [optional] 
 **eventType** | **string**| This parameter filters the results based on eventType of the Transcript.  * 01 &#x3D; Shareholders Meeting * 02 &#x3D; Earnings Announcement * 03 &#x3D; Medium-term Management Plan Announcement * 04 &#x3D; Analyst Meeting * 05 &#x3D; Special Announcement * 06 &#x3D; Investor Conference  | [optional] 
 **languageType** | **string**| This parameter filters the results based on language type(either English or local) of the Transcript.  | [optional] [default to local]
 **fileName** | **string**| This parameter is used to filters the results based on file name. | [optional] 
 **type** | **string**| Specifies the type of the file. | [optional] [default to delta]

### Return type
[**ScriptsAsiaResponse**](ScriptsAsiaResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for Scripts Asia files. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


