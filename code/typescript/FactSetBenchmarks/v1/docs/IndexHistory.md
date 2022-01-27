# factsetbenchmarks.IndexHistory

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**date** | **Date** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**name** | **String** | Proper Name of Index. | [optional] 
**constituentNumber** | **Number** | The total number of constituents as of the date requested. | [optional] 
**currency** | **String** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). | [optional] 
**marketValue** | **Number** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**price** | **Number** | Index Level Price | [optional] 
**priceReturnPercent** | **Number** | Index Level Price Percent Change | [optional] 
**totalReturnLevel** | **Number** | Index Level Total Return Amount | [optional] 
**totalReturnPercent** | **Number** | Index Level Total Return Percent Change | [optional] 
**returnType** | **String** | The requested Return Type - GROSS or NET | [optional] 
**requestId** | **String** | Benchmark Identifier specified in the request | [optional] 


