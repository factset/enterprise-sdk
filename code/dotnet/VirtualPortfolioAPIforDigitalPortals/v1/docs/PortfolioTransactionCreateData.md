# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model.PortfolioTransactionCreateData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the portfolio. | 
**Type** | **string** | Transaction Type.  | 
**Notation** | [**PortfolioPayoutCreateDataNotation**](PortfolioPayoutCreateDataNotation.md) |  | 
**Time** | **string** | Date and time of the trade. | 
**NumberShares** | **decimal** | Number of shares bought or sold. | 
**Price** | **decimal** | Purchase price. | 
**Charges** | **decimal** | Charges accrued in portfolio‘s base currency. | [optional] [default to 0M]
**ExchangeRate** | **decimal** | The exchange rate between the notation&#39;s currency and the portfolio currency. | [optional] [default to 1M]
**ParentTransaction** | [**PortfolioTransactionCreateDataParentTransaction**](PortfolioTransactionCreateDataParentTransaction.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

