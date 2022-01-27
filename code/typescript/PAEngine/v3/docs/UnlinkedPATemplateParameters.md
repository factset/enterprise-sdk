# paengine.UnlinkedPATemplateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**directory** | **String** | The directory to create an unlinked PA template | 
**templateTypeId** | **String** | Template type id | 
**description** | **String** | Template description | [optional] 
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**currencyisocode** | **String** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **String** | PA storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 


