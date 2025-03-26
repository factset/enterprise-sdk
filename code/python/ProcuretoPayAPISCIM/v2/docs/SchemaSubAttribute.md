# SchemaSubAttribute


## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **str** | The attribute&#39;s name. | [readonly] 
**type** | **str** | The attribute&#39;s data type. | [readonly] 
**multi_valued** | **bool** | A Boolean value indicating an attribute&#39;s plurality. | [readonly] 
**description** | **str** | A human-readable description of the attribute. | [optional] [readonly] 
**required** | **bool** | A boolean value indicating whether or not the attribute is required. | [optional] [readonly] 
**canonical_values** | **[str]** | A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;. | [optional] [readonly] 
**case_exact** | **bool** | A Boolean value indicating whether or not a string attribute is case sensitive. | [optional] [readonly] 
**mutability** | **str** | Indicates whether or not an attribute is modifiable. | [optional] [readonly] 
**returned** | **str** | Indicates when an attribute is returned in a response (e.g., to a query). | [optional] [readonly] 
**uniqueness** | **str** | Indicates how unique a value must be. | [optional] [readonly] 
**reference_types** | **[str]** | Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;. | [optional] [readonly] 
**any string name** | **bool, date, datetime, dict, float, int, list, str, none_type** | any string name can be used but the value must be the correct type | [optional]

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


