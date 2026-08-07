# RelationshipsItemAllOf


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**relationship_type** | [**RelationshipTypeEnum**](RelationshipTypeEnum.md) |  | [optional] 
**direction** | **str, none_type** | Indicates whether the relationship is direct, reverse, or mutual. A direct relationship is disclosed by the source company, while a reverse relationship is disclosed by another company regarding the source company. A mutual relationship indicates that both companies have disclosed the relationship. | [optional] 
**request_id_subsidiaries** | [**[Subsidiary], none_type**](Subsidiary.md) | List of requesting entity subsidiaries involved in this relationship. | [optional] 
**target_subsidiaries** | [**[Subsidiary], none_type**](Subsidiary.md) | List of related entity subsidiaries involved in this relationship. | [optional] 
**overlapping_sector_count** | **int, none_type** | Number of sectors to which both the requesting entity and the related entity are mapped. A higher count indicates greater overlap in business operations. This field is applicable only for COMPETITOR relationships and will be omitted for PARTNER relationships. | [optional] 
**relationship_keywords** | **[[str]], none_type** | Related keywords associated with the relationship to assist in discovering additional related data. Each inner array represents a grouped set of related keywords. | [optional] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


