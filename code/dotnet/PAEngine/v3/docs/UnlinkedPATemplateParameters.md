# FactSet.SDK.PAEngine.Model.UnlinkedPATemplateParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Directory** | **string** | The directory to create an unlinked PA template | 
**TemplateTypeId** | **string** | Template type id | 
**Description** | **string** | Template description | [optional] 
**Accounts** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts | [optional] 
**Benchmarks** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks | [optional] 
**Columns** | [**List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation | [optional] 
**Dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**Groups** | [**List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation | [optional] 
**Datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**Currencyisocode** | **string** | Currency ISO code for calculation. | [optional] 
**Componentdetail** | **string** | PA storage type. It can be GROUPS or GROUPSALL or TOTALS or SECURITIES. | [optional] 
**Content** | [**TemplateContentTypes**](TemplateContentTypes.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

