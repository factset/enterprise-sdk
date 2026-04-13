# FactSet.SDK.InvestmentResearch.Model.SearchRequestMeta
meta object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Pagination** | [**SearchRequestMetaPagination**](SearchRequestMetaPagination.md) |  | [optional] 
**Sort** | **List&lt;string&gt;** | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  &#x60;-storyDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *  &#x60; storyDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.        type: array  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

