# TableField


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Unique identifier for a combination of table and data field | [optional] 
**data_item_id** | **str** | Unique identifier for the data item | [optional] 
**name** | **str** | Name of the data field | [optional] 
**data_type** | **str** | Data type of the data field | [optional] 
**position** | **int** | Column position of the data field within the table | [optional] 
**is_primary_key** | **bool** | Flag indicating if the data field is a primary key. | [optional] 
**nullable** | **bool** | Flag indicating if a data field is nullable | [optional] 
**has_code_dependency** | **bool** | Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code. | [optional] 
**monetary** | **bool** | Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies | [optional] 
**split_affected** | **bool** | Flag indicating if the data field contained in this TableField can be affected by splits | [optional] 
**unit_factor** | **str** | Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value | [optional] 
**description** | **str** | A description of the data field within the context of its table | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


