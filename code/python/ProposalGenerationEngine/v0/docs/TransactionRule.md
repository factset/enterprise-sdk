# TransactionRule


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** |  | [optional] 
**amount** | **float** | absolute value in case the type is cash or percentage in the other 2 cases | [optional] 
**amount_type** | **str** |  | [optional] 
**amount_growth** | **float** | apply growth rate to the amount for each period expressed in percentage | [optional] 
**amount_growth_type** | **str** |  | [optional] 
**amount_growth_frequency** | **int** |  | [optional] 
**allow_partial_amount** | **bool** |  | [optional]  if omitted the server will use the default value of False
**start_date** | **date** | initial date when the rule is applied | [optional] 
**end_date** | **date** | last date when the rule is applied | [optional] 
**frequency** | **float** | monthly - 12, yearly - 1, quarterly - 4; only once &#x3D; endPeriod should be equal to startPeriod | [optional] 
**frequency_alignment** | **float** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


