# FactSet.SDK.Formula.Model.TimeSeriesTimeseriesObject
The `result` attribute in the Time-Series Non-Flattened Response Object will be a TIMESERIES object. A TIMESERIES object has a values attribute and a dates attribute that contain arrays of equal length so that the values and dates can be align to form a time series.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Values** | [**List&lt;TimeSeriesScalarValue&gt;**](TimeSeriesScalarValue.md) | Representing the data returned from the requested FQL formula for the requestId | [optional] 
**Dates** | **List&lt;DateTime?&gt;** | Representing the dates corresponding the requested FQL formula for the requestId | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

