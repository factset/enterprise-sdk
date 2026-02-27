# FactSet.SDK.ProposalGenerationEngine.Api.LookupApi

All URIs are relative to *https://api.factset.com/analytics/engines/proposal-generation/v0*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSecurities**](LookupApi.md#getsecurities) | **GET** /securities | 



<a name="getsecurities"></a>
# **GetSecurities**
> PagedSecurities GetSecurities (string name = null, string identifier = null, string asOfDate = null, string udfs = null, int? paginationOffset = null, int? paginationLimit = null)



search for securities within the security universe for the user/client

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ProposalGenerationEngine.Api;
using FactSet.SDK.ProposalGenerationEngine.Client;
using FactSet.SDK.ProposalGenerationEngine.Model;

namespace Example
{
    public class GetSecuritiesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ProposalGenerationEngine.Client.Configuration();

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

            var apiInstance = new LookupApi(config);

            var name = "Amazon";  // string | search by (part of) security name (optional) 
            var identifier = "AMZN";  // string | search by security identifier (e.g. cusip or tradingSymbol). (optional) 
            var asOfDate = "latestMonthEnd";  // string | search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value 'latestMonthEnd' is supported as well (optional) 
            var udfs = "maxFrontLoad,assetAllocation";  // string | specify list of UDFs to retrieve for every security in the result (optional) 
            var paginationOffset = 500;  // int? | Specifies the starting index for pagination. (optional) 
            var paginationLimit = 56;  // int? | Specifies the maximum number of results to return (optional) 

            try
            {
                PagedSecurities result = apiInstance.GetSecurities(name, identifier, asOfDate, udfs, paginationOffset, paginationLimit);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling LookupApi.GetSecurities: " + e.Message );
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
 **name** | **string**| search by (part of) security name | [optional] 
 **identifier** | **string**| search by security identifier (e.g. cusip or tradingSymbol). | [optional] 
 **asOfDate** | **string**| search only within valid securities for the specified asOfDate. The value should be in YYYY-MM-DD format. A special wildcard value &#39;latestMonthEnd&#39; is supported as well | [optional] 
 **udfs** | **string**| specify list of UDFs to retrieve for every security in the result | [optional] 
 **paginationOffset** | **int?**| Specifies the starting index for pagination. | [optional] 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return | [optional] 

### Return type
[**PagedSecurities**](PagedSecurities.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | List of investments |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


