# FactSet.SDK.FactSetTickHistory.Api.Level2Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetStatusLevel2**](Level2Api.md#getstatuslevel2) | **GET** /level2/files/status | Returns the status of the ID
[**GetTickHistoryFilesLevel2**](Level2Api.md#gettickhistoryfileslevel2) | **GET** /level2/files/get | Returns the tick history files requested in the /create endpoint
[**Getlevel2id**](Level2Api.md#getlevel2id) | **POST** /level2/files/create | Returns the ID for the requested data.



<a name="getstatuslevel2"></a>
# **GetStatusLevel2**
> CompletedResponse GetStatusLevel2 (string id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example
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
    public class GetStatusLevel2Example
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

            var apiInstance = new Level2Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect status of the query

            try
            {
                // Returns the status of the ID
                Level2Api.GetStatusLevel2ResponseWrapper result = apiInstance.GetStatusLevel2(id);

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
                Console.WriteLine("Exception when calling Level2Api.GetStatusLevel2: " + e.Message );
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
GetStatusLevel2ResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
| **202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="gettickhistoryfileslevel2"></a>
# **GetTickHistoryFilesLevel2**
> LeveltwoGetFilesResponse GetTickHistoryFilesLevel2 (string id, int? paginationLimit = null, int? paginationOffset = null)

Returns the tick history files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example
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
    public class GetTickHistoryFilesLevel2Example
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

            var apiInstance = new Level2Api(config);

            var id = "id_example";  // string | id returned by files create endpoint to poll and collect results of the query
            var paginationLimit = 20;  // int? | Specifies the maximum number of results to return per response page (optional)  (default to 20)
            var paginationOffset = 0;  // int? | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)  (default to 0)

            try
            {
                // Returns the tick history files requested in the /create endpoint
                Level2Api.GetTickHistoryFilesLevel2ResponseWrapper result = apiInstance.GetTickHistoryFilesLevel2(id, paginationLimit, paginationOffset);

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
                Console.WriteLine("Exception when calling Level2Api.GetTickHistoryFilesLevel2: " + e.Message );
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
GetTickHistoryFilesLevel2ResponseWrapper

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
| **202** |  The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **404** | id not found |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getlevel2id"></a>
# **Getlevel2id**
> SubmittedResponse Getlevel2id (LevelTwoRequest levelTwoRequest)

Returns the ID for the requested data.

Data available from past 6 years to current date.

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetTickHistory.Api;
using FactSet.SDK.FactSetTickHistory.Client;
using FactSet.SDK.FactSetTickHistory.Model;

namespace Example
{
    public class Getlevel2idExample
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

            var apiInstance = new Level2Api(config);

            var levelTwoRequest = new LevelTwoRequest(); // LevelTwoRequest | 

            try
            {
                // Returns the ID for the requested data.
                SubmittedResponse result = apiInstance.Getlevel2id(levelTwoRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling Level2Api.Getlevel2id: " + e.Message );
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
 **levelTwoRequest** | [**LevelTwoRequest**](LevelTwoRequest.md)|  | 

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
| **202** | The Request has been Accepted.  |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
| **400** | Bad request |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **429** | Too many requests. |  -  |
| **500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


