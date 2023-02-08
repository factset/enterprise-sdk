# fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.SpreadApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_bond_spread**](SpreadApi.md#get_bond_spread) | **GET** /markit-bond-prices-and-analytics/v1/spread | Get the Spread and OAS data for a list of securities
[**get_bond_spread_for_list**](SpreadApi.md#get_bond_spread_for_list) | **POST** /markit-bond-prices-and-analytics/v1/spread | Request the Spread and OAS data for a list of securities



# **get_bond_spread**
> BondSpreadResponse get_bond_spread(ids)

Get the Spread and OAS data for a list of securities

Get spread details like discount margin, OAS, Asset Swap Spread, Z Spread, spread benchmark provided by Markit for a specified date range and frequency. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.api import spread_api
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models import *
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
configuration = fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = spread_api.SpreadApi(api_client)

    ids = ["US45905URL07"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. <p>***ids limit** = 2000  per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2021-01-01" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
    end_date = "2021-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  (optional)
    frequency = "D" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional) if omitted the server will use the default value of "D"
    calendar = "FIVEDAY" # str | Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities' trading calendar which excludes date records for respective holiday periods. (optional) if omitted the server will use the default value of "FIVEDAY"

    try:
        # Get the Spread and OAS data for a list of securities
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_bond_spread(ids, start_date=start_date, end_date=end_date, frequency=frequency, calendar=calendar)
        pprint(api_response)

    except fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiException as e:
        print("Exception when calling SpreadApi->get_bond_spread: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP, ISIN and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D; 2000  per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] if omitted the server will use the default value of "D"
 **calendar** | **str**| Calendar of data returned. SEVENDAY includes weekends. LOCAL calendar will default to the securities&#39; trading calendar which excludes date records for respective holiday periods. | [optional] if omitted the server will use the default value of "FIVEDAY"

### Return type

[**BondSpreadResponse**](BondSpreadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bond Spread items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_bond_spread_for_list**
> BondSpreadResponse get_bond_spread_for_list(bond_spread_request)

Request the Spread and OAS data for a list of securities

Get spread details like discount margin, OAS, Asset Swap Spread, Z Spread, spread benchmark provided by Markit for a specified date range and frequency. 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.api import spread_api
from fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.models import *
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
configuration = fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = spread_api.SpreadApi(api_client)

    bond_spread_request = BondSpreadRequest(
        ids=Ids(["US45905URL07"]),
        start_date="2021-01-01",
        end_date="2021-12-31",
        frequency=Frequency("D"),
        calendar=Calendar("FIVEDAY"),
    ) # BondSpreadRequest | Request object for requesting pricing data

    try:
        # Request the Spread and OAS data for a list of securities
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_bond_spread_for_list(bond_spread_request)
        pprint(api_response)

    except fds.sdk.SPGlobalFixedIncomeEvaluatedPricesandAnalytics.ApiException as e:
        print("Exception when calling SpreadApi->get_bond_spread_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bond_spread_request** | [**BondSpreadRequest**](BondSpreadRequest.md)| Request object for requesting pricing data |

### Return type

[**BondSpreadResponse**](BondSpreadResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Bond Prices data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

