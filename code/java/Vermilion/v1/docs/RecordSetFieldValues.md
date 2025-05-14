

# RecordSetFieldValues

Field value and associated metadata for the record set field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldId** | **Integer** | Unique identifier for the field. |  [optional]
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | The type of the field indicating the kind of data it holds. |  [optional]
**fieldValue** | **String** | The value assigned to the field. |  [optional]



## Enum: FieldTypeEnum

Name | Value
---- | -----
BOOLEAN | &quot;BOOLEAN&quot;
COLOUR | &quot;COLOUR&quot;
DATETIME | &quot;DATETIME&quot;
DECIMAL | &quot;DECIMAL&quot;
FONT | &quot;FONT&quot;
FONTSIZE | &quot;FONTSIZE&quot;
HTML | &quot;HTML&quot;
INTEGER | &quot;INTEGER&quot;
TEXT | &quot;TEXT&quot;


## Implemented Interfaces

* Serializable


