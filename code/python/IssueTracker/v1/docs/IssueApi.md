# fds.sdk.IssueTracker.IssueApi

All URIs are relative to *https://api.factset.com/issue-tracker/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_issue**](IssueApi.md#get_issue) | **GET** /issues/{id} | Get the matched issue details
[**patch_issue**](IssueApi.md#patch_issue) | **PATCH** /issues/{id} | Update issue details
[**post_issue**](IssueApi.md#post_issue) | **POST** /issues | Creates a Issue Tracker issue
[**post_reply**](IssueApi.md#post_reply) | **POST** /issues/{id}/comments | post comment to Issue Tracker issue



# **get_issue**
> Issue get_issue(id)

Get the matched issue details

This endpoint allows retrieval of client information associated with a specific issue ID. When an issue contains file attachments, the Issue Tracker will return relative paths for these files. You can refer to the sample responses given in the examples and API Overview.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import issue_api
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
    api_instance = issue_api.IssueApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of Issue Tracker issue

    try:
        # Get the matched issue details
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_issue(id)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling IssueApi->get_issue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of Issue Tracker issue |

### Return type

[**Issue**](Issue.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **patch_issue**
> IdResponse patch_issue(id)

Update issue details

 Update Issue Properties Following Mentioned Constraints     Combo Updates (Must be sent together):  1. Title + Severity 2. ProductId + CategoryId  Single Field Updates: 1. Title, Severity, ProductId can be updated alone 2. Status (alone)  2.1 If setting status to \"Closed\", closeContent is mandatory 3. ReadOnly (alone)  3.1 Only allowed if issue is already \"Closed\"  Invalid Combinations (Will be rejected):  1. Mixing Title with Status 2. Updating Status + ReadOnly together 3. Severity + ProductId 4. Status = \"Closed\" without closeContent 5. Setting ReadOnly when RPD is not closed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import issue_api
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
    api_instance = issue_api.IssueApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of Issue Tracker issue
    update_issue_request = UpdateIssueRequest(
        data=UpdateIssueRequestData(
            subject="subject_example",
            severity="severity_example",
            product_id="product_id_example",
            category_id="category_id_example",
            status="In Progress",
            close_content="close_content_example",
            read_only=True,
        ),
    ) # UpdateIssueRequest |  (optional)

    try:
        # Update issue details
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.patch_issue(id, update_issue_request=update_issue_request)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling IssueApi->patch_issue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of Issue Tracker issue |
 **update_issue_request** | [**UpdateIssueRequest**](UpdateIssueRequest.md)|  | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | OK |  -  |
**400** | Bad Request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_issue**
> IdResponse post_issue()

Creates a Issue Tracker issue

Creates a new issue in Issue Tracker     **Note:** connectorId, connectorDisplayId can be sent when integrations are configured on product, to sync back the updates from FactSet side. connectorDisplayId can't be set without connectorDisplayId. Reachout to factset team to check if the integrations re enabled on the product.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import issue_api
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
    api_instance = issue_api.IssueApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    issue_request = IssueRequest(
        data=IssueRequestData(
            subject="subject_example",
            description="description_example",
            product_id="product_id_example",
            category_id="category_id_example",
            severity="severity_example",
            attachments=[
                Attachment(
                    id=1,
                    name="name_example",
                ),
            ],
            connector_id="connector_id_example",
            connector_display_id="connector_display_id_example",
        ),
    ) # IssueRequest |  (optional)

    try:
        # Creates a Issue Tracker issue
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_issue(issue_request=issue_request)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling IssueApi->post_issue: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **issue_request** | [**IssueRequest**](IssueRequest.md)|  | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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

# **post_reply**
> IdResponse post_reply(id)

post comment to Issue Tracker issue

Reply to the existing matched issue

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.IssueTracker
from fds.sdk.IssueTracker.api import issue_api
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
    api_instance = issue_api.IssueApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID of Issue Tracker issue
    comment_request = CommentRequest(
        data=CommentRequestData(
            content="content_example",
            attachments=[
                Attachment(
                    id=1,
                    name="name_example",
                ),
            ],
        ),
    ) # CommentRequest |  (optional)

    try:
        # post comment to Issue Tracker issue
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.post_reply(id, comment_request=comment_request)

        pprint(api_response)

    except fds.sdk.IssueTracker.ApiException as e:
        print("Exception when calling IssueApi->post_reply: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID of Issue Tracker issue |
 **comment_request** | [**CommentRequest**](CommentRequest.md)|  | [optional]

### Return type

[**IdResponse**](IdResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
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

