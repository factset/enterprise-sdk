

# IndexSnapshot


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. |  [optional]
**date** | **LocalDate** | The respective date for values as of the date requested in YYYY-MM-DD format. |  [optional]
**inceptionDate** | **LocalDate** | The inception date of the requested index in YYYY-MM-DD format. |  [optional]
**name** | **String** | Proper Name of Index. |  [optional]
**constituentNumber** | **Integer** | The total number of constituents as of the date requested. |  [optional]
**currency** | **String** | Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar. |  [optional]
**marketValue** | **Double** | Index Level Market Capitalization as of the date requested expressed in millions. |  [optional]
**price** | **Double** | Index Level Price |  [optional]
**priceReturnPercent1D** | **Double** | Index Level Price - 1 Day percent change |  [optional]
**priceReturnPercentQTD** | **Double** | Index Level Price - Quarter-to-Date percent change |  [optional]
**priceReturnPercentYTD** | **Double** | Index Level Price - Year-to-Date percent change |  [optional]
**totalReturnLevel** | **Double** | Index Level Total Return Amount. (Gross or Net depends on requested returnType) |  [optional]
**totalReturnPercent1D** | **Double** | Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType) |  [optional]
**totalReturnPercentQTD** | **Double** | Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType) |  [optional]
**totalReturnPercentYTD** | **Double** | Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType) |  [optional]
**returnType** | **String** | The requested Return Type - GROSS or NET |  [optional]
**requestId** | **String** | Benchmark Identifier specified in the request |  [optional]


## Implemented Interfaces

* Serializable


