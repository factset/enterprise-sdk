# FactSet.SDK.PAEngine.Model.PAComponentData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Accounts** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts. | [optional] 
**Benchmarks** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks. | [optional] 
**Groups** | [**List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document. | [optional] 
**Columns** | [**List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation. This will take precedence over the columns saved in the PA document. | [optional] 
**Dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**Datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**Currencyisocode** | **string** | Currency ISO code for calculation. | [optional] 
**Componentdetail** | **string** | PA Storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

