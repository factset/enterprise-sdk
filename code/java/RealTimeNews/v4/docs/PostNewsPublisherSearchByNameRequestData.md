

# PostNewsPublisherSearchByNameRequestData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**searchValue** | **String** | Restricts the search to publishers, which match the search value. The comparison for a match is case sensitive. | 
**matchType** | [**MatchTypeEnum**](#MatchTypeEnum) | The match type that is applied to the search. | Value | Description | | --- | --- | | begins | Publisher name must begin with the searchValue. | | ends | Publisher name must end with the searchValue. | | contains | Publisher name must begin, end, or contain the searchValue. |   | 
**filter** | [**PostNewsPublisherSearchByNameRequestDataFilter**](PostNewsPublisherSearchByNameRequestDataFilter.md) |  |  [optional]



## Enum: MatchTypeEnum

Name | Value
---- | -----
BEGINS | &quot;begins&quot;
ENDS | &quot;ends&quot;
CONTAINS | &quot;contains&quot;


## Implemented Interfaces

* Serializable


