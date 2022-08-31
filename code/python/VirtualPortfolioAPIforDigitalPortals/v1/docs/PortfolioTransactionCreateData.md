# PortfolioTransactionCreateData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the portfolio. | 
**type** | **str** | Transaction Type.  | 
**notation** | [**PortfolioPayoutCreateDataNotation**](PortfolioPayoutCreateDataNotation.md) |  | 
**time** | **str** | Date and time of the trade. | 
**number_shares** | **float** | Number of shares bought or sold. | 
**price** | **float** | Purchase price. | 
**charges** | **float** | Charges accrued in portfolio‘s base currency. | [optional]  if omitted the server will use the default value of 0
**exchange_rate** | **float** | The exchange rate between the notation&#39;s currency and the portfolio currency. | [optional]  if omitted the server will use the default value of 1
**parent_transaction** | [**PortfolioTransactionCreateDataParentTransaction**](PortfolioTransactionCreateDataParentTransaction.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


