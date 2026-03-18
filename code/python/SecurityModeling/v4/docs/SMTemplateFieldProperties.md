# SMTemplateFieldProperties


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**category** | **[str], none_type** | Indicates the expected data type (e.g., string, int, double, boolean, or arrays). This helps ensure you supply values in the correct format. | [optional] 
**mandatory** | **bool** | Shows whether the field is always required for successful modeling. If true, you must supply this field when creating or updating a security. | [optional] 
**when_field** | [**[WhenCondition], none_type**](WhenCondition.md) | Specifies conditional requirements—certain fields become mandatory only when other fields have specific values. | [optional] 
**description** | **str, none_type** | A clear and intuitive explanation of what the field represents, making it easier to interpret than raw JSON keys. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


