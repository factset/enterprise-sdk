

# InlineResponse2007Data


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of payout. |  [optional]
**instrument** | [**InlineResponse2007Instrument**](InlineResponse2007Instrument.md) |  |  [optional]
**notation** | [**InlineResponse2007Notation**](InlineResponse2007Notation.md) |  |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | Type of payout. |  [optional]
**time** | **String** | Date and time of the payout. |  [optional]
**amount** | **BigDecimal** | Amount of the payout in the portfolio&#39;s base currency. |  [optional]
**transaction** | [**InlineResponse2007Transaction**](InlineResponse2007Transaction.md) |  |  [optional]



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


