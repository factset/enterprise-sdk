

# CreateNoteDto


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**author** | [**UserSerialDto**](UserSerialDto.md) |  | 
**title** | **String** |  |  [optional]
**identifier** | **String** |  | 
**date** | **String** |  | 
**subjectId** | **java.util.UUID** |  |  [optional]
**recommendationId** | **java.util.UUID** |  |  [optional]
**sentimentId** | **java.util.UUID** |  |  [optional]
**body** | [**CreateBodyDto**](CreateBodyDto.md) |  |  [optional]
**source** | **String** |  |  [optional]
**link** | **String** |  |  [optional]
**relatedSymbols** | **java.util.List&lt;String&gt;** |  |  [optional]
**relatedContacts** | **java.util.List&lt;java.util.UUID&gt;** |  |  [optional]
**relatedRecords** | [**RelatedRecordsDto**](RelatedRecordsDto.md) |  |  [optional]
**customFieldValues** | [**java.util.List&lt;CreateCustomFieldValueDto&gt;**](CreateCustomFieldValueDto.md) |  |  [optional]
**isPersonal** | **Boolean** |  |  [optional]


## Implemented Interfaces

* Serializable


