# DebtInstrumentNotationScreenerValueRangesGetDataRating

Parameters related to a rating of a debt instrument. If a rating system is not selected by either specifying it directly (see parameter `rating.system.ids`) or by implying it via the minimum rating grade (see parameter `rating.grade.minimum.ids`) the result contains no data on ratings.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**system** | [**DebtInstrumentNotationScreenerValueRangesGetDataRatingSystem**](DebtInstrumentNotationScreenerValueRangesGetDataRatingSystem.md) |  | [optional] 
**grade** | [**DebtInstrumentNotationScreenerSearchDataRatingGrade**](DebtInstrumentNotationScreenerSearchDataRatingGrade.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


