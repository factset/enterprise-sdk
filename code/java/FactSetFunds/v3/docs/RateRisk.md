

# RateRisk

Interest rate risk analytics including effective duration and weighted average life (WAL) with breakdown

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fsymId** | **String** | FactSet Security Identifier. Six alpha-numeric characters, excluding vowels, with a -S suffix (XXXXXX-S), resolved from the &#x60;requestId&#x60; of the Fund requested. |  [optional]
**requestId** | **String** | The requested Id sent as input. |  [optional]
**error** | [**FundsErrorObject**](FundsErrorObject.md) |  |  [optional]
**riskType** | **RateRiskType** |  | 
**weightedAverageLifeBreakdown** | [**java.util.List&lt;WAL&gt;**](WAL.md) | The Weighted Average Life(WAL)  Breakdown for the fund. |  [optional]


## Implemented Interfaces

* Serializable


