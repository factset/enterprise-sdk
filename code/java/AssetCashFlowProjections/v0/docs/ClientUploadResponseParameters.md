

# ClientUploadResponseParameters

Client upload status response parameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**uploadId** | **String** | Unique Identifier for the file |  [optional]
**fileName** | **String** | Actuarial Scenario file name |  [optional]
**signedUrl** | **String** | Signed url to upload the scenarios file |  [optional]
**expirationTime** | **OffsetDateTime** | The signed URL remains valid for a duration of 4 hours and is usable until it becomes invalid or outdated. |  [optional]


## Implemented Interfaces

* Serializable


