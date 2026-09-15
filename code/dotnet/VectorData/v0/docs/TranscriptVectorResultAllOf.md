# FactSet.SDK.VectorData.Model.TranscriptVectorResultAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Source** | **TranscriptVector** |  | 
**Vector** | **List&lt;float&gt;** | Vector embedding array. Omitted when trimmed&#x3D;true. | [optional] 
**Trimmed** | **bool** | Indicates whether vector embeddings are included. | [optional] 
**UploadDateTime** | **DateTime** | Date and time when the document was uploaded to the system. | [optional] 
**SpeakerId** | **int?** | Unique identifier of the speaker. | [optional] 
**SpeakerName** | **string** | Name of the speaker. | [optional] 
**SpeakerType** | **string** | Type of speaker (e.g., corprep, analyst). | [optional] 
**SpeakerTitle** | **string** | Title of the speaker. | [optional] 
**SpeakerCompanyName** | **string** | Company name of the speaker. | [optional] 
**SpeakerCompanyEntityId** | **string** | FactSet entity ID of speaker&#39;s company. | [optional] 
**SpeakerEntity** | **string** | FactSet entity ID of the speaker. | [optional] 
**DocType** | **string** | Type of document chunk. | [optional] 
**DocNum** | **string** | Sequential chunk identifier within the document. | [optional] 
**FinancialYear** | **string** | Financial year. | [optional] 
**FinancialQuarter** | **string** | Financial quarter. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

