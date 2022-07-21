# FactSet.SDK.IRNNotes.Api.IdentifiersApi

All URIs are relative to *https://api.factset.com/research/irn*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIdentifiers**](IdentifiersApi.md#getidentifiers) | **GET** /v1/identifiers | Get all the identifier details for given identifiers


<a name="getidentifiers"></a>
# **GetIdentifiers**
> List&lt;Object&gt; GetIdentifiers (string identifiers = null)

Get all the identifier details for given identifiers

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.IRNNotes.Api;
using FactSet.SDK.IRNNotes.Client;
using FactSet.SDK.IRNNotes.Model;

namespace Example
{
    public class GetIdentifiersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.IRNNotes.Client.Configuration();

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

            var apiInstance = new IdentifiersApi(config);

            var identifiers = "identifiers_example";  // string | Identifiers (optional) 

            try
            {
                // Get all the identifier details for given identifiers
                List<Object> result = apiInstance.GetIdentifiers(identifiers);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IdentifiersApi.GetIdentifiers: " + e.Message );
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
 **identifiers** | **string**| Identifiers | [optional] 

### Return type
**List<Object>**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

