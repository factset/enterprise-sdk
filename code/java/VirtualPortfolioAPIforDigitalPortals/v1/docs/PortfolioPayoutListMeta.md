

# PortfolioPayoutListMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 3 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**PortfolioPayoutListMetaPagination**](PortfolioPayoutListMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
TYPE | &quot;type&quot;
_TYPE | &quot;-type&quot;
TIME | &quot;time&quot;
_TIME | &quot;-time&quot;
AMOUNT | &quot;amount&quot;
_AMOUNT | &quot;-amount&quot;


## Implemented Interfaces

* Serializable


