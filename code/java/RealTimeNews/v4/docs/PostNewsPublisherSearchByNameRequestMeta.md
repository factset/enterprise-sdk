

# PostNewsPublisherSearchByNameRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 1 (possibly prefixed) attribute name(s) is allowed. | Value | | --- | | id | | -id | | name | | -name |   |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
ID | &quot;id&quot;
_ID | &quot;-id&quot;
NAME | &quot;name&quot;
_NAME | &quot;-name&quot;


## Implemented Interfaces

* Serializable


