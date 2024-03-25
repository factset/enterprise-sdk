# HistoricalFileObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | File type: full or delta. | [optional] 
**bundle** | **str** | Bundle name. | [optional] 
**schema** | **str** | Schema name. | [optional] 
**version** | **str** | Full or delta file version. | [optional] 
**related_bundles** | [**[HistoricalFileObjectObject]**](HistoricalFileObjectObject.md) | Bundles related to the version number. | [optional] 
**timestamp** | **datetime** | Timestamp of when the bundle was generated. | [optional] 
**url** | **str** | Pre-signed URL pointing to the location from where the schema details can be downloaded. | [optional] 
**file_size** | **str** | File size of the particular bundle. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


