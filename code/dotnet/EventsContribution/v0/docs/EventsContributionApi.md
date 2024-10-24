# FactSet.SDK.EventsContribution.Api.EventsContributionApi

All URIs are relative to *https://api.factset.com/events-contribution/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**DeleteEvent**](EventsContributionApi.md#deleteevent) | **DELETE** /events/{eventId} | Delete Event data
[**GetEvent**](EventsContributionApi.md#getevent) | **GET** /events/{eventId} | Get Event Data
[**InsertEvent**](EventsContributionApi.md#insertevent) | **POST** /events | Insert Event data
[**UpdateEvent**](EventsContributionApi.md#updateevent) | **PUT** /events/{eventId} | Update Event data



<a name="deleteevent"></a>
# **DeleteEvent**
> DeleteResponse DeleteEvent (string eventId)

Delete Event data

This endpoint allows you to delete a previously inserted event with the corresponding event id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsContribution.Api;
using FactSet.SDK.EventsContribution.Client;
using FactSet.SDK.EventsContribution.Model;

namespace Example
{
    public class DeleteEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsContribution.Client.Configuration();

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

            var apiInstance = new EventsContributionApi(config);

            var eventId = "1234";  // string | ID of event to be deleted. This ID is vendor generated and should be unique in each vendor's content set.

            try
            {
                // Delete Event data
                DeleteResponse result = apiInstance.DeleteEvent(eventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsContributionApi.DeleteEvent: " + e.Message );
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
 **eventId** | **string**| ID of event to be deleted. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 

### Return type
[**DeleteResponse**](DeleteResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getevent"></a>
# **GetEvent**
> GetResponse GetEvent (string eventId)

Get Event Data

This endpoint retrieves previously submitted events by event ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsContribution.Api;
using FactSet.SDK.EventsContribution.Client;
using FactSet.SDK.EventsContribution.Model;

namespace Example
{
    public class GetEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsContribution.Client.Configuration();

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

            var apiInstance = new EventsContributionApi(config);

            var eventId = "eventId_example";  // string | ID for event retrieval. This ID is vendor generated and should be unique in each vendor's content set.

            try
            {
                // Get Event Data
                GetResponse result = apiInstance.GetEvent(eventId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsContributionApi.GetEvent: " + e.Message );
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
 **eventId** | **string**| ID for event retrieval. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 

### Return type
[**GetResponse**](GetResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request. Invalid Parameter. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="insertevent"></a>
# **InsertEvent**
> InsertResponse InsertEvent (InsertRequest insertRequest)

Insert Event data

This endpoint inserts an event. Once the event is inserted, it will show up immediately among FactSet’s own event calendar apps, for display within FactSet’s applications.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsContribution.Api;
using FactSet.SDK.EventsContribution.Client;
using FactSet.SDK.EventsContribution.Model;

namespace Example
{
    public class InsertEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsContribution.Client.Configuration();

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

            var apiInstance = new EventsContributionApi(config);

            var insertRequest = new InsertRequest(); // InsertRequest | INSERT request body which needs to be sent with request

            try
            {
                // Insert Event data
                InsertResponse result = apiInstance.InsertEvent(insertRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsContributionApi.InsertEvent: " + e.Message );
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
 **insertRequest** | [**InsertRequest**](InsertRequest.md)| INSERT request body which needs to be sent with request | 

### Return type
[**InsertResponse**](InsertResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="updateevent"></a>
# **UpdateEvent**
> UpdateResponse UpdateEvent (string eventId, UpdateRequest updateRequest)

Update Event data

This endpoint allows you to update a previously inserted event. Existing event will be replaced with the event data provided in the request body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventsContribution.Api;
using FactSet.SDK.EventsContribution.Client;
using FactSet.SDK.EventsContribution.Model;

namespace Example
{
    public class UpdateEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventsContribution.Client.Configuration();

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

            var apiInstance = new EventsContributionApi(config);

            var eventId = "1234";  // string | ID of event to be updated. This ID is vendor generated and should be unique in each vendor's content set.
            var updateRequest = new UpdateRequest(); // UpdateRequest | UPDATE request body which needs to be sent with request

            try
            {
                // Update Event data
                UpdateResponse result = apiInstance.UpdateEvent(eventId, updateRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EventsContributionApi.UpdateEvent: " + e.Message );
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
 **eventId** | **string**| ID of event to be updated. This ID is vendor generated and should be unique in each vendor&#39;s content set. | 
 **updateRequest** | [**UpdateRequest**](UpdateRequest.md)| UPDATE request body which needs to be sent with request | 

### Return type
[**UpdateResponse**](UpdateResponse.md)

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
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


