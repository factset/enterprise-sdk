# FactSet.SDK.EventsandTranscripts.Model.EventsAudioHistoryResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Year** | **int** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned URL. | [optional] 
**Trimmed** | **bool** | true - it signifies that the pre-signed URL for downloading includes trimmed historical audio recordings along with their metadata for a specific year.  false -  it signifies that the pre-signed URL for downloading contains the untrimmed historical audio recordings along with their relevant metadata for a specific year. | [optional] 
**FileName** | **string** | The name of the archive file. | [optional] 
**FileSize** | **long** | The size of the archive file, in bytes. | [optional] 
**FileCount** | **long** | The number of files included in the archive. | [optional] 
**Url** | **string** | A pre-signed URL for downloading historical audio recordings and related metadata of a specific year. The URL provided in the response will expire after 3 hours. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

