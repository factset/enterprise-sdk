# fds.sdk.DirectStreamingofTransactionMessages.DSOTMApi

All URIs are relative to *https://api.factset.com/analytics/dsotm/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**send_transactions**](DSOTMApi.md#send_transactions) | **POST** /transactions | Push transactions data into FactSet.



# **send_transactions**
> send_transactions()

Push transactions data into FactSet.

This endpoint takes the transactions data and pushes them into FactSet.

### Example

* Basic Authentication (FactSetApiKey):
* OAuth Authentication (FactSetOAuth2):

```python
from fds.sdk.utils.authentication import ConfidentialClient
import fds.sdk.DirectStreamingofTransactionMessages
from fds.sdk.DirectStreamingofTransactionMessages.api import dsotm_api
from fds.sdk.DirectStreamingofTransactionMessages.models import *
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
configuration = fds.sdk.DirectStreamingofTransactionMessages.Configuration(
    fds_oauth_client=ConfidentialClient('/path/to/app-config.json')
)

# Basic authentication: FactSetApiKey
# See https://github.com/FactSet/enterprise-sdk#api-key
# for information how to create an API key
# configuration = fds.sdk.DirectStreamingofTransactionMessages.Configuration(
#     username='USERNAME-SERIAL',
#     password='API-KEY'
# )

# Enter a context with an instance of the API client
with fds.sdk.DirectStreamingofTransactionMessages.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = dsotm_api.DSOTMApi(api_client)

    # NOTE: The parameter variable defined below is just an example and may potentially contain non valid values. So please replace this with valid values.
    transactions = Transactions(
        executions=[
            ExecutionParameters(
                parentid="parentid_example",
                net=3.14,
                gross=3.14,
                settlementvalue=3.14,
                settlementdate="settlementdate_example",
                settlementcurrencyiso="settlementcurrencyiso_example",
                orderid="orderid_example",
                portfolio="portfolio_example",
                transactionid="transactionid_example",
                symbol="symbol_example",
                description="description_example",
                tradetype="tradetype_example",
                status="status_example",
                tradedate="tradedate_example",
                transactionleaves=3.14,
                amount=3.14,
                currencyiso="currencyiso_example",
                foreignexchangerate=3.14,
            ),
        ],
        placements=[
            PlacementParameters(
                settlementcurrencyiso="settlementcurrencyiso_example",
                parentid="parentid_example",
                orderid="orderid_example",
                portfolio="portfolio_example",
                transactionid="transactionid_example",
                symbol="symbol_example",
                description="description_example",
                tradetype="tradetype_example",
                status="status_example",
                tradedate="tradedate_example",
                transactionleaves=3.14,
                amount=3.14,
                currencyiso="currencyiso_example",
                foreignexchangerate=3.14,
            ),
        ],
        orders=[
            OrderParameters(
                orderid="orderid_example",
                portfolio="portfolio_example",
                transactionid="transactionid_example",
                symbol="symbol_example",
                description="description_example",
                tradetype="tradetype_example",
                status="status_example",
                tradedate="tradedate_example",
                transactionleaves=3.14,
                amount=3.14,
                currencyiso="currencyiso_example",
                foreignexchangerate=3.14,
            ),
        ],
    ) # Transactions |  (optional)

    try:
        # Push transactions data into FactSet.
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.send_transactions(transactions=transactions)


    except fds.sdk.DirectStreamingofTransactionMessages.ApiException as e:
        print("Exception when calling DSOTMApi->send_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **transactions** | [**Transactions**](Transactions.md)|  | [optional]

### Return type

void (empty response body)

### Authorization

[FactSetApiKey](../README.md#FactSetApiKey), [FactSetOAuth2](../README.md#FactSetOAuth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json


### HTTP response details

| Status code | Description | Response headers |
|-------------|-------------|------------------|
**202** | Expected response. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**400** | Invalid POST body. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the retry-after header. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**500** | Server error. Log the X-DataDirectRequest-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. Retry the request in sometime. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

