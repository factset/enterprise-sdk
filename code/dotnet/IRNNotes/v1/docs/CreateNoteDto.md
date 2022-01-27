# FactSet.SDK.IRNNotes.Model.CreateNoteDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**Title** | **string** |  | [optional] 
**Identifier** | **string** |  | 
**Date** | **string** |  | 
**SubjectId** | **Guid?** |  | [optional] 
**RecommendationId** | **Guid?** |  | [optional] 
**SentimentId** | **Guid?** |  | [optional] 
**Body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**Source** | **string** |  | [optional] 
**Link** | **string** |  | [optional] 
**RelatedSymbols** | **List&lt;string&gt;** |  | [optional] 
**RelatedContacts** | **List&lt;Guid&gt;** |  | [optional] 
**RelatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**CustomFieldValues** | [**List&lt;CreateCustomFieldValueDto&gt;**](CreateCustomFieldValueDto.md) |  | [optional] 
**IsPersonal** | **bool?** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

