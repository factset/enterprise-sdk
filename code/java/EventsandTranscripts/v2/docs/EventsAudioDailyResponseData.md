

# EventsAudioDailyResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reportId** | **Integer** | The unique ID of the audio file for an event. The same ID is used for the transcript of the same event. This report ID can also be used to map to the Event details in SDF tables. |  [optional]
**fileName** | **String** | The filename of the audio file. |  [optional]
**url** | **String** | A pre-signed URL that allows downloading the audio file, expiring after 24 hours. |  [optional]
**fileSize** | **BigDecimal** | Size of the Audio file, in bytes. |  [optional]
**audioSourceId** | **Integer** | Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from different source (Phone or Webcast or Vendor or Replay). One ReportID can have multiple AudioSourceIDs.  The audioSourceId identifier is available for audio calls since November 29, 2022. Only un-trimmed audio files contain an audioSourceId value. All the vendor and trimmed audio files will have an audioSourceId value of null. |  [optional]
**ticker** | **String** | Ticker-region identifier for the company hosting the event. |  [optional]
**entityId** | **String** | FactSet entity level identifier for the company hosting the event. |  [optional]
**audioSource** | [**AudioSourceEnum**](#AudioSourceEnum) | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay |  [optional]
**trimmed** | **Boolean** | The trimmed attribute indicates whether the audio is a trimmed version.   - If **true**, the audio has been trimmed.   - If **false**, the full-length version is used.   Note: If &#x60;audioSource&#x60; is set to &#x60;vendor&#x60;, this attribute will always be true.  |  [optional]
**durationSecs** | **BigDecimal** | Total duration of the recording in seconds based on startOffsetSeconds to endOffsetSeconds. |  [optional]
**startOffsetSeconds** | **BigDecimal** | The delta in seconds between start of audio file to when FactSet marks the beginning of the call. |  [optional]
**endOffsetSeconds** | **BigDecimal** | The delta in seconds between startTime to when FactSet marks the end of the call. |  [optional]
**startTime** | **OffsetDateTime** | The official timestamp when FactSet begins the recording. |  [optional]
**endTime** | **OffsetDateTime** | The official timestamp when FactSet ends the recording. |  [optional]
**uploadTime** | **OffsetDateTime** | The official timestamp when FactSet publishes the audio file externally. |  [optional]
**sampleRate** | **BigDecimal** | The number of samples of audio carried per second in Kbps. |  [optional]
**bitrate** | **BigDecimal** | The total number of bits of information stored per second of sound in Kbps. |  [optional]



## Enum: AudioSourceEnum

Name | Value
---- | -----
PHONE | &quot;Phone&quot;
WEBCAST | &quot;Webcast&quot;
VENDOR | &quot;Vendor&quot;
WEBCASTREPLAY | &quot;WebcastReplay&quot;
FLASH | &quot;Flash&quot;
REPLAY | &quot;Replay&quot;


## Implemented Interfaces

* Serializable


