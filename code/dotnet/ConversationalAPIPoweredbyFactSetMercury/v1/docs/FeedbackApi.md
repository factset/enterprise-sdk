# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Api.FeedbackApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**SendFeedback**](FeedbackApi.md#sendfeedback) | **POST** /feedback | Send feedback on the response to a query.



<a name="sendfeedback"></a>
# **SendFeedback**
> void SendFeedback (FeedbackRequest feedbackRequest)

Send feedback on the response to a query.

Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 

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
    public class SendFeedbackExample
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

            var apiInstance = new FeedbackApi(config);

            var feedbackRequest = new FeedbackRequest(); // FeedbackRequest | Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the `/result` endpoint. Send this along with a boolean representing whether the response was helpful or not. 

            try
            {
                // Send feedback on the response to a query.
                apiInstance.SendFeedback(feedbackRequest);
            }
            catch (ApiException  e)
            {
                Console.WriteLine("Exception when calling FeedbackApi.SendFeedback: " + e.Message );
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
 **feedbackRequest** | [**FeedbackRequest**](FeedbackRequest.md)| Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  | 

### Return type
void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
| **400** | Bad Request to /feedback endpoint |  -  |
| **401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
| **403** | Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  |  -  |
| **405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
| **429** | Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  |
| **500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


