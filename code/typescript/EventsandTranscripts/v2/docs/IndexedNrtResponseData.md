# eventsandtranscripts.IndexedNrtResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snippetEndTimestamp** | **Date** | The snippet end time is calculated based off the endTime in the snippetData section and the recordingStartTime from the calls endpoint. | [optional] 
**snippetSequence** | **Number** | The sequence number of the snippet from the start of the current call. | [optional] 
**audioSourceId** | **Number** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**transcriptData** | **[Object]** |  | [optional] 


