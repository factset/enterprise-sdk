# FactSet.SDK.InvestmentResearch.Api.ResearchApi

All URIs are relative to *https://api.factset.com/content/investment-research/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetCount**](ResearchApi.md#getcount) | **POST** /count | Returns the count of documents for specified source.
[**GetInvestmentResearchData**](ResearchApi.md#getinvestmentresearchdata) | **POST** /search | Retrieve investment research documents and related metadata within FactSet coverage.
[**GetPurchaseLinks**](ResearchApi.md#getpurchaselinks) | **POST** /purchase-amr | Retrieve purchase links and metadata for specified research documents.



<a name="getcount"></a>
# **GetCount**
> CountResponse GetCount (CountRequest countRequest)

Returns the count of documents for specified source.

Returns the available count of documents (up to 10000) based on search criteria. This endpoint accepts up to 10 IDs per request.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentResearch.Api;
using FactSet.SDK.InvestmentResearch.Client;
using FactSet.SDK.InvestmentResearch.Model;

namespace Example
{
    public class GetCountExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentResearch.Client.Configuration();

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

            var apiInstance = new ResearchApi(config);

            var countRequest = new CountRequest(); // CountRequest | 

            try
            {
                // Returns the count of documents for specified source.
                CountResponse result = apiInstance.GetCount(countRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ResearchApi.GetCount: " + e.Message );
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
 **countRequest** | [**CountRequest**](CountRequest.md)|  | 

### Return type
[**CountResponse**](CountResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getinvestmentresearchdata"></a>
# **GetInvestmentResearchData**
> InvestmentResearchResponse GetInvestmentResearchData (SearchRequest searchRequest)

Retrieve investment research documents and related metadata within FactSet coverage.

The /search endpoint returns the details about research documents, including headline, source, contributors, analyst information, categories, document links, relevant IDs and publication date.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentResearch.Api;
using FactSet.SDK.InvestmentResearch.Client;
using FactSet.SDK.InvestmentResearch.Model;

namespace Example
{
    public class GetInvestmentResearchDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentResearch.Client.Configuration();

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

            var apiInstance = new ResearchApi(config);

            var searchRequest = new SearchRequest(); // SearchRequest | 

            try
            {
                // Retrieve investment research documents and related metadata within FactSet coverage.
                InvestmentResearchResponse result = apiInstance.GetInvestmentResearchData(searchRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ResearchApi.GetInvestmentResearchData: " + e.Message );
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
 **searchRequest** | [**SearchRequest**](SearchRequest.md)|  | 

### Return type
[**InvestmentResearchResponse**](InvestmentResearchResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of downloadable URLs consisting of investment research documents with related metadata. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getpurchaselinks"></a>
# **GetPurchaseLinks**
> PurchaseResponse GetPurchaseLinks (PurchaseRequest purchaseRequest)

Retrieve purchase links and metadata for specified research documents.

Returns a purchase link (link to the full document) along with document metadata for each requested document ID. Primarily used for documents sourced from Aftermarket Research (AMR), where full-document access is via a purchase link distinct from the preview link returned by `/search`.  **Note:** A successful request to this endpoint is treated as a purchase and counts toward the pool subscription. If the same research report is requested again more than 24 hours after the original request, that later request counts toward the individual user's subscription count instead. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.InvestmentResearch.Api;
using FactSet.SDK.InvestmentResearch.Client;
using FactSet.SDK.InvestmentResearch.Model;

namespace Example
{
    public class GetPurchaseLinksExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.InvestmentResearch.Client.Configuration();

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

            var apiInstance = new ResearchApi(config);

            var purchaseRequest = new PurchaseRequest(); // PurchaseRequest | 

            try
            {
                // Retrieve purchase links and metadata for specified research documents.
                PurchaseResponse result = apiInstance.GetPurchaseLinks(purchaseRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ResearchApi.GetPurchaseLinks: " + e.Message );
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
 **purchaseRequest** | [**PurchaseRequest**](PurchaseRequest.md)|  | 

### Return type
[**PurchaseResponse**](PurchaseResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Array of documents with purchase links and associated metadata, grouped by requested document ID. |  -  |
| **400** | Bad request. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


