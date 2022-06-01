# SnapshotRequest


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | [**OptionIds**](OptionIds.md) |  | 
**date** | **str** | The as of date for the option chain in **YYYY-MM-DD** format. If left blank, the API will default to previous close. Future dates (T+1) are not accepted in this endpoint. | [optional] 
**currency** | **str** | The ISO3 currency control for the requested option identifier. For a list of Currency ISOs, visit - [OA 1470](https://my.apps.factset.com/oa/pages/1470)  | [optional] 
**calendar** | [**Calendar**](Calendar.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


