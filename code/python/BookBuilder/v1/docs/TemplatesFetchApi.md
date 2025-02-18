# fds.sdk.BookBuilder.TemplatesFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_template_list**](TemplatesFetchApi.md#get_template_list) | **GET** /template-list | Retrieves the list of templates that are available



# **get_template_list**
> EnableTemplateInfo get_template_list()

Retrieves the list of templates that are available

A template is a predefined list of content to be compiled in a PDF. This end point works without any parameters and retrieves the list of templates available for the user. Templates need to defined/created in FactSet workstation.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import templates___fetch_api
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
    api_instance = templates___fetch_api.TemplatesFetchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Retrieves the list of templates that are available
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_template_list()

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling TemplatesFetchApi->get_template_list: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**EnableTemplateInfo**](EnableTemplateInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains an array with template name, template ID, created date, template source and template type |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

