# fds.sdk.FactSetEstimates.SegmentActualsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_segment_actuals**](SegmentActualsApi.md#get_segment_actuals) | **GET** /factset-estimates/v2/segment-actuals | Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.
[**get_segment_actuals_for_list**](SegmentActualsApi.md#get_segment_actuals_for_list) | **POST** /factset-estimates/v2/segment-actuals | Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.



# **get_segment_actuals**
> SegmentActualsResponse get_segment_actuals(ids, )

Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.

Returns FactSet Estimates Actuals data using rolling fiscal dates for company business and geographic segments. <p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import segment_actuals_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = segment_actuals_api.SegmentActualsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-USA"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. <p>***ids limit** =  3000 per request*</p> _Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history._ 
    relative_fiscal_start = -2 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for `relativeFiscalStart` must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0).  (optional)
    relative_fiscal_end = 0 # int | Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for `relativeFiscalEnd` must be an integer that is zero or less.  For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). (optional)
    periodicity = "ANN" # str | The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     (optional) if omitted the server will use the default value of "ANN"
    currency = "USD" # str | Currency code for adjusting the data. Use `ESTIMATE` as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). (optional)

    try:
        # Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_segment_actuals(ids, relative_fiscal_start=relative_fiscal_start, relative_fiscal_end=relative_fiscal_end, periodicity=periodicity, currency=currency)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling SegmentActualsApi->get_segment_actuals: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted input. &lt;p&gt;***ids limit** &#x3D;  3000 per request*&lt;/p&gt; _Make Note - id limit of 3000 for defaults, otherwise the service is limited to a 30 second duration. This can be reached when increasing total number of metrics requested and depth of history._  |
 **segment_type** | **str**| Controls the type of segment selected.   * **BUS** &#x3D; Business / Product Segment   * **GEO** &#x3D; Geographic Segment  | defaults to "BUS"
 **metrics** | **[str]**| Requested metrics for segment actuals. An asterisk denotes metric items included for geographic segments. Note, the number of metrics you are allowed to supply is limited to 1 for now. For more details, visit [Online Assistant Page #15034](https://oa.apps.factset.com/pages/15034).  &lt;h3&gt;Financial Metrics&lt;/h3&gt; |field|description| |---|---| |ASP|Average Selling Price| |ARR|Annual Recurring Revenue| |CAPEX|Capital Expenditures| |CCUR_GRTH*|Constant Currency Revenue Growth*| |COS*|Cost of Sales*| |CFO_GAAP|Chief Financial Officer (GAAP)| |DELIVERIES_UNITS|Deliveries Units| |EPS|Earnings Per Share| |EBIT*|Earnings Before Interest and Taxes*| |EBIT_REP|Earnings Before Interest and Taxes - Reported| |EBITDA*|Earnings Before Interest, Taxes, Depreciation, and Amortization*| |EBITDA_REP|Earnings Before Interest, Taxes, Depreciation, and Amortization - Reported| |G_A_EXP|General &amp; Admin Expense| |GROSS_INC*|Gross Income*| |GMV*|Gross Merchandise Volume*| |LCUR_GRTH*|Local Currency Revenue Growth*| |NET_ADDS|Net Adds| |NET_INC*|Net Profit*| |NET_SALES*|Net Sales*| |SUBSCRIBERS_NB*|Number of Subscribers*| |ORGANICGROWTH*|Organic Growth*| |PTX_INC|Pre-Tax Income| |RATEBASE*|Ratebase*| |AVGRATEBASE|Avg. Ratebase| |SALES*|Sales*| |SAMESTORESALES|Same Store Sales| |SGA|Selling, General &amp; Administrative Expenses| |S_M_EXP|Selling &amp; Marketing Expenses| |REV_TOT*|Total Revenues*|   &lt;h3&gt;Industry Metrics&lt;/h3&gt; |field|description| |---|---| |UNITS|Units| |NEW_ORDERS_VALUE*|Home Builders - New Orders Value*| |BACKLOG_VALUE|Home Builders - Backlog Value| |MCR|Hospitals - Medical Cost Ratio (%)| |CASH_COST|Mining - Cash Cost| |REAL_PRICE|Mining - Real Price| |DAU*|Social Media/Games - Daily Active Users*| |ARPU|Telecoms - Average Revenue Per User (ARPU)| |CONTR_PROF|Telecoms - Contribution Profit| |PAIDNADDS|Telecoms - Paid Net Adds|  | defaults to ["SALES"]
 **relative_fiscal_start** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period. FactSet Estimates Actuals provides data for past periods. Therefore, the input for &#x60;relativeFiscalStart&#x60; must be an integer that is zero or less. For example, set to 0 and periodicity to ANN to ask for the current reported year (FY0).  | [optional]
 **relative_fiscal_end** | **int**| Relative fiscal period, expressed as an integer, used to filter results. This is combined with the periodicity parameter to specify a relative estimate period.Therefore, the input for &#x60;relativeFiscalEnd&#x60; must be an integer that is zero or less.  For example, set to -2 and periodicity to ANN to ask for two fiscal years before the latest (FY-2). | [optional]
 **periodicity** | **str**| The periodicity for the estimates requested, allowing you to fetch Quarterly, Semi-Annual, Annual, and NTMA/LTMA Estimates.   * **ANN** - Annual   * **QTR** - Quarterly   * **SEMI** - Semi-Annual    * **NTMA** - Next-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.   * **LTMA** - Last-Twelve-Months - Time-weighted Annual. Estimates use a percentage of annual estimates from two fiscal years to create an estimate based on the 12-month period. Visit [OA 16614](https://my.apps.factset.com/oa/pages/16614) for detail.     | [optional] if omitted the server will use the default value of "ANN"
 **currency** | **str**| Currency code for adjusting the data. Use &#x60;ESTIMATE&#x60; as input value for the values in Estimate Currency. For a list of currency ISO codes, visit [Online Assistant Page #1470](https://oa.apps.factset.com/pages/1470). | [optional]

### Return type

[**SegmentActualsResponse**](SegmentActualsResponse.md)

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

# **get_segment_actuals_for_list**
> SegmentActualsResponse get_segment_actuals_for_list(segment_actuals_request)

Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.

Returns FactSet Estimates Actuals data using rolling fiscal dates for company business and geographic segments. <p> 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetEstimates
from fds.sdk.FactSetEstimates.api import segment_actuals_api
from fds.sdk.FactSetEstimates.models import *
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
configuration = fds.sdk.FactSetEstimates.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetEstimates.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetEstimates.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = segment_actuals_api.SegmentActualsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    segment_actuals_request = SegmentActualsRequest(
        ids=Ids(["FDS-US"]),
        metrics=MetricSegments(["SALES"]),
        segment_type=SegmentType("BUS"),
        relative_fiscal_start=RelativeFiscalStartActuals(-2),
        relative_fiscal_end=RelativeFiscalEndActuals(0),
        periodicity=Periodicity("ANN"),
        currency="USD",
    ) # SegmentActualsRequest | Request object for Estimate Data Items.

    try:
        # Retrieves Segment Actuals for a requested list of ids and reported fiscal periods.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_segment_actuals_for_list(segment_actuals_request)

        pprint(api_response)

    except fds.sdk.FactSetEstimates.ApiException as e:
        print("Exception when calling SegmentActualsApi->get_segment_actuals_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **segment_actuals_request** | [**SegmentActualsRequest**](SegmentActualsRequest.md)| Request object for Estimate Data Items. |

### Return type

[**SegmentActualsResponse**](SegmentActualsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | List of Estimate metric Ids |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

