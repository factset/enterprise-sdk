# FactSet.SDK.OpenFactSetPartnersDocuments.Api.LinkUpApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLinkUpJobListings**](LinkUpApi.md#getlinkupjoblistings) | **GET** /linkup/job-listings | Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.



<a name="getlinkupjoblistings"></a>
# **GetLinkUpJobListings**
> LinkUpResponse GetLinkUpJobListings (string sort = null, int? paginationLimit = null, int? paginationOffset = null, DateTime? startDate = null, DateTime? endDate = null, string type = null)

Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.

Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily. **This API is no longer being sold for new clients.**

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetPartnersDocuments.Api;
using FactSet.SDK.OpenFactSetPartnersDocuments.Client;
using FactSet.SDK.OpenFactSetPartnersDocuments.Model;

namespace Example
{
    public class GetLinkUpJobListingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetPartnersDocuments.Client.Configuration();

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

            var apiInstance = new LinkUpApi(config);

            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var startDate = DateTime.Parse("2020-01-01");  // DateTime? | The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional) 
            var endDate = DateTime.Parse("2021-08-01");  // DateTime? | The latest date of the LinkUp file the API should fetching for based on fileTimestamp. (optional) 
            var type = "full";  // string | Used to provide the full job descriptions when value \"full\" is used for this parameter. (optional)  (default to delta)

            try
            {
                // Returns the  daily files from Open:FactSet Partner - LinkUp. The LinkUp API provides access to job listings dataset that is sourced directly from employer webistes globally delivered daily.
                LinkUpResponse result = apiInstance.GetLinkUpJobListings(sort, paginationLimit, paginationOffset, startDate, endDate, type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling LinkUpApi.GetLinkUpJobListings: " + e.Message );
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
 **sort** | **string**| Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. | [optional] [default to -startDate]
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per result. | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. | [optional] [default to 0]
 **startDate** | **DateTime?**| The earliest date of the LinkUp file the API should fetching for based on fileTimestamp. | [optional] 
 **endDate** | **DateTime?**| The latest date of the LinkUp file the API should fetching for based on fileTimestamp. | [optional] 
 **type** | **string**| Used to provide the full job descriptions when value \&quot;full\&quot; is used for this parameter. | [optional] [default to delta]

### Return type
[**LinkUpResponse**](LinkUpResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for LinkUp data. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


