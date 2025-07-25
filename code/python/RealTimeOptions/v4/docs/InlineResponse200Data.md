# InlineResponse200Data

Set of basic data for the option contract.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_instrument** | **str, none_type** | Identifier of the instrument. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**isin** | **str, none_type** | International Securities Identification Number of the option. | [optional] 
**normalized_symbol** | **str, none_type** | Symbol of the option, as normalized by FactSet. | [optional] 
**name** | **str, none_type** | Name of the option. | [optional] 
**type** | [**[GetOptionGetDataTypeItems]**](GetOptionGetDataTypeItems.md) | Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 
**market** | [**InlineResponse200DataMarket**](InlineResponse200DataMarket.md) |  | [optional] 
**_class** | [**InlineResponse200DataClass**](InlineResponse200DataClass.md) |  | [optional] 
**exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  | [optional] 
**strike_price** | [**InlineResponse200DataStrikePrice**](InlineResponse200DataStrikePrice.md) |  | [optional] 
**life_cycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**contract_size** | **float, none_type** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 
**open_interest** | [**InlineResponse200DataOpenInterest**](InlineResponse200DataOpenInterest.md) |  | [optional] 
**tick_size** | **float, none_type** | The minimum price movement of the option. | [optional] 
**settlement** | [**InlineResponse200DataSettlement**](InlineResponse200DataSettlement.md) |  | [optional] 
**underlying** | [**InlineResponse200DataUnderlying**](InlineResponse200DataUnderlying.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


