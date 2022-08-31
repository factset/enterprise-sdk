# InlineResponse20010DataTransactionBuy

Opening transaction of the closed position.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Identifier of the opening transaction. | [optional] 
**time** | **str** | Date and time of the opening transaction. | [optional] 
**notation** | [**InlineResponse20010DataTransactionBuyNotation**](InlineResponse20010DataTransactionBuyNotation.md) |  | [optional] 
**currency** | [**InlineResponse20010DataTransactionBuyCurrency**](InlineResponse20010DataTransactionBuyCurrency.md) |  | [optional] 
**price** | **float** | Purchase price of the position in the portfolio&#39;s base currency. | [optional] 
**charges** | **float** | Charges accrued in the portfolio&#39;s base currency. | [optional] 
**value** | **float** | Purchase value of the position in the portfolio&#39;s base currency. | [optional] 
**exchange_rate** | **float** | The exchange rate between the notation&#39;s currency and the portfolio currency at the time of the opening trade. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


