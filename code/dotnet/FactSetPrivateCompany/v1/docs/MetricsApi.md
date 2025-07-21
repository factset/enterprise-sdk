# FactSet.SDK.FactSetPrivateCompany.Api.MetricsApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetMetrics**](MetricsApi.md#getmetrics) | **GET** /metrics | Returns available private company metrics, and ratios.



<a name="getmetrics"></a>
# **GetMetrics**
> MetricsResponse GetMetrics (string category = null)

Returns available private company metrics, and ratios.

Returns list of available Private Company metrics, and ratios that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Private Company standardized data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateCompany.Api;
using FactSet.SDK.FactSetPrivateCompany.Client;
using FactSet.SDK.FactSetPrivateCompany.Model;

namespace Example
{
    public class GetMetricsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateCompany.Client.Configuration();

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

            var apiInstance = new MetricsApi(config);

            var category = "FINANCIALS";  // string | Filters the list of available metrics per endpoint  - </br>   * **FINANCIALS** = Financials endpoint data items, such as Assets, Liabilities, and EBITDA. </br>   * **NON_PERIODIC** = Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List.  (optional) 

            try
            {
                // Returns available private company metrics, and ratios.
                MetricsResponse result = apiInstance.GetMetrics(category);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling MetricsApi.GetMetrics: " + e.Message );
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
 **category** | **string**| Filters the list of available metrics per endpoint  - &lt;/br&gt;   * **FINANCIALS** &#x3D; Financials endpoint data items, such as Assets, Liabilities, and EBITDA. &lt;/br&gt;   * **NON_PERIODIC** &#x3D; Non-Periodic endpoint data items, such as ISO Currency, Current CEO, and Investor List.  | [optional] 

### Return type
[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Private Company data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


