# FactSet.SDK.OFDB.Api.CreateApi

All URIs are relative to *https://api.factset.com/analytics/ofdb*

Method | HTTP request | Description
------------- | ------------- | -------------
[**AddSymbolDate**](CreateApi.md#addsymboldate) | **POST** /v1/database/{path}/dates | 
[**AddSymbolDate3D**](CreateApi.md#addsymboldate3d) | **POST** /v1/database/{path}/dates/{date}/symbols | 
[**AddSymbols**](CreateApi.md#addsymbols) | **POST** /v1/database/{path}/symbols | 
[**CreateDatabase**](CreateApi.md#createdatabase) | **POST** /v1/database/ | 


<a name="addsymboldate"></a>
# **AddSymbolDate**
> SuccessPostResponse AddSymbolDate (string path, AddSymbolDate addSymbolDate)



Creates a new date with single/multiple symbols for a 3d database(OFDB).

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class AddSymbolDateExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new CreateApi(config);

            var path = "path_example";  // string | Encode database path
            var addSymbolDate = new AddSymbolDate(); // AddSymbolDate | Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400.

            try
            {
                SuccessPostResponse result = apiInstance.AddSymbolDate(path, addSymbolDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CreateApi.AddSymbolDate: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **addSymbolDate** | [**AddSymbolDate**](AddSymbolDate.md)| Required data for creating date in the database. At least one iterative field is required otherwise it will throw 400. | 

### Return type
[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Status message of creation |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **202** | Returns when the request is moved to long running mode. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **413** | Post body too large |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addsymboldate3d"></a>
# **AddSymbolDate3D**
> SuccessPostResponse AddSymbolDate3D (string path, int date, AddSymbolDate3D addSymbolDate3D)



Creates a new symbol for a given date in 3d database(OFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class AddSymbolDate3DExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new CreateApi(config);

            var path = "path_example";  // string | Encode database path
            var date = 56;  // int | Date in YYYYMMDD format
            var addSymbolDate3D = new AddSymbolDate3D(); // AddSymbolDate3D | Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol.

            try
            {
                SuccessPostResponse result = apiInstance.AddSymbolDate3D(path, date, addSymbolDate3D);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CreateApi.AddSymbolDate3D: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **date** | **int**| Date in YYYYMMDD format | 
 **addSymbolDate3D** | [**AddSymbolDate3D**](AddSymbolDate3D.md)| Data for creating symbol specific to a date in the database. At least one 3d field is required along with symbol. | 

### Return type
[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Status message of creation |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **202** | Returns when the request is moved to long running mode. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="addsymbols"></a>
# **AddSymbols**
> SuccessPostResponse AddSymbols (string path, AddSymbols addSymbols)



Creates a new symbol with single/multiple dates for 3d database(OFDB). Creates a symbol for 2d database(OFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class AddSymbolsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new CreateApi(config);

            var path = "path_example";  // string | Encode database path
            var addSymbols = new AddSymbols(); // AddSymbols | Data for creating symbol in the database

            try
            {
                SuccessPostResponse result = apiInstance.AddSymbols(path, addSymbols);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CreateApi.AddSymbols: " + e.Message );
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
 **path** | **string**| Encode database path | 
 **addSymbols** | [**AddSymbols**](AddSymbols.md)| Data for creating symbol in the database | 

### Return type
[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Status message of creation |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **202** | Returns when the request is moved to long running mode. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **413** | Post body too large |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="createdatabase"></a>
# **CreateDatabase**
> AddDatabase CreateDatabase (DatabaseSchema databaseSchema = null)



Creates a 2d or 3d database(OFDB)

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OFDB.Api;
using FactSet.SDK.OFDB.Client;
using FactSet.SDK.OFDB.Model;

namespace Example
{
    public class CreateDatabaseExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OFDB.Client.Configuration();

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

            var apiInstance = new CreateApi(config);

            var databaseSchema = new DatabaseSchema(); // DatabaseSchema |  (optional) 

            try
            {
                AddDatabase result = apiInstance.CreateDatabase(databaseSchema);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CreateApi.CreateDatabase: " + e.Message );
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
 **databaseSchema** | [**DatabaseSchema**](DatabaseSchema.md)|  | [optional] 

### Return type
[**AddDatabase**](AddDatabase.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Creates and responds with ofdb path |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **202** | Returns when the request is moved to long running mode. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
| **503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

