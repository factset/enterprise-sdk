# FactSet.SDK.FactSetBenchmarks.Model.IndexSnapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**Date** | **DateTime** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**Name** | **string** | Proper Name of Index. | [optional] 
**ConstituentNumber** | **int** | The total number of constituents as of the date requested. | [optional] 
**Currency** | **string** | Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar. | [optional] 
**MarketValue** | **double** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**Price** | **double** | Index Level Price | [optional] 
**PriceReturnPercent1D** | **double** | Index Level Price - 1 Day percent change | [optional] 
**PriceReturnPercentQTD** | **double** | Index Level Price - Quarter-to-Date percent change | [optional] 
**PriceReturnPercentYTD** | **double** | Index Level Price - Year-to-Date percent change | [optional] 
**TotalReturnLevel** | **double** | Index Level Total Return Amount. (Gross or Net depends on requested returnType) | [optional] 
**TotalReturnPercent1D** | **double** | Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType) | [optional] 
**TotalReturnPercentQTD** | **double** | Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**TotalReturnPercentYTD** | **double** | Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**ReturnType** | **string** | The requested Return Type - GROSS or NET | [optional] 
**RequestId** | **string** | Benchmark Identifier specified in the request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

