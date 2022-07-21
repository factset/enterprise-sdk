# FactSet.SDK.FactSetTermsandConditions.Api.RedemptionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFixedIncomeRedemptionPrices**](RedemptionsApi.md#getfixedincomeredemptionprices) | **GET** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a Fixed Income security.
[**GetFixedIncomeRedemptionPricesForList**](RedemptionsApi.md#getfixedincomeredemptionpricesforlist) | **POST** /factset-terms-and-conditions/v1/redemption-prices | Return Redemption Prices for a list of Fixed Income securities.


<a name="getfixedincomeredemptionprices"></a>
# **GetFixedIncomeRedemptionPrices**
> RedemptionPricesResponse GetFixedIncomeRedemptionPrices (List<string> ids, string categories)

Return Redemption Prices for a Fixed Income security.

Returns Redemption Prices for the Fixed Income security. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTermsandConditions.Api;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;

namespace Example
{
    public class GetFixedIncomeRedemptionPricesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new RedemptionsApi(config);

            var ids = new List<string>(); // List<string> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 
            var categories = "ALL";  // string | Filters the list of Redemption Prices Categories -   * **CALL** = Call prices.   * **PUT** = Put prices.   * **SF** = Sinking Fund prices.  (default to ALL)

            try
            {
                // Return Redemption Prices for a Fixed Income security.
                RedemptionPricesResponse result = apiInstance.GetFixedIncomeRedemptionPrices(ids, categories);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RedemptionsApi.GetFixedIncomeRedemptionPrices: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT &#x3D; 250** *per request*.  | 
 **categories** | **string**| Filters the list of Redemption Prices Categories -   * **CALL** &#x3D; Call prices.   * **PUT** &#x3D; Put prices.   * **SF** &#x3D; Sinking Fund prices.  | [default to ALL]

### Return type
[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Negative Redemption Prices Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfixedincomeredemptionpricesforlist"></a>
# **GetFixedIncomeRedemptionPricesForList**
> RedemptionPricesResponse GetFixedIncomeRedemptionPricesForList (RedemptionPricesRequest redemptionPricesRequest)

Return Redemption Prices for a list of Fixed Income securities.

Returns Redemption Prices for a list of Fixed Income securities. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTermsandConditions.Api;
using FactSet.SDK.FactSetTermsandConditions.Client;
using FactSet.SDK.FactSetTermsandConditions.Model;

namespace Example
{
    public class GetFixedIncomeRedemptionPricesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new RedemptionsApi(config);

            var redemptionPricesRequest = new RedemptionPricesRequest(); // RedemptionPricesRequest | Request object for Fixed Income Redemption Prices.

            try
            {
                // Return Redemption Prices for a list of Fixed Income securities.
                RedemptionPricesResponse result = apiInstance.GetFixedIncomeRedemptionPricesForList(redemptionPricesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling RedemptionsApi.GetFixedIncomeRedemptionPricesForList: " + e.Message );
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
 **redemptionPricesRequest** | [**RedemptionPricesRequest**](RedemptionPricesRequest.md)| Request object for Fixed Income Redemption Prices. | 

### Return type
[**RedemptionPricesResponse**](RedemptionPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Negative Redemption Prices Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

