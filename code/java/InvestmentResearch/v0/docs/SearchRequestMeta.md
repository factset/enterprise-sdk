

# SearchRequestMeta

meta object

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**SearchRequestMetaPagination**](SearchRequestMetaPagination.md) |  |  [optional]
**sort** | [**java.util.List&lt;SortEnum&gt;**](#java.util.List&lt;SortEnum&gt;) | Sorting the results in chronological (oldest to newest) or reverse chronological (newest to oldest) order.    *  &#x60;-storyDateTime&#x60; - sorting results in reverse chronological (descending) order. This is the default value if     the sort parameter isn&#39;t used in the query.       *  &#x60; storyDateTime&#x60; - sorting results in chronological (ascending) order. If a start date is not specified, the    API has a 10-year searching limitation.        type: array  |  [optional]



## Enum: java.util.List&lt;SortEnum&gt;

Name | Value
---- | -----
STORYDATETIME | &quot;storyDateTime&quot;
_STORYDATETIME | &quot;-storyDateTime&quot;


## Implemented Interfaces

* Serializable


