

# PostBasicMarketListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 5 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | name | | -name | | shortName | | -shortName | | country.name | | -country.name | | type.name | | -type.name | | group.name | | -group.name |   |  [optional]
**pagination** | [**PostBasicMarketListRequestMetaPagination**](PostBasicMarketListRequestMetaPagination.md) |  |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
NAME | &quot;name&quot;
_NAME | &quot;-name&quot;
SHORTNAME | &quot;shortName&quot;
_SHORTNAME | &quot;-shortName&quot;
COUNTRY_NAME | &quot;country.name&quot;
_COUNTRY_NAME | &quot;-country.name&quot;
TYPE_NAME | &quot;type.name&quot;
_TYPE_NAME | &quot;-type.name&quot;
GROUP_NAME | &quot;group.name&quot;
_GROUP_NAME | &quot;-group.name&quot;


## Implemented Interfaces

* Serializable


