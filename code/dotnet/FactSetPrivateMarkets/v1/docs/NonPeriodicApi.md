# FactSet.SDK.FactSetPrivateMarkets.Api.NonPeriodicApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetNonPeriodic**](NonPeriodicApi.md#getnonperiodic) | **GET** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.
[**GetNonPeriodicForList**](NonPeriodicApi.md#getnonperiodicforlist) | **POST** /factset-private-markets/v1/non-periodic | Returns Private Company reference data for a list of ids.



<a name="getnonperiodic"></a>
# **GetNonPeriodic**
> NonPeriodicResponse GetNonPeriodic (List<string> ids, List<string> fields)

Returns Private Company reference data for a list of ids.

Returns Private Company reference information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateMarkets.Api;
using FactSet.SDK.FactSetPrivateMarkets.Client;
using FactSet.SDK.FactSetPrivateMarkets.Model;

namespace Example
{
    public class GetNonPeriodicExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateMarkets.Client.Configuration();

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

            var apiInstance = new NonPeriodicApi(config);

            var ids = new List<string>(); // List<string> | The requested FactSet Private Market Entity Identifier in XXXXXX-E format.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
            var fields = new List<string>(); // List<string> | Private Markets Non-Periodic Fields. 

            try
            {
                // Returns Private Company reference data for a list of ids.
                NonPeriodicResponse result = apiInstance.GetNonPeriodic(ids, fields);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NonPeriodicApi.GetNonPeriodic: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested FactSet Private Market Entity Identifier in XXXXXX-E format.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **fields** | [**List&lt;string&gt;**](string.md)| Private Markets Non-Periodic Fields.  | 

### Return type
[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Private Company reference data for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getnonperiodicforlist"></a>
# **GetNonPeriodicForList**
> NonPeriodicResponse GetNonPeriodicForList (NonPeriodicRequest nonPeriodicRequest)

Returns Private Company reference data for a list of ids.

Returns a private markets reference object for the requested ids. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateMarkets.Api;
using FactSet.SDK.FactSetPrivateMarkets.Client;
using FactSet.SDK.FactSetPrivateMarkets.Model;

namespace Example
{
    public class GetNonPeriodicForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateMarkets.Client.Configuration();

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

            var apiInstance = new NonPeriodicApi(config);

            var nonPeriodicRequest = new NonPeriodicRequest(); // NonPeriodicRequest | Request Body to request a list of Private Market non-periodic objects.

            try
            {
                // Returns Private Company reference data for a list of ids.
                NonPeriodicResponse result = apiInstance.GetNonPeriodicForList(nonPeriodicRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling NonPeriodicApi.GetNonPeriodicForList: " + e.Message );
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
 **nonPeriodicRequest** | [**NonPeriodicRequest**](NonPeriodicRequest.md)| Request Body to request a list of Private Market non-periodic objects. | 

### Return type
[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Private Company Reference data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


