# proposalgenerationengine.ExPostPortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | unique id of the entity | [optional] 
**details** | [**PortfolioEntityDetails**](PortfolioEntityDetails.md) |  | [optional] 
**initialValue** | **Number** | the initial value (PV) of the portfolio | [optional] 
**rebalancing** | [**Rebalancing**](Rebalancing.md) |  | [optional] 
**holdings** | [**[ExPostPortfolioInvestment]**](ExPostPortfolioInvestment.md) |  | 
**transactionRules** | [**[TransactionRule]**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 


