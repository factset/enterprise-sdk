# fds.sdk.FactSetOwnership.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content/factset-ownership/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_batch_data**](BatchProcessingApi.md#get_batch_data) | **GET** /batch-result | Returns the response for the Batch Request
[**get_batch_status**](BatchProcessingApi.md#get_batch_status) | **GET** /batch-status | Returns the latest status and metadata for the Batch Request.



# **get_batch_data**
> BatchResultResponse get_batch_data(id)

Returns the response for the Batch Request

Returns the response data for the specified batch id upon successful completion.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import batch_processing_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

    try:
        # Returns the response for the Batch Request
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_batch_data(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**BatchResultResponse**](BatchResultResponse.md)
- **202**: [**BatchStatusResponse**](BatchStatusResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns the request&#39;s response object after the batch request has finished processing and the response is created |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**202** | Batch Request has not finished and the result has NOT been created. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**404** | Resource not found. |  -  |
**429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status**
> BatchStatusResponse get_batch_status(id)

Returns the latest status and metadata for the Batch Request.

Returns the current processing status of the batch request identified by the specified batch Id. Use this endpoint to monitor and track the progress or completion of long-running batch operations.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import batch_processing_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | The Batch Request identifier. This value is returned in the response to a request with `batch=Y`, and is used to check the status and retrieve the results of the request.

    try:
        # Returns the latest status and metadata for the Batch Request.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_batch_status(id)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| The Batch Request identifier. This value is returned in the response to a request with &#x60;batch&#x3D;Y&#x60;, and is used to check the status and retrieve the results of the request. |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Batch request processing is complete and response has been created. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Location - Path to Batch Request result. <br>  |
**202** | Batch request processing is still in progress and the result is not yet available. The response contains the batch ID, timestamps, status, and error details. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**404** | Resource not found. |  -  |
**429** | Too Many Requests. This error occurs when the rate limits for requests have been exceeded. Please wait before making more requests. |  * RateLimit-Limit - The number of allowed requests in the current period. <br>  * RateLimit-Reset - The time when the current rate limit period resets, in seconds. <br>  * Retry-After - The time, in seconds, the user agent should wait before making a follow-up request. <br>  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

