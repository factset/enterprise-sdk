# fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ExchangeSnapshotApi

All URIs are relative to *https://api.factset.com/bulk-documents/exchange-snapshot/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_list_files**](ExchangeSnapshotApi.md#get_list_files) | **GET** /list-files | List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range



# **get_list_files**
> EntireExchangeSnapshotResponse get_list_files(product, start_date, end_date, start_time, end_time)

List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range

A service that provides access to Real Time or Delayed data snapped at hourly intervals for an entire Exchange

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange
from fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.api import exchange_snapshot_api
from fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.models import *
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
    api_instance = exchange_snapshot_api.ExchangeSnapshotApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    product = 10001 # int | any product subscribed by client
    start_date = dateutil_parser('1970-01-01').date() # date | YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts `start_date` (snake_case), which is deprecated and exists for backward compatibility.
    end_date = dateutil_parser('1970-01-01').date() # date | YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts `end_date` (snake_case), which is deprecated and exists for backward compatibility.
    start_time = "startTime_example" # str | HHMM (24 hour time EST). Also accepts `start_time` (snake_case), which is deprecated and exists for backward compatibility.
    end_time = "endTime_example" # str | HHMM (24 hour time EST). Also accepts `end_time` (snake_case), which is deprecated and exists for backward compatibility.
    access = "DL" # str | Option to select from static, DL or RT data (optional) if omitted the server will use the default value of "DL"

    try:
        # List Files service returns downloadable Real Time, Delayed or Static Exchange Snapshot files for a specified product, date range, and time range
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_list_files(product, start_date, end_date, start_time, end_time, access=access)

        pprint(api_response)

    except fds.sdk.ExchangeDataFeedSnapshotAPIEntireExchange.ApiException as e:
        print("Exception when calling ExchangeSnapshotApi->get_list_files: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **product** | **int**| any product subscribed by client |
 **start_date** | **date**| YYYYMMDD (Choose between 1 and 4 previous trading days). Also accepts &#x60;start_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **end_date** | **date**| YYYYMMDD (Choose between 1 and 4 previous trading days, greater than or equal to start date). Also accepts &#x60;end_date&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **start_time** | **str**| HHMM (24 hour time EST). Also accepts &#x60;start_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **end_time** | **str**| HHMM (24 hour time EST). Also accepts &#x60;end_time&#x60; (snake_case), which is deprecated and exists for backward compatibility. |
 **access** | **str**| Option to select from static, DL or RT data | [optional] if omitted the server will use the default value of "DL"

### Return type

[**EntireExchangeSnapshotResponse**](EntireExchangeSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json, text/plain


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Success  |  -  |
**400** | Bad Request |  -  |
**401** | Authentication Failed |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**408** | Request Timeout |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

