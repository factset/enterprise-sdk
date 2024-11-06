

# Download

Action containing a file ID to download a file associated with the response. Files will be available for download from the `/download/file` endpoint for 24 hours after generation.  If there was an error while generating the downloadable file, it will be detailed in the `error` field for the specific download action. Please reach out to your FactSet Support Team representative if you are seeing this error persistently.  

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | Type of action | 
**name** | **String** | Name of the download type | 
**label** | **String** | Label associated with the download | 
**category** | **String** | Category of associated file |  [optional]
**location** | [**LocationEnum**](#LocationEnum) | Endpoint where file can be found |  [optional]
**fileId** | **java.util.UUID** | Id of associated file |  [optional]
**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | ContentType of associated file |  [optional]
**fileName** | **String** | Name of associated file |  [optional]
**error** | [**FileGenerationErrorObject**](FileGenerationErrorObject.md) |  | 



## Enum: ActionEnum

Name | Value
---- | -----
DOWNLOAD | &quot;Download&quot;



## Enum: LocationEnum

Name | Value
---- | -----
_DOWNLOAD_FILE | &quot;/download/file&quot;



## Enum: ContentTypeEnum

Name | Value
---- | -----
APPLICATION_VND_OPENXMLFORMATS_OFFICEDOCUMENT_SPREADSHEETML_SHEET | &quot;application/vnd.openxmlformats-officedocument.spreadsheetml.sheet&quot;


## Implemented Interfaces

* Serializable


