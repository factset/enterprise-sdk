

# PostOptionClassScreenerSearchRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 7 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | symbol | | -symbol | | isin | | -isin | | name | | -name | | market.name | | -market.name | | underlying.name | | -underlying.name | | currency.code | | -currency.code | | category.name | | -category.name |   |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
SYMBOL | &quot;symbol&quot;
_SYMBOL | &quot;-symbol&quot;
ISIN | &quot;isin&quot;
_ISIN | &quot;-isin&quot;
NAME | &quot;name&quot;
_NAME | &quot;-name&quot;
MARKET_NAME | &quot;market.name&quot;
_MARKET_NAME | &quot;-market.name&quot;
UNDERLYING_NAME | &quot;underlying.name&quot;
_UNDERLYING_NAME | &quot;-underlying.name&quot;
CURRENCY_CODE | &quot;currency.code&quot;
_CURRENCY_CODE | &quot;-currency.code&quot;
CATEGORY_NAME | &quot;category.name&quot;
_CATEGORY_NAME | &quot;-category.name&quot;


## Implemented Interfaces

* Serializable


