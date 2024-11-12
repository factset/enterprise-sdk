# fds.sdk.FactSetFundamentals.CompanyReportsApi

All URIs are relative to *https://api.factset.com/content/factset-fundamentals/v2*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fds_profiles**](CompanyReportsApi.md#get_fds_profiles) | **GET** /company-reports/profile | Returns company profile information for a specified list of identifiers.
[**get_financials**](CompanyReportsApi.md#get_financials) | **GET** /company-reports/financial-statement | Returns company financial data.
[**get_fundamentals**](CompanyReportsApi.md#get_fundamentals) | **GET** /company-reports/fundamentals | Returns company fundamentals for a given list of identifiers.



# **get_fds_profiles**
> ProfileResponse get_fds_profiles(ids)

Returns company profile information for a specified list of identifiers.

Retrieves a comprehensive overview of key profile details and information of specified list of identifiers. The response includes the company name, address, industry, sector, number of employees, CEO, business summary, exchange, market capitalization, shares outstanding, P/E ratio, year founded, and other details. All values provided in the response are absolute. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import company_reports_api
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
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 

    try:
        # Returns company profile information for a specified list of identifiers.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fds_profiles(ids)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_fds_profiles: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |

### Return type

[**ProfileResponse**](ProfileResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Profile data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_financials**
> FinancialResponse get_financials(statement_type, id, periodicity)

Returns company financial data.

Returns company financial data (preliminary or final) for specified security and statement type (income statement, balance sheet, cash flow), for various fiscal reporting periods. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import company_reports_api
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
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    statement_type = "BS" # str | The type of financial statement being requested.
    id = "IBM-US" # str | The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id.
    periodicity = "ANN" # str | Periodicity or frequency of the fiscal periods, where   * **ANN**  = Annual - Original,   * **ANN_R** = Annual - Latest - *Includes Restatements*,   * **QTR**  = Quarterly - Original,   * **QTR_R** = Quarterly - Latest - *Includes Restatements*,   * **SEMI** = Semi-Annual,   * **SEMI_R** = Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  = Last Twelve Months,   * **YTD** = Year-to-date.   <br>  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.<br> 
    currency = "USD" # str | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (optional) if omitted the server will use the default value of "LOCAL"
    update_type = "RP" # str | Update Status Flag:   * **RP** = Include preliminary data,   * **RF** = Only final data  (optional) if omitted the server will use the default value of "RP"
    limit = 4 # int | The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. (optional) if omitted the server will use the default value of 4

    try:
        # Returns company financial data.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_financials(statement_type, id, periodicity, currency=currency, update_type=update_type, limit=limit)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_financials: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **statement_type** | **str**| The type of financial statement being requested. |
 **id** | **str**| The requested security identifier. Accepted ID types include Market Ticker, SEDOL, ISIN, CUSIP, or FactSet Permanent Id. |
 **periodicity** | **str**| Periodicity or frequency of the fiscal periods, where   * **ANN**  &#x3D; Annual - Original,   * **ANN_R** &#x3D; Annual - Latest - *Includes Restatements*,   * **QTR**  &#x3D; Quarterly - Original,   * **QTR_R** &#x3D; Quarterly - Latest - *Includes Restatements*,   * **SEMI** &#x3D; Semi-Annual,   * **SEMI_R** &#x3D; Semi-Annual - Latest - *Includes Restatements*,   * **LTM**  &#x3D; Last Twelve Months,   * **YTD** &#x3D; Year-to-date.   &lt;br&gt;  Please note that the coverage for SEMI_R may be limited as fewer companies report with this periodicity.&lt;br&gt;  |
 **currency** | **str**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] if omitted the server will use the default value of "LOCAL"
 **update_type** | **str**| Update Status Flag:   * **RP** &#x3D; Include preliminary data,   * **RF** &#x3D; Only final data  | [optional] if omitted the server will use the default value of "RP"
 **limit** | **int**| The time period for the returned data. Within range of 1 to 100. If not specified default will be 4. | [optional] if omitted the server will use the default value of 4

### Return type

[**FinancialResponse**](FinancialResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Financial data items |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fundamentals**
> CompanyFundamentalsResponse get_fundamentals(ids)

Returns company fundamentals for a given list of identifiers.

Returns detailed insights on specified publicly traded company's various key financial measures or fundamentals like cash per share, dividend, EPS, EBIT etc. All values provided in the response are absolute.<br> **Note:** Due to variations in calculation time of average exchange rates, there may be some minor differences in the values of company report financial statement attributes if you are requesting for a currency other than local, when compared to the workstation. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetFundamentals
from fds.sdk.FactSetFundamentals.api import company_reports_api
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
    api_instance = company_reports_api.CompanyReportsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["AAPL-US"] # [str] | The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. <p>***ids limit** =  50 per request*</p> 
    currency = "USD" # str | Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \"DOC\" would give the values in reporting currency for the requested ids.  (optional) if omitted the server will use the default value of "LOCAL"

    try:
        # Returns company fundamentals for a given list of identifiers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_fundamentals(ids, currency=currency)

        pprint(api_response)

    except fds.sdk.FactSetFundamentals.ApiException as e:
        print("Exception when calling CompanyReportsApi->get_fundamentals: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| The requested list of security identifiers. Accepted ID types include Market Tickers, SEDOL, ISINs, CUSIPs, or FactSet Permanent Ids. &lt;p&gt;***ids limit** &#x3D;  50 per request*&lt;/p&gt;  |
 **currency** | **str**| Currency code for currency values. For a list of currency ISO codes, visit Online Assistant Page [OA1470](https://my.apps.factset.com/oa/pages/1470).  Giving input as \&quot;DOC\&quot; would give the values in reporting currency for the requested ids.  | [optional] if omitted the server will use the default value of "LOCAL"

### Return type

[**CompanyFundamentalsResponse**](CompanyFundamentalsResponse.md)

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
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

