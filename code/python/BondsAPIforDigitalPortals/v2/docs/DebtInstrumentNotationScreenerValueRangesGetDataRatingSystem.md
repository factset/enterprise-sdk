# DebtInstrumentNotationScreenerValueRangesGetDataRatingSystem

Rating system. The parameter allows to specify the rating system (up to two) from which the available ratings of the restricted set of debt instruments are retrieved without limiting the debt instrument selection to only debt instruments with a rating in that rating system.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**ids** | **[float]** | List of identifiers of rating systems. The sequence of the provided identifiers corresponds to the response attributes &#x60;ratingSystem1&#x60; and &#x60;ratingSystem2&#x60; respectively, i.e. the rating grades of the selected debt instruments in the rating system of which the first identifier in the provided list is a member, is represented by the attribute &#x60;ratingSystem1.rating.grade&#x60; (and &#x60;ratingSystem1.rating.id&#x60; for the identifier of the rating grade). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


