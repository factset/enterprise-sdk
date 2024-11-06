# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api.ChatApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetChatResult**](ChatApi.md#getchatresult) | **POST** /result | Retrieve the completed response for your query
[**GetChatStatus**](ChatApi.md#getchatstatus) | **POST** /status | Retrieve the status of a chat response generation process
[**SendQuery**](ChatApi.md#sendquery) | **POST** /query | Send a natural language query to FactSet Mercury



<a name="getchatresult"></a>
# **GetChatResult**
> QueryResponse GetChatResult (ChatPollingRequest chatPollingRequest)

Retrieve the completed response for your query

Use this endpoint to retrieve the results of your query to FactSet Mercury. This endpoint is the final step in the query polling process. Once the status for your jobId is `created`, you can retrieve the query response using this `/result` endpoint.  The response will contain the natural language answer to your query, supporting data and content that FactSet Mercury has surfaced, and suggestions for further engagement with FactSet Mercury.   Data and content will be returned using various defined and standard formats, such as markdown and Microsoft Adaptive Cards. Please see the examples and data schemas associated with the `/result` endpoint for details.  **Please note:** The ID contained in the response represents the ID for the response itself, it does not match the chatId or jobId. Please use this response ID at the `/feedback` endpoint to provide feedback on the response. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;

namespace Example
{
    public class GetChatResultExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration();

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

            var apiInstance = new ChatApi(config);

            var chatPollingRequest = new ChatPollingRequest(); // ChatPollingRequest | Polling request body, containing the job ID for your response generation process

            try
            {
                // Retrieve the completed response for your query
                QueryResponse result = apiInstance.GetChatResult(chatPollingRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChatApi.GetChatResult: " + e.Message );
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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| Polling request body, containing the job ID for your response generation process | 

### Return type
[**QueryResponse**](QueryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **400** | Bad Request - The request was invalid or could not be processed. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. |  -  |
| **404** | Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - This endpoint is currently rate-limited to 10 requests per second for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="getchatstatus"></a>
# **GetChatStatus**
> StatusPollResponse GetChatStatus (ChatPollingRequest chatPollingRequest)

Retrieve the status of a chat response generation process

Use this endpoint to retrieve the status of a chat response for a given chat job ID (received from the `/query` endpoint). Poll the `/status` endpoint with your job ID to confirm when your data is ready.  Answers may take minutes to generate, depending on the complexity of the query.  Returns a 202 status code if the response is still processing, and a 201 status code if the response is ready. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;

namespace Example
{
    public class GetChatStatusExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration();

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

            var apiInstance = new ChatApi(config);

            var chatPollingRequest = new ChatPollingRequest(); // ChatPollingRequest | Polling request body, containing the job ID for your response generation process

            try
            {
                // Retrieve the status of a chat response generation process
                StatusPollResponse result = apiInstance.GetChatStatus(chatPollingRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChatApi.GetChatStatus: " + e.Message );
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
 **chatPollingRequest** | [**ChatPollingRequest**](ChatPollingRequest.md)| Polling request body, containing the job ID for your response generation process | 

### Return type
[**StatusPollResponse**](StatusPollResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **202** | Accepted |  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. |  -  |
| **404** | Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - This endpoint is currently rate-limited to 10 requests per second for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


<a name="sendquery"></a>
# **SendQuery**
> QueryChatResponse SendQuery (QueryChatRequest queryChatRequest)

Send a natural language query to FactSet Mercury

Use this endpoint to send a natural language query to FactSet Mercury, our large language model for surfacing FactSet datasets through conversational natural language queries. A request to `/query` will initiate the response generation process for the given query. Queries can be sent as standalone questions or as part of a conversational message chain, using a chat ID to maintain context.  Responses from `/query` contain the following: * **jobId**: used in subsequent endpoints to poll the status of response generation and retrieve the response from FactSet Mercury. * **chatId**: optionally used to ask further questions in the same conversational message chain.  Please see the [Conversational API Online Assistant page](https://my.apps.factset.com/oa/pages/23209) for details around available content and types of questions the Conversational API can answer. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```csharp
using System;
using System.Threading.Tasks;
using FactSet.SDK.Utils.Authentication;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client;
using FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model;

namespace Example
{
    public class SendQueryExample
    {
        public static async Task Main()
        {
            var config = new FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Client.Configuration();

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

            var apiInstance = new ChatApi(config);

            var queryChatRequest = new QueryChatRequest(); // QueryChatRequest | Request body to the `/query` endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation.

            try
            {
                // Send a natural language query to FactSet Mercury
                QueryChatResponse result = apiInstance.SendQuery(queryChatRequest);
                Console.WriteLine(result.ToJson());
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling ChatApi.SendQuery: " + e.Message );
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
 **queryChatRequest** | [**QueryChatRequest**](QueryChatRequest.md)| Request body to the &#x60;/query&#x60; endpoint, containing the natural language query to be sent to FactSet Mercury and an optional chat ID for continuing an ongoing conversation. | 

### Return type
[**QueryChatResponse**](QueryChatResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Location -  <br>  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **400** | Bad Request - The request was invalid or could not be processed. |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the proper permissions for this request. Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to. |  -  |
| **404** | Resource Not Found - Could not find the requested resource. Please make sure you are using a valid endpoint and resource ID for the request. |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - The /query endpoint is currently rate-limited to 10 requests per minute and 200 requests per hour for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team at [genai.offplatform@factset.com](genai.offplatform@factset.com). |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-Hour -  <br>  * X-RateLimit-Remaining-Hour -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


