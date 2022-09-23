# FactSet.SDK.FactSetBenchmarks.Model.IndexHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**Date** | **DateTime?** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**Name** | **string** | Proper Name of Index. | [optional] 
**ConstituentNumber** | **int?** | The total number of constituents as of the date requested. | [optional] 
**Currency** | **string** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). | [optional] 
**MarketValue** | **double?** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**Price** | **double?** | Index Level Price | [optional] 
**PriceReturnPercent** | **double?** | Index Level Price Percent Change | [optional] 
**TotalReturnLevel** | **double?** | Index Level Total Return Amount | [optional] 
**TotalReturnPercent** | **double?** | Index Level Total Return Percent Change | [optional] 
**ReturnType** | **string** | The requested Return Type - GROSS or NET | [optional] 
**HedgeType** | **string** | The requested Hedge Type - HEDGED or UNHEDGED | [optional] 
**RequestId** | **string** | Benchmark Identifier specified in the request | [optional] 
**ObservationDate** | **string** | This field will always return the date of the data that was actually returned. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

