# FactSet.SDK.FactSetSupplyChain.Model.SupplyChainItem
A single supply chain relationship record containing entity details, relationship type, centrality measures, subsidiary details, revenue percentages, relevance grades, and relationship keywords.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**EntityId** | **string** | Unique FactSet-generated identifier representing the related entity. Six alpha-numeric characters with a -E suffix (XXXXXX-E). | [optional] 
**EntityName** | **string** | The proper name of the related entity. | [optional] 
**RelationshipType** | **string** | Code denoting the type of relationship. For supply chain endpoints, values are CUSTOMER or SUPPLIER. | [optional] 
**Direction** | **string** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**RevenuePct** | **double?** | Percentage of revenue that the source company derived from this relationship in the reporting period. This field is only applicable to relationships reported as Customer and only then for those cases where the reporting company provides a percentage. | [optional] 
**RelevanceGrade** | **int?** | Integer value between 1 and 10,000 indicating the relevance factors&#39; grade for this relationship. A higher grade indicates a more significant supply chain relationship. | [optional] 
**SupplierSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of supplier subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**CustomerSubsidiaries** | [**List&lt;Subsidiary&gt;**](Subsidiary.md) | List of customer subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**Centrality** | [**SupplyChainItemAllOfCentrality**](SupplyChainItemAllOfCentrality.md) |  | [optional] 
**RelationshipKeywords** | **List&lt;List&lt;string&gt;&gt;** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

