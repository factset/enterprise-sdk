# fds.sdk.FactSetFunds.PricesReturnsAndDistributionsApi

All URIs are relative to *https://api.factset.com/content/factset-funds/v3*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_funds_distributions**](PricesReturnsAndDistributionsApi.md#get_funds_distributions) | **GET** /distributions | Get Fund Distributions (Current or Historical)
[**get_funds_distributions_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_distributions_for_list) | **POST** /distributions | Get Fund Distributions (Current or Historical) for a list
[**get_funds_prices**](PricesReturnsAndDistributionsApi.md#get_funds_prices) | **GET** /prices | Get Fund Prices (NAV) for a requested time-series
[**get_funds_prices_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_prices_for_list) | **POST** /prices | Get Fund Prices (NAV) for a requested date range and large list of IDs.
[**get_funds_returns**](PricesReturnsAndDistributionsApi.md#get_funds_returns) | **GET** /returns | Get Fund Returns for a requested time-series
[**get_funds_returns_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_returns_for_list) | **POST** /returns | Get Fund Returns for a requested time-series and large list of IDs.
[**get_funds_returns_range**](PricesReturnsAndDistributionsApi.md#get_funds_returns_range) | **GET** /returns/range | Get Fund Returns for a user-defined date range
[**get_funds_returns_range_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_returns_range_for_list) | **POST** /returns/range | Get Fund Returns over pre-defined time horizons as of a specific date for large list of IDs.
[**get_funds_returns_snapshot**](PricesReturnsAndDistributionsApi.md#get_funds_returns_snapshot) | **GET** /returns/snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
[**get_funds_returns_snapshot_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_returns_snapshot_for_list) | **POST** /returns/snapshot | Get Fund Returns over pre-defined time horizons as of a specific date.
[**get_funds_yield**](PricesReturnsAndDistributionsApi.md#get_funds_yield) | **GET** /yields | Get Fund Yield for a user-defined date range for large list of IDs.
[**get_funds_yield_for_list**](PricesReturnsAndDistributionsApi.md#get_funds_yield_for_list) | **POST** /yields | Get Fund Yield for a user-defined date range for large list of IDs.



# **get_funds_distributions**
> DistributionsResponse get_funds_distributions(ids)

Get Fund Distributions (Current or Historical)

Retrieves either current or historical fund distributions based on the `distributionType` parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    distribution_type = DistributionType("CURRENT") # DistributionType | Selects whether to return current or historical distributions. (optional)
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    frequency = Frequency("M") # Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)
    currency = "USD" # str | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional) if omitted the server will use the default value of "USD"
    split_adjust = SplitAdjust("SPLIT") # SplitAdjust | Controls the split adjustment of the Fund's NAV -    * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **UNSPLIT** = No Adjustments, Controls the split and dividend adjustments for the prices.  (optional)
    pagination_limit = 100 # int | The maximum number of records to return. The default is 20. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | The number of records to skip before the first record to return. The default is 0. (optional) if omitted the server will use the default value of 0

    try:
        # Get Fund Distributions (Current or Historical)
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_distributions(ids, distribution_type=distribution_type, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, split_adjust=split_adjust, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_distributions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **distribution_type** | **DistributionType**| Selects whether to return current or historical distributions. | [optional]
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional]
 **currency** | **str**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] if omitted the server will use the default value of "USD"
 **split_adjust** | **SplitAdjust**| Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  | [optional]
 **pagination_limit** | **int**| The maximum number of records to return. The default is 20. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| The number of records to skip before the first record to return. The default is 0. | [optional] if omitted the server will use the default value of 0

### Return type

[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_distributions_for_list**
> DistributionsResponse get_funds_distributions_for_list(distributions_request)

Get Fund Distributions (Current or Historical) for a list

Retrieves either current or historical fund distributions for a list of funds based on the `distributionType` parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    distributions_request = DistributionsRequest(
        data=DistributionsRequestItem(
            ids=Ids(["MABAX","SPY"]),
            distribution_type=DistributionType("CURRENT"),
            currency="USD",
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            frequency=Frequency("M"),
            split_adjust=SplitAdjust("SPLIT"),
        ),
        meta=MetaRequest(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # DistributionsRequest | Distributions request body

    try:
        # Get Fund Distributions (Current or Historical) for a list
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_distributions_for_list(distributions_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_distributions_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **distributions_request** | [**DistributionsRequest**](DistributionsRequest.md)| Distributions request body |

### Return type

[**DistributionsResponse**](DistributionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_prices**
> FundsPricesResponse get_funds_prices(ids)

Get Fund Prices (NAV) for a requested time-series

Get Fund Prices (NAV) for a requested date range and list of IDs.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    frequency = Frequency("M") # Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)
    currency = "USD" # str | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional) if omitted the server will use the default value of "USD"
    data_type = NavDataType("ROLL") # NavDataType | The Data Type of the NAV expressed as Raw or Rolled values. (optional)
    split_adjust = SplitAdjust("SPLIT") # SplitAdjust | Controls the split adjustment of the Fund's NAV -    * **SPLIT** = Split ONLY Adjusted. This is used by default.   * **UNSPLIT** = No Adjustments, Controls the split and dividend adjustments for the prices.  (optional)
    pagination_limit = 100 # int | The maximum number of records to return. The default is 20. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | The number of records to skip before the first record to return. The default is 0. (optional) if omitted the server will use the default value of 0

    try:
        # Get Fund Prices (NAV) for a requested time-series
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_prices(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, data_type=data_type, split_adjust=split_adjust, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_prices: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional]
 **currency** | **str**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] if omitted the server will use the default value of "USD"
 **data_type** | **NavDataType**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional]
 **split_adjust** | **SplitAdjust**| Controls the split adjustment of the Fund&#39;s NAV -    * **SPLIT** &#x3D; Split ONLY Adjusted. This is used by default.   * **UNSPLIT** &#x3D; No Adjustments, Controls the split and dividend adjustments for the prices.  | [optional]
 **pagination_limit** | **int**| The maximum number of records to return. The default is 20. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| The number of records to skip before the first record to return. The default is 0. | [optional] if omitted the server will use the default value of 0

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_prices_for_list**
> FundsPricesResponse get_funds_prices_for_list(funds_prices_request)

Get Fund Prices (NAV) for a requested date range and large list of IDs.

Fetch fund prices (NAV) as of a requested date range and a large list of IDs.  

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    funds_prices_request = FundsPricesRequest(
        data=FundsPricesRequestData(
            ids=Ids(["MABAX","SPY"]),
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            frequency=Frequency("M"),
            currency="USD",
            data_type=NavDataType("ROLL"),
            split_adjust=SplitAdjust("SPLIT"),
        ),
        meta=MetaRequest(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # FundsPricesRequest | The Prices request body, allowing the user to specify a list of IDs and date ranges.

    try:
        # Get Fund Prices (NAV) for a requested date range and large list of IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_prices_for_list(funds_prices_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_prices_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_prices_request** | [**FundsPricesRequest**](FundsPricesRequest.md)| The Prices request body, allowing the user to specify a list of IDs and date ranges. |

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns**
> FundsReturnsResponse get_funds_returns(ids)

Get Fund Returns for a requested time-series

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the `dividendAdjust` parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFirstDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    frequency = Frequency("M") # Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)
    currency = "USD" # str | The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) (optional) if omitted the server will use the default value of "USD"
    dividend_adjust = DividendAdjust("DIV") # DividendAdjust | Controls the dividend inclusion for the NAV returns calculations -   * **DIV** = Include Dividends, Total Return   * **NO_DIV** = Exclude Dividends, Simple Return  (optional)
    pagination_limit = 100 # int | The maximum number of records to return. The default is 20. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | The number of records to skip before the first record to return. The default is 0. (optional) if omitted the server will use the default value of 0

    try:
        # Get Fund Returns for a requested time-series
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_returns(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, dividend_adjust=dividend_adjust, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional]
 **currency** | **str**| The ISO3 currency control for the requested fund. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470) | [optional] if omitted the server will use the default value of "USD"
 **dividend_adjust** | **DividendAdjust**| Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  | [optional]
 **pagination_limit** | **int**| The maximum number of records to return. The default is 20. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| The number of records to skip before the first record to return. The default is 0. | [optional] if omitted the server will use the default value of 0

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_for_list**
> FundsReturnsResponse get_funds_returns_for_list(funds_returns_request)

Get Fund Returns for a requested time-series and large list of IDs.

Get Fund NAV Returns over a time-series for the requested date range and frequency. <p>The simple Total Return NAV shows the fund's total return level by reinvesting distributions so that ex-date NAVs are increased by the distribution amount and compounded thereafter. Total return NAV compounds daily and is calculated from the first available NAV date of each fund. The total return NAV series reflects the value that an investor would own if it had purchased one share at the inception date and reinvested all dividends on a Gross basis.</p><p> Control the dividends to include or exclude using the `dividendAdjust` parameter. The first available NAV date of each fund can be found in the /summary endpoint as `priceFirstDate`. Visit [OA #21437](https://my.apps.factset.com/oa/pages/21437) for more details.</p>

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    funds_returns_request = FundsReturnsRequest(
        data=FundsReturnsRequestData(
            ids=Ids(["MABAX","SPY"]),
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            frequency=Frequency("M"),
            currency="USD",
            dividend_adjust=DividendAdjust("DIV"),
        ),
        meta=MetaRequest(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # FundsReturnsRequest | The Returns request body, allowing the user to specify a list of IDs.

    try:
        # Get Fund Returns for a requested time-series and large list of IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_returns_for_list(funds_returns_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_returns_request** | [**FundsReturnsRequest**](FundsReturnsRequest.md)| The Returns request body, allowing the user to specify a list of IDs. |

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_range**
> ReturnsRangeResponse get_funds_returns_range(ids)

Get Fund Returns for a user-defined date range

Get Fund Returns between a specified `startDate` and `endDate`. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the `dividendAdjust` parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    dividend_adjust = DividendAdjust("DIV") # DividendAdjust | Controls the dividend inclusion for the NAV returns calculations -   * **DIV** = Include Dividends, Total Return   * **NO_DIV** = Exclude Dividends, Simple Return  (optional)

    try:
        # Get Fund Returns for a user-defined date range
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_returns_range(ids, start_date=start_date, end_date=end_date, dividend_adjust=dividend_adjust)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns_range: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **dividend_adjust** | **DividendAdjust**| Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  | [optional]

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_range_for_list**
> ReturnsRangeResponse get_funds_returns_range_for_list(returns_range_request)

Get Fund Returns over pre-defined time horizons as of a specific date for large list of IDs.

Get Fund Returns between a specified `startDate` and `endDate`. The service will compute the return between those two periods to retrieve the single value and does not create a time-series. Control the return type to include or exclude dividends by using the `dividendAdjust` parameter.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    returns_range_request = ReturnsRangeRequest(
        data=ReturnsRangeRequestData(
            ids=Ids(["MABAX","SPY"]),
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            dividend_adjust=DividendAdjust("DIV"),
        ),
    ) # ReturnsRangeRequest | The Returns Range request body, allowing the user to specify a list of IDs.

    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date for large list of IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_returns_range_for_list(returns_range_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns_range_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **returns_range_request** | [**ReturnsRangeRequest**](ReturnsRangeRequest.md)| The Returns Range request body, allowing the user to specify a list of IDs. |

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_snapshot**
> FundsReturnsSnapshotResponse get_funds_returns_snapshot(ids)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the `dividendAdjust` parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized * tenYear * tenYearAnnualized 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    date = dateutil_parser('2025-01-01').date() # date | The date for snapshot data in YYYY-MM-DD format. (optional)
    dividend_adjust = DividendAdjust("DIV") # DividendAdjust | Controls the dividend inclusion for the NAV returns calculations -   * **DIV** = Include Dividends, Total Return   * **NO_DIV** = Exclude Dividends, Simple Return  (optional)

    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_returns_snapshot(ids, date=date, dividend_adjust=dividend_adjust)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns_snapshot: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **date** | **date**| The date for snapshot data in YYYY-MM-DD format. | [optional]
 **dividend_adjust** | **DividendAdjust**| Controls the dividend inclusion for the NAV returns calculations -   * **DIV** &#x3D; Include Dividends, Total Return   * **NO_DIV** &#x3D; Exclude Dividends, Simple Return  | [optional]

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_returns_snapshot_for_list**
> FundsReturnsSnapshotResponse get_funds_returns_snapshot_for_list(funds_returns_snapshot_request)

Get Fund Returns over pre-defined time horizons as of a specific date.

Get Fund Returns over pre-defined time horizons as of a specific date. Use the date parameter to set the perspective date, and adjust the return type to include or exclude dividends using the `dividendAdjust` parameter. Returns Ranges include -  * oneWeek * oneMonth * threeMonth * yearToDate * oneYear * threeYear * threeYearAnnualized * fiveYear * fiveYearAnnualized  * tenYear * tenYearAnnualized 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    funds_returns_snapshot_request = FundsReturnsSnapshotRequest(
        data=FundsReturnsSnapshotRequestData(
            ids=Ids(["MABAX","SPY"]),
            date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            dividend_adjust=DividendAdjust("DIV"),
        ),
    ) # FundsReturnsSnapshotRequest | The Returns Snapshot request body, allowing the user to specify a list of IDs.

    try:
        # Get Fund Returns over pre-defined time horizons as of a specific date.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_returns_snapshot_for_list(funds_returns_snapshot_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_returns_snapshot_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **funds_returns_snapshot_request** | [**FundsReturnsSnapshotRequest**](FundsReturnsSnapshotRequest.md)| The Returns Snapshot request body, allowing the user to specify a list of IDs. |

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
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_yield**
> YieldsResponse get_funds_yield(ids)

Get Fund Yield for a user-defined date range for large list of IDs.

Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***IDs limit** =  10 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = dateutil_parser('2025-01-01').date() # date | The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. (optional)
    end_date = dateutil_parser('2025-12-31').date() # date | The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint (optional)
    frequency = Frequency("M") # Frequency | Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional)
    pagination_limit = 100 # int | The maximum number of records to return. The default is 20. (optional) if omitted the server will use the default value of 20
    pagination_offset = 0 # int | The number of records to skip before the first record to return. The default is 0. (optional) if omitted the server will use the default value of 0

    try:
        # Get Fund Yield for a user-defined date range for large list of IDs.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_yield(ids, start_date=start_date, end_date=end_date, frequency=frequency, pagination_limit=pagination_limit, pagination_offset=pagination_offset)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_yield: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***IDs limit** &#x3D;  10 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of IDs, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **date**| The start date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint. | [optional]
 **end_date** | **date**| The end date requested for a given date range in YYYY-MM-DD format. If left blank, the API will default to previous close.Future dates (T+1) are not accepted in this endpoint | [optional]
 **frequency** | **Frequency**| Controls the display frequency of the data returned. The supported frequencies are:    - **D**: Daily - **W**: Weekly, based on the last day of the week of the start date. - **M**: Monthly, based on the last trading day of the month. - **AM**: Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16, etc.). - **CQ**: Quarterly, based on the last trading day of the calendar quarter (March, June, September, or December). - **FQ**: Fiscal Quarter of the company. - **AY**: Actual Annual, based on the start date. - **CY**: Calendar Annual, based on the last trading day of the calendar year. - **FY**: Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional]
 **pagination_limit** | **int**| The maximum number of records to return. The default is 20. | [optional] if omitted the server will use the default value of 20
 **pagination_offset** | **int**| The number of records to skip before the first record to return. The default is 0. | [optional] if omitted the server will use the default value of 0

### Return type

[**YieldsResponse**](YieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Yields response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_yield_for_list**
> YieldsResponse get_funds_yield_for_list(yields_request)

Get Fund Yield for a user-defined date range for large list of IDs.

Returns SEC Yield of a fund. * Net SEC yield is the subsidized or after waivers. * Gross SEC yield is the unsubsidized or before waivers. * The Net will be bigger than the Gross if part of the fees are waived. If Gross and Net are equal, no fees were waived * SEC Yield for Mutual Funds is in percentage form while ETFs will depend on the fund. * Data is returned for both Mutual Funds and ETFs. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import prices_returns_and_distributions_api
from fds.sdk.FactSetFunds.models import *
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
configuration = fds.sdk.FactSetFunds.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFunds.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFunds.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = prices_returns_and_distributions_api.PricesReturnsAndDistributionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    yields_request = YieldsRequest(
        data=YieldsRequestData(
            ids=Ids(["MABAX","SPY"]),
            start_date=dateutil_parser('Wed Jan 01 00:00:00 UTC 2025').date(),
            end_date=dateutil_parser('Wed Dec 31 00:00:00 UTC 2025').date(),
            frequency=Frequency("M"),
        ),
        meta=MetaRequest(
            pagination=PaginationRequest(
                limit=100,
                offset=0,
            ),
        ),
    ) # YieldsRequest | The Yields request body, allowing the user to specify a list of IDs and date.

    try:
        # Get Fund Yield for a user-defined date range for large list of IDs.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_yield_for_list(yields_request)

        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling PricesReturnsAndDistributionsApi->get_funds_yield_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **yields_request** | [**YieldsRequest**](YieldsRequest.md)| The Yields request body, allowing the user to specify a list of IDs and date. |

### Return type

[**YieldsResponse**](YieldsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Yields response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**404** | The requested resource was not found. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**422** | Unprocessable Entity. Your request data was syntactically correct but semantically invalid. Check the required parameters and their value constraints.  |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

