# fds.sdk.FactSetPrivateCompany.NonPeriodicApi

All URIs are relative to *https://api.factset.com/content/private-company/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_non_periodic**](NonPeriodicApi.md#get_non_periodic) | **GET** /non-periodic | Returns Private Company Reference Data.
[**get_non_periodic_for_list**](NonPeriodicApi.md#get_non_periodic_for_list) | **POST** /non-periodic | Returns Private Company Reference Data.



# **get_non_periodic**
> NonPeriodicResponse get_non_periodic(ids, metrics)

Returns Private Company Reference Data.

Retrieves non-periodic reference information for specified Private Companies. Use the ```/universe``` endpoint to  retrieve valid Private Company identifiers. Use the ```/metrics``` endpoint to retrieve a  full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import non_periodic_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = non_periodic_api.NonPeriodicApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0H3R4Y-E"] # [str] | The requested FactSet Private Company Entity Identifier in XXXXXX-E format.<br/><br/> *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it's advised for any requests with large request lines to be requested through the respective \\\"POST\\\" method.* 
    metrics = ["FPE_AMT_RAISED_USD"] # [str] | Requested list of Private Company Non-Periodic Metrics. 

    try:
        # Returns Private Company Reference Data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_non_periodic(ids, metrics)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling NonPeriodicApi->get_non_periodic: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested FactSet Private Company Entity Identifier in XXXXXX-E format.&lt;br/&gt;&lt;br/&gt; *Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the  service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB,  it&#39;s advised for any requests with large request lines to be requested through the respective \\\&quot;POST\\\&quot; method.*  |
 **metrics** | **[str]**| Requested list of Private Company Non-Periodic Metrics.  |

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fetches Private Company reference data for a list of ids. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_non_periodic_for_list**
> NonPeriodicResponse get_non_periodic_for_list(non_periodic_request)

Returns Private Company Reference Data.

Retrieves non-periodic reference information for specified Private Companies. Use the ```/universe``` endpoint to retrieve valid Private Company identifiers. Use the ```/metrics``` endpoint to retrieve a full list of valid metrics or data items.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateCompany
from fds.sdk.FactSetPrivateCompany.api import non_periodic_api
from fds.sdk.FactSetPrivateCompany.models import *
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
configuration = fds.sdk.FactSetPrivateCompany.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateCompany.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateCompany.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = non_periodic_api.NonPeriodicApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    non_periodic_request = NonPeriodicRequest(
        data=NonPeriodicRequestBody(
            ids=PrivateMarketIds({"oneId":{"summary":"One security or entity identifier","value":["0H3R4Y-E"]},"multipleIds":{"summary":"Multiple security or entity identifiers","value":["0H3R4Y-E","0G3F5Z-E","00DK61-E"]}}),
            metrics=NonPeriodicMetrics({"oneNonPeriodicMetric":{"summary":"One non-periodic metric","value":["FPE_AMT_RAISED"]},"multipleNonPeriodicMetrics":{"summary":"Multiple non-periodic metrics","value":["FPE_AMT_RAISED","FPD_CEO_CURR"]}}),
        ),
    ) # NonPeriodicRequest | Request Body to request a list of Private Company non-periodic objects.

    try:
        # Returns Private Company Reference Data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_non_periodic_for_list(non_periodic_request)

        pprint(api_response)

    except fds.sdk.FactSetPrivateCompany.ApiException as e:
        print("Exception when calling NonPeriodicApi->get_non_periodic_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **non_periodic_request** | [**NonPeriodicRequest**](NonPeriodicRequest.md)| Request Body to request a list of Private Company non-periodic objects. |

### Return type

[**NonPeriodicResponse**](NonPeriodicResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Private Company Reference data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

