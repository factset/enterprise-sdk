# FactSet.SDK.StandardDatafeed.Model.Dataresponseitems
Array of data objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | file type, full or delta | [optional] 
**Bundle** | **string** | bundle name  QFL:- For QFL its Factor Group name | [optional] 
**Schema** | **string** | schema name  QFL:- In case of QFL its always qfl_v1 | [optional] 
**Sequence** | **string** | full or delta file sequence | [optional] 
**RelatedBundles** | [**List&lt;DataresponseitemsRelatedBundles&gt;**](DataresponseitemsRelatedBundles.md) | bundles related to the sequence number | [optional] 
**Timestamp** | **string** | time stamp of when the bundle was generated | [optional] 
**Url** | **string** | pre-signed downloadable url, containing the bundle information | [optional] 
**FileSize** | **string** | file size of the particular bundle | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

