# FactSet.SDK.FactSetEntity.Api.EntityReferenceChineseApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEntityReferenceChi**](EntityReferenceChineseApi.md#getentityreferencechi) | **GET** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.
[**GetEntityReferenceChiForList**](EntityReferenceChineseApi.md#getentityreferencechiforlist) | **POST** /factset-entity/v1/entity-reference-chi | Returns entity reference data in Chinese for an individual entity.



<a name="getentityreferencechi"></a>
# **GetEntityReferenceChi**
> EntityReferenceChiResponse GetEntityReferenceChi (List<string> ids)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class GetEntityReferenceChiExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityReferenceChineseApi(config);

            var ids = new List<string>(); // List<string> | The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.<p>**Max Ids Limit set to 1500 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 

            try
            {
                // Returns entity reference data in Chinese for an individual entity.
                EntityReferenceChiResponse result = apiInstance.GetEntityReferenceChi(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityReferenceChineseApi.GetEntityReferenceChi: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested Market Identifier. Accepted input identifiers include Ticker-Exchange, Ticker-Regions, CUSIPs, ISINs, SEDOLs, BBGs or FactSet Permanent Ids, such as -R, -L, or -E.&lt;p&gt;**Max Ids Limit set to 1500 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 

### Return type
[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Entity Reference data in Chinese for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getentityreferencechiforlist"></a>
# **GetEntityReferenceChiForList**
> EntityReferenceChiResponse GetEntityReferenceChiForList (EntityReferenceChiRequest entityReferenceChiRequest)

Returns entity reference data in Chinese for an individual entity.

Returns entity reference data in Chinese for the requested Id(s). Data points include Business Description and Entity Name in both simplified and traditional Chinese. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetEntity.Api;
using FactSet.SDK.FactSetEntity.Client;
using FactSet.SDK.FactSetEntity.Model;

namespace Example
{
    public class GetEntityReferenceChiForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetEntity.Client.Configuration();

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

            var apiInstance = new EntityReferenceChineseApi(config);

            var entityReferenceChiRequest = new EntityReferenceChiRequest(); // EntityReferenceChiRequest | Request Body to request a list of Entity Reference Chinese objects.

            try
            {
                // Returns entity reference data in Chinese for an individual entity.
                EntityReferenceChiResponse result = apiInstance.GetEntityReferenceChiForList(entityReferenceChiRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling EntityReferenceChineseApi.GetEntityReferenceChiForList: " + e.Message );
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
 **entityReferenceChiRequest** | [**EntityReferenceChiRequest**](EntityReferenceChiRequest.md)| Request Body to request a list of Entity Reference Chinese objects. | 

### Return type
[**EntityReferenceChiResponse**](EntityReferenceChiResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Entity Reference data in Chinese for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


