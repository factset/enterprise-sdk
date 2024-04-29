# fds.sdk.FactSetOptions.SnapshotApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_options_snapshot_for_list**](SnapshotApi.md#get_options_snapshot_for_list) | **POST** /factset-options/v1/snapshot | Returns all the profile information for the list of identifiers as of a specific date



# **get_options_snapshot_for_list**
> SnapshotResponse get_options_snapshot_for_list(snapshot_request)

Returns all the profile information for the list of identifiers as of a specific date

Returns all the profile information for the list of identifiers for a specific date. The data includes -  * Expiration Date * Greek - Delta * Implied Volatility * Price  * Style * Type * Underlying Security * Underlying Security Price * Open Interest * Name    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import snapshot_api
from fds.sdk.FactSetOptions.models import *
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
configuration = fds.sdk.FactSetOptions.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOptions.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOptions.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = snapshot_api.SnapshotApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    snapshot_request = SnapshotRequest(
        ids=OptionIds(["TSLA.US#CD33M-USA"]),
        date="2021-05-03",
        currency="USD",
        calendar=Calendar("FIVEDAY"),
    ) # SnapshotRequest | Snapshot Request Object

    try:
        # Returns all the profile information for the list of identifiers as of a specific date
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_options_snapshot_for_list(snapshot_request)

        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling SnapshotApi->get_options_snapshot_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **snapshot_request** | [**SnapshotRequest**](SnapshotRequest.md)| Snapshot Request Object |

### Return type

[**SnapshotResponse**](SnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Snapshot Response Object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

