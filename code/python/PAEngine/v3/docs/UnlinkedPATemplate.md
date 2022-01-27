# UnlinkedPATemplate


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **str** | Template id. | [optional] 
**directory** | **str** | Template directory. | [optional] 
**template_type_id** | **str** | Template type id | [optional] 
**snapshot** | **bool** | snapshot. | [optional] 
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**currencyisocode** | **str** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **str** | PA storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 
**description** | **str** | Template description. | [optional] 
**name** | **str** | Template name. | [optional] 
**category** | **str** | Unlinked template category | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


