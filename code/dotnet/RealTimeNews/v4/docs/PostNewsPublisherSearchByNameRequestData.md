# FactSet.SDK.RealTimeNews.Model.PostNewsPublisherSearchByNameRequestData
The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**SearchValue** | **string** | Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive. | 
**MatchType** | **string** | The match type that is applied to the search. | Value | Description | | - -- | - -- | | begins | Publisher name must begin with the searchValue. | | ends | Publisher name must end with the searchValue. | | contains | Publisher name must begin, end, or contain the searchValue. |   | 
**Filter** | [**PostNewsPublisherSearchByNameRequestDataFilter**](PostNewsPublisherSearchByNameRequestDataFilter.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

