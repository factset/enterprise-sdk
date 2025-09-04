# FactSet.SDK.Formula.Api.CrossSectionalApi

All URIs are relative to *https://api.factset.com/formula-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCrossSectionalDataForList**](CrossSectionalApi.md#getcrosssectionaldataforlist) | **POST** /cross-sectional | Retrieve data items (Screening formulas) for a list of identifiers or defined universe.



<a name="getcrosssectionaldataforlist"></a>
# **GetCrossSectionalDataForList**
> CrossSectionalResponse GetCrossSectionalDataForList (CrossSectionalRequest crossSectionalRequest)

Retrieve data items (Screening formulas) for a list of identifiers or defined universe.

The `/cross-sectional` endpoint is closely aligned with FactSet's powerful data retrieval **Screening language** which is optimized for analysis of data items at single point in time for different entities and is extremely efficient for large universes.   The `/cross-sectional` endpoint supports Long Running asynchronous requests up to **30 minutes** via the `batch` parameter. *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.*  ***  ### Iterated Cross-Sectional Functionality   This endpoint supports the ability to automatically iterate through different cross sections over time. The **Iterated Cross-Sectional Functionality (ICSF)** expands the Cross-Sectional endpoint to support retrieving data items for *multiple dates*, allowing users to take advantage of the Screening engine's efficiency even when history is required.    Use the parameters `startDate`, `endDate`, and `frequency` in the Cross-Sectional endpoint to provide your desired dates. Specify \"0\" in date argument of the Screening formulas provided in the formulas parameter and/or the universe parameter. Lastly, the Iterated Cross-Sectional Functionality is required to run as a `batch` request. Therefore, the batch parameter must be set to \"Y\".    Access to backtesting and batch functionality is required to leverage the Iterated Cross-Sectional Functionality.   **When to use ICSF:**  The ICSF can offer better performance than Time-Series requests when the date range is relatively small, and so it is recommended to use ICSF if the number of IDs requested is greater than the number of dates. If the number of dates is greater than the number of IDs in the request, it is recommended to use Time-Series.   *Note: This is a general rule of thumb and performance may vary depending on the formulas in use.* 

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
    public class GetCrossSectionalDataForListExample
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

            var apiInstance = new CrossSectionalApi(config);

            var crossSectionalRequest = new CrossSectionalRequest(); // CrossSectionalRequest | 

            try
            {
                // Retrieve data items (Screening formulas) for a list of identifiers or defined universe.
                CrossSectionalApi.GetCrossSectionalDataForListResponseWrapper result = apiInstance.GetCrossSectionalDataForList(crossSectionalRequest);

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
                Console.WriteLine("Exception when calling CrossSectionalApi.GetCrossSectionalDataForList: " + e.Message );
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
 **crossSectionalRequest** | [**CrossSectionalRequest**](CrossSectionalRequest.md)|  | 

### Return type
GetCrossSectionalDataForListResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Gets an array of &#x60;Response Objects&#x60; for a list of IDs and Screening formulas. |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  * X-RateLimit-Limit-second -  <br>  * X-RateLimit-Remaining-second -  <br>  * X-RateLimit-Limit-day -  <br>  * X-RateLimit-Remaining-day -  <br>  |
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


