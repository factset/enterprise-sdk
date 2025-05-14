

# RecordSetFields

Defines the properties and attributes of a record set field.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fieldType** | [**FieldTypeEnum**](#FieldTypeEnum) | The type of the field indicating the kind of data it holds. |  [optional]
**format** | **String** | The format applied to the field&#39;s value. |  [optional]
**id** | **Integer** | Unique identifier for the field. |  [optional]
**hide** | **String** | Indicates whether the field is hidden. |  [optional]
**name** | **String** | The name of the field. |  [optional]
**order** | **Integer** | The ordering of the record set field. |  [optional]



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


