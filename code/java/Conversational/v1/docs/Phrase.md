

# Phrase

A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as `speakerInfo`.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phraseId** | **java.util.UUID** | The unique identifier for the citation phrase in the source document. | 
**content** | **String** | Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data | 
**sourceURL** | **String** | The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document. | 
**sourceTitle** | **String** | The title of the citation&#39;s source document. | 
**sourceDate** | **LocalDate** | The date the citation&#39;s source document was published, represented per ISO 8601 guideline (YYYY-MM-DD). | 
**speakerInfo** | [**SpeakerInfo**](SpeakerInfo.md) |  |  [optional]


## Implemented Interfaces

* Serializable


