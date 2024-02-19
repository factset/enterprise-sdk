# fds.sdk.AnalyticsDatastore.ObjectsApi

All URIs are relative to *https://api.factset.com*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_cargo_endpoint**](ObjectsApi.md#get_cargo_endpoint) | **GET** /analytics/pub-datastore/cargo/v1/groups/{groupId}/objects/{objectId} | Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.



# **get_cargo_endpoint**
> get_cargo_endpoint(group_id, object_id)

Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.

Raw object data can be found in the response body. This can be either the mapped PDF/PPT or STACH json, depending on the mapping. https://pages.github.factset.com/analytics-reporting/stachschema/#/    Optional request header \"accept-encoding\", with allowed values of \"br\" and \"gzip\". If accept-encoding is passed, the response is compressed.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.AnalyticsDatastore
from fds.sdk.AnalyticsDatastore.api import objects_api
from fds.sdk.AnalyticsDatastore.models import *
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
configuration = fds.sdk.AnalyticsDatastore.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.AnalyticsDatastore.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.AnalyticsDatastore.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = objects_api.ObjectsApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    group_id = "a4186c50f8e74f979d271dd22298c901" # str | The ID of the group
    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    object_id = "fe875bc4150542dea6bc237663a01a0d" # str | The ID of the object

    try:
        # Gets an object given an ID. In this case ID retrieved from mapping Location header, object data in response body.
        # example passing only required values which don't have defaults set
        api_instance.get_cargo_endpoint(group_id, object_id)


    except fds.sdk.AnalyticsDatastore.ApiException as e:
        print("Exception when calling ObjectsApi->get_cargo_endpoint: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group_id** | **str**| The ID of the group |
 **object_id** | **str**| The ID of the object |

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Expected response, returns json response body of the report. |  * Transfer-Encoding - Standard HTTP header. Header value will be set to Chunked if Accept-Encoding header is specified. <br>  * Content-Encoding - Standard HTTP header. Header value based on Accept-Encoding Request header. <br>  * Content-Type - Standard HTTP header. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**400** | Invalid parameter provided. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**404** | The provided request does not exist. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-RateLimit-Remaining - Number of requests left for the time window. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  * X-RateLimit-Reset - Number of seconds remaining till rate limit resets. <br>  * X-RateLimit-Limit - Number of allowed requests for the time window. <br>  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

