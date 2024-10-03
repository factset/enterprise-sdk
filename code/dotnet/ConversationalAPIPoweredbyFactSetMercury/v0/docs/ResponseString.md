# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.ResponseString
Chat response to the query. Provides an answer to the question or references further attached data. `Value` property of parent FederationData contains a string with natural language. If the response text contains data citations for individual phrases, they will be included at the end of the phrase as `[ID]` where ID is an integer. The citation data will be mapped in the `citations` object, keyed by the citation ID. See the example `ResponseWithCitations` data for an example of how citations are referenced in the response. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | 
**Value** | **string** | String containing chat response to the query | 
**Citations** | **Dictionary&lt;string, List&lt;Phrase&gt;&gt;** | A map of citations, where the keys are the citation IDs and the values are the citation schema objects. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

