# virtualportfolioapifordigitalportals.InlineResponse2007Data

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Identifier of payout. | [optional] 
**instrument** | [**InlineResponse2007Instrument**](InlineResponse2007Instrument.md) |  | [optional] 
**notation** | [**InlineResponse2007Notation**](InlineResponse2007Notation.md) |  | [optional] 
**type** | **String** | Type of payout. | [optional] 
**time** | **String** | Date and time of the payout. | [optional] 
**amount** | **Number** | Amount of the payout in the portfolio&#39;s base currency. | [optional] 
**transaction** | [**InlineResponse2007Transaction**](InlineResponse2007Transaction.md) |  | [optional] 



## Enum: TypeEnum


* `dividend` (value: `"dividend"`)

* `payout` (value: `"payout"`)

* `coupon` (value: `"coupon"`)

* `subscriptionRight` (value: `"subscriptionRight"`)

* `other` (value: `"other"`)




