# FactSet.SDK.MarketIntelligence.Api.RetrieveRefreshedDataApi

All URIs are relative to *https://api.factset.com/market-intelligence*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDataPollIdResultGet**](RetrieveRefreshedDataApi.md#getdatapollidresultget) | **GET** /get-data/{poll_id}/result | Retrieve data for desired report.



<a name="getdatapollidresultget"></a>
# **GetDataPollIdResultGet**
> ReportDataHeader GetDataPollIdResultGet (string pollId)

Retrieve data for desired report.

Endpoint to retrieve raw data in JSON format for a particular Market Intelligence report.

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
    public class GetDataPollIdResultGetExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.MarketIntelligence.Client.Configuration();

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

            var apiInstance = new RetrieveRefreshedDataApi(config);

            var pollId = "pollId_example";  // string | example: 65ba6dd63fb366464646426d0b

            try
            {
                // Retrieve data for desired report.
                ReportDataHeader result = apiInstance.GetDataPollIdResultGet(pollId);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RetrieveRefreshedDataApi.GetDataPollIdResultGet: " + e.Message );
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
 **pollId** | **string**| example: 65ba6dd63fb366464646426d0b | 

### Return type
[**ReportDataHeader**](ReportDataHeader.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response. Report data retrieved. |  -  |
| **400** | Unknown Error. |  -  |
| **401** | Missing/invalid Credentials or authentication failure |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


