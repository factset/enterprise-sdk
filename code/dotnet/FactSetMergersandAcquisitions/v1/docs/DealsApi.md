# FactSet.SDK.FactSetMergersandAcquisitions.Api.DealsApi

All URIs are relative to *https://api.factset.com/content/factset-mergers-acquisitions/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetDealsByCompanyList**](DealsApi.md#getdealsbycompanylist) | **POST** /deals/by-company | Returns details for a list of companies.
[**GetDealsDetailsList**](DealsApi.md#getdealsdetailslist) | **POST** /deals/details | Returns details for specified deals.
[**GetPublicTargetDealsList**](DealsApi.md#getpublictargetdealslist) | **POST** /deals/public-targets | Returns a list of deals in which the target is a public company.



<a name="getdealsbycompanylist"></a>
# **GetDealsByCompanyList**
> DealsResponse GetDealsByCompanyList (DealsRequest dealsRequest)

Returns details for a list of companies.

Gets deals for a specified list of companies within a date range. Deals returned are any in which the requested company is involved as either the buyer, seller, or target. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMergersandAcquisitions.Api;
using FactSet.SDK.FactSetMergersandAcquisitions.Client;
using FactSet.SDK.FactSetMergersandAcquisitions.Model;

namespace Example
{
    public class GetDealsByCompanyListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMergersandAcquisitions.Client.Configuration();

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

            var apiInstance = new DealsApi(config);

            var dealsRequest = new DealsRequest(); // DealsRequest | Request object for `Deals`.

            try
            {
                // Returns details for a list of companies.
                DealsResponse result = apiInstance.GetDealsByCompanyList(dealsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DealsApi.GetDealsByCompanyList: " + e.Message );
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
 **dealsRequest** | [**DealsRequest**](DealsRequest.md)| Request object for &#x60;Deals&#x60;. | 

### Return type
[**DealsResponse**](DealsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deals |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | Not Found. The requested data could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getdealsdetailslist"></a>
# **GetDealsDetailsList**
> DetailsResponse GetDealsDetailsList (DetailsRequest detailsRequest)

Returns details for specified deals.

Gets deal details for a specified list of FactSet deal identifiers. Monetary values returned by this API are converted and represented in USD. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMergersandAcquisitions.Api;
using FactSet.SDK.FactSetMergersandAcquisitions.Client;
using FactSet.SDK.FactSetMergersandAcquisitions.Model;

namespace Example
{
    public class GetDealsDetailsListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMergersandAcquisitions.Client.Configuration();

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

            var apiInstance = new DealsApi(config);

            var detailsRequest = new DetailsRequest(); // DetailsRequest | Request object for `Deal Details`.

            try
            {
                // Returns details for specified deals.
                DetailsResponse result = apiInstance.GetDealsDetailsList(detailsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DealsApi.GetDealsDetailsList: " + e.Message );
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
 **detailsRequest** | [**DetailsRequest**](DetailsRequest.md)| Request object for &#x60;Deal Details&#x60;. | 

### Return type
[**DetailsResponse**](DetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deal details |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | Not Found. The requested data could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpublictargetdealslist"></a>
# **GetPublicTargetDealsList**
> DealsPublicResponse GetPublicTargetDealsList (DealsPublicRequest dealsPublicRequest)

Returns a list of deals in which the target is a public company.

Gets deals in which the target is a public company for a specified date range and status. The start and end date parameters will find deals based on their announcement date. The response of this endpoint includes `dealId` which can be sent to the `/deals/details` endpoint for more information about the deal. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetMergersandAcquisitions.Api;
using FactSet.SDK.FactSetMergersandAcquisitions.Client;
using FactSet.SDK.FactSetMergersandAcquisitions.Model;

namespace Example
{
    public class GetPublicTargetDealsListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetMergersandAcquisitions.Client.Configuration();

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

            var apiInstance = new DealsApi(config);

            var dealsPublicRequest = new DealsPublicRequest(); // DealsPublicRequest | Request object for `Deals`.

            try
            {
                // Returns a list of deals in which the target is a public company.
                DealsPublicResponse result = apiInstance.GetPublicTargetDealsList(dealsPublicRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling DealsApi.GetPublicTargetDealsList: " + e.Message );
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
 **dealsPublicRequest** | [**DealsPublicRequest**](DealsPublicRequest.md)| Request object for &#x60;Deals&#x60;. | 

### Return type
[**DealsPublicResponse**](DealsPublicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of deals |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | Not Found. The requested data could not be found. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


