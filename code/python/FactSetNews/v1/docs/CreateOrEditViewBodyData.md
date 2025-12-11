# CreateOrEditViewBodyData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the view. | 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) |  | [optional] 
**is_primary** | **bool** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.   | [optional] 
**categories** | **[str]** |  | [optional] 
**countries** | **[str]** |  | [optional] 
**regions** | **[str]** |  | [optional] 
**sources** | **[str]** |  | [optional] 
**topics** | **[str]** | An array of topics associated with the view. | [optional] 
**quick_alert** | **bool** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 
**search_text** | **str** | Restricts the view to include only document stories that include the searched text. It supports boolean operators that we have in this [OA page](https://my.apps.factset.com/oa/pages/12708) | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


