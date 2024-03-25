# FactSet.SDK.StandardDatafeed.Model.ListFileObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | File type: full or delta. | [optional] 
**Bundle** | **string** | Bundle name. | [optional] 
**Schema** | **string** | Schema name. | [optional] 
**_Version** | **string** | Full or delta file version. | [optional] 
**RelatedBundles** | [**List&lt;ListFileObjectObject&gt;**](ListFileObjectObject.md) | Bundles related to the version number. | [optional] 
**Timestamp** | **DateTime** | Timestamp of when the bundle was generated. | [optional] 
**Url** | **string** | Pre-signed URL pointing to the location from where the schema details can be downloaded. | [optional] 
**FileSize** | **string** | File size of the particular bundle. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

