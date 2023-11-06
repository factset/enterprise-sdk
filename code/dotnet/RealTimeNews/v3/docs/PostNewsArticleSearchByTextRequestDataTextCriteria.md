# FactSet.SDK.RealTimeNews.Model.PostNewsArticleSearchByTextRequestDataTextCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SelectionType** | **string** | Specify how the criteria should be applied to the search. | [optional] [default to SelectionTypeEnum.Include]
**Phrases** | **List&lt;string&gt;** | Phrases to be used in the criteria. | [optional] 
**MinimumMatchScore** | **decimal** | Minimum match score for words in the news article. | [optional] [default to 0.7M]
**Scope** | **string** | Restrict fulltext search to specific scope. | [optional] [default to ScopeEnum.All]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

