# fds.sdk.ConversationalAPIPoweredbyFactSetMercury.FeedbackApi

All URIs are relative to *https://api.factset.com/conversational/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_feedback**](FeedbackApi.md#send_feedback) | **POST** /feedback | Send feedback on the response to a query.



# **send_feedback**
> send_feedback(feedback_request)

Send feedback on the response to a query.

Use this endpoint to provide feedback to FactSet regarding the response to a query. Feedback is used to help us identify areas for improvement in our responses.  Feedback will only be accepted within 24 hours of the original response, and only once for each response ID. If you would like to provide additional feedback, please reach out to your FactSet Support Team representative. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ConversationalAPIPoweredbyFactSetMercury
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.api import feedback_api
from fds.sdk.ConversationalAPIPoweredbyFactSetMercury.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
#
# The confidential client instance should be reused in production environments.
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ConversationalAPIPoweredbyFactSetMercury.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = feedback_api.FeedbackApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    feedback_request = FeedbackRequest(
        data=FeedbackRequestData(
            response_id="response_id_example",
            helpful=True,
            comment="comment_example",
        ),
    ) # FeedbackRequest | Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the `/result` endpoint. Send this along with a boolean representing whether the response was helpful or not. 

    try:
        # Send feedback on the response to a query.
        # example passing only required values which don't have defaults set
        api_instance.send_feedback(feedback_request)


    except fds.sdk.ConversationalAPIPoweredbyFactSetMercury.ApiException as e:
        print("Exception when calling FeedbackApi->send_feedback: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **feedback_request** | [**FeedbackRequest**](FeedbackRequest.md)| Body containing the ID of the response from FactSet Mercury as well as the feedback on that response.  The responseId field must be populated with the ID received from the &#x60;/result&#x60; endpoint. Send this along with a boolean representing whether the response was helpful or not.  |

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
**200** | OK |  * Api-Supported-Versions -  <br>  * Api-Version -  <br>  * Api-Deprected-Versions -  <br>  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  * X-DataDirect-Request-Key -  <br>  |
**400** | Bad Request to /feedback endpoint |  -  |
**401** | Unauthorized - You are not properly authenticated for use of this API. Please make sure you using a valid API key (managed [via this developer portal page](https://developer.factset.com/manage-api-keys)) or valid OAuth 2.0 credentials (see [OAuth 2.0 documentation on the developer portal](https://developer.factset.com/learn/authentication-oauth2)) for access. If you believe you are seeing this message in error, please reach out to your FactSet Support Team representative. |  -  |
**403** | Forbidden - You do not have the proper permissions for this request.   Please make sure you have the proper CACCESS entitlements enabled for this service and that you are using a resource ID that your account has access to.  This may also be due to your IP address being unsupported by the API key you are currently using. Please ensure your IP address is whitelisted for the API key you are using. IP addresses can be managed per API key via [this developer portal page](https://developer.factset.com/manage-api-keys).  |  -  |
**405** | Method Not Allowed - The requested endpoint does not support the used HTTP method. |  -  |
**429** | Too Many Requests - This endpoint is currently rate-limited to 10 requests per second and 300 requests per minute for an individual user serial. If you are receiving an unexpected amount of these errors, please contact the API team by selecting &#x60;Report Issue&#x60; at the top of this page. |  * RateLimit-Limit -  <br>  * RateLimit-Remaining -  <br>  * RateLimit-Reset -  <br>  * Retry-After -  <br>  * X-DataDirect-Request-Key -  <br>  * X-RateLimit-Limit-minute -  <br>  * X-RateLimit-Remaining-minute -  <br>  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

