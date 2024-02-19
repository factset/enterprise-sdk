# FactSet.SDK.GlobalFilings.Api.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCount**](FilingsAPIApi.md#getcount) | **GET** /count | Returns the count of filings for specified source
[**GetFilings**](FilingsAPIApi.md#getfilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**GetHelper**](FilingsAPIApi.md#gethelper) | **GET** /helper | Returns the static values for various parameters



<a name="getcount"></a>
# **GetCount**
> ResponseCount GetCount (string report, List<string> sources, string startDate = null, string endDate = null, List<string> ids = null)

Returns the count of filings for specified source

Returns the count of filings documents along with other response fields.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.GlobalFilings.Api;
using FactSet.SDK.GlobalFilings.Client;
using FactSet.SDK.GlobalFilings.Model;

namespace Example
{
    public class GetCountExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.GlobalFilings.Client.Configuration();

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

            var apiInstance = new FilingsAPIApi(config);

            var report = "count";  // string | retrives count of source.
            var sources = new List<string>(); // List<string> | Code for document source to include.This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.  
            var startDate = "\"0\"";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var endDate = "\"0\"";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 

            try
            {
                // Returns the count of filings for specified source
                ResponseCount result = apiInstance.GetCount(report, sources, startDate, endDate, ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetCount: " + e.Message );
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
 **report** | **string**| retrives count of source. | 
 **sources** | [**List&lt;string&gt;**](string.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &quot;0&quot;]
 **endDate** | **string**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &quot;0&quot;]
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 

### Return type
[**ResponseCount**](ResponseCount.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfilings"></a>
# **GetFilings**
> InvestmentResearch GetFilings (List<string> sources, List<string> ids = null, string startDate = null, string endDate = null, int? paginationLimit = null, int? paginationOffset = null, string timezone = null, string sort = null, List<string> categories = null, string primaryId = null, string searchText = null, string formType = null, string accession = null)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.GlobalFilings.Api;
using FactSet.SDK.GlobalFilings.Client;
using FactSet.SDK.GlobalFilings.Model;

namespace Example
{
    public class GetFilingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.GlobalFilings.Client.Configuration();

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

            var apiInstance = new FilingsAPIApi(config);

            var sources = new List<string>(); // List<string> | Code for document source to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available sources.
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 
            var startDate = "\"0\"";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var endDate = "\"0\"";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 56;  // int? | Page number of the results to return. (optional) 
            var timezone = "\"America/New_York\"";  // string | Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. (optional)  (default to "America/New_York")
            var sort = "asc";  // string | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional)  (default to desc)
            var categories = new List<string>(); // List<string> | Code for categories to include.  This is a comma-separated list. Use the ```/helper``` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var primaryId = "Y";  // string | Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). (optional)  (default to N)
            var searchText = "Updates";  // string | Restricts the search to include only document stories which include the text searched. (optional) 
            var formType = "formType_example";  // string | Restricts the search to include any form types of EDGAR. (optional) 
            var accession = "accession_example";  // string | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG (optional) 

            try
            {
                // Returns the filings documents and related metadata within FactSet coverage.
                InvestmentResearch result = apiInstance.GetFilings(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timezone, sort, categories, primaryId, searchText, formType, accession);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetFilings: " + e.Message );
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
 **sources** | [**List&lt;string&gt;**](string.md)| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available sources. | 
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &quot;0&quot;]
 **endDate** | **string**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &quot;0&quot;]
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] 
 **timezone** | **string**| Time zone to return story dates and times. Time zones are in POSIX format and automatically adjusted for daylight savings. | [optional] [default to &quot;America/New_York&quot;]
 **sort** | **string**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn’t used in the query       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] [default to desc]
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/helper&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **string**| Type of identifier search * Y - Returns headlines of stories that have the search ID(s) as the Primary ID. * N - Returns headlines of stories that mention/refer to the ID(s). | [optional] [default to N]
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **formType** | **string**| Restricts the search to include any form types of EDGAR. | [optional] 
 **accession** | **string**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG | [optional] 

### Return type
[**InvestmentResearch**](InvestmentResearch.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of downloadable URLs consisting of Filings documents with related metadata. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gethelper"></a>
# **GetHelper**
> ResponseHelper GetHelper (string fields = null)

Returns the static values for various parameters

Returns the static values for sources,formTypes,timeZones,categories based on the specified parameter

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.GlobalFilings.Api;
using FactSet.SDK.GlobalFilings.Client;
using FactSet.SDK.GlobalFilings.Model;

namespace Example
{
    public class GetHelperExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.GlobalFilings.Client.Configuration();

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

            var apiInstance = new FilingsAPIApi(config);

            var fields = "sources";  // string | Request data for given field. (optional) 

            try
            {
                // Returns the static values for various parameters
                ResponseHelper result = apiInstance.GetHelper(fields);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetHelper: " + e.Message );
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
 **fields** | **string**| Request data for given field. | [optional] 

### Return type
[**ResponseHelper**](ResponseHelper.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


