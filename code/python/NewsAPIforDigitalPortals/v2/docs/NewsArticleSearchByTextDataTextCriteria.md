# NewsArticleSearchByTextDataTextCriteria


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selection_type** | **str** | Specify how the criteria should be applied to the search. | [optional]  if omitted the server will use the default value of "include"
**phrases** | **[str]** | Phrases to be used in the criteria. | [optional] 
**minimum_match_score** | **float** | Minimum match score for words in the news article. | [optional]  if omitted the server will use the default value of 0.7
**scope** | **str** | Restrict fulltext search to specific scope. | [optional]  if omitted the server will use the default value of "all"
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


