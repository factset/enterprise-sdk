# factsetnews.ViewsObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | Name of the view. | [optional] 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) |  | [optional] 
**isPrimary** | **Boolean** | If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned. | [optional] 
**categories** | **[String]** |  | [optional] 
**topics** | **[String]** |  | [optional] 
**sources** | **[String]** |  | [optional] 
**regions** | **[String]** |  | [optional] 
**countries** | **[String]** |  | [optional] 
**quickAlert** | **Boolean** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 


