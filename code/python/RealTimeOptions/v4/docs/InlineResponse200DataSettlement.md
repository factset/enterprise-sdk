# InlineResponse200DataSettlement

Settlement details (type and EOD price).

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str, none_type** | Settlement type of the option. | Value | Description | | --- | --- | | cash | Transfer of a cash amount. | | physical | Physical delivery of the underlying asset. |   | [optional] 
**price** | **float, none_type** | Settlement price. | [optional] 
**currency** | [**InlineResponse200DataSettlementCurrency**](InlineResponse200DataSettlementCurrency.md) |  | [optional] 
**time** | **datetime, none_type** | Date and time. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


