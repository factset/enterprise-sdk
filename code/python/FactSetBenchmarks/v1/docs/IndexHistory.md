# IndexHistory


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**date** | **date, none_type** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**name** | **str, none_type** | Proper Name of Index. | [optional] 
**constituent_number** | **int, none_type** | The total number of constituents as of the date requested. | [optional] 
**currency** | **str, none_type** | Currency Code used in adjustments. If no Currency was requested, the service will default to LOCAL (&#39;LOC&#39;). | [optional] 
**market_value** | **float, none_type** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**price** | **float, none_type** | Index Level Price | [optional] 
**price_return_percent** | **float, none_type** | Index Level Price Percent Change | [optional] 
**total_return_level** | **float, none_type** | Index Level Total Return Amount | [optional] 
**total_return_percent** | **float, none_type** | Index Level Total Return Percent Change | [optional] 
**return_type** | **str, none_type** | The requested Return Type - GROSS or NET | [optional] 
**hedge_type** | **str, none_type** | The requested Hedge Type - HEDGED or UNHEDGED | [optional] 
**request_id** | **str** | Benchmark Identifier specified in the request | [optional] 
**observation_date** | **str, none_type** | This field will always return the date of the data that was actually returned. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


