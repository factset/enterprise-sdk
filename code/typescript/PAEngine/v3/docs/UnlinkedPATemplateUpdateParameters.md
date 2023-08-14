# paengine.UnlinkedPATemplateUpdateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**description** | **String** | Template description | [optional] 
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **String** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **String** | PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 


