# fds.sdk.BookBuilder.CustomDocumentsFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_custom_upload_list**](CustomDocumentsFetchApi.md#get_custom_upload_list) | **GET** /custom-upload-list | Check out the documents uploaded before to use them in creating books



# **get_custom_upload_list**
> UploadedDocumentsList get_custom_upload_list()

Check out the documents uploaded before to use them in creating books

Retrieves the list of documents uploaded before using the endpoint \"/upload-custom-document\". The documents uploaded are available for 30 days from the date of uploading.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import custom_documents___fetch_api
from fds.sdk.BookBuilder.models import *
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
configuration = fds.sdk.BookBuilder.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.BookBuilder.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.BookBuilder.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = custom_documents___fetch_api.CustomDocumentsFetchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Check out the documents uploaded before to use them in creating books
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_custom_upload_list()

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling CustomDocumentsFetchApi->get_custom_upload_list: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**UploadedDocumentsList**](UploadedDocumentsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains file name, fileURL and the date and time the book was uploaded |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

