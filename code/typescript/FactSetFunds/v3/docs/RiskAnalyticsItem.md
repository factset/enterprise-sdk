# factsetfunds.RiskAnalyticsItem

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. | [optional] 
**requestId** | **String** | The requested Id sent as input. | [optional] 
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  | [optional] 
**riskType** | [**RateRiskType**](RateRiskType.md) |  | 
**optionAdjustedSpreadBreakdown** | [**[OAS]**](OAS.md) | The Option Adjusted Spread Breakdown for the fund. | [optional] 
**weightedAverageLifeBreakdown** | [**[WAL]**](WAL.md) | The Weighted Average Life(WAL)  Breakdown for the fund. | [optional] 


