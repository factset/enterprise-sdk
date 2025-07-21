

# EventsAudioHistoryResponseData


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Integer** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL. |  [optional]
**trimmed** | **Boolean** | true - it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  false -  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year. |  [optional]
**fileName** | **String** | The name of the archive file. |  [optional]
**fileSize** | **Long** | The size of the archive file, in bytes. |  [optional]
**fileCount** | **Long** | The number of files included in the archive. |  [optional]
**url** | **String** | A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours. |  [optional]


## Implemented Interfaces

* Serializable


