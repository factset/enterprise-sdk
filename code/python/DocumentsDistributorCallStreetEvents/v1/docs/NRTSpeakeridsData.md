# NRTSpeakeridsData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_source_id** | **int, none_type** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**speaker_start_offset** | **float, none_type** | The number of seconds into the call when a speaker starts / is speaking. | [optional] 
**speaker_id** | **str, none_type** | A unique identifier for a speaker. | [optional] 
**cosine_score** | **float, none_type** | The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker.  Only the Speakerids with the highest cosineScore are rendered in the result set. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


