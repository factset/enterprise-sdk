

# RiskAnalyticsResponse

Response containing credit risk or rate risk analytics data based on `riskType` parameter

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**data** | [**java.util.List&lt;RiskAnalyticsItem&gt;**](RiskAnalyticsItem.md) | Array of objects - type depends on &#x60;riskType&#x60; parameter: * CREDIT_RISK: Array of CreditRisk objects (option adjusted spread, OAS breakdown) * RATE_RISK: Array of RateRisk objects (effective duration, weighted average life) |  [optional]
**meta** | [**SearchMeta**](SearchMeta.md) |  |  [optional]


## Implemented Interfaces

* Serializable


