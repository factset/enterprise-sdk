# StatisticsResponseData

Aggregate statistics for a given field within the specified content sets.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **float** | The minimum value of the field. | [optional] 
**maximum** | **float** | The maximum value of the field. | [optional] 
**average** | **float** | The average value of the field. | [optional] 
**sum** | **float** | The sum of the field values. | [optional] 
**count** | **int** | The number of records. | [optional] 
**median** | **float** | The median value of the field. | [optional] 
**std_dev** | **float** | The standard deviation of the field values. | [optional] 
**histogram** | [**[HistogramData]**](HistogramData.md) | The histogram of the field values. The histogram is an array of 10 bins, each bin containing the minimum, maximum, and count of records in that bin. The bins are equally spaced between the minimum and maximum values of the field. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


