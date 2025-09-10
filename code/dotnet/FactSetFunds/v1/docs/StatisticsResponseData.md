# FactSet.SDK.FactSetFunds.Model.StatisticsResponseData
Aggregate statistics for a given field within the specified content sets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Minimum** | **decimal** | The minimum value of the field. | [optional] 
**Maximum** | **decimal** | The maximum value of the field. | [optional] 
**Average** | **decimal** | The average value of the field. | [optional] 
**Sum** | **decimal** | The sum of the field values. | [optional] 
**Count** | **long** | The number of records. | [optional] 
**Median** | **decimal** | The median value of the field. | [optional] 
**StdDev** | **decimal** | The standard deviation of the field values. | [optional] 
**Histogram** | [**List&lt;HistogramData&gt;**](HistogramData.md) | The histogram of the field values. The histogram is an array of 10 bins, each bin containing the minimum, maximum, and count of records in that bin. The bins are equally spaced between the minimum and maximum values of the field. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

