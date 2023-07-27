# EventsAudioHistoryData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **int** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned url. | [optional] 
**trimmed** | **bool** | True  indicates that the pre-signed downloadable URL contains trimmed historical audio recordings and related metadata of a specific year.  False  indicates that the pre-signed downloadable URL contains untrimmed historical audio recordings and related metadata of a specific year. | [optional] 
**file_name** | **str** | The name of the file. | [optional] 
**file_size** | **int** | The size of the file, in bytes. | [optional] 
**url** | **str** | Pre-signed downloadable URL containing the historical audio recordings and related metadata of a specific year. The pre-signed URL in the response will expire after 3 hours. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


