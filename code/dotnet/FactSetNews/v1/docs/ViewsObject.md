# FactSet.SDK.FactSetNews.Model.ViewsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | Name of the view. | [optional] 
**Tickers** | [**List&lt;CreateOrEditViewTickers&gt;**](CreateOrEditViewTickers.md) |  | [optional] 
**IsPrimary** | **bool** | If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned. | [optional] 
**Categories** | **List&lt;string&gt;** |  | [optional] 
**Topics** | **List&lt;string&gt;** |  | [optional] 
**Sources** | **List&lt;string&gt;** |  | [optional] 
**Regions** | **List&lt;string&gt;** |  | [optional] 
**Countries** | **List&lt;string&gt;** |  | [optional] 
**QuickAlert** | **bool** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

