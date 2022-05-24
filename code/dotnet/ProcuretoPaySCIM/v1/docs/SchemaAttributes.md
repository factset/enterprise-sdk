# FactSet.SDK.ProcuretoPaySCIM.Model.SchemaAttributes

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Name** | **string** | The attribute&#39;s name. | [readonly] 
**Type** | **string** | The attribute&#39;s data type. Valid values include &#39;string&#39;, &#39;complex&#39;, &#39;boolean&#39;, &#39;decimal&#39;, &#39;integer&#39;, &#39;dateTime&#39;, &#39;reference&#39;. | [readonly] 
**MultiValued** | **bool** | A Boolean value indicating an attribute&#39;s plurality. | [readonly] 
**Description** | **string** | A human-readable description of the attribute. | [optional] [readonly] 
**Required** | **bool** | A boolean value indicating whether or not the attribute is required. | [optional] [readonly] 
**CanonicalValues** | **List&lt;string&gt;** | A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;. | [optional] [readonly] 
**CaseExact** | **bool** | A Boolean value indicating whether or not a string attribute is case sensitive. | [optional] [readonly] 
**Mutability** | **string** | Indicates whether or not an attribute is modifiable. | [optional] [readonly] 
**Returned** | **string** | Indicates when an attribute is returned in a response (e.g., to a query). | [optional] [readonly] 
**Uniqueness** | **string** | Indicates how unique a value must be. | [optional] [readonly] 
**ReferenceTypes** | **List&lt;string&gt;** | Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;. | [optional] [readonly] 
**SubAttributes** | [**List&lt;SchemaSubAttributes&gt;**](SchemaSubAttributes.md) | Used to define the sub-attributes of a complex attribute. | [optional] [readonly] 

[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)

