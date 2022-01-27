

# CreateCustomFieldValueDto

Set a value or values for a custom field identified by the field 'Code'. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the 'Code' provided

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**code** | **String** |  | 
**integerValue** | **Integer** |  |  [optional]
**textValue** | **String** |  |  [optional]
**filePathValue** | **String** |  |  [optional]
**numericValue** | **Double** |  |  [optional]
**dateValue** | **String** |  |  [optional]
**extendedTextValue** | **String** |  |  [optional]
**contactLookupValues** | **java.util.List&lt;java.util.UUID&gt;** |  |  [optional]
**optionValue** | **String** |  |  [optional]
**optionValues** | **java.util.List&lt;String&gt;** |  |  [optional]


## Implemented Interfaces

* Serializable


