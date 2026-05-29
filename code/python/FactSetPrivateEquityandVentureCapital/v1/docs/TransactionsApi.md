# fds.sdk.FactSetPrivateEquityandVentureCapital.TransactionsApi

All URIs are relative to *https://api.factset.com/content/factset-pevc/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_transaction**](TransactionsApi.md#get_transaction) | **GET** /transactions | Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
[**get_transaction_ma_activity**](TransactionsApi.md#get_transaction_ma_activity) | **GET** /transactions/ma-activity | Retrieve detailed M&amp;A advisory and investment information for specified transactions.
[**search_transactions**](TransactionsApi.md#search_transactions) | **POST** /transactions/search | Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.



# **get_transaction**
> TransactionDetailsResponse get_transaction(ids)

Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.

Retrieves rich, fundamental data for one or more private investment transactions, such as a **Venture Capital funding round** or a **Private Equity buyout**. This includes the **deal size** (transaction amount), **transaction date**, participating **investors**, **security type** (e.g., common stock, preferred stock), and the round's **stage**.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import transactions_api
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
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = [1000001,1000002] # [int] | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.

    try:
        # Retrieve comprehensive details for a list of Private Equity or Venture Capital transactions.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_transaction(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling TransactionsApi->get_transaction: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[int]**| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. |

### Return type

[**TransactionDetailsResponse**](TransactionDetailsResponse.md)

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

# **get_transaction_ma_activity**
> TransactionMaActivityResponse get_transaction_ma_activity(ids)

Retrieve detailed M&A advisory and investment information for specified transactions.

Provides specific details related to Mergers & Acquisitions (M&A) activity for a given transaction. This includes information on M&A **advisors** (e.g., financial, legal) and the specific **investments** made by General Partner and Limited Partner investors in the context of the M&A deal.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import transactions_api
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
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = [1000001,1000002] # [int] | A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID.

    try:
        # Retrieve detailed M&A advisory and investment information for specified transactions.
        # example passing only required values which don't have defaults set
        api_response = api_instance.get_transaction_ma_activity(ids)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling TransactionsApi->get_transaction_ma_activity: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[int]**| A list of unique FactSet-generated identifiers for **Private Equity or Venture Capital transactions**. These IDs link to a single investment event, distinct from the main deal ID. |

### Return type

[**TransactionMaActivityResponse**](TransactionMaActivityResponse.md)

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

# **search_transactions**
> TransactionSearchResponse search_transactions(transaction_search_request)

Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.

Allows users to query the universe of private transactions using a set of powerful filters. Filters can include specific **portfolio companies**, **investment stages** (e.g., Seed, Growth, Late), **transaction date range**, and **minimum/maximum transaction amounts** in USD.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetPrivateEquityandVentureCapital
from fds.sdk.FactSetPrivateEquityandVentureCapital.api import transactions_api
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
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    transaction_search_request = TransactionSearchRequest(
        data=TransactionSearchRequestData(
            ids=[
                "ids_example",
            ],
            status="Pending",
            stage="Seed",
            investment_type="Venture Capital",
            start_date=dateutil_parser('1970-01-01').date(),
            end_date=dateutil_parser('1970-01-01').date(),
            min_amount=3.14,
            max_amount=3.14,
        ),
    ) # TransactionSearchRequest | 

    try:
        # Search and filter the universe of transactions by deal size, date range, stage, and portfolio company.
        # example passing only required values which don't have defaults set
        api_response = api_instance.search_transactions(transaction_search_request)

        pprint(api_response)

    except fds.sdk.FactSetPrivateEquityandVentureCapital.ApiException as e:
        print("Exception when calling TransactionsApi->search_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transaction_search_request** | [**TransactionSearchRequest**](TransactionSearchRequest.md)|  |

### Return type

[**TransactionSearchResponse**](TransactionSearchResponse.md)

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

