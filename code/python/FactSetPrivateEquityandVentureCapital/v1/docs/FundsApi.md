# fds.sdk.FactSetPrivateEquityandVentureCapital.FundsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fund**](FundsApi.md#get_fund) | **GET** /funds | Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
[**get_fund_cashflows**](FundsApi.md#get_fund_cashflows) | **POST** /funds/cashflows | Retrieve time-series cash flow data (contributions and distributions) for specified funds.
[**get_fund_fundraising**](FundsApi.md#get_fund_fundraising) | **GET** /funds/fundraising | Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
[**get_fund_portfolio_companies**](FundsApi.md#get_fund_portfolio_companies) | **GET** /funds/portfolio-companies | Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.



# **get_fund**
> FundDetailsResponse get_fund(ids)

Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.

Retrieves the main descriptive and profile information for one or more Private Equity or Venture Capital funds identified by their FactSet entity IDs. This includes key characteristics like fund status (e.g., Open, Closed), fund type (e.g., Venture, Buyout), vintage year, and high-level strategy details.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import funds_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = funds_api.FundsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["001JYM-E","005GEM-E"] # [str] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

    try:
        # Retrieve core profile and summary data for specified Private Equity or Venture Capital Funds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fund(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling FundsApi->get_fund: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**FundDetailsResponse**](FundDetailsResponse.md)

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
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_cashflows**
> FundCashflowsResponse get_fund_cashflows(fund_cashflows_request)

Retrieve time-series cash flow data (contributions and distributions) for specified funds.

Provides **quarterly** cash flow data for one or more funds, including **contributions** (capital calls) and **distributions** (payouts). This raw data is fundamental for calculating net cash flows and performance metrics like DPI, TVPI, and IRR.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import funds_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = funds_api.FundsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    fund_cashflows_request = FundCashflowsRequest(
        data=FundCashflowsRequestData(
            ids=[
                "ids_example",
            ],
            start_date=dateutil_parser('1970-01-01').date(),
            end_date=dateutil_parser('1970-01-01').date(),
            cf_type="CONTRIBUTION",
        ),
    ) # FundCashflowsRequest | 

    try:
        # Retrieve time-series cash flow data (contributions and distributions) for specified funds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fund_cashflows(fund_cashflows_request)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling FundsApi->get_fund_cashflows: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **fund_cashflows_request** | [**FundCashflowsRequest**](FundCashflowsRequest.md)|  |

### Return type

[**FundCashflowsResponse**](FundCashflowsResponse.md)

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
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_fundraising**
> FundFundraisingResponse get_fund_fundraising(ids)

Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.

Provides detailed information on the **fundraising lifecycle** of one or more funds, including data on interim and **final closes**, the **total amount raised** (fund size), and the as-reported currency for each fundraising round.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import funds_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = funds_api.FundsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0LC436-E"] # [str] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

    try:
        # Retrieve the complete fundraising history for specified Private Equity or Venture Capital Funds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fund_fundraising(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling FundsApi->get_fund_fundraising: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**FundFundraisingResponse**](FundFundraisingResponse.md)

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
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_fund_portfolio_companies**
> FundPortfolioCompaniesResponse get_fund_portfolio_companies(ids)

Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.

Provides a list of **FactSet entity identifiers** for the portfolio companies in which a specified fund has invested. This endpoint is key for analyzing a fund's holdings and exposure to different companies in the private market.  Use the `/universe` endpoint, set the `entityType` parameter to `VEN` (Venture Capital Fund), `PVF` (Private Equity Fund/Alt Investment), or `FAF` (Family of Funds (Venture Capital/Private Equity)). Submit the fund's name. The returned `entityId` is the required input value for this endpoint.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import funds_api
from fds.sdk.FactSetPrivateEquityandVentureCapital.models import *
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
configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetPrivateEquityandVentureCapital.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetPrivateEquityandVentureCapital.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = funds_api.FundsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["0H7PQB-E","0JGJY6-E"] # [str] | A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format 'XXXXXX-E' and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint

    try:
        # Retrieve the list of portfolio companies held by specified Private Equity or Venture Capital Funds.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_fund_portfolio_companies(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling FundsApi->get_fund_portfolio_companies: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| A list of FactSet Permanent Entity Identifiers (FactSet IDs) for **Private Equity and Venture Capital Funds**. These IDs are in the format &#39;XXXXXX-E&#39; and are the primary input for most fund-related endpoints. These IDs can be retrieved from the /universe endpoint |

### Return type

[**FundPortfolioCompaniesResponse**](FundPortfolioCompaniesResponse.md)

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
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was legal, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that the Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

