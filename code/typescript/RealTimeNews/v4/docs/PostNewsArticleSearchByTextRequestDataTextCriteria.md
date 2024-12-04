# realtimenews.PostNewsArticleSearchByTextRequestDataTextCriteria

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectionType** | **String** | Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |   | [optional] [default to &#39;include&#39;]
**phrases** | **[String]** | Phrases to be used in the criteria. | [optional] 
**minimumMatchScore** | **Number** | Minimum match score for words in the news article. | [optional] [default to 0.7]
**scope** | **String** | Restrict fulltext search to specific scope. | Value | Description | | --- | --- | | headline | Headline of the news article. | | body | Text body of the news article. | | all | Search in both headline and body. |   | [optional] [default to &#39;all&#39;]



## Enum: SelectionTypeEnum


* `include` (value: `"include"`)

* `exclude` (value: `"exclude"`)





## Enum: ScopeEnum


* `headline` (value: `"headline"`)

* `body` (value: `"body"`)

* `all` (value: `"all"`)




