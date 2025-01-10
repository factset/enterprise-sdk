# IndexSnapshot


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**date** | **date, none_type** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**inception_date** | **date, none_type** | The inception date of the requested index in YYYY-MM-DD format. | [optional] 
**name** | **str, none_type** | Proper Name of Index. | [optional] 
**constituent_number** | **int, none_type** | The total number of constituents as of the date requested. | [optional] 
**currency** | **str, none_type** | Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar. | [optional] 
**market_value** | **float, none_type** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**price** | **float, none_type** | Index Level Price | [optional] 
**price_return_percent1_d** | **float, none_type** | Index Level Price - 1 Day percent change | [optional] 
**price_return_percent_qtd** | **float, none_type** | Index Level Price - Quarter-to-Date percent change | [optional] 
**price_return_percent_ytd** | **float, none_type** | Index Level Price - Year-to-Date percent change | [optional] 
**total_return_level** | **float, none_type** | Index Level Total Return Amount. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent1_d** | **float, none_type** | Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent_qtd** | **float, none_type** | Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent_ytd** | **float, none_type** | Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**return_type** | **str, none_type** | The requested Return Type - GROSS or NET | [optional] 
**request_id** | **str** | Benchmark Identifier specified in the request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


