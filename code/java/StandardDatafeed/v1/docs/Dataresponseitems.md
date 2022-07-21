

# Dataresponseitems

Array of data objects

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**type** | **String** | file type, full or delta |  [optional]
**bundle** | **String** | bundle name  QFL:- For QFL its Factor Group name |  [optional]
**schema** | **String** | schema name  QFL:- In case of QFL its always qfl_v1 |  [optional]
**sequence** | **String** | full or delta file sequence |  [optional]
**relatedBundles** | [**java.util.List&lt;DataresponseitemsRelatedBundles&gt;**](DataresponseitemsRelatedBundles.md) | bundles related to the sequence number |  [optional]
**timestamp** | **String** | time stamp of when the bundle was generated |  [optional]
**url** | **String** | pre-signed downloadable url, containing the bundle information |  [optional]
**fileSize** | **String** | file size of the particular bundle |  [optional]


## Implemented Interfaces

* Serializable


