# FactSet.SDK.RealTimeOptions.Model.InlineResponse200Data
Set of basic data for the option contract.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdInstrument** | **string** | Identifier of the instrument. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Isin** | **string** | International Securities Identification Number of the option. | [optional] 
**NormalizedSymbol** | **string** | Symbol of the option, as normalized by FactSet. | [optional] 
**Name** | **string** | Name of the option. | [optional] 
**Type** | [**List&lt;GetOptionGetDataTypeItems&gt;**](GetOptionGetDataTypeItems.md) | Instrument type as defined by FactSet. Instrument types are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 
**Market** | [**InlineResponse200DataMarket**](InlineResponse200DataMarket.md) |  | [optional] 
**Class** | [**InlineResponse200DataClass**](InlineResponse200DataClass.md) |  | [optional] 
**Exercise** | [**InlineResponse200DataExercise**](InlineResponse200DataExercise.md) |  | [optional] 
**StrikePrice** | [**InlineResponse200DataStrikePrice**](InlineResponse200DataStrikePrice.md) |  | [optional] 
**LifeCycle** | [**InlineResponse200DataLifeCycle**](InlineResponse200DataLifeCycle.md) |  | [optional] 
**ContractSize** | **decimal?** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 
**OpenInterest** | [**InlineResponse200DataOpenInterest**](InlineResponse200DataOpenInterest.md) |  | [optional] 
**TickSize** | **decimal?** | The minimum price movement of the option. | [optional] 
**Settlement** | [**InlineResponse200DataSettlement**](InlineResponse200DataSettlement.md) |  | [optional] 
**Underlying** | [**InlineResponse200DataUnderlying**](InlineResponse200DataUnderlying.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

