# UnlinkedPATemplateParameters


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**directory** | **str** | The directory to create an unlinked PA template | 
**template_type_id** | **str** | Template type id | 
**description** | **str** | Template description | [optional] 
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **str** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **str** | PA storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


