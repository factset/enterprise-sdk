# NRTSpeakeridsData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**audio_source_id** | **int** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSource ids. | [optional] 
**speaker_start_offset** | **float** | The number of seconds into the call when a speaker starts / is speaking | [optional] 
**speaker_id** | **str** | A unique identifier for a speaker | [optional] 
**cosine_score** | **float** | The cosine similarity score (Confidence score)  for a particular speaker.  A score &gt; 0.5 while a key-speaker is speaking can be considered as a high confidence in the predicted speaker  Negative and null cosine scores are eliminated from the speakerid result set as they are the predictions due to either music or silence in the call  Only the Speakerids with the highest cosineScore are rendered in the result set | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


