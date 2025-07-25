# realtimeoptions.InlineResponse200Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idInstrument** | **String** | Identifier of the instrument. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**isin** | **String** | International Securities Identification Number of the option. | [optional] 
**normalizedSymbol** | **String** | Symbol of the option, as normalized by FactSet. | [optional] 
**name** | **String** | Name of the option. | [optional] 
**type** | [**[GetOptionGetDataTypeItems]**](GetOptionGetDataTypeItems.md) | Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 
**market** | [**InlineResponse200DataMarket**](InlineResponse200DataMarket.md) |  | [optional] 
**_class** | [**InlineResponse200DataClass**](InlineResponse200DataClass.md) |  | [optional] 
**exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  | [optional] 
**strikePrice** | [**InlineResponse200DataStrikePrice**](InlineResponse200DataStrikePrice.md) |  | [optional] 
**lifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**contractSize** | **Number** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 
**openInterest** | [**InlineResponse200DataOpenInterest**](InlineResponse200DataOpenInterest.md) |  | [optional] 
**tickSize** | **Number** | The minimum price movement of the option. | [optional] 
**settlement** | [**InlineResponse200DataSettlement**](InlineResponse200DataSettlement.md) |  | [optional] 
**underlying** | [**InlineResponse200DataUnderlying**](InlineResponse200DataUnderlying.md) |  | [optional] 


