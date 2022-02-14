# fds.sdk.FactSetEstimates.ConsensusApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fixed_consensus**](ConsensusApi.md#get_fixed_consensus) | **GET** /factset-estimates/v2/fixed-consensus | Retrieves consensus estimates for a requested list of ids and fixed fiscal periods
[**get_fixed_consensus_for_list**](ConsensusApi.md#get_fixed_consensus_for_list) | **POST** /factset-estimates/v2/fixed-consensus | FactSet consensus estimates for fixed fiscal periods
[**get_rolling_consensus**](ConsensusApi.md#get_rolling_consensus) | **GET** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.
[**get_rolling_consensus_for_list**](ConsensusApi.md#get_rolling_consensus_for_list) | **POST** /factset-estimates/v2/rolling-consensus | Retrieves consensus estimates for a requested list of ids and rolling fiscal periods


# **get_fixed_consensus**
> ConsensusResponse get_fixed_consensus(ids, metrics)

Retrieves consensus estimates for a requested list of ids and fixed fiscal periods

Returns FactSet Estimates consensus data using fixed fiscal dates. For example, if the company's current unreported year is 12/2020, all data returned by formulas that specify as the period/report basis will be for 12/2005 regardless of what perspective dates (startDate/endDate) are used. The fixed dates are \"locked\" in time and all estimated values are for that explicit date. If you are requesting that the estimated periods can change with the perspective date, please use the rolling-consensus endpoint. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import consensus_api
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.consensus_response import ConsensusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = consensus_api.ConsensusApi(api_client)
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
    metrics = [
        "SALES",
    ] # [str] | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
    start_date = "2019-07-30" # str | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = "2020-07-30" # str | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional) if omitted the server will use the default value of "D"
    fiscal_period_start = "2019" # str | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional)
    fiscal_period_end = "2020" # str | Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  (optional)
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  (optional) if omitted the server will use the default value of "ANN"
    currency = "USD" # str | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieves consensus estimates for a requested list of ids and fixed fiscal periods
        api_response = api_instance.get_fixed_consensus(ids, metrics)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_fixed_consensus: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieves consensus estimates for a requested list of ids and fixed fiscal periods
        api_response = api_instance.get_fixed_consensus(ids, metrics, start_date=start_date, end_date=end_date, frequency=frequency, fiscal_period_start=fiscal_period_start, fiscal_period_end=fiscal_period_end, periodicity=periodicity, currency=currency)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_fixed_consensus: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  |
 **metrics** | **[str]**| Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  |
 **start_date** | **str**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] if omitted the server will use the default value of "D"
 **fiscal_period_start** | **str**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional]
 **fiscal_period_end** | **str**| Fiscal period start expressed in absolute date formats. Date that will fall back to most recent completed period during resolution.   * **Fiscal Quarter-end** - YYYY/FQ (e.g., 2019/1F, 2019/2F, 2019/3F, 2019/4F)   * **Fiscal Year-end** - YYYY (e.g. 2019)  | [optional]
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  | [optional] if omitted the server will use the default value of "ANN"
 **currency** | **str**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Consensus Estimate Data Items. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fixed_consensus_for_list**
> ConsensusResponse get_fixed_consensus_for_list(fixed_consensus_request)

FactSet consensus estimates for fixed fiscal periods

Returns FactSet Estimates consensus data using fixed fiscal dates. For example, if the company's current unreported year is 12/2020, all data returned by formulas that specify as the period/report basis will be for 12/2005 regardless of what perspective dates (startDate/endDate) are used. The fixed dates are \"locked\" in time and all estimated values are for that explicit date. If you are requesting that the estimated periods can change with the perspective date, please use the rolling-consensus endpoint. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import consensus_api
from fds.sdk.FactSetEstimates.model.fixed_consensus_request import FixedConsensusRequest
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.consensus_response import ConsensusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = consensus_api.ConsensusApi(api_client)
    fixed_consensus_request = FixedConsensusRequest(
        ids=Ids(["FDS-US"]),
        metrics=Metrics(["SALES"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("AM"),
        fiscal_period_start="2019",
        fiscal_period_end="2020",
        periodicity=Periodicity("ANN"),
        currency="USD",
    ) # FixedConsensusRequest | Request object for Estimate Data Items.

    # example passing only required values which don't have defaults set
    try:
        # FactSet consensus estimates for fixed fiscal periods
        api_response = api_instance.get_fixed_consensus_for_list(fixed_consensus_request)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_fixed_consensus_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fixed_consensus_request** | [**FixedConsensusRequest**](FixedConsensusRequest.md)| Request object for Estimate Data Items. |

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rolling_consensus**
> ConsensusResponse get_rolling_consensus(ids, metrics)

Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.

Returns FactSet Estimates consensus data using rolling fiscal dates. <p>The rolling behavior causes fiscal year to automatically roll from one year to the next as the historical perspective date changes. The fiscal period rolls forward as of each period end. This endpoint is optimized to allow the request to simply include a relative fiscal period (e.g. use relativeFiscalStart integer 1 and periodicity ANN for next unreported fiscal year end), and then see what the consensus thought the \"next fiscal year\" estimates were through time as you \"roll\" back your perspective dates. This differs from locking down an absolute estimate period such as explicitly stating Fiscal Year 2019. This can be done in the fixed-consensus endpoint.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import consensus_api
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.consensus_response import ConsensusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = consensus_api.ConsensusApi(api_client)
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. * 
    metrics = [
        "SALES",
    ] # [str] | Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034). 
    start_date = "2019-07-30" # str | Start date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    end_date = "2020-07-30" # str | End date for point in time of estimates expressed in YYYY-MM-DD format. (optional)
    frequency = "D" # str | Controls the frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** = Quarterly, based on the start date.   * **AY** = Actual Annual, based on the start date.   (optional) if omitted the server will use the default value of "D"
    relative_fiscal_start = 1 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). (optional)
    relative_fiscal_end = 3 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). (optional)
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  (optional) if omitted the server will use the default value of "ANN"
    currency = "USD" # str | Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)

    # example passing only required values which don't have defaults set
    try:
        # Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.
        api_response = api_instance.get_rolling_consensus(ids, metrics)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_rolling_consensus: %s\n" % e)

    # example passing only required values which don't have defaults set
    # and optional values
    try:
        # Retrieves consensus estimates for a requested list of ids and rolling fiscal periods.
        api_response = api_instance.get_rolling_consensus(ids, metrics, start_date=start_date, end_date=end_date, frequency=frequency, relative_fiscal_start=relative_fiscal_start, relative_fiscal_end=relative_fiscal_end, periodicity=periodicity, currency=currency)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_rolling_consensus: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; * Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history. *  |
 **metrics** | **[str]**| Requested metrics. Use the /metrics endpoint to return a list of available estimate items. Note, the number of metrics you are allowed to supply is limited to 1 for now. **Top 10** most used metrics are **EPS, SALES, DPS, EBITDA,EBIT, PRICE_TGT, CFPS, BPS, NET_INC, and ASSETS**.  For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  |
 **start_date** | **str**| Start date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **end_date** | **str**| End date for point in time of estimates expressed in YYYY-MM-DD format. | [optional]
 **frequency** | **str**| Controls the frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).         * **AQ** &#x3D; Quarterly, based on the start date.   * **AY** &#x3D; Actual Annual, based on the start date.   | [optional] if omitted the server will use the default value of "D"
 **relative_fiscal_start** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 1 and periodicity to ANN to ask for relative Fiscal Year 1 (FY1). | [optional]
 **relative_fiscal_end** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. For example, set to 2 and periodicity to ANN to ask for relative Fiscal Year 1 (FY2). | [optional]
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.  | [optional] if omitted the server will use the default value of "ANN"
 **currency** | **str**| Currency code for adjusting the data. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_rolling_consensus_for_list**
