# realtimetimeseries.InlineResponse20010Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**idNotation** | **String** | MDG identifier of the listing. | [optional] 
**sourceIdentifier** | **String** | Identifier used in the request. | [optional] 
**range** | [**InlineResponse20010DataRange**](InlineResponse20010DataRange.md) |  | [optional] 
**quality** | **String** | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**volumeWeightedAveragePrice** | **Number** | The volume-weighted average price (VWAP) for the returned time series. See attribute currency in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 
**subsamples** | [**[PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems]**](PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 



## Enum: QualityEnum


* `RLT` (value: `"RLT"`)

* `DLY` (value: `"DLY"`)




