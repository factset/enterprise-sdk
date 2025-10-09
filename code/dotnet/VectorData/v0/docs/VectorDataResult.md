# FactSet.SDK.VectorData.Model.VectorDataResult
Returns vector information.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Vector** | **List&lt;string&gt;** | Chuncked emedding vector. | [optional] 
**VectorId** | **string** | Unique identifier for a document | [optional] 
**SimilarityScore** | **decimal** | Score indicating the similarity. | [optional] 
**StoryDate** | **DateTime** | Date associated with the story. | [optional] 
**Themes** | **string** | Theme of the document. | [optional] 
**DocumentType** | **string** | Type of the document. | [optional] 
**Source** | **string** | Name of the source | [optional] 
**DocumentID** | **string** | Unique identifier for a document. | [optional] 
**Property** | **string** | The name of the schema. | [optional] 
**Type** | **string** | The type of the schema. | [optional] 
**Ids** | **List&lt;string&gt;** | List of related IDs. | [optional] 
**Trimmed** | **bool** | Trimmed attribute indicates whether the vectors are trimmed or not.  - If **true**, the vectors has been trimmed.   - If **false**, the vectors are been returned.  | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

