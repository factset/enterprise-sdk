# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.SuggestedPrompts
A list of follow-up prompts generated by FactSet Mercury that may be relevant to the current user prompt. These prompts can be used to guide the user to ask more specific questions or to provide additional context to the user.  SuggestedPrompts may include a FactSet Mercury generated template and prompt parameters to create a new prompt programmatically.   If a user would like to ask a follow-up question from SuggestedPrompts, send the follow-up prompt to the Conversational API `/query` endpoint with your chat ID and continue the conversation chain. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Type** | **string** | Datatype contained in this data object | 
**Value** | [**List&lt;PromptItem&gt;**](PromptItem.md) | List of suggested prompts | 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

