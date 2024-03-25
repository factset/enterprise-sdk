# FactSet.SDK.GlobalFilings.Api.FilingsAPIApi

All URIs are relative to *https://api.factset.com/global-filings/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCount**](FilingsAPIApi.md#getcount) | **GET** /count | Returns the count of filings for specified source.
[**GetFilings**](FilingsAPIApi.md#getfilings) | **GET** /search | Returns the filings documents and related metadata within FactSet coverage.
[**GetFormtype**](FilingsAPIApi.md#getformtype) | **GET** /reference/form-types | Returns the form types of EDGAR.
[**GetSources**](FilingsAPIApi.md#getsources) | **GET** /reference/sources | Returns the sources.
[**GetTimezone**](FilingsAPIApi.md#gettimezone) | **GET** /reference/time-zones | Returns the time zones.
[**Getcategories**](FilingsAPIApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



<a name="getcount"></a>
# **GetCount**
> ResponseCount GetCount (List<string> sources, string startDate = null, string endDate = null, List<string> ids = null)

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

            var sources = new List<string>(); // List<string> | Code for document source to include.This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.  
            var startDate = "\"0\"";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)  (default to "0")
            var endDate = "\"0\"";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 

            try
            {
                // Returns the count of filings for specified source.
                ResponseCount result = apiInstance.GetCount(sources, startDate, endDate, ids);
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
 **sources** | [**List&lt;string&gt;**](string.md)| Code for document source to include.This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources.   | 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] [default to &quot;0&quot;]
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
> InvestmentResearch GetFilings (List<string> sources, List<string> ids = null, string startDate = null, string endDate = null, int? paginationLimit = null, int? paginationOffset = null, string timeZone = null, string sort = null, List<string> categories = null, bool? primaryId = null, string searchText = null, string edgarFormType = null, string edgarAccession = null)

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

            var sources = new List<string>(); // List<string> | Code for document source to include.  This is a comma-separated list. Use the ```/reference/sources``` endpoint to get the list of available sources.
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 
            var startDate = "\"0\"";  // string | Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional)  (default to "0")
            var endDate = "\"0\"";  // string | End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). (optional)  (default to "0")
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 56;  // int? | Page number of the results to return. (optional) 
            var timeZone = "\"America/New_York\"";  // string | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. (optional)  (default to "America/New_York")
            var sort = "asc";  // string | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn't used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  (optional)  (default to desc)
            var categories = new List<string>(); // List<string> | Code for categories to include.  This is a comma-separated list. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var primaryId = true;  // bool? | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional)  (default to false)
            var searchText = "Updates";  // string | Restricts the search to include only document stories which include the text searched. (optional) 
            var edgarFormType = "edgarFormType_example";  // string | Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  (optional) 
            var edgarAccession = "edgarAccession_example";  // string | A unique identifier given to each EDGAR filings document. e.g. accession=0001013237-21-000069&sources=EDG.  **Note:  When used in conjunction with the 'source' parameter set to 'EDGAR', the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** (optional) 

            try
            {
                // Returns the filings documents and related metadata within FactSet coverage.
                InvestmentResearch result = apiInstance.GetFilings(sources, ids, startDate, endDate, paginationLimit, paginationOffset, timeZone, sort, categories, primaryId, searchText, edgarFormType, edgarAccession);
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
 **sources** | [**List&lt;string&gt;**](string.md)| Code for document source to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/sources&#x60;&#x60;&#x60; endpoint to get the list of available sources. | 
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **string**| Start Date. Format is YYYYMMDD or relative +/- days (0,-1,etc).  **Note:** **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] [default to &quot;0&quot;]
 **endDate** | **string**| End Date. Format is YYYYMMDD or relative +/- days (0,-1,etc). | [optional] [default to &quot;0&quot;]
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] 
 **timeZone** | **string**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. | [optional] [default to &quot;America/New_York&quot;]
 **sort** | **string**| Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  desc - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *   asc - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.  | [optional] [default to desc]
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include.  This is a comma-separated list. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **primaryId** | **bool?**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **edgarFormType** | **string**| Restricts the search to include any form types of EDGAR.  **Note:This parameter applies exclusively to EDGAR searches; it is ignored when used with non-EDGAR sources.**  | [optional] 
 **edgarAccession** | **string**| A unique identifier given to each EDGAR filings document. e.g. accession&#x3D;0001013237-21-000069&amp;sources&#x3D;EDG.  **Note:  When used in conjunction with the &#39;source&#39; parameter set to &#39;EDGAR&#39;, the API considers this accession for data retrieval. For non-EDGAR sources, this parameter is ignored.** | [optional] 

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


<a name="getformtype"></a>
# **GetFormtype**
> ResponseFormtype GetFormtype ()

Returns the form types of EDGAR.

 Retrieves and delivers a comprehensive list of all available  `formTypes`.

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
    public class GetFormtypeExample
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


            try
            {
                // Returns the form types of EDGAR.
                ResponseFormtype result = apiInstance.GetFormtype();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetFormtype: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**ResponseFormtype**](ResponseFormtype.md)

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


<a name="getsources"></a>
# **GetSources**
> ResponseSources GetSources ()

Returns the sources.

Retrieves and delivers a comprehensive list of all available `sources`.

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
    public class GetSourcesExample
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


            try
            {
                // Returns the sources.
                ResponseSources result = apiInstance.GetSources();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetSources: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**ResponseSources**](ResponseSources.md)

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


<a name="gettimezone"></a>
# **GetTimezone**
> ResponseTime GetTimezone ()

Returns the time zones.

Retrieves and delivers a comprehensive list of all available `timeZones`.

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
    public class GetTimezoneExample
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


            try
            {
                // Returns the time zones.
                ResponseTime result = apiInstance.GetTimezone();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.GetTimezone: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**ResponseTime**](ResponseTime.md)

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


<a name="getcategories"></a>
# **Getcategories**
> ResponseCategies Getcategories ()

Returns the categories.

Retrieves and delivers a comprehensive list of all available `categories`.

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
    public class GetcategoriesExample
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


            try
            {
                // Returns the categories.
                ResponseCategies result = apiInstance.Getcategories();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsAPIApi.Getcategories: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**ResponseCategies**](ResponseCategies.md)

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


