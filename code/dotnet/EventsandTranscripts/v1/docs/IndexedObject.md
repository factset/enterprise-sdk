# FactSet.SDK.EventsandTranscripts.Model.IndexedObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SnippetEndTimestamp** | **DateTime** | The snippet end time is calculated based off the endTime in the snippetData section and the recordingStartTime from the calls endpoint. | [optional] 
**SnippetSequence** | **int** | The sequence number of the snippet from the start of the current call. | [optional] 
**AudioSourceId** | **int** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**TranscriptData** | **List&lt;Object&gt;** |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

