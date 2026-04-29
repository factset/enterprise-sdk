# FactSet.SDK.FactSetFunds.Model.RiskAnalyticsResponse
Response containing credit risk or rate risk analytics data based on `riskType` parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Data** | [**List&lt;RiskAnalyticsItem&gt;**](RiskAnalyticsItem.md) | Array of objects - type depends on &#x60;riskType&#x60; parameter: * CREDIT_RISK: Array of CreditRisk objects (option adjusted spread, OAS breakdown) * RATE_RISK: Array of RateRisk objects (effective duration, weighted average life) | [optional] 
**Meta** | [**SearchMeta**](SearchMeta.md) |  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

