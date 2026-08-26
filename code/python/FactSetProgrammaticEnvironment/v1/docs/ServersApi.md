# fds.sdk.FactSetProgrammaticEnvironment.ServersApi

All URIs are relative to *https://api.factset.com/analytics/quant/fpe/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**stop_server**](ServersApi.md#stop_server) | **DELETE** /servers | Stop the caller&#39;s API server



# **stop_server**
> stop_server()

Stop the caller's API server

Stops the user's underlying API server so that a subsequent calculation request starts a fresh server that picks up any recent configuration changes. This is a fire-and-forget stop: no new server is started synchronously. A new server is created automatically on the next calculation request. Warning: this will terminate any calculations that are currently running on that server.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetProgrammaticEnvironment
from fds.sdk.FactSetProgrammaticEnvironment.api import servers_api
from fds.sdk.FactSetProgrammaticEnvironment.models import *
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
configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetProgrammaticEnvironment.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetProgrammaticEnvironment.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = servers_api.ServersApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.

    try:
        # Stop the caller's API server
        # example, this endpoint has no required or optional parameters
        api_instance.stop_server()


    except fds.sdk.FactSetProgrammaticEnvironment.ApiException as e:
        print("Exception when calling ServersApi->stop_server: %s\n" % e)
```


### Parameters
This endpoint does not need any parameter.

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
**204** | Server stop request accepted. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**401** | Missing or invalid authentication credentials. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**403** | Caller is not entitled to access this resource. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**404** | No server found to stop. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**500** | Server error. Log the X-DataDirect-Request-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |
**503** | Service temporarily unavailable. Retry the request later. |  * X-DataDirect-Request-Key - FactSet&#39;s request key header. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

