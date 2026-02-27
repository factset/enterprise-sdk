

# ExPostPortfolio


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique id of the entity |  [optional]
**details** | [**PortfolioEntityDetails**](PortfolioEntityDetails.md) |  |  [optional]
**initialValue** | **BigDecimal** | the initial value (PV) of the portfolio |  [optional]
**rebalancing** | [**Rebalancing**](Rebalancing.md) |  |  [optional]
**holdings** | [**java.util.List&lt;ExPostPortfolioInvestment&gt;**](ExPostPortfolioInvestment.md) |  | 
**transactionRules** | [**java.util.List&lt;TransactionRule&gt;**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods |  [optional]


## Implemented Interfaces

* Serializable


