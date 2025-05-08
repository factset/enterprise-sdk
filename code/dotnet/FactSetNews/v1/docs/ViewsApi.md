# FactSet.SDK.FactSetNews.Api.ViewsApi

All URIs are relative to *https://api.factset.com/content/news/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateFactSetNewsView**](ViewsApi.md#createfactsetnewsview) | **POST** /views/create | Creates and saves a FactSet News view
[**CreateQuickAlertForView**](ViewsApi.md#createquickalertforview) | **POST** /quick-alert/create | Creates a quick-alert for given saved view
[**DeleteQuickalertView**](ViewsApi.md#deletequickalertview) | **POST** /quick-alert/delete | Deletes an existing quick alert for a view.
[**DeleteView**](ViewsApi.md#deleteview) | **POST** /views/delete | Deletes an existing App view
[**EditFactSetNewsView**](ViewsApi.md#editfactsetnewsview) | **POST** /views/update | Edit an existing FactSet News view with filters specified
[**GetFactSetNewsViews**](ViewsApi.md#getfactsetnewsviews) | **GET** /views | Retrieves a list of search views created in News app



<a name="createfactsetnewsview"></a>
# **CreateFactSetNewsView**
> CreateViewResponse CreateFactSetNewsView (CreateOrEditViewBody createOrEditViewBody = null)

Creates and saves a FactSet News view

This endpoint allows you to create a new FactSet News view. Select watchlists/tickers and filters of your choice to create and save a view. Please refer to `/filters` endpoint to obtain the values.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class CreateFactSetNewsViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);

            var createOrEditViewBody = new CreateOrEditViewBody(); // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request. (optional) 

            try
            {
                // Creates and saves a FactSet News view
                CreateViewResponse result = apiInstance.CreateFactSetNewsView(createOrEditViewBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.CreateFactSetNewsView: " + e.Message );
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
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request. | [optional] 

### Return type
[**CreateViewResponse**](CreateViewResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="createquickalertforview"></a>
# **CreateQuickAlertForView**
> QuickAlertsResponse CreateQuickAlertForView (QuickAlertsBody quickAlertsBody = null)

Creates a quick-alert for given saved view

This endpoint takes in a view name and provides realtime email updates on new stories coming in for the view. Only one quick alert can be enabled for a view at a time.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class CreateQuickAlertForViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);

            var quickAlertsBody = new QuickAlertsBody(); // QuickAlertsBody | View name to get an alert. (optional) 

            try
            {
                // Creates a quick-alert for given saved view
                QuickAlertsResponse result = apiInstance.CreateQuickAlertForView(quickAlertsBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.CreateQuickAlertForView: " + e.Message );
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
 **quickAlertsBody** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert. | [optional] 

### Return type
[**QuickAlertsResponse**](QuickAlertsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletequickalertview"></a>
# **DeleteQuickalertView**
> void DeleteQuickalertView (QuickAlertsBody quickAlertsBody = null)

Deletes an existing quick alert for a view.

This endpoint allows you to delete a quick alert from a previously saved view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class DeleteQuickalertViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);

            var quickAlertsBody = new QuickAlertsBody(); // QuickAlertsBody | View name to get an alert. (optional) 

            try
            {
                // Deletes an existing quick alert for a view.
                apiInstance.DeleteQuickalertView(quickAlertsBody);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.DeleteQuickalertView: " + e.Message );
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
 **quickAlertsBody** | [**QuickAlertsBody**](QuickAlertsBody.md)| View name to get an alert. | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Quick alert deleted. |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deleteview"></a>
# **DeleteView**
> void DeleteView (DeleteViewBody deleteViewBody = null)

Deletes an existing App view

This endpoint allows you to delete a previously saved view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class DeleteViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);

            var deleteViewBody = new DeleteViewBody(); // DeleteViewBody | Delete View Body which needs to be sent with request. (optional) 

            try
            {
                // Deletes an existing App view
                apiInstance.DeleteView(deleteViewBody);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.DeleteView: " + e.Message );
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
 **deleteViewBody** | [**DeleteViewBody**](DeleteViewBody.md)| Delete View Body which needs to be sent with request. | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="editfactsetnewsview"></a>
# **EditFactSetNewsView**
> void EditFactSetNewsView (CreateOrEditViewBody createOrEditViewBody = null)

Edit an existing FactSet News view with filters specified

This endpoint allows you to edit the criteria used for a previously saved FactSet News view.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class EditFactSetNewsViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);

            var createOrEditViewBody = new CreateOrEditViewBody(); // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request. (optional) 

            try
            {
                // Edit an existing FactSet News view with filters specified
                apiInstance.EditFactSetNewsView(createOrEditViewBody);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.EditFactSetNewsView: " + e.Message );
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
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request. | [optional] 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthenticated |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfactsetnewsviews"></a>
# **GetFactSetNewsViews**
> Views GetFactSetNewsViews ()

Retrieves a list of search views created in News app

This endpoint allows you to pull the full list of app views that have been previously saved.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetNews.Api;
using FactSet.SDK.FactSetNews.Client;
using FactSet.SDK.FactSetNews.Model;

namespace Example
{
    public class GetFactSetNewsViewsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetNews.Client.Configuration();

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

            var apiInstance = new ViewsApi(config);


            try
            {
                // Retrieves a list of search views created in News app
                Views result = apiInstance.GetFactSetNewsViews();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.GetFactSetNewsViews: " + e.Message );
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
[**Views**](Views.md)

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
| **401** | Unauthenticated |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


