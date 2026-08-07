# FactSet.SDK.FactSetSupplyChain.Model.RelationshipsItem
Unified relationship object representing either a competitor or partner. Certain fields are conditionally present based on `relationshipType`. 

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** | Unique FactSet-generated identifier representing the related entity. Six alpha-numeric characters with a -E suffix (XXXXXX-E). | [optional] 
**EntityName** | **string** | The proper name of the related entity. | [optional] 
**RelationshipType** | **RelationshipTypeEnum** |  | [optional] 
**Direction** | **string** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**RequestIdSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of requesting entity subsidiaries involved in this relationship. | [optional] 
**TargetSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of related entity subsidiaries involved in this relationship. | [optional] 
**OverlappingSectorCount** | **int?** | Number of sectors to which both the requesting entity and the related entity are mapped. A higher count indicates greater overlap in business operations. This field is applicable only for COMPETITOR relationships and will be omitted for PARTNER relationships. | [optional] 
**RelationshipKeywords** | **List&lt;List&lt;string&gt;&gt;** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

