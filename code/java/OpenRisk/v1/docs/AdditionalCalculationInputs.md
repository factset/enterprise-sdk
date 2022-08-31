

# AdditionalCalculationInputs

Additional user-defined calculation input values. For example, some may be required for some Risk-Based Performance Attribution (RBPA) stats, such as 'ResidualFactorReturnsCSR' and 'DeannualizedActiveFactorRisk'.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**marketExcess** | [**AdditionalCalculationInputsMarketExcess**](AdditionalCalculationInputsMarketExcess.md) |  |  [optional]
**calculationPeriodsPerYear** | **Integer** | Deannualization factor for certain RBPA risk statistics which should match that of desired calculation frequency. Examples: If the risk model is monthly or monthly factor returns are being used, this should be 12. If the risk model is daily, select desired integer such as 365 or 252. |  [optional]


## Implemented Interfaces

* Serializable


