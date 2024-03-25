# standarddatafeed.HistoricalFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | File type: full or delta. | [optional] 
**bundle** | **String** | Bundle name. | [optional] 
**schema** | **String** | Schema name. | [optional] 
**version** | **String** | Full or delta file version. | [optional] 
**relatedBundles** | [**[HistoricalFileObjectObject]**](HistoricalFileObjectObject.md) | Bundles related to the version number. | [optional] 
**timestamp** | **Date** | Timestamp of when the bundle was generated. | [optional] 
**url** | **String** | Pre-signed URL pointing to the location from where the schema details can be downloaded. | [optional] 
**fileSize** | **String** | File size of the particular bundle. | [optional] 


