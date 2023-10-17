

# PostBasicMicOperatingListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
ISOCODE | &quot;isoCode&quot;
_ISOCODE | &quot;-isoCode&quot;
NAME | &quot;name&quot;
_NAME | &quot;-name&quot;


## Implemented Interfaces

* Serializable


