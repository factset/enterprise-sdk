# FactSet.SDK.FactSetRBICS.Api.TradeNamesApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTradeNamesForList**](TradeNamesApi.md#gettradenamesforlist) | **POST** /factset-rbics/v1/trade-names | Get a company&#39;s associated tradeNames and product lines.



<a name="gettradenamesforlist"></a>
# **GetTradeNamesForList**
> TradeNamesResponse GetTradeNamesForList (TradeNamesRequest tradeNamesRequest)

Get a company's associated tradeNames and product lines.

RBICS with TradeNames maps over 260,000 products, services and brands (a.k.a. TradeNames) to the granular sectors of the FactSet Revere Business Industry Classification System taxonomy, resulting in a multi-sector participation map for each company.   Whereas RBICS with Revenue offers quantified multi-sector exposure based on a company’s segment disclosures, RBICS with TradeNames provides a comprehensive view of sector participation at the product level. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetRBICS.Api;
using FactSet.SDK.FactSetRBICS.Client;
using FactSet.SDK.FactSetRBICS.Model;

namespace Example
{
    public class GetTradeNamesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetRBICS.Client.Configuration();

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

            var apiInstance = new TradeNamesApi(config);

            var tradeNamesRequest = new TradeNamesRequest(); // TradeNamesRequest | Request Body to request a list of tradeName objects.

            try
            {
                // Get a company's associated tradeNames and product lines.
                TradeNamesResponse result = apiInstance.GetTradeNamesForList(tradeNamesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TradeNamesApi.GetTradeNamesForList: " + e.Message );
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
 **tradeNamesRequest** | [**TradeNamesRequest**](TradeNamesRequest.md)| Request Body to request a list of tradeName objects. | 

### Return type
[**TradeNamesResponse**](TradeNamesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of RBICS Tradename Objects |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


