# FactSet.SDK.FactSetOptions.Api.OptionChainsScreeningApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOptionsChainsForList**](OptionChainsScreeningApi.md#getoptionschainsforlist) | **POST** /factset-options/v1/chains | Returns all the underlying option identifiers for the specified underlying Security identifier
[**GetOptionsScreeningForList**](OptionChainsScreeningApi.md#getoptionsscreeningforlist) | **POST** /factset-options/v1/option-screening | Returns all the option identifiers based on the conditions provided as input in the request


<a name="getoptionschainsforlist"></a>
# **GetOptionsChainsForList**
> ChainsResponse GetOptionsChainsForList (ChainsRequest chainsRequest)

Returns all the underlying option identifiers for the specified underlying Security identifier

Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id.     *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

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
    public class GetOptionsChainsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOptions.Client.Configuration();

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

            var apiInstance = new OptionChainsScreeningApi(config);
            var chainsRequest = new ChainsRequest(); // ChainsRequest | Options Chains Request Object

            try
            {
                // Returns all the underlying option identifiers for the specified underlying Security identifier
                ChainsResponse result = apiInstance.GetOptionsChainsForList(chainsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionChainsScreeningApi.GetOptionsChainsForList: " + e.Message );
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
 **chainsRequest** | [**ChainsRequest**](ChainsRequest.md)| Options Chains Request Object | 

### Return type
[**ChainsResponse**](ChainsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options Chain Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getoptionsscreeningforlist"></a>
# **GetOptionsScreeningForList**
> OptionScreeningResponse GetOptionsScreeningForList (OptionScreeningRequest optionScreeningRequest)

Returns all the option identifiers based on the conditions provided as input in the request

Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow \"AND\" logic if more than one condition is applied. If a condition is used the accompanying value MUST be used -  |conditions|description| |- --|- --| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)|    *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

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
    public class GetOptionsScreeningForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOptions.Client.Configuration();

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

            var apiInstance = new OptionChainsScreeningApi(config);
            var optionScreeningRequest = new OptionScreeningRequest(); // OptionScreeningRequest | Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.  

            try
            {
                // Returns all the option identifiers based on the conditions provided as input in the request
                OptionScreeningResponse result = apiInstance.GetOptionsScreeningForList(optionScreeningRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OptionChainsScreeningApi.GetOptionsScreeningForList: " + e.Message );
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
 **optionScreeningRequest** | [**OptionScreeningRequest**](OptionScreeningRequest.md)| Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   | 

### Return type
[**OptionScreeningResponse**](OptionScreeningResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Option Screening Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

