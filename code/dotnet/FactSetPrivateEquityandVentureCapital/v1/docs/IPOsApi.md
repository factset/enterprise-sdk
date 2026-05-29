# FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api.IPOsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetIPO**](IPOsApi.md#getipo) | **GET** /ipos | Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
[**SearchIPOs**](IPOsApi.md#searchipos) | **POST** /ipos/search | Search and filter the universe of portfolio company IPOs by status, size, and date range.



<a name="getipo"></a>
# **GetIPO**
> IPODetailsResponse GetIPO (List<int> ids)

Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.

Provides comprehensive details on the **Initial Public Offering (IPO)** process for portfolio companies, typically representing an exit for a fund. Information includes the **IPO size**, **pricing**, date, and other relevant capital markets data.  Use the `/transactions/ma-activity` endpoint to find fund deal ids for your request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class GetIPOExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new IPOsApi(config);

            var ids = new List<int>(); // List<int> | A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger & Acquisition (M&A) or Venture Capital (VC) deal**. This ID represents the main event being tracked.

            try
            {
                // Retrieve details of an Initial Public Offering (IPO) related to a portfolio company exit.
                IPODetailsResponse result = apiInstance.GetIPO(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IPOsApi.GetIPO: " + e.Message );
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
 **ids** | [**List&lt;int&gt;**](int.md)| A list of unique FactSet-generated identifiers (Deal IDs) assigned to a **Merger &amp; Acquisition (M&amp;A) or Venture Capital (VC) deal**. This ID represents the main event being tracked. | 

### Return type
[**IPODetailsResponse**](IPODetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="searchipos"></a>
# **SearchIPOs**
> IPOSearchResponse SearchIPOs (IPOSearchRequest iPOSearchRequest)

Search and filter the universe of portfolio company IPOs by status, size, and date range.

Enables filtering of the IPO universe by criteria such as **IPO status** (e.g., Completed, Withdrawn), the **date range** of the IPO, and the minimum or maximum **offering size** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Api;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client;
using FactSet.SDK.FactSetPrivateEquityandVentureCapital.Model;

namespace Example
{
    public class SearchIPOsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateEquityandVentureCapital.Client.Configuration();

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

            var apiInstance = new IPOsApi(config);

            var iPOSearchRequest = new IPOSearchRequest(); // IPOSearchRequest | 

            try
            {
                // Search and filter the universe of portfolio company IPOs by status, size, and date range.
                IPOSearchResponse result = apiInstance.SearchIPOs(iPOSearchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling IPOsApi.SearchIPOs: " + e.Message );
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
 **iPOSearchRequest** | [**IPOSearchRequest**](IPOSearchRequest.md)|  | 

### Return type
[**IPOSearchResponse**](IPOSearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


