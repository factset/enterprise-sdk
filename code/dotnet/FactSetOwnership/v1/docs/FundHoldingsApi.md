# FactSet.SDK.FactSetOwnership.Api.FundHoldingsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOwnershipHoldings**](FundHoldingsApi.md#getownershipholdings) | **GET** /factset-ownership/v1/fund-holdings | Get underlying holdings information for a requested fund identifer.
[**PostOwnershipHoldings**](FundHoldingsApi.md#postownershipholdings) | **POST** /factset-ownership/v1/fund-holdings | Get holdings for a list of funds.



<a name="getownershipholdings"></a>
# **GetOwnershipHoldings**
> FundHoldingsResponse GetOwnershipHoldings (List<string> ids, string date = null, string topn = null, string assetType = null, string currency = null)

Get underlying holdings information for a requested fund identifer.

Gets holdings information for list of fund identifiers. The service allows you to filter by the TopN holdings and Asset Type. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetOwnershipHoldingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new FundHoldingsApi(config);

            var ids = new List<string>(); // List<string> | List of requested fund identifiers. <p>***ids limit** =  10 per request*</p>
            var date = "2019-12-31";  // string | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional) 
            var topn = "\"ALL\"";  // string | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional)  (default to "ALL")
            var assetType = "ALL";  // string | Filter holdings by the following major asset classes -   * **EQ**  = Equity   * **FI** = Fixed Income   * **ALL** = ALL  (optional)  (default to EQ)
            var currency = "USD";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) 

            try
            {
                // Get underlying holdings information for a requested fund identifer.
                FundHoldingsResponse result = apiInstance.GetOwnershipHoldings(ids, date, topn, assetType, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundHoldingsApi.GetOwnershipHoldings: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of requested fund identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p&gt; | 
 **date** | **string**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional] 
 **topn** | **string**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] [default to &quot;ALL&quot;]
 **assetType** | **string**| Filter holdings by the following major asset classes -   * **EQ**  &#x3D; Equity   * **FI** &#x3D; Fixed Income   * **ALL** &#x3D; ALL  | [optional] [default to EQ]
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type
[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Holdings Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postownershipholdings"></a>
# **PostOwnershipHoldings**
> FundHoldingsResponse PostOwnershipHoldings (FundHoldingsRequest fundHoldingsRequest)

Get holdings for a list of funds.

Gets Holding information for a long list of Fund objects.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class PostOwnershipHoldingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new FundHoldingsApi(config);

            var fundHoldingsRequest = new FundHoldingsRequest(); // FundHoldingsRequest | Requesting Underlying Holdings for a list of Fund Identifiers.

            try
            {
                // Get holdings for a list of funds.
                FundHoldingsResponse result = apiInstance.PostOwnershipHoldings(fundHoldingsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundHoldingsApi.PostOwnershipHoldings: " + e.Message );
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
 **fundHoldingsRequest** | [**FundHoldingsRequest**](FundHoldingsRequest.md)| Requesting Underlying Holdings for a list of Fund Identifiers. | 

### Return type
[**FundHoldingsResponse**](FundHoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fund Holdings Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


