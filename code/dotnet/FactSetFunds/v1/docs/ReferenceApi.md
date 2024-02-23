# FactSet.SDK.FactSetFunds.Api.ReferenceApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFundsBenchmarkDetails**](ReferenceApi.md#getfundsbenchmarkdetails) | **GET** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark Details
[**GetFundsBenchmarkDetailsForList**](ReferenceApi.md#getfundsbenchmarkdetailsforlist) | **POST** /factset-funds/v1/benchmark-details | Get the Fund&#39;s Primary and Segment Benchmark details for large list of ids.
[**GetFundsClassifications**](ReferenceApi.md#getfundsclassifications) | **GET** /factset-funds/v1/classifications | Get basic Fund Classifications
[**GetFundsClassificationsForList**](ReferenceApi.md#getfundsclassificationsforlist) | **POST** /factset-funds/v1/classifications | Get basic Fund Classifications for a large list of ids.
[**GetFundsCostsFees**](ReferenceApi.md#getfundscostsfees) | **GET** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees.
[**GetFundsCostsFeesForList**](ReferenceApi.md#getfundscostsfeesforlist) | **POST** /factset-funds/v1/costs-fees | Get the Fund&#39;s Costs, Investment minimums and Risk, and Fees for large list of ids.
[**GetFundsManagers**](ReferenceApi.md#getfundsmanagers) | **GET** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a list of ids.
[**GetFundsManagersForList**](ReferenceApi.md#getfundsmanagersforlist) | **POST** /factset-funds/v1/managers | Get a list of Fund Managers and related details for a large list of ids.
[**GetFundsSummary**](ReferenceApi.md#getfundssummary) | **GET** /factset-funds/v1/summary | Get basic reference summary data for a Fund.
[**GetFundsSummaryForList**](ReferenceApi.md#getfundssummaryforlist) | **POST** /factset-funds/v1/summary | Get basic reference data for a large list of Fund ids.
[**GetRelatedFunds**](ReferenceApi.md#getrelatedfunds) | **GET** /factset-funds/v1/related-funds | Get a list of Related Funds for a list of Fund ids.
[**GetRelatedFundsForList**](ReferenceApi.md#getrelatedfundsforlist) | **POST** /factset-funds/v1/related-funds | Get a list of Related Funds for a large list of Fund ids.



<a name="getfundsbenchmarkdetails"></a>
# **GetFundsBenchmarkDetails**
> BenchmarkDetailsResponse GetFundsBenchmarkDetails (List<string> ids)

Get the Fund's Primary and Segment Benchmark Details

Fetch the Fund's Benchmark and Segment Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsBenchmarkDetailsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Get the Fund's Primary and Segment Benchmark Details
                BenchmarkDetailsResponse result = apiInstance.GetFundsBenchmarkDetails(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsBenchmarkDetails: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**BenchmarkDetailsResponse**](BenchmarkDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Benchmark Details response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundsbenchmarkdetailsforlist"></a>
# **GetFundsBenchmarkDetailsForList**
> BenchmarkDetailsResponse GetFundsBenchmarkDetailsForList (BenchmarkDetailsRequest benchmarkDetailsRequest)

Get the Fund's Primary and Segment Benchmark details for large list of ids.

Fetch the Fund's Benchmark and Segement Benchmark ids. These ids can be then used in the [Benchmarks API](https://developer.factset.com/api-catalog/factset-benchmarks-api) to fetch index-level prices, returns, constituents data. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsBenchmarkDetailsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var benchmarkDetailsRequest = new BenchmarkDetailsRequest(); // BenchmarkDetailsRequest | The Benchmark Details request body, allowing the user to specify a list of ids.

            try
            {
                // Get the Fund's Primary and Segment Benchmark details for large list of ids.
                BenchmarkDetailsResponse result = apiInstance.GetFundsBenchmarkDetailsForList(benchmarkDetailsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsBenchmarkDetailsForList: " + e.Message );
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
 **benchmarkDetailsRequest** | [**BenchmarkDetailsRequest**](BenchmarkDetailsRequest.md)| The Benchmark Details request body, allowing the user to specify a list of ids. | 

### Return type
[**BenchmarkDetailsResponse**](BenchmarkDetailsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Benchmark Details response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundsclassifications"></a>
# **GetFundsClassifications**
> ClassificationsResponse GetFundsClassifications (List<string> ids)

Get basic Fund Classifications

Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.<p> FactSet Mutual Funds Reference uses FactSet's proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.</p><p>For more details regarding FactSet's Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules & Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)</p><p> |Classification Type|Description| |- --|- --| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund's mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size & Style, Sector, Precious Metals, Absolute Returns); based on the fund's mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund's classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund's mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund's classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund's mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund's mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund's mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund's mandate.| </p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsClassificationsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Get basic Fund Classifications
                ClassificationsResponse result = apiInstance.GetFundsClassifications(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsClassifications: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**ClassificationsResponse**](ClassificationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Summaries response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundsclassificationsforlist"></a>
# **GetFundsClassificationsForList**
> ClassificationsResponse GetFundsClassificationsForList (ClassificationsRequest classificationsRequest)

Get basic Fund Classifications for a large list of ids.

Fetch basic fund classification data, such as Asset Class, Category, Focus, Niche, Region, and more.<p> FactSet Mutual Funds Reference uses FactSet's proprietary Fund Classification System, which categorizes funds using a rules-based system that is derived from seven core classifications. This system evaluates the asset class, economic development level, and geographical region as described in each fund's prospectus and marketing materials. Fund exposure details are presented on successively granular levels- category, then focus, and then niche. Moreover, FactSet Fund Reference captures over 40 unique data points for U.S. mutual funds. All data items are grouped in one of two levels, either as a Fund or as a Share Class.</p><p>For more details regarding FactSet's Fund Classification, visit Online Assistant [21436](https://my.apps.factset.com/oa/pages/21436) or download - [FactSet Fund Classification System Rules & Methodology](https://my.apps.factset.com/oa/cms/oaAttachment/4547a2f4-5df5-4ec9-a0d3-7d51610dd637/26837)</p><p> |Classification Type|Description| |- --|- --| |Asset Class|The asset class of the fund (e.g. Equity, Fixed Income, Currency, Commodities, Asset Allocation, or Alternatives) based on the fund's mandate.| |Category|The 1st of 3 asset-class-specific, hierarchical exposure tiers; the broadest category the fund falls under within its asset class (e.g., Size & Style, Sector, Precious Metals, Absolute Returns); based on the fund's mandate.| |Focus|The 2nd of 3 asset-class-specific, hierarchical exposure tiers; the fund's classification within its category (e.g. Small Cap, Energy, Palladium, Long/Short); based on the fund's mandate.| |Niche|The 3rd of 3 asset-class-specific, hierarchical exposure tiers; The fund's classification within its Focus. Most granular tier of exposure sort (e.g., Growth, Coal, Physically held, Merger Arbitrage); based on the fund's mandate.| |Economic Development Level|The country development level of the fund (Developed, Emerging, Frontier, or Blended) based on the fund's mandate.| |Region|The broad regional exposure of the fund (e.g., Latin America, Asia-Pacific, Global) based on the fund's mandate.| |Specific Geography|The specific geographic exposure of the fund (e.g., Developed Europe, Chile, Asia-Pacific Ex-Japan) based on the fund's mandate.| </p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsClassificationsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var classificationsRequest = new ClassificationsRequest(); // ClassificationsRequest | The Classifications request body, allowing the user to specify a list of ids.

            try
            {
                // Get basic Fund Classifications for a large list of ids.
                ClassificationsResponse result = apiInstance.GetFundsClassificationsForList(classificationsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsClassificationsForList: " + e.Message );
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
 **classificationsRequest** | [**ClassificationsRequest**](ClassificationsRequest.md)| The Classifications request body, allowing the user to specify a list of ids. | 

### Return type
[**ClassificationsResponse**](ClassificationsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Classifications response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundscostsfees"></a>
# **GetFundsCostsFees**
> CostsFeesResponse GetFundsCostsFees (List<string> ids, string date = null, string currency = null)

Get the Fund's Costs, Investment minimums and Risk, and Fees.

Fetch the Fund's Costs, Investment minimums and Risk, and Fees. This subcategory includes management fees, 12b-1 fees, expense ratios, and several other data items. The value for each specified share class is expressed as a percentage of the AUM. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsCostsFeesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
            var date = "2019-12-31";  // string | The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional) 
            var currency = "\"LOCAL\"";  // string | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional)  (default to "LOCAL")

            try
            {
                // Get the Fund's Costs, Investment minimums and Risk, and Fees.
                CostsFeesResponse result = apiInstance.GetFundsCostsFees(ids, date, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsCostsFees: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 
 **date** | **string**| The date requested in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional] 
 **currency** | **string**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] [default to &quot;LOCAL&quot;]

### Return type
[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Costs and Fees response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundscostsfeesforlist"></a>
# **GetFundsCostsFeesForList**
> CostsFeesResponse GetFundsCostsFeesForList (CostsFeesRequest costsFeesRequest)

Get the Fund's Costs, Investment minimums and Risk, and Fees for large list of ids.

Fetch the Fund's Costs, Investment minimums and Risk, and Fees. Data Items include Expense Ratios, investment minimums and maximums, swing prices, entry and exit expenses, and more. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsCostsFeesForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var costsFeesRequest = new CostsFeesRequest(); // CostsFeesRequest | The Costs and Fees request body, allowing the user to specify a list of ids.

            try
            {
                // Get the Fund's Costs, Investment minimums and Risk, and Fees for large list of ids.
                CostsFeesResponse result = apiInstance.GetFundsCostsFeesForList(costsFeesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsCostsFeesForList: " + e.Message );
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
 **costsFeesRequest** | [**CostsFeesRequest**](CostsFeesRequest.md)| The Costs and Fees request body, allowing the user to specify a list of ids. | 

### Return type
[**CostsFeesResponse**](CostsFeesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Cost and Fees response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundsmanagers"></a>
# **GetFundsManagers**
> ManagersResponse GetFundsManagers (List<string> ids)

Get a list of Fund Managers and related details for a list of ids.

Fetch basic Fund manager details, such as Title, Phone, Job Id and Name. NOTE - A subscription to FactSet's Ownership product is required to access formulas in this Asset Managers subcategory. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsManagersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Get a list of Fund Managers and related details for a list of ids.
                ManagersResponse result = apiInstance.GetFundsManagers(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsManagers: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**ManagersResponse**](ManagersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Managers response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundsmanagersforlist"></a>
# **GetFundsManagersForList**
> ManagersResponse GetFundsManagersForList (ManagersRequest managersRequest)

Get a list of Fund Managers and related details for a large list of ids.

Fetch basic Fund manager details, such as Title, Phone, Job Id and Name.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsManagersForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var managersRequest = new ManagersRequest(); // ManagersRequest | The Funds Managers request body, allowing the user to specify a list of ids.

            try
            {
                // Get a list of Fund Managers and related details for a large list of ids.
                ManagersResponse result = apiInstance.GetFundsManagersForList(managersRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsManagersForList: " + e.Message );
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
 **managersRequest** | [**ManagersRequest**](ManagersRequest.md)| The Funds Managers request body, allowing the user to specify a list of ids. | 

### Return type
[**ManagersResponse**](ManagersResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Funds Managers response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundssummary"></a>
# **GetFundsSummary**
> SummariesResponse GetFundsSummary (List<string> ids)

Get basic reference summary data for a Fund.

Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsSummaryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Get basic reference summary data for a Fund.
                SummariesResponse result = apiInstance.GetFundsSummary(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsSummary: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Fund Summaries response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfundssummaryforlist"></a>
# **GetFundsSummaryForList**
> SummariesResponse GetFundsSummaryForList (SummariesRequest summariesRequest)

Get basic reference data for a large list of Fund ids.

Fetch basic reference data for the requested fund(s), including countryDomicile, shrClass, shrClassInceptDate, etc.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetFundsSummaryForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var summariesRequest = new SummariesRequest(); // SummariesRequest | The Funds Summary request body, allowing the user to specify a list of ids.

            try
            {
                // Get basic reference data for a large list of Fund ids.
                SummariesResponse result = apiInstance.GetFundsSummaryForList(summariesRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetFundsSummaryForList: " + e.Message );
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
 **summariesRequest** | [**SummariesRequest**](SummariesRequest.md)| The Funds Summary request body, allowing the user to specify a list of ids. | 

### Return type
[**SummariesResponse**](SummariesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Funds Summary response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrelatedfunds"></a>
# **GetRelatedFunds**
> RelatedFundsResponse GetRelatedFunds (List<string> ids)

Get a list of Related Funds for a list of Fund ids.

Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetRelatedFundsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var ids = new List<string>(); // List<string> | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 

            try
            {
                // Get a list of Related Funds for a list of Fund ids.
                RelatedFundsResponse result = apiInstance.GetRelatedFunds(ids);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetRelatedFunds: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  | 

### Return type
[**RelatedFundsResponse**](RelatedFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Related Funds response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getrelatedfundsforlist"></a>
# **GetRelatedFundsForList**
> RelatedFundsResponse GetRelatedFundsForList (RelatedFundsRequest relatedFundsRequest)

Get a list of Related Funds for a large list of Fund ids.

Fetch the five related fund share classes. Fund share classes can be related if they belong to the same Fund Classification segment, have the same share class type, have the same legal structure, and have the same country of primary exchange. Beyond the baseline criteria, the five most relevant funds are determined based on whether they follow the same benchmark, have the same maturity, and have the same selection strategy as the specified share class. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetFunds.Api;
using FactSet.SDK.FactSetFunds.Client;
using FactSet.SDK.FactSetFunds.Model;

namespace Example
{
    public class GetRelatedFundsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetFunds.Client.Configuration();

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

            var relatedFundsRequest = new RelatedFundsRequest(); // RelatedFundsRequest | The Related Funds request body, allowing the user to specify a list of ids.

            try
            {
                // Get a list of Related Funds for a large list of Fund ids.
                RelatedFundsResponse result = apiInstance.GetRelatedFundsForList(relatedFundsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ReferenceApi.GetRelatedFundsForList: " + e.Message );
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
 **relatedFundsRequest** | [**RelatedFundsRequest**](RelatedFundsRequest.md)| The Related Funds request body, allowing the user to specify a list of ids. | 

### Return type
[**RelatedFundsResponse**](RelatedFundsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The Related Funds response object. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


