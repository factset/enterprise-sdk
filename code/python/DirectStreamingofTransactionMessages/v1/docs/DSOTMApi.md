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
    dsotm_parameters_root = DsotmParametersRoot(
        data=DsotmParameters(
            orders=[
                Order(
                    order_date="2024-01-25",
                    transaction_id="O_FDS_012424_113",
                    order_id="O123",
                    transaction_status="pendingApproval",
                    order_type="market",
                    limit_price=420.25,
                    stop_price=421.25,
                    tif="goodTilCancel",
                    tif_date="2024-02-21",
                    settlement_type="regular",
                    settlement_date="2024-03-11",
                    fund_team="T1",
                    trading_team="T2",
                    trader="msmith",
                    account="Client:/folder1/testing.acct",
                    symbol="FDS-USA",
                    instrument_name="FactSet Research Systems",
                    side="buy",
                    unit_type="quantity",
                    transaction_leaves=0.01,
                    quantity=1000.01,
                    gross=0.01,
                    price=420.25,
                    currency="USD",
                    compliance_status="unchecked",
                    added_date_time="2024-01-25T09:30:23.235",
                    updated_date_time="2024-01-25T09:30:23.235",
                    additional_fields=[
                        AdditionalField(
                            name="description",
                            type="string",
                            value="Transaction Data For FDS-USA",
                        ),
                    ],
                ),
            ],
            placements=[
                Placement(
                    placement_date="2024-01-25",
                    transaction_id="P123",
                    parent_id="O_FDS_012424_113",
                    order_id="O123",
                    transaction_status="placed",
                    order_type="market",
                    limit_price=420.25,
                    stop_price=421.25,
                    tif="goodTilCancel",
                    tif_date="2024-02-21",
                    settlement_type="regular",
                    settlement_date="2024-03-11",
                    account="Client:/folder1/testing.acct",
                    symbol="FDS-USA",
                    instrument_name="FactSet Research Systems",
                    side="buy",
                    unit_type="quantity",
                    transaction_leaves=0.01,
                    quantity=1000.01,
                    gross=0.01,
                    price=420.25,
                    currency="USD",
                    compliance_status="unchecked",
                    added_date_time="2024-01-25T09:30:23.235",
                    updated_date_time="2024-01-25T09:30:23.235",
                    additional_fields=[
                        AdditionalField(
                            name="description",
                            type="string",
                            value="Transaction Data For FDS-USA",
                        ),
                    ],
                ),
            ],
            executions=[
                Execution(
                    trade_date="2024-01-25",
                    transaction_id="E456",
                    parent_id="P123",
                    order_id="O123",
                    transaction_status="executed",
                    net=0.01,
                    settlement_date="2024-03-11",
                    settlement_currency="EUR",
                    settlement_value=0.01,
                    foreign_exchange_rate=1,
                    broker="B1",
                    custodian="C1",
                    accrued_interest=0.01,
                    commission=0.01,
                    clearing_commission=0.01,
                    local_tax=0.01,
                    local_fee=0.01,
                    broker_fee=0.01,
                    exchange_fee=0.01,
                    miscellaneous_fee=0.01,
                    account="Client:/folder1/testing.acct",
                    symbol="FDS-USA",
                    instrument_name="FactSet Research Systems",
                    side="buy",
                    unit_type="quantity",
                    transaction_leaves=0.01,
                    quantity=1000.01,
                    gross=0.01,
                    price=420.25,
                    currency="USD",
                    compliance_status="unchecked",
                    added_date_time="2024-01-25T09:30:23.235",
                    updated_date_time="2024-01-25T09:30:23.235",
                    additional_fields=[
                        AdditionalField(
                            name="description",
                            type="string",
                            value="Transaction Data For FDS-USA",
                        ),
                    ],
                ),
            ],
        ),
    ) # DsotmParametersRoot |  (optional)

    try:
        # Push transactions data into FactSet.
        # example passing only required values which don't have defaults set
        # and optional values
        api_instance.send_transactions(dsotm_parameters_root=dsotm_parameters_root)


    except fds.sdk.DirectStreamingofTransactionMessages.ApiException as e:
        print("Exception when calling DSOTMApi->send_transactions: %s\n" % e)
```


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **dsotm_parameters_root** | [**DsotmParametersRoot**](DsotmParametersRoot.md)|  | [optional]

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
**200** | Expected response. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**400** | Invalid POST body. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**401** | Missing or invalid authentication. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**403** | User is forbidden with current credentials |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**415** | Missing/Invalid Content-Type header. Header needs to be set to application/json. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**429** | Rate limit reached. Retry the requests after waiting the time specified in the retry-after header. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**500** | Server error. Log the X-DataDirectRequest-Key header to assist in troubleshooting. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |
**503** | Request timed out. |  * X-DataDirect-Request-Key - FactSet’s request key header. <br>  * X-FactSet-Api-Request-Key - Key to uniquely identify an Analytics API request. Only available after successful authentication. <br>  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

