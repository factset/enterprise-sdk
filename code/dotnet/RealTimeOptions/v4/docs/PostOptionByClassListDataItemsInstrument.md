# FactSet.SDK.RealTimeOptions.Model.PostOptionByClassListDataItemsInstrument
instrument

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**NormalizedSymbol** | **string** | Symbol of the option, as normalized by FactSet. | [optional] 
**Name** | **string** | Name of the option. | [optional] 
**Exercise** | [**PostOptionByClassListDataItemsInstrumentExercise**](PostOptionByClassListDataItemsInstrumentExercise.md) |  | [optional] 
**StrikePrice** | [**PostOptionByClassListDataItemsInstrumentStrikePrice**](PostOptionByClassListDataItemsInstrumentStrikePrice.md) |  | [optional] 
**LifeCycle** | [**PostOptionByClassListDataItemsInstrumentLifeCycle**](PostOptionByClassListDataItemsInstrumentLifeCycle.md) |  | [optional] 
**ContractSize** | **decimal?** | Quantity of the underlying asset represented by an option. For fixed income and index options it represents the value of one unit of the underlying instrument. For an underlying whose price unit is index points, this is the currency value of the contract per index point. For underlyings whose price unit is percent, this is the nominal value of the underlying. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

