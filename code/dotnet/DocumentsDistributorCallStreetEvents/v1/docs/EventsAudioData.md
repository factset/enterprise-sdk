# FactSet.SDK.DocumentsDistributorCallStreetEvents.Model.EventsAudioData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Url** | **string** | Download link for the audio file | [optional] 
**FileName** | **string** | The filename of the audio file | [optional] 
**DurationSecs** | **decimal** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds | [optional] 
**EndOffsetSeconds** | **decimal** | The delta in seconds between startTime to when FactSet marks the end of the call | [optional] 
**StartOffsetSeconds** | **decimal** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call | [optional] 
**SourceCode** | **string** | Identifies the method of how the event is recorded Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) | [optional] 
**StartTime** | **string** | The official timestamp when FactSet begins the recording | [optional] 
**EndTime** | **string** | The official timestamp when FactSet ends the recording | [optional] 
**UploadTime** | **string** | The official timestamp when FactSet publishes the audio file externally | [optional] 
**FileSize** | **decimal** | Size of the Audio file, in bytes | [optional] 
**ReportId** | **int** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event | [optional] 
**Ticker** | **string** | Ticker-region identifier for the company hosting the event | [optional] 
**EntityId** | **string** | Factset entity level identifier for the company hosting the event | [optional] 
**Trimmed** | **bool** | The trimmed attribute helps identify if the audio is the trimmed version | [optional] 
**SampleRate** | **decimal** | The number of samples of audio carried per second in Kbps | [optional] 
**Bitrate** | **decimal** | The total number of bits of information stored per second of sound in Kbps | [optional] 
**AudioSourceId** | **int** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSource ids. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

