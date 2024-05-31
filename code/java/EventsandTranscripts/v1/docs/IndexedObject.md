

# IndexedObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snippetEndTimestamp** | **OffsetDateTime** | The snippet end time is calculated based off the endTime in the snippetData section and the recordingStartTime from the calls endpoint. |  [optional]
**snippetSequence** | **Integer** | The sequence number of the snippet from the start of the current call. |  [optional]
**audioSourceId** | **Integer** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. |  [optional]
**transcriptData** | [**java.util.List&lt;Object&gt;**](Object.md) |  |  [optional]


## Implemented Interfaces

* Serializable


