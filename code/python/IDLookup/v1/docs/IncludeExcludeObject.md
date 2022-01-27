# IncludeExcludeObject

Filters securities based on asset classes and other fields depending on the asset classes. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**field** | **str** | String containing the field name to filter on. Each asset class has its own set of field (i.e. “equity_type”, “is_primary”, “region”,etc)  | [optional] 
**entity** | **str** | String containing the asset class for the filter to be applied on. If not included or left empty, it will apply the filter against all asset classes  | [optional] 
**values** | **[{str: (bool, date, datetime, dict, float, int, list, str, none_type)}]** | Values you wish to filter on, as a comma-separated list. The values within this list are tied by an OR operation.  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


