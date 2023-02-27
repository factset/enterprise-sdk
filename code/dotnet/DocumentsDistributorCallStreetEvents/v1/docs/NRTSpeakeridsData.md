# FactSet.SDK.DocumentsDistributorCallStreetEvents.Model.NRTSpeakeridsData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**AudioSourceId** | **int?** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**SpeakerStartOffset** | **decimal?** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**SpeakerId** | **string** | A unique identifier for a speaker. | [optional] 
**CosineScore** | **decimal?** | The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt;&#x3D; 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the SpeakerIDs with the highest cosineScore are rendered in the result set. | [optional] 
**AffiliationId** | **string** | Affiliation ID denotes the company a speaker is associated with. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

