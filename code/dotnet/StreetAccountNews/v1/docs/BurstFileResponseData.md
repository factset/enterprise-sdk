# FactSet.SDK.StreetAccountNews.Model.BurstFileResponseData
Response data containing burst file metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**BurstDateTime** | **DateTime** | Timestamp in ISO 8601 format (UTC). | [optional] 
**DownloadUrl** | **string** | Opaque URL to download the burst file. Contains a short-lived token unique to this burst. Issue a GET to this URL to receive an HTTP 302 redirect to the file. Valid for 5 minutes.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

