# IndexSnapshot


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str** | Requested Identifier. Must be a valid Benchmark Identifier recognized by FactSet. | [optional] 
**date** | **date** | The respective date for values as of the date requested in YYYY-MM-DD format. | [optional] 
**name** | **str** | Proper Name of Index. | [optional] 
**constituent_number** | **int** | The total number of constituents as of the date requested. | [optional] 
**currency** | **str** | Currency Code used in adjustments. If no Currency was requested, the service will default to the local Calendar. | [optional] 
**market_value** | **float** | Index Level Market Capitalization as of the date requested expressed in millions. | [optional] 
**price** | **float** | Index Level Price | [optional] 
**price_return_percent1_d** | **float** | Index Level Price - 1 Day percent change | [optional] 
**price_return_percent_qtd** | **float** | Index Level Price - Quarter-to-Date percent change | [optional] 
**price_return_percent_ytd** | **float** | Index Level Price - Year-to-Date percent change | [optional] 
**total_return_level** | **float** | Index Level Total Return Amount. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent1_d** | **float** | Index Level Total Return - 1 Day percent change. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent_qtd** | **float** | Index Level Total Return - Quarter-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**total_return_percent_ytd** | **float** | Index Level Total Return - Year-to-Date percent change. (Gross or Net depends on requested returnType) | [optional] 
**return_type** | **str** | The requested Return Type - GROSS or NET | [optional] 
**request_id** | **str** | Benchmark Identifier specified in the request | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


