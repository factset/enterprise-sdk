

# SchemaAttribute


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The attribute&#39;s name. |  [readonly]
**type** | [**TypeEnum**](#TypeEnum) | The attribute&#39;s data type. |  [readonly]
**multiValued** | **Boolean** | A Boolean value indicating an attribute&#39;s plurality. |  [readonly]
**description** | **String** | A human-readable description of the attribute. |  [optional] [readonly]
**required** | **Boolean** | A boolean value indicating whether or not the attribute is required. |  [optional] [readonly]
**canonicalValues** | **java.util.List&lt;String&gt;** | A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;. |  [optional] [readonly]
**caseExact** | **Boolean** | A Boolean value indicating whether or not a string attribute is case sensitive. |  [optional] [readonly]
**mutability** | [**MutabilityEnum**](#MutabilityEnum) | Indicates whether or not an attribute is modifiable. |  [optional] [readonly]
**returned** | [**ReturnedEnum**](#ReturnedEnum) | Indicates when an attribute is returned in a response (e.g., to a query). |  [optional] [readonly]
**uniqueness** | [**UniquenessEnum**](#UniquenessEnum) | Indicates how unique a value must be. |  [optional] [readonly]
**referenceTypes** | **java.util.List&lt;String&gt;** | Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;. |  [optional] [readonly]
**subAttributes** | [**java.util.List&lt;SchemaSubAttribute&gt;**](SchemaSubAttribute.md) | Used to define the sub-attributes of a complex attribute. |  [optional] [readonly]



## Enum: TypeEnum

Name | Value
---- | -----
STRING | &quot;string&quot;
BOOLEAN | &quot;boolean&quot;
DECIMAL | &quot;decimal&quot;
INTEGER | &quot;integer&quot;
DATETIME | &quot;dateTime&quot;
BINARY | &quot;binary&quot;
REFERENCE | &quot;reference&quot;
COMPLEX | &quot;complex&quot;



## Enum: MutabilityEnum

Name | Value
---- | -----
READONLY | &quot;readOnly&quot;
READWRITE | &quot;readWrite&quot;
IMMUTABLE | &quot;immutable&quot;
WRITEONLY | &quot;writeOnly&quot;



## Enum: ReturnedEnum

Name | Value
---- | -----
ALWAYS | &quot;always&quot;
NEVER | &quot;never&quot;
DEFAULT | &quot;default&quot;
REQUEST | &quot;request&quot;



## Enum: UniquenessEnum

Name | Value
---- | -----
NONE | &quot;none&quot;
SERVER | &quot;server&quot;
GLOBAL | &quot;global&quot;


## Implemented Interfaces

* Serializable


