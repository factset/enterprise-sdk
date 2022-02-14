# fds.sdk.FactSetFunds.PricesReturnsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_funds_prices**](PricesReturnsApi.md#get_funds_prices) | **GET** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested time-series
[**get_funds_prices_for_list**](PricesReturnsApi.md#get_funds_prices_for_list) | **POST** /factset-funds/v1/prices | Get Fund Prices (NAV) for a requested date range and large list of ids.
[**get_funds_returns**](PricesReturnsApi.md#get_funds_returns) | **GET** /factset-funds/v1/returns | Get Fund Returns for a requested time-series
[**get_funds_returns_for_list**](PricesReturnsApi.md#get_funds_returns_for_list) | **POST** /factset-funds/v1/returns | Get Fund Returns for a requested time-series and large list of ids
[**get_funds_returns_range**](PricesReturnsApi.md#get_funds_returns_range) | **GET** /factset-funds/v1/returns-range | Get Fund Returns for a user-defined date range
[**get_funds_returns_range_for_list**](PricesReturnsApi.md#get_funds_returns_range_for_list) | **POST** /factset-funds/v1/returns-range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
[**get_funds_returns_snapshot**](PricesReturnsApi.md#get_funds_returns_snapshot) | **GET** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
[**get_funds_returns_snapshot_for_list**](PricesReturnsApi.md#get_funds_returns_snapshot_for_list) | **POST** /factset-funds/v1/returns-snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.


# **get_funds_prices**
> FundsPricesResponse get_funds_prices(ids)

Get Fund Prices (NAV) for a requested time-series

Get Fund Prices (NAV) for a requested date range and list of ids. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.funds_prices_response import FundsPricesResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    frequency = "M" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional) if omitted the server will use the default value of "M"
    currency = "USD" # str | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional) if omitted the server will use the default value of "LOCAL"
    data_type = "ROLL" # str | The Data Type of the NAV expressed as Raw or Rolled values. (optional) if omitted the server will use the default value of "ROLL"
    split_adjust = "SPLIT" # str | The price adjustment split or unsplit. (optional) if omitted the server will use the default value of "SPLIT"

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Prices (NAV) for a requested time-series
        api_response = api_instance.get_funds_prices(ids)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_prices: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Fund Prices (NAV) for a requested time-series
        api_response = api_instance.get_funds_prices(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, data_type=data_type, split_adjust=split_adjust)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_prices: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] if omitted the server will use the default value of "M"
 **currency** | **str**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] if omitted the server will use the default value of "LOCAL"
 **data_type** | **str**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] if omitted the server will use the default value of "ROLL"
 **split_adjust** | **str**| The price adjustment split or unsplit. | [optional] if omitted the server will use the default value of "SPLIT"

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Prices response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_prices_for_list**
> FundsPricesResponse get_funds_prices_for_list(funds_prices_request)

Get Fund Prices (NAV) for a requested date range and large list of ids.

Fetch fund prices (NAV) as of a requested date range and a large list of ids.  

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.funds_prices_response import FundsPricesResponse
from fds.sdk.FactSetFunds.model.funds_prices_request import FundsPricesRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    funds_prices_request = FundsPricesRequest(
        ids=Ids(["MABAX","FCNTX"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("M"),
        currency="USD",
        data_type=DataType("ROLL"),
        split_adjust=SplitAdjust("SPLIT"),
    ) # FundsPricesRequest | The Prices request body, allowing the user to specify a list of ids.

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Prices (NAV) for a requested date range and large list of ids.
        api_response = api_instance.get_funds_prices_for_list(funds_prices_request)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_prices_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_prices_request** | [**FundsPricesRequest**](FundsPricesRequest.md)| The Prices request body, allowing the user to specify a list of ids. |

### Return type

[**FundsPricesResponse**](FundsPricesResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Prices response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns**
> FundsReturnsResponse get_funds_returns(ids)

Get Fund Returns for a requested time-series

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFristDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.funds_returns_response import FundsReturnsResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    frequency = "M" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional) if omitted the server will use the default value of "M"
    currency = "USD" # str | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional) if omitted the server will use the default value of "LOCAL"
    dividend_adjust = "DIV" # str | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return  (optional) if omitted the server will use the default value of "DIV"

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns for a requested time-series
        api_response = api_instance.get_funds_returns(ids)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Fund Returns for a requested time-series
        api_response = api_instance.get_funds_returns(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, dividend_adjust=dividend_adjust)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] if omitted the server will use the default value of "M"
 **currency** | **str**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] if omitted the server will use the default value of "LOCAL"
 **dividend_adjust** | **str**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] if omitted the server will use the default value of "DIV"

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_for_list**
> FundsReturnsResponse get_funds_returns_for_list(funds_returns_request)

Get Fund Returns for a requested time-series and large list of ids

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the dividendAdjust parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFristDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.funds_returns_request import FundsReturnsRequest
from fds.sdk.FactSetFunds.model.funds_returns_response import FundsReturnsResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    funds_returns_request = FundsReturnsRequest(
        ids=Ids(["MABAX","FCNTX"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("M"),
        currency="USD",
        dividend_adjust=DividendAdjust("DIV"),
    ) # FundsReturnsRequest | The Returns request body, allowing the user to specify a list of ids.

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns for a requested time-series and large list of ids
        api_response = api_instance.get_funds_returns_for_list(funds_returns_request)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_returns_request** | [**FundsReturnsRequest**](FundsReturnsRequest.md)| The Returns request body, allowing the user to specify a list of ids. |

### Return type

[**FundsReturnsResponse**](FundsReturnsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_range**
> ReturnsRangeResponse get_funds_returns_range(ids)

Get Fund Returns for a user-defined date range

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.returns_range_response import ReturnsRangeResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today's previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the `priceFirstDate` found within the /summary endpoint.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    dividend_adjust = "DIV" # str | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return  (optional) if omitted the server will use the default value of "DIV"

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns for a user-defined date range
        api_response = api_instance.get_funds_returns_range(ids)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_range: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Fund Returns for a user-defined date range
        api_response = api_instance.get_funds_returns_range(ids, start_date=start_date, end_date=end_date, dividend_adjust=dividend_adjust)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_range: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to the day prior to today&#39;s previous close. The startDate cannot be equal to the endDate as no return can be computed. Additionally, the startDate MUST be equal to or greater than the &#x60;priceFirstDate&#x60; found within the /summary endpoint.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **dividend_adjust** | **str**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] if omitted the server will use the default value of "DIV"

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns Range response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_range_for_list**
> ReturnsRangeResponse get_funds_returns_range_for_list(returns_range_request)

Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.

Get Fund Returns between a specified startDate and endDate. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the dividendAdjust parameter. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from fds.sdk.FactSetFunds.model.returns_range_request import ReturnsRangeRequest
from fds.sdk.FactSetFunds.model.returns_range_response import ReturnsRangeResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    returns_range_request = ReturnsRangeRequest(
        ids=Ids(["MABAX","FCNTX"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        dividend_adjust=DividendAdjust("DIV"),
    ) # ReturnsRangeRequest | The Returns Range request body, allowing the user to specify a list of ids.

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date for large list of ids.
        api_response = api_instance.get_funds_returns_range_for_list(returns_range_request)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_range_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returns_range_request** | [**ReturnsRangeRequest**](ReturnsRangeRequest.md)| The Returns Range request body, allowing the user to specify a list of ids. |

### Return type

[**ReturnsRangeResponse**](ReturnsRangeResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns Range response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_snapshot**
> FundsReturnsSnapshotResponse get_funds_returns_snapshot(ids)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.funds_returns_snapshot_response import FundsReturnsSnapshotResponse
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    date = "2018-12-31" # str | The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the `priceRecentDate` found within the /summary endpoint.  (optional)
    dividend_adjust = "DIV" # str | Controls the dividend inclusion for the NAV returns calculations, where -  * DIV = Include Dividends, Total Return * NO_DIV = Exclude Dividends, Simple Return  (optional) if omitted the server will use the default value of "DIV"

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date.
        api_response = api_instance.get_funds_returns_snapshot(ids)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_snapshot: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date.
        api_response = api_instance.get_funds_returns_snapshot(ids, date=date, dividend_adjust=dividend_adjust)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_snapshot: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **date** | **str**| The date requested for a given date range in YYYY-MM-DD format. The date MUST be equal to or less than the &#x60;priceRecentDate&#x60; found within the /summary endpoint.  | [optional]
 **dividend_adjust** | **str**| Controls the dividend inclusion for the NAV returns calculations, where -  * DIV &#x3D; Include Dividends, Total Return * NO_DIV &#x3D; Exclude Dividends, Simple Return  | [optional] if omitted the server will use the default value of "DIV"

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns Snapshot response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_snapshot_for_list**
> FundsReturnsSnapshotResponse get_funds_returns_snapshot_for_list(funds_returns_snapshot_request)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the dividendAdjust parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized  

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices__returns_api
from fds.sdk.FactSetFunds.model.funds_returns_snapshot_response import FundsReturnsSnapshotResponse
from fds.sdk.FactSetFunds.model.funds_returns_snapshot_request import FundsReturnsSnapshotRequest
from fds.sdk.FactSetFunds.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices__returns_api.PricesReturnsApi(api_client)
    funds_returns_snapshot_request = FundsReturnsSnapshotRequest(
        ids=Ids(["MABAX","FCNTX"]),
        date="2019-01-01",
        dividend_adjust=DividendAdjust("DIV"),
    ) # FundsReturnsSnapshotRequest | The Returns Snapshot request body, allowing the user to specify a list of ids.

    # example passing only required values which don't have defaults set
    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date.
        api_response = api_instance.get_funds_returns_snapshot_for_list(funds_returns_snapshot_request)
        pprint(api_response)
    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsApi->get_funds_returns_snapshot_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_returns_snapshot_request** | [**FundsReturnsSnapshotRequest**](FundsReturnsSnapshotRequest.md)| The Returns Snapshot request body, allowing the user to specify a list of ids. |

### Return type

[**FundsReturnsSnapshotResponse**](FundsReturnsSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Returns Snapshot response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

