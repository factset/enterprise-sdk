# CreateNoteDto


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**date** | **str** |  | 
**title** | **str, none_type** |  | [optional] 
**identifier** | **str, none_type** |  | [optional] 
**subject_id** | **str, none_type** |  | [optional] 
**recommendation_id** | **str, none_type** |  | [optional] 
**sentiment_id** | **str, none_type** |  | [optional] 
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**source** | **str, none_type** |  | [optional] 
**link** | **str, none_type** |  | [optional] 
**related_symbols** | **[str], none_type** |  | [optional] 
**related_contacts** | **[str], none_type** |  | [optional] 
**related_records** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**custom_field_values** | [**[CreateCustomFieldValueDto], none_type**](CreateCustomFieldValueDto.md) |  | [optional] 
**is_personal** | **bool** |  | [optional]  if omitted the server will use the default value of False

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


