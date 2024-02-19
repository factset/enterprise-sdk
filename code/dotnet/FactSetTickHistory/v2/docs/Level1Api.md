# FactSet.SDK.FactSetTickHistory.Api.Level1Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetLevel1FileStatus**](Level1Api.md#getlevel1filestatus) | **GET** /level1/files/status | Returns the status of the ID
[**GetMinutebarsFileStatus**](Level1Api.md#getminutebarsfilestatus) | **GET** /level1/files/minute-bars/status | Returns the status of the ID
[**GetMinutebarsFiles**](Level1Api.md#getminutebarsfiles) | **GET** /level1/files/minute-bars/get | Returns the Minute bars data in files requested in the /create endpoint
[**GetTickHistoryLevel1Files**](Level1Api.md#gettickhistorylevel1files) | **GET** /level1/files/get | Returns the tick-by-tick data in files requested in the /create endpoint
[**RequestMinutebarsFiles**](Level1Api.md#requestminutebarsfiles) | **POST** /level1/files/minute-bars/create | Requests the creation of Minute bars file
[**RequestTickHistoryCoverage**](Level1Api.md#requesttickhistorycoverage) | **GET** /level1/coverage | Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
[**RequestTickHistoryLevel1Files**](Level1Api.md#requesttickhistorylevel1files) | **POST** /level1/files/create | Requests the creation of tick-by-tick file



<a name="getlevel1filestatus"></a>
# **GetLevel1FileStatus**
> CompletedResponse GetLevel1FileStatus (string id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class GetLevel1FileStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect status of the query

            try
            {
                // Returns the status of the ID
                Level1Api.GetLevel1FileStatusResponseWrapper result = apiInstance.GetLevel1FileStatus(id);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)201:
                        Console.WriteLine(result.Response201);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level1Api.GetLevel1FileStatus: " + e.Message );
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
 **id** | **string**| id returned by files create endpoint to poll and collect status of the query | 

### Return type
GetLevel1FileStatusResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getminutebarsfilestatus"></a>
# **GetMinutebarsFileStatus**
> CompletedResponse GetMinutebarsFileStatus (string id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class GetMinutebarsFileStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect status of the query

            try
            {
                // Returns the status of the ID
                Level1Api.GetMinutebarsFileStatusResponseWrapper result = apiInstance.GetMinutebarsFileStatus(id);

                switch (result.StatusCode)
                {

                    case (HttpStatusCode)201:
                        Console.WriteLine(result.Response201);
                        break;

                    case (HttpStatusCode)202:
                        Console.WriteLine(result.Response202);
                        break;

                }
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level1Api.GetMinutebarsFileStatus: " + e.Message );
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
 **id** | **string**| id returned by files create endpoint to poll and collect status of the query | 

### Return type
GetMinutebarsFileStatusResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** |  The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getminutebarsfiles"></a>
# **GetMinutebarsFiles**
> GetFilesMinuteResponse GetMinutebarsFiles (string id, int? paginationLimit = null, int? paginationOffset = null)

Returns the Minute bars data in files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class GetMinutebarsFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect results of the query
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per response page (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)

            try
            {
                // Returns the Minute bars data in files requested in the /create endpoint
                Level1Api.GetMinutebarsFilesResponseWrapper result = apiInstance.GetMinutebarsFiles(id, paginationLimit, paginationOffset);

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
                Console.WriteLine("Exception when calling Level1Api.GetMinutebarsFiles: " + e.Message );
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
 **id** | **string**| id returned by files create endpoint to poll and collect results of the query | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type
GetMinutebarsFilesResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettickhistorylevel1files"></a>
# **GetTickHistoryLevel1Files**
> GetFilesResponse GetTickHistoryLevel1Files (string id, int? paginationLimit = null, int? paginationOffset = null)

Returns the tick-by-tick data in files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Net;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class GetTickHistoryLevel1FilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect results of the query
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per response page (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)

            try
            {
                // Returns the tick-by-tick data in files requested in the /create endpoint
                Level1Api.GetTickHistoryLevel1FilesResponseWrapper result = apiInstance.GetTickHistoryLevel1Files(id, paginationLimit, paginationOffset);

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
                Console.WriteLine("Exception when calling Level1Api.GetTickHistoryLevel1Files: " + e.Message );
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
 **id** | **string**| id returned by files create endpoint to poll and collect results of the query | 
 **paginationLimit** | **int?**| Specifies the maximum number of results to return per response page | [optional] [default to 20]
 **paginationOffset** | **int?**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] [default to 0]

### Return type
GetTickHistoryLevel1FilesResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="requestminutebarsfiles"></a>
# **RequestMinutebarsFiles**
> SubmittedResponse RequestMinutebarsFiles (MinRequest minRequest)

Requests the creation of Minute bars file

1-minute bars available from 20120101 to previous day. Per request able to fetch upto 6 months of data.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class RequestMinutebarsFilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var minRequest = new MinRequest(); // MinRequest | 

            try
            {
                // Requests the creation of Minute bars file
                SubmittedResponse result = apiInstance.RequestMinutebarsFiles(minRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level1Api.RequestMinutebarsFiles: " + e.Message );
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
 **minRequest** | [**MinRequest**](MinRequest.md)|  | 

### Return type
[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The Request has been Accepted |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="requesttickhistorycoverage"></a>
# **RequestTickHistoryCoverage**
> CoverageResponse RequestTickHistoryCoverage (List<string> tickers = null, string factsetExchangeCode = null, List<string> isins = null)

Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.

Returns coverage for specified tickers for Level1 Data

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class RequestTickHistoryCoverageExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var tickers = new List<string>(); // List<string> | <P> The requested list of one or more tickers.</p>   The `tickers` and `isins`  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   <P> Maximum 10 tickers per request</p>      (optional) 
            var factsetExchangeCode = "AUS";  // string | <p>This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.</p> **NOTE**:Does not support multiple factsetExchangeCodes (optional) 
            var isins = new List<string>(); // List<string> | <P> Specifies the ISIN of the record. </p>    Please enter either the `tickers` or `isins` parameter.     <P> Maximum 10 ISINs per request.</p>       (optional) 

            try
            {
                // Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
                CoverageResponse result = apiInstance.RequestTickHistoryCoverage(tickers, factsetExchangeCode, isins);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level1Api.RequestTickHistoryCoverage: " + e.Message );
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
 **tickers** | [**List&lt;string&gt;**](string.md)| &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      | [optional] 
 **factsetExchangeCode** | **string**| &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes | [optional] 
 **isins** | [**List&lt;string&gt;**](string.md)| &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       | [optional] 

### Return type
[**CoverageResponse**](CoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; |  -  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="requesttickhistorylevel1files"></a>
# **RequestTickHistoryLevel1Files**
> SubmittedResponse RequestTickHistoryLevel1Files (LeveloneRequest leveloneRequest)

Requests the creation of tick-by-tick file

Data available from 20120101 to previous day.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class RequestTickHistoryLevel1FilesExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetTickHistory.Client.Configuration();

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

            var apiInstance = new Level1Api(config);

            var leveloneRequest = new LeveloneRequest(); // LeveloneRequest | 

            try
            {
                // Requests the creation of tick-by-tick file
                SubmittedResponse result = apiInstance.RequestTickHistoryLevel1Files(leveloneRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level1Api.RequestTickHistoryLevel1Files: " + e.Message );
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
 **leveloneRequest** | [**LeveloneRequest**](LeveloneRequest.md)|  | 

### Return type
[**SubmittedResponse**](SubmittedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | The Request has been Accepted |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


