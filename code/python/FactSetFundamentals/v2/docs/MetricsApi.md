# fds.sdk.FactSetFundamentals.MetricsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fds_fundamentals_metrics**](MetricsApi.md#get_fds_fundamentals_metrics) | **GET** /metrics | Returns available FactSet Fundamental metrics and ratios.



# **get_fds_fundamentals_metrics**
> MetricsResponse get_fds_fundamentals_metrics()

Returns available FactSet Fundamental metrics and ratios.

Returns list of available FF_* metrics that can be used in the `metrics` parameter of related endpoints. These are related to FactSet Fundamentals standardized data. As Reported will be available in future endpoints. Leave Category and Subcategory blank to request all available items. The Endpoint Data model is optimized for time-series data with periodicity. Some items in this list are non-time series. **For methodology definitions, reference the `OApageID` or `OAurl` response items to launch the available methodology page.** 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import metrics_api
from fds.sdk.FactSetFundamentals.models import *
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
configuration = fds.sdk.FactSetFundamentals.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetFundamentals.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetFundamentals.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = metrics_api.MetricsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    category = "INCOME_STATEMENT" # str | Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** = Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** = Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** = Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** = Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** = Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** = Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** = Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** = General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing-related market data.*   * **MISCELLANEOUS** = Corporation Data, Financial Records details, Indicators.   * **DATES** = Relevant Dates  (optional)
    subcategory = "INCOME_STATEMENT" # str | Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, EXPENSES, OPERATING_COST, NON-RECURRING_ITEMS, REVENUES, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL, FINANCING_ACTIVITIES, OPERATING_ACTIVITIES, INVESTING_ACTIVITIES   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  (optional)
    metric_data_type = "integer" # str | Returns general data type of the metrics like integer, float or strings, when left blankmetrics with all data types would be returned  (optional)

    try:
        # Returns available FactSet Fundamental metrics and ratios.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fds_fundamentals_metrics(category=category, subcategory=subcategory, metric_data_type=metric_data_type)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling MetricsApi->get_fds_fundamentals_metrics: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **category** | **str**| Filters the list of FF_* metrics by major category -   * **INCOME_STATEMENT** &#x3D; Income Statement line items, such as Sales, Gross Profit, Net Income.   * **BALANCE_SHEET** &#x3D; Balance Sheet line items, such as Assets, Liabilities, and Shareholders Equity.   * **CASH_FLOW** &#x3D; Cash Flow Statement line items, such as Financing activities, Operation, and Per Share.   * **RATIOS** &#x3D; Pre-calculated Ratios, including Financial, Growth Rates, Profitability, Liquidity, Size, and Valuation.   * **FINANCIAL_SERVICES** &#x3D; Financial Statement Items modified for Financial Services companies.   * **INDUSTRY_METRICS** &#x3D; Industry Specific Line Items or Modifications. View subcategory for list of Industries.   * **PENSION_AND_POSTRETIREMENT** &#x3D; Accumulated Pension Benefit Obligations and related data.   * **MARKET_DATA** &#x3D; General Market Data, such as Shares Outstanding. *Note - /factset-prices/prices/ endpoints may be better suited for pricing-related market data.*   * **MISCELLANEOUS** &#x3D; Corporation Data, Financial Records details, Indicators.   * **DATES** &#x3D; Relevant Dates  | [optional]
 **subcategory** | **str**| Sub-Category Filter for the Primary Category Requested. Choose a related sub-category for the Category requested-   * **INCOME_STATEMENT** - INCOME_STATEMENT, NON-OPERATING, PER_SHARE, SUPPLEMENTAL, EXPENSES, OPERATING_COST, NON-RECURRING_ITEMS, REVENUES, OTHER   * **BALANCE_SHEET** - ASSETS, BALANCE_SHEET, HEALTHCARE, LIABILITIES, PER_SHARE, SHAREHOLDERS_EQUITY, SUPPLEMENTAL   * **CASH_FLOW** - CASH_FLOW, CHANGE_IN_CASH, FINANCING, INVESTING, OPERATING, PER_SHARE, SUPPLEMENTAL, FINANCING_ACTIVITIES, OPERATING_ACTIVITIES, INVESTING_ACTIVITIES   * **RATIOS** - FINANCIAL, GROWTH_RATE, LIQUIDITY, PROFITABILITY, SIZE, VALUATION   * **FINANCIAL_SERVICES** - BALANCE_SHEET, INCOME_STATEMENT, SUPPLEMENTAL   * **INDUSTRY_METRICS** - AIRLINES, BANKING, HOTELS_AND_GAMING, METALS_AND_MINING, OIL_AND_GAS, PHARMACEUTICAL, REIT, RETAIL, BANK, INSURANCE, UTILITY   * **PENSION_AND_POSTRETIREMENT** - PENSION_AND_POSTRETIREMENT   * **MARKET_DATA** - MARKET_DATA   * **MISCELLANEOUS** - CLASSIFICATION, CORPORATE_DATA, FINANCIAL_RECORDS, INDICATOR, EMPLOYEES_AND_MANAGEMENT   * **DATES** - DATES  | [optional]
 **metric_data_type** | **str**| Returns general data type of the metrics like integer, float or strings, when left blankmetrics with all data types would be returned  | [optional]

### Return type

[**MetricsResponse**](MetricsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fundamental data metric items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

