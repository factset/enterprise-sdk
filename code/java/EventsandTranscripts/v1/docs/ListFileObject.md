

# ListFileObject


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Integer** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL. |  [optional]
**trimmed** | **Boolean** | True  it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  False  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year. |  [optional]
**fileName** | **String** | The name of the file. |  [optional]
**fileSize** | **Integer** | The size of the file, in bytes. |  [optional]
**fileCount** | **Integer** | The count of the files. |  [optional]
**url** | **String** | A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours. |  [optional]


## Implemented Interfaces

* Serializable


