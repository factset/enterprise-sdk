# PAComponentData


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accounts** | [**[PAIdentifier]**](PAIdentifier.md) | List of accounts. | [optional] 
**benchmarks** | [**[PAIdentifier]**](PAIdentifier.md) | List of benchmarks. | [optional] 
**groups** | [**[PACalculationGroup]**](PACalculationGroup.md) | List of groupings for the PA calculation. This will take precedence over the groupings saved in the PA document. | [optional] 
**columns** | [**[PACalculationColumn]**](PACalculationColumn.md) | List of columns for the PA calculation. This will take precedence over the columns saved in the PA document. | [optional] 
**dates** | [**PADateParameters**](PADateParameters.md) |  | [optional] 
**datasources** | [**PACalculationDataSources**](PACalculationDataSources.md) |  | [optional] 
**currencyisocode** | **str** | Currency ISO code for calculation. | [optional] 
**componentdetail** | **str** | PA Storage type. It can be GROUPS or TOTALS or SECURITIES. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


