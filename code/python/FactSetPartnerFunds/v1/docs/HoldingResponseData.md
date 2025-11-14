# HoldingResponseData

Holdings data

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**request_id** | **str** | The input identifier. | [optional] 
**error** | [**InvalidIdErrorObject**](InvalidIdErrorObject.md) |  | [optional] 
**as_of_date** | **date, none_type** | Date when the holdings were reported. | [optional] 
**top10_weight** | **float, none_type** | Returns the total weight of the top 10 holdings as a percentage | [optional] 
**holdings** | [**[Holding]**](Holding.md) | List of holdings | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


