# FactSet.SDK.FactSetFundamentals.Api.FactSetFundamentalsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFdsFundamentalsForList**](FactSetFundamentalsApi.md#getfdsfundamentalsforlist) | **POST** /fundamentals | Returns Company Fundamental Data.



<a name="getfdsfundamentalsforlist"></a>
# **GetFdsFundamentalsForList**
> FundamentalsResponse GetFdsFundamentalsForList (FundamentalsRequest fundamentalsRequest)

Returns Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for specified securities. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.   The ```/fundamentals``` endpoint currently supports Long Running asynchronous requests up to **20 minutes** via batch parameter. Id limits are increased to 30000 ids per request when using batch capability. This 30000 id limit has been derived based on single metric for one day. This feature is available for all users.  

### Example
```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentals.Api;
using FactSet.SDK.FactSetFundamentals.Client;
using FactSet.SDK.FactSetFundamentals.Model;

namespace Example
{
    public class GetFdsFundamentalsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentals.Client.Configuration();

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

            var apiInstance = new FactSetFundamentalsApi(config);

            var fundamentalsRequest = new FundamentalsRequest(); // FundamentalsRequest | Request object for requesting fundamentals data

            try
            {
                // Returns Company Fundamental Data.
                FactSetFundamentalsApi.GetFdsFundamentalsForListResponseWrapper result = apiInstance.GetFdsFundamentalsForList(fundamentalsRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetFundamentalsApi.GetFdsFundamentalsForList: " + e.Message );
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
 **fundamentalsRequest** | [**FundamentalsRequest**](FundamentalsRequest.md)| Request object for requesting fundamentals data | 

### Return type
GetFdsFundamentalsForListResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fundamental data items |  -  |
| **202** | Batch request has been accepted. |  * Location - Path to Batch Request result. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


