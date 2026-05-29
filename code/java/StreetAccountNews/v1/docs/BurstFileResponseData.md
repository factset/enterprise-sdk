

# BurstFileResponseData

Response data containing burst file metadata.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**burstDateTime** | **OffsetDateTime** | Timestamp in ISO 8601 format (UTC). |  [optional]
**downloadUrl** | **String** | Opaque URL to download the burst file. Contains a short-lived token unique to this burst. Issue a GET to this URL to receive an HTTP 302 redirect to the file. Valid for 5 minutes.  |  [optional]


## Implemented Interfaces

* Serializable


