# fds.sdk.FactSetContentAPIBatch.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_batch_data**](BatchProcessingApi.md#get_batch_data) | **GET** /batch/v1/result | Returns the response for a Batch Request
[**get_batch_data_with_post**](BatchProcessingApi.md#get_batch_data_with_post) | **POST** /batch/v1/result | Returns the response for a Batch Request
[**get_batch_status**](BatchProcessingApi.md#get_batch_status) | **GET** /batch/v1/status | Returns the status for a Batch Request
[**get_batch_status_with_post**](BatchProcessingApi.md#get_batch_status_with_post) | **POST** /batch/v1/status | Returns the status for a Batch Request


# **get_batch_data**
> BatchDataResponse get_batch_data(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetContentAPIBatch
from fds.sdk.FactSetContentAPIBatch.api import batch_processing_api
from fds.sdk.FactSetContentAPIBatch.model.error_response import ErrorResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_data_response import BatchDataResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_status_response import BatchStatusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetContentAPIBatch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    id = "id_example" # str | Batch Request identifier.

    try:
        # Returns the response for a Batch Request
        api_response = api_instance.get_batch_data(id)
        responseWrapper = {
            200: api_response.get_response_200,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.FactSetContentAPIBatch.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Batch Request identifier. |

### Return type

[**BatchDataResponse**](BatchDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request Response Object when batch request has completed and response is created |  -  |
**202** | Batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_data_with_post**
> BatchDataResponse get_batch_data_with_post(batch_data_request)

Returns the response for a Batch Request

Return the response data for the underlying batch request that is specified by the id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetContentAPIBatch
from fds.sdk.FactSetContentAPIBatch.api import batch_processing_api
from fds.sdk.FactSetContentAPIBatch.model.error_response import ErrorResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_data_request import BatchDataRequest
from fds.sdk.FactSetContentAPIBatch.model.batch_data_response import BatchDataResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_status_response import BatchStatusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetContentAPIBatch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    batch_data_request = BatchDataRequest(
        id="2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c",
    ) # BatchDataRequest | Batch Data Request Post Body

    try:
        # Returns the response for a Batch Request
        api_response = api_instance.get_batch_data_with_post(batch_data_request)
        responseWrapper = {
            200: api_response.get_response_200,
            202: api_response.get_response_202,
        }
        pprint(responseWrapper[api_response.status_code]())

    except fds.sdk.FactSetContentAPIBatch.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_data_with_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_data_request** | [**BatchDataRequest**](BatchDataRequest.md)| Batch Data Request Post Body |

### Return type

[**BatchDataResponse**](BatchDataResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request Response Object when batch request has completed and response is created. |  -  |
**202** | Batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status**
> BatchStatusResponse get_batch_status(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetContentAPIBatch
from fds.sdk.FactSetContentAPIBatch.api import batch_processing_api
from fds.sdk.FactSetContentAPIBatch.model.error_response import ErrorResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_status_response import BatchStatusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetContentAPIBatch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    id = "id_example" # str | Batch Request identifier.

    try:
        # Returns the status for a Batch Request
        api_response = api_instance.get_batch_status(id)
        pprint(api_response)

    except fds.sdk.FactSetContentAPIBatch.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Batch Request identifier. |

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
**201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
**202** | Batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status_with_post**
> BatchStatusResponse get_batch_status_with_post(batch_status_request)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetContentAPIBatch
from fds.sdk.FactSetContentAPIBatch.api import batch_processing_api
from fds.sdk.FactSetContentAPIBatch.model.error_response import ErrorResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_status_response import BatchStatusResponse
from fds.sdk.FactSetContentAPIBatch.model.batch_status_request import BatchStatusRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetContentAPIBatch.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetContentAPIBatch.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    batch_status_request = BatchStatusRequest(
        id="2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c",
    ) # BatchStatusRequest | Batch Status Request Post Body

    try:
        # Returns the status for a Batch Request
        api_response = api_instance.get_batch_status_with_post(batch_status_request)
        pprint(api_response)

    except fds.sdk.FactSetContentAPIBatch.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_status_with_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_status_request** | [**BatchStatusRequest**](BatchStatusRequest.md)| Batch Status Request Post Body |

### Return type

[**BatchStatusResponse**](BatchStatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
**202** | Batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

