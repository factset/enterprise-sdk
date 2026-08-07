# FactSet.SDK.FactSetSupplyChain.Model.RelationshipsItemAllOf

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**RelationshipType** | **RelationshipTypeEnum** |  | [optional] 
**Direction** | **string** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**RequestIdSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of requesting entity subsidiaries involved in this relationship. | [optional] 
**TargetSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of related entity subsidiaries involved in this relationship. | [optional] 
**OverlappingSectorCount** | **int?** | Number of sectors to which both the requesting entity and the related entity are mapped. A higher count indicates greater overlap in business operations. This field is applicable only for COMPETITOR relationships and will be omitted for PARTNER relationships. | [optional] 
**RelationshipKeywords** | **List&lt;List&lt;string&gt;&gt;** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

