# fds.sdk.FactSetOptions.PricesVolumeApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_options_prices_for_list**](PricesVolumeApi.md#get_options_prices_for_list) | **POST** /factset-options/v1/prices | Returns the pricing related information for the specified option identifier
[**get_options_volume_for_list**](PricesVolumeApi.md#get_options_volume_for_list) | **POST** /factset-options/v1/volume | Returns the volume details for the specified option identifier
[**get_underlying_volume_for_list**](PricesVolumeApi.md#get_underlying_volume_for_list) | **POST** /factset-options/v1/underlying-volume | Returns the aggregate volume and open interest for the list of the options under the specified security identifier



# **get_options_prices_for_list**
> OptionsPricesResponse get_options_prices_for_list(options_prices_request)

Returns the pricing related information for the specified option identifier

Returns the pricing related information for the specified option identifier. Items include -  * Ask * Bid * Mid * Mid Bid Ask * Settlement * Last Price Type (Settlement or MidBidAsk) * Last Price * Strike Price * Underlying Security Price * 52 Week High/Low * Open, High, Low for day. Note securities must be trading for day requested.    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import prices__volume_api
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
    api_instance = prices__volume_api.PricesVolumeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    options_prices_request = OptionsPricesRequest(
        ids=OptionIds(["TSLA.US#CD33M-USA"]),
        start_date="2021-05-09",
        end_date="2021-05-03",
        frequency=Frequency("D"),
        currency="USD",
        calendar=Calendar("FIVEDAY"),
    ) # OptionsPricesRequest | Options Prices Request Body

    try:
        # Returns the pricing related information for the specified option identifier
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_options_prices_for_list(options_prices_request)

        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling PricesVolumeApi->get_options_prices_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options_prices_request** | [**OptionsPricesRequest**](OptionsPricesRequest.md)| Options Prices Request Body |

### Return type

[**OptionsPricesResponse**](OptionsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Options Prices Response Object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_options_volume_for_list**
> OptionsVolumeResponse get_options_volume_for_list(options_volume_request)

Returns the volume details for the specified option identifier

Returns the volume details for the specified option identifier for a specified exchange. Data items include -  * Open Interest * Volume    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import prices__volume_api
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
    api_instance = prices__volume_api.PricesVolumeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    options_volume_request = OptionsVolumeRequest(
        ids=OptionIds(["TSLA.US#CD33M-USA"]),
        start_date="2021-05-09",
        end_date="2021-05-03",
        frequency=Frequency("D"),
        exchange=Exchange("USA"),
        calendar=Calendar("FIVEDAY"),
    ) # OptionsVolumeRequest | Volume Request Object

    try:
        # Returns the volume details for the specified option identifier
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_options_volume_for_list(options_volume_request)

        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling PricesVolumeApi->get_options_volume_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **options_volume_request** | [**OptionsVolumeRequest**](OptionsVolumeRequest.md)| Volume Request Object |

### Return type

[**OptionsVolumeResponse**](OptionsVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Volume Response Object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_underlying_volume_for_list**
> UnderlyingVolumeResponse get_underlying_volume_for_list(underlying_volume_request)

Returns the aggregate volume and open interest for the list of the options under the specified security identifier

Return the Volume and Open Interest details for list of the options for the specified underlying security identifier. The data is aggregated for all options contracts associated to the underlying id, or specified in the request only the contracts listed on a specific exchange. Data Includes -  * Put Call Ratio  * Total Put Volume & Open Interest * Total Call Volume & Open Interest * Total Put & Call Volume & Open Interest    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import prices__volume_api
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
    api_instance = prices__volume_api.PricesVolumeApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    underlying_volume_request = UnderlyingVolumeRequest(
        ids=UnderlyingIds(["TSLA-US"]),
        start_date="2021-05-09",
        end_date="2021-05-03",
        frequency=Frequency("D"),
        exchange=Exchange("USA"),
    ) # UnderlyingVolumeRequest | Underlying Volume Request Body

    try:
        # Returns the aggregate volume and open interest for the list of the options under the specified security identifier
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_underlying_volume_for_list(underlying_volume_request)

        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling PricesVolumeApi->get_underlying_volume_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **underlying_volume_request** | [**UnderlyingVolumeRequest**](UnderlyingVolumeRequest.md)| Underlying Volume Request Body |

### Return type

[**UnderlyingVolumeResponse**](UnderlyingVolumeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Underlying Volume and Open Interest Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

