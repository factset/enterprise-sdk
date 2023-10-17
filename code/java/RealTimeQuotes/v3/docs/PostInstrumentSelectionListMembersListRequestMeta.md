

# PostInstrumentSelectionListMembersListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 4 (possibly prefixed) attribute name(s) is allowed. |  [optional]
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
NAME_DEFAULT_LONG | &quot;name.default.long&quot;
_NAME_DEFAULT_LONG | &quot;-name.default.long&quot;
NAME_DEFAULT_SHORT | &quot;name.default.short&quot;
_NAME_DEFAULT_SHORT | &quot;-name.default.short&quot;
NAME_ASSETCLASSSPECIFIC_LONG | &quot;name.assetClassSpecific.long&quot;
_NAME_ASSETCLASSSPECIFIC_LONG | &quot;-name.assetClassSpecific.long&quot;
NAME_ASSETCLASSSPECIFIC_SHORT | &quot;name.assetClassSpecific.short&quot;
_NAME_ASSETCLASSSPECIFIC_SHORT | &quot;-name.assetClassSpecific.short&quot;


## Implemented Interfaces

* Serializable


