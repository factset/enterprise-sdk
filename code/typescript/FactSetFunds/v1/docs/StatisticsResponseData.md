# factsetfunds.StatisticsResponseData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **Number** | The minimum value of the field. | [optional] 
**maximum** | **Number** | The maximum value of the field. | [optional] 
**average** | **Number** | The average value of the field. | [optional] 
**sum** | **Number** | The sum of the field values. | [optional] 
**count** | **Number** | The number of records. | [optional] 
**median** | **Number** | The median value of the field. | [optional] 
**stdDev** | **Number** | The standard deviation of the field values. | [optional] 
**histogram** | [**[HistogramData]**](HistogramData.md) | The histogram of the field values. The histogram is an array of 10 bins, each bin containing the minimum, maximum, and count of records in that bin. The bins are equally spaced between the minimum and maximum values of the field. | [optional] 


