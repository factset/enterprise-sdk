

# Download

Directive to download a file. The `error` field specifies if there was an error generating the specific downloadable file; if an error occurred, the `errorMessage` field will detail the error. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | [**ActionEnum**](#ActionEnum) | Type of action |  [optional]
**name** | **String** | Name of the download type |  [optional]
**label** | **String** | Label associated with the download |  [optional]
**category** | **String** | Category of associated file |  [optional]
**location** | [**LocationEnum**](#LocationEnum) | Endpoint where file can be found |  [optional]
**fileId** | **java.util.UUID** | Id of associated file |  [optional]
**contentType** | **String** | ContentType of associated file |  [optional]
**fileName** | **String** | Name of associated file |  [optional]
**error** | **Boolean** | Boolean representing if there was an error generating the downloadable file | 
**errorMessage** | **String** | Error message detailing the error in generating the downloadable file |  [optional]



## Enum: ActionEnum

Name | Value
---- | -----
DOWNLOAD | &quot;Download&quot;



## Enum: LocationEnum

Name | Value
---- | -----
_DOWNLOAD_FILE | &quot;/download/file&quot;


## Implemented Interfaces

* Serializable


