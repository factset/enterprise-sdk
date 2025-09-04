# FactSet.SDK.Formula.Api.TimeSeriesApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetTimeSeriesDataForList**](TimeSeriesApi.md#gettimeseriesdataforlist) | **POST** /time-series | Retrieve data items (FQL formulas) for a list of identifiers or defined universe.



<a name="gettimeseriesdataforlist"></a>
# **GetTimeSeriesDataForList**
> TimeSeriesResponse GetTimeSeriesDataForList (TimeSeriesRequest timeSeriesRequest)

Retrieve data items (FQL formulas) for a list of identifiers or defined universe.

The `/time-series` endpoint is closely aligned with FactSet's powerful data retrieval language **FactSet Query Language (FQL)** which is optimized for time-series analysis. FQL can also perform sophisticated statistical, mathematical, logical, and other complex operations on the data.    This endpoint has a unique **TIMESERIES** data object that pairs the requested data with FactSet provided dates. This helps reduce the need for additional data requests and reduces the work required by users.  The `/time-series` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.Formula.Api;
using FactSet.SDK.Formula.Client;
using FactSet.SDK.Formula.Model;

namespace Example
{
    public class GetTimeSeriesDataForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.Formula.Client.Configuration();

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

            var apiInstance = new TimeSeriesApi(config);

            var timeSeriesRequest = new TimeSeriesRequest(); // TimeSeriesRequest | 

            try
            {
                // Retrieve data items (FQL formulas) for a list of identifiers or defined universe.
                TimeSeriesApi.GetTimeSeriesDataForListResponseWrapper result = apiInstance.GetTimeSeriesDataForList(timeSeriesRequest);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)200:
                        Console.WriteLine(result.Response200);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling TimeSeriesApi.GetTimeSeriesDataForList: " + e.Message );
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
 **timeSeriesRequest** | [**TimeSeriesRequest**](TimeSeriesRequest.md)|  | 

### Return type
GetTimeSeriesDataForListResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets an array of &#x60;Response Objects&#x60; for a list of IDs and FQL formulas. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  |
| **202** | Batch request has been accepted. |  * Location - URL to poll for status of batch request. <br>  * X-FactSet-Api-Units-Limit -  <br>  * X-FactSet-Api-Units-Remaining -  <br>  |
| **400** | Bad Request |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **401** | Missing or invalid authentication. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **403** | Not Authorized. This error will will occur if the user lacks the required permissions or if the API request is made from an IP address not specified in the API Key configuration. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **404** | Endpoint Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **405** | Method Not Allowed |  -  |
| **406** | Bad Accept Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **408** | Request Timeout. This error may be returned if it takes more than 29 seconds for the request to process or if a batch request takes more than 30 minutes to process. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **413** | Content Too Large. This error may be returned if the request payload size is too large to be processed in the alloted amount of time. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **415** | Bad Content-Type Header |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **429** | Rate Limits Exceeded |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  * Retry-After -  <br>  |
| **500** | Generic Server Error |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **501** | Not Implemented |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |
| **503** | Service Temporarily Unavailable |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


