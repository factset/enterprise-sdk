# factsetbenchmarks.IndexSnapshot

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**date** | **Date** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**inceptionDate** | **Date** | The inception date of the requested index in YYYY-MM-DD format. | [optional] 
**name** | **String** | Proper Name of Index. | [optional] 
**constituentNumber** | **Number** | The total number of constituents as of the date requested. | [optional] 
**currency** | **String** | Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar. | [optional] 
**marketValue** | **Number** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**price** | **Number** | Index Level Price | [optional] 
**priceReturnPercent1D** | **Number** | Index Level Price - 1 Day percent change | [optional] 
**priceReturnPercentQTD** | **Number** | Index Level Price - Quarter-to-Date percent change | [optional] 
**priceReturnPercentYTD** | **Number** | Index Level Price - Year-to-Date percent change | [optional] 
**totalReturnLevel** | **Number** | Index Level Total Return Amount. (Gross or Net depends on requested returnType) | [optional] 
**totalReturnPercent1D** | **Number** | Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType) | [optional] 
**totalReturnPercentQTD** | **Number** | Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**totalReturnPercentYTD** | **Number** | Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**returnType** | **String** | The requested Return Type - GROSS or NET | [optional] 
**requestId** | **String** | Benchmark Identifier specified in the request | [optional] 


