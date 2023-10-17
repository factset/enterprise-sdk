# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20097Data
The data member contains a list of the matching instruments

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of the instrument. | [optional] 
**Name** | **string** | Asset class-unspecific name in English. | [optional] 
**Isin** | **string** | The International Securities Identification Number (ISIN) of the instrument. The ISIN is a 12-character code of digits and upper-case letters that uniquely identifies an instrument. | [optional] 
**Nsin** | [**InlineResponse20042DataNsin**](InlineResponse20042DataNsin.md) |  | [optional] 
**Fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**AssetClass** | **string** | Name of the asset class of the instrument. Possible values are listed in the enumeration in the parameter description. | [optional] 
**Type** | [**List&lt;InlineResponse20038DataCategories&gt;**](InlineResponse20038DataCategories.md) | Instrument type as defined by FactSet Digital Solutions. Instrument categories are arranged in a hierarchy, with level 1 representing the most coarse granularity and further levels successively refining the granularity (see MDG category system 18). | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

