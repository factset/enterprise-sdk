

# VectorDataResult

Returns vector information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vector** | **java.util.List&lt;String&gt;** | Chuncked emedding vector. |  [optional]
**vectorId** | **String** | Unique vector identifier associated with the document. |  [optional]
**similarityScore** | **BigDecimal** | Score indicating the similarity. |  [optional]
**storyDate** | **LocalDate** | Date associated with the story. |  [optional]
**themes** | **String** | Theme of the document. |  [optional]
**documentType** | **String** | Type of the document. |  [optional]
**source** | **String** | Name of the source |  [optional]
**documentID** | **String** | Unique identifier for a document. |  [optional]
**property** | **String** | The name of the schema. |  [optional]
**type** | **String** | The type of the schema. |  [optional]
**ids** | **java.util.List&lt;String&gt;** | List of related IDs. |  [optional]
**trimmed** | **Boolean** | Trimmed attribute indicates whether the vectors are trimmed or not.  - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  |  [optional]
**sentiment** | **String** | Sentiment is the measure of expressed attitude or opinion of the document, such as \&quot;Negative\&quot; or \&quot;Very Positive\&quot;. The &#x60;/meta/themes&#x60; endpoint gives list of all available sentiment values. |  [optional]


## Implemented Interfaces

* Serializable


