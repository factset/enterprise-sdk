# contentfeedsdatadictionary.TableField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Unique identifier for a combination of table and data field | [optional] 
**dataItemId** | **String** | Unique identifier for the data item | [optional] 
**name** | **String** | Name of the data field | [optional] 
**dataType** | **String** | Data type of the data field | [optional] 
**position** | **Number** | Column position of the data field within the table | [optional] 
**isPrimaryKey** | **Boolean** | Flag indicating if the data field is a primary key. | [optional] 
**nullable** | **Boolean** | Flag indicating if a data field is nullable | [optional] 
**hasCodeDependency** | **Boolean** | Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code. | [optional] 
**monetary** | **Boolean** | Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies | [optional] 
**splitAffected** | **Boolean** | Flag indicating if the data field contained in this TableField can be affected by splits | [optional] 
**unitFactor** | **String** | Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value | [optional] 
**description** | **String** | A description of the data field within the context of its table | [optional] 


