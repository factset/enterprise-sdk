# documentsdistributorcallstreetevents.EventsAudioHistoryData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**year** | **Number** | The year corresponding to the file containing historical audio recordings that can be downloaded via presigned url. | [optional] 
**trimmed** | **Boolean** | True  indicates that the pre-signed downloadable URL contains trimmed historical audio recordings and related metadata of a specific year.  False  indicates that the pre-signed downloadable URL contains untrimmed historical audio recordings and related metadata of a specific year. | [optional] 
**fileName** | **String** | The name of the file. | [optional] 
**fileSize** | **Number** | The size of the file, in bytes. | [optional] 
**url** | **String** | Pre-signed downloadable URL containing the historical audio recordings and related metadata of a specific year. The pre-signed URL in the response will expire after 3 hours. | [optional] 


