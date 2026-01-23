# FactSet.SDK.EventsandTranscripts.Api.TranscriptsApi

All URIs are relative to *https://api.factset.com/content/events/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTranscriptsIntelligence**](TranscriptsApi.md#gettranscriptsintelligence) | **GET** /transcripts/intelligence | Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
[**GetTranscriptsInvestorSlides**](TranscriptsApi.md#gettranscriptsinvestorslides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**GetTranscriptsinXML**](TranscriptsApi.md#gettranscriptsinxml) | **GET** /transcripts/response-type | Returns the requested response type of transcript
[**SearchTranscripts**](TranscriptsApi.md#searchtranscripts) | **POST** /transcripts | Returns transcript documents and related metadata based on different search criteria.



<a name="gettranscriptsintelligence"></a>
# **GetTranscriptsIntelligence**
> TranscriptsIntelligenceResponse GetTranscriptsIntelligence (List<string> ids, DateTime? startDate = null, DateTime? endDate = null, int? startDateRelative = null, int? endDateRelative = null, List<string> categories = null, string timeZone = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the StreetAccount Transcript Intelligence documents within FactSet coverage along with other response fields.  All StreetAccount Transcript Intelligence stories originate from StreetAccount 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetTranscriptsIntelligenceExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new TranscriptsApi(config);

            var ids = new List<string>(); // List<string> | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
            var startDate = DateTime.Parse("2025-05-01");  // DateTime? | Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  (optional) 
            var endDate = DateTime.Parse("2025-07-24");  // DateTime? | End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  (optional) 
            var startDateRelative = 56;  // int? | The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `startDate` or `startDateRelative` should be used, but not both.* - If dates are not provided, default will return all files.  (optional) 
            var endDateRelative = 56;  // int? | The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (`0` for today, `-1` for yesterday, etc.). - *Either `endDate` or `endDateRelative` should be used, but not both.* - If dates are not provided, default will return all files.  (optional) 
            var categories = new List<string>(); // List<string> | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.   (optional) 
            var timeZone = "\"America/New_York\"";  // string | Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the `/meta/time-zones` endpoint to get the list of available time zones. (optional)  (default to "America/New_York")
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional)  (default to 0)

            try
            {
                // Returns the StreetAccount Transcript Intelligence documents and related metadata within FactSet coverage based on specific date range and various parameters.
                TranscriptsIntelligenceResponse result = apiInstance.GetTranscriptsIntelligence(ids, startDate, endDate, startDateRelative, endDateRelative, categories, timeZone, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsIntelligence: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **startDate** | **DateTime?**| Start Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
 **endDate** | **DateTime?**| End Date (YYYY-MM-DD). If dates are not provided, default will return all files.  | [optional] 
 **startDateRelative** | **int?**| The earliest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
 **endDateRelative** | **int?**| The latest date of the feed file the API should fetch based on the file timestamp, relative to today. - Format: Integer (&#x60;0&#x60; for today, &#x60;-1&#x60; for yesterday, etc.). - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - If dates are not provided, default will return all files.  | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional] 
 **timeZone** | **string**| Time Zone for story dates/times (POSIX format from IANA timeZone registry).  Use the &#x60;/meta/time-zones&#x60; endpoint to get the list of available time zones. | [optional] [default to &quot;America/New_York&quot;]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type
[**TranscriptsIntelligenceResponse**](TranscriptsIntelligenceResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided date ranges. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscriptsinvestorslides"></a>
# **GetTranscriptsInvestorSlides**
> InvestorSlidesResponse GetTranscriptsInvestorSlides (List<string> ids, DateTime startDate, DateTime endDate, List<string> eventIds = null, List<string> categories = null, string searchText = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.

Returns the Factset Callstreet Investor Slides documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Investor Slides. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetTranscriptsInvestorSlidesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new TranscriptsApi(config);

            var ids = new List<string>(); // List<string> | Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID
            var startDate = DateTime.Parse("2025-07-23");  // DateTime | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
            var endDate = DateTime.Parse("2025-07-24");  // DateTime | End Date. Format is YYYY-MM-DD.
            var eventIds = new List<string>(); // List<string> | Requests Event IDs. This is a list with a maximum limit of 1000. (optional) 
            var categories = new List<string>(); // List<string> | Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the ```/meta/categories``` endpoint to get the list of available categories.  Default = All categories.   (optional) 
            var searchText = "presentation";  // string | Restricts the search to include only document stories which include the text searched.     (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional)  (default to 0)

            try
            {
                // Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
                InvestorSlidesResponse result = apiInstance.GetTranscriptsInvestorSlides(ids, startDate, endDate, eventIds, categories, searchText, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsInvestorSlides: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities. This is a list with a maximum limit of 1000. Each symbol can be a FactSet exchange symbol, CUSIP, SEDOL, ISIN, or Entity ID | 
 **startDate** | **DateTime**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | 
 **endDate** | **DateTime**| End Date. Format is YYYY-MM-DD. | 
 **eventIds** | [**List&lt;string&gt;**](string.md)| Requests Event IDs. This is a list with a maximum limit of 1000. | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include. This is a list, which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/meta/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories.   | [optional] 
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched.     | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type
[**InvestorSlidesResponse**](InvestorSlidesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest investor slides based on the provided date ranges. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscriptsinxml"></a>
# **GetTranscriptsinXML**
> ResponseType GetTranscriptsinXML (List<string> reportIds, string format, int? paginationLimit = null, int? paginationOffset = null)

Returns the requested response type of transcript

Returns the Factset Callstreet documents within FactSet coverage along with other response fields   All transcripts originate from Factset Callstreet Transcripts 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetTranscriptsinXMLExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new TranscriptsApi(config);

            var reportIds = new List<string>(); // List<string> | Requests Report IDs. This is a list with a maximum limit of 1000
            var format = "XML";  // string | The format of the output file. Allowed values:   - `XML`: Structured data format ideal for integrations and parsing.   - `PDF`: Printable document format preserving layout and design.   - `DocViewer`: Web-friendly format rendered in an in-browser document viewer.   - `ContentXML`: XML containing only the core content without layout or styling metadata. 
            var paginationLimit = 25;  // int? | Number of results to return per page. (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. (optional)  (default to 0)

            try
            {
                // Returns the requested response type of transcript
                ResponseType result = apiInstance.GetTranscriptsinXML(reportIds, format, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsinXML: " + e.Message );
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
 **reportIds** | [**List&lt;string&gt;**](string.md)| Requests Report IDs. This is a list with a maximum limit of 1000 | 
 **format** | **string**| The format of the output file. Allowed values:   - &#x60;XML&#x60;: Structured data format ideal for integrations and parsing.   - &#x60;PDF&#x60;: Printable document format preserving layout and design.   - &#x60;DocViewer&#x60;: Web-friendly format rendered in an in-browser document viewer.   - &#x60;ContentXML&#x60;: XML containing only the core content without layout or styling metadata.  | 
 **paginationLimit** | **int?**| Number of results to return per page. | [optional] [default to 25]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of the next set of results. | [optional] [default to 0]

### Return type
[**ResponseType**](ResponseType.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns the requested response type of transcripts |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="searchtranscripts"></a>
# **SearchTranscripts**
> TranscriptsResponse SearchTranscripts (TranscriptsRequest transcriptsRequest)

Returns transcript documents and related metadata based on different search criteria.

Retrieves transcript documents in XML format and related metadata within FactSet coverage based on various criteria like date range, search text, specific IDs, or event details. Use the appropriate parameters within the `data` object of the request body to specify the search method. Pagination and sorting are controlled via the `meta` object.  All transcripts originate from Factset Callstreet Transcripts. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class SearchTranscriptsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsandTranscripts.Client.Configuration();

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

            var apiInstance = new TranscriptsApi(config);

            var transcriptsRequest = new TranscriptsRequest(); // TranscriptsRequest | Criteria to search for transcripts. Select one mode of search.

            try
            {
                // Returns transcript documents and related metadata based on different search criteria.
                TranscriptsResponse result = apiInstance.SearchTranscripts(transcriptsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.SearchTranscripts: " + e.Message );
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
 **transcriptsRequest** | [**TranscriptsRequest**](TranscriptsRequest.md)| Criteria to search for transcripts. Select one mode of search. | 

### Return type
[**TranscriptsResponse**](TranscriptsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts matching the specified criteria. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


