

# NewsArticleSearchByTextDataTextCriteria



## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) | Specify how the criteria should be applied to the search. |  [optional]
**phrases** | **java.util.List&lt;String&gt;** | Phrases to be used in the criteria. |  [optional]
**minimumMatchScore** | **BigDecimal** | Minimum match score for words in the news article. |  [optional]
**scope** | [**ScopeEnum**](#ScopeEnum) | Restrict fulltext search to specific scope. |  [optional]



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


