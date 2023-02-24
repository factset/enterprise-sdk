# UnlinkedPATemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str, none_type** | Template id. | [optional] 
**directory** | **str, none_type** | Template directory. | [optional] 
**template_type_id** | **str, none_type** | Template type id | [optional] 
**snapshot** | **bool** | snapshot. | [optional] 
**accounts** | [**[PAIdentifier], none_type**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier], none_type**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn], none_type**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup], none_type**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **str, none_type** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **str, none_type** | PA storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 
**description** | **str, none_type** | Template description. | [optional] 
**name** | **str, none_type** | Template name. | [optional] 
**category** | **str, none_type** | Unlinked template category | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


