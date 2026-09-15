

# SearchRequestMeta

Metadata for controlling result pagination and sorting behavior.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pagination** | [**SearchRequestMetaPagination**](SearchRequestMetaPagination.md) |  |  [optional]
**sort** | [**java.util.List&lt;SortEnum&gt;**](#java.util.List&lt;SortEnum&gt;) | Sorting the results by &#x60;similarityScore&#x60; where this field is a part of response.   *  &#x60; similarityScore&#x60; - sorting results based on similarityScore.  |  [optional]



## Enum: java.util.List&lt;SortEnum&gt;

Name | Value
---- | -----
SIMILARITYSCORE | &quot;similarityScore&quot;


## Implemented Interfaces

* Serializable


