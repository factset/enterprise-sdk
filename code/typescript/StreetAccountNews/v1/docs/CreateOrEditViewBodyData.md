# streetaccountnews.CreateOrEditViewBodyData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the view. | [optional] 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) | An array of ticker objects associated with the view. | [optional] 
**isPrimary** | **Boolean** | If true, then only stories with the provided ticker as a primary symbol will be returned. Otherwise, all stories with the ticker as a primary symbol or related symbol will be returned.  | [optional] 
**categories** | **[String]** |  | [optional] 
**topics** | **[String]** |  | [optional] 
**regions** | **[String]** |  | [optional] 
**sectors** | **[String]** |  | [optional] 
**quickAlert** | **Boolean** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not.  | [optional] 


