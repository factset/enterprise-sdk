# PostNewsArticleSearchByTextDataCriteriaItems

A list of objects. For semantical context see the description of the parent array.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**selection_type** | **str** | Specify how the criteria should be applied to the search. | Value | Description | | --- | --- | | include | Articles covering the given criteria are included in the result. | | exclude | Articles covering the given criteria are excluded from the result. |   | [optional]  if omitted the server will use the default value of "include"
**range** | [**PostNewsArticleListByInstrumentRequestDataFilterRange**](PostNewsArticleListByInstrumentRequestDataFilterRange.md) |  | [optional] 
**indices** | [**PostNewsArticleSearchByTextDataCriteriaItemsIndices**](PostNewsArticleSearchByTextDataCriteriaItemsIndices.md) |  | [optional] 
**instruments** | [**PostNewsArticleSearchByTextDataCriteriaItemsInstruments**](PostNewsArticleSearchByTextDataCriteriaItemsInstruments.md) |  | [optional] 
**types** | [**PostNewsArticleSearchByTextDataCriteriaItemsTypes**](PostNewsArticleSearchByTextDataCriteriaItemsTypes.md) |  | [optional] 
**categories** | [**PostNewsArticleSearchByTextDataCriteriaItemsCategories**](PostNewsArticleSearchByTextDataCriteriaItemsCategories.md) |  | [optional] 
**regions** | [**PostNewsArticleSearchByTextDataCriteriaItemsRegions**](PostNewsArticleSearchByTextDataCriteriaItemsRegions.md) |  | [optional] 
**distributor** | [**PostNewsArticleSearchByTextDataCriteriaItemsDistributor**](PostNewsArticleSearchByTextDataCriteriaItemsDistributor.md) |  | [optional] 
**publisher** | [**PostNewsArticleSearchByTextDataCriteriaItemsPublisher**](PostNewsArticleSearchByTextDataCriteriaItemsPublisher.md) |  | [optional] 
**language** | [**PostNewsArticleSearchByTextDataCriteriaItemsLanguage**](PostNewsArticleSearchByTextDataCriteriaItemsLanguage.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


