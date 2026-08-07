# FactSet.SDK.FactSetBanks.Api.FilingsApi

All URIs are relative to *https://api.factset.com/content/factset-banks/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTenDFilings**](FilingsApi.md#gettendfilings) | **POST** /ten-d | Returns Form 10-D distribution reports
[**GetUcc1Filings**](FilingsApi.md#getucc1filings) | **POST** /ucc1 | Returns UCC-1 filings data



<a name="gettendfilings"></a>
# **GetTenDFilings**
> Filings10DResponse GetTenDFilings (TenDFilingsRequest tenDFilingsRequest)

Returns Form 10-D distribution reports

Returns SEC Form 10-D distribution reports for bank-issued asset-backed securities — pool performance and credit enhancement data including payments received, delinquencies, defaults, and cash flow distributions. Offers more frequent (monthly) insight into credit card receivables than 8-K/10-K filings.  Covers credit cards (110 data items) and auto loans (254 data items). History since 2017. Updated monthly.  Find available metrics via [`/metrics`](#operation/getMetrics) with:  * **category**: `FILINGS` * **subcategory**: `TEN_D` 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBanks.Api;
using FactSet.SDK.FactSetBanks.Client;
using FactSet.SDK.FactSetBanks.Model;

namespace Example
{
    public class GetTenDFilingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBanks.Client.Configuration();

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

            var apiInstance = new FilingsApi(config);

            var tenDFilingsRequest = new TenDFilingsRequest(); // TenDFilingsRequest | 

            try
            {
                // Returns Form 10-D distribution reports
                Filings10DResponse result = apiInstance.GetTenDFilings(tenDFilingsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsApi.GetTenDFilings: " + e.Message );
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
 **tenDFilingsRequest** | [**TenDFilingsRequest**](TenDFilingsRequest.md)|  | 

### Return type
[**Filings10DResponse**](Filings10DResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | 10-D filing data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getucc1filings"></a>
# **GetUcc1Filings**
> FilingsUCC1Response GetUcc1Filings (Ucc1FilingsRequest ucc1FilingsRequest)

Returns UCC-1 filings data

Returns UCC-1 financing statement filings — notices filed by creditors of an interest in a debtor's personal property. Includes secured party (banking institution), debtor name, and filing details such as expiration date.  Covers 4,500+ banking institutions; history since 2002. Updated monthly. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBanks.Api;
using FactSet.SDK.FactSetBanks.Client;
using FactSet.SDK.FactSetBanks.Model;

namespace Example
{
    public class GetUcc1FilingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetBanks.Client.Configuration();

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

            var apiInstance = new FilingsApi(config);

            var ucc1FilingsRequest = new Ucc1FilingsRequest(); // Ucc1FilingsRequest | 

            try
            {
                // Returns UCC-1 filings data
                FilingsUCC1Response result = apiInstance.GetUcc1Filings(ucc1FilingsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FilingsApi.GetUcc1Filings: " + e.Message );
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
 **ucc1FilingsRequest** | [**Ucc1FilingsRequest**](Ucc1FilingsRequest.md)|  | 

### Return type
[**FilingsUCC1Response**](FilingsUCC1Response.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | UCC-1 filing data |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;detail\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | The requested endpoint could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


