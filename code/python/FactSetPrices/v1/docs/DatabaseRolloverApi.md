# fds.sdk.FactSetPrices.DatabaseRolloverApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_database_rollover**](DatabaseRolloverApi.md#get_database_rollover) | **GET** /factset-prices/v1/database-rollover | Gets the latest relative rollover date for the database.
[**get_database_rollover_for_list**](DatabaseRolloverApi.md#get_database_rollover_for_list) | **POST** /factset-prices/v1/database-rollover | Gets the latest relative rollover date for the database.


# **get_database_rollover**
> RolloverResponse get_database_rollover()

Gets the latest relative rollover date for the database.

Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrices
from fds.sdk.FactSetPrices.api import database_rollover_api
from fds.sdk.FactSetPrices.model.error_response import ErrorResponse
from fds.sdk.FactSetPrices.model.rollover_response import RolloverResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetPrices.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetPrices.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = database_rollover_api.DatabaseRolloverApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Gets the latest relative rollover date for the database.
        api_response = api_instance.get_database_rollover()
        pprint(api_response)
    except fds.sdk.FactSetPrices.ApiException as e:
        print("Exception when calling DatabaseRolloverApi->get_database_rollover: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**RolloverResponse**](RolloverResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Database rollover data items. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_database_rollover_for_list**
> RolloverResponse get_database_rollover_for_list()

Gets the latest relative rollover date for the database.

Gets zero relative date and last update time for FactSet databases. The dates represent the date that the rollover event happened; the date and time is in **eastern time zone**.  <p>Depending on the ids requested and their respective regions, a requested startDate or endDate used in the various Prices API may reflect different previous close dates. This relative \"zero\" date, meaning - as of yesterday's close - will vary across global regions. This API is designed to help production systems account for regional rollover dates to know when to trigger their processes for different regions to reflect the latest close. The response gives context for AMERICAS, ASIA PACIFIC, and EUROPE. </p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrices
from fds.sdk.FactSetPrices.api import database_rollover_api
from fds.sdk.FactSetPrices.model.error_response import ErrorResponse
from fds.sdk.FactSetPrices.model.rollover_response import RolloverResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.FactSetPrices.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.FactSetPrices.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.FactSetPrices.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrices.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = database_rollover_api.DatabaseRolloverApi(api_client)

    # example, this endpoint has no required or optional parameters
    try:
        # Gets the latest relative rollover date for the database.
        api_response = api_instance.get_database_rollover_for_list()
        pprint(api_response)
    except fds.sdk.FactSetPrices.ApiException as e:
        print("Exception when calling DatabaseRolloverApi->get_database_rollover_for_list: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

### Return type

[**RolloverResponse**](RolloverResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Database rollover data items. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

