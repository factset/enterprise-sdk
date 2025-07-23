# ViewsObject

Elements of views object.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The name of the view. | [optional] 
**tickers** | [**[CreateOrEditViewTickers]**](CreateOrEditViewTickers.md) | An array of ticker symbols associated with the view. | [optional] 
**is_primary** | **bool** | If true, stories that match the provided ticker on which the ticker is a primary symbol will be returned. Additionally, stories that match the other filters specified such as topics or regions will also be returned.              | [optional] 
**categories** | **[str]** |  | [optional] 
**topics** | **[str]** |  | [optional] 
**regions** | **[str]** |  | [optional] 
**sectors** | **[str]** |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


