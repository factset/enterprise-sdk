# PostNewsPublisherSearchByNameRequestData

The data member contains the request's primary data.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**search_value** | **str** | Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive. | 
**match_type** | **str** | The match type that is applied to the search. | Value | Description | | --- | --- | | begins | Publisher name must begin with the searchValue. | | ends | Publisher name must end with the searchValue. | | contains | Publisher name must begin, end, or contain the searchValue. |   | 
**filter** | [**PostNewsPublisherSearchByNameRequestDataFilter**](PostNewsPublisherSearchByNameRequestDataFilter.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


