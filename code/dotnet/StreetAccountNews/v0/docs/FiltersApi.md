# FactSet.SDK.StreetAccountNews.Api.FiltersApi

All URIs are relative to *https://api.factset.com/research/news/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStreetAccountFilters**](FiltersApi.md#getstreetaccountfilters) | **GET** /streetaccount/filters | Retrieve all StreetAccount filters



<a name="getstreetaccountfilters"></a>
# **GetStreetAccountFilters**
> FilterResponse GetStreetAccountFilters (bool? structured = null, bool? flattened = null)

Retrieve all StreetAccount filters

Add StreetAccount filters (watchlists, company filters, market topics, regions and sectors) to filter down StreetAccount headlines by the relevant categories. Set the structured and/or flattened flag. If structured flag is set, parent and child filter information will be returned. If flattened flag is set, flattened filters will be returned which can be used with the headlines and createView endpoints. Both flags can be set to return both sets of filters.  If no params are provided it will return both

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetStreetAccountFiltersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var apiInstance = new FiltersApi(config);

            var structured = true;  // bool? | Pass structured to generate a structured view of the available filters. (optional) 
            var flattened = true;  // bool? | Pass flattened to generate a structured view of the available filters. (optional) 

            try
            {
                // Retrieve all StreetAccount filters
                FilterResponse result = apiInstance.GetStreetAccountFilters(structured, flattened);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FiltersApi.GetStreetAccountFilters: " + e.Message );
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
 **structured** | **bool?**| Pass structured to generate a structured view of the available filters. | [optional] 
 **flattened** | **bool?**| Pass flattened to generate a structured view of the available filters. | [optional] 

### Return type
[**FilterResponse**](FilterResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


