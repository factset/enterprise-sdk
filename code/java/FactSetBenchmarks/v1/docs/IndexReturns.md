

# IndexReturns


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. |  [optional]
**inceptionDate** | **LocalDate** | The inception date of the requested index in YYYY-MM-DD format. |  [optional]
**name** | **String** | Proper Name of Index. |  [optional]
**currency** | **String** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). |  [optional]
**totalReturnPercent** | **Double** | Cumulative total return (%) for the index over the specified date range, calculated as ((startDate level / endDate level) - 1) * 100 using total return index levels. Returns a single aggregated value per benchmark. Dates are inclusive and based on closing levels; non-trading days use the nearest available trading date. |  [optional]
**returnType** | **String** | The requested Return Type - GROSS or NET |  [optional]
**hedgeType** | **String** | The requested Hedge Type - HEDGED or UNHEDGED |  [optional]
**requestId** | **String** | Benchmark Identifier specified in the request |  [optional]


## Implemented Interfaces

* Serializable


