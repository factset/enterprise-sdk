# FactSet.SDK.ExchangeDataFeedDataModel.Api.FactSetProductCodesApi

All URIs are relative to *https://api.factset.com/RTDataModel*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetProducts**](FactSetProductCodesApi.md#getproducts) | **GET** /products | Request the enumeration table for FactSet product codes.


<a name="getproducts"></a>
# **GetProducts**
> RTDataModelProducts GetProducts (string format = null)

Request the enumeration table for FactSet product codes.

 Data can be returned in CSV, JSON or XML format, use the `format` parameter to chnage from the default JSON format.    '*You must be logged into the Developer Portal and obtain an **[API Key](https://developer.factset.com/factset/api-key-listing)** for ''Try it Out'' to receive a successful server response. Select **Authorize** button or visit **[Authentication Support](https://developer.factset.com/authentication)** for more details.*' 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ExchangeDataFeedDataModel.Api;
using FactSet.SDK.ExchangeDataFeedDataModel.Client;
using FactSet.SDK.ExchangeDataFeedDataModel.Model;

namespace Example
{
    public class GetProductsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ExchangeDataFeedDataModel.Client.Configuration();

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

            var apiInstance = new FactSetProductCodesApi(config);

            var format = "xml";  // string | The format of the output file.<p>**Try it Out** - All formats available</p> (optional)  (default to json)

            try
            {
                // Request the enumeration table for FactSet product codes.
                RTDataModelProducts result = apiInstance.GetProducts(format);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FactSetProductCodesApi.GetProducts: " + e.Message );
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
 **format** | **string**| The format of the output file.&lt;p&gt;**Try it Out** - All formats available&lt;/p&gt; | [optional] [default to json]

### Return type
[**RTDataModelProducts**](RTDataModelProducts.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response for the FactSet product codes table |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. |  -  |
| **402** | Invalid method. |  -  |
| **404** | The provided report name is not valid. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

