# FactSet.SDK.TimeSeriesAPIforDigitalPortals.Model.InlineResponse2007Data
Subsampled time series data for the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Range** | [**InlineResponse200DataRange**](InlineResponse200DataRange.md) |  | [optional] 
**Quality** | **string** | Quality of the price. | [optional] 
**Subsamples** | [**List&lt;InlineResponse2007DataSubsamples&gt;**](InlineResponse2007DataSubsamples.md) | List of summary records. For the attributes first, last, low, high, see attribute &#x60;valueUnit&#x60; in endpoint &#x60;/prices/get&#x60; for their unit, except for price type yield, where the &#x60;valueUnit&#x60; is always &#x60;percent&#x60; (id&#x3D;258). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

