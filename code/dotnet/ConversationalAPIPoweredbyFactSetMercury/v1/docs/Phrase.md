# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.Phrase
A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as `speakerInfo`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**PhraseId** | **Guid** | The unique identifier for the citation phrase in the source document. | 
**Content** | **string** | Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data | 
**SourceURL** | **string** | The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document. | 
**SourceTitle** | **string** | The title of the citation&#39;s source document. | 
**SourceDate** | **DateTime** | The date the citation&#39;s source document was published, represented per ISO 8601 guideline (YYYY-MM-DD). | 
**SpeakerInfo** | [**SpeakerInfo**](SpeakerInfo.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

