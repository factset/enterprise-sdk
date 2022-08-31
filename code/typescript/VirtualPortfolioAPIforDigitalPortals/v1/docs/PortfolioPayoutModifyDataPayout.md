# virtualportfolioapifordigitalportals.PortfolioPayoutModifyDataPayout

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the payout. | 
**type** | **String** | Payout type.  | [optional] 
**notation** | [**PortfolioPayoutModifyDataPayoutNotation**](PortfolioPayoutModifyDataPayoutNotation.md) |  | [optional] 
**time** | **String** | Date and time of the payout. | [optional] 
**amount** | **Number** | Amount of the payout in the portfolio&#39;s base currency. | [optional] 
**transaction** | [**PortfolioPayoutModifyDataPayoutTransaction**](PortfolioPayoutModifyDataPayoutTransaction.md) |  | [optional] 



## Enum: TypeEnum


* `dividend` (value: `"dividend"`)

* `payout` (value: `"payout"`)

* `coupon` (value: `"coupon"`)

* `subscriptionRight` (value: `"subscriptionRight"`)

* `other` (value: `"other"`)




