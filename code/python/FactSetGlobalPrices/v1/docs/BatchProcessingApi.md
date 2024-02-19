# fds.sdk.FactSetGlobalPrices.BatchProcessingApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_batch_data**](BatchProcessingApi.md#get_batch_data) | **GET** /factset-global-prices/v1/batch-result | Returns the response for a Batch Request 
[**get_batch_status**](BatchProcessingApi.md#get_batch_status) | **GET** /factset-global-prices/v1/batch-status | Returns the status for a Batch Request 



# **get_batch_data**
> BatchResultResponse get_batch_data(id)

Returns the response for a Batch Request 

Returns the response data for the underlying batch request that is specified by the id.  By default, this endpoint will return data as JSON. If you wish to receive your data in CSV format, you can edit the header to have the \"accept\" parameter as \"text/csv\" instead of \"application/json\". 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import batch_processing_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Batch Request identifier.

    try:
        # Returns the response for a Batch Request 
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_batch_data(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| Batch Request identifier. |

### Return type

[**BatchResultResponse**](BatchResultResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Request Response Object when the batch request has been completed and the response is created |  -  |
**202** | The batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status**
> BatchStatusResponse get_batch_status(id)

Returns the status for a Batch Request 

Return the status for the underlying batch request that is specified by the id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetGlobalPrices
from fds.sdk.FactSetGlobalPrices.api import batch_processing_api
from fds.sdk.FactSetGlobalPrices.models import *
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
configuration = fds.sdk.FactSetGlobalPrices.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetGlobalPrices.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetGlobalPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Batch Request identifier.

    try:
        # Returns the status for a Batch Request 
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_batch_status(id)

        pprint(api_response)

    except fds.sdk.FactSetGlobalPrices.ApiException as e:
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
**201** | The batch Request has been completed and the response has been created. |  * Location - Path to Batch Request result. <br>  |
**202** | The batch Request has not finished and the result has NOT been created. |  -  |
**404** | Resource not found. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

