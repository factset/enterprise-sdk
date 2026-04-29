# FactSet.SDK.FactSetBenchmarks.Model.IndexReturns

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**FsymId** | **string** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**InceptionDate** | **DateTime?** | The inception date of the requested index in YYYY-MM-DD format. | [optional] 
**Name** | **string** | Proper Name of Index. | [optional] 
**Currency** | **string** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**TotalReturnPercent** | **double?** | Cumulative total return (%) for the index over the specified date range, calculated as ((startDate level / endDate level) - 1) * 100 using total return index levels. Returns a single aggregated value per benchmark. Dates are inclusive and based on closing levels; non-trading days use the nearest available trading date. | [optional] 
**ReturnType** | **string** | The requested Return Type - GROSS or NET | [optional] 
**HedgeType** | **string** | The requested Hedge Type - HEDGED or UNHEDGED | [optional] 
**RequestId** | **string** | Benchmark Identifier specified in the request | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

