

# FundSummary


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**factsetFundEntityId** | **String** | Unique FactSet identifier for the fund |  [optional]
**fundName** | **String** | Fund name |  [optional]
**fundStatus** | [**FundStatusEnum**](#FundStatusEnum) | Current fund status |  [optional]
**amountRaisedUsd** | **BigDecimal** | Amount raised in USD |  [optional]



## Enum: FundStatusEnum

Name | Value
---- | -----
RAISING | &quot;Raising&quot;
DIVESTING | &quot;Divesting&quot;
INVESTING | &quot;Investing&quot;
LIQUIDATED | &quot;Liquidated&quot;


## Implemented Interfaces

* Serializable