> ConsensusResponse get_rolling_consensus_for_list(rolling_consensus_request)

Retrieves consensus estimates for a requested list of ids and rolling fiscal periods

Returns FactSet Estimates consensus data using rolling fiscal dates. <p>The rolling behavior causes fiscal year to automatically roll from one year to the next as the historical perspective date changes. The fiscal period rolls forward as of each period end. This endpoint is optimized to allow the request to simply include a relative fiscal period (e.g. use relativeFiscalStart integer 1 and periodicity ANN for next unreported fiscal year end), and then see what the consensus thought the \"next fiscal year\" estimates were through time as you \"roll\" back your perspective dates. This differs from locking down an absolute estimate period such as explicitly stating Fiscal Year 2019. This can be done in the fixed-consensus endpoint.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import consensus_api
from fds.sdk.FactSetEstimates.model.rolling_consensus_request import RollingConsensusRequest
from fds.sdk.FactSetEstimates.model.error_response import ErrorResponse
from fds.sdk.FactSetEstimates.model.consensus_response import ConsensusResponse
from pprint import pprint

# See configuration.py for a list of all supported configuration parameters.

# Examples for each supported authentication method are below,
# choose one that satisfies your use case.

# (Preferred) OAuth 2.0: FactSetOAuth2
# See https://github.com/FactSet/enterprise-sdk#oauth-20
# for information on how to create the app-config.json file
# See https://github.com/FactSet/enterprise-sdk-utils-python#authentication
# for more information on using the ConfidentialClient class
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client = ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username = 'USERNAME-SERIAL',
#     password = 'API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = consensus_api.ConsensusApi(api_client)
    rolling_consensus_request = RollingConsensusRequest(
        ids=Ids(["FDS-US"]),
        metrics=Metrics(["SALES"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("AM"),
        relative_fiscal_start=1,
        relative_fiscal_end=3,
        periodicity=Periodicity("ANN"),
        currency="USD",
    ) # RollingConsensusRequest | Request object for Rolling Conensus estimates.

    # example passing only required values which don't have defaults set
    try:
        # Retrieves consensus estimates for a requested list of ids and rolling fiscal periods
        api_response = api_instance.get_rolling_consensus_for_list(rolling_consensus_request)
        pprint(api_response)
    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling ConsensusApi->get_rolling_consensus_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **rolling_consensus_request** | [**RollingConsensusRequest**](RollingConsensusRequest.md)| Request object for Rolling Conensus estimates. |

### Return type

[**ConsensusResponse**](ConsensusResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Rolling Conensus Estimate data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

