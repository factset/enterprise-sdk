# FactSet.SDK.EventCalendar.Api.CompanyApi

All URIs are relative to *https://api.factset.com/events/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCompanyEvent**](CompanyApi.md#getcompanyevent) | **POST** /calendar/events | Retrieve Company Event data



<a name="getcompanyevent"></a>
# **GetCompanyEvent**
> CompanyEventResponse GetCompanyEvent (CompanyEventRequest companyEventRequest)

Retrieve Company Event data

This endpoint returns all company events with filters from the request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.EventCalendar.Api;
using FactSet.SDK.EventCalendar.Client;
using FactSet.SDK.EventCalendar.Model;

namespace Example
{
    public class GetCompanyEventExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.EventCalendar.Client.Configuration();

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

            var apiInstance = new CompanyApi(config);

            var companyEventRequest = new CompanyEventRequest(); // CompanyEventRequest | Company Event request body

            try
            {
                // Retrieve Company Event data
                CompanyEventResponse result = apiInstance.GetCompanyEvent(companyEventRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CompanyApi.GetCompanyEvent: " + e.Message );
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
 **companyEventRequest** | [**CompanyEventRequest**](CompanyEventRequest.md)| Company Event request body | 

### Return type
[**CompanyEventResponse**](CompanyEventResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


