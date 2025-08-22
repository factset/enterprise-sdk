# fds.sdk.SecurityIntelligence.CompanySummaryApi

All URIs are relative to *https://api.factset.com/security-intelligence/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_company_debt_summary**](CompanySummaryApi.md#get_company_debt_summary) | **GET** /company/debt | Get Company Debt Summary
[**get_company_events**](CompanySummaryApi.md#get_company_events) | **GET** /company/events | Get Company Events
[**get_company_financial_highlights**](CompanySummaryApi.md#get_company_financial_highlights) | **GET** /company/financials | Get Company Financial Highlights
[**get_company_mna_summary**](CompanySummaryApi.md#get_company_mna_summary) | **GET** /company/mna | Get Company M&amp;A Summary
[**get_company_ownership_insights**](CompanySummaryApi.md#get_company_ownership_insights) | **GET** /company/ownership | Get Company Ownership Insights



# **get_company_debt_summary**
> DebtSummaryResponse get_company_debt_summary(identifier)

Get Company Debt Summary

Presents the company's Debt Capital Structure maturity data, analysis of Total Debt, and information on debt obligations due in the near term.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import company_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_summary_api.CompanySummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company

    try:
        # Get Company Debt Summary
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_debt_summary(identifier)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling CompanySummaryApi->get_company_debt_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |

### Return type

[**DebtSummaryResponse**](DebtSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with company data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_company_events**
> EventsSummaryResponse get_company_events(identifier)

Get Company Events

Returns a summary of company events including Dividends, Earnings Releases and Stock Splits spanning 7 days in the past and 60 days into the future.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import company_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_summary_api.CompanySummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company

    try:
        # Get Company Events
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_events(identifier)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling CompanySummaryApi->get_company_events: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |

### Return type

[**EventsSummaryResponse**](EventsSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with company data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_company_financial_highlights**
> FinancialHighlightsResponse get_company_financial_highlights(identifier)

Get Company Financial Highlights

Provides comprehensive financial data including Income Statement, Cash Flow Statement, and Balance Sheet for the past 1.5 years.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import company_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_summary_api.CompanySummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company

    try:
        # Get Company Financial Highlights
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_financial_highlights(identifier)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling CompanySummaryApi->get_company_financial_highlights: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |

### Return type

[**FinancialHighlightsResponse**](FinancialHighlightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with company data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_company_mna_summary**
> MnaSummaryResponse get_company_mna_summary(identifier)

Get Company M&A Summary

Reports on Mergers and Acquisitions activity related to the company within the last 3 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import company_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_summary_api.CompanySummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company

    try:
        # Get Company M&A Summary
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_mna_summary(identifier)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling CompanySummaryApi->get_company_mna_summary: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |

### Return type

[**MnaSummaryResponse**](MnaSummaryResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with company data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_company_ownership_insights**
> OwnershipInsightsResponse get_company_ownership_insights(identifier)

Get Company Ownership Insights

Provides information on any activists targeting the company, and highlights the largest ownership position changes over the last 6 months.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.SecurityIntelligence
from fds.sdk.SecurityIntelligence.api import company_summary_api
from fds.sdk.SecurityIntelligence.models import *
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
configuration = fds.sdk.SecurityIntelligence.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.SecurityIntelligence.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.SecurityIntelligence.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = company_summary_api.CompanySummaryApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    identifier = "identifier_example" # str | Ticker or FactSet Entity ID of the company

    try:
        # Get Company Ownership Insights
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_company_ownership_insights(identifier)

        pprint(api_response)

    except fds.sdk.SecurityIntelligence.ApiException as e:
        print("Exception when calling CompanySummaryApi->get_company_ownership_insights: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **identifier** | **str**| Ticker or FactSet Entity ID of the company |

### Return type

[**OwnershipInsightsResponse**](OwnershipInsightsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Successful response with company data |  -  |
**400** | Bad request |  -  |
**401** | Authentication Failed |  -  |
**500** | Internal Server Error |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

