# eventsandtranscripts.NrtSpeakerIdsResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audioSourceId** | **Number** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**speakerStartOffset** | **Number** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**speakerId** | **String** | A unique identifier for a speaker. You can find speakerIds within [FactSet People API](https://developer.factset.com/api-catalog/factset-people-api).  | [optional] 
**confidenceScore** | **Number** | The confidence score indicates the similarity for a particular speaker.  A score ≥ 0.49 while a speaker is speaking is considered high confidence in the predicted speaker.  Only speaker IDs with a confidence score ≥ 0.49 are included in the result set. | [optional] 
**affiliationId** | **String** | The affiliationId represents the entity ID associated with the organization or company to which the speaker is affiliated. | [optional] 


