# FactSet.SDK.Signals.Api.EventsApi

All URIs are relative to *https://api.factset.com/signals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEventAdaptiveCardById**](EventsApi.md#geteventadaptivecardbyid) | **GET** /events/adaptive-cards/{eventId} | 
[**GetEventDetailById**](EventsApi.md#geteventdetailbyid) | **GET** /events/details/{eventId} | 
[**PostEventAdaptiveCards**](EventsApi.md#posteventadaptivecards) | **POST** /events/adaptive-cards | 
[**PostEventDetails**](EventsApi.md#posteventdetails) | **POST** /events/details | 
[**PostEventEntities**](EventsApi.md#postevententities) | **POST** /events/entities | 
[**PostEventHeadlines**](EventsApi.md#posteventheadlines) | **POST** /events/headlines | 



<a name="geteventadaptivecardbyid"></a>
# **GetEventAdaptiveCardById**
> EventAdaptiveCard GetEventAdaptiveCardById (Guid eventId)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, for a single requested Signal event

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="geteventdetailbyid"></a>
# **GetEventDetailById**
> EventDetail GetEventDetailById (Guid eventId)



Fetch Signals event headlines plus all additional event details for a single requested Signal event

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="posteventadaptivecards"></a>
# **PostEventAdaptiveCards**
> EventAdaptiveCards PostEventAdaptiveCards (EventRequestBody eventRequestBody)



Fetch Microsoft's Adaptive Cards, which includes headlines and event details data plus hyperlinks to FactSet reports, based on at least one of the following filtering parameters: `ids`, `portfolios`

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class PostEventAdaptiveCardsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventRequestBody = new EventRequestBody(); // EventRequestBody | 

            try
            {
                EventAdaptiveCards result = apiInstance.PostEventAdaptiveCards(eventRequestBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.PostEventAdaptiveCards: " + e.Message );
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
[**EventAdaptiveCards**](EventAdaptiveCards.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="posteventdetails"></a>
# **PostEventDetails**
> EventDetails PostEventDetails (EventRequestBody eventRequestBody)



Fetch Signals event headlines plus all additional event details for up to 1000 identifiers and at least one of the following filtering parameters: `ids`, `portfolios`

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postevententities"></a>
# **PostEventEntities**
> EventsEntities PostEventEntities (EventsEntitiesPost eventsEntitiesPost)



Fetch FactSet entity IDs for events that match the filtering criteria

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Signals.Api;
using FactSet.SDK.Signals.Client;
using FactSet.SDK.Signals.Model;

namespace Example
{
    public class PostEventEntitiesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Signals.Client.Configuration();

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

            var apiInstance = new EventsApi(config);

            var eventsEntitiesPost = new EventsEntitiesPost(); // EventsEntitiesPost | 

            try
            {
                EventsEntities result = apiInstance.PostEventEntities(eventsEntitiesPost);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsApi.PostEventEntities: " + e.Message );
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
 **eventsEntitiesPost** | [**EventsEntitiesPost**](EventsEntitiesPost.md)|  | 

### Return type
[**EventsEntities**](EventsEntities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="posteventheadlines"></a>
# **PostEventHeadlines**
> EventHeadlines PostEventHeadlines (EventRequestBody eventRequestBody)



Fetch Signals event headlines based on the filtering criteria for up to 1000 identifiers and at least one of the following filtering parameters: `ids`, `portfolios`

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
| **429** | API Rate Limit Exceeded |  * Api-Version -  <br>  * Api-Supported-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


