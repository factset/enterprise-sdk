# ViewsObject


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | Name of the view. | [optional] 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) |  | [optional] 
**is_primary** | **bool** | If true, then only stories with the provided ticker as a primary symbol will be returned. When this parameter is false, the symbol is either primary OR a related symbol will be returned. | [optional] 
**categories** | **[str]** |  | [optional] 
**topics** | **[str]** |  | [optional] 
**sources** | **[str]** |  | [optional] 
**regions** | **[str]** |  | [optional] 
**countries** | **[str]** |  | [optional] 
**quick_alert** | **bool** | Indicates whether quick alerts are enabled for the view. A value of &#39;true&#39; means quick alerts are enabled, while &#39;false&#39; means they are not. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


