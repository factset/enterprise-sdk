# fds.sdk.IssueTracker.AttachmentApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_file_attachment**](AttachmentApi.md#get_file_attachment) | **GET** /attachments/{id}/{name} | get the matched file attachment
[**get_file_extensions**](AttachmentApi.md#get_file_extensions) | **GET** /attachments/file-extensions | Allowed file types GET endpoint
[**post_file_attachment**](AttachmentApi.md#post_file_attachment) | **POST** /attachments | Post file attachment to Issue Tracker Issue or comment



# **get_file_attachment**
> file_type get_file_attachment(id, name)

get the matched file attachment

It retreive matched file. However, File read won't work until it used in any issue tracker issue/comment.     Note: the Accept header gets ignored and the originally uploaded content-type is returned

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import attachment_api
from fds.sdk.IssueTracker.models import *
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
configuration = fds.sdk.IssueTracker.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IssueTracker.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IssueTracker.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = attachment_api.AttachmentApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | identity value of file attachment
    name = "name_example" # str | name of the file

    try:
        # get the matched file attachment
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_file_attachment(id, name)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling AttachmentApi->get_file_attachment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| identity value of file attachment |
 **name** | **str**| name of the file |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: image/bmp, image/png, image/gif, image/jpeg, application/pdf, text/csv, application/vnd.openxmlformats-officedocument.wordprocessingml.document, text/plain, application/vnd.ms-excel, application/vnd.openxmlformats-officedocument.spreadsheetml.sheet, text/x-r-source, application/x-dosexec, text/html, application/xml, application/sql, application/vnd.ms-officetheme, application/msword, application/vnd.openxmlformats-officedocument.wordprocessingml.template, application/vnd.openxmlformats-officedocument.presentationml.template, application/vnd.ms-powerpoint, application/vnd.openxmlformats-officedocument.presentationml.presentation, application/zip, application/x-7z-compressed, application/octet-stream, text/tab-separated-values, application/x-iwork-keynote, application/vnd.ms-word.document.macroEnabled.12, application/vnd.ms-word.template.macroEnabled.12, application/vnd.ms-excel.sheet.macroEnabled.12, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_file_extensions**
> FileExtension get_file_extensions()

Allowed file types GET endpoint

This will provide information about file extensions allowed to attachments.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import attachment_api
from fds.sdk.IssueTracker.models import *
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
configuration = fds.sdk.IssueTracker.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IssueTracker.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IssueTracker.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = attachment_api.AttachmentApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Allowed file types GET endpoint
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_file_extensions()

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling AttachmentApi->get_file_extensions: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**FileExtension**](FileExtension.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_file_attachment**
> AttachmentResponse post_file_attachment(file)

Post file attachment to Issue Tracker Issue or comment

  This endpoint upload file attachments into Issue Tracker and it allows only single file at a time. It will throws error when tries to upload multiple files in single call.     File size should not exceed 10Mb. More info provided in examples. It allows only few type of files for attachments. Please review \"attachments/file-extensions\" endpoint for list allowed file types.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import attachment_api
from fds.sdk.IssueTracker.models import *
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
configuration = fds.sdk.IssueTracker.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IssueTracker.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IssueTracker.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = attachment_api.AttachmentApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    file = open('/path/to/file', 'rb') # file_type | input file for upload

    try:
        # Post file attachment to Issue Tracker Issue or comment
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_file_attachment(file)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling AttachmentApi->post_file_attachment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **file** | **file_type**| input file for upload |

### Return type

[**AttachmentResponse**](AttachmentResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

