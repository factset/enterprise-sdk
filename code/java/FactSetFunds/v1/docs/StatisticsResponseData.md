

# StatisticsResponseData

Aggregate statistics for a given field within the specified content sets.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**minimum** | **BigDecimal** | The minimum value of the field. |  [optional]
**maximum** | **BigDecimal** | The maximum value of the field. |  [optional]
**average** | **BigDecimal** | The average value of the field. |  [optional]
**sum** | **BigDecimal** | The sum of the field values. |  [optional]
**count** | **Long** | The number of records. |  [optional]
**median** | **BigDecimal** | The median value of the field. |  [optional]
**stdDev** | **BigDecimal** | The standard deviation of the field values. |  [optional]
**histogram** | [**java.util.List&lt;HistogramData&gt;**](HistogramData.md) | The histogram of the field values. The histogram is an array of 10 bins, each bin containing the minimum, maximum, and count of records in that bin. The bins are equally spaced between the minimum and maximum values of the field. |  [optional]


## Implemented Interfaces

* Serializable


