# fds.sdk.BookBuilder.BooksFetchApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**download_book**](BooksFetchApi.md#download_book) | **GET** /download-api-book-aws/{book_id} | Retrieves book in PDF format
[**get_book_list**](BooksFetchApi.md#get_book_list) | **GET** /book-list | Check out the books that are in the book library



# **download_book**
> EnableBookDownload download_book(book_id)

Retrieves book in PDF format

This endpoint uses the BookId returned from any of the request above. Returns the URL to load the book for the book ID requested. The URL will be in JSON format, the final book will be in PDF format. <br><br> NOTE -- The execution of this endpoint requires an extra step within the developer portal due to authentication limitations. When using the actual API, a successful response for this endpoint will be the PDF book rather than the URL to the PDF. <br><br><b><i>The actual endpoint is </b><font color=blue>https://api.factset.com/book-builder-api/v1/download-api-book/{book_id}</font></i>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import books___fetch_api
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
    api_instance = books___fetch_api.BooksFetchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    book_id = "20200331093828132" # str | A string representing the unique ID for a specific book. This ID must be provided in the URL path.

    try:
        # Retrieves book in PDF format
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.download_book(book_id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling BooksFetchApi->download_book: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **book_id** | **str**| A string representing the unique ID for a specific book. This ID must be provided in the URL path. |

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **200**: [**EnableBookDownload**](EnableBookDownload.md)
- **202**: [**BookProcessingResponse**](BookProcessingResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains URL to load the book for the BookID requested |  -  |
**202** | Book is processing. Please check back later. |  -  |
**400** | Something went wrong. Please create a new request. |  -  |
**401** | Missing or invalid authentication |  -  |
**503** | Unrecognized BookId |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_book_list**
> EnableBookListInfo get_book_list()

Check out the books that are in the book library

Retrieves the list of books that were previously created and are available in the client's book library

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import books___fetch_api
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
    api_instance = books___fetch_api.BooksFetchApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Check out the books that are in the book library
        # example, this endpoint has no required or optional parameters
        api_response = api_instance.get_book_list()

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling BooksFetchApi->get_book_list: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**EnableBookListInfo**](EnableBookListInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains book name, book ID, created date, shared status of the book and book type |  -  |
**401** | Missing or Invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

