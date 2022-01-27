

# StockDividendListMeta

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
DATES_ANNOUNCEMENT | &quot;dates.announcement&quot;
_DATES_ANNOUNCEMENT | &quot;-dates.announcement&quot;
DATES_RECORD | &quot;dates.record&quot;
_DATES_RECORD | &quot;-dates.record&quot;
DATES_EFFECTIVE | &quot;dates.effective&quot;
_DATES_EFFECTIVE | &quot;-dates.effective&quot;
DATES_PAYMENT | &quot;dates.payment&quot;
_DATES_PAYMENT | &quot;-dates.payment&quot;


## Implemented Interfaces

* Serializable


