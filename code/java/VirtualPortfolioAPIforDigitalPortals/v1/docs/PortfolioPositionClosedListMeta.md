

# PortfolioPositionClosedListMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 8 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**PortfolioPositionClosedListMetaPagination**](PortfolioPositionClosedListMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
POSITIONS_INSTRUMENT_NAME | &quot;positions.instrument.name&quot;
_POSITIONS_INSTRUMENT_NAME | &quot;-positions.instrument.name&quot;
POSITIONS_INSTRUMENT_SHORTNAME | &quot;positions.instrument.shortName&quot;
_POSITIONS_INSTRUMENT_SHORTNAME | &quot;-positions.instrument.shortName&quot;
POSITIONS_INSTRUMENT_ASSETCLASS_CODE | &quot;positions.instrument.assetClass.code&quot;
_POSITIONS_INSTRUMENT_ASSETCLASS_CODE | &quot;-positions.instrument.assetClass.code&quot;
POSITIONS_INSTRUMENT_TYPE_NAME | &quot;positions.instrument.type.name&quot;
_POSITIONS_INSTRUMENT_TYPE_NAME | &quot;-positions.instrument.type.name&quot;
POSITIONS_TRANSACTION_BUY_VALUE | &quot;positions.transaction.buy.value&quot;
_POSITIONS_TRANSACTION_BUY_VALUE | &quot;-positions.transaction.buy.value&quot;
POSITIONS_TRANSACTION_SELL_VALUE | &quot;positions.transaction.sell.value&quot;
_POSITIONS_TRANSACTION_SELL_VALUE | &quot;-positions.transaction.sell.value&quot;
POSITIONS_SHARES | &quot;positions.shares&quot;
_POSITIONS_SHARES | &quot;-positions.shares&quot;
POSITIONS_PAYOUT_AMOUNT | &quot;positions.payout.amount&quot;
_POSITIONS_PAYOUT_AMOUNT | &quot;-positions.payout.amount&quot;


## Implemented Interfaces

* Serializable


