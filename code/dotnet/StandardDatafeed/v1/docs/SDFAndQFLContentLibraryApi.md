# FactSet.SDK.StandardDatafeed.Api.SDFAndQFLContentLibraryApi

All URIs are relative to *https://api.factset.com/bulk-documents/sdf*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetV1ListFiles**](SDFAndQFLContentLibraryApi.md#getv1listfiles) | **GET** /v1/list-files | 



<a name="getv1listfiles"></a>
# **GetV1ListFiles**
> ListFiles200Response GetV1ListFiles (string schema = null, string bundle = null, string type = null, string startDate = null, string endDate = null, int? paginationLimit = null, int? paginationOffset = null, string sort = null)



<a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the delta & full files in a reverse chronological order by default for all the schemas & bundles subscribed by the client    QFL:-    - In case of QFL, <a href=https://api.factset.com/bulk-documents/sdf/v1/list-files>List-Files</a> end point provides the \"Historical & Year to Date (YTD)\" data in a reverse chronological order by default for all the factor families & groups subscribed to by the user</p> Provides \"full files\" only for historical bundles[data available from 1995 to previous year], \"full & delta files\" for YTD bundles[data available for current year]        If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. 

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

            var apiInstance = new SDFAndQFLContentLibraryApi(config);

            var schema = "schema_example";  // string | schema name</p> </p> **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  (optional) 
            var bundle = "bundle_example";  // string | bundle name</p> If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families & factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups (optional) 
            var type = "full";  // string | file type = Full or Delta</p> Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \"Full\" files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \"Full\" . A \"Full\" file is generated for each year - For YTD (Current year)- \"Full\" files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \"Full\" files (optional) 
            var startDate = "startDate_example";  // string | The earliest date of the feed file the API should fetch for based on the fileTimestamp.</p>   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files. (optional) 
            var endDate = "endDate_example";  // string | The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today (optional) 
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
                Console.WriteLine("Exception when calling SDFAndQFLContentLibraryApi.GetV1ListFiles: " + e.Message );
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
 **schema** | **string**| schema name&lt;/p&gt; &lt;/p&gt; **Example: acta_v1, fgp_v1, yn_v1**  QFL:- To query QFL data, please use value:   **qfl_v1**  | [optional] 
 **bundle** | **string**| bundle name&lt;/p&gt; If this parameter is not passed in the request, all the bundles a client is subscribed to are returned.  QFL:- - For QFL its the factor group name - If this parameter is not passed in the request, all the the factor families &amp; factor groups subscribed to by the user are returned. - Supports comma separated list of multiple factor groups | [optional] 
 **type** | **string**| file type &#x3D; Full or Delta&lt;/p&gt; Full files are weekly files generated every weekend (Saturday). **The date range should include weekend dates if requesting for \&quot;Full\&quot; files**  QFL:- In case of QFL we have - Historical files (1995 to previous year)- Always \&quot;Full\&quot; . A \&quot;Full\&quot; file is generated for each year - For YTD (Current year)- \&quot;Full\&quot; files are weekly files generated every weekend (Saturday). The date range should include weekend dates if requesting for \&quot;Full\&quot; files | [optional] 
 **startDate** | **string**| The earliest date of the feed file the API should fetch for based on the fileTimestamp.&lt;/p&gt;   - If schema parameter is not specified in the request, then data requested should be in batches of 10days or less**(Date range should be less than or equal to 10)** - If the schema parameter is specified in the request, date range can be greater than 10 days - If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default. - startDate can be absolute- YYYY-MM-DD or relative:-  -1 for yesterday  QFL:- In case of QFL - Historical files available from 1995-01-01 to 2021-12-31. YTD files are current year files. | [optional] 
 **endDate** | **string**| The latest date of the feed file the API should fetch for based on the fileTimestamp  If startDate and endDate parameters are not specified in the request, this endpoint returns past 10 days data by default.  endDate can be in absolute- YYYY-MM-DD or relative date:- 0 for today | [optional] 
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


