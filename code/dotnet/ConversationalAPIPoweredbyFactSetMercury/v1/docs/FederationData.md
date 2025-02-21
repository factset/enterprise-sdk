# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.FederationData
Data surfaced by processing the query through FactSet Mercury. Contains financial data, if accessible and available, as well as natural language answer to the query

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | 
**Value** | [**List&lt;PromptItem&gt;**](PromptItem.md) | List of suggested prompts | 
**Citations** | **Dictionary&lt;string, List&lt;Phrase&gt;&gt;** | A map of citations, where the keys are the citation IDs and the values are the citation schema objects. | [optional] 
**Metadata** | [**MarkdownTableMetadata**](MarkdownTableMetadata.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

