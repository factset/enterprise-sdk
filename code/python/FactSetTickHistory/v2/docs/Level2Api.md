# fds.sdk.FactSetTickHistory.Level2Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_status_level2**](Level2Api.md#get_status_level2) | **GET** /level2/files/status | Returns the status of the ID
[**get_tick_history_files_level2**](Level2Api.md#get_tick_history_files_level2) | **GET** /level2/files/get | Returns the tick history files requested in the /create endpoint
[**getlevel2id**](Level2Api.md#getlevel2id) | **POST** /level2/files/create | Returns the ID for the requested data.



# **get_status_level2**
> CompletedResponse get_status_level2(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_2_api
from fds.sdk.FactSetTickHistory.models import *
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
configuration = fds.sdk.FactSetTickHistory.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTickHistory.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = level_2_api.Level2Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | id returned by files create endpoint to poll and collect status of the query

    try:
        # Returns the status of the ID
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_status_level2(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 201:
            api_response = api_response_wrapper.get_response_201()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level2Api->get_status_level2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id returned by files create endpoint to poll and collect status of the query |

### Return type

[**CompletedResponse**](CompletedResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
**202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | id not found |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tick_history_files_level2**
> LeveltwoGetFilesResponse get_tick_history_files_level2(id)

Returns the tick history files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_2_api
from fds.sdk.FactSetTickHistory.models import *
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
configuration = fds.sdk.FactSetTickHistory.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTickHistory.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = level_2_api.Level2Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | id returned by files create endpoint to poll and collect results of the query
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_limit = 20 # int | Specifies the maximum number of results to return per response page (optional) if omitted the server will use the default value of 20
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    pagination_offset = 0 # int | Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results (optional) if omitted the server will use the default value of 0

    try:
        # Returns the tick history files requested in the /create endpoint
        # example passing only required values which don't have defaults set
        # and optional values
        api_response_wrapper = api_instance.get_tick_history_files_level2(id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level2Api->get_tick_history_files_level2: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id returned by files create endpoint to poll and collect results of the query |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per response page | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] if omitted the server will use the default value of 0

### Return type

[**LeveltwoGetFilesResponse**](LeveltwoGetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
**202** |  The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | id not found |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getlevel2id**
> SubmittedResponse getlevel2id(level_two_request)

Returns the ID for the requested data.

Data available from past 6 years to current date.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_2_api
from fds.sdk.FactSetTickHistory.models import *
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
configuration = fds.sdk.FactSetTickHistory.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetTickHistory.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetTickHistory.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = level_2_api.Level2Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    level_two_request = LevelTwoRequest(
        data=Level2RequestBody(
            tickers=Tickers(["FDS"]),
            mic=Mic("XNYS"),
            date_range=DateRangeOne(
                start=dateutil_parser('Sun Jan 01 00:00:00 UTC 2012').date(),
                end=dateutil_parser('Mon Jan 30 00:00:00 UTC 2012').date(),
            ),
            response_file_type=ResponseFileType("parquet"),
        ),
    ) # LevelTwoRequest | 

    try:
        # Returns the ID for the requested data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.getlevel2id(level_two_request)

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level2Api->getlevel2id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **level_two_request** | [**LevelTwoRequest**](LevelTwoRequest.md)|  |

### Return type

[**SubmittedResponse**](SubmittedResponse.md)

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
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**429** | Too many requests. |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

