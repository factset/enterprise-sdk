# FactSet.SDK.QuotesAPIforDigitalPortals.Model.InlineResponse20093Instrument
Instrument data of the notation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | **string** | Name of the instrument. | [optional] 
**Isin** | **string** | International Securities Identification Number of the instrument. | [optional] 
**Nsin** | [**InlineResponse20091InstrumentNsin**](InlineResponse20091InstrumentNsin.md) |  | [optional] 
**AssetClass** | **string** | Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description. | [optional] 
**Type** | [**List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

