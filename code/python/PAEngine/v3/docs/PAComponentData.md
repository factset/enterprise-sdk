# PAComponentData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | [**[PAIdentifier], none_type**](PAIdentifier.md) | List of accounts. | [optional] 
**benchmarks** | [**[PAIdentifier], none_type**](PAIdentifier.md) | List of benchmarks. | [optional] 
**groups** | [**[PACalculationGroup], none_type**](PACalculationGroup.md) | List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document. | [optional] 
**columns** | [**[PACalculationColumn], none_type**](PACalculationColumn.md) | List of columns for the PA calculation. This will take precedence over the columns saved in the PA document. | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **str, none_type** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **str, none_type** | PA Storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


