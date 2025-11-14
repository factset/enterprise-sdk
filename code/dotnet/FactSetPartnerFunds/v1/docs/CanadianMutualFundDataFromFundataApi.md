# FactSet.SDK.FactSetPartnerFunds.Api.CanadianMutualFundDataFromFundataApi

All URIs are relative to *https://api.factset.com/content/partner-funds/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetAssetAllocations**](CanadianMutualFundDataFromFundataApi.md#getassetallocations) | **GET** /fundata/asset-allocations | Fund asset allocations
[**GetDistribution**](CanadianMutualFundDataFromFundataApi.md#getdistribution) | **GET** /fundata/distribution | Fund distributions
[**GetFees**](CanadianMutualFundDataFromFundataApi.md#getfees) | **GET** /fundata/fees | Fund fees
[**GetGeographicAllocations**](CanadianMutualFundDataFromFundataApi.md#getgeographicallocations) | **GET** /fundata/geographic-allocations | Fund geographic allocations
[**GetGrowthOfTenK**](CanadianMutualFundDataFromFundataApi.md#getgrowthoftenk) | **GET** /fundata/growth-of-10k | Fund growth of 10K
[**GetHoldings**](CanadianMutualFundDataFromFundataApi.md#getholdings) | **GET** /fundata/holdings | Fund holdings
[**GetProfile**](CanadianMutualFundDataFromFundataApi.md#getprofile) | **GET** /fundata/profile | Fund profile
[**GetRankings**](CanadianMutualFundDataFromFundataApi.md#getrankings) | **GET** /fundata/rankings | Fund rankings
[**GetReturns**](CanadianMutualFundDataFromFundataApi.md#getreturns) | **GET** /fundata/returns | Fund returns
[**GetRisk**](CanadianMutualFundDataFromFundataApi.md#getrisk) | **GET** /fundata/risk | Fund risk
[**GetSectorAllocations**](CanadianMutualFundDataFromFundataApi.md#getsectorallocations) | **GET** /fundata/sector-allocations | Fund sector allocations



<a name="getassetallocations"></a>
# **GetAssetAllocations**
> AssetAllocationsResponse GetAssetAllocations (List<string> ids, string language = null, List<string> sort = null)

Fund asset allocations

This endpoint provides asset allocations for Canadian mutual fund aggregated by asset. The result is default sorted in descending order of asset weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetAssetAllocationsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) 

            try
            {
                // Fund asset allocations
                AssetAllocationsResponse result = apiInstance.GetAssetAllocations(ids, language, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetAssetAllocations: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type
[**AssetAllocationsResponse**](AssetAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The asset allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdistribution"></a>
# **GetDistribution**
> DistributionsResponse GetDistribution (List<string> ids)

Fund distributions

This endpoint provides distribution data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetDistributionExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>

            try
            {
                // Fund distributions
                DistributionsResponse result = apiInstance.GetDistribution(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetDistribution: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type
[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The distribution response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfees"></a>
# **GetFees**
> FeesResponse GetFees (List<string> ids, string language = null)

Fund fees

This endpoint provides fees data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetFeesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)

            try
            {
                // Fund fees
                FeesResponse result = apiInstance.GetFees(ids, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetFees: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]

### Return type
[**FeesResponse**](FeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fees response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getgeographicallocations"></a>
# **GetGeographicAllocations**
> GeoAllocationsResponse GetGeographicAllocations (List<string> ids, string language = null, List<string> sort = null)

Fund geographic allocations

This endpoint provides geographic allocations (which can be countries or regions) of the holdings within Canadian mutual funds. The result is default sorted in descending order of geographic weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetGeographicAllocationsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) 

            try
            {
                // Fund geographic allocations
                GeoAllocationsResponse result = apiInstance.GetGeographicAllocations(ids, language, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetGeographicAllocations: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type
[**GeoAllocationsResponse**](GeoAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The geographic allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getgrowthoftenk"></a>
# **GetGrowthOfTenK**
> GrowthOfTenKResponse GetGrowthOfTenK (List<string> ids, string timePeriod = null, List<string> sort = null)

Fund growth of 10K

This endpoint provides growth of 10K data for Canadian mutual funds. The result is default sorted in descending order of asOfDate.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetGrowthOfTenKExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var timePeriod = "3M";  // string | Periodicity or frequency of the fiscal period. (optional)  (default to 1Y)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) 

            try
            {
                // Fund growth of 10K
                GrowthOfTenKResponse result = apiInstance.GetGrowthOfTenK(ids, timePeriod, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetGrowthOfTenK: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **timePeriod** | **string**| Periodicity or frequency of the fiscal period. | [optional] [default to 1Y]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type
[**GrowthOfTenKResponse**](GrowthOfTenKResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The growth of 10K response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getholdings"></a>
# **GetHoldings**
> HoldingsResponse GetHoldings (List<string> ids)

Fund holdings

This endpoint provides top 10 holdings for Canadian mutual funds. The result is default sorted in descending order of weight of the holdings.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetHoldingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>

            try
            {
                // Fund holdings
                HoldingsResponse result = apiInstance.GetHoldings(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetHoldings: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type
[**HoldingsResponse**](HoldingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The holdings response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getprofile"></a>
# **GetProfile**
> ProfileResponse GetProfile (List<string> ids, string language = null)

Fund profile

This endpoint provides profile information for Canadian mutual funds such as objective, manager, and basic returns.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetProfileExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)

            try
            {
                // Fund profile
                ProfileResponse result = apiInstance.GetProfile(ids, language);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetProfile: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]

### Return type
[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund profile response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrankings"></a>
# **GetRankings**
> PerformanceRankingsResponse GetRankings (List<string> ids)

Fund rankings

This endpoint provides rankings for Canadian mutual funds as compared to benchmarks and peers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetRankingsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>

            try
            {
                // Fund rankings
                PerformanceRankingsResponse result = apiInstance.GetRankings(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetRankings: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type
[**PerformanceRankingsResponse**](PerformanceRankingsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund rankings response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getreturns"></a>
# **GetReturns**
> PerformanceReturnsResponse GetReturns (List<string> ids)

Fund returns

This endpoint provides all the comparative performance values for Canadian mutual funds and their respective benchmark indices. Please note: all periods greater than one year are annualized. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetReturnsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>

            try
            {
                // Fund returns
                PerformanceReturnsResponse result = apiInstance.GetReturns(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetReturns: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 

### Return type
[**PerformanceReturnsResponse**](PerformanceReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund returns response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrisk"></a>
# **GetRisk**
> RiskResponse GetRisk (List<string> ids, string language = null, int? numYears = null)

Fund risk

This endpoint provides risk data for Canadian mutual funds.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetRiskExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)
            var numYears = 5;  // int? | Number of years of risk data to return.  (optional)  (default to 5)

            try
            {
                // Fund risk
                RiskResponse result = apiInstance.GetRisk(ids, language, numYears);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetRisk: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]
 **numYears** | **int?**| Number of years of risk data to return.  | [optional] [default to 5]

### Return type
[**RiskResponse**](RiskResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The risk response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getsectorallocations"></a>
# **GetSectorAllocations**
> SectorAllocationsResponse GetSectorAllocations (List<string> ids, string language = null, List<string> sort = null)

Fund sector allocations

This endpoint provides Canadian mutual fund data aggregated by sector. The result is default sorted in descending order of sector weight of the fund.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPartnerFunds.Api;
using FactSet.SDK.FactSetPartnerFunds.Client;
using FactSet.SDK.FactSetPartnerFunds.Model;

namespace Example
{
    public class GetSectorAllocationsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPartnerFunds.Client.Configuration();

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

            var apiInstance = new CanadianMutualFundDataFromFundataApi(config);

            var ids = new List<string>(); // List<string> | The fund identifiers. <p>***ids limit** = 10 per request*</p>
            var language = "EN";  // string | Specifies the language of the response. Supported languages are English (`EN`) and French (`FR`). Default is English. (optional)  (default to EN)
            var sort = new List<string>(); // List<string> | Enables sorting data in ascending or descending order based on weight of the fund. * `weight` - sorts results in ascending order. *  `-weight` - sorts results in descending order. (optional) 

            try
            {
                // Fund sector allocations
                SectorAllocationsResponse result = apiInstance.GetSectorAllocations(ids, language, sort);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CanadianMutualFundDataFromFundataApi.GetSectorAllocations: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The fund identifiers. &lt;p&gt;***ids limit** &#x3D; 10 per request*&lt;/p&gt; | 
 **language** | **string**| Specifies the language of the response. Supported languages are English (&#x60;EN&#x60;) and French (&#x60;FR&#x60;). Default is English. | [optional] [default to EN]
 **sort** | [**List&lt;string&gt;**](string.md)| Enables sorting data in ascending or descending order based on weight of the fund. * &#x60;weight&#x60; - sorts results in ascending order. *  &#x60;-weight&#x60; - sorts results in descending order. | [optional] 

### Return type
[**SectorAllocationsResponse**](SectorAllocationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The fund sector allocation response object |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


