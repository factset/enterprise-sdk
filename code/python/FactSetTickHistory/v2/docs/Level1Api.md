# fds.sdk.FactSetTickHistory.Level1Api

All URIs are relative to *https://api.factset.com/tick-history/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_id**](Level1Api.md#get_id) | **POST** /level1/files/create | Returns the ID for the requested data.
[**get_status_level1**](Level1Api.md#get_status_level1) | **GET** /level1/files/status | Returns the status of the ID
[**get_tick_history_coverage**](Level1Api.md#get_tick_history_coverage) | **GET** /level1/coverage | Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
[**get_tick_history_files**](Level1Api.md#get_tick_history_files) | **GET** /level1/files/get | Returns the tick history files requested in the /create endpoint



# **get_id**
> SubmittedResponse get_id(levelone_request)

Returns the ID for the requested data.

Data available from 20120101 to current date.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_1_api
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
    api_instance = level_1_api.Level1Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    levelone_request = LeveloneRequest(
        data=Level1RequestBody(
            tickers=Tickers(["FDS"]),
            factset_exchange_code=FactsetExchangeCode("USA"),
            date_time_range=DateTimePeriod(
                start=dateutil_parser('2012-01-01T11:00:00Z'),
                end=dateutil_parser('2012-01-30T11:20:30Z'),
            ),
            fields=Fields(["ASK"]),
            single=False,
        ),
    ) # LeveloneRequest | 

    try:
        # Returns the ID for the requested data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_id(levelone_request)

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level1Api->get_id: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **levelone_request** | [**LeveloneRequest**](LeveloneRequest.md)|  |

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
**202** | The Request has been Accepted |  * Location - Relative location to poll for status. <br>  * X-FactSet-Api-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-FactSet-Api-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**429** | Too many requests. |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status_level1**
> CompletedResponse get_status_level1(id)

Returns the status of the ID

Need to plug-in the id get from /create endpoint into /status endpoint

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_1_api
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
    api_instance = level_1_api.Level1Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | id returned by files create endpoint to poll and collect status of the query

    try:
        # Returns the status of the ID
        # example passing only required values which don't have defaults set
        api_response_wrapper = api_instance.get_status_level1(id)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 201:
            api_response = api_response_wrapper.get_response_201()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level1Api->get_status_level1: %s\n" % e)
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
**201** |  The Request has been created and the response has been created.  |  * Location - Relative location to poll for status. <br>  |
**202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | id not found |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tick_history_coverage**
> CoverageResponse get_tick_history_coverage()

Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.

Returns coverage for specified tickers for Level1 Data

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_1_api
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
    api_instance = level_1_api.Level1Api(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    tickers = ["CBA"] # [str] | <P> The requested list of one or more tickers.</p>   The `tickers` and `isins`  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   <P> Maximum 10 tickers per request</p>      (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    factset_exchange_code = "AUS" # str | <p>This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.</p> **NOTE**:Does not support multiple factsetExchangeCodes (optional)
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    isins = [] # [str] | <P> Specifies the ISIN of the record. </p>    Please enter either the `tickers` or `isins` parameter.     <P> Maximum 10 ISINs per request.</p>       (optional)

    try:
        # Returns the coverage for the requested ticker/isin along with other response fields for Level1 data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_tick_history_coverage(tickers=tickers, factset_exchange_code=factset_exchange_code, isins=isins)

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level1Api->get_tick_history_coverage: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **tickers** | **[str]**| &lt;P&gt; The requested list of one or more tickers.&lt;/p&gt;   The &#x60;tickers&#x60; and &#x60;isins&#x60;  parameters provide two different ways to specify the identifiers for data retrieved. Please enter either the tickers or isins parameter.   &lt;P&gt; Maximum 10 tickers per request&lt;/p&gt;      | [optional]
 **factset_exchange_code** | **str**| &lt;p&gt;This parameter is used to filter the results based on the FactSet specific regional or composite exchange code.&lt;/p&gt; **NOTE**:Does not support multiple factsetExchangeCodes | [optional]
 **isins** | **[str]**| &lt;P&gt; Specifies the ISIN of the record. &lt;/p&gt;    Please enter either the &#x60;tickers&#x60; or &#x60;isins&#x60; parameter.     &lt;P&gt; Maximum 10 ISINs per request.&lt;/p&gt;       | [optional]

### Return type

[**CoverageResponse**](CoverageResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success&lt;/p&gt; |  -  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**429** | Too many requests. |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_tick_history_files**
> GetFilesResponse get_tick_history_files(id)

Returns the tick history files requested in the /create endpoint

Returns the files from tickhistory endpoint

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetTickHistory
from fds.sdk.FactSetTickHistory.api import level_1_api
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
    api_instance = level_1_api.Level1Api(api_client)

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
        api_response_wrapper = api_instance.get_tick_history_files(id, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        # This endpoint returns a response wrapper that contains different types of responses depending on the query.
        # To access the correct response type, you need to perform one additional step, as shown below.
        if api_response_wrapper.get_status_code() == 200:
            api_response = api_response_wrapper.get_response_200()
        if api_response_wrapper.get_status_code() == 202:
            api_response = api_response_wrapper.get_response_202()

        pprint(api_response)

    except fds.sdk.FactSetTickHistory.ApiException as e:
        print("Exception when calling Level1Api->get_tick_history_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| id returned by files create endpoint to poll and collect results of the query |
 **pagination_limit** | **int**| Specifies the maximum number of results to return per response page | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| Specifies the starting point for pagination. This parameter is used to identify the beginning of next set of results | [optional] if omitted the server will use the default value of 0

### Return type

[**GetFilesResponse**](GetFilesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success&lt;/p&gt; **To download the output file copy the response url in a browser** |  -  |
**202** | The Request has not finished and the result has NOT been created.  |  * Location - Relative location to poll for status. <br>  |
**400** | Bad request |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the Report Issue in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | id not found |  -  |
**500** | Internal Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

