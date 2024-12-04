

# PostNewsArticleSearchByTextDataCriteriaItems

A list of objects. For semantical context see the description of the parent array.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selectionType** | [**SelectionTypeEnum**](#SelectionTypeEnum) | Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |   |  [optional]
**range** | [**PostNewsArticleListByInstrumentRequestDataFilterRange**](PostNewsArticleListByInstrumentRequestDataFilterRange.md) |  |  [optional]
**indices** | [**PostNewsArticleSearchByTextDataCriteriaItemsIndices**](PostNewsArticleSearchByTextDataCriteriaItemsIndices.md) |  |  [optional]
**instruments** | [**PostNewsArticleSearchByTextDataCriteriaItemsInstruments**](PostNewsArticleSearchByTextDataCriteriaItemsInstruments.md) |  |  [optional]
**types** | [**PostNewsArticleSearchByTextDataCriteriaItemsTypes**](PostNewsArticleSearchByTextDataCriteriaItemsTypes.md) |  |  [optional]
**categories** | [**PostNewsArticleSearchByTextDataCriteriaItemsCategories**](PostNewsArticleSearchByTextDataCriteriaItemsCategories.md) |  |  [optional]
**regions** | [**PostNewsArticleSearchByTextDataCriteriaItemsRegions**](PostNewsArticleSearchByTextDataCriteriaItemsRegions.md) |  |  [optional]
**distributor** | [**PostNewsArticleSearchByTextDataCriteriaItemsDistributor**](PostNewsArticleSearchByTextDataCriteriaItemsDistributor.md) |  |  [optional]
**publisher** | [**PostNewsArticleSearchByTextDataCriteriaItemsPublisher**](PostNewsArticleSearchByTextDataCriteriaItemsPublisher.md) |  |  [optional]
**language** | [**PostNewsArticleSearchByTextDataCriteriaItemsLanguage**](PostNewsArticleSearchByTextDataCriteriaItemsLanguage.md) |  |  [optional]



## Enum: SelectionTypeEnum

Name | Value
---- | -----
INCLUDE | &quot;include&quot;
EXCLUDE | &quot;exclude&quot;


## Implemented Interfaces

* Serializable


