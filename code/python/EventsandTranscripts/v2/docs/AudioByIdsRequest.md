# AudioByIdsRequest

Search criteria for audio files based on report and audio source IDs.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**report_id** | **int** | Unique identifier for the event transcript/audio. | [optional] 
**audio_source_id** | **int** | Unique ID for the specific internal recording for the reportId. | [optional] 
**is_latest** | **bool** | Search for latest audio file. | [optional]  if omitted the server will use the default value of False
**trimmed** | **bool** | Search for trimmed audio files. | [optional]  if omitted the server will use the default value of False
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


