

# FundDetail


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**requestId** | **String** | Unique FactSet identifier for the fund used in request |  [optional]
**factsetGpEntityId** | **String** | FactSet identifier for the general partner managing the fund |  [optional]
**entityProfile** | **String** | Descriptive profile of the fund entity |  [optional]
**fundStatus** | **String** | Current fund status |  [optional]
**dates** | [**FundDetailDates**](FundDetailDates.md) |  |  [optional]
**financialInfo** | [**FundDetailFinancialInfo**](FundDetailFinancialInfo.md) |  |  [optional]
**investmentCriteria** | [**FundDetailInvestmentCriteria**](FundDetailInvestmentCriteria.md) |  |  [optional]
**terms** | [**FundDetailTerms**](FundDetailTerms.md) |  |  [optional]
**features** | [**FundDetailFeatures**](FundDetailFeatures.md) |  |  [optional]
**strategyType** | [**StrategyTypeEnum**](#StrategyTypeEnum) | Indicate the fund strategy type. |  [optional]
**fundOfFundAllocation** | [**FundDetailFundOfFundAllocation**](FundDetailFundOfFundAllocation.md) |  |  [optional]
**error** | [**ErrorObjectResponse**](ErrorObjectResponse.md) |  |  [optional]



## Enum: StrategyTypeEnum

Name | Value
---- | -----
INFRASTRUCTURE_PROJ_FIN | &quot;Infrastructure/Proj Fin&quot;
FUND_OF_FUNDS | &quot;Fund of Funds&quot;
BUYOUT | &quot;Buyout&quot;
MBO | &quot;MBO&quot;
SECONDARY | &quot;Secondary&quot;
REAL_ESTATE | &quot;Real Estate&quot;
MEZZANINE | &quot;Mezzanine&quot;
LBO | &quot;LBO&quot;
DEBT | &quot;Debt&quot;
SEED_STAGE | &quot;Seed Stage&quot;
EARLY_STAGE | &quot;Early Stage&quot;
LATER_STAGE | &quot;Later Stage&quot;


## Implemented Interfaces

* Serializable


