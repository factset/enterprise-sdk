# FactSet.SDK.ConversationalAPIPoweredbyFactSetMercury.Model.FeedbackRequestData
Data object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ResponseId** | **Guid** | Response ID received from the &#x60;/result&#x60; endpoint, representing the response for which you are providing feedback. | 
**Helpful** | **bool** | Boolean representing whether the response was helpful (true) or not helpful (false). If the response left out any requested information, please mark as not helpful. | 
**Comment** | **string** | Optional field for additional feedback. If you would like to provide natural language feedback, include comments here. Comments are limited to 4000 characters; if you need to provide more feedback, please reach out to your FactSet Support Team representative.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

