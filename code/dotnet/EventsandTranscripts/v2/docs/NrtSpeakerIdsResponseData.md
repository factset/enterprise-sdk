# FactSet.SDK.EventsandTranscripts.Model.NrtSpeakerIdsResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudioSourceId** | **int?** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**SpeakerStartOffset** | **decimal?** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**SpeakerId** | **string** | A unique identifier for a speaker. You can find speakerIds within [FactSet People API](https://developer.factset.com/api-catalog/factset-people-api).  | [optional] 
**ConfidenceScore** | **decimal?** | The confidence score indicates the similarity for a particular speaker.  A score ≥ 0.49 while a speaker is speaking is considered high confidence in the predicted speaker.  Only speaker IDs with a confidence score ≥ 0.49 are included in the result set. | [optional] 
**AffiliationId** | **string** | The affiliationId represents the entity ID associated with the organization or company to which the speaker is affiliated. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

