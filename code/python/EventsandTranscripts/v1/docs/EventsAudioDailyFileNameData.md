# EventsAudioDailyFileNameData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **int** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables. | [optional] 
**file_name** | **str** | The filename of the audio file. | [optional] 
**url** | **str** | A pre-signed URL that allows downloading the audio file, expiring after 24 hours. | [optional] 
**file_size** | **float** | Size of the Audio file, in bytes. | [optional] 
**audio_source_id** | **int, none_type** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null. | [optional] 
**ticker** | **str, none_type** | Ticker-region identifier for the company hosting the event. | [optional] 
**entity_id** | **str** | FactSet entity level identifier for the company hosting the event. | [optional] 
**source_code** | **str** | This parameter filters the results based on Source of the Audio file. Below are the descriptions for each Source Code - * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay | [optional] 
**trimmed** | **bool** |  The trimmed attribute indicates whether the audio is the trimmed version. If &#x60;sourceCode&#x60; is set to vendor, this attribute will always be true.     | [optional] 
**duration_secs** | **float, none_type** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds. | [optional] 
**start_offset_seconds** | **float, none_type** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call. | [optional] 
**end_offset_seconds** | **float, none_type** | The delta in seconds between startTime to when FactSet marks the end of the call. | [optional] 
**start_time** | **str, none_type** | The official timestamp when FactSet begins the recording. | [optional] 
**end_time** | **str, none_type** | The official timestamp when FactSet ends the recording. | [optional] 
**upload_time** | **str, none_type** | The official timestamp when FactSet publishes the audio file externally. | [optional] 
**sample_rate** | **float, none_type** | The number of samples of audio carried per second in Kbps. | [optional] 
**bitrate** | **float, none_type** | The total number of bits of information stored per second of sound in Kbps. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


