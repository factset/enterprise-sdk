# InlineResponse20010Data

Subsampled time series data for the notation.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id_notation** | **str, none_type** | MDG identifier of the listing. | [optional] 
**source_identifier** | **str, none_type** | Identifier used in the request. | [optional] 
**range** | [**InlineResponse20010DataRange**](InlineResponse20010DataRange.md) |  | [optional] 
**quality** | **str, none_type** | Quality of the price. | Value | Description | | --- | --- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**volume_weighted_average_price** | **float, none_type** | The volume-weighted average price (VWAP) for the returned time series. See attribute currency in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 
**subsamples** | [**[PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems]**](PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


