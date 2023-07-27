# FactSet.SDK.DocumentsDistributorCallStreetEvents.Model.EventsAudioHistoryData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Year** | **int** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned url. | [optional] 
**Trimmed** | **bool** | True  indicates that the pre-signed downloadable URL contains trimmed historical audio recordings and related metadata of a specific year.  False  indicates that the pre-signed downloadable URL contains untrimmed historical audio recordings and related metadata of a specific year. | [optional] 
**FileName** | **string** | The name of the file. | [optional] 
**FileSize** | **int** | The size of the file, in bytes. | [optional] 
**Url** | **string** | Pre-signed downloadable URL containing the historical audio recordings and related metadata of a specific year. The pre-signed URL in the response will expire after 3 hours. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

