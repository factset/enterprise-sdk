# FactSet.SDK.StreetAccountNews.Api.ViewsApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**CreateStreetAccountView**](ViewsApi.md#createstreetaccountview) | **POST** /streetaccount/views/{id} | Creates and saves a StreetAccount view
[**DeleteStreetAccountView**](ViewsApi.md#deletestreetaccountview) | **DELETE** /streetaccount/views/{id} | Deletes an existing StreetAccount view
[**EditStreetAccountView**](ViewsApi.md#editstreetaccountview) | **PUT** /streetaccount/views/{id} | Edits and saves an existing StreetAccount view
[**GetStreetAccountViews**](ViewsApi.md#getstreetaccountviews) | **GET** /streetaccount/views | Retrieves StreetAccount search views



<a name="createstreetaccountview"></a>
# **CreateStreetAccountView**
> CreateEditDeleteViewResponse CreateStreetAccountView (string id, CreateOrEditViewBody createOrEditViewBody = null)

Creates and saves a StreetAccount view

This endpoint allows you to create a new StreetAccount view. Select watchlists/tickers and filters of your choice to create and save a view.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class CreateStreetAccountViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var id = "SA News View";  // string | view id of the view which is the be created
            var createOrEditViewBody = new CreateOrEditViewBody(); // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional) 

            try
            {
                // Creates and saves a StreetAccount view
                CreateEditDeleteViewResponse result = apiInstance.CreateStreetAccountView(id, createOrEditViewBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.CreateStreetAccountView: " + e.Message );
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
 **id** | **string**| view id of the view which is the be created | 
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type
[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

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
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="deletestreetaccountview"></a>
# **DeleteStreetAccountView**
> CreateEditDeleteViewResponse DeleteStreetAccountView (string id)

Deletes an existing StreetAccount view

This endpoint allows you to delete a previously saved StreetAccount view.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class DeleteStreetAccountViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var id = "SA News View";  // string | view id of the view to be deleted

            try
            {
                // Deletes an existing StreetAccount view
                CreateEditDeleteViewResponse result = apiInstance.DeleteStreetAccountView(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.DeleteStreetAccountView: " + e.Message );
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
 **id** | **string**| view id of the view to be deleted | 

### Return type
[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

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
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="editstreetaccountview"></a>
# **EditStreetAccountView**
> CreateEditDeleteViewResponse EditStreetAccountView (string id, CreateOrEditViewBody createOrEditViewBody = null)

Edits and saves an existing StreetAccount view

This endpoint allows you to edit the criteria used for a previously saved StreetAccount view.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class EditStreetAccountViewExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var id = "SA News View";  // string | view id of the view to be edited
            var createOrEditViewBody = new CreateOrEditViewBody(); // CreateOrEditViewBody | Create or Edit View Body which needs to be sent with request (optional) 

            try
            {
                // Edits and saves an existing StreetAccount view
                CreateEditDeleteViewResponse result = apiInstance.EditStreetAccountView(id, createOrEditViewBody);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.EditStreetAccountView: " + e.Message );
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
 **id** | **string**| view id of the view to be edited | 
 **createOrEditViewBody** | [**CreateOrEditViewBody**](CreateOrEditViewBody.md)| Create or Edit View Body which needs to be sent with request | [optional] 

### Return type
[**CreateEditDeleteViewResponse**](CreateEditDeleteViewResponse.md)

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
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstreetaccountviews"></a>
# **GetStreetAccountViews**
> Views GetStreetAccountViews ()

Retrieves StreetAccount search views

This endpoint allows you to pull the full list of StreetAccount views that have been previously saved.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountViewsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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
                // Retrieves StreetAccount search views
                Views result = apiInstance.GetStreetAccountViews();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ViewsApi.GetStreetAccountViews: " + e.Message );
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
| **401** | Unauthorized |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


