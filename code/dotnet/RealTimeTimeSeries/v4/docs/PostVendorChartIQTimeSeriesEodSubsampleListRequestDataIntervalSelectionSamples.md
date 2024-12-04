# FactSet.SDK.RealTimeTimeSeries.Model.PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples
Subsample granularity and number of samples suitable for end-of-day data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**End** | **DateTime** | Date of the end point of the subsamples (exclusive). &#x60;end&#x60; is limited to the day after the current day. | 
**Number** | **decimal** | Number of subsamples returned. The product of &#x60;number&#x60; and &#x60;granularity&#x60; must not extend further into the past than 1900-01-01. | 
**Granularity** | **string** | Subsample granularities suitable for end-of-day data. | Value | Description | | - -- | - -- | | 1d | Each subsample interval encompasses 1 day. | | 1w | Each subsample interval encompasses 1 week. | | 1m | Each subsample interval encompasses 1 month. | | 3m | Each subsample interval encompasses 3 month. | | 6m | Each subsample interval encompasses 6 month. | | 1y | Each subsample interval encompasses 1 year. |   | [optional] [default to GranularityEnum._1w]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

