# fds.sdk.QuantitativeResearchEnvironment.FilesApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analytics_quant_qre_v1_files_server_file_post**](FilesApi.md#analytics_quant_qre_v1_files_server_file_post) | **POST** /analytics/quant/qre/v1/files/{server}/{file} | Starts a file upload
[**analytics_quant_qre_v1_files_uploads_id_get**](FilesApi.md#analytics_quant_qre_v1_files_uploads_id_get) | **GET** /analytics/quant/qre/v1/files/uploads/{id} | Get upload status by id


# **analytics_quant_qre_v1_files_server_file_post**
> FileUploadStatus analytics_quant_qre_v1_files_server_file_post(server, file)

Starts a file upload

This endpoint takes a file and uploads it

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import files_api
from fds.sdk.QuantitativeResearchEnvironment.model.file_upload_status import FileUploadStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_api.FilesApi(api_client)
    server = "server_example" # str | The server to upload the file to. Either `interactive` or `batch`.
    file = "file_example" # str | The file name to upload the file to. Existing directory can be specified.
    body = open('/path/to/file', 'rb') # file_type |  (optional)

    # example passing only required values which don't have defaults set
    try:
        # Starts a file upload
        api_response = api_instance.analytics_quant_qre_v1_files_server_file_post(server, file)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling FilesApi->analytics_quant_qre_v1_files_server_file_post: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Starts a file upload
        api_response = api_instance.analytics_quant_qre_v1_files_server_file_post(server, file, body=body)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling FilesApi->analytics_quant_qre_v1_files_server_file_post: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **server** | **str**| The server to upload the file to. Either &#x60;interactive&#x60; or &#x60;batch&#x60;. |
 **file** | **str**| The file name to upload the file to. Existing directory can be specified. |
 **body** | **file_type**|  | [optional]

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: *
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Expected response, contains the relative URL in the Location header to check the status of the upload. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **analytics_quant_qre_v1_files_uploads_id_get**
> FileUploadStatus analytics_quant_qre_v1_files_uploads_id_get(id)

Get upload status by id

This is the endpoint to check on the progress of a previous upload request.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.QuantitativeResearchEnvironment
from fds.sdk.QuantitativeResearchEnvironment.api import files_api
from fds.sdk.QuantitativeResearchEnvironment.model.file_upload_status import FileUploadStatus
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
    host = "https://api.factset.com"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.QuantitativeResearchEnvironment.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.QuantitativeResearchEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = files_api.FilesApi(api_client)
    id = "id_example" # str | From url, provided by location header or response body in the upload start endpoint

    # example passing only required values which don't have defaults set
    try:
        # Get upload status by id
        api_response = api_instance.analytics_quant_qre_v1_files_uploads_id_get(id)
        pprint(api_response)
    except fds.sdk.QuantitativeResearchEnvironment.ApiException as e:
        print("Exception when calling FilesApi->analytics_quant_qre_v1_files_uploads_id_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| From url, provided by location header or response body in the upload start endpoint |

### Return type

[**FileUploadStatus**](FileUploadStatus.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response. Signals that the upload is finished. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**202** | Expected response. Signals that the upload is still in progress. |  * Location - Relative URL to check status of the request. <br>  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Request timeout. Retry the request later |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

