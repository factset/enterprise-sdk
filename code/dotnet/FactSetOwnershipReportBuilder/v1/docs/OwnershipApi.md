# FactSet.SDK.FactSetOwnershipReportBuilder.Api.OwnershipApi

All URIs are relative to *https://api.factset.com/report/ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetOwnershipHolders**](OwnershipApi.md#getownershipholders) | **GET** /holders | Holders of a company or fund
[**GetOwnershipUltimateParent**](OwnershipApi.md#getownershipultimateparent) | **GET** /ultimate-parent | Get FactSet&#39;s ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.



<a name="getownershipholders"></a>
# **GetOwnershipHolders**
> ResponseHolders GetOwnershipHolders (string id, string assetType = null, string holderType = null, string entityType = null, string topn = null, DateTime? date = null)

Holders of a company or fund

Holders of a company or fund

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnershipReportBuilder.Api;
using FactSet.SDK.FactSetOwnershipReportBuilder.Client;
using FactSet.SDK.FactSetOwnershipReportBuilder.Model;

namespace Example
{
    public class GetOwnershipHoldersExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnershipReportBuilder.Client.Configuration();

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

            var apiInstance = new OwnershipApi(config);

            var id = "FDS-US";  // string | Company or Fund Identifier
            var assetType = "EQUITY";  // string | Controls the Asset Type of the data returned (optional)  (default to EQUITY)
            var holderType = "ALL_HOLDERS";  // string | Controls the Holder Type of the data returned (optional)  (default to INSTITUTIONS)
            var entityType = "SECURITY";  // string | Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. (optional)  (default to SECURITY)
            var topn = "ALL";  // string | Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  (optional) 
            var date = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. (optional) 

            try
            {
                // Holders of a company or fund
                ResponseHolders result = apiInstance.GetOwnershipHolders(id, assetType, holderType, entityType, topn, date);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OwnershipApi.GetOwnershipHolders: " + e.Message );
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
 **id** | **string**| Company or Fund Identifier | 
 **assetType** | **string**| Controls the Asset Type of the data returned | [optional] [default to EQUITY]
 **holderType** | **string**| Controls the Holder Type of the data returned | [optional] [default to INSTITUTIONS]
 **entityType** | **string**| Controls the type of Entity data returned. Defaults to Security data, but can also be used to display Company data. | [optional] [default to SECURITY]
 **topn** | **string**| Limits the number of holders returned based on their Market Value position in the security. Default is ALL, otherwise use a valid number above 0.  | [optional] 
 **date** | **DateTime?**| Top Holders as of date expressed in YYYY-MM-DD format. Defaults to latest month-end close; non-month-end dates are converted to month-end dates. | [optional] 

### Return type
[**ResponseHolders**](ResponseHolders.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 2.0 row organized package format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getownershipultimateparent"></a>
# **GetOwnershipUltimateParent**
> ResponseUltimateParent GetOwnershipUltimateParent (string id, string currency = null, List<string> attributes = null, string period = null, string holderType = null, DateTime? date = null)

Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetOwnershipReportBuilder.Api;
using FactSet.SDK.FactSetOwnershipReportBuilder.Client;
using FactSet.SDK.FactSetOwnershipReportBuilder.Model;

namespace Example
{
    public class GetOwnershipUltimateParentExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetOwnershipReportBuilder.Client.Configuration();

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

            var apiInstance = new OwnershipApi(config);

            var id = "FDS-US";  // string | Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL. 
            var currency = "LOCAL";  // string | Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \"LOCAL\" which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  (optional) 
            var attributes = new List<string>(); // List<string> | The columns to be returned in the resulting table (optional) 
            var period = "1m";  // string | The period over which we should return holdings for. (optional)  (default to 6m)
            var holderType = "allHolders";  // string | The holder types which should be included in this table (optional)  (default to institutions)
            var date = DateTime.Parse("Tue Dec 31 00:00:00 UTC 2019");  // DateTime? | The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. (optional) 

            try
            {
                // Get FactSet's ownership breakdown about a specific security.  The returned table will display the institutions, insiders, funds, and beneficial owners that comprise the ownership of the provided security.  These holders will be grouped by the ultimate parent in their entity structure.
                ResponseUltimateParent result = apiInstance.GetOwnershipUltimateParent(id, currency, attributes, period, holderType, date);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling OwnershipApi.GetOwnershipUltimateParent: " + e.Message );
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
 **id** | **string**| Any valid FactSet identifier which points to a security.  This could be Ticker Region, Entity ID, CUSIP, or SEDOL.  | 
 **currency** | **string**| Currency ISO code that any currency-based data should be returned in.  If excluded, the value will default to the special keyword \&quot;LOCAL\&quot; which will cause the currency-based values to be calculated in currency which is local to the exchange it is traded on.  | [optional] 
 **attributes** | [**List&lt;string&gt;**](string.md)| The columns to be returned in the resulting table | [optional] 
 **period** | **string**| The period over which we should return holdings for. | [optional] [default to 6m]
 **holderType** | **string**| The holder types which should be included in this table | [optional] [default to institutions]
 **date** | **DateTime?**| The date as of which this data should be returned. YYYY-MM-DD format. Defaults to current date. | [optional] 

### Return type
[**ResponseUltimateParent**](ResponseUltimateParent.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Expected response; returns JSON data containing STACH 3.1 table format |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **400** | Bad Request. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * Api-Supported-Versions - Supported API versions (semantic versioning) <br>  * Api-Version - API version (semantic versioning) <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **401** | Missing or invalid authentication. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For further assistance, file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **403** | User is forbidden access with current credentials. Reach out to your local FactSet Account Manager for assistance, or file an issue under \&quot;Connectivty - 401 or 403 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **404** | Not found. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **429** | Too many requests - this API is rate-limited to 20 requests per second. For further assistance, file an issue under \&quot;Workflow &amp; Throttling - 400 or 429 Response\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Limit-Remaining - Number of requests remaining for the time window <br>  * X-FactSet-Api-RateLimit-Limit-Reset - Number of seconds remaining until rate limit resets <br>  |
| **500** | Server error. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |
| **503** | Service unavailable. Typically a timeout, or result of a rejected request to prevent service overload. For further assistance, file an issue under \&quot;Performance - 404 and 500 Responses\&quot; using &#x60;Report Issue&#x60; at the top of this page, including the X-DataDirect-Request-Key from the header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet request ID <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


