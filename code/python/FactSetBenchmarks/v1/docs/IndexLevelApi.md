# fds.sdk.FactSetBenchmarks.IndexLevelApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_benchmark_ratios**](IndexLevelApi.md#get_benchmark_ratios) | **GET** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**get_benchmark_ratios_for_list**](IndexLevelApi.md#get_benchmark_ratios_for_list) | **POST** /factset-benchmarks/v1/ratios | Returns the aggregated ratios of a requested benchmark
[**get_index_history**](IndexLevelApi.md#get_index_history) | **GET** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**get_index_history_for_list**](IndexLevelApi.md#get_index_history_for_list) | **POST** /factset-benchmarks/v1/index-history | Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
[**get_index_snapshot**](IndexLevelApi.md#get_index_snapshot) | **GET** /factset-benchmarks/v1/index-snapshot | Index Level Prices, Returns, and related information as of a single date.
[**get_index_snapshot_for_list**](IndexLevelApi.md#get_index_snapshot_for_list) | **POST** /factset-benchmarks/v1/index-snapshot | Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.


# **get_benchmark_ratios**
> BenchmarkRatiosResponse get_benchmark_ratios(ids, metrics)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines fundamental, estimates, and pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.benchmark_ratios_response import BenchmarkRatiosResponse
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    metrics = ["LTD_EQ"] # [str] | Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |<p>***metrics limit** =  38 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "startDate_example" # str | Requested start date expressed in YYYY-MM-DD format. (optional)
    end_date = "endDate_example" # str | Requested End Date for Range expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional) (default to "D")
    periodicity = "LTM" # str | The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  (optional) (default to "LTM")
    currency = "currency_example" # str | Currency for response. (optional)

    try:
        # Returns the aggregated ratios of a requested benchmark
        api_response = api_instance.get_benchmark_ratios(ids, metrics, start_date=start_date, end_date=end_date, frequency=frequency, periodicity=periodicity, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_benchmark_ratios: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **metrics** | **[str]**| Requested List of  FactSet Market Aggregates (FMA) or ratios. provided the below complete metrics list. |metric item|Description|category|periodicity |:---|:---|:---|:---| |GROSS_MARGIN|Gross Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |OPER_INC_SALES|Operating Margin|Profitability (%)|LTM, QTR |NET_MGN|Net Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBIT_MARGIN|EBIT Margin|Profitability (%)| NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |EBITDA_MARGIN|EBITDA Margin|Profitability (%)|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |ROA|Return on Assets|Profitability (%)|LTM |ROE|Return on Equity|Profitability (%)|NTMA, LTMA, LTM, 0, 1, 2 |ROIC|Return on Invested Capital|Profitability (%)| LTM |FCF_MGN|Free Cash Flow Margin|Profitability (%)|LTM, QTR |PE|Price/Earnings|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PEX|Price/Earnings (excl negatives)|Valuation|LTM |PSALES|Price/Sales|Valuation|NTMA, LTMA, STMA, LTM, QTR, 0, 1, 2 |PBK|Price/Book Value|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCF|Price/Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |PCFX|Price/Cash Flow (excl negatives)|Valuation|LTM |PFCF|Price/Free Cash Flow|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBIT|Enterprise Value/EBIT|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_EBITDA|Enterprise Value/EBITDA|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |EVAL_SALES|Enterprise Value/Sales|Valuation|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA|Net Debt/EBITDA|Coverage|NTMA, LTMA, LTM, 0, 1, 2 |NDEBT_EBITDA_MIN_CAPEX|Net Debt/(EBITDA-Capex)|Coverage|LTM |DEBT_EBITDA|Total Debt/EBITDA|Coverage|LTM |DEBT_EBIT|Total Debt/EBIT|Coverage|LTM |EBIT_INT_EXP|EBIT/Interest Expense (Int. Coverage)|Coverage|LTM |EBITDA_INT_EXP|EBITDA/Interest Expense|Coverage|LTM |OPER_CF_INT_EXP|CFO/Interest Expense|Coverage|LTM |LTD_EBITDA|LT Debt/EBITDA|Coverage|LTM |NDEBT_FFO|Net Debt/FFO|Coverage|LTM |LTD_FFO|LT Debt/FFO|Coverage|LTM |FCF_DEBT|FCF/Total Debt|Coverage|LTM |OPER_CF_DEBT|CFO/Total Debt|Coverage|LTM |LTD_EQ|LT Debt/Total Equity|Leverage(%)|LTM |LTD_TCAP|LT Debt/Total Capital|Leverage(%)|LTM |LTD_ASSETS|LT Debt/Total Assets|Leverage(%)|LTM |DEBT_ASSETS|Total Debt/Total Assets|Leverage(%)|LTM |DEBT_EQ|Total Debt/Total Equity|Leverage(%)|LTM |NDEBT_TCAP|Net Debt/Total Capital|Leverage(%)|LTM |DEBT_TCAP|Total Debt/Total Capital|Leverage(%)|LTM |&lt;p&gt;***metrics limit** &#x3D;  38 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| Requested start date expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] if omitted the server will use the default value of "D"
 **periodicity** | **str**| The calculation periodicity for the aggregated period. **Note** - Not all periodicities are supported for each metric, depending on the type of ratio. LTM is set as default and supported for all metrics. See Metrics Parameter for additional detail on which periodicities are available per metric. |Periodicity| Description| |:---|:---| |LTM| Last Twelve Months |LTMA| Last Twelve Months using Broker Actuals for Estimated Items |STMA| Second Twelve Month Forward |NTMA| 12 Month Forward |0| Latest Reported Calendar Year |1| Current Unreported Year |2| Following Year |QTR| Quarterly - Reported by companies  | [optional] if omitted the server will use the default value of "LTM"
 **currency** | **str**| Currency for response. | [optional]

### Return type

[**BenchmarkRatiosResponse**](BenchmarkRatiosResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Benchmark Ratio data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_benchmark_ratios_for_list**
> BenchmarkRatiosResponse get_benchmark_ratios_for_list(benchmark_ratios_request)

Returns the aggregated ratios of a requested benchmark

Retrieves the index level ratios for a requested benchmark. Ratios supported are expressed through metrics parameter, and include Categories of Profitability, Valuation, Coverage, and Leverage. <p> Using FactSet Market Aggregates, the service combines FactSet Fundamental, FactSet Estimates, and FactSet Pricing content to derive ratios and per share values for global equity market indexes and commercial benchmark vendors. The constituents of the index are fetched on rolling basis over time period requested, and then the metric requested is aggregated up to the index level. To learn more about FMA, visit [OA 15778](https://my.apps.factset.com/oa/pages/15778).</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.benchmark_ratios_response import BenchmarkRatiosResponse
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from fds.sdk.FactSetBenchmarks.model.benchmark_ratios_request import BenchmarkRatiosRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    benchmark_ratios_request = BenchmarkRatiosRequest(
        ids=IndexIds(["SP50"]),
        start_date="2018-12-31",
        end_date="2019-12-31",
        periodicity=Periodicity("LTM"),
        metrics=Metrics(["PE"]),
        frequency=Frequency("CY"),
        currency="USD",
    ) # BenchmarkRatiosRequest | Requests benchmark ratios for a given id

    try:
        # Returns the aggregated ratios of a requested benchmark
        api_response = api_instance.get_benchmark_ratios_for_list(benchmark_ratios_request)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_benchmark_ratios_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **benchmark_ratios_request** | [**BenchmarkRatiosRequest**](BenchmarkRatiosRequest.md)| Requests benchmark ratios for a given id |

### Return type

[**BenchmarkRatiosResponse**](BenchmarkRatiosResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Benchmark Ratio Response Items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_index_history**
> IndexHistoryResponse get_index_history(ids)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as of a date range requested. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date range to retrieve Index Level Prices, Returns, and related information. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from fds.sdk.FactSetBenchmarks.model.index_history_response import IndexHistoryResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    start_date = "startDate_example" # str | Requested start date expressed in YYYY-MM-DD format. (optional)
    end_date = "endDate_example" # str | Requested End Date for Range expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.  (optional) (default to "D")
    return_type = "GROSS" # str | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. (optional) (default to "GROSS")
    hedge_type = "UNHEDGED" # str | The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. (optional) (default to "UNHEDGED")
    currency = "currency_example" # str | Currency for response. (optional)
    calendar = "FIVEDAY" # str | Calendar of data returned. SEVENDAY includes weekends. (optional) (default to "FIVEDAY")

    try:
        # Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
        api_response = api_instance.get_index_history(ids, start_date=start_date, end_date=end_date, frequency=frequency, return_type=return_type, hedge_type=hedge_type, currency=currency, calendar=calendar)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_index_history: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **start_date** | **str**| Requested start date expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| Requested End Date for Range expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.  | [optional] if omitted the server will use the default value of "D"
 **return_type** | **str**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] if omitted the server will use the default value of "GROSS"
 **hedge_type** | **str**| The hedge type adjustment used in returns response items. Adjustment can be made for HEDGED and UNHEDGED values that will be included in the return calculation. The service will default to UNHEDGED. | [optional] if omitted the server will use the default value of "UNHEDGED"
 **currency** | **str**| Currency for response. | [optional]
 **calendar** | **str**| Calendar of data returned. SEVENDAY includes weekends. | [optional] if omitted the server will use the default value of "FIVEDAY"

### Return type

[**IndexHistoryResponse**](IndexHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of Index Level Prices and Returns information for a requested date range. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_index_history_for_list**
> IndexHistoryResponse get_index_history_for_list(index_history_request)

Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.index_history_request import IndexHistoryRequest
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from fds.sdk.FactSetBenchmarks.model.index_history_response import IndexHistoryResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    index_history_request = IndexHistoryRequest(
        ids=IndexIds(["SP50"]),
        start_date="2018-12-31",
        end_date="2019-12-31",
        frequency=Frequency("CY"),
        return_type=ReturnType("GROSS"),
        hedge_type=HedgeType("UNHEDGED"),
        currency="USD",
        calendar=Calendar("FIVEDAY"),
    ) # IndexHistoryRequest | Requests Index Level History Prices and Returns for a list of identifiers and specified date range.

    try:
        # Retrieves Index Level Prices and Returns information for a list of identifiers and historical date range.
        api_response = api_instance.get_index_history_for_list(index_history_request)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_index_history_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index_history_request** | [**IndexHistoryRequest**](IndexHistoryRequest.md)| Requests Index Level History Prices and Returns for a list of identifiers and specified date range. |

### Return type

[**IndexHistoryResponse**](IndexHistoryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of Index Level Prices and Returns information for a requested date range. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_index_snapshot**
> IndexSnapshotResponse get_index_snapshot(ids)

Index Level Prices, Returns, and related information as of a single date.

Retrieves Index Level Prices and Returns information as of a specific date. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.index_snapshot_response import IndexSnapshotResponse
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    ids = [
        "ids_example",
    ] # [str] | Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. <p>***ids limit** =  500 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>*
    date = "date_example" # str | Date of holding expressed in YYYY-MM-DD format. (optional)
    return_type = "GROSS" # str | The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. (optional) (default to "GROSS")
    currency = "currency_example" # str | Currency for response. (optional)
    calendar = "FIVEDAY" # str | Calendar of data returned. SEVENDAY includes weekends. (optional) (default to "FIVEDAY")

    try:
        # Index Level Prices, Returns, and related information as of a single date.
        api_response = api_instance.get_index_snapshot(ids, date=date, return_type=return_type, currency=currency, calendar=calendar)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_index_snapshot: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Benchmark Identifiers. Reference the helper endpoint **/id-list** to get a sample list of  valid identifiers. &lt;p&gt;***ids limit** &#x3D;  500 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;* |
 **date** | **str**| Date of holding expressed in YYYY-MM-DD format. | [optional]
 **return_type** | **str**| The return type adjustment used in returns response items. Adjustment can be made for GROSS and NET dividends that will be included in the return calculation. The service will default to GROSS. | [optional] if omitted the server will use the default value of "GROSS"
 **currency** | **str**| Currency for response. | [optional]
 **calendar** | **str**| Calendar of data returned. SEVENDAY includes weekends. | [optional] if omitted the server will use the default value of "FIVEDAY"

### Return type

[**IndexSnapshotResponse**](IndexSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of Index Level Prices and Returns information as of a single date |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_index_snapshot_for_list**
> IndexSnapshotResponse get_index_snapshot_for_list(index_snapshot_request)

Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.

Retrieves Index Level Prices and Returns information as aligned with FactSet's Benchmark Data Feed solution. Simply submit a valid Benchmark ID (you can use the /id-list endpoint for a sample list of ids), and date and retrieve Index Level Prices, Returns, and related information. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetBenchmarks
from fds.sdk.FactSetBenchmarks.api import index_level_api
from fds.sdk.FactSetBenchmarks.model.index_snapshot_response import IndexSnapshotResponse
from fds.sdk.FactSetBenchmarks.model.error_response import ErrorResponse
from fds.sdk.FactSetBenchmarks.model.index_snapshot_request import IndexSnapshotRequest
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetBenchmarks.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetBenchmarks.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetBenchmarks.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = index_level_api.IndexLevelApi(api_client)

    index_snapshot_request = IndexSnapshotRequest(
        ids=IndexIds(["SP50"]),
        date="2020-08-06",
        return_type=ReturnType("GROSS"),
        currency="USD",
        calendar=Calendar("FIVEDAY"),
    ) # IndexSnapshotRequest | Requests the Index Level Snapshot for a requested list of identifiers and specified date.

    try:
        # Retrieves the Index Level Snapshot of Prices and Returns information for a given identifier and single date.
        api_response = api_instance.get_index_snapshot_for_list(index_snapshot_request)
        pprint(api_response)

    except fds.sdk.FactSetBenchmarks.ApiException as e:
        print("Exception when calling IndexLevelApi->get_index_snapshot_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **index_snapshot_request** | [**IndexSnapshotRequest**](IndexSnapshotRequest.md)| Requests the Index Level Snapshot for a requested list of identifiers and specified date. |

### Return type

[**IndexSnapshotResponse**](IndexSnapshotResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | An array of Index Level Prices and Returns information as of a single date. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

