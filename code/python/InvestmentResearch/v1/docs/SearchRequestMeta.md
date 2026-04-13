# SearchRequestMeta

meta object

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**SearchRequestMetaPagination**](SearchRequestMetaPagination.md) |  | [optional] 
**sort** | **[str]** | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  &#x60;-storyDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *  &#x60; storyDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.        type: array  | [optional]  if omitted the server will use the default value of ["-storyDateTime"]
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


