

# PortfolioPayoutModifyDataPayout

Payout of the portfolio.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the payout. | 
**type** | [**TypeEnum**](#TypeEnum) | Payout type.  |  [optional]
**notation** | [**PortfolioPayoutModifyDataPayoutNotation**](PortfolioPayoutModifyDataPayoutNotation.md) |  |  [optional]
**time** | **String** | Date and time of the payout. |  [optional]
**amount** | **BigDecimal** | Amount of the payout in the portfolio&#39;s base currency. |  [optional]
**transaction** | [**PortfolioPayoutModifyDataPayoutTransaction**](PortfolioPayoutModifyDataPayoutTransaction.md) |  |  [optional]



## Enum: TypeEnum

Name | Value
---- | -----
DIVIDEND | &quot;dividend&quot;
PAYOUT | &quot;payout&quot;
COUPON | &quot;coupon&quot;
SUBSCRIPTIONRIGHT | &quot;subscriptionRight&quot;
OTHER | &quot;other&quot;


## Implemented Interfaces

* Serializable


