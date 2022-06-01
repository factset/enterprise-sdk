# FactSet.SDK.ContentFeedsDataDictionary.Model.TableField

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Unique identifier for a combination of table and data field | [optional] 
**DataItemId** | **string** | Unique identifier for the data item | [optional] 
**Name** | **string** | Name of the data field | [optional] 
**DataType** | **string** | Data type of the data field | [optional] 
**Position** | **int** | Column position of the data field within the table | [optional] 
**IsPrimaryKey** | **bool** | Flag indicating if the data field is a primary key. | [optional] 
**Nullable** | **bool** | Flag indicating if a data field is nullable | [optional] 
**HasCodeDependency** | **bool** | Flag indicating if the field&#39;s value is determined by a code value in its row. The monetary, splitAffected and unitFactor fields for that value will also be inherited from the code. | [optional] 
**Monetary** | **bool** | Flag indicating if the data field contained in this TableField is monetary. If true, this field can have exchange rates applied to convert to other currencies | [optional] 
**SplitAffected** | **bool** | Flag indicating if the data field contained in this TableField can be affected by splits | [optional] 
**UnitFactor** | **string** | Factor to indicate what units that the data field is displayed in. If null, the field does not need to have a factor applied to obtain the real value | [optional] 
**Description** | **string** | A description of the data field within the context of its table | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

