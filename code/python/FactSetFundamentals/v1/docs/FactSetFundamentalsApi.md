# fds.sdk.FactSetFundamentals.FactSetFundamentalsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fds_fundamentals**](FactSetFundamentalsApi.md#get_fds_fundamentals) | **GET** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.
[**get_fds_fundamentals_for_list**](FactSetFundamentalsApi.md#get_fds_fundamentals_for_list) | **POST** /factset-fundamentals/v1/fundamentals | Returns the Company Fundamental Data.



# **get_fds_fundamentals**
> FundamentalsResponse get_fds_fundamentals(ids, metrics)

Returns the Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import fact_set_fundamentals_api
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
    api_instance = fact_set_fundamentals_api.FactSetFundamentalsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["FDS-US"] # [str] | Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. <p>***ids limit** =  1000 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    metrics = ["FF_SALES"] # [str] | Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. <p>*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*</p> <p>***metrics limit** =  1600 per request*</p> *<p>Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \"POST\" method.</p>* 
    periodicity = "ANN" # str | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **LTM**  = Last Twelve Months,   * **LTMSG** = Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** = Year-to-date.  (optional) if omitted the server will use the default value of "QTR"
    fiscal_period_start = "2017-09-01" # str | Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
    fiscal_period_end = "2018-03-01" # str | Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  (optional)
    currency = "USD" # str | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (optional) if omitted the server will use the default value of "LOCAL"
    restated = "RP" # str | Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data  (optional) if omitted the server will use the default value of "RP"

    try:
        # Returns the Company Fundamental Data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fds_fundamentals(ids, metrics, periodicity=periodicity, fiscal_period_start=fiscal_period_start, fiscal_period_end=fiscal_period_end, currency=currency, restated=restated)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling FactSetFundamentalsApi->get_fds_fundamentals: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Security or Entity identifiers. FactSet Identifiers, tickers, CUSIP and SEDOL are accepted as input. &lt;p&gt;***ids limit** &#x3D;  1000 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of ids, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **metrics** | **[str]**| Requested List of Financial Statement Items or Ratios. Use /metrics endpoint for a complete list of available FF_* metric items. &lt;p&gt;*When requesting multiple metrics, you cannot mix metric data types (e.g. strings and floats). Please use /metrics endpoints for context on metric dataType to avoid null data.*&lt;/p&gt; &lt;p&gt;***metrics limit** &#x3D;  1600 per request*&lt;/p&gt; *&lt;p&gt;Make note, GET Method URL request lines are also limited to a total length of 8192 bytes (8KB). In cases where the service allows for thousands of metrics, which may lead to exceeding this request line limit of 8KB, its advised for any requests with large request lines to be requested through the respective \&quot;POST\&quot; method.&lt;/p&gt;*  |
 **periodicity** | **str**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **LTM**  &#x3D; Last Twelve Months,   * **LTMSG** &#x3D; Last Twelve Months Global [OA17959](https://my.apps.factset.com/oa/pages/17959),   * **YTD** &#x3D; Year-to-date.  | [optional] if omitted the server will use the default value of "QTR"
 **fiscal_period_start** | **str**| Fiscal period start expressed as YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional]
 **fiscal_period_end** | **str**| Fiscal period end expressed YYYY-MM-DD.  Calendar date that will fall back to most recent completed period during resolution.  | [optional]
 **currency** | **str**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] if omitted the server will use the default value of "LOCAL"
 **restated** | **str**| Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data  | [optional] if omitted the server will use the default value of "RP"

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fundamental data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fds_fundamentals_for_list**
> FundamentalsResponse get_fds_fundamentals_for_list(fundamentals_request)

Returns the Company Fundamental Data.

Retrieves FactSet Fundamental standardized data for an individual security. Use the /metrics endpoint to retrieve a full list of valid metrics or data items.   

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import fact_set_fundamentals_api
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
    api_instance = fact_set_fundamentals_api.FactSetFundamentalsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    fundamentals_request = FundamentalsRequest(
        ids=Ids(["FDS-US"]),
        periodicity=Periodicity("QTR"),
        fiscal_period_start="2017-09-01",
        fiscal_period_end="2018-03-01",
        metrics=Metrics(["FF_SALES"]),
        currency="USD",
        restated=Restated("RP"),
    ) # FundamentalsRequest | Request object for requesting fundamentals data

    try:
        # Returns the Company Fundamental Data.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fds_fundamentals_for_list(fundamentals_request)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling FactSetFundamentalsApi->get_fds_fundamentals_for_list: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fundamentals_request** | [**FundamentalsRequest**](FundamentalsRequest.md)| Request object for requesting fundamentals data |

### Return type

[**FundamentalsResponse**](FundamentalsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Fundamental data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

