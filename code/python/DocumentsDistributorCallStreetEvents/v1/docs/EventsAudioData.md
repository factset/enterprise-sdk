# EventsAudioData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **str** | Download link for the audio file. | [optional] 
**file_name** | **str** | The filename of the audio file. | [optional] 
**duration_secs** | **float, none_type** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds. | [optional] 
**end_offset_seconds** | **float, none_type** | The delta in seconds between startTime to when FactSet marks the end of the call. | [optional] 
**start_offset_seconds** | **float, none_type** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call. | [optional] 
**source_code** | **str** | Identifies the method of how the event is recorded Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
**start_time** | **str, none_type** | The official timestamp when FactSet begins the recording.  Note:- All the vendor and trimmed files would have default 1900-0101T00:00:00Z time stamp. | [optional] 
**end_time** | **str, none_type** | The official timestamp when FactSet ends the recording.  Note:- All the vendor and trimmed files would have default 1900-0101T00:00:00Z time stamp. | [optional] 
**upload_time** | **str, none_type** | The official timestamp when FactSet publishes the audio file externally. | [optional] 
**file_size** | **float** | Size of the Audio file, in bytes. | [optional] 
**report_id** | **int** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables. | [optional] 
**ticker** | **str, none_type** | Ticker-region identifier for the company hosting the event.  Note:- This field can have N/A value when the company is a private(non-equity company) | [optional] 
**entity_id** | **str** | Factset entity level identifier for the company hosting the event. | [optional] 
**trimmed** | **bool** | The trimmed attribute helps identify if the audio is the trimmed version. Note:- All the vendor generated files are trimmed regardless of the ‘trimmed’ attribute value in the response. | [optional] 
**sample_rate** | **float, none_type** | The number of samples of audio carried per second in Kbps.  Note:- The field can have value as -1 for the audio files without sampleRate metadata | [optional] 
**bitrate** | **float, none_type** | The total number of bits of information stored per second of sound in Kbps.  Note:- The field can have value as -1 for the audio files without bitrate metadata | [optional] 
**audio_source_id** | **int, none_type** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Note:- Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


