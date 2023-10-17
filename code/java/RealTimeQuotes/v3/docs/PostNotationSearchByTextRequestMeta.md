

# PostNotationSearchByTextRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 6 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
INSTRUMENT_NAME_DEFAULT_LONG | &quot;instrument.name.default.long&quot;
_INSTRUMENT_NAME_DEFAULT_LONG | &quot;-instrument.name.default.long&quot;
INSTRUMENT_NAME_DEFAULT_SHORT | &quot;instrument.name.default.short&quot;
_INSTRUMENT_NAME_DEFAULT_SHORT | &quot;-instrument.name.default.short&quot;
INSTRUMENT_NAME_ASSETCLASSSPECIFIC_LONG | &quot;instrument.name.assetClassSpecific.long&quot;
_INSTRUMENT_NAME_ASSETCLASSSPECIFIC_LONG | &quot;-instrument.name.assetClassSpecific.long&quot;
INSTRUMENT_NAME_ASSETCLASSSPECIFIC_SHORT | &quot;instrument.name.assetClassSpecific.short&quot;
_INSTRUMENT_NAME_ASSETCLASSSPECIFIC_SHORT | &quot;-instrument.name.assetClassSpecific.short&quot;
MATCH_SCORE | &quot;match.score&quot;
_MATCH_SCORE | &quot;-match.score&quot;
AVERAGEINDICATIVETRADINGVALUE30TD | &quot;averageIndicativeTradingValue30TD&quot;
_AVERAGEINDICATIVETRADINGVALUE30TD | &quot;-averageIndicativeTradingValue30TD&quot;


## Implemented Interfaces

* Serializable


