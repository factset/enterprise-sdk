# FactSet.SDK.ProposalGenerationEngine.Model.ExPostPortfolio

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Id** | **string** | unique id of the entity | [optional] 
**Details** | [**PortfolioEntityDetails**](PortfolioEntityDetails.md) |  | [optional] 
**InitialValue** | **decimal** | the initial value (PV) of the portfolio | [optional] 
**Rebalancing** | [**Rebalancing**](Rebalancing.md) |  | [optional] 
**Holdings** | [**List&lt;ExPostPortfolioInvestment&gt;**](ExPostPortfolioInvestment.md) |  | 
**TransactionRules** | [**List&lt;TransactionRule&gt;**](TransactionRule.md) | rules for adding/substracting amount from the portfolio at given periods | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

