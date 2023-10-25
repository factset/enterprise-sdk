# FactSet.SDK.FactSetPrivateMarkets.Api.FinancialsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetFinancials**](FinancialsApi.md#getfinancials) | **GET** /factset-private-markets/v1/financials | Returns Private Company Financials for a list of ids.
[**GetFinancialsForList**](FinancialsApi.md#getfinancialsforlist) | **POST** /factset-private-markets/v1/financials | Returns Private Company Financials for a list of ids.



<a name="getfinancials"></a>
# **GetFinancials**
> FinancialsResponse GetFinancials (List<string> ids, List<string> fields, string startDate, string endDate = null)

Returns Private Company Financials for a list of ids.

Returns Private Company Financials Information. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateMarkets.Api;
using FactSet.SDK.FactSetPrivateMarkets.Client;
using FactSet.SDK.FactSetPrivateMarkets.Model;

namespace Example
{
    public class GetFinancialsExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateMarkets.Client.Configuration();

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

            var apiInstance = new FinancialsApi(config);

            var ids = new List<string>(); // List<string> | The requested FactSet Private Market Entity Identifier in XXXXXX-E format.<p>**Max Ids Limit set to 3000 in a single request**</p>   *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\"POST\\\" method.</p>* 
            var fields = new List<string>(); // List<string> | Private Markets Financials Fields. 
            var startDate = "2019-01-01";  // string | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. 
            var endDate = "2019-12-31";  // string | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional) 

            try
            {
                // Returns Private Company Financials for a list of ids.
                FinancialsResponse result = apiInstance.GetFinancials(ids, fields, startDate, endDate);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancials: " + e.Message );
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
 **ids** | [**List&lt;string&gt;**](string.md)| The requested FactSet Private Market Entity Identifier in XXXXXX-E format.&lt;p&gt;**Max Ids Limit set to 3000 in a single request**&lt;/p&gt;   *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids,       which may lead to exceeding this request line limit of 8KB, its       advised for any requests with large request lines to be requested through       the respective \\\&quot;POST\\\&quot; method.&lt;/p&gt;*  | 
 **fields** | [**List&lt;string&gt;**](string.md)| Private Markets Financials Fields.  | 
 **startDate** | **string**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | 
 **endDate** | **string**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional] 

### Return type
[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Fetches Private Company Financials for a list of ids. |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getfinancialsforlist"></a>
# **GetFinancialsForList**
> FinancialsResponse GetFinancialsForList (FinancialsRequest financialsRequest)

Returns Private Company Financials for a list of ids.

Returns a private markets financials object for the requested ids. 

### Example
```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.FactSetPrivateMarkets.Api;
using FactSet.SDK.FactSetPrivateMarkets.Client;
using FactSet.SDK.FactSetPrivateMarkets.Model;

namespace Example
{
    public class GetFinancialsForListExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.FactSetPrivateMarkets.Client.Configuration();

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

            var apiInstance = new FinancialsApi(config);

            var financialsRequest = new FinancialsRequest(); // FinancialsRequest | Request Body to request a list of Private Market financials objects.

            try
            {
                // Returns Private Company Financials for a list of ids.
                FinancialsResponse result = apiInstance.GetFinancialsForList(financialsRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FinancialsApi.GetFinancialsForList: " + e.Message );
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
 **financialsRequest** | [**FinancialsRequest**](FinancialsRequest.md)| Request Body to request a list of Private Market financials objects. | 

### Return type
[**FinancialsResponse**](FinancialsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Private Company financials data items |  -  |
| **400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
| **401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
| **403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
| **415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
| **500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


