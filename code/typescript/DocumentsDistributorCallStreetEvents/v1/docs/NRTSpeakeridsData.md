# documentsdistributorcallstreetevents.NRTSpeakeridsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioSourceId** | **Number** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**speakerStartOffset** | **Number** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**speakerId** | **String** | A unique identifier for a speaker. | [optional] 
**cosineScore** | **Number** | The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt;&#x3D; 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the SpeakerIDs with the highest cosineScore are rendered in the result set. | [optional] 
**affiliationId** | **String** | Affiliation ID denotes the company a speaker is associated with. | [optional] 


