# fds.sdk.FactSetOwnership.TransactionsApi

All URIs are relative to *https://api.factset.com/content*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_ownership_insider_transactions**](TransactionsApi.md#get_ownership_insider_transactions) | **GET** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**get_ownership_institutional_transactions**](TransactionsApi.md#get_ownership_institutional_transactions) | **GET** /factset-ownership/v1/transactions/institutional | Get institutional transaction details for a list of requested identifiers.
[**post_ownership_insider_transactions**](TransactionsApi.md#post_ownership_insider_transactions) | **POST** /factset-ownership/v1/transactions/insider | Get insider transactions details for a list of requested identifiers.
[**post_ownership_instituional_transactions**](TransactionsApi.md#post_ownership_instituional_transactions) | **POST** /factset-ownership/v1/transactions/institutional | Gets institutional transaction details for a list of requested identifiers.



# **get_ownership_insider_transactions**
> InsiderTransactionsResponse get_ownership_insider_transactions(ids, start_date, end_date)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import transactions_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["TSLA-US"] # [str] | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
    start_date = dateutil_parser('2020-06-30').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
    end_date = dateutil_parser('2021-06-30').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
    transaction_type = "A" # str | Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** = All Transaction Types - returns all available transaction types.   * **P** = Open Market Purchases - shares on the open market.   * **S** =  Open Market Sales - selling shares on the open market.   * **PS** = Open Market Purchases & Sales - buying and selling shares on the open market.   * **O** = Options Exercised - executing stock options to acquire shares.   * **M** = Other Transactions - any other types of equity-related actions not covered above.  (optional) if omitted the server will use the default value of "A"
    row_exclusion = "DB" # str | Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** =  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** = Blank Transaction Types - excludes only blank transaction types.   * **N** =   None - includes all transaction types without exclusion.  (optional) if omitted the server will use the default value of "DB"
    currency = "USD" # str | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) if omitted the server will use the default value of "LOCAL"

    try:
        # Get insider transactions details for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ownership_insider_transactions(ids, start_date, end_date, transaction_type=transaction_type, row_exclusion=row_exclusion, currency=currency)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling TransactionsApi->get_ownership_insider_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. |
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **transaction_type** | **str**| Controls the Transaction Type of the data returned. By default, the service will return All Transaction Types.   * **A** &#x3D; All Transaction Types - returns all available transaction types.   * **P** &#x3D; Open Market Purchases - shares on the open market.   * **S** &#x3D;  Open Market Sales - selling shares on the open market.   * **PS** &#x3D; Open Market Purchases &amp; Sales - buying and selling shares on the open market.   * **O** &#x3D; Options Exercised - executing stock options to acquire shares.   * **M** &#x3D; Other Transactions - any other types of equity-related actions not covered above.  | [optional] if omitted the server will use the default value of "A"
 **row_exclusion** | **str**| Controls the exlcusion of specific transaction rows from the data returned. By default, the service will exclude Derivative and Blank Transaction Types.   * **DB** &#x3D;  Derivative and Blank Transaction Types - excludes both derivative and blank transaction types.   * **B** &#x3D; Blank Transaction Types - excludes only blank transaction types.   * **N** &#x3D;   None - includes all transaction types without exclusion.  | [optional] if omitted the server will use the default value of "DB"
 **currency** | **str**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] if omitted the server will use the default value of "LOCAL"

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Insider Transactions Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_ownership_institutional_transactions**
> InstitutionalTransactionsResponse get_ownership_institutional_transactions(ids, start_date, end_date)

Get institutional transaction details for a list of requested identifiers.

Get institutional transaction details for a list of requested identifiers. 

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import transactions_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    ids = ["TSLA-US"] # [str] | Requested list of security identifiers. <p>***ids limit** =  10 per request*</p  >.
    start_date = dateutil_parser('2020-06-30').date() # date | The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
    end_date = dateutil_parser('2021-06-30').date() # date | The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint. 
    currency = "USD" # str | Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). (optional) if omitted the server will use the default value of "LOCAL"
    frequency = "M" # str | Controls the display frequency of the data returned.   * **M** = Monthly, based on the last trading day of the month.   * **MTD** = Month-to-date   * **CQ** = Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** =  Calendar quarter-to-date   * **CY** = Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** = Calendar Year-to-date.  (optional) if omitted the server will use the default value of "M"
    top_n_holders = "25" # str | Specifies the number of top holders whose data is returned.   * **ALL** = All holders   * **5** = Top 5 Institutional Holders   * **10** = Top 10 Institutional Holders   * **25** = Top 25 Institutional Holders   * **50** = Top 50 Institutional Holders   * **100** = Top 100 Institutional Holders  (optional) if omitted the server will use the default value of "25"
    holder_type = "F" # str | Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** = Institutions   * **M** = Mutual Funds   * **S** =  Insiders/Stakeholders   * **FS** = Institutions/Insiders   * **B** = Beneficial Owners  (optional) if omitted the server will use the default value of "F"

    try:
        # Get institutional transaction details for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        # and optional values
        api_response = api_instance.get_ownership_institutional_transactions(ids, start_date, end_date, currency=currency, frequency=frequency, top_n_holders=top_n_holders, holder_type=holder_type)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling TransactionsApi->get_ownership_institutional_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ids** | **[str]**| Requested list of security identifiers. &lt;p&gt;***ids limit** &#x3D;  10 per request*&lt;/p  &gt;. |
 **start_date** | **date**| The start date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **end_date** | **date**| The end date requested for a given date range in **YYYY-MM-DD** format. Future dates (T+1) are not accepted in this endpoint.  |
 **currency** | **str**| Currency code for adjusting prices. Default is Local. For a list of currency ISO codes, visit [Online Assistant Page 1470](https://oa.apps.factset.com/pages/1470). | [optional] if omitted the server will use the default value of "LOCAL"
 **frequency** | **str**| Controls the display frequency of the data returned.   * **M** &#x3D; Monthly, based on the last trading day of the month.   * **MTD** &#x3D; Month-to-date   * **CQ** &#x3D; Quarterly based on the last trading day of the calendar quarter (March, June, September, or December).   * **CQTD** &#x3D;  Calendar quarter-to-date   * **CY** &#x3D; Calendar Annual, based on the last trading day of the calendar year.   * **CYTD** &#x3D; Calendar Year-to-date.  | [optional] if omitted the server will use the default value of "M"
 **top_n_holders** | **str**| Specifies the number of top holders whose data is returned.   * **ALL** &#x3D; All holders   * **5** &#x3D; Top 5 Institutional Holders   * **10** &#x3D; Top 10 Institutional Holders   * **25** &#x3D; Top 25 Institutional Holders   * **50** &#x3D; Top 50 Institutional Holders   * **100** &#x3D; Top 100 Institutional Holders  | [optional] if omitted the server will use the default value of "25"
 **holder_type** | **str**| Controls the Holder Type of the data returned. By default, the service will return Institutional Holders. Requesting All Holders is not currently supported. Only a single Holder Type is allowed per request.   * **F** &#x3D; Institutions   * **M** &#x3D; Mutual Funds   * **S** &#x3D;  Insiders/Stakeholders   * **FS** &#x3D; Institutions/Insiders   * **B** &#x3D; Beneficial Owners  | [optional] if omitted the server will use the default value of "F"

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Institutional Transactions Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_ownership_insider_transactions**
> InsiderTransactionsResponse post_ownership_insider_transactions(insider_transactions_request)

Get insider transactions details for a list of requested identifiers.

Gets insider transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import transactions_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    insider_transactions_request = InsiderTransactionsRequest(
        ids=IdTransactions(["FDS-US"]),
        start_date=dateutil_parser('Tue Jun 30 00:00:00 UTC 2020').date(),
        end_date=dateutil_parser('Wed Jun 30 00:00:00 UTC 2021').date(),
        transaction_type=TransactionType("A"),
        row_exclusion=RowExclusion("DB"),
        currency="USD",
    ) # InsiderTransactionsRequest | Requesting Insider Transaction Details

    try:
        # Get insider transactions details for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_ownership_insider_transactions(insider_transactions_request)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling TransactionsApi->post_ownership_insider_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **insider_transactions_request** | [**InsiderTransactionsRequest**](InsiderTransactionsRequest.md)| Requesting Insider Transaction Details |

### Return type

[**InsiderTransactionsResponse**](InsiderTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Insider Transactions Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **post_ownership_instituional_transactions**
> InstitutionalTransactionsResponse post_ownership_instituional_transactions(institutional_transactions_request)

Gets institutional transaction details for a list of requested identifiers.

Gets institutional transaction details for a list of requested identifiers.

### Example

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.FactSetOwnership
from fds.sdk.FactSetOwnership.api import transactions_api
from fds.sdk.FactSetOwnership.models import *
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
configuration = fds.sdk.FactSetOwnership.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.FactSetOwnership.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.FactSetOwnership.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = transactions_api.TransactionsApi(api_client)

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    institutional_transactions_request = InstitutionalTransactionsRequest(
        ids=IdTransactions(["FDS-US"]),
        start_date=dateutil_parser('Tue Jun 30 00:00:00 UTC 2020').date(),
        end_date=dateutil_parser('Wed Jun 30 00:00:00 UTC 2021').date(),
        top_n_holders=TopNHolders("25"),
        holder_type=HolderType("F"),
        currency="USD",
        frequency=Frequency("M"),
    ) # InstitutionalTransactionsRequest | Requesting Institutional Transaction Details

    try:
        # Gets institutional transaction details for a list of requested identifiers.
        # example passing only required values which don't have defaults set
        api_response = api_instance.post_ownership_instituional_transactions(institutional_transactions_request)

        pprint(api_response)

    except fds.sdk.FactSetOwnership.ApiException as e:
        print("Exception when calling TransactionsApi->post_ownership_instituional_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **institutional_transactions_request** | [**InstitutionalTransactionsRequest**](InstitutionalTransactionsRequest.md)| Requesting Institutional Transaction Details |

### Return type

[**InstitutionalTransactionsResponse**](InstitutionalTransactionsResponse.md)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**200** | Institutional Transactions Response. |  -  |
**400** | Bad Request. This can occur for several reasons. Please review the \&quot;message\&quot; for more details. |  -  |
**401** | Unauthenticated USERNAME-SERIAL. Ensure you are logged in and have successfully generated an API KEY for the IP range you are connecting from. For more help, select the **Report Issue** in the top right corner of this Developer Portal specification card and choose Connectivity 401 or 403 Responses. |  -  |
**403** | The USERNAME-SERIAL attempted to request the endpoint is not authorized to access. The request was a legal request, but the server is refusing to respond. Please reach out to FactSet Account Team for assistance with authorization. |  -  |
**415** | Unsupported Media Type. This error may be returned when the caller sends a resource in a format that is not accepted by the server. This can be fixed by ensuring that Content-Type header is set to the correct value. In this instance, \&quot;application/json\&quot; would be the appropriate value. |  -  |
**500** | Internal Server Error. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

