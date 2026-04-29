# IndexReturns


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**inception_date** | **date, none_type** | The inception date of the requested index in YYYY-MM-DD format. | [optional] 
**name** | **str, none_type** | Proper Name of Index. | [optional] 
**currency** | **str, none_type** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). Currency code (ISO 4217). For a list of currency codes, see [OA Page 1470](https://my.apps.factset.com/oa/pages/1470). | [optional] 
**total_return_percent** | **float, none_type** | Cumulative total return (%) for the index over the specified date range, calculated as ((startDate level / endDate level) - 1) * 100 using total return index levels. Returns a single aggregated value per benchmark. Dates are inclusive and based on closing levels; non-trading days use the nearest available trading date. | [optional] 
**return_type** | **str, none_type** | The requested Return Type - GROSS or NET | [optional] 
**hedge_type** | **str, none_type** | The requested Hedge Type - HEDGED or UNHEDGED | [optional] 
**request_id** | **str** | Benchmark Identifier specified in the request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


