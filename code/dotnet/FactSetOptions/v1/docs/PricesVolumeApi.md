# FactSet.SDK.FactSetOptions.Api.PricesVolumeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOptionsPricesForList**](PricesVolumeApi.md#getoptionspricesforlist) | **POST** /factset-options/v1/prices | Returns the pricing related information for the specified option identifier
[**GetOptionsVolumeForList**](PricesVolumeApi.md#getoptionsvolumeforlist) | **POST** /factset-options/v1/volume | Returns the volume details for the specified option identifier
[**GetUnderlyingVolumeForList**](PricesVolumeApi.md#getunderlyingvolumeforlist) | **POST** /factset-options/v1/underlying-volume | Returns the aggregate volume and open interest for the list of the options under the specified security identifier


<a name="getoptionspricesforlist"></a>
# **GetOptionsPricesForList**
> OptionsPricesResponse GetOptionsPricesForList (OptionsPricesRequest optionsPricesRequest)

Returns the pricing related information for the specified option identifier

Returns the pricing related information for the specified option identifier. Items include -  * Ask * Bid * Mid * Mid Bid Ask * Settlement * Last Price Type (Settlement or MidBidAsk) * Last Price * Strike Price * Underlying Security Price * 52 Week High/Low * Open, High, Low for day. Note securities must be trading for day requested.    *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

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
    public class GetOptionsPricesForListExample
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

            var apiInstance = new PricesVolumeApi(config);
            var optionsPricesRequest = new OptionsPricesRequest(); // OptionsPricesRequest | Options Prices Request Body

            try
            {
                // Returns the pricing related information for the specified option identifier
                OptionsPricesResponse result = apiInstance.GetOptionsPricesForList(optionsPricesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesVolumeApi.GetOptionsPricesForList: " + e.Message );
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
 **optionsPricesRequest** | [**OptionsPricesRequest**](OptionsPricesRequest.md)| Options Prices Request Body | 

### Return type
[**OptionsPricesResponse**](OptionsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Options Prices Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getoptionsvolumeforlist"></a>
# **GetOptionsVolumeForList**
> OptionsVolumeResponse GetOptionsVolumeForList (OptionsVolumeRequest optionsVolumeRequest)

Returns the volume details for the specified option identifier

Returns the volume details for the specified option identifier for a specified exchange. Data items include -  * Open Interest * Volume    *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

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
    public class GetOptionsVolumeForListExample
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

            var apiInstance = new PricesVolumeApi(config);
            var optionsVolumeRequest = new OptionsVolumeRequest(); // OptionsVolumeRequest | Volume Request Object

            try
            {
                // Returns the volume details for the specified option identifier
                OptionsVolumeResponse result = apiInstance.GetOptionsVolumeForList(optionsVolumeRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesVolumeApi.GetOptionsVolumeForList: " + e.Message );
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
 **optionsVolumeRequest** | [**OptionsVolumeRequest**](OptionsVolumeRequest.md)| Volume Request Object | 

### Return type
[**OptionsVolumeResponse**](OptionsVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Volume Response Object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getunderlyingvolumeforlist"></a>
# **GetUnderlyingVolumeForList**
> UnderlyingVolumeResponse GetUnderlyingVolumeForList (UnderlyingVolumeRequest underlyingVolumeRequest)

Returns the aggregate volume and open interest for the list of the options under the specified security identifier

Return the Volume and Open Interest details for list of the options for the specified underlying security identifier. The data is aggregated for all options contracts associated to the underlying id, or specifify in the request only the contracts listed on a specific exchange. Data Includes -  * Put Call Ratio  * Total Put Volume & Open Interest * Total Call Volume & Open Interest * Total Put & Call Volume & Open Interest    *Currently only OPRA Exchange is supproted with exchange ISO \"USA\"* 

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
    public class GetUnderlyingVolumeForListExample
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

            var apiInstance = new PricesVolumeApi(config);
            var underlyingVolumeRequest = new UnderlyingVolumeRequest(); // UnderlyingVolumeRequest | Underlying Volume Request Body

            try
            {
                // Returns the aggregate volume and open interest for the list of the options under the specified security identifier
                UnderlyingVolumeResponse result = apiInstance.GetUnderlyingVolumeForList(underlyingVolumeRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PricesVolumeApi.GetUnderlyingVolumeForList: " + e.Message );
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
 **underlyingVolumeRequest** | [**UnderlyingVolumeRequest**](UnderlyingVolumeRequest.md)| Underlying Volume Request Body | 

### Return type
[**UnderlyingVolumeResponse**](UnderlyingVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Underlying Volume and Open Interest Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

