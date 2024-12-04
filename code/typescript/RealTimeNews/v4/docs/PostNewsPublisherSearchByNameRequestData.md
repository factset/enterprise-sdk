# realtimenews.PostNewsPublisherSearchByNameRequestData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchValue** | **String** | Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive. | 
**matchType** | **String** | The match type that is applied to the search. | Value | Description | | --- | --- | | begins | Publisher name must begin with the searchValue. | | ends | Publisher name must end with the searchValue. | | contains | Publisher name must begin, end, or contain the searchValue. |   | 
**filter** | [**PostNewsPublisherSearchByNameRequestDataFilter**](PostNewsPublisherSearchByNameRequestDataFilter.md) |  | [optional] 



## Enum: MatchTypeEnum


* `begins` (value: `"begins"`)

* `ends` (value: `"ends"`)

* `contains` (value: `"contains"`)




