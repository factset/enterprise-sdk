# FactSet.SDK.MarketIntelligence.Api.RetrieveReportListApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetReportsGet**](RetrieveReportListApi.md#getreportsget) | **GET** /get-reports | Retrieve a list of previously created reports and associated report metadata.


<a name="getreportsget"></a>
# **GetReportsGet**
> GetReportInfo GetReportsGet ()

Retrieve a list of previously created reports and associated report metadata.

Endpoint to retrieve list of all available Market Intelligence reports for specific User in JSON format.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.MarketIntelligence.Api;
using FactSet.SDK.MarketIntelligence.Client;
using FactSet.SDK.MarketIntelligence.Model;

namespace Example
{
    public class GetReportsGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.MarketIntelligence.Client.Configuration();

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

            var apiInstance = new RetrieveReportListApi(config);

            try
            {
                // Retrieve a list of previously created reports and associated report metadata.
                GetReportInfo result = apiInstance.GetReportsGet();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RetrieveReportListApi.GetReportsGet: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**GetReportInfo**](GetReportInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response, Previously created report list fetched. |  -  |
| **400** | Unknown Error |  -  |
| **401** | Missing/invalid Credentials  or authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

