# fds.sdk.BookBuilder.CustomDocumentsUploadApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**upload_custom_document**](CustomDocumentsUploadApi.md#upload_custom_document) | **POST** /upload-custom-document | Upload a custom document



# **upload_custom_document**
> UploadDocumentResponse upload_custom_document()

Upload a custom document

Upload any third-party documents that need to be included in the final PDF. Once uploaded, the successful response will be a unique fileurl that can be used to add the files to the PDF output using the create-book endpoint. Supported files include Powerpoint, Word, RTF, and PDF. The total size should not exceed 250MB and each file should not exceed 10MB. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import custom_documents___upload_api
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
    api_instance = custom_documents___upload_api.CustomDocumentsUploadApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    file = [
        open('/path/to/file', 'rb'),
    ] # [file_type] |  (optional)

    try:
        # Upload a custom document
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.upload_custom_document(file=file)

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling CustomDocumentsUploadApi->upload_custom_document: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **[file_type]**|  | [optional]

### Return type

[**UploadDocumentResponse**](UploadDocumentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains file name, fileURL of the book uploaded |  -  |
**400** | Invalid ticker or Unknown error |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

