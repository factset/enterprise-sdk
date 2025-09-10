# DistinctCountRequestBody

Distinct count Request Body

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**content_set** | **str** | The content set from which the input field is taken. | 
**field_name** | **str** | The field name to be used in the filter criteria. For custom content sets, display name should be used as a field name. The inputField must be a member of the contentSet specified above. | 
**join_type** | [**JoinType**](JoinType.md) |  | [optional] 
**filters** | [**[Filter]**](Filter.md) | Filters to be applied to the request. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


