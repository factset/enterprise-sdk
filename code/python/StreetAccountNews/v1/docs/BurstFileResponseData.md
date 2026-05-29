# BurstFileResponseData

Response data containing burst file metadata.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**burst_date_time** | **datetime** | Timestamp in ISO 8601 format (UTC). | [optional] 
**download_url** | **str** | Opaque URL to download the burst file. Contains a short-lived token unique to this burst. Issue a GET to this URL to receive an HTTP 302 redirect to the file. Valid for 5 minutes.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


