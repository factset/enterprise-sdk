# RiskAnalyticsResponse

Response containing credit risk or rate risk analytics data based on `riskType` parameter

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**[RiskAnalyticsItem]**](RiskAnalyticsItem.md) | Array of objects - type depends on &#x60;riskType&#x60; parameter: * CREDIT_RISK: Array of CreditRisk objects (option adjusted spread, OAS breakdown) * RATE_RISK: Array of RateRisk objects (effective duration, weighted average life) | [optional] 
**meta** | [**SearchMeta**](SearchMeta.md) |  | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


