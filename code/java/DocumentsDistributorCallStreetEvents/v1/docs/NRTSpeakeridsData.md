

# NRTSpeakeridsData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioSourceId** | **Integer** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. |  [optional]
**speakerStartOffset** | **BigDecimal** | The number of seconds into the call when a speaker starts / is speaking. |  [optional]
**speakerId** | **String** | A unique identifier for a speaker. |  [optional]
**cosineScore** | **BigDecimal** | The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the Speakerids with the highest cosineScore are rendered in the result set. |  [optional]


## Implemented Interfaces

* Serializable


