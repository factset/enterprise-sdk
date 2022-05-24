# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.InlineResponse2005Data
Time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | [optional] 
**Prices** | [**List&lt;InlineResponse2005DataPrices&gt;**](InlineResponse2005DataPrices.md) | Time series of prices. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

