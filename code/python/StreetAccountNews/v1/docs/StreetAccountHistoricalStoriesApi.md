# fds.sdk.StreetAccountNews.StreetAccountHistoricalStoriesApi

All URIs are relative to *https://api.factset.com/streetaccount/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_files_data**](StreetAccountHistoricalStoriesApi.md#get_files_data) | **GET** /historical/files/get | Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
[**get_status_data**](StreetAccountHistoricalStoriesApi.md#get_status_data) | **GET** /historical/files/status | Returns the status of the request
[**request_files**](StreetAccountHistoricalStoriesApi.md#request_files) | **POST** /historical/files/create | Requests the creation of StreetAccount News Files with historical data.



# **get_files_data**
> GetfilesResponse get_files_data(id)

Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.

Need to plug-in the ID got from /historical/files/create into /historical/files/status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import street_account_historical_stories_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = street_account_historical_stories_api.StreetAccountHistoricalStoriesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID returned by the /historical/files/create endpoint to collect the results of the query
    pagination_limit = 1 # int | Specifies the maximum number of results to return per result (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results (optional)

    try:
        # Returns the StreetAccount Historical data in files requested in the /historical/files/create endpoint.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_files_data(id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling StreetAccountHistoricalStoriesApi->get_files_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID returned by the /historical/files/create endpoint to collect the results of the query |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the   beginning of next set of results | [optional]

### Return type

[**GetfilesResponse**](GetfilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | success |  -  |
**400** | Bad request |  * Location - Relative location to poll for status. <br>  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status_data**
> SubmittedResponse get_status_data(id)

Returns the status of the request

Need to plug-in the ID get from /historical/files/create endpoint into /historical/files/status endpoint

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import street_account_historical_stories_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = street_account_historical_stories_api.StreetAccountHistoricalStoriesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    id = "id_example" # str | ID returned by the /historical/files/create endpoint to know the status
    pagination_limit = 1 # int | Specifies the maximum number of results to return per result (optional)
    pagination_offset = 1 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional)

    try:
        # Returns the status of the request
        # example passing only required values which don't have defaults set
        # and optional values
        api_response_wrapper = api_instance.get_status_data(id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 201:
            api_response = api_response_wrapper.get_response_201()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling StreetAccountHistoricalStoriesApi->get_status_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| ID returned by the /historical/files/create endpoint to know the status |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per result | [optional]
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional]

### Return type

The endpoint generates varying objects correlating with the successful status code, encapsulated within a response wrapper housing the appropriate object. The response wrapper includes the subsequent response types:
- **201**: [**SubmittedResponse**](SubmittedResponse.md)
- **202**: [**AcceptedResponse**](AcceptedResponse.md)


### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Request has been Created.  |  * Location - Relative location to poll for status. <br>  |
**202** | The Request has been Accepted.  |  * Location - Relative location to poll for status. <br>  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**404** | Not Found |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **request_files**
> AcceptedResponse request_files(create_files_request)

Requests the creation of StreetAccount News Files with historical data.

Data available from past 10 years, 2 years of data can be retrieved per API request and an ID is returned.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.StreetAccountNews
from fds.sdk.StreetAccountNews.api import street_account_historical_stories_api
from fds.sdk.StreetAccountNews.models import *
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
configuration = fds.sdk.StreetAccountNews.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.StreetAccountNews.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.StreetAccountNews.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = street_account_historical_stories_api.StreetAccountHistoricalStoriesApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    create_files_request = CreateFilesRequest(
        data=CreateFilesRequestObject(
            date_time_range=DateTimeRangeObject(
                start=dateutil_parser('2012-01-01T12:35:45Z'),
                end=dateutil_parser('2012-01-30T08:10:30Z'),
            ),
            identifiers=Identifiers(["AAPL-US","IBM-US"]),
            category=Category([
                "companyNewsAll",
            ]),
        ),
    ) # CreateFilesRequest | 

    try:
        # Requests the creation of StreetAccount News Files with historical data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.request_files(create_files_request)

        pprint(api_response)

    except fds.sdk.StreetAccountNews.ApiException as e:
        print("Exception when calling StreetAccountHistoricalStoriesApi->request_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **create_files_request** | [**CreateFilesRequest**](CreateFilesRequest.md)|  |

### Return type

[**AcceptedResponse**](AcceptedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | The Request has been Accepted.  |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Bad request |  -  |
**401** | Unauthorized |  -  |
**403** | Forbidden |  -  |
**429** | Too many requests. |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

