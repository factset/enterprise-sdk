# realtimeoptions.InlineResponse200DataSettlement

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | Settlement type of the option. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. |   | [optional] 
**price** | **Number** | Settlement price. | [optional] 
**currency** | [**InlineResponse200DataSettlementCurrency**](InlineResponse200DataSettlementCurrency.md) |  | [optional] 
**time** | **Date** | Date and time. | [optional] 



## Enum: TypeEnum


* `cash` (value: `"cash"`)

* `physical` (value: `"physical"`)




