# FactSet.SDK.EventsandTranscripts.Api.TranscriptsApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTimezone**](TranscriptsApi.md#gettimezone) | **GET** /reference/time-zones | Returns the time zones.
[**GetTranscripts**](TranscriptsApi.md#gettranscripts) | **GET** /transcripts/search | Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
[**GetTranscriptsDates**](TranscriptsApi.md#gettranscriptsdates) | **GET** /transcripts/dates | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
[**GetTranscriptsEvents**](TranscriptsApi.md#gettranscriptsevents) | **GET** /transcripts/events | Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
[**GetTranscriptsIds**](TranscriptsApi.md#gettranscriptsids) | **GET** /transcripts/ids | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
[**GetTranscriptsInvestorSlides**](TranscriptsApi.md#gettranscriptsinvestorslides) | **GET** /transcripts/investor-slides | Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
[**GetTranscriptsTime**](TranscriptsApi.md#gettranscriptstime) | **GET** /transcripts/times | Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
[**Getcategories**](TranscriptsApi.md#getcategories) | **GET** /reference/categories | Returns the categories.



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
using FactSet.SDK.EventsandTranscripts.Api;
using FactSet.SDK.EventsandTranscripts.Client;
using FactSet.SDK.EventsandTranscripts.Model;

namespace Example
{
    public class GetTimezoneExample
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


            try
            {
                // Returns the time zones.
                ResponseTime result = apiInstance.GetTimezone();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTimezone: " + e.Message );
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
| **200** | List of all available time zones. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscripts"></a>
# **GetTranscripts**
> Transcripts GetTranscripts (string searchText = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

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
    public class GetTranscriptsExample
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

            var searchText = "Updates";  // string | Restricts the search to include only document stories which include the text searched. (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the transcript documents in XML format and related metadata within FactSet coverage based on search text.
                Transcripts result = apiInstance.GetTranscripts(searchText, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscripts: " + e.Message );
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
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided search text. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscriptsdates"></a>
# **GetTranscriptsDates**
> Transcripts GetTranscriptsDates (DateTime? startDate = null, DateTime? endDate = null, int? startDateRelative = null, int? endDateRelative = null, string timeZone = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

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
    public class GetTranscriptsDatesExample
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

            var startDate = DateTime.Parse("2020-10-01");  // DateTime? | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional) 
            var endDate = DateTime.Parse("2020-12-26");  // DateTime? | End Date. Format is YYYY-MM-DD. (optional) 
            var startDateRelative = 56;  // int? | The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `startDate` or `startDateRelative` should be used, but not both.* - *If both `startDate` and `startDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `startDate` or `startDateRelative`, the API will not return any data.*  (optional) 
            var endDateRelative = 56;  // int? | The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: '0' for today, '-1' for yesterday, '-2' for two days ago, and so forth. Negative values are used to represent past dates.   - *Either `endDate` or `endDateRelative` should be used, but not both.* - *If both `endDate` and `endDateRelative` are provided in the same request, the API will return an error.* - *If users provide future dates in requests for `endDate` or `endDateRelative`, the API will not return any data.*  (optional) 
            var timeZone = "\"America/New_York\"";  // string | timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. (optional)  (default to "America/New_York")
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific date range and time zones.
                Transcripts result = apiInstance.GetTranscriptsDates(startDate, endDate, startDateRelative, endDateRelative, timeZone, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsDates: " + e.Message );
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
 **startDate** | **DateTime?**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] 
 **endDate** | **DateTime?**| End Date. Format is YYYY-MM-DD. | [optional] 
 **startDateRelative** | **int?**| The earliest date of the feed file the API should fetch based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;startDate&#x60; or &#x60;startDateRelative&#x60; should be used, but not both.* - *If both &#x60;startDate&#x60; and &#x60;startDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;startDate&#x60; or &#x60;startDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **endDateRelative** | **int?**| The latest date of the feed file the API should fetch for based on the file timestamp.  - Format: Specify the date using a relative term as an integer: &#39;0&#39; for today, &#39;-1&#39; for yesterday, &#39;-2&#39; for two days ago, and so forth. Negative values are used to represent past dates.   - *Either &#x60;endDate&#x60; or &#x60;endDateRelative&#x60; should be used, but not both.* - *If both &#x60;endDate&#x60; and &#x60;endDateRelative&#x60; are provided in the same request, the API will return an error.* - *If users provide future dates in requests for &#x60;endDate&#x60; or &#x60;endDateRelative&#x60;, the API will not return any data.*  | [optional] 
 **timeZone** | **string**| timeZone to return story dates and times.Time zones, represented in POSIX format, are automatically adjusted for daylight savings. timeZone names are sourced from the IANA timezone registry. The time fields in the response will adhere to this specified timezone. | [optional] [default to &quot;America/New_York&quot;]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**Transcripts**](Transcripts.md)

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


<a name="gettranscriptsevents"></a>
# **GetTranscriptsEvents**
> Transcripts GetTranscriptsEvents (List<string> eventIds = null, string eventType = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

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
    public class GetTranscriptsEventsExample
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

            var eventIds = new List<string>(); // List<string> | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. (optional) 
            var eventType = "Earnings";  // string | Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the transcript documents in XML format and related metadata within FactSet coverage based on eventIds and eventType.
                Transcripts result = apiInstance.GetTranscriptsEvents(eventIds, eventType, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsEvents: " + e.Message );
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
 **eventIds** | [**List&lt;string&gt;**](string.md)| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional] 
 **eventType** | **string**| Specifies the type of event you want to retrieve.   Earnings - Denotes an Earnings event.   Guidance - Denotes a Guidance event.   AnalystsShareholdersMeeting - Denotes an Analysts and Shareholders Meeting event.   ConferencePresentation - Denotes a Conference Presentation event.   SalesRevenue - Denotes a Sales/Revenue event.   SpecialSituation - Denotes a Special Situation event (i.e. Merger/Acquisition). | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**Transcripts**](Transcripts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided event IDs and event type. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscriptsids"></a>
# **GetTranscriptsIds**
> TranscriptsOne GetTranscriptsIds (bool? primaryId = null, List<string> ids = null, DateTime? startDate = null, DateTime? endDate = null, string searchText = null, List<string> reportIds = null, List<string> categories = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

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
    public class GetTranscriptsIdsExample
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

            var primaryId = true;  // bool? | Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. (optional)  (default to false)
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 
            var startDate = DateTime.Parse("2020-10-01");  // DateTime? | Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  (optional) 
            var endDate = DateTime.Parse("2020-12-26");  // DateTime? | End Date. Format is YYYY-MM-DD. (optional) 
            var searchText = "Updates";  // string | Restricts the search to include only document stories which include the text searched. (optional) 
            var reportIds = new List<string>(); // List<string> | Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 (optional) 
            var categories = new List<string>(); // List<string> | Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific IDs.
                TranscriptsOne result = apiInstance.GetTranscriptsIds(primaryId, ids, startDate, endDate, searchText, reportIds, categories, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsIds: " + e.Message );
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
 **primaryId** | **bool?**| Type of identifier search * true - Returns headlines of stories that have the searched identifier(s) as the primary  identifier. * false - Returns headlines of stories that mentioned or referred to the  identifier. | [optional] [default to false]
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **startDate** | **DateTime?**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**  | [optional] 
 **endDate** | **DateTime?**| End Date. Format is YYYY-MM-DD. | [optional] 
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **reportIds** | [**List&lt;string&gt;**](string.md)| Requests Report IDs. This is a comma-separated list with a maximum limit of 1000 | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**TranscriptsOne**](TranscriptsOne.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The latest transcripts based on the provided report ID, IDs and primary ID. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettranscriptsinvestorslides"></a>
# **GetTranscriptsInvestorSlides**
> InvestorSlides GetTranscriptsInvestorSlides (DateTime startDate, DateTime endDate, List<string> ids = null, List<string> eventIds = null, List<string> categories = null, string searchText = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

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

            var startDate = DateTime.Parse("2020-10-01");  // DateTime | Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.** 
            var endDate = DateTime.Parse("2020-12-26");  // DateTime | End Date. Format is YYYY-MM-DD.
            var ids = new List<string>(); // List<string> | Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. (optional) 
            var eventIds = new List<string>(); // List<string> | Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. (optional) 
            var categories = new List<string>(); // List<string> | Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the ```/reference/categories``` endpoint to get the list of available categories.  Default = All categories. (optional) 
            var searchText = "Updates";  // string | Restricts the search to include only document stories which include the text searched. (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the investor slides in PDF format and related metadata within FactSet coverage based on specific date range and various parameters.
                InvestorSlides result = apiInstance.GetTranscriptsInvestorSlides(startDate, endDate, ids, eventIds, categories, searchText, sort, paginationLimit, paginationOffset);
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
 **startDate** | **DateTime**| Start Date. Format is YYYY-MM-DD    **The API supports data from 1995 onwards. Ensure that the provided Date falls within this range for accurate results.**  | 
 **endDate** | **DateTime**| End Date. Format is YYYY-MM-DD. | 
 **ids** | [**List&lt;string&gt;**](string.md)| Requested symbols or securities.  This is a comma-separated list with a maximum limit of 1000.  Each symbol can be a FactSet exchange symbol, CUSIP, or SEDOL. | [optional] 
 **eventIds** | [**List&lt;string&gt;**](string.md)| Requests Event IDs. This is a comma-separated list with a maximum limit of 1000. | [optional] 
 **categories** | [**List&lt;string&gt;**](string.md)| Code for categories to include. This is a comma-separated list.which represents country, industry, and subject codes. Use the &#x60;&#x60;&#x60;/reference/categories&#x60;&#x60;&#x60; endpoint to get the list of available categories.  Default &#x3D; All categories. | [optional] 
 **searchText** | **string**| Restricts the search to include only document stories which include the text searched. | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**InvestorSlides**](InvestorSlides.md)

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


<a name="gettranscriptstime"></a>
# **GetTranscriptsTime**
> TranscriptsTimes GetTranscriptsTime (DateTime? startDateTime = null, DateTime? endDateTime = null, List<string> sort = null, int? paginationLimit = null, int? paginationOffset = null)

Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.

Returns the transcripts documents within FactSet coverage along with other response fields.   All transcripts originate from Factset Callstreet Transcripts. 

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
    public class GetTranscriptsTimeExample
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

            var startDateTime = DateTime.Parse("2020-10-01T00:00:00Z");  // DateTime? |  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    (optional) 
            var endDateTime = DateTime.Parse("2020-10-26T10:00:00Z");  // DateTime? | The date to which data is required (optional) 
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending chronological order based on eventDate.  (optional) 
            var paginationLimit = 25;  // int? | Number of results to return per page. Maximum value: 1000.  (optional)  (default to 25)
            var paginationOffset = 0;  // int? | Page number of the results to return. (optional)  (default to 0)

            try
            {
                // Returns the transcript documents in XML format and related metadata within FactSet coverage based on specific time.
                TranscriptsTimes result = apiInstance.GetTranscriptsTime(startDateTime, endDateTime, sort, paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.GetTranscriptsTime: " + e.Message );
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
 **startDateTime** | **DateTime?**|  **The API supports data from 1999 onwards. Ensure that the provided Date falls within this range for accurate results.**    | [optional] 
 **endDateTime** | **DateTime?**| The date to which data is required | [optional] 
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending chronological order based on eventDate.  | [optional] 
 **paginationLimit** | **int?**| Number of results to return per page. Maximum value: 1000.  | [optional] [default to 25]
 **paginationOffset** | **int?**| Page number of the results to return. | [optional] [default to 0]

### Return type
[**TranscriptsTimes**](TranscriptsTimes.md)

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


<a name="getcategories"></a>
# **Getcategories**
> ResponseCategories Getcategories ()

Returns the categories.

Retrieves and delivers a comprehensive list of all available `categories`which are defined as country, industry, and subject codes. The data is returned as a comma-separated list.

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
    public class GetcategoriesExample
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


            try
            {
                // Returns the categories.
                ResponseCategories result = apiInstance.Getcategories();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TranscriptsApi.Getcategories: " + e.Message );
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
[**ResponseCategories**](ResponseCategories.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of all available categories. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


