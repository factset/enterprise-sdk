

# PortfolioPayoutCreateData

The data member contains the request's primary data.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of the portfolio. | 
**type** | [**TypeEnum**](#TypeEnum) | Payout type.  | 
**notation** | [**PortfolioPayoutCreateDataNotation**](PortfolioPayoutCreateDataNotation.md) |  | 
**time** | **String** | Date and time of the payout. | 
**amount** | **BigDecimal** | Amount of the payout in the portfolio&#39;s base currency. | 
**transaction** | [**PortfolioPayoutCreateDataTransaction**](PortfolioPayoutCreateDataTransaction.md) |  |  [optional]



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


