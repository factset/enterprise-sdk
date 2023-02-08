# fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.SnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_v1_list_files**](SnapshotApi.md#get_v1_list_files) | **GET** /v1/list-files | Snapshot



# **get_v1_list_files**
> InlineResponse200 get_v1_list_files(product, start_date, end_date, start_time, end_time)

Snapshot

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange
from fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.api import snapshot_api
from fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models import *
from dateutil.parser import parse as dateutil_parser
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snapshot_api.SnapshotApi(api_client)

    product = 10001 # int | any product subscribed by client. Minimum value for prod code=9001
    start_date = dateutil_parser('1970-01-01').date() # date | YYYYMMDD (Choose between 1 and 4 previous trading days)
    end_date = dateutil_parser('1970-01-01').date() # date | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date)
    start_time = "start_time_example" # str | HHMM (24 hour time EST)
    end_time = "end_time_example" # str | HHMM (24 hour time EST)
    access = "DL" # str | Option to select from static, DL or RT data (optional) if omitted the server will use the default value of "DL"

    try:
        # Snapshot
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_v1_list_files(product, start_date, end_date, start_time, end_time, access=access)
        pprint(api_response)

    except fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiException as e:
        print("Exception when calling SnapshotApi->get_v1_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **int**| any product subscribed by client. Minimum value for prod code&#x3D;9001 |
 **start_date** | **date**| YYYYMMDD (Choose between 1 and 4 previous trading days) |
 **end_date** | **date**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date) |
 **start_time** | **str**| HHMM (24 hour time EST) |
 **end_time** | **str**| HHMM (24 hour time EST) |
 **access** | **str**| Option to select from static, DL or RT data | [optional] if omitted the server will use the default value of "DL"

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
**200** | Success  |  -  |
**400** | Bad Request |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

