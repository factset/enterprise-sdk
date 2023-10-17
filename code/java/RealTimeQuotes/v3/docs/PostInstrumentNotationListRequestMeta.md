

# PostInstrumentNotationListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
NOTATIONS_MARKET_ID | &quot;notations.market.id&quot;
_NOTATIONS_MARKET_ID | &quot;-notations.market.id&quot;
NOTATIONS_MARKET_NAME | &quot;notations.market.name&quot;
_NOTATIONS_MARKET_NAME | &quot;-notations.market.name&quot;
NOTATIONS_VALUEUNIT_ID | &quot;notations.valueUnit.id&quot;
_NOTATIONS_VALUEUNIT_ID | &quot;-notations.valueUnit.id&quot;
NOTATIONS_VALUEUNIT_NAME | &quot;notations.valueUnit.name&quot;
_NOTATIONS_VALUEUNIT_NAME | &quot;-notations.valueUnit.name&quot;
NOTATIONS_TRADINGVOLUME_MONTH1_AVERAGE | &quot;notations.tradingVolume.month1.average&quot;
_NOTATIONS_TRADINGVOLUME_MONTH1_AVERAGE | &quot;-notations.tradingVolume.month1.average&quot;


## Implemented Interfaces

* Serializable


