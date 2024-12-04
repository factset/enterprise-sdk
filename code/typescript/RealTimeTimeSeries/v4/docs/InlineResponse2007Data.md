# realtimetimeseries.InlineResponse2007Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. | | EOD | End-of-day: prices updated once per day after the close of trading, possibly with an exchange-imposed delay of several hours or days. |   | [optional] 
**subsamples** | [**[PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems]**](PostPricesTimeSeriesEodSubsampleListDataSubsamplesItems.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 



## Enum: QualityEnum


* `DLY` (value: `"DLY"`)

* `EOD` (value: `"EOD"`)




