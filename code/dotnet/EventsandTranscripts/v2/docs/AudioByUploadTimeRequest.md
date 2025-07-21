# FactSet.SDK.EventsandTranscripts.Model.AudioByUploadTimeRequest
Search criteria for audio files based on upload time.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**UploadTime** | **int** | Filter data based on uploadTime relative to the current time, in hours (e.g., -15 for the last 15 hours). Minimum -1, Maximum -168.  | [optional] 
**AudioSource** | **string** | Source of the Audio file: * Phone &#x3D; Originated from phone call * Webcast &#x3D; Originated from a webcast * Vendor &#x3D; Received from vendor * WebcastReplay &#x3D; Replay of a webcast * Flash &#x3D; Identical to webcast; can merge with \&quot;Webcast\&quot; in the future * Replay &#x3D; Phone replay           | [optional] 
**Ids** | **List&lt;string&gt;** | Filter results based on ticker-region or Entity ID. | [optional] 
**Trimmed** | **bool** | Search for trimmed audio files (non-speaking portions removed). | [optional] [default to false]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

