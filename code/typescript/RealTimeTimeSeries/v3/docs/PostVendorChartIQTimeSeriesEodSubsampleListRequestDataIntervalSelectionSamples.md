# realtimetimeseries.PostVendorChartIQTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **Date** | Date of the end point of the subsamples (exclusive). &#x60;end&#x60; is limited to the day after the current day. | 
**number** | **Number** | Number of subsamples returned. The product of &#x60;number&#x60; and &#x60;granularity&#x60; must not extend further into the past than 1900-01-01. | 
**granularity** | **String** | Subsample granularities suitable for end-of-day data. | [optional] [default to &#39;1w&#39;]



## Enum: GranularityEnum


* `1d` (value: `"1d"`)

* `1w` (value: `"1w"`)

* `1m` (value: `"1m"`)

* `3m` (value: `"3m"`)

* `6m` (value: `"6m"`)

* `1y` (value: `"1y"`)




