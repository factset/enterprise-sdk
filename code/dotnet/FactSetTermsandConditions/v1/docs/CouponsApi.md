# FactSet.SDK.FactSetTermsandConditions.Api.CouponsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCouponHistory**](CouponsApi.md#getcouponhistory) | **GET** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a Fixed Income security.
[**GetCouponHistoryForList**](CouponsApi.md#getcouponhistoryforlist) | **POST** /factset-terms-and-conditions/v1/coupon-history | Return historical Coupon information for a list of Fixed Income securities.
[**GetCouponSchedules**](CouponsApi.md#getcouponschedules) | **GET** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Sechedules for a Fixed Income security.
[**GetCouponSchedulesForList**](CouponsApi.md#getcouponschedulesforlist) | **POST** /factset-terms-and-conditions/v1/coupon-schedules | Return Coupon Schedules information for a list of Fixed Income securities.



<a name="getcouponhistory"></a>
# **GetCouponHistory**
> CouponHistoryResponse GetCouponHistory (List<string> ids)

Return historical Coupon information for a Fixed Income security.

Returns historical Coupon information for the Fixed Income security. 

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
    public class GetCouponHistoryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new CouponsApi(config);

            var ids = new List<string>(); // List<string> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

            try
            {
                // Return historical Coupon information for a Fixed Income security.
                CouponHistoryResponse result = apiInstance.GetCouponHistory(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CouponsApi.GetCouponHistory: " + e.Message );
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

### Return type
[**CouponHistoryResponse**](CouponHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon History Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcouponhistoryforlist"></a>
# **GetCouponHistoryForList**
> CouponHistoryResponse GetCouponHistoryForList (TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)

Return historical Coupon information for a list of Fixed Income securities.

Returns historical Coupon information for a list of Fixed Income securities. 

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
    public class GetCouponHistoryForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new CouponsApi(config);

            var termsAndConditionsScalarRequest = new TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Coupon History.

            try
            {
                // Return historical Coupon information for a list of Fixed Income securities.
                CouponHistoryResponse result = apiInstance.GetCouponHistoryForList(termsAndConditionsScalarRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CouponsApi.GetCouponHistoryForList: " + e.Message );
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Coupon History. | 

### Return type
[**CouponHistoryResponse**](CouponHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon History Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcouponschedules"></a>
# **GetCouponSchedules**
> CouponSchedulesResponse GetCouponSchedules (List<string> ids)

Return Coupon Sechedules for a Fixed Income security.

Returns Coupon Schedules information for the Fixed Income security. 

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
    public class GetCouponSchedulesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new CouponsApi(config);

            var ids = new List<string>(); // List<string> | List of Fixed Income Security identifiers. Supported symbol types include CUSIP, SEDOL, ISIN, and FactSet Security Permanent Identifier (-S).  **ID LIMIT = 250** *per request*. 

            try
            {
                // Return Coupon Sechedules for a Fixed Income security.
                CouponSchedulesResponse result = apiInstance.GetCouponSchedules(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CouponsApi.GetCouponSchedules: " + e.Message );
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

### Return type
[**CouponSchedulesResponse**](CouponSchedulesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon Schedules Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getcouponschedulesforlist"></a>
# **GetCouponSchedulesForList**
> CouponSchedulesResponse GetCouponSchedulesForList (TermsAndConditionsScalarRequest termsAndConditionsScalarRequest)

Return Coupon Schedules information for a list of Fixed Income securities.

Returns historical Coupon Schedules information for a list of Fixed Income securities. 

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
    public class GetCouponSchedulesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTermsandConditions.Client.Configuration();

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

            var apiInstance = new CouponsApi(config);

            var termsAndConditionsScalarRequest = new TermsAndConditionsScalarRequest(); // TermsAndConditionsScalarRequest | Request object for Fixed Income Coupon Schedules.

            try
            {
                // Return Coupon Schedules information for a list of Fixed Income securities.
                CouponSchedulesResponse result = apiInstance.GetCouponSchedulesForList(termsAndConditionsScalarRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling CouponsApi.GetCouponSchedulesForList: " + e.Message );
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
 **termsAndConditionsScalarRequest** | [**TermsAndConditionsScalarRequest**](TermsAndConditionsScalarRequest.md)| Request object for Fixed Income Coupon Schedules. | 

### Return type
[**CouponSchedulesResponse**](CouponSchedulesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Coupon Schedules Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


