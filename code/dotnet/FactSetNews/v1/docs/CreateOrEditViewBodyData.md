# FactSet.SDK.FactSetNews.Model.CreateOrEditViewBodyData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The name of the view. | 
**Tickers** | [**List&lt;CreateOrEditViewTickers&gt;**](CreateOrEditViewTickers.md) |  | [optional] 
**IsPrimary** | **bool** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**Categories** | **List&lt;string&gt;** |  | [optional] 
**Countries** | **List&lt;string&gt;** |  | [optional] 
**Regions** | **List&lt;string&gt;** |  | [optional] 
**Sources** | **List&lt;string&gt;** |  | [optional] 
**Topics** | **List&lt;string&gt;** | An array of topics associated with the view. | [optional] 
**QuickAlert** | **bool** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 
**SearchText** | **string** | Restricts the view to include only document stories that include the searched text. It supports boolean operators that we have in this [OA page](https://my.apps.factset.com/oa/pages/12708) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

