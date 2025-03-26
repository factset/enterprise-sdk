# procuretopayapiscim.SchemaAttribute

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**name** | **String** | The attribute&#39;s name. | [readonly] 
**type** | **String** | The attribute&#39;s data type. | [readonly] 
**multiValued** | **Boolean** | A Boolean value indicating an attribute&#39;s plurality. | [readonly] 
**description** | **String** | A human-readable description of the attribute. | [optional] [readonly] 
**required** | **Boolean** | A boolean value indicating whether or not the attribute is required. | [optional] [readonly] 
**canonicalValues** | **[String]** | A collection of canonical values.  When applicable, service providers MUST specify the canonical types, e.g.,  &#39;work&#39;, &#39;home&#39;. | [optional] [readonly] 
**caseExact** | **Boolean** | A Boolean value indicating whether or not a string attribute is case sensitive. | [optional] [readonly] 
**mutability** | **String** | Indicates whether or not an attribute is modifiable. | [optional] [readonly] 
**returned** | **String** | Indicates when an attribute is returned in a response (e.g., to a query). | [optional] [readonly] 
**uniqueness** | **String** | Indicates how unique a value must be. | [optional] [readonly] 
**referenceTypes** | **[String]** | Used only with an attribute of type &#39;reference&#39;.  Specifies a SCIM resourceType that a reference attribute MAY refer to, e.g., &#39;User&#39;. | [optional] [readonly] 
**subAttributes** | [**[SchemaSubAttribute]**](SchemaSubAttribute.md) | Used to define the sub-attributes of a complex attribute. | [optional] [readonly] 



## Enum: TypeEnum


* `string` (value: `"string"`)

* `boolean` (value: `"boolean"`)

* `decimal` (value: `"decimal"`)

* `integer` (value: `"integer"`)

* `dateTime` (value: `"dateTime"`)

* `binary` (value: `"binary"`)

* `reference` (value: `"reference"`)

* `complex` (value: `"complex"`)





## Enum: MutabilityEnum


* `readOnly` (value: `"readOnly"`)

* `readWrite` (value: `"readWrite"`)

* `immutable` (value: `"immutable"`)

* `writeOnly` (value: `"writeOnly"`)





## Enum: ReturnedEnum


* `always` (value: `"always"`)

* `never` (value: `"never"`)

* `default` (value: `"default"`)

* `request` (value: `"request"`)





## Enum: UniquenessEnum


* `none` (value: `"none"`)

* `server` (value: `"server"`)

* `global` (value: `"global"`)




