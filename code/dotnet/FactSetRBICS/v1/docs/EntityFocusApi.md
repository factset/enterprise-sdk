# FactSet.SDK.FactSetRBICS.Api.EntityFocusApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetRbicsEntityFocus**](EntityFocusApi.md#getrbicsentityfocus) | **GET** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry
[**GetRbicsEntityFocusForList**](EntityFocusApi.md#getrbicsentityfocusforlist) | **POST** /factset-rbics/v1/entity-focus | Get RBICS classification for the Focus industry



<a name="getrbicsentityfocus"></a>
# **GetRbicsEntityFocus**
> EntityFocusResponse GetRbicsEntityFocus (List<string> ids, string date = null, List<int> levels = null, bool? includeNames = null)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a short list of companies. Full history is included if _date_ parameter is not specified.      RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetRBICS.Api;
using FactSet.SDK.FactSetRBICS.Client;
using FactSet.SDK.FactSetRBICS.Model;

namespace Example
{
    public class GetRbicsEntityFocusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetRBICS.Client.Configuration();

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

            var apiInstance = new EntityFocusApi(config);

            var ids = new List<string>(); // List<string> | List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.<p>**ids limit = 2500 per request**</p>    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p> 
            var date = "2017-07-24";  // string | Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. (optional) 
            var levels = new List<int>(); // List<int> | List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** (optional) 
            var includeNames = true;  // bool? | Option to include or exclude industry Names and the L6 Description. true = Include Names; false = Exclude Names. (optional)  (default to true)

            try
            {
                // Get RBICS classification for the Focus industry
                EntityFocusResponse result = apiInstance.GetRbicsEntityFocus(ids, date, levels, includeNames);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityFocusApi.GetRbicsEntityFocus: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| List of Company identifiers. Accepted identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**ids limit &#x3D; 2500 per request**&lt;/p&gt;    Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;  | 
 **date** | **string**| Effective date for data expressed in YYYY-MM-DD format. If no date is requested, the default behavior is to return the full history for the requested entity. | [optional] 
 **levels** | [**List&lt;int&gt;**](int.md)| List of RBICS industry levels to include in the response. **By default if left blank, all levels are returned.** | [optional] 
 **includeNames** | **bool?**| Option to include or exclude industry Names and the L6 Description. true &#x3D; Include Names; false &#x3D; Exclude Names. | [optional] [default to true]

### Return type
[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of Entity Focus Objects |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrbicsentityfocusforlist"></a>
# **GetRbicsEntityFocusForList**
> EntityFocusResponse GetRbicsEntityFocusForList (EntityFocusRequest entityFocusRequest)

Get RBICS classification for the Focus industry

Gets RBICS classifications for the Focus industry for a long list of companies. Full history is included if _date_ parameter is not specified.              RBICS Focus offers a single-sector mapping of about 48,000 of the most liquid and publicly-traded companies based on their primary lines of business; it uses revenues as the key factor in determining a company’s primary line of business, by mapping a company to the lowest-level sector from which it derives 50% or more of its revenues.    The RBICS Extended Universe – Industry Group is not currently supported through the RBICS API.  

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetRBICS.Api;
using FactSet.SDK.FactSetRBICS.Client;
using FactSet.SDK.FactSetRBICS.Model;

namespace Example
{
    public class GetRbicsEntityFocusForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetRBICS.Client.Configuration();

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

            var apiInstance = new EntityFocusApi(config);

            var entityFocusRequest = new EntityFocusRequest(); // EntityFocusRequest | Request Body to request a list of RBICS Entity Focus objects.

            try
            {
                // Get RBICS classification for the Focus industry
                EntityFocusResponse result = apiInstance.GetRbicsEntityFocusForList(entityFocusRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityFocusApi.GetRbicsEntityFocusForList: " + e.Message );
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
 **entityFocusRequest** | [**EntityFocusRequest**](EntityFocusRequest.md)| Request Body to request a list of RBICS Entity Focus objects. | 

### Return type
[**EntityFocusResponse**](EntityFocusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response producing an array of Entity Focus Objects |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


