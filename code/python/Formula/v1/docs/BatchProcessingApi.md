# fds.sdk.Formula.BatchProcessingApi

All URIs are relative to *https://api.factset.com/formula-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_batch_data**](BatchProcessingApi.md#get_batch_data) | **GET** /v1/batch-result | Returns the response for a Batch Request
[**get_batch_data_with_post**](BatchProcessingApi.md#get_batch_data_with_post) | **POST** /v1/batch-result | Returns the status for a Batch Request
[**get_batch_status**](BatchProcessingApi.md#get_batch_status) | **GET** /v1/batch-status | Returns the status for a Batch Request
[**get_batch_status_with_post**](BatchProcessingApi.md#get_batch_status_with_post) | **POST** /v1/batch-status | Returns the status for a Batch Request



# **get_batch_data**
> BatchDataResponse get_batch_data(id)

Returns the response for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import batch_processing_api
from fds.sdk.Formula.models import *
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
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
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

    except fds.sdk.Formula.ApiException as e:
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
**404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_data_with_post**
> BatchDataResponse get_batch_data_with_post(batch_data_request)

Returns the status for a Batch Request

Returns the response data for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import batch_processing_api
from fds.sdk.Formula.models import *
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
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    batch_data_request = BatchDataRequest(
        data=BatchDataRequestData(
            id="2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c",
        ),
    ) # BatchDataRequest | 

    try:
        # Returns the status for a Batch Request
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_batch_data_with_post(batch_data_request)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.Formula.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_data_with_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_data_request** | [**BatchDataRequest**](BatchDataRequest.md)|  |

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
**200** | Request Response Object when batch request has completed and response is created |  -  |
**202** | Batch Request has not finished and the result has NOT been created. |  -  |
**404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status**
> BatchStatusResponse get_batch_status(id)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import batch_processing_api
from fds.sdk.Formula.models import *
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
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | Batch Request identifier.

    try:
        # Returns the status for a Batch Request
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_batch_status(id)

        pprint(api_response)

    except fds.sdk.Formula.ApiException as e:
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
**404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_batch_status_with_post**
> BatchStatusResponse get_batch_status_with_post(batch_data_request)

Returns the status for a Batch Request

Return the status for the underlying batch request that is specified by the id.    The Formula API supports Long Running asynchronous requests up to **20 minutes** via the `batch` parameter in the `/time-series` endpoint and up to **10 minutes** in the `/cross-sectional` endpoint.    *This feature is available to Individual Users subscribed to the Performance Package and Performance Package Plus Performance Tiers and all Production Users. If you are unsure which Performance Tier you are subscribed to or you would like to gain access to the batch capabilities, please contact your FactSet Account Team or \"Report Issue\" above and our support teams can assist.* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Formula
from fds.sdk.Formula.api import batch_processing_api
from fds.sdk.Formula.models import *
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
configuration = fds.sdk.Formula.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Formula.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Formula.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = batch_processing_api.BatchProcessingApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    batch_data_request = BatchDataRequest(
        data=BatchDataRequestData(
            id="2df43e85-ea0f-45c6-bf4a-2baf4d1eaa3c",
        ),
    ) # BatchDataRequest | 

    try:
        # Returns the status for a Batch Request
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_batch_status_with_post(batch_data_request)

        pprint(api_response)

    except fds.sdk.Formula.ApiException as e:
        print("Exception when calling BatchProcessingApi->get_batch_status_with_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **batch_data_request** | [**BatchDataRequest**](BatchDataRequest.md)|  |

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
**404** | Not Found |  * api-version -  <br>  * api-supported-versions -  <br>  * api-deprecated-versions -  <br>  * chain-id -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

