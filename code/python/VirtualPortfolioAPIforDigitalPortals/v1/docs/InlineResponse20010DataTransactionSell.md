# InlineResponse20010DataTransactionSell

Closing transaction of the position.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the closing transaction. | [optional] 
**time** | **str** | Date and time of the closing transaction. | [optional] 
**notation** | [**InlineResponse20010DataTransactionSellNotation**](InlineResponse20010DataTransactionSellNotation.md) |  | [optional] 
**currency** | [**InlineResponse20010DataTransactionSellCurrency**](InlineResponse20010DataTransactionSellCurrency.md) |  | [optional] 
**price** | **float** | Selling price of the position in the portfolio&#39;s base currency. | [optional] 
**charges** | **float** | Charges accrued in the portfolio&#39;s base currency. | [optional] 
**value** | **float** | Sales value of the position in the portfolio&#39;s base currency. | [optional] 
**exchange_rate** | **float** | The exchange rate between the notation&#39;s currency and the portfolio currency at the time of the closing trade. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


