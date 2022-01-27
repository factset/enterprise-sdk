# Input


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**text** | **str** | Input-text (plain text (preferred) or HTML-formatted) of document to extract named-entities from. | 
**character_offset** | **int** | Offset to add to the returned named entity positions; useful if the given text input is not from the beginning of the original document. | [optional] 
**id_type** | **str** | Format of the Ids to return for the extracted named entities. | [optional]  if omitted the server will use the default value of "iconum"
**filter_tags_without_id** | **bool** | Boolean flag, set True [False] to [not] drop named entities for which a matching Id could not be found. | [optional]  if omitted the server will use the default value of True
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


