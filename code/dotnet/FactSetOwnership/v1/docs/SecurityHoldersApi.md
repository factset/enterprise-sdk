# FactSet.SDK.FactSetOwnership.Api.SecurityHoldersApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetSecurityHolders**](SecurityHoldersApi.md#getsecurityholders) | **GET** /factset-ownership/v1/security-holders | Get security ownership data for requested security identifers.
[**PostSecurityHolders**](SecurityHoldersApi.md#postsecurityholders) | **POST** /factset-ownership/v1/security-holders | Get security ownership data for a list of requested securities.



<a name="getsecurityholders"></a>
# **GetSecurityHolders**
> SecurityHoldersResponse GetSecurityHolders (List<string> ids, string holderType = null, string topn = null, string date = null, string currency = null)

Get security ownership data for requested security identifers.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \"Topn\" holders and by holder \"type\", such as Institutions, Insiders, and Stakeholders. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class GetSecurityHoldersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new SecurityHoldersApi(config);

            var ids = new List<string>(); // List<string> | Requested list of security identifiers. <p>***ids limit** =  1 per request*</p>.
            var holderType = "F";  // string | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners  (optional)  (default to F)
            var topn = "\"ALL\"";  // string | Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. (optional)  (default to "ALL")
            var date = "2019-12-31";  // string | Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. (optional) 
            var currency = "USD";  // string | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) 

            try
            {
                // Get security ownership data for requested security identifers.
                SecurityHoldersResponse result = apiInstance.GetSecurityHolders(ids, holderType, topn, date, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecurityHoldersApi.GetSecurityHolders: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt;. | 
 **holderType** | **string**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] [default to F]
 **topn** | **string**| Limits number of holdings or holders displayed by the top *n* securities based on positions Market Value. Default is ALL, otherwise use number to limit number. | [optional] [default to &quot;ALL&quot;]
 **date** | **string**| Date of holdings expressed in YYYY-MM-DD format. The fund-holdings endpoint will default to latest month-end close. | [optional] 
 **currency** | **string**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] 

### Return type
[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Security Holders Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postsecurityholders"></a>
# **PostSecurityHolders**
> SecurityHoldersResponse PostSecurityHolders (SecurityHoldersRequest securityHoldersRequest)

Get security ownership data for a list of requested securities.

Gets security ownership details and activity for the requested security identifiers. The services allows filtering by \"Topn\" holders and by holder \"type\", such as Institutions, Insiders, and Stakeholders. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnership.Api;
using FactSet.SDK.FactSetOwnership.Client;
using FactSet.SDK.FactSetOwnership.Model;

namespace Example
{
    public class PostSecurityHoldersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnership.Client.Configuration();

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

            var apiInstance = new SecurityHoldersApi(config);

            var securityHoldersRequest = new SecurityHoldersRequest(); // SecurityHoldersRequest | Requesting Security Holders for a list of Fund Identifiers.

            try
            {
                // Get security ownership data for a list of requested securities.
                SecurityHoldersResponse result = apiInstance.PostSecurityHolders(securityHoldersRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SecurityHoldersApi.PostSecurityHolders: " + e.Message );
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
 **securityHoldersRequest** | [**SecurityHoldersRequest**](SecurityHoldersRequest.md)| Requesting Security Holders for a list of Fund Identifiers. | 

### Return type
[**SecurityHoldersResponse**](SecurityHoldersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Security Holders Response. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


