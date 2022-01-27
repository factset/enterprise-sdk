# FactSet.SDK.FactSetNER.Model.Input

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Text** | **string** | Input-text (plain text (preferred) or HTML-formatted) of document to extract named-entities from. | 
**CharacterOffset** | **int** | Offset to add to the returned named entity positions; useful if the given text input is not from the beginning of the original document. | [optional] 
**IdType** | **string** | Format of the Ids to return for the extracted named entities. | [optional] [default to IdTypeEnum.Iconum]
**FilterTagsWithoutId** | **bool** | Boolean flag, set True [False] to [not] drop named entities for which a matching Id could not be found. | [optional] [default to true]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

