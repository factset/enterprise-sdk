# FactSet.SDK.VirtualPortfolioAPIforDigitalPortals.Model.InlineResponse20010DataTransactionSell
Closing transaction of the position.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the closing transaction. | [optional] 
**Time** | **string** | Date and time of the closing transaction. | [optional] 
**Notation** | [**InlineResponse20010DataTransactionSellNotation**](InlineResponse20010DataTransactionSellNotation.md) |  | [optional] 
**Currency** | [**InlineResponse20010DataTransactionSellCurrency**](InlineResponse20010DataTransactionSellCurrency.md) |  | [optional] 
**Price** | **decimal** | Selling price of the position in the portfolio&#39;s base currency. | [optional] 
**Charges** | **decimal** | Charges accrued in the portfolio&#39;s base currency. | [optional] 
**Value** | **decimal** | Sales value of the position in the portfolio&#39;s base currency. | [optional] 
**ExchangeRate** | **decimal** | The exchange rate between the notation&#39;s currency and the portfolio currency at the time of the closing trade. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

