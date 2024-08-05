# FactSet.SDK.Publisher.Model.PACalculationParameters

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Componentid** | **string** | The PA Engine component identifier to analyze. | 
**Accounts** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of accounts. | [optional] 
**Benchmarks** | [**List&lt;PAIdentifier&gt;**](PAIdentifier.md) | List of benchmarks. | [optional] 
**Dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**Groups** | [**List&lt;PACalculationGroup&gt;**](PACalculationGroup.md) | List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document. | [optional] 
**Currencyisocode** | **string** | Currency ISO code for calculation. | [optional] 
**Columns** | [**List&lt;PACalculationColumn&gt;**](PACalculationColumn.md) | List of columns for the PA calculation. This will take precedence over the columns saved in the PA document. | [optional] 
**Componentdetail** | **string** | Component detail type for the PA component. It can be GROUPS or TOTALS. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

