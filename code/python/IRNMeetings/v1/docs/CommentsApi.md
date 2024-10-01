# fds.sdk.IRNMeetings.CommentsApi

All URIs are relative to *https://api.factset.com/research/irn/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_comment**](CommentsApi.md#create_comment) | **POST** /meetings/{meetingId}/comments | Create a comment to a Meeting
[**create_comment_attachment**](CommentsApi.md#create_comment_attachment) | **POST** /meetings/{meetingId}/comments/{commentId}/attachments | Create a comment attachment to a Meeting
[**delete_comment**](CommentsApi.md#delete_comment) | **DELETE** /meetings/{meetingId}/comments/{commentId} | Delete a Comment from a Meeting
[**download_comment_attachment_for_comment**](CommentsApi.md#download_comment_attachment_for_comment) | **GET** /meetings/{meetingId}/comments/{commentId}/attachments/{attachmentId}/download | Download single attachment detail of a comment belonging to a meeting
[**get_comment**](CommentsApi.md#get_comment) | **GET** /meetings/{meetingId}/comments/{commentId} | Get details of a comment belonging to a meeting
[**get_comment_attachments**](CommentsApi.md#get_comment_attachments) | **GET** /meetings/{meetingId}/comments/{commentId}/attachments | Get attachments summary of a comment belonging to a meeting
[**get_comments**](CommentsApi.md#get_comments) | **GET** /meetings/{meetingId}/comments | Get all comments for a meeting
[**patch_comment**](CommentsApi.md#patch_comment) | **PATCH** /meetings/{meetingId}/comments/{commentId} | Edit a comment for a meeting



# **create_comment**
> NewItemDto create_comment(meeting_id)

Create a comment to a Meeting

Create a comment to a Meeting by providing the meeting id and comment details.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | The meeting Id to which the comment will be added
    create_comment_dto = CreateCommentDto(
        author_id="author_id_example",
        parent_comment_id="parent_comment_id_example",
        body="body_example",
        attachments_count=1,
    ) # CreateCommentDto | The details of the comment to be created (optional)

    try:
        # Create a comment to a Meeting
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.create_comment(meeting_id, create_comment_dto=create_comment_dto)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->create_comment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| The meeting Id to which the comment will be added |
 **create_comment_dto** | [**CreateCommentDto**](CreateCommentDto.md)| The details of the comment to be created | [optional]

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_comment_attachment**
> NewItemDto create_comment_attachment(meeting_id, comment_id, file)

Create a comment attachment to a Meeting

Create a attachment on a comment of a Meeting by providing the meeting id and comment id and attachment details.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id
    file = open('/path/to/file', 'rb') # file_type | 

    try:
        # Create a comment attachment to a Meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_comment_attachment(meeting_id, comment_id, file)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->create_comment_attachment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |
 **file** | **file_type**|  |

### Return type

[**NewItemDto**](NewItemDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Created |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **delete_comment**
> delete_comment(meeting_id, comment_id)

Delete a Comment from a Meeting

Delete a Comment from a Meeting by providing the meeting id and comment id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id

    try:
        # Delete a Comment from a Meeting
        # example passing only required values which don't have defaults set
        api_instance.delete_comment(meeting_id, comment_id)


    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->delete_comment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **download_comment_attachment_for_comment**
> file_type download_comment_attachment_for_comment(meeting_id, comment_id, attachment_id)

Download single attachment detail of a comment belonging to a meeting

Download single attachment detail of a comment belonging to a meeting by providing the meeting id, comment id and attachment id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id
    attachment_id = "attachmentId_example" # str | Attachment Id

    try:
        # Download single attachment detail of a comment belonging to a meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.download_comment_attachment_for_comment(meeting_id, comment_id, attachment_id)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->download_comment_attachment_for_comment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |
 **attachment_id** | **str**| Attachment Id |

### Return type

**file_type**

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/octet-stream, application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comment**
> CommentDto get_comment(meeting_id, comment_id)

Get details of a comment belonging to a meeting

Get details of a comment belonging to a meeting by providing the meeting id and comment id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id

    try:
        # Get details of a comment belonging to a meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_comment(meeting_id, comment_id)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->get_comment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |

### Return type

[**CommentDto**](CommentDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comment_attachments**
> [AttachmentSummaryDto] get_comment_attachments(meeting_id, comment_id)

Get attachments summary of a comment belonging to a meeting

Get attachments summary of a comment belonging to a meeting by providing the meeting id and comment id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id

    try:
        # Get attachments summary of a comment belonging to a meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_comment_attachments(meeting_id, comment_id)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->get_comment_attachments: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |

### Return type

[**[AttachmentSummaryDto]**](AttachmentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_comments**
> [CommentSummaryDto] get_comments(meeting_id)

Get all comments for a meeting

Get all comments for a meeting by providing the meeting id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id

    try:
        # Get all comments for a meeting
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_comments(meeting_id)

        pprint(api_response)

    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->get_comments: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |

### Return type

[**[CommentSummaryDto]**](CommentSummaryDto.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_comment**
> patch_comment(meeting_id, comment_id)

Edit a comment for a meeting

Edit a comment for a meeting by providing the meeting id and comment id.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IRNMeetings
from fds.sdk.IRNMeetings.api import comments_api
from fds.sdk.IRNMeetings.models import *
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
configuration = fds.sdk.IRNMeetings.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.IRNMeetings.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.IRNMeetings.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = comments_api.CommentsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    meeting_id = "meetingId_example" # str | Meeting Id
    comment_id = "commentId_example" # str | Comment Id
    operation = [
        Operation(
            operation_type=OperationType(0),
            path="path_example",
            op="op_example",
            _from="_from_example",
            value=None,
        ),
    ] # [Operation] | The JSON patch document with updates for the comment (optional)

    try:
        # Edit a comment for a meeting
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.patch_comment(meeting_id, comment_id, operation=operation)


    except fds.sdk.IRNMeetings.ApiException as e:
        print("Exception when calling CommentsApi->patch_comment: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **meeting_id** | **str**| Meeting Id |
 **comment_id** | **str**| Comment Id |
 **operation** | [**[Operation]**](Operation.md)| The JSON patch document with updates for the comment | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json-patch+json, application/json, text/json, application/*+json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad Request |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

