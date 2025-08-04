# factsetnews.CreateOrEditViewBodyData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The name of the view. | [optional] 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) |  | [optional] 
**isPrimary** | **Boolean** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**categories** | **[String]** |  | [optional] 
**countries** | **[String]** |  | [optional] 
**regions** | **[String]** |  | [optional] 
**sources** | **[String]** |  | [optional] 
**topics** | **[String]** | An array of topics associated with the view. | [optional] 
**quickAlert** | **Boolean** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 


