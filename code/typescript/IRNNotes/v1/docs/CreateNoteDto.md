# irnnotes.CreateNoteDto

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**title** | **String** |  | [optional] 
**identifier** | **String** |  | [optional] 
**date** | **String** |  | 
**subjectId** | **String** |  | [optional] 
**recommendationId** | **String** |  | [optional] 
**sentimentId** | **String** |  | [optional] 
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  | [optional] 
**source** | **String** |  | [optional] 
**link** | **String** |  | [optional] 
**relatedSymbols** | **[String]** |  | [optional] 
**relatedContacts** | **[String]** |  | [optional] 
**relatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  | [optional] 
**customFieldValues** | [**[CreateCustomFieldValueDto]**](CreateCustomFieldValueDto.md) |  | [optional] 
**isPersonal** | **Boolean** |  | [optional] [default to false]


