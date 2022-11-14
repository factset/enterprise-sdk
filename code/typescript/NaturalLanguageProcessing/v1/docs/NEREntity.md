# naturallanguageprocessing.NEREntity

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**associatedOrgs** | [**[NEROrganization]**](NEROrganization.md) | Organizations that are associated with this entity | [optional] 
**endChar** | **Number** | The index of the last character of the entity text | 
**entityId** | **String** | The FactSet Entity ID that is linked to this text. | [optional] 
**lookupText** | **String** | Name of the FactSet entity that is linked to this text. | [optional] 
**lookupUrl** | **String** | A link to the information page for the given entity | [optional] 
**startChar** | **Number** | The index of the starting character of the entity text | 
**text** | **String** | The substring of the source text that ws found as an entity | 
**type** | **String** | The type of entity (organization, person, etc.) that was found | 



## Enum: TypeEnum


* `GPE` (value: `"NE_GPE"`)

* `ORG` (value: `"NE_ORG"`)

* `PERSON` (value: `"NE_PERSON"`)

* `NUMBER` (value: `"NE_NUMBER"`)

* `MONEY` (value: `"NE_MONEY"`)

* `DATETIME` (value: `"NE_DATETIME"`)

* `DRUG` (value: `"NE_DRUG"`)

* `HEALTH_INDICATION` (value: `"NE_HEALTH_INDICATION"`)




