# FactSet.SDK.OpenFactSetPartnersDocuments.Api.LuxembourgApi

All URIs are relative to *https://api.factset.com/bulk-documents/ofm/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLuxembourgGreenbondsDaily**](LuxembourgApi.md#getluxembourggreenbondsdaily) | **GET** /luxembourg/green-bonds/daily | Returns daily files from Open:FactSet Partner - Luxembourg



<a name="getluxembourggreenbondsdaily"></a>
# **GetLuxembourgGreenbondsDaily**
> LuxResponse GetLuxembourgGreenbondsDaily (string sort = null, int? paginationLimit = null, int? paginationOffset = null, string isin = null, DateTime? preissuancePubDate = null, string type = null)

Returns daily files from Open:FactSet Partner - Luxembourg

Returns XML files and relevant metadata provided by Open: FactSet Partner – Luxembourg. 

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
    public class GetLuxembourgGreenbondsDailyExample
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

            var apiInstance = new LuxembourgApi(config);

            var sort = "startDate";  // string | Enables to get the data in ascending or descending order based on startTime. Results are in reverse chronological order if this parameter is not used. (optional)  (default to -startDate)
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per result. (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. Using this parameter can fetch maximum of first 10000 records. (optional)  (default to 0)
            var isin = "XS2486610541";  // string | Specifies the ISIN of the record.  (optional) 
            var preissuancePubDate = DateTime.Parse("2022-08-26");  // DateTime? | The pre-issuance date of the record.  (optional) 
            var type = "type_example";  // string | Please input the value as **idMap** to get the symbology files     (optional) 

            try
            {
                // Returns daily files from Open:FactSet Partner - Luxembourg
                LuxResponse result = apiInstance.GetLuxembourgGreenbondsDaily(sort, paginationLimit, paginationOffset, isin, preissuancePubDate, type);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling LuxembourgApi.GetLuxembourgGreenbondsDaily: " + e.Message );
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
 **isin** | **string**| Specifies the ISIN of the record.  | [optional] 
 **preissuancePubDate** | **DateTime?**| The pre-issuance date of the record.  | [optional] 
 **type** | **string**| Please input the value as **idMap** to get the symbology files     | [optional] 

### Return type
[**LuxResponse**](LuxResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Download link &amp; metadata for luxembourg files. |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


