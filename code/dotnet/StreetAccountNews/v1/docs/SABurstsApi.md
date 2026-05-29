# FactSet.SDK.StreetAccountNews.Api.SABurstsApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLatestBurstFile**](SABurstsApi.md#getlatestburstfile) | **GET** /sa-bursts/latest-file | Retrieve the latest burst file metadata and download URL



<a name="getlatestburstfile"></a>
# **GetLatestBurstFile**
> BurstFileResponse GetLatestBurstFile ()

Retrieve the latest burst file metadata and download URL

Returns JSON containing the timestamp and a download URL for the most recent StreetAccount burst ZIP file. Use the `downloadUrl` in the response to download the file.  **Response fields**  - **`burstDateTime`** — Timestamp of the latest burst file in ISO 8601 UTC format (YYYY-MM-DDTHH:mm:ssZ).  - **`downloadUrl`** — Opaque URL to download the burst file. Issue   a `GET` request to this URL to receive an HTTP 302 redirect to the file.   The URL contains a short-lived token unique to this burst and   is valid for **5 minutes**. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.StreetAccountNews.Api;
using FactSet.SDK.StreetAccountNews.Client;
using FactSet.SDK.StreetAccountNews.Model;

namespace Example
{
    public class GetLatestBurstFileExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.StreetAccountNews.Client.Configuration();

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

            var apiInstance = new SABurstsApi(config);


            try
            {
                // Retrieve the latest burst file metadata and download URL
                BurstFileResponse result = apiInstance.GetLatestBurstFile();
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling SABurstsApi.GetLatestBurstFile: " + e.Message );
                Console.WriteLine("Status Code: "+ e.ErrorCode);
                Console.WriteLine(e.StackTrace);
            }
        }
    }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type
[**BurstFileResponse**](BurstFileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Latest burst file metadata. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses.  |  -  |
| **404** | No burst file available. |  -  |
| **429** | Limit Exceeded |  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


