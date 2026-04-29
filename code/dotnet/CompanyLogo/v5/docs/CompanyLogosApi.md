# FactSet.SDK.CompanyLogo.Api.CompanyLogosApi

All URIs are relative to *https://api.factset.com/wealth/v5*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostCompanyLogo**](CompanyLogosApi.md#postcompanylogo) | **POST** /company/logo | Retrieves logos for one or more publicly traded companies.



<a name="postcompanylogo"></a>
# **PostCompanyLogo**
> InlineResponse200 PostCompanyLogo (PostCompanyLogoRequest postCompanyLogoRequest = null)

Retrieves logos for one or more publicly traded companies.

Retrieves high-quality logos for one or more publicly traded companies using standard identifiers (e.g., ticker symbols, ISIN). Logos are available in a selection of predefined sizes or can be generated on-the-fly to custom dimensions. The endpoint accepts up to 100 identifiers per request. Note: Requesting a large number of logos in a single call may result in increased response times.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.CompanyLogo.Api;
using FactSet.SDK.CompanyLogo.Client;
using FactSet.SDK.CompanyLogo.Model;

namespace Example
{
    public class PostCompanyLogoExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.CompanyLogo.Client.Configuration();

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

            var apiInstance = new CompanyLogosApi(config);

            var postCompanyLogoRequest = new PostCompanyLogoRequest(); // PostCompanyLogoRequest | Request Body (optional) 

            try
            {
                // Retrieves logos for one or more publicly traded companies.
                InlineResponse200 result = apiInstance.PostCompanyLogo(postCompanyLogoRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyLogosApi.PostCompanyLogo: " + e.Message );
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
 **postCompanyLogoRequest** | [**PostCompanyLogoRequest**](PostCompanyLogoRequest.md)| Request Body | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Bad Request. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated API Key or Token. |  -  |
| **403** | Forbidden. The API Key or token is not authorized. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


