# FactSet.SDK.FactSetETF.Api.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetEtfReferenceData**](ReferenceApi.md#getetfreferencedata) | **GET** /factset-etf/v1/reference | Return reference data for an ETF.
[**GetEtfReferenceDataForList**](ReferenceApi.md#getetfreferencedataforlist) | **POST** /factset-etf/v1/reference | Fetch Reference Data for a large list of ETF securities.



<a name="getetfreferencedata"></a>
# **GetEtfReferenceData**
> EtfReferenceDataResponse GetEtfReferenceData (List<string> ids, List<string> metrics = null, List<Category> categories = null)

Return reference data for an ETF.

Returns reference data items for Exchange Traded Funds. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetETF.Api;
using FactSet.SDK.FactSetETF.Client;
using FactSet.SDK.FactSetETF.Model;

namespace Example
{
    public class GetEtfReferenceDataExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetETF.Client.Configuration();

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

            var apiInstance = new ReferenceApi(config);

            var ids = new List<string>(); // List<string> | The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var metrics = new List<string>(); // List<string> | List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint.  (optional) 
            var categories = new List<Category>(); // List<Category> | Groupings of `metrics` data items. Supply a list of categories below to return collections of data items in response. |category|description| |- --|- --| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  (optional) 

            try
            {
                // Return reference data for an ETF.
                EtfReferenceDataResponse result = apiInstance.GetEtfReferenceData(ids, metrics, categories);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetEtfReferenceData: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The list of ETF identifiers. Accepted identifer types include FactSet Permanent Ids, Tickers, CUSIP, SEDOL, ISIN. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **metrics** | [**List&lt;string&gt;**](string.md)| List of individdual data items for Exchange Traded Funds. By default only the fsymId and requestId are returned. To fetch a list of all available data items, use the **_/metrics** endpoint.  | [optional] 
 **categories** | [**List&lt;Category&gt;**](Category.md)| Groupings of &#x60;metrics&#x60; data items. Supply a list of categories below to return collections of data items in response. |category|description| |- --|- --| |BENCHMARK_DETAILS|Details surrounding the underlying Benchmark Id and Segment Banchmark| |CLASSIFICATION|FactSet Fund Classification Codes and Names, across Asset Class, Broad  Geography, Fund Categories, Focus, Niche, and more.| |COSTS_FEES|Expenses and Fees such as capital gains, expense ratio, management fees, and more.| |COUNTERPARTY|Credit and Swap Counterparty details| |CREATE_REDEEM|Creation and Redemption Sizes| |DESCRIPTIVE|General Descriptive information such as name, objectives, issuer details, launch dates, website, and more.| |DISTRIBUTIONS|Dividend Dates, Dividend Treatmetns, Min/Max Cap Gains| |DOCUMENTATION|Details surrounding reporting information.| |GEARING|Leverage factors, inverse flags, and more.| |HEDGE|Hedging Information| |RISK|CIFSC Risk Ratings| |SERVICE_PROVIDERS|Distributors, issuers, and Advisor details| |STATUS|Actively Managed Flags| |STRATEGY|Segment Codes, selection criteria, strategy codes, weighting schemes, and lending details.| |STRUCTURE|ETF Type, backing codes, synthetic types, ucits compliance, legal structures, and more.| |TAX|Tax Types, distribution takes, K1 Flags, and more.|  | [optional] 

### Return type
[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETF Reference Data Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getetfreferencedataforlist"></a>
# **GetEtfReferenceDataForList**
> EtfReferenceDataResponse GetEtfReferenceDataForList (EtfReferenceDataRequest etfReferenceDataRequest)

Fetch Reference Data for a large list of ETF securities.

Returns reference data items for a list of Exchange Traded Funds. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetETF.Api;
using FactSet.SDK.FactSetETF.Client;
using FactSet.SDK.FactSetETF.Model;

namespace Example
{
    public class GetEtfReferenceDataForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetETF.Client.Configuration();

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

            var apiInstance = new ReferenceApi(config);

            var etfReferenceDataRequest = new EtfReferenceDataRequest(); // EtfReferenceDataRequest | Request object for Exchange Traded Funds

            try
            {
                // Fetch Reference Data for a large list of ETF securities.
                EtfReferenceDataResponse result = apiInstance.GetEtfReferenceDataForList(etfReferenceDataRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetEtfReferenceDataForList: " + e.Message );
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
 **etfReferenceDataRequest** | [**EtfReferenceDataRequest**](EtfReferenceDataRequest.md)| Request object for Exchange Traded Funds | 

### Return type
[**EtfReferenceDataResponse**](EtfReferenceDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | ETF Reference Data Response |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


