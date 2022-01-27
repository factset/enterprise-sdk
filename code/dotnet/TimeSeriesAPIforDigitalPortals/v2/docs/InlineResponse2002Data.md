# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.InlineResponse2002Data
Subsampled time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | [optional] 
**Subsamples** | **List&lt;List&lt;decimal&gt;&gt;** | List of summary records as an array of arrays. One record is represented as an array and consists of a timestamp, four price values, and the trading volume. For the unit of the price values, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60;, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). The order is as follows: timestamp of the start of the subsample (seconds since epoch in UTC); first price of the subsample; highest price of the subsample; lowest price of the subsample; last price of the subsample; accumulated number of units (e.g. shares) traded of the subsample. If the requested type of the price is ask, bid, or yield, the accumulated number of units is empty. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

