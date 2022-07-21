# FactSet.SDK.Signals.Api.EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEventAdaptiveCardById**](EventsApi.md#geteventadaptivecardbyid) | **GET** /events/adaptive-cards/{eventId} | 
[**GetEventAdaptiveCards**](EventsApi.md#geteventadaptivecards) | **GET** /events/adaptive-cards | 
[**GetEventDetailById**](EventsApi.md#geteventdetailbyid) | **GET** /events/details/{eventId} | 
[**GetEventDetails**](EventsApi.md#geteventdetails) | **GET** /events/details | 
[**GetEventEntities**](EventsApi.md#getevententities) | **GET** /events/entities | 
[**GetEventHeadlines**](EventsApi.md#geteventheadlines) | **GET** /events/headlines | 
[**PostEventDetails**](EventsApi.md#posteventdetails) | **POST** /events/details | 
[**PostEventHeadlines**](EventsApi.md#posteventheadlines) | **POST** /events/headlines | 


<a name="geteventadaptivecardbyid"></a>
# **GetEventAdaptiveCardById**
> EventAdaptiveCard GetEventAdaptiveCardById (Guid eventId)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventAdaptiveCardByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventId = "eventId_example";  // Guid | The UUID of the event to return.

            try
            {
                EventAdaptiveCard result = apiInstance.GetEventAdaptiveCardById(eventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventAdaptiveCardById: " + e.Message );
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
 **eventId** | **Guid**| The UUID of the event to return. | 

### Return type
[**EventAdaptiveCard**](EventAdaptiveCard.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geteventadaptivecards"></a>
# **GetEventAdaptiveCards**
> EventAdaptiveCards GetEventAdaptiveCards (DateTimeInterval created = null, DateTimeInterval updated = null, string signalIds = null, string ids = null, string portfolios = null, string themes = null, string categories = null, RelevanceScoreRange userRelevanceScore = null, string sort = null)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on the filtering criteria

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventAdaptiveCardsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var created = new DateTimeInterval(); // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional) 
            var updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional) 
            var signalIds = dilutionTrigger,freeCashFlow;  // string |  (optional) 
            var ids = FDS-US,AMZN-US;  // string | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional) 
            var portfolios = "portfolios_example";  // string | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional) 
            var themes = "themes_example";  // string | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional) 
            var categories = "categories_example";  // string | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional) 
            var userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional) 
            var sort = -userRelevanceScore,-eventDate;  // string | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional) 

            try
            {
                EventAdaptiveCards result = apiInstance.GetEventAdaptiveCards(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventAdaptiveCards: " + e.Message );
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **string**|  | [optional] 
 **ids** | **string**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **string**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **string**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **string**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **string**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 

### Return type
[**EventAdaptiveCards**](EventAdaptiveCards.md)

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
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geteventdetailbyid"></a>
# **GetEventDetailById**
> EventDetail GetEventDetailById (Guid eventId)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventDetailByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventId = "eventId_example";  // Guid | The UUID of the event to return.

            try
            {
                EventDetail result = apiInstance.GetEventDetailById(eventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventDetailById: " + e.Message );
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
 **eventId** | **Guid**| The UUID of the event to return. | 

### Return type
[**EventDetail**](EventDetail.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geteventdetails"></a>
# **GetEventDetails**
> EventDetails GetEventDetails (DateTimeInterval created = null, DateTimeInterval updated = null, string signalIds = null, string ids = null, string portfolios = null, string themes = null, string categories = null, RelevanceScoreRange userRelevanceScore = null, string sort = null)



Fetch Signals event headlines plus all additional event details based on the filtering criteria

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventDetailsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var created = new DateTimeInterval(); // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional) 
            var updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional) 
            var signalIds = dilutionTrigger,freeCashFlow;  // string |  (optional) 
            var ids = FDS-US,AMZN-US;  // string | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional) 
            var portfolios = "portfolios_example";  // string | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional) 
            var themes = "themes_example";  // string | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional) 
            var categories = "categories_example";  // string | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional) 
            var userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional) 
            var sort = -userRelevanceScore,-eventDate;  // string | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional) 

            try
            {
                EventDetails result = apiInstance.GetEventDetails(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventDetails: " + e.Message );
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **string**|  | [optional] 
 **ids** | **string**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **string**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **string**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **string**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **string**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 

### Return type
[**EventDetails**](EventDetails.md)

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
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getevententities"></a>
# **GetEventEntities**
> EventsEntities GetEventEntities (DateTimeInterval created = null, DateTimeInterval updated = null, string signalIds = null, string themes = null, string categories = null, RelevanceScoreRange userRelevanceScore = null)



Fetch FactSet entity IDs for events that match the filtering criteria

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventEntitiesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var created = new DateTimeInterval(); // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional) 
            var updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional) 
            var signalIds = dilutionTrigger,freeCashFlow;  // string |  (optional) 
            var themes = "themes_example";  // string | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional) 
            var categories = "categories_example";  // string | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional) 
            var userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional) 

            try
            {
                EventsEntities result = apiInstance.GetEventEntities(created, updated, signalIds, themes, categories, userRelevanceScore);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventEntities: " + e.Message );
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **string**|  | [optional] 
 **themes** | **string**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **string**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional] 

### Return type
[**EventsEntities**](EventsEntities.md)

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
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="geteventheadlines"></a>
# **GetEventHeadlines**
> EventHeadlines GetEventHeadlines (DateTimeInterval created = null, DateTimeInterval updated = null, string signalIds = null, string ids = null, string portfolios = null, string themes = null, string categories = null, RelevanceScoreRange userRelevanceScore = null, string sort = null)



Fetch Signals event headlines based on the filtering criteria

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class GetEventHeadlinesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var created = new DateTimeInterval(); // DateTimeInterval | A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. (optional) 
            var updated = new DateTimeInterval(); // DateTimeInterval | A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. (optional) 
            var signalIds = dilutionTrigger,freeCashFlow;  // string |  (optional) 
            var ids = FDS-US,AMZN-US;  // string | Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. (optional) 
            var portfolios = "portfolios_example";  // string | Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb (optional) 
            var themes = "themes_example";  // string | Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. (optional) 
            var categories = "categories_example";  // string | Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. (optional) 
            var userRelevanceScore = new RelevanceScoreRange(); // RelevanceScoreRange | A range for filtering signal events based on their relevancy score. (optional) 
            var sort = -userRelevanceScore,-eventDate;  // string | Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). (optional) 

            try
            {
                EventHeadlines result = apiInstance.GetEventHeadlines(created, updated, signalIds, ids, portfolios, themes, categories, userRelevanceScore, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.GetEventHeadlines: " + e.Message );
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
 **created** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time (UTC) interval for filtering signal events based on their creation date. Defaults to NOW - 7 days if omitted. | [optional] 
 **updated** | [**DateTimeInterval**](DateTimeInterval.md)| A date/time interval (UTC) for filtering signal events based on their last updated date. Defaults to NOW - 7 days if omitted. | [optional] 
 **signalIds** | **string**|  | [optional] 
 **ids** | **string**| Comma delimited string of identifiers. An identifier can be a ticker, FactSet entity id, CUSIP or ISIN. You must provide a list of identifiers either via a ids or a portfolios parameter. If both are provided, only ids filter is used. | [optional] 
 **portfolios** | **string**| Name of a portfolio file stored by FactSet. If the portfolio contains more than 1,000 ids, only the first 1,000 ids are processed. e.g. client:techstocks.ofdb | [optional] 
 **themes** | **string**| Comma delimited string of theme ids. Full list of signal themes can be viewed at /themes. | [optional] 
 **categories** | **string**| Comma delimited string of category ids. Full list of signal categories can be viewed at /categories. | [optional] 
 **userRelevanceScore** | [**RelevanceScoreRange**](RelevanceScoreRange.md)| A range for filtering signal events based on their relevancy score. | [optional] 
 **sort** | **string**| Comma delimited string of sortable attributes. The sort order for each sort attribute is ascending unless it is prefixed with a minus sign, in which case it is descending. If sort is not provided, the default sort applied is -userRelevanceScore (userRelevanceScore in descending order). | [optional] 

### Return type
[**EventHeadlines**](EventHeadlines.md)

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
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="posteventdetails"></a>
# **PostEventDetails**
> EventDetails PostEventDetails (EventRequestBody eventRequestBody)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class PostEventDetailsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventRequestBody = new EventRequestBody(); // EventRequestBody | 

            try
            {
                EventDetails result = apiInstance.PostEventDetails(eventRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.PostEventDetails: " + e.Message );
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  | 

### Return type
[**EventDetails**](EventDetails.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="posteventheadlines"></a>
# **PostEventHeadlines**
> EventHeadlines PostEventHeadlines (EventRequestBody eventRequestBody)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class PostEventHeadlinesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventRequestBody = new EventRequestBody(); // EventRequestBody | 

            try
            {
                EventHeadlines result = apiInstance.PostEventHeadlines(eventRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.PostEventHeadlines: " + e.Message );
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
 **eventRequestBody** | [**EventRequestBody**](EventRequestBody.md)|  | 

### Return type
[**EventHeadlines**](EventHeadlines.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

