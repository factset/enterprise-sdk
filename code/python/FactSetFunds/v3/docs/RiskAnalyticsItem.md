# RiskAnalyticsItem

Response item that can be one of: CreditRisk or RateRisk. The actual schema depends on the `riskType` parameter. 

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**risk_type** | [**RateRiskType**](RateRiskType.md) |  | 
**fsym_id** | **str, none_type** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**request_id** | **str** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**option_adjusted_spread_breakdown** | [**[OAS]**](OAS.md) | The Option Adjusted Spread Breakdown for the fund. | [optional] 
**weighted_average_life_breakdown** | [**[WAL]**](WAL.md) | The Weighted Average Life(WAL)  Breakdown for the fund. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


