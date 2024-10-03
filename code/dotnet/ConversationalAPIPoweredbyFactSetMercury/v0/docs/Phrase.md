# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Phrase
A single source for the current data item. Contains data excerpt and Document Viewer URL.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PhraseId** | **Guid** | The unique identifier for the citation phrase in the source document. | 
**Content** | **string** | Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data | 
**SourceURL** | **string** | The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). Please note that this URL is for the entire document; you will need to search for the specific phrase within the document. Future release plans include linking directly to the highlighted excerpt within the document. | 
**SpeakerInfo** | [**SpeakerInfo**](SpeakerInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

