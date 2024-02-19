# fds.sdk.DocumentsDistributorDocuments.NewsAPIApi

All URIs are relative to *https://api.factset.com/bulk-documents*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asynch_news_v1_check_status_get**](NewsAPIApi.md#asynch_news_v1_check_status_get) | **GET** /asynch/news/v1/check-status | Returns the status and percentDone of the requested jobID and source
[**asynch_news_v1_get_files_get**](NewsAPIApi.md#asynch_news_v1_get_files_get) | **GET** /asynch/news/v1/get-files | Returns the news filings for the specified daterange and source
[**asynch_news_v1_request_files_get**](NewsAPIApi.md#asynch_news_v1_request_files_get) | **GET** /asynch/news/v1/request-files | Returns the jobID



# **asynch_news_v1_check_status_get**
> NewscheckstatusResponse asynch_news_v1_check_status_get(job_id, source)

Returns the status and percentDone of the requested jobID and source

Need to plug-in the jobID got from /request-files into /check-status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import news_api_api
from fds.sdk.DocumentsDistributorDocuments.models import *
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
configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api_api.NewsAPIApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    job_id = "jobID_example" # str | jobID returned by the request-files endpoint to know the status and percentDone
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source = "news_ukwd" # str | This parameter filters the results based on the source of the filings document
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 1 # int | Specifies the maximum number of results to return per result (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)

    try:
        # Returns the status and percentDone of the requested jobID and source
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.asynch_news_v1_check_status_get(job_id, source, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling NewsAPIApi->asynch_news_v1_check_status_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| jobID returned by the request-files endpoint to know the status and percentDone |
 **source** | **str**| This parameter filters the results based on the source of the filings document |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**NewscheckstatusResponse**](NewscheckstatusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asynch_news_v1_get_files_get**
> NewsgetfilesResponse asynch_news_v1_get_files_get(job_id, source)

Returns the news filings for the specified daterange and source

Need to plug-in the source and jobID got from /request-files into /get-files endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import news_api_api
from fds.sdk.DocumentsDistributorDocuments.models import *
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
configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api_api.NewsAPIApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    job_id = "jobID_example" # str | jobID returned by the request-files endpoint to collect the results of the query
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source = "news_ukwd" # str | This parameter filters the results based on the source of the filings document
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 1 # int | Specifies the maximum number of results to return per result (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)

    try:
        # Returns the news filings for the specified daterange and source
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.asynch_news_v1_get_files_get(job_id, source, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling NewsAPIApi->asynch_news_v1_get_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **job_id** | **str**| jobID returned by the request-files endpoint to collect the results of the query |
 **source** | **str**| This parameter filters the results based on the source of the filings document |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**NewsgetfilesResponse**](NewsgetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **asynch_news_v1_request_files_get**
> NewsrequestfilesResponse asynch_news_v1_request_files_get(start_date, end_date, source)

Returns the jobID

Give the startDate,endDate and source parameters as request parameters in the /request-files endpoint, it returns the jobID. startDate and endDate should be in YYYY-MM-DDTHH:MM:SSZ format This API only supports adhoc requests to retrieve historical files

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DocumentsDistributorDocuments
from fds.sdk.DocumentsDistributorDocuments.api import news_api_api
from fds.sdk.DocumentsDistributorDocuments.models import *
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
configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DocumentsDistributorDocuments.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DocumentsDistributorDocuments.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = news_api_api.NewsAPIApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    start_date = dateutil_parser('1970-01-01').date() # date | Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    end_date = dateutil_parser('1970-01-01').date() # date | The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    source = "news_ukwd" # str | This parameter filters the results based on the source of the filings document

    try:
        # Returns the jobID
        # example passing only required values which don't have defaults set
        api_response = api_instance.asynch_news_v1_request_files_get(start_date, end_date, source)

        pprint(api_response)

    except fds.sdk.DocumentsDistributorDocuments.ApiException as e:
        print("Exception when calling NewsAPIApi->asynch_news_v1_request_files_get: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **start_date** | **date**| Date from which data is required. Should be YYYY-MM-DDTHH:MM:SSZ format |
 **end_date** | **date**| The date until which the data is to be fetched. Should be YYYY-MM-DDTHH:MM:SSZ format |
 **source** | **str**| This parameter filters the results based on the source of the filings document |

### Return type

[**NewsrequestfilesResponse**](NewsrequestfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

