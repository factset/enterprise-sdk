# FactSet.SDK.CompanyLogoAPIforDigitalPortals.Api.CompanyApi

All URIs are relative to *http://api.factset.com/wealth/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyLogoGetByInstrument**](CompanyApi.md#getcompanylogogetbyinstrument) | **GET** /company/logo/getByInstrument | URLs of company logos.


<a name="getcompanylogogetbyinstrument"></a>
# **GetCompanyLogoGetByInstrument**
> InlineResponse200 GetCompanyLogoGetByInstrument (string id, List<string> attributes = null)

URLs of company logos.

URLs of transparent company logos in different sizes. A small square logo is 31x31 pixels. A small rectangular logo has a maximum width of 88 pixels and a maximum height of 31 pixels. A medium or large logo has the size of the small logo scaled up by 200% and 300% respectively. A vector logo can be rendered at any size.

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
    public class GetCompanyLogoGetByInstrumentExample
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

            var id = "id_example";  // string | Identifier of an instrument.
            var attributes = new List<string>(); // List<string> | Limit the attributes returned in the response to the specified set. (optional) 

            try
            {
                // URLs of company logos.
                InlineResponse200 result = apiInstance.GetCompanyLogoGetByInstrument(id, attributes);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyLogoGetByInstrument: " + e.Message );
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
 **id** | **string**| Identifier of an instrument. | 
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

