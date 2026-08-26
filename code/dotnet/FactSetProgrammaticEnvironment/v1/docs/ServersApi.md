# FactSet.SDK.FactSetProgrammaticEnvironment.Api.ServersApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**StopServer**](ServersApi.md#stopserver) | **DELETE** /servers | Stop the caller&#39;s API server



<a name="stopserver"></a>
# **StopServer**
> void StopServer ()

Stop the caller's API server

Stops the user's underlying API server so that a subsequent calculation request starts a fresh server that picks up any recent configuration changes. This is a fire-and-forget stop: no new server is started synchronously. A new server is created automatically on the next calculation request. Warning: this will terminate any calculations that are currently running on that server.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetProgrammaticEnvironment.Api;
using FactSet.SDK.FactSetProgrammaticEnvironment.Client;
using FactSet.SDK.FactSetProgrammaticEnvironment.Model;

namespace Example
{
    public class StopServerExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetProgrammaticEnvironment.Client.Configuration();

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

            var apiInstance = new ServersApi(config);


            try
            {
                // Stop the caller's API server
                apiInstance.StopServer();
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ServersApi.StopServer: " + e.Message );
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
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Server stop request accepted. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **401** | Missing or invalid authentication credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **403** | Caller is not entitled to access this resource. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **404** | No server found to stop. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
| **503** | Service temporarily unavailable. Retry the request later. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


