# NrtSpeakerIdObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_source_id** | **int, none_type** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**speaker_start_offset** | **float, none_type** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**speaker_id** | **str, none_type** | A unique identifier for a speaker. You can find speakerIds within [FactSet People API](https://developer.factset.com/api-catalog/factset-people-api).  | [optional] 
**confidence_score** | **float, none_type** | The  Confidence score similarity for a particular speaker.  A score &gt;&#x3D; 0.49 while a speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the SpeakerIDs with the highest cosineScore are rendered in the result set. | [optional] 
**affiliation_id** | **str, none_type** | The affiliationId represents the entity ID associated with the organization or company to which the speaker is affiliated. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


