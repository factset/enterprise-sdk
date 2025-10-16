# FactSet.SDK.FactSetFundamentals.Api.FundamentalsPointInTimeApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**PostFundamentalsFiscalPeriods**](FundamentalsPointInTimeApi.md#postfundamentalsfiscalperiods) | **POST** /periods | Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
[**PostFundamentalsPITData**](FundamentalsPointInTimeApi.md#postfundamentalspitdata) | **POST** /point-in-time | Retrieve Point-in-Time data for multiple securities.



<a name="postfundamentalsfiscalperiods"></a>
# **PostFundamentalsFiscalPeriods**
> BatchStatusResponse PostFundamentalsFiscalPeriods (PeriodsRequest periodsRequest)

Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.

This endpoint initiates an asynchronous batch job to fetch detailed information about fiscal periods. The request allows filtering for fiscal periods ending within a specified calendar date range. The response provides Point-in-Time (PIT) details, showing when each period's information was first published and when it was superseded. This is crucial for historical backtesting. All requests will return a `202 Accepted` response with a `Location` header pointing to the `/batch-status` endpoint. Use the `id` from the status response to check for completion and retrieve the result from the `/batch-result` endpoint. **All timestamps are in UTC.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentals.Api;
using FactSet.SDK.FactSetFundamentals.Client;
using FactSet.SDK.FactSetFundamentals.Model;

namespace Example
{
    public class PostFundamentalsFiscalPeriodsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentals.Client.Configuration();

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

            var apiInstance = new FundamentalsPointInTimeApi(config);

            var periodsRequest = new PeriodsRequest(); // PeriodsRequest | Request object containing parameters for the fiscal periods request.

            try
            {
                // Fiscal Periods: Retrieve fiscal period details for multiple securities using POST.
                BatchStatusResponse result = apiInstance.PostFundamentalsFiscalPeriods(periodsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundamentalsPointInTimeApi.PostFundamentalsFiscalPeriods: " + e.Message );
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
 **periodsRequest** | [**PeriodsRequest**](PeriodsRequest.md)| Request object containing parameters for the fiscal periods request. | 

### Return type
[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. |  * Location - The URL to poll for status of the batch request. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. |  -  |
| **500** | Internal Server Error. |  -  |
| **503** | Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. |  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="postfundamentalspitdata"></a>
# **PostFundamentalsPITData**
> BatchStatusResponse PostFundamentalsPITData (FundamentalsPITRequest fundamentalsPITRequest)

Retrieve Point-in-Time data for multiple securities.

This endpoint initiates an asynchronous batch job to fetch Point-in-Time (PIT) data. PIT data allows you to view fundamentals data as it was known on a specific date. This is crucial for backtesting trading strategies, performing academic research, and avoiding lookahead bias. All requests will return a `202 Accepted` response with a `Location` header pointing to the `/batch-status` endpoint. Use the `id` from the status response to check for completion and retrieve the result from the `/batch-result` endpoint. **All timestamps are in UTC.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFundamentals.Api;
using FactSet.SDK.FactSetFundamentals.Client;
using FactSet.SDK.FactSetFundamentals.Model;

namespace Example
{
    public class PostFundamentalsPITDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFundamentals.Client.Configuration();

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

            var apiInstance = new FundamentalsPointInTimeApi(config);

            var fundamentalsPITRequest = new FundamentalsPITRequest(); // FundamentalsPITRequest | Request object containing parameters for the PIT fundamentals request.

            try
            {
                // Retrieve Point-in-Time data for multiple securities.
                BatchStatusResponse result = apiInstance.PostFundamentalsPITData(fundamentalsPITRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FundamentalsPointInTimeApi.PostFundamentalsPITData: " + e.Message );
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
 **fundamentalsPITRequest** | [**FundamentalsPITRequest**](FundamentalsPITRequest.md)| Request object containing parameters for the PIT fundamentals request. | 

### Return type
[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Batch request has been accepted. Poll the status URL provided in the &#x60;Location&#x60; header to check for completion. |  * Location - The URL to poll for status of the batch request. <br>  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too Many Requests - The rate limit for the API has been exceeded. Wait before sending more requests. See &#x60;Retry-After&#x60; header. |  -  |
| **500** | Internal Server Error. |  -  |
| **503** | Service Unavailable - The server is currently unable to handle the request due to temporary overloading or maintenance of the server. This implies a temporary condition which will be alleviated after some delay. Please try again later. Check &#x60;Retry-After&#x60; header if present. |  * Retry-After - Indicates how long to wait (in seconds or as an HTTP date) before retrying the request when receiving a 429 or 503 response. <br>  * X-DataDirect-Request-Key - FactSet-specific request tracing identifier used for troubleshooting purposes. Please include this key when reporting issues. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


