

# IndexHistory


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. |  [optional]
**date** | **LocalDate** | The respective date for values as of the date requested in YYYY-MM-DD format. |  [optional]
**name** | **String** | Proper Name of Index. |  [optional]
**constituentNumber** | **Integer** | The total number of constituents as of the date requested. |  [optional]
**currency** | **String** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). |  [optional]
**marketValue** | **Double** | Index Level Market Capitalization as of the date requested expressed in millions. |  [optional]
**price** | **Double** | Index Level Price |  [optional]
**priceReturnPercent** | **Double** | Index Level Price Percent Change |  [optional]
**totalReturnLevel** | **Double** | Index Level Total Return Amount |  [optional]
**totalReturnPercent** | **Double** | Index Level Total Return Percent Change |  [optional]
**returnType** | **String** | The requested Return Type - GROSS or NET |  [optional]
**hedgeType** | **String** | The requested Hedge Type - HEDGED or UNHEDGED |  [optional]
**requestId** | **String** | Benchmark Identifier specified in the request |  [optional]
**observationDate** | **String** | This field will always return the date of the data that was actually returned. |  [optional]


## Implemented Interfaces

* Serializable


