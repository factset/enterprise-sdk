# IndexedNrtResponseData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**snippet_end_timestamp** | **datetime** | The snippet end time is calculated based off the endTime in the snippetData section and the recordingStartTime from the calls endpoint. | [optional] 
**snippet_sequence** | **int** | The sequence number of the snippet from the start of the current call. | [optional] 
**audio_source_id** | **int** | The Unique ID for an Internal recording specific to reportID. For example, ReportID X would have multiple recordings from a different source (dial-in or webcast). One ReportID can have multiple audioSourceIDs. | [optional] 
**transcript_data** | **[bool, date, datetime, dict, float, int, list, str, none_type]** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


