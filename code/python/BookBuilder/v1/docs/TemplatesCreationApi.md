# fds.sdk.BookBuilder.TemplatesCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_template**](TemplatesCreationApi.md#create_template) | **POST** /create-template | Kick off request to create template with reports of your choice



# **create_template**
> EnableTemplateInfoPost create_template(create_template_post_request)

Kick off request to create template with reports of your choice

This end point retrieves template name and template_id of the template you create. All the book options such as name of the template, type, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import templates___creation_api
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
    api_instance = templates___creation_api.TemplatesCreationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_template_post_request = CreateTemplatePostRequest(
        tmpl_name="Quick Financials",
        tmpl_type="public",
        content=[
            TemplateContentSection(
                section_id="COMPANY_OVERVIEW",
                reports=[
                    "COMPANY_SNAPSHOT_IB",
                ],
            ),
        ],
    ) # CreateTemplatePostRequest | 

    try:
        # Kick off request to create template with reports of your choice
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_template(create_template_post_request)

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling TemplatesCreationApi->create_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_template_post_request** | [**CreateTemplatePostRequest**](CreateTemplatePostRequest.md)|  |

### Return type

[**EnableTemplateInfoPost**](EnableTemplateInfoPost.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains book name and book ID |  -  |
**400** | Invalid template type/section_id/report_id |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

