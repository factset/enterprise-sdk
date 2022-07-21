# fds.sdk.FactSetFunds.FundFlowsAUMApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_funds_aum**](FundFlowsAUMApi.md#get_funds_aum) | **GET** /factset-funds/v1/aum | Get Fund AUM for a requested date range and list of ids
[**get_funds_aum_for_list**](FundFlowsAUMApi.md#get_funds_aum_for_list) | **POST** /factset-funds/v1/aum | Get Fund AUM for a requested date range and large list of ids
[**get_funds_flows**](FundFlowsAUMApi.md#get_funds_flows) | **GET** /factset-funds/v1/flows | Get Fund Flows for a requested date range and list of ids
[**get_funds_flows_for_list**](FundFlowsAUMApi.md#get_funds_flows_for_list) | **POST** /factset-funds/v1/flows | Get Fund Flows for a requested date range and large list of ids


# **get_funds_aum**
> AumResponse get_funds_aum(ids)

Get Fund AUM for a requested date range and list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import fund_flows__aum_api
from fds.sdk.FactSetFunds.models import *
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
    api_instance = fund_flows__aum_api.FundFlowsAUMApi(api_client)

    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    frequency = "M" # str | Controls the display frequency of the data returned.   * **MTD** = Month-To-Date   * **M** = Monthly, based on the last trading day of the month.   * **CQTD** = Calendar Quarter-to-Date   * **CQ** = Calendar Quarterly   * **CYTD** = Calendar Year-to-Date   * **CY** = Calendar Yearly  (optional) if omitted the server will use the default value of "M"
    currency = "USD" # str | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional) if omitted the server will use the default value of "LOCAL"
    data_type = "ROLL" # str | The Data Type of the NAV expressed as Raw or Rolled values. (optional) if omitted the server will use the default value of "ROLL"

    try:
        # Get Fund AUM for a requested date range and list of ids
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_aum(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency, data_type=data_type)
        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling FundFlowsAUMApi->get_funds_aum: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **MTD** &#x3D; Month-To-Date   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **CQTD** &#x3D; Calendar Quarter-to-Date   * **CQ** &#x3D; Calendar Quarterly   * **CYTD** &#x3D; Calendar Year-to-Date   * **CY** &#x3D; Calendar Yearly  | [optional] if omitted the server will use the default value of "M"
 **currency** | **str**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] if omitted the server will use the default value of "LOCAL"
 **data_type** | **str**| The Data Type of the NAV expressed as Raw or Rolled values. | [optional] if omitted the server will use the default value of "ROLL"

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The AUM response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_aum_for_list**
> AumResponse get_funds_aum_for_list(aum_request)

Get Fund AUM for a requested date range and large list of ids

Get the Fund Level or Share Class Level Assets Under Management (AUM). <p>NOTE - AUM can be accessed on a five-day calendar. If a vendor does not provide NAV and shares outstanding on a market holiday, the previous trading day value is used. If a vendor does provide data on a market holiday, that value will be presented, and then fund flows and AUM will be calculated. When you are manually calculating actual AUM on a market holiday or a rolled date, it will differ from the value shown in the FactSet workstation. This is due to the previous day's NAV being used in the manual AUM calculation.</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import fund_flows__aum_api
from fds.sdk.FactSetFunds.models import *
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
    api_instance = fund_flows__aum_api.FundFlowsAUMApi(api_client)

    aum_request = AumRequest(
        ids=Ids(["MABAX","FCNTX"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=FrequencyAum("M"),
        currency="USD",
        data_type=DataType("ROLL"),
    ) # AumRequest | The AUM request body, allowing the user to specify a list of ids.

    try:
        # Get Fund AUM for a requested date range and large list of ids
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_aum_for_list(aum_request)
        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling FundFlowsAUMApi->get_funds_aum_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **aum_request** | [**AumRequest**](AumRequest.md)| The AUM request body, allowing the user to specify a list of ids. |

### Return type

[**AumResponse**](AumResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The AUM response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_flows**
> FlowsResponse get_funds_flows(ids)

Get Fund Flows for a requested date range and list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import fund_flows__aum_api
from fds.sdk.FactSetFunds.models import *
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
    api_instance = fund_flows__aum_api.FundFlowsAUMApi(api_client)

    ids = ["MABAX-US"] # [str] | The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    start_date = "2018-12-31" # str | The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    end_date = "2019-12-31" # str | The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  (optional)
    frequency = "M" # str | Controls the display frequency of the data returned.   * **D** = Daily   * **W** = Weekly, based on the last day of the week of the start date.   * **M** = Monthly, based on the last trading day of the month.   * **AM** = Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** = Fiscal Quarter of the company.   * **AY** = Actual Annual, based on the start date.   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **FY** = Fiscal Annual, based on the last trading day of the company's fiscal year.  (optional) if omitted the server will use the default value of "M"
    currency = "USD" # str | Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. (optional) if omitted the server will use the default value of "LOCAL"

    try:
        # Get Fund Flows for a requested date range and list of ids
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_funds_flows(ids, start_date=start_date, end_date=end_date, frequency=frequency, currency=currency)
        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling FundFlowsAUMApi->get_funds_flows: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested fund identifier. FactSet Identifiers, tickers, CUSIP, SEDOL, and ISIN are accepted inputs. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **start_date** | **str**| The start date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **end_date** | **str**| The end date requested for a given date range in **YYYY-MM-DD** format. If left blank, the API will default to latest available completed period.  | [optional]
 **frequency** | **str**| Controls the display frequency of the data returned.   * **D** &#x3D; Daily   * **W** &#x3D; Weekly, based on the last day of the week of the start date.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **AM** &#x3D; Monthly, based on the start date (e.g., if the start date is June 16, data is displayed for June 16, May 16, April 16 etc.).   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **FQ** &#x3D; Fiscal Quarter of the company.   * **AY** &#x3D; Actual Annual, based on the start date.   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **FY** &#x3D; Fiscal Annual, based on the last trading day of the company&#39;s fiscal year.  | [optional] if omitted the server will use the default value of "M"
 **currency** | **str**| Controls the Currency conversion of the Fund. By default, the currency will use the funds local currency. | [optional] if omitted the server will use the default value of "LOCAL"

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The Fund Flows response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_funds_flows_for_list**
> FlowsResponse get_funds_flows_for_list(flows_request)

Get Fund Flows for a requested date range and large list of ids

Get the Fund Flows. One-day fund flows are calculated by subtracting the shares outstanding at previous close from the shares outstanding one day prior to close, and then multiplying the result by the net asset value (NAV) of one day prior to close.  The fund flows calculation breaks down as follows -  (Shares Outstanding T0 - Shares Outstanding T-1) * NAV T-1 While NAVs are routinely reported on a trade-day (T0) basis, industry-wide shares outstanding are a mixture of trade-day and next-day values. Trade-day values are not verified, as the actual creation/redemption activity takes place late in the evening, after NAVs and shares outstanding values have been published. The result is that multiple industry flows are calculated using unverified T0 values. FactSet has standardized all shares outstanding reporting on a next-day basis. To ensure that assets under management (AUM) and fund flows are synchronized, FactSet synchronizes shares outstanding values and changes with NAVs reported on the previous day, as the creations and redemptions used the previous day's reported NAVs as a transaction price. <p>For more information on Fund Flows Methodology, Time Windows, Makret Holidays, and Missing Values, visit - [OA #17863](https://my.apps.factset.com/oa/pages/17863#Flows_Calculation)</p> 

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFunds
from fds.sdk.FactSetFunds.api import fund_flows__aum_api
from fds.sdk.FactSetFunds.models import *
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
    api_instance = fund_flows__aum_api.FundFlowsAUMApi(api_client)

    flows_request = FlowsRequest(
        ids=Ids(["MABAX","FCNTX"]),
        start_date="2019-01-01",
        end_date="2019-12-31",
        frequency=Frequency("M"),
        currency="USD",
    ) # FlowsRequest | The Fund Flows request body, allowing the user to specify a list of ids.

    try:
        # Get Fund Flows for a requested date range and large list of ids
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_funds_flows_for_list(flows_request)
        pprint(api_response)

    except fds.sdk.FactSetFunds.ApiException as e:
        print("Exception when calling FundFlowsAUMApi->get_funds_flows_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **flows_request** | [**FlowsRequest**](FlowsRequest.md)| The Fund Flows request body, allowing the user to specify a list of ids. |

### Return type

[**FlowsResponse**](FlowsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | The AUM response object. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

