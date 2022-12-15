

# PostStockDividendListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
DIVIDENDS_DATES_ANNOUNCEMENT | &quot;dividends.dates.announcement&quot;
_DIVIDENDS_DATES_ANNOUNCEMENT | &quot;-dividends.dates.announcement&quot;
DIVIDENDS_DATES_RECORD | &quot;dividends.dates.record&quot;
_DIVIDENDS_DATES_RECORD | &quot;-dividends.dates.record&quot;
DIVIDENDS_DATES_EFFECTIVE | &quot;dividends.dates.effective&quot;
_DIVIDENDS_DATES_EFFECTIVE | &quot;-dividends.dates.effective&quot;
DIVIDENDS_DATES_PAYMENT | &quot;dividends.dates.payment&quot;
_DIVIDENDS_DATES_PAYMENT | &quot;-dividends.dates.payment&quot;


## Implemented Interfaces

* Serializable


