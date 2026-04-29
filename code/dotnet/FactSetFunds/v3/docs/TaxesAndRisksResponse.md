# FactSet.SDK.FactSetFunds.Model.TaxesAndRisksResponse
Response containing regulatory/tax details, tax exposure, or risk measures data based on `taxItemsType` parameter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**List&lt;TaxesAndRisksItem&gt;**](TaxesAndRisksItem.md) | Array of objects - type depends on &#x60;taxItemsType&#x60; parameter: * REGULATION_TAX: Array of RegulationsTaxDetails objects (regulatory, tax compliance, dealing) * TAX_EXPOSURE: Array of TaxExposure objects (tax exposure and capital gains) * RISK_MEASURES: Array of RiskMeasures objects (alpha, beta, R-squared, etc.) | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

