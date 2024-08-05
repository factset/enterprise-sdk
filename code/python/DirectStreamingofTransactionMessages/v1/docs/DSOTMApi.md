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

> [!IMPORTANT]
> The parameter variables defined below are just examples and may potentially contain non valid values. Please replace them with valid values.

#### Example Code

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
#
# The confidential client instance should be reused in production environments.
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

    # NOTE: The following variables are just an example and may contain invalid values. Please, replace these with valid values.
    transactions = Transactions(
        executions=[
            ExecutionParameters(
                transaction_status="transaction_status_example",
                parent_id="parent_id_example",
                net=3.14,
                settlement_date="settlement_date_example",
                settlement_currency_iso="settlement_currency_iso_example",
                settlement_value=3.14,
                foreign_exchange_rate=3.14,
                broker="broker_example",
                custodian="custodian_example",
                accrued_interest=3.14,
                commission=3.14,
                clearing_commission=3.14,
                local_tax=3.14,
                local_fee=3.14,
                broker_fee=3.14,
                exchange_fee=3.14,
                miscellaneous_fee=3.14,
                transaction_id="transaction_id_example",
                order_id="order_id_example",
                portfolio="portfolio_example",
                symbol="symbol_example",
                description="description_example",
                trade_type="trade_type_example",
                unit_type="unit_type_example",
                transaction_leaves=3.14,
                quantity=3.14,
                gross=3.14,
                price=3.14,
                currency_iso="currency_iso_example",
                trade_date="trade_date_example",
                added_date_time="added_date_time_example",
                updated_date_time="updated_date_time_example",
            ),
        ],
        placements=[
            PlacementParameters(
                transaction_status="transaction_status_example",
                parent_id="parent_id_example",
                instruction_type="instruction_type_example",
                instruction_value=3.14,
                tif="tif_example",
                tif_date="tif_date_example",
                transaction_id="transaction_id_example",
                order_id="order_id_example",
                portfolio="portfolio_example",
                symbol="symbol_example",
                description="description_example",
                trade_type="trade_type_example",
                unit_type="unit_type_example",
                transaction_leaves=3.14,
                quantity=3.14,
                gross=3.14,
                price=3.14,
                currency_iso="currency_iso_example",
                trade_date="trade_date_example",
                added_date_time="added_date_time_example",
                updated_date_time="updated_date_time_example",
            ),
        ],
        orders=[
            OrderParameters(
                transaction_status="transaction_status_example",
                instruction_type="instruction_type_example",
                instruction_value=3.14,
                tif="tif_example",
                tif_date="tif_date_example",
                fund_team="fund_team_example",
                trading_team="trading_team_example",
                trader="trader_example",
                transaction_id="transaction_id_example",
                order_id="order_id_example",
                portfolio="portfolio_example",
                symbol="symbol_example",
                description="description_example",
                trade_type="trade_type_example",
                unit_type="unit_type_example",
                transaction_leaves=3.14,
                quantity=3.14,
                gross=3.14,
                price=3.14,
                currency_iso="currency_iso_example",
                trade_date="trade_date_example",
                added_date_time="added_date_time_example",
                updated_date_time="updated_date_time_example",
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

