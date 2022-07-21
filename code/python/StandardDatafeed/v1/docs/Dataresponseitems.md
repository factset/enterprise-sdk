# Dataresponseitems

Array of data objects

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **str** | file type, full or delta | [optional] 
**bundle** | **str** | bundle name  QFL:- For QFL its Factor Group name | [optional] 
**schema** | **str** | schema name  QFL:- In case of QFL its always qfl_v1 | [optional] 
**sequence** | **str** | full or delta file sequence | [optional] 
**related_bundles** | [**[DataresponseitemsRelatedBundles]**](DataresponseitemsRelatedBundles.md) | bundles related to the sequence number | [optional] 
**timestamp** | **str** | time stamp of when the bundle was generated | [optional] 
**url** | **str** | pre-signed downloadable url, containing the bundle information | [optional] 
**file_size** | **str** | file size of the particular bundle | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


