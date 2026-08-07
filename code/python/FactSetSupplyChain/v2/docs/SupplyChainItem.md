# SupplyChainItem

A single supply chain relationship record containing entity details, relationship type, centrality measures, subsidiary details, revenue percentages, relevance grades, and relationship keywords.

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**entity_id** | **str** | Unique FactSet-generated identifier representing the related entity. Six alpha-numeric characters with a -E suffix (XXXXXX-E). | [optional] 
**entity_name** | **str** | The proper name of the related entity. | [optional] 
**relationship_type** | **str** | Code denoting the type of relationship. For supply chain endpoints, values are CUSTOMER or SUPPLIER. | [optional] 
**direction** | **str, none_type** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**revenue_pct** | **float, none_type** | Percentage of revenue that the source company derived from this relationship in the reporting period. This field is only applicable to relationships reported as Customer and only then for those cases where the reporting company provides a percentage. | [optional] 
**relevance_grade** | **int, none_type** | Integer value between 1 and 10,000 indicating the relevance factors&#39; grade for this relationship. A higher grade indicates a more significant supply chain relationship. | [optional] 
**supplier_subsidiaries** | [**[Subsidiary], none_type**](Subsidiary.md) | List of supplier subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**customer_subsidiaries** | [**[Subsidiary], none_type**](Subsidiary.md) | List of customer subsidiaries involved in this relationship. Only present when a subsidiary is disclosed as the specific entity involved in a relationship. | [optional] 
**centrality** | [**SupplyChainItemAllOfCentrality**](SupplyChainItemAllOfCentrality.md) |  | [optional] 
**relationship_keywords** | **[[str]], none_type** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


