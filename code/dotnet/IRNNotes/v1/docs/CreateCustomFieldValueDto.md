# FactSet.SDK.IRNNotes.Model.CreateCustomFieldValueDto
Set a value or values for a custom field identified by the field 'Code'. Only one of the fields (IntegerValue / TextValue / FilePathValue etc) will be used,  depending on the data type of the custom field corresponding to the 'Code' provided

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Code** | **string** |  | 
**IntegerValue** | **int?** |  | [optional] 
**TextValue** | **string** |  | [optional] 
**FilePathValue** | **string** |  | [optional] 
**NumericValue** | **double?** |  | [optional] 
**DateValue** | **string** |  | [optional] 
**ExtendedTextValue** | **string** |  | [optional] 
**ContactLookupValues** | **List&lt;Guid&gt;** |  | [optional] 
**OptionValue** | **string** |  | [optional] 
**OptionValues** | **List&lt;string&gt;** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

