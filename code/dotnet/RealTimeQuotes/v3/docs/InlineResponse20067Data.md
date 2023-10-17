# FactSet.SDK.RealTimeQuotes.Model.InlineResponse20067Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | Identifier of an instrument. | [optional] 
**Name** | [**InlineResponse20067Name**](InlineResponse20067Name.md) |  | [optional] 
**Isin** | **string** | International Securities Identification Number of the instrument. | [optional] 
**Nsin** | [**InlineResponse20067Nsin**](InlineResponse20067Nsin.md) |  | [optional] 
**Fsym** | [**InlineResponse20036Fsym**](InlineResponse20036Fsym.md) |  | [optional] 
**AssetClass** | [**InlineResponse20067AssetClass**](InlineResponse20067AssetClass.md) |  | [optional] 
**Category** | [**List&lt;InlineResponse20067Category&gt;**](InlineResponse20067Category.md) | Set of categories assigned to the instrument. The set of returned categories is limited to the values provided in the request parameter &#x60;category.restrict.ids.&#x60; Empty, if &#x60;category.restrict.ids&#x60; has not been used. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

