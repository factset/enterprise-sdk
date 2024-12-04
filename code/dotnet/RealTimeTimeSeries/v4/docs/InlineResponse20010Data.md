# FactSet.SDK.RealTimeTimeSeries.Model.InlineResponse20010Data
Subsampled time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**IdNotation** | **string** | MDG identifier of the listing. | [optional] 
**SourceIdentifier** | **string** | Identifier used in the request. | [optional] 
**Range** | [**InlineResponse20010DataRange**](InlineResponse20010DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | Value | Description | | - -- | - -- | | RLT | Real-time: intraday prices with minimal technical processing delays. | | DLY | Delayed: intraday prices with an exchange-imposed delay of usually 15 to 30 minutes. |   | [optional] 
**VolumeWeightedAveragePrice** | **decimal?** | The volume-weighted average price (VWAP) for the returned time series. See attribute currency in endpoint &#x60;/prices/get&#x60; for its unit. | [optional] 
**Subsamples** | [**List&lt;PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems&gt;**](PostPricesTimeSeriesIntradaySubsampleListDataSubsamplesItems.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

