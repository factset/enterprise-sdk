# procuretopayapiscim.Error

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**schemas** | **[String]** | An array containing the standard schema URI used for identifying an error. See RFC 7644 section 3.12. | [optional] 
**scimType** | **String** |  | [optional] 
**detail** | **String** | A detailed human-readable message. | [optional] 
**status** | **String** | HTTP status code. | [optional] 



## Enum: [SchemasEnum]


* `urn:ietf:params:scim:api:messages:2.0:Error` (value: `"urn:ietf:params:scim:api:messages:2.0:Error"`)





## Enum: ScimTypeEnum


* `invalidFilter` (value: `"invalidFilter"`)

* `tooMany` (value: `"tooMany"`)

* `uniqueness` (value: `"uniqueness"`)

* `mutability` (value: `"mutability"`)

* `invalidSyntax` (value: `"invalidSyntax"`)

* `invalidPath` (value: `"invalidPath"`)

* `noTarget` (value: `"noTarget"`)

* `invalidValue` (value: `"invalidValue"`)

* `invalidVers` (value: `"invalidVers"`)

* `sensitive` (value: `"sensitive"`)





## Enum: StatusEnum


* `307` (value: `"307"`)

* `308` (value: `"308"`)

* `400` (value: `"400"`)

* `401` (value: `"401"`)

* `403` (value: `"403"`)

* `404` (value: `"404"`)

* `409` (value: `"409"`)

* `412` (value: `"412"`)

* `413` (value: `"413"`)

* `500` (value: `"500"`)

* `501` (value: `"501"`)




