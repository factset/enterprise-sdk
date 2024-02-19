# FactSet.SDK.AnalyticsDatastore.Api.MappingsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetInsightMapping**](MappingsApi.md#getinsightmapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{configId}/{date} | Redirects to the underlying Insight/Vault data in a Stach format.
[**GetPdfPptMapping**](MappingsApi.md#getpdfpptmapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{accountId}/{date} | Redirects to the raw PPT/PDF output created by the Publisher service.
[**GetStachMapping**](MappingsApi.md#getstachmapping) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId}/{date} | Redirects to the underlying PA/SPAR data represented in a Stach format.
[**GetStachMappingNoDate**](MappingsApi.md#getstachmappingnodate) | **GET** /analytics/pub-datastore/swivel/v1/{document}/{assetName}/{reportId}/{tileId}/{accountId} | Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.



<a name="getinsightmapping"></a>
# **GetInsightMapping**
> void GetInsightMapping (string document, string assetName, string reportId, string tileId, string accountId, string configId, DateTime date)

Redirects to the underlying Insight/Vault data in a Stach format.

The inclusion of a configId in the path indicates this is for Insight/Vault mappings only, as PA/SPAR mappings do not support the concept of configuration id.    Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetInsightMappingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new MappingsApi(config);

            var document = "Analytics_Datastore";  // string | The Analytics Datafeed document containing the report
            var assetName = "ADS_Demo.PA3";  // string | The PA/SPAR asset name and extension
            var reportId = "report7";  // string | The PA/SPAR report ID
            var tileId = "tile0";  // string | The PA/SPAR tile ID
            var accountId = "LARGE_CORE";  // string | The account ID
            var configId = "acb5150d-4333-49e7-8e33-4f7fa749691e";  // string | The Vault configuration ID
            var date = DateTime.Parse("2023-01-01");  // DateTime | The as of date for the report

            try
            {
                // Redirects to the underlying Insight/Vault data in a Stach format.
                apiInstance.GetInsightMapping(document, assetName, reportId, tileId, accountId, configId, date);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MappingsApi.GetInsightMapping: " + e.Message );
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
 **document** | **string**| The Analytics Datafeed document containing the report | 
 **assetName** | **string**| The PA/SPAR asset name and extension | 
 **reportId** | **string**| The PA/SPAR report ID | 
 **tileId** | **string**| The PA/SPAR tile ID | 
 **accountId** | **string**| The account ID | 
 **configId** | **string**| The Vault configuration ID | 
 **date** | **DateTime**| The as of date for the report | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpdfpptmapping"></a>
# **GetPdfPptMapping**
> void GetPdfPptMapping (string document, string accountId, DateTime date)

Redirects to the raw PPT/PDF output created by the Publisher service.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetPdfPptMappingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new MappingsApi(config);

            var document = "Analytics_Datastore";  // string | The Publisher document containing the report
            var accountId = "LARGE_CORE";  // string | The account ID
            var date = DateTime.Parse("2023-01-01");  // DateTime | The as of date for the report

            try
            {
                // Redirects to the raw PPT/PDF output created by the Publisher service.
                apiInstance.GetPdfPptMapping(document, accountId, date);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MappingsApi.GetPdfPptMapping: " + e.Message );
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
 **document** | **string**| The Publisher document containing the report | 
 **accountId** | **string**| The account ID | 
 **date** | **DateTime**| The as of date for the report | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstachmapping"></a>
# **GetStachMapping**
> void GetStachMapping (string document, string assetName, string reportId, string tileId, string accountId, DateTime date)

Redirects to the underlying PA/SPAR data represented in a Stach format.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetStachMappingExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new MappingsApi(config);

            var document = "Analytics_Datastore";  // string | The Publisher or Analytics Datafeed document containing the report
            var assetName = "ADS_Demo.PA3";  // string | The PA/SPAR asset name and extension
            var reportId = "report7";  // string | The PA/SPAR report ID
            var tileId = "tile0";  // string | The PA/SPAR tile ID
            var accountId = "LARGE_CORE";  // string | The account ID
            var date = DateTime.Parse("2023-01-01");  // DateTime | The as of date for the report

            try
            {
                // Redirects to the underlying PA/SPAR data represented in a Stach format.
                apiInstance.GetStachMapping(document, assetName, reportId, tileId, accountId, date);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MappingsApi.GetStachMapping: " + e.Message );
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
 **document** | **string**| The Publisher or Analytics Datafeed document containing the report | 
 **assetName** | **string**| The PA/SPAR asset name and extension | 
 **reportId** | **string**| The PA/SPAR report ID | 
 **tileId** | **string**| The PA/SPAR tile ID | 
 **accountId** | **string**| The account ID | 
 **date** | **DateTime**| The as of date for the report | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getstachmappingnodate"></a>
# **GetStachMappingNoDate**
> void GetStachMappingNoDate (string document, string assetName, string reportId, string tileId, string accountId)

Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.

Takes report parameter inputs and returns the object location for the specified report via a 302 redirect.    Note: Due to Swagger UI functionality, the redirect is automatically followed when using 'Try it out', so instead of the 302 Header response, a 200 is returned with the Cargo response Body.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.AnalyticsDatastore.Api;
using FactSet.SDK.AnalyticsDatastore.Client;
using FactSet.SDK.AnalyticsDatastore.Model;

namespace Example
{
    public class GetStachMappingNoDateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.AnalyticsDatastore.Client.Configuration();

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

            var apiInstance = new MappingsApi(config);

            var document = "Analytics_Datastore";  // string | The Publisher or Analytics Datafeed document containing the report
            var assetName = "ADS_Demo.PA3";  // string | The PA/SPAR asset name and extension
            var reportId = "report7";  // string | The PA/SPAR report ID
            var tileId = "tile0";  // string | The PA/SPAR tile ID
            var accountId = "LARGE_CORE";  // string | The account ID

            try
            {
                // Redirects to the underlying PA/SPAR data represented in a Stach format, with no as of date specified.
                apiInstance.GetStachMappingNoDate(document, assetName, reportId, tileId, accountId);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MappingsApi.GetStachMappingNoDate: " + e.Message );
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
 **document** | **string**| The Publisher or Analytics Datafeed document containing the report | 
 **assetName** | **string**| The PA/SPAR asset name and extension | 
 **reportId** | **string**| The PA/SPAR report ID | 
 **tileId** | **string**| The PA/SPAR tile ID | 
 **accountId** | **string**| The account ID | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **302** | Expected response, contains the Cargo URL in the Location header. |  * Location - Redirect URL to get Cargo object.    (example: https://api.factset.com/analytics/datastore/cargo/v1/groups/a4186c50f8e74f979d271dd22298c901/objects/fe875bc4150542dea6bc237663a01a0d) <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
| **503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


