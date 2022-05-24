

# NotationSearchByTextMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 3 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**BasicMarketListMetaPagination**](BasicMarketListMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
INSTRUMENT_NAME_DEFAULT_LONG | &quot;instrument.name.default.long&quot;
_INSTRUMENT_NAME_DEFAULT_LONG | &quot;-instrument.name.default.long&quot;
INSTRUMENT_NAME_DEFAULT_SHORT | &quot;instrument.name.default.short&quot;
_INSTRUMENT_NAME_DEFAULT_SHORT | &quot;-instrument.name.default.short&quot;
TRADINGVALUE_AVERAGE_DAYS30 | &quot;tradingValue.average.days30&quot;
_TRADINGVALUE_AVERAGE_DAYS30 | &quot;-tradingValue.average.days30&quot;


## Implemented Interfaces

* Serializable


