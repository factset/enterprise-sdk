# FactSet.SDK.FactSetBenchmarks.Api.BenchmarkConstituentsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetBenchmarkConstituents**](BenchmarkConstituentsApi.md#getbenchmarkconstituents) | **GET** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**GetBenchmarkConstituentsForList**](BenchmarkConstituentsApi.md#getbenchmarkconstituentsforlist) | **POST** /factset-benchmarks/v1/constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
[**GetFIBenchmarkConstituents**](BenchmarkConstituentsApi.md#getfibenchmarkconstituents) | **GET** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
[**GetFIBenchmarkConstituentsForList**](BenchmarkConstituentsApi.md#getfibenchmarkconstituentsforlist) | **POST** /factset-benchmarks/v1/fixed-income-constituents | Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.


<a name="getbenchmarkconstituents"></a>
# **GetBenchmarkConstituents**
> BenchmarkConstituentsResponse GetBenchmarkConstituents (List<string> ids, string date = null, string currency = null)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **_/id-list** for valid identifiers.   

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetBenchmarkConstituentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new BenchmarkConstituentsApi(config);
            var ids = new List<string>(); // List<string> | Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
            var date = date_example;  // string | Date of holding expressed in YYYY-MM-DD format. (optional) 
            var currency = currency_example;  // string | Currency for response. (optional) 

            try
            {
                // Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
                BenchmarkConstituentsResponse result = apiInstance.GetBenchmarkConstituents(ids, date, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BenchmarkConstituentsApi.GetBenchmarkConstituents: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Benchmark Identifiers. Reference the helper endpoint **_/id-list** to get a sample list of  valid identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; | 
 **date** | **string**| Date of holding expressed in YYYY-MM-DD format. | [optional] 
 **currency** | **string**| Currency for response. | [optional] 

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getbenchmarkconstituentsforlist"></a>
# **GetBenchmarkConstituentsForList**
> BenchmarkConstituentsResponse GetBenchmarkConstituentsForList (BenchmarkConstituentsRequest benchmarkConstituentsRequest)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. Use the helper endpoint **_/id-list** for valid identifiers. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetBenchmarkConstituentsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new BenchmarkConstituentsApi(config);
            var benchmarkConstituentsRequest = new BenchmarkConstituentsRequest(); // BenchmarkConstituentsRequest | Requests Benchmark Constituents for the given identifier and date.

            try
            {
                // Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
                BenchmarkConstituentsResponse result = apiInstance.GetBenchmarkConstituentsForList(benchmarkConstituentsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BenchmarkConstituentsApi.GetBenchmarkConstituentsForList: " + e.Message );
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
 **benchmarkConstituentsRequest** | [**BenchmarkConstituentsRequest**](BenchmarkConstituentsRequest.md)| Requests Benchmark Constituents for the given identifier and date. | 

### Return type

[**BenchmarkConstituentsResponse**](BenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Benchmark data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfibenchmarkconstituents"></a>
# **GetFIBenchmarkConstituents**
> FixedIncomeBenchmarkConstituentsResponse GetFIBenchmarkConstituents (List<string> ids, string date = null, string currency = null)

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetFIBenchmarkConstituentsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new BenchmarkConstituentsApi(config);
            var ids = new List<string>(); // List<string> | Fixed Income Benchmark Identifiers. You must be authorized for the `ids` requested, otherwise you will receive an error. <p>***ids limit** =  1 per request*</p>
            var date = date_example;  // string | Date of holding expressed in YYYY-MM-DD format. (optional) 
            var currency = currency_example;  // string | Currency for response. (optional) 

            try
            {
                // Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value.
                FixedIncomeBenchmarkConstituentsResponse result = apiInstance.GetFIBenchmarkConstituents(ids, date, currency);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BenchmarkConstituentsApi.GetFIBenchmarkConstituents: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| Fixed Income Benchmark Identifiers. You must be authorized for the &#x60;ids&#x60; requested, otherwise you will receive an error. &lt;p&gt;***ids limit** &#x3D;  1 per request*&lt;/p&gt; | 
 **date** | **string**| Date of holding expressed in YYYY-MM-DD format. | [optional] 
 **currency** | **string**| Currency for response. | [optional] 

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Constituent data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a name="getfibenchmarkconstituentsforlist"></a>
# **GetFIBenchmarkConstituentsForList**
> FixedIncomeBenchmarkConstituentsResponse GetFIBenchmarkConstituentsForList (FixedIncomeBenchmarkConstituentsRequest fixedIncomeBenchmarkConstituentsRequest)

Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.

Returns the requested Fixed Income Benchmark Constituents and respective Weights, Price and Market Value. You must be authorized for the `ids` requested. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetBenchmarks.Api;
using FactSet.SDK.FactSetBenchmarks.Client;
using FactSet.SDK.FactSetBenchmarks.Model;

namespace Example
{
    public class GetFIBenchmarkConstituentsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.PAEngine.Client.Configuration();

            // Examples for each supported authentication method are below,
            // choose one that satisfies your use case.

            /* (Preferred) OAuth 2.0: FactSetOAuth2 */
            // See https://github.com/FactSet/enterprise-sdk#oauth-20
            // for information on how to create the app-config.json file
            // See https://github.com/FactSet/enterprise-sdk-utils-dotnet#authentication
            // for more information on using the ConfidentialClient class
            ConfidentialClient confidentialClient = await ConfidentialClient.CreateAsync("/path/to/app-config.json");
            config.OAuth2Client = confidentialClient;

            /* Basic authentication: FactSetApiKey */
            // See https://github.com/FactSet/enterprise-sdk#api-key
            // for information how to create an API key
            // config.Username = "USERNAME-SERIAL";
            // config.Password = "API-KEY";

            var apiInstance = new BenchmarkConstituentsApi(config);
            var fixedIncomeBenchmarkConstituentsRequest = new FixedIncomeBenchmarkConstituentsRequest(); // FixedIncomeBenchmarkConstituentsRequest | Requests Fixed Income Benchmark Constituents for the given identifier and date.

            try
            {
                // Returns the requested Benchmark Constituents and respective Weights, Price and Market Value.
                FixedIncomeBenchmarkConstituentsResponse result = apiInstance.GetFIBenchmarkConstituentsForList(fixedIncomeBenchmarkConstituentsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling BenchmarkConstituentsApi.GetFIBenchmarkConstituentsForList: " + e.Message );
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
 **fixedIncomeBenchmarkConstituentsRequest** | [**FixedIncomeBenchmarkConstituentsRequest**](FixedIncomeBenchmarkConstituentsRequest.md)| Requests Fixed Income Benchmark Constituents for the given identifier and date. | 

### Return type

[**FixedIncomeBenchmarkConstituentsResponse**](FixedIncomeBenchmarkConstituentsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fixed Income Constituent data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

