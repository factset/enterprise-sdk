# fds.sdk.BookBuilder.BooksCreationApi

All URIs are relative to *https://api.factset.com/book-builder-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_book**](BooksCreationApi.md#create_book) | **POST** /create-book | Kicks off request to create a book with reports of your choice
[**create_book_from_template**](BooksCreationApi.md#create_book_from_template) | **POST** /create-book-from-template | Kicks off request to create a book with template
[**get_available_reports**](BooksCreationApi.md#get_available_reports) | **GET** /available-report/{ticker} | This endpoint retrieves all available sections and reports based on a ticker.



# **create_book**
> EnableBookInfo create_book(create_book_post_request)

Kicks off request to create a book with reports of your choice

This end point retrieves book name and book_id for the PDF book you create. All the book options such as name of the book, ticker, pagination options, and reports can be specified in the request body. Please refer to the documentation for valid section ids and report ids.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import books___creation_api
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
    api_instance = books___creation_api.BooksCreationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_book_post_request = CreateBookPostRequest(
        book_name="Company Book for FDS",
        ticker="FDS-US",
        pagination=PaginationOptions(
            cover=True,
            divider=True,
            toc=True,
            footer=True,
            timestamp=False,
        ),
        content=[
            ContentSection(
                section_id="COMPANY_OVERVIEW",
                reports=[
                    "COMPANY_SNAPSHOT_IB",
                ],
            ),
        ],
    ) # CreateBookPostRequest | 

    try:
        # Kicks off request to create a book with reports of your choice
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_book(create_book_post_request)

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling BooksCreationApi->create_book: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_book_post_request** | [**CreateBookPostRequest**](CreateBookPostRequest.md)|  |

### Return type

[**EnableBookInfo**](EnableBookInfo.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains book name and book ID |  -  |
**400** | Invalid ticker/section_id/report_id |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_book_from_template**
> EnableBookInfoFromTemplate create_book_from_template(create_book_from_template_post_request)

Kicks off request to create a book with template

This endpoint retrieves book status, book name, and book ID for ticker requested in JSON format. This end-point excepts ticker and template_id as inputs. If the template_id input is not used, a book will be created with FactSet's default template.</br></br>Please try out the below template ids to quickly get the FactSet curated books</br></br>Company Quick Book - <b>g_20210415065838185</b></br>Post-Earnings Call - <b>g_20210415070044785</b> </br>Public Information Book(PIB) - <b>g_20210415070353151</b></br></br> Take a look at the example books attached under API documentation below.</br></br>If you are scheduling Post Earnings Call curated book, please note that in contains Corrected Transcript that takes a little while to be available.</br> </br>Once a Raw Transcript is published, FactSet's editors review the call to produce a Corrected Transcript. They listen to the entire audio file again to confirm that all of the terms and numbers are correctly transcribed. FactSet aims to publish a Corrected Transcript within six times the length of the event, measured from the beginning of the event. That means for a typical one-hour call, FactSet will produce a Corrected Transcript within approximately five hours of the call's completion. Visit [OA 13208](https://my.apps.factset.com/oa/pages/13208)

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import books___creation_api
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
    api_instance = books___creation_api.BooksCreationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_book_from_template_post_request = CreateBookFromTemplatePostRequest(
        ticker="FDS-US",
        template_id="g_20210415065838185",
    ) # CreateBookFromTemplatePostRequest | 

    try:
        # Kicks off request to create a book with template
        # example passing only required values which don't have defaults set
        api_response = api_instance.create_book_from_template(create_book_from_template_post_request)

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling BooksCreationApi->create_book_from_template: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_book_from_template_post_request** | [**CreateBookFromTemplatePostRequest**](CreateBookFromTemplatePostRequest.md)|  |

### Return type

[**EnableBookInfoFromTemplate**](EnableBookInfoFromTemplate.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains request status, book name, and book ID |  -  |
**400** | Invalid ticker or Unknown error |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_available_reports**
> AvailableReportsList get_available_reports(ticker)

This endpoint retrieves all available sections and reports based on a ticker.

This endpoint retrieves all available sections and reports for a specified ticker. The only parameter required is the ticker.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.BookBuilder
from fds.sdk.BookBuilder.api import books___creation_api
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
    api_instance = books___creation_api.BooksCreationApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ticker = "APPL-US" # str | A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path.

    try:
        # This endpoint retrieves all available sections and reports based on a ticker.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_available_reports(ticker)

        pprint(api_response)

    except fds.sdk.BookBuilder.ApiException as e:
        print("Exception when calling BooksCreationApi->get_available_reports: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker** | **str**| A string representing a specific ticker of Public, Private companies and Mutual Funds. This ticker must be provided in the URL path. |

### Return type

[**AvailableReportsList**](AvailableReportsList.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response contains all available sections and reports for the ticker. |  -  |
**400** | Invalid Ticker |  -  |
**401** | Missing or invalid authentication |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

