

# EventsAudioData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Download link for the audio file |  [optional]
**fileName** | **String** | The filename of the audio file |  [optional]
**durationSecs** | **BigDecimal** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds |  [optional]
**endOffsetSeconds** | **BigDecimal** | The delta in seconds between startTime to when FactSet marks the end of the call |  [optional]
**startOffsetSeconds** | **BigDecimal** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call |  [optional]
**sourceCode** | **String** | Identifies the method of how the event is recorded Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) |  [optional]
**startTime** | **String** | The official timestamp when FactSet begins the recording |  [optional]
**endTime** | **String** | The official timestamp when FactSet ends the recording |  [optional]
**uploadTime** | **String** | The official timestamp when FactSet publishes the audio file externally |  [optional]
**fileSize** | **BigDecimal** | Size of the Audio file, in bytes |  [optional]
**reportId** | **Integer** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event |  [optional]
**ticker** | **String** | Ticker-region identifier for the company hosting the event |  [optional]
**entityId** | **String** | Factset entity level identifier for the company hosting the event |  [optional]
**trimmed** | **Boolean** | The trimmed attribute helps identify if the audio is the trimmed version |  [optional]
**sampleRate** | **BigDecimal** | The number of samples of audio carried per second in Kbps |  [optional]
**bitrate** | **BigDecimal** | The total number of bits of information stored per second of sound in Kbps |  [optional]
**audioSourceId** | **Integer** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSource ids. |  [optional]


## Implemented Interfaces

* Serializable


