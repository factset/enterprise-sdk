# Flows


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the requestId of the Fund requested. | [optional] 
**fund_flows** | **float, none_type** | Fund flows data for the specified share class in raw units of the specified currency. | [optional] 
**currency** | **str, none_type** | The Currency of the AUM values. By default it will be in the FUnds Currency, unless otherwise requested via the currency parameter. | [optional] 
**date** | **date, none_type** | The date of the AUM in YYYY-MM-DD format. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


