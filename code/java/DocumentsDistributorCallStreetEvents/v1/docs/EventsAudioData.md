

# EventsAudioData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**url** | **String** | Download link for the audio file. |  [optional]
**fileName** | **String** | The filename of the audio file. |  [optional]
**durationSecs** | **BigDecimal** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds. |  [optional]
**endOffsetSeconds** | **BigDecimal** | The delta in seconds between startTime to when FactSet marks the end of the call. |  [optional]
**startOffsetSeconds** | **BigDecimal** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call. |  [optional]
**sourceCode** | **String** | Identifies the method of how the event is recorded Below are the descriptions for each Source Code - * P &#x3D; Phone * W &#x3D; Webcast * V &#x3D; Vendor * I &#x3D; Webcast Replay * F &#x3D; Flash - identical to webcast; can merge with \&quot;W\&quot; in the future * R &#x3D; Replay (Phone Replay) |  [optional]
**startTime** | **String** | The official timestamp when FactSet begins the recording.  Note:- All the vendor and trimmed files would have default 1900-0101T00:00:00Z time stamp. |  [optional]
**endTime** | **String** | The official timestamp when FactSet ends the recording.  Note:- All the vendor and trimmed files would have default 1900-0101T00:00:00Z time stamp. |  [optional]
**uploadTime** | **String** | The official timestamp when FactSet publishes the audio file externally. |  [optional]
**fileSize** | **BigDecimal** | Size of the Audio file, in bytes. |  [optional]
**reportId** | **Integer** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables. |  [optional]
**ticker** | **String** | Ticker-region identifier for the company hosting the event.  Note:- This field can have N/A value when the company is a private(non-equity company) |  [optional]
**entityId** | **String** | Factset entity level identifier for the company hosting the event. |  [optional]
**trimmed** | **Boolean** | The trimmed attribute helps identify if the audio is the trimmed version. Note:- All the vendor generated files are trimmed regardless of the ‘trimmed’ attribute value in the response. |  [optional]
**sampleRate** | **BigDecimal** | The number of samples of audio carried per second in Kbps.  Note:- The field can have value as -1 for the audio files without sampleRate metadata |  [optional]
**bitrate** | **BigDecimal** | The total number of bits of information stored per second of sound in Kbps.  Note:- The field can have value as -1 for the audio files without bitrate metadata |  [optional]
**audioSourceId** | **Integer** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Note:- Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null. |  [optional]


## Implemented Interfaces

* Serializable


