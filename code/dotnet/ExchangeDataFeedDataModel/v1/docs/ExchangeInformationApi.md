# FactSet.SDK.ExchangeDataFeedDataModel.Api.ExchangeInformationApi

All URIs are relative to *https://api.factset.com/rtdatamodel/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetExchanges**](ExchangeInformationApi.md#getexchanges) | **GET** /exchanges | Request metadata for covered Real-Time market data venues at FactSet.



<a name="getexchanges"></a>
# **GetExchanges**
> ExchangesResponse GetExchanges (List<int> productCode = null, List<int> exchangeCode = null, List<string> isoCode = null, string format = null)

Request metadata for covered Real-Time market data venues at FactSet.

Returns a list of exchanges with details like exchange code, name, market open and close times, etc.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ExchangeDataFeedDataModel.Api;
using FactSet.SDK.ExchangeDataFeedDataModel.Client;
using FactSet.SDK.ExchangeDataFeedDataModel.Model;

namespace Example
{
    public class GetExchangesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ExchangeDataFeedDataModel.Client.Configuration();

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

            var apiInstance = new ExchangeInformationApi(config);

            var productCode = new List<int>(); // List<int> | Allows filtering of specific product codes in the response. (optional) 
            var exchangeCode = new List<int>(); // List<int> | Allows filtering of specific exchange codes in the response. (optional) 
            var isoCode = new List<string>(); // List<string> | Allows filtering on specific ISO code in the response. (optional) 
            var format = "json";  // string | The format of the output file. (optional) 

            try
            {
                // Request metadata for covered Real-Time market data venues at FactSet.
                ExchangesResponse result = apiInstance.GetExchanges(productCode, exchangeCode, isoCode, format);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ExchangeInformationApi.GetExchanges: " + e.Message );
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
 **productCode** | [**List&lt;int&gt;**](int.md)| Allows filtering of specific product codes in the response. | [optional] 
 **exchangeCode** | [**List&lt;int&gt;**](int.md)| Allows filtering of specific exchange codes in the response. | [optional] 
 **isoCode** | [**List&lt;string&gt;**](string.md)| Allows filtering on specific ISO code in the response. | [optional] 
 **format** | **string**| The format of the output file. | [optional] 

### Return type
[**ExchangesResponse**](ExchangesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response with a list of exchanges |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API key for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **402** | Invalid HTTP method. Either the method is not GET or exceeds the maximum request length (currently set at 5000 bytes). The description field will indicate the exact reason. |  -  |
| **404** | The provided endpoint is not valid. |  -  |
| **500** | Internal Server Error. The server encountered an unexpected condition that prevented it from fulfilling the request. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


