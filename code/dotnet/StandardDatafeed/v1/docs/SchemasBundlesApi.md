# FactSet.SDK.StandardDatafeed.Api.SchemasBundlesApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetV1ListFiles**](SchemasBundlesApi.md#getv1listfiles) | **GET** /v1/list-files | 


<a name="getv1listfiles"></a>
# **GetV1ListFiles**
> ListFiles200Response GetV1ListFiles (string schema = null, string bundle = null, string type = null, string startDate = null, string endDate = null, int? paginationLimit = null, int? paginationOffset = null, string sort = null)



<a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order for all the schemas & bundles subscribed by the client 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StandardDatafeed.Api;
using FactSet.SDK.StandardDatafeed.Client;
using FactSet.SDK.StandardDatafeed.Model;

namespace Example
{
    public class GetV1ListFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StandardDatafeed.Client.Configuration();

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

            var apiInstance = new SchemasBundlesApi(config);
            var schema = "schema_example";  // string | schema name</p> Default is all schemas & bundles subscribed by the client</p> **Example: acta_v1, fgp_v1, yn_v1** (optional) 
            var bundle = "bundle_example";  // string | bundle name</p> Default is all the bundles client is subscribed to</p> **Do not use \"schema\" parameter** when searching for a specific bundle (optional) 
            var type = "full";  // string | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files** (optional) 
            var startDate = "startDate_example";  // string | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p> Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**</p>**Date format -  YYYY-MM-DD** (optional) 
            var endDate = "endDate_example";  // string | The latest date of the feed file the API should fetch for based on the fileTimestamp</p>**Date format -  YYYY-MM-DD** (optional) 
            var paginationLimit = 20;  // int? | Specifies the number of results to return per page. Default is 20 & Maximum is 500 results per page (optional)  (default to 20)
            var paginationOffset = 56;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) 
            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used (optional) 

            try
            {
                ListFiles200Response result = apiInstance.GetV1ListFiles(schema, bundle, type, startDate, endDate, paginationLimit, paginationOffset, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SchemasBundlesApi.GetV1ListFiles: " + e.Message );
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
 **schema** | **string**| schema name&lt;/p&gt; Default is all schemas &amp; bundles subscribed by the client&lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1** | [optional] 
 **bundle** | **string**| bundle name&lt;/p&gt; Default is all the bundles client is subscribed to&lt;/p&gt; **Do not use \&quot;schema\&quot; parameter** when searching for a specific bundle | [optional] 
 **type** | **string**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files** | [optional] 
 **startDate** | **string**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt; Data requested should be in batches of 10days **(Date range should be less than or equal to 10)**&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional] 
 **endDate** | **string**| The latest date of the feed file the API should fetch for based on the fileTimestamp&lt;/p&gt;**Date format -  YYYY-MM-DD** | [optional] 
 **paginationLimit** | **int?**| Specifies the number of results to return per page. Default is 20 &amp; Maximum is 500 results per page | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] 
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used | [optional] 

### Return type
[**ListFiles200Response**](ListFiles200Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

