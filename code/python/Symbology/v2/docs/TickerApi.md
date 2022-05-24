# fds.sdk.Symbology.TickerApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**batch_ticker_history**](TickerApi.md#batch_ticker_history) | **POST** /symbology/v2/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**batch_translate_ticker**](TickerApi.md#batch_translate_ticker) | **POST** /symbology/v2/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security.
[**ticker_history**](TickerApi.md#ticker_history) | **GET** /symbology/v2/ticker-history | Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
[**translate_ticker**](TickerApi.md#translate_ticker) | **GET** /symbology/v2/ticker | Returns the Ticker-Exchange or Ticker-Region for a given security. - Current Only


# **batch_ticker_history**
> TickerHistoryTranslationResponse batch_ticker_history(ticker_history_translation_request)

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. <p> This method is best for requesting **large universes** of `ids`.</p><p>**This endpoint is included with all other Content API packages.**</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_history_translation_response import TickerHistoryTranslationResponse
from fds.sdk.Symbology.model.ticker_history_translation_request import TickerHistoryTranslationRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)

    ticker_history_translation_request = TickerHistoryTranslationRequest(
        ids=GetIds(["GOOGL-US"]),
        ticker_type="REGION",
        as_of_date="2010-01-01",
    ) # TickerHistoryTranslationRequest | Response Body for Ticker History

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
 **ticker_history_translation_request** | [**TickerHistoryTranslationRequest**](TickerHistoryTranslationRequest.md)| Response Body for Ticker History |

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

Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security. <p> This method is best for requesting **large universes** of `ids`.</p><p>**This endpoint is included with all other Content API packages.**</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_translation_response import TickerTranslationResponse
from fds.sdk.Symbology.model.ticker_translation_request import TickerTranslationRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)

    ticker_translation_request = TickerTranslationRequest(
        ids=GetIds(["GOOGL-US"]),
        ticker_type="REGION",
    ) # TickerTranslationRequest | Request Body for Ticker History

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

Return the full history of Ticker changes for a given market security or FactSet Permanent Id. <p> *GET Method is limited by URL Length of 2,048 characters. If a large universe of symbols is requested, it's advised to use POST method to retrieve the same response model.*</p>

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_history_translation_response import TickerHistoryTranslationResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)

    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    ticker_type = "REGION" # str | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS)  (optional) (default to "REGION")
    as_of_date = "2010-01-01" # str | As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. (optional)

    try:
        # Returns the full history of Ticker-Exchange or Ticker-Region changes for a requested security.
        api_response = api_instance.ticker_history(ids, ticker_type=ticker_type, as_of_date=as_of_date)
        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->ticker_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **ticker_type** | **str**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] if omitted the server will use the default value of "REGION"
 **as_of_date** | **str**| As-Of date for historical symbol request in YYYY-MM-DD format. This is the date requested in the service. If no asOfDate was requested, the response will be null. | [optional]

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

Returns the Ticker-Exchange or Ticker-Region for a given security. - Current Only

Returns the Ticker-Exchange or Ticker-Region for a given security.\\ 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.Symbology
from fds.sdk.Symbology.api import ticker_api
from fds.sdk.Symbology.model.error_response import ErrorResponse
from fds.sdk.Symbology.model.ticker_translation_response import TickerTranslationResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.Symbology.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.Symbology.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.Symbology.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ticker_api.TickerApi(api_client)

    ids = ["GOOGL-US"] # [str] | Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, `requestId'. <p>***ids limit** =  3000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    ticker_type = "REGION" # str | Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** = Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** = TIcker-Exchange (e.g. GOOGL-NAS)  (optional) (default to "REGION")

    try:
        # Returns the Ticker-Exchange or Ticker-Region for a given security. - Current Only
        api_response = api_instance.translate_ticker(ids, ticker_type=ticker_type)
        pprint(api_response)

    except fds.sdk.Symbology.ApiException as e:
        print("Exception when calling TickerApi->translate_ticker: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested market securities or entities. Accepted identifiers include all FactSet Permanent Identifiers types, CUSIP, SEDOL, ISIN, and Tickers. This request value is sent back in the response as, &#x60;requestId&#39;. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **ticker_type** | **str**| Controls the Ticker Type returned. The only accepted parameter values are REGION or EXCHANGE.   * **REGION** &#x3D; Ticker-Regional (e.g. GOOGL-US)   * **EXCHANGE** &#x3D; TIcker-Exchange (e.g. GOOGL-NAS)  | [optional] if omitted the server will use the default value of "REGION"

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

