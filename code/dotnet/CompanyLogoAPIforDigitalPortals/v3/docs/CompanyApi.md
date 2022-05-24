# FactSet.SDK.CompanyLogoAPIforDigitalPortals.Api.CompanyApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyLogoGet**](CompanyApi.md#getcompanylogoget) | **GET** /company/logo/get | List of URLs of company logos.


<a name="getcompanylogoget"></a>
# **GetCompanyLogoGet**
> InlineResponse200 GetCompanyLogoGet (string identifier, string identifierType, string format = null, List<string> attributes = null)

List of URLs of company logos.

List of URLs for transparent company logos in different sizes and formats.   The different sizes for the rectangular and square formats are:    **Small**:  * rectangular:  maximum width of 88 pixels and maximum height of 31 pixels.  * square:  31 x 31 pixels.    **Medium**: small logo scaled up by 200%.   **Large**: small logo scaled up by 300%.   **Vector**: can be rendered at any size.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.CompanyLogoAPIforDigitalPortals.Api;
using FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client;
using FactSet.SDK.CompanyLogoAPIforDigitalPortals.Model;

namespace Example
{
    public class GetCompanyLogoGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.CompanyLogoAPIforDigitalPortals.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);
            var identifier = "identifier_example";  // string | Identifier that resolves to a company. 
            var identifierType = "idInstrument";  // string | The type of the identifier.
            var format = "rectangular";  // string | Format of the logos. (optional)  (default to rectangular)
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // List of URLs of company logos.
                InlineResponse200 result = apiInstance.GetCompanyLogoGet(identifier, identifierType, format, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyLogoGet: " + e.Message );
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
 **identifier** | **string**| Identifier that resolves to a company.  | 
 **identifierType** | **string**| The type of the identifier. | 
 **format** | **string**| Format of the logos. | [optional] [default to rectangular]
 **attributes** | [**List&lt;string&gt;**](string.md)| Limit the attributes returned in the response to the specified set. | [optional] 

### Return type
[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

