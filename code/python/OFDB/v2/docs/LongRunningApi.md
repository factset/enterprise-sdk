# fds.sdk.OFDB.LongRunningApi

All URIs are relative to *https://api.factset.com/analytics/ofdb/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_resource_audit**](LongRunningApi.md#get_resource_audit) | **GET** /database/{path}/audit/jobs/{id} | 
[**get_resource_bulk_delete**](LongRunningApi.md#get_resource_bulk_delete) | **GET** /database/{path}/delete/jobs/{id} | 
[**get_resource_data**](LongRunningApi.md#get_resource_data) | **GET** /database/{path}/jobs/{id} | 
[**get_resource_database**](LongRunningApi.md#get_resource_database) | **GET** /database/jobs/{id} | 
[**get_resource_date**](LongRunningApi.md#get_resource_date) | **GET** /database/{path}/dates/{date}/jobs/{id} | 
[**get_resource_dates**](LongRunningApi.md#get_resource_dates) | **GET** /database/{path}/dates/jobs/{id} | 
[**get_resource_fields**](LongRunningApi.md#get_resource_fields) | **GET** /database/{path}/fields/jobs/{id} | 
[**get_resource_stats**](LongRunningApi.md#get_resource_stats) | **GET** /database/{path}/stats/jobs/{id} | 
[**get_resource_symbol**](LongRunningApi.md#get_resource_symbol) | **GET** /database/{path}/symbols/{symbol}/jobs/{id} | 
[**get_resource_symbols**](LongRunningApi.md#get_resource_symbols) | **GET** /database/{path}/symbols/jobs/{id} | 
[**get_status**](LongRunningApi.md#get_status) | **GET** /database/jobs/{id}/status | 



# **get_resource_audit**
> InlineResponse200 get_resource_audit(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_audit(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_audit: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns a list of the most recent \&quot;modificationTimes\&quot; in long datetime format |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_bulk_delete**
> InlineResponse2003 get_resource_bulk_delete(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_bulk_delete(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_bulk_delete: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2003**](InlineResponse2003.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful output |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_data**
> InlineResponse2006 get_resource_data(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_data(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_data: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2006**](InlineResponse2006.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | successful output |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_database**
> CreateDatabase get_resource_database(id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_database(id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_database: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**CreateDatabase**](CreateDatabase.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Creates and responds with ofdb path |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_date**
> SuccessPostResponse get_resource_date(path, date, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    date = 1 # int | Date in YYYYMMDD format
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_date(path, date, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_date: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **date** | **int**| Date in YYYYMMDD format |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status message of creation |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_dates**
> InlineResponse2005 get_resource_dates(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_dates(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_dates: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2005**](InlineResponse2005.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful output |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_fields**
> InlineResponse2002 get_resource_fields(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_fields(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_fields: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2002**](InlineResponse2002.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of fields within the database |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_stats**
> InlineResponse2001 get_resource_stats(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_stats(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_stats: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2001**](InlineResponse2001.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Returns an object with key OFDB stats |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_symbol**
> SuccessPostResponse get_resource_symbol(path, symbol, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    symbol = "symbol_example" # str | Symbol with in the ofdb
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_symbol(path, symbol, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_symbol: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **symbol** | **str**| Symbol with in the ofdb |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**SuccessPostResponse**](SuccessPostResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Status message of creation |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_resource_symbols**
> InlineResponse2004 get_resource_symbols(path, id)



Returns the end results of a long running request. The full URL is normally provided for you in the Location header of a finished long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    path = "path_example" # str | Encode database path
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_resource_symbols(path, id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_resource_symbols: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **path** | **str**| Encode database path |
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse2004**](InlineResponse2004.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful symbols array within OFDB |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_status**
> InlineResponse201 get_status(id)



Returns the current status of a long running request. The full URL is normally provided for you in the Location header of a long running response.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.OFDB
from fds.sdk.OFDB.api import long_running_api
from fds.sdk.OFDB.models import *
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
configuration = fds.sdk.OFDB.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.OFDB.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.OFDB.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = long_running_api.LongRunningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    id = "id_example" # str | A unique pickup ID returned by the original request

    try:
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_status(id)

        pprint(api_response)

    except fds.sdk.OFDB.ApiException as e:
        print("Exception when calling LongRunningApi->get_status: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **str**| A unique pickup ID returned by the original request |

### Return type

[**InlineResponse201**](InlineResponse201.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**201** | Returns when the long running request is completed. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**202** | Returns when the request is moved to long running mode. The next pickup URL is provided by the Location header. |  * Location -  <br>  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**400** | Invalid query parameter or value provided |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**404** | Path not found |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**406** | Unsupported Accept header. Header needs to be set to application/json |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**429** | Rate limit reached. Wait till the time specified in Retry-After header value to make further requests. |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  * Retry-After -  <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |
**503** | Request timed out. Retry the request in some time |  * X-DataDirect-Request-Key -  <br>  * X-FactSet-Api-Request-Key -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * X-RateLimit-Reset -  <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

