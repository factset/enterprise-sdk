

# PostPricesTimeSeriesEodSubsampleListRequestDataIntervalSelectionSamples

Subsample granularity and number of samples suitable for end-of-day data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**end** | **LocalDate** | Date of the end point of the subsamples (exclusive). &#x60;end&#x60; is limited to the day after the current day. | 
**number** | **BigDecimal** | Number of subsamples returned. The product of &#x60;number&#x60; and &#x60;granularity&#x60; must not extend further into the past than 1900-01-01. | 
**granularity** | [**GranularityEnum**](#GranularityEnum) | Subsample granularities suitable for end-of-day data. | Value | Description | | --- | --- | | 1d | Each subsample interval encompasses 1 day. | | 1w | Each subsample interval encompasses 1 week. | | 1m | Each subsample interval encompasses 1 month. | | 3m | Each subsample interval encompasses 3 month. | | 6m | Each subsample interval encompasses 6 month. | | 1y | Each subsample interval encompasses 1 year. |   |  [optional]



## Enum: GranularityEnum

Name | Value
---- | -----
_1D | &quot;1d&quot;
_1W | &quot;1w&quot;
_1M | &quot;1m&quot;
_3M | &quot;3m&quot;
_6M | &quot;6m&quot;
_1Y | &quot;1y&quot;


## Implemented Interfaces

* Serializable


