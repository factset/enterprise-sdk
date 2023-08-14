# paengine.UnlinkedPATemplate

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Template id. | [optional] 
**directory** | **String** | Template directory. | [optional] 
**templateTypeId** | **String** | Template type id | [optional] 
**snapshot** | **Boolean** | snapshot. | [optional] 
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **String** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **String** | PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. | [optional] 
**content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 
**description** | **String** | Template description. | [optional] 
**name** | **String** | Template name. | [optional] 
**category** | **String** | Unlinked template category | [optional] 


