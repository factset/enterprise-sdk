# Phrase

A single source for the current data item. Contains data excerpt, various citation information, and Document Viewer URL. If the citation is from a transcript, the information of the person who spoke the phrase is included as `speakerInfo`.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**phrase_id** | **str** | The unique identifier for the citation phrase in the source document. | 
**content** | **str** | Highlighted content of the citation source from which the response was generated. Commonly a document excerpt identified as the source of the data | 
**source_url** | **str** | The URL of the source document in FactSet&#39;s Document Viewer (see [Document Viewer OA page](https://my.apps.factset.com/oa/pages/17390)). If available, the URL will directly link to the excerpted content highlighted within the document. | 
**source_title** | **str** | The title of the citation&#39;s source document. | 
**source_date** | **date** | The date the citation&#39;s source document was published, represented per ISO 8601 guideline (YYYY-MM-DD). | 
**speaker_info** | [**SpeakerInfo**](SpeakerInfo.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


