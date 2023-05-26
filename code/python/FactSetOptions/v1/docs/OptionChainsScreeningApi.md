# fds.sdk.FactSetOptions.OptionChainsScreeningApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_options_chains_for_list**](OptionChainsScreeningApi.md#get_options_chains_for_list) | **POST** /factset-options/v1/chains | Returns all the underlying option identifiers for the specified underlying Security identifier
[**get_options_screening_for_list**](OptionChainsScreeningApi.md#get_options_screening_for_list) | **POST** /factset-options/v1/option-screening | Returns all the option identifiers based on the conditions provided as input in the request



# **get_options_chains_for_list**
> ChainsResponse get_options_chains_for_list(chains_request)

Returns all the underlying option identifiers for the specified underlying Security identifier

Returns all the underlying option identifiers for the underlying security identifier. Specify the date and or exhcange for the list of options associated to the id.     *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import option_chains__screening_api
from fds.sdk.FactSetOptions.models import *
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
    api_instance = option_chains__screening_api.OptionChainsScreeningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    chains_request = ChainsRequest(
        ids=UnderlyingIds(["TSLA-US"]),
        date="2021-05-03",
        id_type=IdType("FOS"),
        exchange=Exchange("USA"),
    ) # ChainsRequest | Options Chains Request Object

    try:
        # Returns all the underlying option identifiers for the specified underlying Security identifier
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_options_chains_for_list(chains_request)
        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling OptionChainsScreeningApi->get_options_chains_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **chains_request** | [**ChainsRequest**](ChainsRequest.md)| Options Chains Request Object |

### Return type

[**ChainsResponse**](ChainsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Options Chain Response Object |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_options_screening_for_list**
> OptionScreeningResponse get_options_screening_for_list(option_screening_request)

Returns all the option identifiers based on the conditions provided as input in the request

Returns all the option identifiers based on the conditions provided as input in the request. Conditions are as follows and will follow \"AND\" logic if more than one condition is applied and allows up to **three conditions** using AND Logic.If a condition is used the accompanying value MUST be used -  |conditions|description| |---|---| |P_OPT_UNDERLYING_SECURITY_E|Underlying Security Equal To| |P_OPT_STRIKE_PRICE_E|Strike Price Equal To| |P_OPT_EXP_DATEN_E|Expiration Date (YYYYMMDD) Equal To| |P_OPT_VOLUME_G|Volume Greater Than| |P_OPT_VOLUME_GE|Volume Greater Than or Equal To| |P_OPT_VOLUME_L|Volume Less Than| |P_OPT_VOLUME_LE|Volume Less Than or Equal To| |P_OPT_VOLUME_E|Volume Equal To| |P_OPT_OPTION_TYPE_E|Option Type (1= Equity, 2=Index)| |P_OPT_CALL_OR_PUT_E|Call or Put (0=Call, 1=Put)|    *Currently only OPRA Exchange is supported with exchange ISO \"USA\"* 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOptions
from fds.sdk.FactSetOptions.api import option_chains__screening_api
from fds.sdk.FactSetOptions.models import *
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
    api_instance = option_chains__screening_api.OptionChainsScreeningApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    option_screening_request = OptionScreeningRequest(
        ids=ExchangeScreeningId("USA_OPTS"),
        condition_one="P_OPT_UNDERLYING_SECURITY_E",
        condition_one_value="AAPL",
        condition_two="P_OPT_CALL_OR_PUT_E",
        condition_two_value="1",
        condition_three="P_OPT_VOLUME_G",
        condition_three_value="0",
        date="2021-03-31",
    ) # OptionScreeningRequest | Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.  

    try:
        # Returns all the option identifiers based on the conditions provided as input in the request
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_options_screening_for_list(option_screening_request)
        pprint(api_response)

    except fds.sdk.FactSetOptions.ApiException as e:
        print("Exception when calling OptionChainsScreeningApi->get_options_screening_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **option_screening_request** | [**OptionScreeningRequest**](OptionScreeningRequest.md)| Option Screening Request. Example request asks for Put Options where Underlying Security is AAPL and Volume is greater than 0 as of 2021-03-31.   |

### Return type

[**OptionScreeningResponse**](OptionScreeningResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Option Screening Response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

