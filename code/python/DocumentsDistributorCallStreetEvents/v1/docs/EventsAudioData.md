# EventsAudioData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Download link for the audio file | [optional] 
**file_name** | **str** | The filename of the audio file | [optional] 
**duration_secs** | **float** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds | [optional] 
**end_offset_seconds** | **float** | The delta in seconds between startTime to when FactSet marks the end of the call | [optional] 
**start_offset_seconds** | **float** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call | [optional] 
**source_code** | **str** | Identifies the method of how the event is recorded Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
**start_time** | **str** | The official timestamp when FactSet begins the recording | [optional] 
**end_time** | **str** | The official timestamp when FactSet ends the recording | [optional] 
**upload_time** | **str** | The official timestamp when FactSet publishes the audio file externally | [optional] 
**file_size** | **float** | Size of the Audio file, in bytes | [optional] 
**report_id** | **int** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event | [optional] 
**ticker** | **str** | Ticker-region identifier for the company hosting the event | [optional] 
**entity_id** | **str** | Factset entity level identifier for the company hosting the event | [optional] 
**trimmed** | **bool** | The trimmed attribute helps identify if the audio is the trimmed version | [optional] 
**sample_rate** | **float** | The number of samples of audio carried per second in Kbps | [optional] 
**bitrate** | **float** | The total number of bits of information stored per second of sound in Kbps | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


