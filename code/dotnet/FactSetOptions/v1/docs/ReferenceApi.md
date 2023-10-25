# FactSet.SDK.FactSetOptions.Api.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOptionsDatesForList**](ReferenceApi.md#getoptionsdatesforlist) | **POST** /factset-options/v1/dates | Returns option security dates such as expiration and trade.
[**GetOptionsReferencesForList**](ReferenceApi.md#getoptionsreferencesforlist) | **POST** /factset-options/v1/references | Returns basic reference details for the options such as currency, exchange, symbols, flags and more



<a name="getoptionsdatesforlist"></a>
# **GetOptionsDatesForList**
> OptionsDatesResponse GetOptionsDatesForList (OptionsDatesRequest optionsDatesRequest)

Returns option security dates such as expiration and trade.

Returns all relevant dates such as  for the specified Option identifier. Data Items include -  * Expiration Date * First Dates for Ask, Bid, Settlement, and Trade * Last Dates for Ask, Bid, Settlement, and Trade    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOptions.Api;
using FactSet.SDK.FactSetOptions.Client;
using FactSet.SDK.FactSetOptions.Model;

namespace Example
{
    public class GetOptionsDatesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOptions.Client.Configuration();

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

            var apiInstance = new ReferenceApi(config);

            var optionsDatesRequest = new OptionsDatesRequest(); // OptionsDatesRequest | 

            try
            {
                // Returns option security dates such as expiration and trade.
                OptionsDatesResponse result = apiInstance.GetOptionsDatesForList(optionsDatesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetOptionsDatesForList: " + e.Message );
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
 **optionsDatesRequest** | [**OptionsDatesRequest**](OptionsDatesRequest.md)|  | 

### Return type
[**OptionsDatesResponse**](OptionsDatesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options Dates Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getoptionsreferencesforlist"></a>
# **GetOptionsReferencesForList**
> OptionsReferencesResponse GetOptionsReferencesForList (OptionsReferencesRequest optionsReferencesRequest)

Returns basic reference details for the options such as currency, exchange, symbols, flags and more

Returns basic reference details for the options. Data items include -  * Name * Exchange * Call or Put Flag * Call or Put Pair Symbol * Other symbols such as OPRA17 and OCC21 * Currency * Underlying Security Symbols * Expiration Month, Dates, and Frequency  *For details or definitions of all available response fields visit the associated schema.*    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOptions.Api;
using FactSet.SDK.FactSetOptions.Client;
using FactSet.SDK.FactSetOptions.Model;

namespace Example
{
    public class GetOptionsReferencesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOptions.Client.Configuration();

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

            var apiInstance = new ReferenceApi(config);

            var optionsReferencesRequest = new OptionsReferencesRequest(); // OptionsReferencesRequest | Options Reference Request Body

            try
            {
                // Returns basic reference details for the options such as currency, exchange, symbols, flags and more
                OptionsReferencesResponse result = apiInstance.GetOptionsReferencesForList(optionsReferencesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetOptionsReferencesForList: " + e.Message );
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
 **optionsReferencesRequest** | [**OptionsReferencesRequest**](OptionsReferencesRequest.md)| Options Reference Request Body | 

### Return type
[**OptionsReferencesResponse**](OptionsReferencesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options Reference Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


