# ListFileObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **int** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL. | [optional] 
**trimmed** | **bool** | True  it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  False  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year. | [optional] 
**file_name** | **str** | The name of the file. | [optional] 
**file_size** | **int** | The size of the file, in bytes. | [optional] 
**file_count** | **int** | The count of the files. | [optional] 
**url** | **str** | A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


