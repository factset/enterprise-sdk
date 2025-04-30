# FactSet.SDK.OpenFactSetMarketplace.Api.PartnersApi

All URIs are relative to *https://api.factset.com/ofs/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetPartnerById**](PartnersApi.md#getpartnerbyid) | **GET** /partner/{id} | 
[**GetPartners**](PartnersApi.md#getpartners) | **GET** /partners | 



<a name="getpartnerbyid"></a>
# **GetPartnerById**
> PartnerSuccessResponse GetPartnerById (string id)



Get a single FactSet Partner by ID.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetMarketplace.Api;
using FactSet.SDK.OpenFactSetMarketplace.Client;
using FactSet.SDK.OpenFactSetMarketplace.Model;

namespace Example
{
    public class GetPartnerByIdExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetMarketplace.Client.Configuration();

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

            var apiInstance = new PartnersApi(config);

            var id = "id_example";  // string | ID of the product or partner

            try
            {
                PartnerSuccessResponse result = apiInstance.GetPartnerById(id);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PartnersApi.GetPartnerById: " + e.Message );
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
 **id** | **string**| ID of the product or partner | 

### Return type
[**PartnerSuccessResponse**](PartnerSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get a single FactSet Partner by ID. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
| **404** | Partner not found |  -  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpartners"></a>
# **GetPartners**
> PartnersSuccessResponse GetPartners (int? paginationLimit = null, int? paginationOffset = null)



Get all partners published on FactSet's Partner Catalog.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.OpenFactSetMarketplace.Api;
using FactSet.SDK.OpenFactSetMarketplace.Client;
using FactSet.SDK.OpenFactSetMarketplace.Model;

namespace Example
{
    public class GetPartnersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.OpenFactSetMarketplace.Client.Configuration();

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

            var apiInstance = new PartnersApi(config);

            var paginationLimit = 10;  // int? | Limit for number of records returned per page (optional)  (default to 10)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. (optional)  (default to 0)

            try
            {
                PartnersSuccessResponse result = apiInstance.GetPartners(paginationLimit, paginationOffset);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling PartnersApi.GetPartners: " + e.Message );
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
 **paginationLimit** | **int?**| Limit for number of records returned per page | [optional] [default to 10]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results. | [optional] [default to 0]

### Return type
[**PartnersSuccessResponse**](PartnersSuccessResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get all partners published on FactSet&#39;s Partner Catalog. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed via this developer portal page) or valid OAuth 2.0 credentials (see OAuth 2.0 documentation on the developer portal) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via this developer portal page. |  -  |
| **429** | Rate limit reached. Retry the requests after waiting the time specified in the Retry-After header. |  * X-DataDirect-Request-Key - FactSet request key header. <br>  * RateLimit-Limit - The maximum number of requests that the consumer is permitted to make in a given time window. <br>  * RateLimit-Remaining - The number of requests remaining in the current rate limit window. <br>  * RateLimit-Reset - Time remaining (in seconds) until request limit is reset. <br>  * X-RateLimit-Limit-Minute - The maximum number of requests that the consumer is permitted to make in a minute. <br>  * X-RateLimit-Remaining-Minute - The number of requests remaining in the current minute. <br>  * Retry-After - Time to wait in seconds before making a new request as the rate limit has been reached. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


