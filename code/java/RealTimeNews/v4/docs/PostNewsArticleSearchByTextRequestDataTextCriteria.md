

# PostNewsArticleSearchByTextRequestDataTextCriteria


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) | Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |   |  [optional]
**phrases** | **java.util.List&lt;String&gt;** | Phrases to be used in the criteria. |  [optional]
**minimumMatchScore** | **BigDecimal** | Minimum match score for words in the news article. |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Restrict fulltext search to specific scope. | Value | Description | | --- | --- | | headline | Headline of the news article. | | body | Text body of the news article. | | all | Search in both headline and body. |   |  [optional]



## Enum: SelectionTypeEnum

Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;



## Enum: ScopeEnum

Name | Value
---- | -----
HEADLINE | &quot;headline&quot;
BODY | &quot;body&quot;
ALL | &quot;all&quot;


## Implemented Interfaces

* Serializable


