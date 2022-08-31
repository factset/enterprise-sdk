# virtualportfolioapifordigitalportals.PortfolioPayoutCreateData

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the portfolio. | 
**type** | **String** | Payout type.  | 
**notation** | [**PortfolioPayoutCreateDataNotation**](PortfolioPayoutCreateDataNotation.md) |  | 
**time** | **String** | Date and time of the payout. | 
**amount** | **Number** | Amount of the payout in the portfolio&#39;s base currency. | 
**transaction** | [**PortfolioPayoutCreateDataTransaction**](PortfolioPayoutCreateDataTransaction.md) |  | [optional] 



## Enum: TypeEnum


* `dividend` (value: `"dividend"`)

* `payout` (value: `"payout"`)

* `coupon` (value: `"coupon"`)

* `subscriptionRight` (value: `"subscriptionRight"`)

* `other` (value: `"other"`)




