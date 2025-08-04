# FactSet.SDK.GlobalFilings.Api.FilingsAPIApi

All URIs are relative to *https://api.factset.com/content/global-filings/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCount**](FilingsAPIApi.md#getcount) | **GET** /count | Returns the count of filings for specified source.
[**GetFilings**](FilingsAPIApi.md#getfilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.



<a name="getcount"></a>
# **GetCount**
> CountResponse GetCount (List<string> ids, List<string> sources, string startDate = null, string endDate = null, string timeZone = null, List<string> categories = null, bool? primaryId = null, string searchText = null, List<string> formTypes = null)

Returns the count of filings for specified source.

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

            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
            var sources = new List<string>(); // List<string> | Code for document source to include.This is a comma-separated list. Use the `/meta/sources` endpoint to get the list of available sources.  
            var startDate = "20240601";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional) 
            var endDate = "20241101";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) 
            var timeZone = "\"America/New_York\"";  // string | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional)  (default to "America/New_York")
            var categories = new List<string>(); // List<string> | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var primaryId = true;  // bool? | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional)  (default to false)
            var searchText = "Officer";  // string | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional) 
            var formTypes = new List<string>(); // List<string> | The search to include any form types of given sources (optional) 

            try
            {
                // Returns the count of filings for specified source.
                CountResponse result = apiInstance.GetCount(ids, sources, startDate, endDate, timeZone, categories, primaryId, searchText, formTypes);
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **sources** | [**List&lt;string&gt;**](string.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;/meta/sources&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional] 
 **endDate** | **string**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] 
 **timeZone** | **string**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to &quot;America/New_York&quot;]
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **bool?**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **searchText** | **string**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional] 
 **formTypes** | [**List&lt;string&gt;**](string.md)| The search to include any form types of given sources | [optional] 

### Return type
[**CountResponse**](CountResponse.md)

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
> SearchResponse GetFilings (List<string> ids, List<string> sources, string startDate = null, string endDate = null, int? paginationLimit = null, int? paginationOffset = null, string timeZone = null, List<string> sort = null, List<string> categories = null, bool? primaryId = null, string searchText = null, List<string> formTypes = null, string edgarAccession = null)

Returns the filings documents and related metadata within FactSet coverage.

Returns the filings documents within FactSet coverage along with other response fields.

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

            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
            var sources = new List<string>(); // List<string> | 
            var startDate = "20240601";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  (optional) 
            var endDate = "20241101";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return.  (optional)  (default to 0)
            var timeZone = "\"America/New_York\"";  // string | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional)  (default to "America/New_York")
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending  order based on filingsDateTime.   * `filingsDateTime` - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  `-filingsDateTime` - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query. (optional) 
            var categories = new List<string>(); // List<string> | Code for categories to include.  This is a comma-separated list. Use the `/meta/categories` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var primaryId = true;  // bool? | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional)  (default to false)
            var searchText = "Officer";  // string | Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. (optional) 
            var formTypes = new List<string>(); // List<string> | The search to include any form types of given sources (optional) 
            var edgarAccession = "edgarAccession_example";  // string | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.   > **Note:**  > When used in conjunction with the 'sources' parameter set to 'EDGAR, the API considers this accession for data retrieval.  > For non-EDGAR sources, this parameter is ignored. (optional) 

            try
            {
                // Returns the filings documents and related metadata within FactSet coverage.
                SearchResponse result = apiInstance.GetFilings(ids, sources, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, formTypes, edgarAccession);
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **sources** | [**List&lt;string&gt;**](string.md)|  | 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  | [optional] 
 **endDate** | **string**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return.  | [optional] [default to 0]
 **timeZone** | **string**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to &quot;America/New_York&quot;]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending  order based on filingsDateTime.   * &#x60;filingsDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.   *  &#x60;-filingsDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query. | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;/meta/categories&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **bool?**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **searchText** | **string**| Restricts the search to include only document stories that include the searched text. This parameter supports boolean operators as well. | [optional] 
 **formTypes** | [**List&lt;string&gt;**](string.md)| The search to include any form types of given sources | [optional] 
 **edgarAccession** | **string**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.   &gt; **Note:**  &gt; When used in conjunction with the &#39;sources&#39; parameter set to &#39;EDGAR, the API considers this accession for data retrieval.  &gt; For non-EDGAR sources, this parameter is ignored. | [optional] 

### Return type
[**SearchResponse**](SearchResponse.md)

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


