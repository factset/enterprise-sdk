# documentsdistributorcallstreetevents.NRTSnippetsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **Number** | The unique ID for an event. | [optional] 
**snippetEndTimestamp** | **String** | The snippet end time is calculated based off the endTime in the snippetData section and the recordingStartTime from the calls endpoint  | [optional] 
**transcriptData** | [**[NRTSnippetsTranscriptData]**](NRTSnippetsTranscriptData.md) |  | [optional] 
**snippetSequence** | **Number** | The sequence number of the snippet from the start of the current call  | [optional] 
**audioSourceId** | **Number** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple AudioSource ids. | [optional] 


