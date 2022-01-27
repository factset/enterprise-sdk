# fds.sdk.Symbology.TickerApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_ticker_history**](TickerApi.md#batch_ticker_history) | **POST** /symbology/v1/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**batch_translate_ticker**](TickerApi.md#batch_translate_ticker) | **POST** /symbology/v1/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.
[**ticker_history**](TickerApi.md#ticker_history) | **GET** /symbology/v1/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**translate_ticker**](TickerApi.md#translate_ticker) | **GET** /symbology/v1/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.


# **batch_ticker_history**
> TickerHistoryTranslationResponse batch_ticker_history(ticker_history_translation_request)

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_history_translation_response import TickerHistoryTranslationResponse
from fds.sdk.Symbology.model.ticker_history_translation_request import TickerHistoryTranslationRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Symbology.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Symbology.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Symbology.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)
    ticker_history_translation_request = TickerHistoryTranslationRequest(
        ids=GetIds(["GOOGL-US"]),
        ticker_type="REGION",
    ) # TickerHistoryTranslationRequest | Request Body for Ticker History

    # example passing only required values which don't have defaults set
    try:
        # Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
        api_response = api_instance.batch_ticker_history(ticker_history_translation_request)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->batch_ticker_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker_history_translation_request** | [**TickerHistoryTranslationRequest**](TickerHistoryTranslationRequest.md)| Request Body for Ticker History |

### Return type

[**TickerHistoryTranslationResponse**](TickerHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **batch_translate_ticker**
> TickerTranslationResponse batch_translate_ticker(ticker_translation_request)

Returns the Ticker-Exchange or Ticker-Region for a given security.

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_translation_response import TickerTranslationResponse
from fds.sdk.Symbology.model.ticker_translation_request import TickerTranslationRequest
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Symbology.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Symbology.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Symbology.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)
    ticker_translation_request = TickerTranslationRequest(
        ids=GetIds(["GOOGL-US"]),
        ticker_type="REGION",
        as_of_date="2010-01-01",
    ) # TickerTranslationRequest | Request Body for Ticker History

    # example passing only required values which don't have defaults set
    try:
        # Returns the Ticker-Exchange or Ticker-Region for a given security.
        api_response = api_instance.batch_translate_ticker(ticker_translation_request)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->batch_translate_ticker: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ticker_translation_request** | [**TickerTranslationRequest**](TickerTranslationRequest.md)| Request Body for Ticker History |

### Return type

[**TickerTranslationResponse**](TickerTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol Translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ticker_history**
> TickerHistoryTranslationResponse ticker_history(ids)

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.

Return the full history of Ticker changes for a given market security or FactSet Permanent Id. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_history_translation_response import TickerHistoryTranslationResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Symbology.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Symbology.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Symbology.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)
    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
    ticker_type = "REGION" # str | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS)  (optional) if omitted the server will use the default value of "REGION"

    # example passing only required values which don't have defaults set
    try:
        # Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
        api_response = api_instance.ticker_history(ids)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->ticker_history: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
        api_response = api_instance.ticker_history(ids, ticker_type=ticker_type)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->ticker_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. |
 **ticker_type** | **str**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] if omitted the server will use the default value of "REGION"

### Return type

[**TickerHistoryTranslationResponse**](TickerHistoryTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Symbol translation objects. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **translate_ticker**
> TickerTranslationResponse translate_ticker(ids)

Returns the Ticker-Exchange or Ticker-Region for a given security.

Returns the Ticker-Exchange or Ticker-Region for a given security. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
import time
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_translation_response import TickerTranslationResponse
from pprint import pprint
# Defining the host is optional and defaults to https://api.factset.com/content
# See configuration.py for a list of all supported configuration parameters.
configuration = fds.sdk.Symbology.Configuration(
    host = "https://api.factset.com/content"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://developer.factset.com/applications
configuration = fds.sdk.Symbology.Configuration(
     fds_oauth_client = ConfidentialClient('app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://developer.factset.com/manage-api-keys
# configuration = fds.sdk.Symbology.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)
    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId`.
    ticker_type = "REGION" # str | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS)  (optional) if omitted the server will use the default value of "REGION"
    as_of_date = "2010-01-01" # str | As-Of date for historical symbol request in YYYY-MM-DD format. (optional)

    # example passing only required values which don't have defaults set
    try:
        # Returns the Ticker-Exchange or Ticker-Region for a given security.
        api_response = api_instance.translate_ticker(ids)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->translate_ticker: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Returns the Ticker-Exchange or Ticker-Region for a given security.
        api_response = api_instance.translate_ticker(ids, ticker_type=ticker_type, as_of_date=as_of_date)
        pprint(api_response)
    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->translate_ticker: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#x60;. |
 **ticker_type** | **str**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] if omitted the server will use the default value of "REGION"
 **as_of_date** | **str**| As-Of date for historical symbol request in YYYY-MM-DD format. | [optional]

### Return type

[**TickerTranslationResponse**](TickerTranslationResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response of Ticker-Exchange or Ticker-Region for a given security. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivty 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

