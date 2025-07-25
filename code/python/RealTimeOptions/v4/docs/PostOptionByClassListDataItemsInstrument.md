# PostOptionByClassListDataItemsInstrument

instrument

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Identifier of the instrument. | [optional] 
**normalized_symbol** | **str, none_type** | Symbol of the option, as normalized by FactSet. | [optional] 
**name** | **str, none_type** | Name of the option. | [optional] 
**exercise** | [**PostOptionByClassListDataItemsInstrumentExercise**](PostOptionByClassListDataItemsInstrumentExercise.md) |  | [optional] 
**strike_price** | [**PostOptionByClassListDataItemsInstrumentStrikePrice**](PostOptionByClassListDataItemsInstrumentStrikePrice.md) |  | [optional] 
**life_cycle** | [**PostOptionByClassListDataItemsInstrumentLifeCycle**](PostOptionByClassListDataItemsInstrumentLifeCycle.md) |  | [optional] 
**contract_size** | **float, none_type** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


