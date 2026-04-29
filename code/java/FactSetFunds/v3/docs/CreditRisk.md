

# CreditRisk

Credit risk analytics including option-adjusted spread (OAS) and its breakdown distribution

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**riskType** | **CreditRiskType** |  | 
**optionAdjustedSpreadBreakdown** | [**java.util.List&lt;OAS&gt;**](OAS.md) | The Option Adjusted Spread Breakdown for the fund. |  [optional]


## Implemented Interfaces

* Serializable


