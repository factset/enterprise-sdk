# realtimeoptions.PostOptionByClassListDataItemsInstrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the instrument. | [optional] 
**normalizedSymbol** | **String** | Symbol of the option, as normalized by FactSet. | [optional] 
**name** | **String** | Name of the option. | [optional] 
**exercise** | [**PostOptionByClassListDataItemsInstrumentExercise**](PostOptionByClassListDataItemsInstrumentExercise.md) |  | [optional] 
**strikePrice** | [**PostOptionByClassListDataItemsInstrumentStrikePrice**](PostOptionByClassListDataItemsInstrumentStrikePrice.md) |  | [optional] 
**lifeCycle** | [**PostOptionByClassListDataItemsInstrumentLifeCycle**](PostOptionByClassListDataItemsInstrumentLifeCycle.md) |  | [optional] 
**contractSize** | **Number** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 


