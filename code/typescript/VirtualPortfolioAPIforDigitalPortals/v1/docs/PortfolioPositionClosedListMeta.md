# virtualportfolioapifordigitalportals.PortfolioPositionClosedListMeta

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **[String]** | Limit the attributes returned in the response to the specified set. | [optional] 
**language** | **String** | ISO 639-1 code of the language. | [optional] 
**sort** | **[String]** | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 8 (possibly prefixed) attribute name(s) is allowed. | [optional] 
**pagination** | [**PortfolioPositionClosedListMetaPagination**](PortfolioPositionClosedListMetaPagination.md) |  | [optional] 



## Enum: [SortEnum]


* `positions.instrument.name` (value: `"positions.instrument.name"`)

* `-positions.instrument.name` (value: `"-positions.instrument.name"`)

* `positions.instrument.shortName` (value: `"positions.instrument.shortName"`)

* `-positions.instrument.shortName` (value: `"-positions.instrument.shortName"`)

* `positions.instrument.assetClass.code` (value: `"positions.instrument.assetClass.code"`)

* `-positions.instrument.assetClass.code` (value: `"-positions.instrument.assetClass.code"`)

* `positions.instrument.type.name` (value: `"positions.instrument.type.name"`)

* `-positions.instrument.type.name` (value: `"-positions.instrument.type.name"`)

* `positions.transaction.buy.value` (value: `"positions.transaction.buy.value"`)

* `-positions.transaction.buy.value` (value: `"-positions.transaction.buy.value"`)

* `positions.transaction.sell.value` (value: `"positions.transaction.sell.value"`)

* `-positions.transaction.sell.value` (value: `"-positions.transaction.sell.value"`)

* `positions.shares` (value: `"positions.shares"`)

* `-positions.shares` (value: `"-positions.shares"`)

* `positions.payout.amount` (value: `"positions.payout.amount"`)

* `-positions.payout.amount` (value: `"-positions.payout.amount"`)




