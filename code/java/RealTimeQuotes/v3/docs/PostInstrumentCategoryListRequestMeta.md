

# PostInstrumentCategoryListRequestMeta

The meta member contains the meta information of the request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**attributes** | **java.util.Set&lt;String&gt;** | Limit the attributes returned in the response to the specified set. |  [optional]
**language** | **String** | ISO 639-1 code of the language. |  [optional]
**sort** | [**java.util.Set&lt;SortEnum&gt;**](#java.util.Set&lt;SortEnum&gt;) | Sortable attributes. The sort order is ascending unless it is prefixed with a minus sign, in which case it is descending. A list of at most 2 (possibly prefixed) attribute name(s) is allowed. |  [optional]



## Enum: java.util.Set&lt;SortEnum&gt;

Name | Value
---- | -----
DATASETS_DATASET_ID | &quot;datasets.dataset.id&quot;
_DATASETS_DATASET_ID | &quot;-datasets.dataset.id&quot;
DATASETS_DATASET_NAME | &quot;datasets.dataset.name&quot;
_DATASETS_DATASET_NAME | &quot;-datasets.dataset.name&quot;


## Implemented Interfaces

* Serializable


